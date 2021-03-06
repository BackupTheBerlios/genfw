/***************************************************************************
 * Copyright (c) 2006 Eike Stepper, Fuggerstr. 39, 10777 Berlin, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package com.sympedia.genfw.util;


import com.sympedia.genfw.ContentProvider;
import com.sympedia.genfw.Context;
import com.sympedia.genfw.GenApp;
import com.sympedia.genfw.Generator;
import com.sympedia.genfw.GenfwFactory;
import com.sympedia.genfw.Input;
import com.sympedia.genfw.Rule;
import com.sympedia.genfw.RuleSet;
import com.sympedia.genfw.internal.GenfwActivator;
import com.sympedia.util.eclipse.resources.ResourcesHelper;
import com.sympedia.util.emf.EcoreHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class GenfwHelper
{
  public static final int TRACE_NOTHING = 0;

  public static final int TRACE_GENAPP = 1;

  public static final int TRACE_INPUT = 2;

  public static final int TRACE_GENERATE = 3;

  public static final int TRACE_WRITE = 4;

  public static final int TRACE_INPUTOBJECT = 5;

  public static final int TRACE_RULE = 6;

  public static final int TRACE_LIFECYCLE = 7;

  public static final int TRACE_DEFAULT = TRACE_WRITE;

  public static Context processFile(IFile file, int traceLevel, IProgressMonitor monitor)
          throws Exception
  {
    String path = file.getFullPath().toString();
    return processFile(path, traceLevel, monitor);
  }

  public static Context processFile(String path, int traceLevel, IProgressMonitor monitor)
          throws Exception
  {
    checkCancelation(monitor);
    ResourceSetImpl rs = new ResourceSetImpl();
    rs.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
    Map map = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
    map.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

    URI uri = URI.createPlatformResourceURI(path);
    Resource resource = rs.getResource(uri, true);

    GenApp genApp = (GenApp)resource.getContents().get(0);
    return processGenApp(genApp, traceLevel, monitor);
  }

  public static Context processGenApp(GenApp genApp, int traceLevel, IProgressMonitor monitor)
          throws Exception
  {
    checkCancelation(monitor);
    EList inputs = genApp.getInputs();
    monitor.beginTask("", 3 * inputs.size());

    try
    {
      Context context = GenfwFactory.eINSTANCE.createContext(genApp);

      for (Iterator it = inputs.iterator(); it.hasNext();)
      {
        Input input = (Input)it.next();
        monitor.subTask("Initializing " + input.getFullPath());
        input.initialize(context);
        monitor.worked(1);
        checkCancelation(monitor);
      }

      for (Iterator it = inputs.iterator(); it.hasNext();)
      {
        Input input = (Input)it.next();
        monitor.subTask("Processing " + input.getFullPath());
        if (traceLevel >= TRACE_INPUT) System.out.println("Processing " + input.getFullPath());
        processInput(input, traceLevel, new SubProgressMonitor(monitor, 1));
        checkCancelation(monitor);
      }

      for (Iterator it = inputs.iterator(); it.hasNext();)
      {
        Input input = (Input)it.next();
        monitor.subTask("Disposing " + input.getFullPath());
        input.dispose();
        monitor.worked(1);
        checkCancelation(monitor);
      }

      return context;
    }
    finally
    {
      monitor.done();
    }
  }

  public static void processInput(Input input, int traceLevel, IProgressMonitor monitor)
          throws Exception
  {
    checkCancelation(monitor);
    String fullPath = input.getFullPath();
    if (fullPath != null && !fullPath.startsWith("/"))
    {
      fullPath = "/" + fullPath;

      String projectName = EcoreHelper.getProjectName(input.eResource().getURI());
      if (projectName != null)
      {
        fullPath = "/" + projectName + fullPath;
      }
    }

    List<Rule> rules = getAllRules(input);
    if (rules.isEmpty())
    {
      if (traceLevel >= TRACE_RULE) System.out.println("No active rules");
    }
    else
    {
      if (traceLevel >= TRACE_RULE)
      {
        System.out.println(String.valueOf(rules.size()) + " active rules");
        for (Rule rule : rules)
        {
          System.out.println(rule.getName());
        }
      }

      ContentProvider contentProvider = input.getContentProvider();
      List inputObjects = getAllInputObjects(fullPath, contentProvider);
      if (inputObjects.isEmpty())
      {
        if (traceLevel >= TRACE_INPUTOBJECT) System.out.println("No input objects");
      }
      else
      {
        if (traceLevel >= TRACE_INPUTOBJECT)
          System.out.println(String.valueOf(inputObjects.size()) + " input objects");
        processInputObjects(input, inputObjects, rules, traceLevel, monitor);
      }
    }

  }

  public static void processInputObjects(Input input, List inputObjects, List<Rule> rules,
          int traceLevel, IProgressMonitor monitor) throws CoreException
  {
    checkCancelation(monitor);
    monitor.beginTask("", inputObjects.size());

    try
    {
      for (Iterator it = inputObjects.iterator(); it.hasNext();)
      {
        Object inputObject = it.next();
        processInputObject(input, inputObject, rules, traceLevel,
                new SubProgressMonitor(monitor, 1));
        checkCancelation(monitor);
      }
    }
    finally
    {
      monitor.done();
    }
  }

  public static void processInputObject(Input input, Object inputObject, List<Rule> rules,
          int traceLevel, IProgressMonitor monitor) throws CoreException
  {
    checkCancelation(monitor);
    monitor.beginTask("", 3 * rules.size());
    String label = inputObject.toString();
    String className = inputObject.getClass().getName();
    if (label.startsWith(className + "@"))
    {
      int space = label.indexOf(' ');
      if (space != -1) label = label.substring(space + 1);
    }

    if (traceLevel >= TRACE_INPUTOBJECT) System.out.println(className + " " + label);

    try
    {
      for (Rule rule : rules)
      {
        if (traceLevel >= TRACE_RULE) System.out.println("Matching " + rule.getName());
        boolean matching = false;

        try
        {
          matching = rule.isMatching(inputObject);
          checkCancelation(monitor);
        }
        catch (Exception ex)
        {
          ex.printStackTrace();
          GenfwActivator.INSTANCE.log(ex);
        }

        monitor.worked(1);

        if (matching)
        {
          String targetPath = null;

          try
          {
            targetPath = rule.getTargetPath(inputObject);
            checkCancelation(monitor);
          }
          catch (Exception ex)
          {
            ex.printStackTrace();
            GenfwActivator.INSTANCE.log(ex);
          }

          monitor.worked(1);

          if (targetPath != null && !targetPath.startsWith("/"))
          {
            targetPath = "/" + targetPath;
            String projectName = EcoreHelper.getProjectName(input.eResource().getURI());
            if (projectName != null)
            {
              targetPath = "/" + projectName + targetPath;
            }
          }

          if (targetPath != null && rule.isDontOverwrite())
          {
            IResource resource = ResourcesHelper.ROOT.findMember(new Path(targetPath));
            if (resource != null && resource.exists()) continue;
          }

          monitor.subTask("Generating " + targetPath);
          if (traceLevel >= TRACE_GENERATE)
            System.out.println("GENERATING " + targetPath + "   [" + inputObject + "]");

          Generator generator = rule.getGenerator();
          byte[] result = null;

          try
          {
            inputObject = rule.convertInputObject(inputObject);

            SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 1);
            result = generator.generate(inputObject, targetPath, subMonitor);
            checkCancelation(monitor);
          }
          catch (Exception ex)
          {
            ex.printStackTrace();
            GenfwActivator.INSTANCE.log(ex);
          }

          if (result != null)
          {
            try
            {
              if (ResourcesHelper.ensureFile(targetPath, result, false, monitor))
              {
                if (traceLevel >= TRACE_WRITE) System.out.println("-> WRITTEN " + targetPath);
                checkCancelation(monitor);
              }
            }
            catch (Exception ex)
            {
              ex.printStackTrace();
              GenfwActivator.INSTANCE.log(ex);
            }
          }
        }
        else
        {
          monitor.worked(2);
        }
      }
    }
    finally
    {
      monitor.done();
    }
  }

  public static List<Rule> getAllRules(Input input)
  {
    List<Rule> result = new ArrayList<Rule>();
    EList ruleSets = input.getRuleSets();
    for (Iterator it = ruleSets.iterator(); it.hasNext();)
    {
      RuleSet ruleSet = (RuleSet)it.next();
      if (!ruleSet.isDeactivate())
      {
        collectRules(ruleSet, result);
      }
    }

    Collections.sort(result, new Comparator()
    {
      public int compare(Object o1, Object o2)
      {
        try
        {
          Rule r1 = (Rule)o1;
          Rule r2 = (Rule)o2;
          boolean r1r2 = r2.getPrerequisites().contains(r1);
          boolean r2r1 = r1.getPrerequisites().contains(r2);
          if (r1r2 != r2r1)
          {
            if (r1r2) return -1; // r1 < r2
            if (r2r1) return 1; // r2 < r1
          }
        }
        catch (Exception ignore)
        {
        }

        return 0; // r1 == r2
      }
    });

    return result;
  }

  public static List getAllInputObjects(String fullPath, ContentProvider contentProvider)
          throws Exception
  {
    List result = new ArrayList();
    List rootObjects = contentProvider.getRoots(fullPath);
    for (Iterator it = rootObjects.iterator(); it.hasNext();)
    {
      Object inputObject = it.next();
      collectInputObjects(inputObject, contentProvider, result);
    }

    return result;
  }

  private static void collectInputObjects(Object inputObject, ContentProvider contentProvider,
          List result) throws Exception
  {
    result.add(inputObject);
    List children = contentProvider.getChildren(inputObject);
    for (Iterator it = children.iterator(); it.hasNext();)
    {
      Object child = it.next();
      collectInputObjects(child, contentProvider, result);
    }
  }

  private static void collectRules(RuleSet ruleSet, List<Rule> result)
  {
    for (Iterator it = ruleSet.getRules().iterator(); it.hasNext();)
    {
      Rule rule = (Rule)it.next();
      if (!rule.isDeactivate())
      {
        result.add(rule);
      }
    }
  }

  //  private static void postProcessContext(Context context)
  //  {
  //    Set<IPath> paths = new HashSet<IPath>();
  //    for (Iterator it = context.getInputPaths().iterator(); it.hasNext();)
  //    {
  //      String str = (String)it.next();
  //      if (str != null) paths.add(new Path(str));
  //    }
  //
  //    for (Iterator it = context.getTargetPaths().iterator(); it.hasNext();)
  //    {
  //      String str = (String)it.next();
  //      if (str != null) paths.add(new Path(str));
  //    }
  //
  //    for (IPath path : paths)
  //    {
  //      System.out.println("XREF: " + path);
  //    }
  //  }

  private static void checkCancelation(IProgressMonitor monitor)
  {
    if (monitor.isCanceled()) throw new OperationCanceledException();
  }
}

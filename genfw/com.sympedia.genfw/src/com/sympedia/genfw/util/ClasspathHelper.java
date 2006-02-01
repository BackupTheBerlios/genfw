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


import com.sympedia.genfw.internal.GenfwActivator;
import com.sympedia.util.emf.EcoreHelper;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;


public class ClasspathHelper
{
  public static ClassLoader getClassLoader(Resource resource, ClassLoader parentClassLoader)
  {
    if (resource == null) return null;
    URI uri = resource.getURI();

    String projectName = EcoreHelper.getProjectName(uri);
    if (projectName != null)
    {
      ClassLoader result = getJavaProjectClassLoader(projectName, parentClassLoader);
      if (result != null)
      {
        return result;
      }
    }

    String bundleId = EcoreHelper.getBundleId(uri);
    if (bundleId != null)
    {
      ClassLoader result = getBundleClassLoader(bundleId);
      if (result != null)
      {
        return result;
      }
    }

    return null;
  }

  public static ClassLoader getJavaProjectClassLoader(String projectName,
          ClassLoader parentClassLoader)
  {
    IJavaProject javaProject = getJavaProject(projectName);
    if (javaProject == null || !javaProject.exists())
    {
      return null;
    }

    ClassLoader result = createJavaProjectClassLoader(javaProject, parentClassLoader);
    return result;
  }

  public static ClassLoader createJavaProjectClassLoader(IJavaProject javaProject,
          ClassLoader parentClassLoader)
  {
    List<URL> urls = new ArrayList<URL>();
    collectClasspathURLs(javaProject, urls);

    URL[] array = urls.toArray(new URL[urls.size()]);
    return new URLClassLoader(array, parentClassLoader)
    {
      //      @Override
      //      public Class<?> loadClass(String name) throws ClassNotFoundException
      //      {
      //        System.out.println("loadClass: " + name);
      //        Class<?> result = super.loadClass(name);
      //        System.out.println("-> Loaded: " + name + "  (" + result.getClassLoader() + ")");
      //        return result;
      //      }
      //
      //      @Override
      //      protected Class<?> findClass(String name) throws ClassNotFoundException
      //      {
      //        System.out.println("findClass: " + name);
      //        return super.findClass(name);
      //      }
    };
  }

  public static void collectClasspathURLs(IJavaProject javaProject, List<URL> urls)
  {
    try
    {
      collectClasspathUrlOutput(javaProject.getOutputLocation(), urls);

      IClasspathEntry[] resolvedClasspath = javaProject.getResolvedClasspath(true);
      for (IClasspathEntry entry : resolvedClasspath)
      {
        try
        {
          switch (entry.getEntryKind())
          {
          case IClasspathEntry.CPE_SOURCE:
            collectClasspathUrlOutput(entry.getOutputLocation(), urls);
            break;

          case IClasspathEntry.CPE_LIBRARY:
            File libFile = new File(entry.getPath().toString());
            URL url = libFile.toURL();
            if (!urls.contains(url))
            {
              //              System.out.println("LIB: " + url);
              urls.add(url);
            }
            break;

          case IClasspathEntry.CPE_PROJECT:
            String projectName = entry.getPath().segment(0);
            IJavaProject requiredProject = getJavaProject(projectName);
            collectClasspathURLs(requiredProject, urls);
            break;

          default:
            throw new RuntimeException();
          }
        }
        catch (MalformedURLException ex)
        {
          ex.printStackTrace();
        }
      }
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  public static void collectClasspathUrlOutput(IPath location, List<URL> urls)
          throws MalformedURLException
  {
    if (location != null)
    {
      location = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(location);
      File outputFolder = new File(location.toString() + "/");
      URL url = outputFolder.toURL();
      if (!urls.contains(url))
      {
        //        System.out.println("OUT: " + url);
        urls.add(url);
      }
    }
  }

  public static IJavaProject getJavaProject(String projectName)
  {
    try
    {
      IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
      IJavaModel javaModel = JavaCore.create(root);
      IJavaProject javaProjects[] = javaModel.getJavaProjects();
      for (int n = 0; n < javaProjects.length; n++)
      {
        IJavaProject javaProject = javaProjects[n];
        if (javaProject.getElementName().equals(projectName))
        {
          return javaProject;
        }
      }
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }

    return null;
  }

  public static ClassLoader getBundleClassLoader(String bundleId)
  {
    return GenfwActivator.getPlugin().getBundleClassLoaders().get(bundleId);
    //    IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
    //    IExtensionPoint extensionPoint = extensionRegistry
    //            .getExtensionPoint(GenfwActivator.EXTERNAL_LIBRARIES_EXTPOINT);
    //    if (extensionPoint == null)
    //    {
    //      throw new ImplementationError();
    //    }
    //
    //    IExtension[] extensions = extensionPoint.getExtensions();
    //    for (IExtension extension : extensions)
    //    {
    //      if (StringHelper.equals(extension.getNamespace(), bundleId))
    //      {
    //        IConfigurationElement[] configurationElements = extension.getConfigurationElements();
    //        for (IConfigurationElement element : configurationElements)
    //        {
    //          try
    //          {
    //            Object initializer = element.createExecutableExtension("libraryInitializer");
    //            if (initializer != null)
    //            {
    //              return initializer.getClass().getClassLoader();
    //            }
    //          }
    //          catch (CoreException ex)
    //          {
    //            GenfwActivator.INSTANCE.log(ex);
    //          }
    //        }
    //      }
    //    }
    //
    //    return null;
  }
}

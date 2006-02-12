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
package com.sympedia.genfw.internal;


import com.sympedia.genfw.Context;
import com.sympedia.genfw.util.GenfwHelper;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class GenfwBuilder extends IncrementalProjectBuilder
{
  public static final String BUILDER_ID = "com.sympedia.genfw.builder";

  private static final boolean DEBUG = true;

  protected GenfwNature nature;

  public GenfwBuilder()
  {
  }

  @Override
  protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException
  {
    if (getProject().exists())
    {
      try
      {
        ProjectBuildState buildState = nature.getBuildState();
        if (kind == FULL_BUILD || !buildState.exists())
        {
          return fullBuild(buildState, monitor);
        }
        else
        {
          return incrementalBuild(buildState, monitor);
        }
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }

    return null;
  }

  private IProject[] fullBuild(ProjectBuildState buildState, IProgressMonitor monitor)
  {
    if (DEBUG) System.out.println("Full build: " + getProject().getName());
    Set<IPath> genappPaths = getAllGenAppPaths();
    return doBuild(genappPaths, buildState, monitor);
  }

  private IProject[] incrementalBuild(final ProjectBuildState buildState, IProgressMonitor monitor)
          throws CoreException
  {
    if (DEBUG) System.out.println("Incremental build: " + getProject().getName());
    final Set<IPath> genappPaths = new HashSet<IPath>();
    Set<IProject> projects = buildState.getAllProjects();
    for (final IProject project : projects)
    {
      if (DEBUG) System.out.println("Syncing project: " + project.getName());
      IResourceDelta delta = getDelta(project);
      if (delta != null)
      {
        delta.accept(new IResourceDeltaVisitor()
        {
          public boolean visit(IResourceDelta delta) throws CoreException
          {
            IResource resource = delta.getResource();
            if (resource instanceof IFile)
            {
              IPath fullPath = resource.getFullPath();
              if (isLocalGenApp(fullPath))
              {
                genappPaths.add(fullPath);
              }
              else
              {
                addLocalGenApps(buildState.getGenAppsByInput(fullPath), genappPaths);
                if (delta.getKind() == IResourceDelta.REMOVED)
                {
                  addLocalGenApps(buildState.getGenAppsByTarget(fullPath), genappPaths);
                }
              }
            }

            return true;
          }

          private boolean isLocalGenApp(IPath fullPath)
          {
            return fullPath.lastSegment().endsWith(".genapp")
                    && fullPath.segment(0).equals(getProject().getName());
          }

          private void addLocalGenApps(Set<IPath> genapps, Set<IPath> result)
          {
            for (IPath genapp : genapps)
            {
              if (isLocalGenApp(genapp))
              {
                result.add(genapp);
              }
            }
          }
        });
      }
    }

    return doBuild(genappPaths, buildState, monitor);
  }

  private IProject[] doBuild(Set<IPath> genappPaths, ProjectBuildState buildState,
          IProgressMonitor monitor)
  {
    monitor.beginTask("", genappPaths.size());

    try
    {
      for (IPath genappPath : genappPaths)
      {
        GenAppBuildState genAppBuildState = buildState.getGenAppBuildState(genappPath);
        genAppBuildState.purge();

        IResource resource = ResourcesHelper.ROOT.findMember(genappPath);
        if (resource != null && resource.exists() && resource instanceof IFile)
        {
          try
          {
            Context context = GenfwHelper.processFile((IFile)resource, 4, new SubProgressMonitor(
                    monitor, 1));

            Set<String> inputPaths = context.getInputPaths();
            for (String inputPath : inputPaths)
            {
              genAppBuildState.addInputPath(new Path(inputPath));
            }

            Set<String> targetPaths = context.getTargetPaths();
            for (String targetPath : targetPaths)
            {
              genAppBuildState.addTargetPath(new Path(targetPath));
            }

            genAppBuildState.save();
          }
          catch (Exception ex)
          {
            ex.printStackTrace();
            GenfwActivator.INSTANCE.log(ex);
          }
        }
      }

      buildState.save();
      Set<IProject> result = buildState.getAllProjects();
      return result.toArray(new IProject[result.size()]);
    }
    finally
    {
      monitor.done();
    }
  }

  @Override
  protected void clean(IProgressMonitor monitor) throws CoreException
  {
    ProjectBuildState buildState = nature.getBuildState();
    buildState.purge();
  }

  @Override
  protected void startupOnInitialize()
  {
    super.startupOnInitialize();
    nature = GenfwNature.getRuntime(getProject());
  }

  protected Set<IPath> getAllGenAppPaths()
  {
    final Set<IPath> result = new HashSet<IPath>();

    try
    {
      getProject().accept(new IResourceVisitor()
      {
        public boolean visit(IResource resource) throws CoreException
        {
          if (resource != null && resource.exists() && resource instanceof IFile)
          {
            if ("genapp".equals(resource.getFileExtension()))
            {
              result.add(resource.getFullPath());
            }
          }

          return true;
        }
      });
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }

    return result;
  }
}

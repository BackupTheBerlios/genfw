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


import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;


public class GenfwNature implements IProjectNature
{
  public static final String NATURE_ID = "com.sympedia.genfw.nature";

  protected IProject genfwProject;

  protected ProjectBuildState buildState;

  protected String stateName;

  public GenfwNature()
  {
  }

  public static GenfwNature getRuntime(IProject project)
  {
    try
    {
      return (GenfwNature)project.getNature(NATURE_ID);
    }
    catch (CoreException ex)
    {
      return null;
    }
  }

  public void configure() throws CoreException
  {
    ResourcesHelper.addBuilderToProject(GenfwBuilder.BUILDER_ID, getProject(),
            new NullProgressMonitor());
  }

  public void deconfigure() throws CoreException
  {
    ResourcesHelper.removeBuilderFromProject(GenfwBuilder.BUILDER_ID, getProject(),
            new NullProgressMonitor());
  }

  public IProject getProject()
  {
    return genfwProject;
  }

  public void setProject(IProject project)
  {
    genfwProject = project;
    stateName = "state_" + genfwProject.getName();
  }

  public ProjectBuildState getBuildState()
  {
    if (buildState == null)
    {
      buildState = new ProjectBuildState(genfwProject);
      buildState.load();
    }

    return buildState;
  }

  //  public void resetBuildState()
  //  {
  //    IPath stateLocation = GenfwActivator.getPlugin().getStateLocation();
  //    File[] files = stateLocation.toFile().listFiles();
  //    for (File file : files)
  //    {
  //      if (file.getName().startsWith(stateName))
  //      {
  //        IOHelper.deleteFile(file);
  //      }
  //    }
  //  }
}

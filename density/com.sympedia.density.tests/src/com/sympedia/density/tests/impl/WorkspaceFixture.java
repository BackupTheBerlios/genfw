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
package com.sympedia.density.tests.impl;


import com.sympedia.density.tests.ITestSpec;
import com.sympedia.density.tests.IWorkspaceFixture;

import com.sympedia.util.IOHelper;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WorkspaceFixture extends BundleFixture implements IWorkspaceFixture
{
  private static final Logger logger = Logger.getLogger(WorkspaceFixture.class);

  private static final String PROJECT_DESCRIPTION = ".project";

  private Map<String, IProject> projects = new HashMap<String, IProject>();

  public WorkspaceFixture(ITestSpec testSpec)
  {
    super(testSpec);
  }

  @Override
  public void initialize() throws Exception
  {
    super.initialize();
  }

  @Override
  public void dispose() throws Exception
  {
    for (IProject project : projects.values())
    {
      try
      {
        logger.debug("Deleting project " + project.getName());
        project.delete(true, new NullProgressMonitor());
      }
      catch (CoreException ex)
      {
        ex.printStackTrace();
      }
    }

    super.dispose();
  }

  public IProject addProject(String name) throws CoreException
  {
    logger.debug("Adding project " + name);
    IProject project = ResourcesHelper.ensureProject(name);
    projects.put(name, project);
    return project;
  }

  public IProject addProject(String name, String natureId) throws CoreException
  {
    IProject project = addProject(name);
    logger.debug("Adding nature " + natureId + " to project " + name);
    ResourcesHelper.addNatureToProject(natureId, project, new NullProgressMonitor());
    return project;
  }

  public IProject addProject(String name, String[] natureIds) throws CoreException
  {
    IProject project = addProject(name);
    for (String natureId : natureIds)
    {
      logger.debug("Adding nature " + natureId + " to project " + name);
      ResourcesHelper.addNatureToProject(natureId, project, new NullProgressMonitor());
    }

    return project;
  }

  public IProject removeProject(String name)
  {
    IProject project = projects.remove(name);
    if (project != null)
    {
      try
      {
        logger.debug("Removing project " + name);
        project.delete(true, new NullProgressMonitor());
      }
      catch (CoreException ex)
      {
        ex.printStackTrace();
      }
    }

    return project;
  }

  public void addNature(String natureId, IProject project) throws CoreException
  {
    logger.debug("Adding nature " + natureId + " to project " + project.getName());
    ResourcesHelper.addNatureToProject(natureId, project, new NullProgressMonitor());
  }

  public void removeNature(String natureId, IProject project) throws CoreException
  {
    logger.debug("Removing nature " + natureId + " from project " + project.getName());
    ResourcesHelper.removeNatureFromProject(natureId, project, new NullProgressMonitor());
  }

  public IProject getProject(String name)
  {
    IProject project = projects.get(name);
    return project;
  }

  public IProject[] importWorkspace(IPath wsLocation) throws IOException, CoreException
  {
    List<String> projectNames = new ArrayList<String>();
    File wsFolder = new File(wsLocation.toString());
    File[] projectFolders = wsFolder.listFiles();
    if (projectFolders == null)
    {
      throw new RuntimeException("Folder does not exist: " + wsFolder.toString());
    }

    for (File projectFolder : projectFolders)
    {
      if (new File(projectFolder, PROJECT_DESCRIPTION).exists())
      {
        projectNames.add(projectFolder.getName());
      }
    }

    return importWorkspace(wsLocation, projectNames.toArray(new String[projectNames.size()]));
  }

  public IProject[] importWorkspace(IPath wsLocation, final String[] projectNames)
          throws IOException, CoreException
  {
    logger.debug("Importing workspace from " + wsLocation);
    File targetWS = ResourcesHelper.ROOT.getLocation().toFile();
    final IProject[] result = new IProject[projectNames.length];
    File wsFolder = new File(wsLocation.toString());
    for (String projectName : projectNames)
    {
      File projectFolder = new File(wsFolder, projectName);
      logger.debug("Copying project " + projectName);
      IOHelper.copyTree(projectFolder, new File(targetWS, projectName));
    }

    ResourcesHelper.WS.run(new IWorkspaceRunnable()
    {
      public void run(IProgressMonitor monitor) throws CoreException
      {
        for (int i = 0; i < projectNames.length; i++)
        {
          String projectName = projectNames[i];
          logger.debug("Adding project " + projectName);
          IProject project = ResourcesHelper.ROOT.getProject(projectName);
          project.create(monitor);
          project.open(monitor);
          projects.put(projectName, project);
          result[i] = project;
        }
      }
    }, new NullProgressMonitor());

    return result;
  }
}

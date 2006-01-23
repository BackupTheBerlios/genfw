package com.sympedia.density.tests;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

import java.io.IOException;


public interface IWorkspaceFixture extends IBundleFixture
{
  public IProject addProject(String name) throws CoreException;

  public IProject addProject(String name, String natureId) throws CoreException;

  public IProject addProject(String name, String[] natureIds) throws CoreException;

  public IProject removeProject(String name);

  public void addNature(String natureId, IProject project) throws CoreException;

  public void removeNature(String natureId, IProject project) throws CoreException;

  public IProject getProject(String name);

  public IProject[] importWorkspace(IPath wsLocation) throws IOException, CoreException;

  public IProject[] importWorkspace(IPath wsLocation, String[] projectNames) throws IOException,
          CoreException;
}

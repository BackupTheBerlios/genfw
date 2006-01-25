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

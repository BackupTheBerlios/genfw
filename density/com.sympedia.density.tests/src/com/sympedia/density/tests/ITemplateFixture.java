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
import org.osgi.framework.Bundle;

import java.io.IOException;


public interface ITemplateFixture extends IWorkspaceFixture
{
  public Bundle getTestBundle();

  public IPath getConfigArea();

  public IPath getUserArea();

  public IProject[] importWorkspace() throws IOException, CoreException;
}

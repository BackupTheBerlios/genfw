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


import com.sympedia.density.tests.ITemplateFixture;
import com.sympedia.density.tests.ITestSpec;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import java.io.IOException;
import java.net.URL;


public class TemplateFixture extends WorkspaceFixture implements ITemplateFixture
{
  protected Bundle testBundle;

  protected IPath configArea;

  protected IPath userArea;

  public TemplateFixture(ITestSpec testSpec) throws IOException
  {
    super(testSpec);

    testBundle = Platform.getBundle(testSpec.getTestBundleId());
    assertNotNull(testBundle);

    URL url = testBundle.getEntry("/");
    String localURL = FileLocator.toFileURL(url).getFile();
    assertNotNull(localURL);

    configArea = new Path(localURL).append("bundles");
    assertNotNull(configArea);

    userArea = new Path(localURL).append("workspaces");
    assertNotNull(userArea);
  }

  public Bundle getTestBundle()
  {
    return testBundle;
  }

  public IPath getConfigArea()
  {
    return configArea;
  }

  public IPath getUserArea()
  {
    return userArea;
  }

  public IProject[] importWorkspace() throws IOException, CoreException
  {
    return importWorkspace(getUserArea());
  }
}

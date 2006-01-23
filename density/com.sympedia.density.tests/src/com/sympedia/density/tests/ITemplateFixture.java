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

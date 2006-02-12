package com.sympedia.genfw.ui.internal.actions;


import com.sympedia.genfw.internal.GenfwNature;
import com.sympedia.util.eclipse.resources.ResourcesHelper;
import com.sympedia.util.eclipse.ui.ResourceAction;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;


public class AddNatureAction extends ResourceAction
{
  public AddNatureAction()
  {
  }

  @Override
  protected void doRun(IResource resource) throws Exception
  {
    IProject project = resource.getProject();
    ResourcesHelper.addNatureToProject(GenfwNature.NATURE_ID, project, new NullProgressMonitor());
  }
}

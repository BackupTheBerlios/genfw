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
package com.sympedia.genfw.ui.internal.actions;


import com.sympedia.genfw.internal.GenfwNature;
import com.sympedia.util.eclipse.resources.ResourcesHelper;
import com.sympedia.util.eclipse.ui.ResourceAction;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.NullProgressMonitor;


public class RemoveNatureAction extends ResourceAction
{
  public RemoveNatureAction()
  {
  }

  @Override
  protected void doRun(IResource resource) throws Exception
  {
    IProject project = resource.getProject();
    ResourcesHelper.removeNatureFromProject(GenfwNature.NATURE_ID, project,
            new NullProgressMonitor());
  }
}

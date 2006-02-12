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
package com.sympedia.util.eclipse.ui;


import com.sympedia.util.eclipse.ui.internal.UtilEclipseUiActivator;

import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public abstract class ResourceAction implements IObjectActionDelegate
{
  protected IWorkbenchPart targetPart;

  protected ISelection selection;

  private IResource resource;

  protected ResourceAction()
  {
  }

  public void run(IAction action)
  {
    if (action.isEnabled())
    {
      try
      {
        doRun(resource);
      }
      catch (Exception ex)
      {
        UtilEclipseUiActivator.INSTANCE.log(ex);
      }
    }
  }

  public IResource getResource()
  {
    return resource;
  }

  public ISelection getSelection()
  {
    return selection;
  }

  public IWorkbenchPart getTargetPart()
  {
    return targetPart;
  }

  protected Shell getShell()
  {
    return targetPart.getSite().getShell();
  }

  public void setActivePart(IAction action, IWorkbenchPart targetPart)
  {
    this.targetPart = targetPart;
  }

  public void selectionChanged(IAction action, ISelection selection)
  {
    this.selection = selection;
    resource = (IResource)SelectionHelper.getFirstElement(selection, IResource.class);
    action.setEnabled(resource != null);
  }

  protected abstract void doRun(IResource resource) throws Exception;
}

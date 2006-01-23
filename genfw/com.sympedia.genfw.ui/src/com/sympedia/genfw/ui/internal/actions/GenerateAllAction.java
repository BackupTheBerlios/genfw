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


import com.sympedia.genfw.util.GenAppManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;


public class GenerateAllAction implements IWorkbenchWindowActionDelegate
{
  public GenerateAllAction()
  {
  }

  public void run(IAction action)
  {
    processFiles();
  }

  public void selectionChanged(IAction action, ISelection selection)
  {
  }

  public void dispose()
  {
  }

  public void init(IWorkbenchWindow window)
  {
  }

  public static void processFiles()
  {
    IFile[] files = GenAppManager.INSTANCE.getAppFiles();
    GenerateAction.processFiles(files);
  }
}

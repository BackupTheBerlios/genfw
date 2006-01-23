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


import com.sympedia.genfw.ui.internal.Activator;
import com.sympedia.genfw.util.GenfwHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


public class GenerateAction implements IObjectActionDelegate
{
  private ISelection selection;

  public GenerateAction()
  {
  }

  public void run(IAction action)
  {
    processFiles(selection, null);
  }

  public void setActivePart(IAction action, IWorkbenchPart targetPart)
  {
  }

  public void selectionChanged(IAction action, ISelection selection)
  {
    this.selection = selection;
  }

  public static void showMessage(String message)
  {
    final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    MessageDialog.openInformation(shell, "Sympedia Generation", message);
  }

  public static void processFiles(final IFile[] files)
  {
    if (files.length == 0) return;

    try
    {
      WorkspaceModifyOperation op = new WorkspaceModifyOperation()
      {
        @Override
        protected void execute(IProgressMonitor monitor) throws CoreException,
                InvocationTargetException, InterruptedException
        {
          monitor.beginTask("", files.length);

          try
          {
            for (IFile file : files)
            {
              try
              {
                monitor.subTask("Generator Application " + file.getName());
                GenfwHelper.processFile(file, new SubProgressMonitor(monitor, 1));
              }
              catch (Exception ex)
              {
                ex.printStackTrace();
                Activator.getDefault().getLog().log(
                        new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR,
                                "Problem while processing " + file.getFullPath(), ex));
              }
            }
          }
          finally
          {
            monitor.done();
          }
        }
      };

      PlatformUI.getWorkbench().getProgressService().run(true, true, op);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      Activator.getDefault().getLog().log(
              new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR,
                      "Problem while processing " + files, ex));
      showMessage(ex.toString());
    }
  }

  public static void processFiles(ISelection selection, String extension)
  {
    IFile[] files = getFiles(selection, extension);
    processFiles(files);
  }

  public static IFile[] getFiles(ISelection selection, String extension)
  {
    List<IFile> files = new ArrayList<IFile>();
    if (selection != null && selection instanceof IStructuredSelection)
    {
      IStructuredSelection ssel = (IStructuredSelection)selection;
      for (Object item : ssel.toArray())
      {
        IFile file = null;
        if (item instanceof IFile)
        {
          file = (IFile)item;
        }
        else if (item instanceof IAdaptable)
        {
          IAdaptable adaptable = (IAdaptable)item;
          file = (IFile)adaptable.getAdapter(IFile.class);
        }

        if (file != null)
        {
          if (extension == null || extension.equals(file.getFileExtension()))
          {
            files.add(file);
          }
        }
      }
    }

    return files.toArray(new IFile[files.size()]);
  }
}

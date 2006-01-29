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


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.framelist.BackAction;
import org.eclipse.ui.views.framelist.ForwardAction;
import org.eclipse.ui.views.framelist.UpAction;

import java.util.ArrayList;
import java.util.List;


public class UiHelper
{
  public static boolean openView(String id)
  {
    IWorkbench workbench = PlatformUI.getWorkbench();
    IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();

    try
    {
      activePage.showView(id);
    }
    catch (PartInitException exception)
    {
      Shell shell = workbench.getActiveWorkbenchWindow().getShell();
      MessageDialog.openError(shell, "Problem showing the view " + id, exception.toString());
      return false;
    }

    return true;
  }

  public static IEditorPart openDefaultEditor(IFile file)
  {
    return openEditor(file, null);
  }

  public static IEditorPart openEditor(IFile file, String editorId)
  {
    try
    {
      IWorkbench workbench = PlatformUI.getWorkbench();
      IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();

      if (editorId == null)
      {
        IEditorRegistry editorRegistry = workbench.getEditorRegistry();
        IEditorDescriptor descriptor = editorRegistry.getDefaultEditor(file.getName());
        editorId = descriptor.getId();
      }

      return activePage.openEditor(new FileEditorInput(file), editorId);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      MessageDialog.openError(new Shell(), "Problem opening the editor for " + file.getFullPath(),
              ex.toString());
    }

    return null;
  }

  public static List getTreeItems(Tree tree)
  {
    return getTreeItems(tree, null);
  }

  public static List getTreeItems(Tree tree, Class filter)
  {
    List result = new ArrayList();
    collectTreeItems(tree.getItems(), filter, result);
    return result;
  }

  private static void collectTreeItems(TreeItem[] items, Class filter, List result)
  {
    for (TreeItem item : items)
    {
      collectTreeItems(item.getItems(), filter, result);

      Object object = item.getData();
      if (object != null)
      {
        if (filter == null || filter.isAssignableFrom(object.getClass()))
        {
          result.add(object);
        }
      }
    }
  }

  public static void removeNavigationActions(IToolBarManager manager)
  {
    for (IContributionItem contributionItem : manager.getItems())
    {
      if (contributionItem instanceof ActionContributionItem)
      {
        IAction action = ((ActionContributionItem)contributionItem).getAction();
        if (action instanceof BackAction || action instanceof ForwardAction
                || action instanceof UpAction)
        {
          manager.remove(contributionItem);
        }
      }
    }
  }

  public static List filterSelection(ISelection selection, Class filter)
  {
    final List result = new ArrayList<IFile>();
    if (selection != null && selection instanceof IStructuredSelection)
    {
      IStructuredSelection ssel = (IStructuredSelection)selection;
      for (Object item : ssel.toArray())
      {
        if (filter.isAssignableFrom(item.getClass()))
        {
          result.add(item);
        }
        else if (item instanceof IAdaptable)
        {
          IAdaptable adaptable = (IAdaptable)item;
          item = adaptable.getAdapter(filter);
          if (item != null)
          {
            result.add(item);
          }
        }
      }
    }

    return result;
  }

  public static void refreshViewer(final Viewer viewer)
  {
    refreshViewer(viewer, null);
  }

  public static void refreshViewer(final Viewer viewer, final boolean updateLabels)
  {
    refreshViewer(viewer, null, updateLabels);
  }

  public static void refreshViewer(final Viewer viewer, final Object element)
  {
    refreshViewer(viewer, element, false);
  }

  public static void refreshViewer(final Viewer viewer, final Object element,
          final boolean updateLabels)
  {
    final Control control = viewer.getControl();
    if (control == null || control.isDisposed()) return;

    control.getDisplay().asyncExec(new Runnable()
    {
      public void run()
      {
        try
        {
          if (viewer instanceof StructuredViewer)
          {
            if (element == null)
            {
              ((StructuredViewer)viewer).refresh(updateLabels);
            }
            else
            {
              ((StructuredViewer)viewer).refresh(element, updateLabels);
            }
          }
          else
          {
            viewer.refresh();
          }
        }
        catch (Exception ignore)
        {
        }
      }
    });
  }
}

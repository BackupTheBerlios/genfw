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
package com.sympedia.genfw.ui.internal.views;


import com.sympedia.genfw.ui.internal.GenfwUiActivator;
import com.sympedia.genfw.ui.internal.actions.GenerateAction;
import com.sympedia.genfw.ui.internal.actions.GenerateAllAction;
import com.sympedia.genfw.util.GenAppManager;
import com.sympedia.util.StringHelper;
import com.sympedia.util.eclipse.ui.UiHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.DecoratingLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.views.navigator.ResourceNavigator;

import java.util.ArrayList;
import java.util.List;


public class GenAppsView extends ResourceNavigator implements ISelectionChangedListener
{
  protected LocalGenerate generateAction;

  protected LocalGenerateAll generateAllAction;

  protected Action showInputsAction;

  protected GenAppsContentProvider genAppsContentProvider;

  public GenAppsView()
  {
  }

  @Override
  public void dispose()
  {
    getViewer().removeSelectionChangedListener(this);
    super.dispose();
  }

  public void selectionChanged(SelectionChangedEvent event)
  {
    if (generateAction != null)
    {
      List<IFile> genAppFiles = getGenAppFiles(event.getSelection());
      generateAction.setEnabled(!genAppFiles.isEmpty());
    }
  }

  @Override
  public void createPartControl(Composite parent)
  {
    IToolBarManager manager = getViewSite().getActionBars().getToolBarManager();
    manager.add(generateAction = new LocalGenerate());
    manager.add(generateAllAction = new LocalGenerateAll());
    manager.add(showInputsAction = new Action("Show Inputs", SWT.TOGGLE)
    {
      public void run()
      {
        genAppsContentProvider.setShowInputs(isChecked());
        UiHelper.refreshViewer(getViewer(), true);
      }
    });

    showInputsAction.setToolTipText("Show inputs");
    showInputsAction.setImageDescriptor(GenfwUiActivator.getPlugin().getImageRegistry()
            .getDescriptor("icons/ShowInputs.gif"));

    super.createPartControl(parent);
    UiHelper.removeNavigationActions(manager);

    List<IFile> genApps = getGenAppFiles(getViewer().getSelection());
    generateAction.setEnabled(!genApps.isEmpty());
    getViewer().addSelectionChangedListener(this);
  }

  protected List<IFile> getGenAppFiles(ISelection selection)
  {
    List<IFile> result = new ArrayList<IFile>();
    IFile[] files = GenerateAction.getFiles(selection, null);
    for (IFile file : files)
    {
      if ("genapp".equals(file.getFileExtension()))
      {
        if (!result.contains(file)) result.add(file);
      }
      else
      {
        Object parent = genAppsContentProvider.getParent(file);
        if (parent instanceof IFile)
        {
          IFile parentFile = (IFile)parent;
          if (!result.contains(parentFile)) result.add(parentFile);
        }
      }
    }

    return result;
  }

  @Override
  protected void initContentProvider(TreeViewer viewer)
  {
    genAppsContentProvider = new GenAppsContentProvider();
    viewer.setContentProvider(genAppsContentProvider);
  }

  @Override
  protected void initLabelProvider(TreeViewer viewer)
  {
    viewer.setLabelProvider(new DecoratingLabelProvider(new WorkbenchLabelProvider(), getPlugin()
            .getWorkbench().getDecoratorManager().getLabelDecorator())
    {
      protected Color gray;

      @Override
      public void dispose()
      {
        if (gray != null) gray.dispose();
        super.dispose();
      }

      @Override
      public Color getForeground(Object element)
      {
        if (element instanceof IFile && "genlib".equals(((IFile)element).getFileExtension()))
        {
          if (gray == null) gray = new Color(Display.getCurrent(), 128, 128, 128);
          return gray;
        }

        return super.getForeground(element);
      }

      @Override
      public String getText(Object element)
      {
        String name = super.getText(element);
        if (element instanceof IFile)
        {
          name = StringHelper.removeSuffix(name, ".genapp");
          name = StringHelper.removeSuffix(name, ".genlib");
        }

        return name;
      }
    });
  }

  @Override
  protected IAdaptable getInitialInput()
  {
    return GenAppManager.INSTANCE;
  }

  protected class LocalGenerate extends Action
  {
    public LocalGenerate()
    {
      super("Generate", GenfwUiActivator.getPlugin().getImageRegistry().getDescriptor(
              "icons/GenApp.gif"));
      setToolTipText("Generate selected applications");
    }

    public void run()
    {
      List<IFile> genAppFiles = getGenAppFiles(getViewer().getSelection());
      GenerateAction.processFiles(new StructuredSelection(genAppFiles), null);
    }
  }

  protected class LocalGenerateAll extends Action
  {
    public LocalGenerateAll()
    {
      super("Generate All", GenfwUiActivator.getPlugin().getImageRegistry().getDescriptor(
              "icons/GenerateAll.gif"));
      setToolTipText("Generate all applications");
    }

    public void run()
    {
      GenerateAllAction.processFiles();
    }
  }
}

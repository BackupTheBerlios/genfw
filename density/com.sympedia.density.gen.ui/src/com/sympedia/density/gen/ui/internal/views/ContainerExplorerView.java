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
package com.sympedia.density.gen.ui.internal.views;


import com.sympedia.density.IComponent;
import com.sympedia.density.IContainer;
import com.sympedia.density.IContainerRegistry;
import com.sympedia.density.IContainerRegistryListener;
import com.sympedia.density.IContext;
import com.sympedia.density.IContextListener;
import com.sympedia.density.gen.ui.internal.Activator;
import com.sympedia.density.impl.PrototypeContext_Base;
import com.sympedia.density.impl.SingletonContext_Base;

import com.sympedia.util.StringHelper;
import com.sympedia.util.eclipse.ui.UiHelper;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class ContainerExplorerView extends ViewPart implements IContextListener,
        IContainerRegistryListener
{
  public static ContainerExplorerView INSTANCE;

  private TreeViewer viewer;

  private Action showEmptyAction;

  private Action expandAction;

  private Action collapseAction;

  private Action doubleClickAction;

  public ContainerExplorerView()
  {
  }

  @Override
  public void dispose()
  {
    INSTANCE = null;
    IContainerRegistry.INSTANCE.removeContainerRegistryListener(this);
    for (IContainer container : IContainerRegistry.INSTANCE.getContainers())
    {
      container.removeContextListener(this);
    }

    super.dispose();
  }

  public void createPartControl(Composite parent)
  {
    viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new ViewContentProvider());
    viewer.setLabelProvider(new ViewLabelProvider());
    viewer.setSorter(new NameSorter());
    viewer.setInput(IContainerRegistry.INSTANCE);
    viewer.addSelectionChangedListener(new ISelectionChangedListener()
    {
      public void selectionChanged(SelectionChangedEvent event)
      {
        try
        {
          List<IComponent> instances = UiHelper.filterSelection(event.getSelection(),
                  IComponent.class);

          if (InstanceDetailsView.INSTANCE != null)
          {
            if (!instances.isEmpty())
            {
              InstanceDetailsView.INSTANCE.setCurrentInstance(instances.get(0));
            }
            else
            {
              InstanceDetailsView.INSTANCE.setCurrentInstance(null);
            }
          }

          if (ContainerMonitorView.INSTANCE != null)
          {
            if (!instances.isEmpty())
            {
              ContainerMonitorView.INSTANCE.setCurrentInstance(instances.get(0));
            }
          }
        }
        catch (Exception ex)
        {
          ex.printStackTrace();
        }
      }
    });

    makeActions();
    hookContextMenu();
    hookDoubleClickAction();
    contributeToActionBars();

    IContainerRegistry.INSTANCE.addContainerRegistryListener(this);
    for (IContainer container : IContainerRegistry.INSTANCE.getContainers())
    {
      container.addContextListener(this);
    }

    INSTANCE = this;
  }

  public IComponent getCurrentInstance()
  {
    ISelection selection = viewer.getSelection();
    Object obj = ((IStructuredSelection)selection).getFirstElement();
    return obj instanceof IComponent ? (IComponent)obj : null;
  }

  public void setCurrentInstance(IComponent component)
  {
    if (viewer != null && !viewer.getControl().isDisposed())
    {
      viewer.setSelection(new StructuredSelection(component), true);
    }
  }

  private void hookContextMenu()
  {
    MenuManager menuMgr = new MenuManager("#PopupMenu");
    menuMgr.setRemoveAllWhenShown(true);
    menuMgr.addMenuListener(new IMenuListener()
    {
      public void menuAboutToShow(IMenuManager manager)
      {
        ContainerExplorerView.this.fillContextMenu(manager);
      }
    });

    Menu menu = menuMgr.createContextMenu(viewer.getControl());
    viewer.getControl().setMenu(menu);
    getSite().registerContextMenu(menuMgr, viewer);
  }

  private void contributeToActionBars()
  {
    IActionBars bars = getViewSite().getActionBars();
    fillLocalPullDown(bars.getMenuManager());
    fillLocalToolBar(bars.getToolBarManager());
  }

  private void fillLocalPullDown(IMenuManager manager)
  {
    manager.add(showEmptyAction);
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  private void fillContextMenu(IMenuManager manager)
  {
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  private void fillLocalToolBar(IToolBarManager manager)
  {
    manager.add(showEmptyAction);
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
    manager.add(expandAction);
    manager.add(collapseAction);
  }

  private void makeActions()
  {
    showEmptyAction = new Action("Show Empty Contexts", SWT.TOGGLE)
    {
      public void run()
      {
        refreshViewer(null);
      }
    };

    showEmptyAction.setText("Show Empty Contexts");
    showEmptyAction.setToolTipText("Show empty contexts");
    showEmptyAction.setImageDescriptor(ContainerMonitorView.getImageDesc("ShowEmpty"));

    expandAction = new Action()
    {
      public void run()
      {
        List items = UiHelper.getTreeItems(viewer.getTree(), IContainer.class);
        for (Object item : items)
        {
          if (viewer.getExpandedState(item))
          {
            viewer.expandAll();
            return;
          }
        }

        viewer.expandToLevel(2);
      }
    };

    expandAction.setText("Expand All");
    expandAction.setToolTipText("Expand All");
    expandAction.setImageDescriptor(ContainerMonitorView.getImageDesc("Expand_All"));

    collapseAction = new Action()
    {
      public void run()
      {
        List items = UiHelper.getTreeItems(viewer.getTree(), IContext.class);
        for (Object item : items)
        {
          if (viewer.getExpandedState(item))
          {
            viewer.collapseAll();
            viewer.expandToLevel(2);
            return;
          }
        }

        viewer.collapseAll();
      }
    };

    collapseAction.setText("Collapse All");
    collapseAction.setToolTipText("Collapse All");
    collapseAction.setImageDescriptor(ContainerMonitorView.getImageDesc("Collapse_All"));

    doubleClickAction = new Action()
    {
      public void run()
      {
        try
        {
          ISelection selection = viewer.getSelection();
          Object obj = ((IStructuredSelection)selection).getFirstElement();

          if (obj instanceof IComponent)
          {
            UiHelper.openView(ContainerMonitorView.ID);
            ContainerMonitorView.INSTANCE.setCurrentInstance((IComponent)obj);
          }
        }
        catch (Exception ex)
        {
          ex.printStackTrace();
          showMessage(ex.getMessage());
        }
      }
    };
  }

  private void hookDoubleClickAction()
  {
    viewer.addDoubleClickListener(new IDoubleClickListener()
    {
      public void doubleClick(DoubleClickEvent event)
      {
        doubleClickAction.run();
      }
    });
  }

  private void showMessage(String message)
  {
    MessageDialog.openInformation(viewer.getControl().getShell(), "Container Explorer", message);
  }

  public void setFocus()
  {
    viewer.getControl().setFocus();
  }

  public void notifyContainerRegistered(IContainerRegistry registry, IContainer container)
  {
    refreshViewer(null);
    container.addContextListener(this);
  }

  public void notifyContainerDeregistered(IContainerRegistry registry, IContainer container)
  {
    container.removeContextListener(this);
    refreshViewer(null);
  }

  public void notifyInstanceInitialized(IContext context, IComponent instance)
  {
    refreshViewer(instance.getContext().getContainer());
  }

  public void notifyInstanceDisposed(IContext context, IComponent instance)
  {
    refreshViewer(instance.getContext().getContainer());
  }

  private void refreshViewer(final IContainer container)
  {
    UiHelper.refreshViewer(viewer, container, true);
  }

  public class ViewContentProvider implements IStructuredContentProvider, ITreeContentProvider
  {
    public void inputChanged(Viewer v, Object oldInput, Object newInput)
    {
    }

    public void dispose()
    {
    }

    public Object[] getElements(Object parent)
    {
      return getChildren(parent);
    }

    public Object getParent(Object child)
    {
      if (child instanceof IContainer)
      {
        return IContainerRegistry.INSTANCE;
      }

      if (child instanceof IContext)
      {
        return ((IContext)child).getContainer();
      }

      if (child instanceof IComponent)
      {
        IComponent instance = (IComponent)child;
        if (instance.getContext() instanceof SingletonContext_Base)
        {
          return instance.getContext().getContainer();
        }

        return instance.getContext();
      }

      return null;
    }

    public Object[] getChildren(Object parent)
    {
      if (parent == IContainerRegistry.INSTANCE)
      {
        return IContainerRegistry.INSTANCE.getContainers().toArray();
      }

      if (parent instanceof IContainer)
      {
        List list = new ArrayList();
        for (IContext context : ((IContainer)parent).getContexts())
        {
          if (!context.getInstances().isEmpty() || showEmptyAction.isChecked())
          {
            if (context instanceof SingletonContext_Base)
            {
              list.addAll(context.getInstances());
            }
            else
            {
              list.add(context);
            }
          }
        }

        return list.toArray();
      }

      if (parent instanceof IContext)
      {
        return ((IContext)parent).getInstances().toArray();
      }

      return new Object[0];
    }

    public boolean hasChildren(Object parent)
    {
      if (parent == IContainerRegistry.INSTANCE)
      {
        return !IContainerRegistry.INSTANCE.getContainers().isEmpty();
      }

      if (parent instanceof IContainer)
      {
        return !((IContainer)parent).getContexts().isEmpty();
      }

      if (parent instanceof IContext)
      {
        return getChildren(parent).length != 0;
      }

      return false;
    }
  }

  public static class ViewLabelProvider extends LabelProvider
  {
    private Image containerImage;

    private Image contextImage;

    private Image instanceImage;

    public ViewLabelProvider()
    {
      containerImage = Activator.getImageDescriptor("icons/Container.gif").createImage();
      contextImage = Activator.getImageDescriptor("icons/DeploymentPrototype.gif").createImage();
      instanceImage = Activator.getImageDescriptor("icons/Deployment.gif").createImage();
    }

    public String getText(Object obj)
    {
      if (obj instanceof IContainer)
      {
        return ((IContainer)obj).getName();
      }

      if (obj instanceof IContext)
      {
        IContext context = (IContext)obj;
        String prefix = context.getContainer().getName() + ".";
        String label = StringHelper.removePrefix(context.toString(), prefix);
        return label + " (" + context.getInstances().size() + ")";
      }

      if (obj instanceof IComponent)
      {
        IComponent instance = (IComponent)obj;
        String prefix = instance.getContext().getContainer().getName() + ".";
        String label = StringHelper.removePrefix(instance.toString(), prefix);
        if (instance.getContext() instanceof PrototypeContext_Base)
        {
          int pos = label.indexOf('[');
          if (pos != -1)
          {
            return label.substring(pos + 1, label.length() - 1);
          }
        }

        return label;
      }

      return obj.toString();
    }

    public Image getImage(Object obj)
    {
      if (obj instanceof IContainer)
      {
        return containerImage;
      }

      if (obj instanceof IContext)
      {
        return contextImage;
      }

      if (obj instanceof IComponent)
      {
        return instanceImage;
      }

      return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
    }
  }

  public static class NameSorter extends ViewerSorter
  {
  }

  public static Object containerOf(IComponent instance)
  {
    IContainer container = instance.getContext().getContainer();
    List<IContext> contexts = container.getContexts();
    for (IContext context : contexts)
    {
      Set<IComponent> instances = context.getInstances();
      for (IComponent candidate : instances)
      {
        List<IComponent> children = candidate.getAllReferences(IComponent.REFTYPE_CONTAINMENT);
        if (children.contains(instance))
        {
          return candidate;
        }
      }
    }

    return null;
  }
}

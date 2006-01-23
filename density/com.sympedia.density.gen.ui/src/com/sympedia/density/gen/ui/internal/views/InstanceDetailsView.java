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
import com.sympedia.density.gen.ui.internal.Activator;
import com.sympedia.density.gen.ui.internal.draw2d.InstanceFigure;
import com.sympedia.density.impl.Component_Base;

import com.sympedia.util.BeanHelper;
import com.sympedia.util.StringHelper;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;


public class InstanceDetailsView extends ViewPart
{
  public static InstanceDetailsView INSTANCE;

  private TableViewer viewer;

  private Action showQualifiedNamesAction;

  private IComponent currentInstance;

  private TableColumn header;

  public InstanceDetailsView()
  {
  }

  public void createPartControl(Composite parent)
  {
    viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
    viewer.setContentProvider(new ViewContentProvider());
    viewer.setLabelProvider(new ViewLabelProvider());

    TableLayout layout = new TableLayout();
    Table table = viewer.getTable();
    table.setHeaderVisible(true);
    table.setLayout(layout);

    layout.addColumnData(new ColumnWeightData(1, 128));
    header = new TableColumn(table, SWT.NONE, 0);
    header.setResizable(true);
    header.setText("Current Instance:");

    layout.addColumnData(new ColumnWeightData(5, 1024));
    header = new TableColumn(table, SWT.NONE, 1);
    header.setResizable(true);
    header.setImage(ContainerMonitorView.getImageDesc("Deployment").createImage());

    makeActions();
    hookContextMenu();
    contributeToActionBars();
    INSTANCE = this;

    if (ContainerMonitorView.INSTANCE != null)
    {
      InstanceFigure figure = ContainerMonitorView.INSTANCE.getCurrentFigure();
      setCurrentInstance(figure == null ? null : (IComponent)figure.getData());
    }

  }

  @Override
  public void dispose()
  {
    INSTANCE = null;
    super.dispose();
  }

  public IComponent getCurrentInstance()
  {
    return currentInstance;
  }

  public void setCurrentInstance(IComponent instance)
  {
    if (instance == currentInstance) return;
    currentInstance = instance;
    if (viewer != null && !viewer.getControl().isDisposed())
    {
      viewer.setInput(currentInstance);
      header.setText(currentInstance != null ? currentInstance.toString() : "");
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
        InstanceDetailsView.this.fillContextMenu(manager);
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
    manager.add(showQualifiedNamesAction);
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  private void fillContextMenu(IMenuManager manager)
  {
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  private void fillLocalToolBar(IToolBarManager manager)
  {
    manager.add(showQualifiedNamesAction);
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  private void makeActions()
  {
    showQualifiedNamesAction = new Action("Show Qualified Names", SWT.TOGGLE)
    {
      public void run()
      {
        viewer.refresh(true);
      }
    };

    showQualifiedNamesAction.setToolTipText(showQualifiedNamesAction.getText());
    showQualifiedNamesAction.setImageDescriptor(Activator.getImageDescriptor("icons/EClass.gif"));
  }

  public void setFocus()
  {
    viewer.getControl().setFocus();
  }

  public class ViewContentProvider implements IStructuredContentProvider
  {
    public void inputChanged(Viewer v, Object oldInput, Object newInput)
    {
    }

    public void dispose()
    {
    }

    public Object[] getElements(Object parent)
    {
      if (parent instanceof IComponent)
      {
        List<String> result = new ArrayList<String>();
        List<Field> fields = BeanHelper.getAllDeclaredFields(parent.getClass(),
                Component_Base.class);
        for (Field field : fields)
        {
          if ((field.getModifiers() & Modifier.STATIC) != 0) continue;
          if ((field.getModifiers() & Modifier.TRANSIENT) != 0) continue;
          if ((field.getModifiers() & Modifier.VOLATILE) != 0) continue;
          boolean old = field.isAccessible();
          if (!old) field.setAccessible(true);

          try
          {
            Object value = field.get(parent);
            String name = field.getName();
            if (showQualifiedNamesAction.isChecked())
            {
              name = field.getDeclaringClass().getName() + "." + name;
            }

            boolean primitive = BeanHelper.isPrimitive(field.getType());
            result.add((primitive ? "" : "*") + name + " = " + value);
          }
          catch (Exception ignore)
          {
            ignore.printStackTrace();
          }
          finally
          {
            if (!old) field.setAccessible(false);
          }
        }

        return result.toArray(new String[result.size()]);
      }

      return new Object[0];
    }
  }

  public static class ViewLabelProvider extends LabelProvider implements ITableLabelProvider
  {
    private Image parameterImage;

    private Image referenceImage;

    public ViewLabelProvider()
    {
      parameterImage = ContainerMonitorView.getImageDesc("Parameter").createImage();
      referenceImage = ContainerMonitorView.getImageDesc("NormalRef").createImage();
    }

    public String getColumnText(Object obj, int index)
    {
      String text = getText(obj);
      text = StringHelper.removePrefix(text, "*");
      int pos = text.indexOf("=");
      if (pos != -1)
      {
        if (index == 0)
        {
          text = text.substring(0, pos).trim();
        }
        else if (index == 1)
        {
          text = text.substring(pos + 1).trim();
        }
      }

      return text;
    }

    public Image getColumnImage(Object obj, int index)
    {
      if (index == 1)
      {
        return getImage(obj);
      }

      return null;
    }

    public Image getImage(Object obj)
    {
      String text = getText(obj);
      return text.startsWith("*") ? referenceImage : parameterImage;
    }
  }
}

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
import com.sympedia.density.IEvent;
import com.sympedia.density.IEventListener;
import com.sympedia.density.IEventNotifier;
import com.sympedia.density.gen.ui.internal.Activator;
import com.sympedia.density.gen.ui.internal.draw2d.DirectedGraphPlotter;
import com.sympedia.density.gen.ui.internal.draw2d.InstanceFigure;

import com.sympedia.util.StringHelper;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;


public class ContainerMonitorView extends ViewPart implements IContainerRegistryListener,
        IContextListener, MouseListener, IEventListener
{
  public static final String ID = "com.sympedia.density.gen.ui.ContainerMonitorView";

  private static final String[] FLAG_LABELS = {"", "normal", "listener", "", "containment"};

  private static final String[] FLAG_FILES = {"", "NormalRef", "ListenerRef", "", "ContainmentRef"};

  public static ContainerMonitorView INSTANCE;

  private Color LIGHT_YELLOW;

  private Action distance1Action;

  private Action distance2Action;

  private Action referencesAction;

  private Action containmentAction;

  private Action listenersAction;

  private FigureCanvas canvas;

  private DirectedGraphPlotter plotter;

  private IContainer currentContainer;

  private InstanceFigure currentFigure;

  private int distance = 1;

  private int flags = IComponent.REFTYPE_ALL;

  private BackgroundUpdater backgroundUpdater;

  private BackgroundFader backgroundFader;

  public ContainerMonitorView()
  {
  }

  public void createPartControl(Composite parent)
  {
    LIGHT_YELLOW = new Color(parent.getDisplay(), 255, 255, 240);
    Composite composite = new Composite(parent, SWT.BORDER);
    composite.setLayout(new FillLayout());
    canvas = new FigureCanvas(composite);
    canvas.addMouseListener(this);
    canvas.setBackground(LIGHT_YELLOW);
    plotter = new DirectedGraphPlotter(canvas, parent.getFont());

    Collection<IContainer> containers = IContainerRegistry.INSTANCE.getContainers();
    if (!containers.isEmpty())
    {
      currentContainer = containers.iterator().next();
      currentContainer.addContextListener(this);
      plotter.plotContainer(currentContainer, null, distance, flags, new NullProgressMonitor());
    }

    makeActions();
    contributeToActionBars();

    backgroundUpdater = new BackgroundUpdater(parent);
    backgroundUpdater.setDaemon(true);
    backgroundUpdater.start();

    backgroundFader = new BackgroundFader(parent);
    backgroundFader.setDaemon(true);
    backgroundFader.start();

    IContainerRegistry.INSTANCE.addContainerRegistryListener(this);
    INSTANCE = this;
  }

  public IContainer getCurrentContainer()
  {
    return currentContainer;
  }

  public void setCurrentContainer(IContainer container)
  {
    if (container == currentContainer) return;
    if (currentContainer != null)
    {
      currentContainer.removeContextListener(this);
    }

    currentContainer = container;

    if (currentContainer != null)
    {
      List<IComponent> allInstances = currentContainer.getAllInstances();
      for (IComponent instance : allInstances)
      {
        instance.addEventListener(this);
      }
      currentContainer.addContextListener(this);
    }

    setCurrentFigure(null);
    backgroundUpdater.restart();
  }

  public InstanceFigure getCurrentFigure()
  {
    return currentFigure;
  }

  public void setCurrentFigure(InstanceFigure figure)
  {
    if (figure == currentFigure) return;
    currentFigure = figure;
    backgroundUpdater.restart();
    if (InstanceDetailsView.INSTANCE != null)
    {
      InstanceDetailsView.INSTANCE.setCurrentInstance(currentFigure == null ? null
              : (IComponent)currentFigure.getData());
    }
  }

  public void setCurrentInstance(IComponent instance)
  {
    if (instance == null) return;
    if (currentFigure != null && currentFigure.getData() == instance) return;

    IContainer container = instance.getContext().getContainer();
    if (container == currentContainer)
    {
      InstanceFigure figure = getFigureFor(instance);
      if (figure != null)
      {
        setCurrentFigure(figure);
        return;
      }
    }

    plotter.plotContainer(container, instance, distance, flags, new NullProgressMonitor());
    InstanceFigure figure = getFigureFor(instance);

    setCurrentContainer(container);
    setCurrentFigure(figure);
  }

  private InstanceFigure getFigureFor(IComponent instance)
  {
    for (Iterator it = canvas.getContents().getChildren().iterator(); it.hasNext();)
    {
      IFigure child = (IFigure)it.next();
      if (child instanceof InstanceFigure && ((InstanceFigure)child).getData() == instance)
      {
        return (InstanceFigure)child;
      }
    }

    return null;
  }

  @Override
  public void dispose()
  {
    INSTANCE = null;
    setCurrentFigure(null);
    if (currentContainer != null)
    {
      currentContainer.removeContextListener(this);
      List<IComponent> allInstances = currentContainer.getAllInstances();
      for (IComponent instance : allInstances)
      {
        instance.removeEventListener(this);
      }
    }

    IContainerRegistry.INSTANCE.removeContainerRegistryListener(this);
    backgroundUpdater.stopThread();
    backgroundFader.stopThread();
    super.dispose();
  }

  public void setFocus()
  {
  }

  private void contributeToActionBars()
  {
    IActionBars bars = getViewSite().getActionBars();
    fillLocalPullDown(bars.getMenuManager());
    fillLocalToolBar(bars.getToolBarManager());
  }

  private void fillLocalPullDown(IMenuManager manager)
  {
    manager.add(distance1Action);
    manager.add(distance2Action);
    manager.add(new Separator());
    manager.add(referencesAction);
    manager.add(listenersAction);
    manager.add(containmentAction);
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  private void fillLocalToolBar(IToolBarManager manager)
  {
    manager.add(distance1Action);
    manager.add(distance2Action);
    manager.add(referencesAction);
    manager.add(listenersAction);
    manager.add(containmentAction);
    manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
  }

  private void makeActions()
  {
    distance1Action = new DistanceAction(1);
    distance2Action = new DistanceAction(2);
    referencesAction = new FlagsAction(IComponent.REFTYPE_NORMAL);
    listenersAction = new FlagsAction(IComponent.REFTYPE_EVENT);
    containmentAction = new FlagsAction(IComponent.REFTYPE_CONTAINMENT);

    distance1Action.setChecked(true);
    referencesAction.setChecked(true);
    listenersAction.setChecked(true);
    containmentAction.setChecked(true);
  }

  public void notifyContainerRegistered(IContainerRegistry registry, IContainer container)
  {
    setCurrentContainer(container);
  }

  public void notifyContainerDeregistered(IContainerRegistry registry, IContainer container)
  {
  }

  public void notifyInstanceInitialized(IContext context, IComponent instance)
  {
    if (DirectedGraphPlotter.TRACING) System.out.println("Initialized: " + instance);
    instance.addEventListener(this);
    backgroundUpdater.restart();
  }

  public void notifyInstanceDisposed(IContext context, IComponent instance)
  {
    if (DirectedGraphPlotter.TRACING) System.out.println("Disposed: " + instance);
    instance.removeEventListener(this);
    backgroundUpdater.restart();
  }

  public void notifyEvent(IEvent event)
  {
    //    backgroundUpdater.restart();
    IEventNotifier eventNotifier = event.getEventNotifier();
    if (eventNotifier instanceof IComponent)
    {
      if (DirectedGraphPlotter.TRACING) System.out.println("Event: " + eventNotifier);
      backgroundFader.tellEvent((IComponent)eventNotifier);
    }
  }

  private List<PolylineConnection> getEventConnections(IComponent instance)
  {
    List<PolylineConnection> result = new ArrayList<PolylineConnection>();
    List<IComponent> eventRefs = instance.getAllReferences(IComponent.REFTYPE_EVENT);
    for (Iterator it = canvas.getContents().getChildren().iterator(); it.hasNext();)
    {
      IFigure child = (IFigure)it.next();
      if (child instanceof PolylineConnection)
      {
        IFigure sourceOwner = ((PolylineConnection)child).getSourceAnchor().getOwner();
        if (sourceOwner instanceof InstanceFigure)
        {
          if (((InstanceFigure)sourceOwner).getData() == instance)
          {
            IFigure targetOwner = ((PolylineConnection)child).getTargetAnchor().getOwner();
            if (targetOwner instanceof InstanceFigure)
            {
              if (eventRefs.contains(((InstanceFigure)targetOwner).getData()))
              {
                result.add((PolylineConnection)child);
              }
            }
          }
        }
      }
    }

    return result;
  }

  public IFigure getFigureAt(int x, int y)
  {
    Point point = new Point(x, y);
    canvas.getContents().translateToRelative(point);
    return canvas.getContents().findFigureAt(point);
  }

  public void mouseDoubleClick(MouseEvent e)
  {
    IFigure figure = getFigureAt(e.x, e.y);
    if (figure instanceof InstanceFigure)
    {
      setCurrentFigure((InstanceFigure)figure);
      if (ContainerExplorerView.INSTANCE != null)
      {
        ContainerExplorerView.INSTANCE
                .setCurrentInstance(figure instanceof InstanceFigure ? (IComponent)((InstanceFigure)figure)
                        .getData()
                        : null);
      }
    }
    else
    {
      setCurrentFigure(null);
    }
  }

  public void mouseDown(MouseEvent e)
  {
    IFigure figure = getFigureAt(e.x, e.y);
    if (InstanceDetailsView.INSTANCE != null)
    {
      InstanceDetailsView.INSTANCE
              .setCurrentInstance(figure instanceof InstanceFigure ? (IComponent)((InstanceFigure)figure)
                      .getData()
                      : null);
    }
  }

  public void mouseUp(MouseEvent e)
  {
  }

  public int getDistance()
  {
    return distance;
  }

  public void setDistance(int distance)
  {
    if (this.distance != distance)
    {
      this.distance = distance;
      backgroundUpdater.restart();
      distance1Action.setChecked(distance == 1);
      distance2Action.setChecked(distance > 1);
    }
  }

  public int getFlags()
  {
    return flags;
  }

  public void setFlag(int flag, boolean on)
  {
    int oldFlags = flags;
    flags = (flags & ~flag) | (on ? flag : 0);

    if (flags != oldFlags)
    {
      backgroundUpdater.restart();
      referencesAction.setChecked((flags & IComponent.REFTYPE_NORMAL) != 0);
      listenersAction.setChecked((flags & IComponent.REFTYPE_EVENT) != 0);
      containmentAction.setChecked((flags & IComponent.REFTYPE_CONTAINMENT) != 0);
    }
  }

  public static ImageDescriptor getImageDesc(String filename)
  {
    return Activator.getImageDescriptor("icons/" + filename + ".gif");
  }

  private class DistanceAction extends Action
  {
    private int distance;

    public DistanceAction(int distance)
    {
      super("Distance " + distance, SWT.TOGGLE);
      setText("Show direct neighbours of the selected instance"
              + (distance > 1 ? " and their neighbours" : ""));
      setImageDescriptor(getImageDesc("Distance" + distance));
      this.distance = distance;
    }

    public void run()
    {
      setDistance(distance);
    }
  }

  private class FlagsAction extends Action
  {
    private int flag;

    public FlagsAction(int flag)
    {
      super(StringHelper.firstToUpper(FLAG_LABELS[flag]) + " References", SWT.TOGGLE);
      setText("Show " + FLAG_LABELS[flag] + " references");
      setImageDescriptor(getImageDesc(FLAG_FILES[flag]));
      this.flag = flag;
    }

    public void run()
    {
      switch (flag)
      {
      case IComponent.REFTYPE_NORMAL:
        setFlag(flag, referencesAction.isChecked());
        break;

      case IComponent.REFTYPE_EVENT:
        setFlag(flag, listenersAction.isChecked());
        break;

      case IComponent.REFTYPE_CONTAINMENT:
        setFlag(flag, containmentAction.isChecked());
        break;

      default:
      }
    }
  }

  private class BackgroundUpdater extends Thread
  {
    private IProgressMonitor monitor;

    private boolean shouldRestart;

    private boolean stopping;

    private Composite parent;

    private long modCount;

    public BackgroundUpdater(Composite parent)
    {
      super("BackgroundUpdater");
      this.parent = parent;
    }

    @Override
    public void run()
    {
      long lastModCount = -1;
      while (!stopping)
      {
        while (currentContainer == null || modCount == lastModCount)
        {
          try
          {
            sleep(200);
          }
          catch (InterruptedException ex)
          {
            return;
          }

          if (stopping) return;
        }

        lastModCount = modCount;

        do
        {
          shouldRestart = false;
          parent.getDisplay().asyncExec(new Runnable()
          {
            public void run()
            {
              try
              {
                if (DirectedGraphPlotter.TRACING) System.out.println("START PLOTTING");
                monitor = new NullProgressMonitor();
                IComponent currentInstance = currentFigure != null ? (IComponent)currentFigure
                        .getData() : null;
                plotter.plotContainer(currentContainer, currentInstance, distance, flags, monitor);
                parent.update();
                if (DirectedGraphPlotter.TRACING) System.out.println("FINISHED PLOTTING");
              }
              catch (CancellationException ex)
              {
                if (DirectedGraphPlotter.TRACING) System.out.println("CANCELED PLOTTING");
              }
              catch (RuntimeException ex)
              {
                if (DirectedGraphPlotter.TRACING) ex.printStackTrace();
              }
            }
          });
        } while (shouldRestart);

        monitor = null;
      }
    }

    public void restart()
    {
      ++modCount;
      if (monitor != null)
      {
        shouldRestart = true;
        monitor.setCanceled(true);
      }
    }

    public void stopThread()
    {
      stopping = true;
      if (monitor != null)
      {
        shouldRestart = false;
        monitor.setCanceled(true);
      }
    }
  }

  private class BackgroundFader extends Thread
  {
    private Composite parent;

    private boolean stopping;

    protected Color[] COLORS = new Color[16];

    public BackgroundFader(Composite parent)
    {
      super("BackgroundFader");
      this.parent = parent;
      for (int i = 0; i < COLORS.length; i++)
      {
        COLORS[i] = new Color(parent.getDisplay(), 0, 0, 16 * i);
      }
    }

    @Override
    public void run()
    {
      while (!stopping)
      {
        try
        {
          sleep(100);
        }
        catch (InterruptedException ex)
        {
          return;
        }

        if (stopping) return;

        synchronized (faderEvents)
        {
          if (faderEvents.isEmpty()) continue;
          copy = faderEvents.values().toArray(new FaderEvent[faderEvents.size()]);
        }

        parent.getDisplay().asyncExec(new Runnable()
        {
          public void run()
          {
            try
            {
              for (int i = 0; i < copy.length; i++)
              {
                if (stopping) return;
                FaderEvent faderEvent = copy[i];
                IComponent instance = faderEvent.getInstance();
                int fade = faderEvent.getFade();
                if (fade <= 0)
                {
                  if (DirectedGraphPlotter.TRACING)
                    System.out.println("Fading (FINISHED): " + instance);
                  synchronized (faderEvents)
                  {
                    faderEvents.remove(instance);
                  }
                }
                else
                {
                  if (DirectedGraphPlotter.TRACING)
                    System.out.println("Fading (" + fade + "): " + instance);
                }

                List<PolylineConnection> connections = getEventConnections(instance);
                for (PolylineConnection connection : connections)
                {
                  if (stopping) return;
                  connection.setForegroundColor(COLORS[fade % COLORS.length]);
                  connection.setLineWidth(fade > 0 ? 2 : 1);
                }
              }

              parent.update();
            }
            catch (Exception ex)
            {
              ex.printStackTrace();
            }
          }
        });
      }
    }

    public void tellEvent(IComponent instance)
    {
      if (DirectedGraphPlotter.TRACING) System.out.println("TELLING: " + instance);
      synchronized (faderEvents)
      {
        faderEvents.put(instance, new FaderEvent(instance));
      }
      if (DirectedGraphPlotter.TRACING) System.out.println("TOLD: " + instance);
    }

    public void stopThread()
    {
      stopping = true;
    }
  }

  public static Map<IComponent, FaderEvent> faderEvents = new HashMap<IComponent, FaderEvent>(211);

  public static FaderEvent[] copy;

  public static class FaderEvent
  {
    private IComponent instance;

    private int fade = 16;

    public FaderEvent(IComponent instance)
    {
      this.instance = instance;
    }

    public IComponent getInstance()
    {
      return instance;
    }

    public int getFade()
    {
      return fade--;
    }

    @Override
    public String toString()
    {
      return "FaderEvent[" + instance + ", " + fade + "]";
    }
  }
}

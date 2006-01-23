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
package com.sympedia.density.gen.ui.internal.draw2d;


import com.sympedia.density.IComponent;
import com.sympedia.density.IContainer;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Panel;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.DirectedGraph;
import org.eclipse.draw2d.graph.DirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.draw2d.graph.Subgraph;
import org.eclipse.swt.graphics.Font;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;


public class DirectedGraphPlotter
{
  public static final boolean TRACING = false;

  private FigureCanvas canvas;

  private Font font;

  private transient Map<Object, Node> nodeMap;

  private transient Map<IComponent, List<IComponent>> cache;

  private transient IProgressMonitor monitor;

  public DirectedGraphPlotter(FigureCanvas canvas, Font font)
  {
    this.canvas = canvas;
    this.font = font;
  }

  public void plotContainer(IContainer container, IComponent currentInstance, int distance,
          int flags, IProgressMonitor monitor)
  {
    this.monitor = monitor;
    nodeMap = new HashMap<Object, Node>();
    cache = new HashMap<IComponent, List<IComponent>>();

    Panel contents = new Panel();
    contents.setLayoutManager(new XYLayout());
    canvas.setContents(contents);

    DirectedGraph graph = createGraph(container, currentInstance, distance, flags);
    layoutGraph(graph);
    drawGraph(graph);
  }

  private DirectedGraph createGraph(IContainer container, IComponent currentInstance, int distance,
          int flags)
  {
    checkCanceled();
    DirectedGraph graph = new DirectedGraph();
    Node containerNode = new Node(container);
    if (currentInstance == null)
    {
      graph.nodes.add(containerNode);
    }

    List<IComponent> instances = container.getAllInstances();
    for (IComponent instance : instances)
    {
      checkCanceled();
      if (currentInstance != null && currentInstance != instance)
      {
        if (!isNeighbour(currentInstance, instance, distance, flags))
        {
          continue;
        }
      }

      if (TRACING) System.out.println("Adding: " + instance);
      InstanceFigure figure = new InstanceFigure(instance);
      Node node = createNode(figure);
      graph.nodes.add(node);

      if (currentInstance == null)
      {
        graph.edges.add(new Edge(containerNode, node));
      }
    }

    for (IComponent source : instances)
    {
      checkCanceled();
      Node sourceNode = nodeMap.get(source);
      if (sourceNode != null)
      {
        for (IComponent target : getTargets(source, flags))
        {
          checkCanceled();
          Node targetNode = nodeMap.get(target);
          if (targetNode != null)
          {
            if (TRACING) System.out.println("Linking: " + source + " -> " + target);
            Edge edge = new Edge(sourceNode, targetNode);
            graph.edges.add(edge);
          }
        }
      }
    }

    return graph;
  }

  private boolean isNeighbour(IComponent instance1, IComponent instance2, int level, int flags)
  {
    if (level == 0) return false;
    for (IComponent target : getTargets(instance1, flags))
    {
      if (target == instance2) return true;
      if (isNeighbour(target, instance2, level - 1, flags)) return true;
    }

    for (IComponent target : getTargets(instance2, flags))
    {
      if (target == instance1) return true;
      if (isNeighbour(target, instance1, level - 1, flags)) return true;
    }

    return false;
  }

  private List<IComponent> getTargets(IComponent instance, int flags)
  {
    List<IComponent> result = cache.get(instance);
    if (result == null)
    {
      result = instance.getAllReferences(flags);
      cache.put(instance, result);
    }

    return result;
  }

  private boolean isEventTarget(IComponent source, IComponent target)
  {
    return source.getAllReferences(IComponent.REFTYPE_EVENT).contains(target);
  }

  private void drawGraph(DirectedGraph graph)
  {
    for (int i = 0; i < graph.nodes.size(); i++)
    {
      checkCanceled();
      Node node = graph.nodes.getNode(i);
      if (node.data instanceof InstanceFigure)
      {
        if (isNormalNode(node))
        {
          drawNodeFigure(node);
        }
      }
    }

    List<Edge> eventEdges = new ArrayList<Edge>();
    for (int i = 0; i < graph.edges.size(); i++)
    {
      checkCanceled();
      Edge edge = graph.edges.getEdge(i);
      if (isNormalEdge(edge))
      {
        IComponent source = (IComponent)((InstanceFigure)edge.source.data).getData();
        IComponent target = (IComponent)((InstanceFigure)edge.target.data).getData();
        if (isEventTarget(source, target))
        {
          eventEdges.add(edge);
        }
        else
        {
          drawEdgeFigure(edge, false);
        }
      }
    }

    for (Edge edge : eventEdges)
    {
      drawEdgeFigure(edge, true);
    }
  }

  private boolean isNormalNode(Node node)
  {
    return node.data != null && node.data instanceof InstanceFigure;
  }

  private boolean isNormalEdge(Edge edge)
  {
    if (edge.source instanceof Subgraph || edge.target instanceof Subgraph)
    {
      return false;
    }

    return isNormalNode(edge.source) && isNormalNode(edge.target);
  }

  private void layoutGraph(DirectedGraph graph)
  {
    checkCanceled();
    try
    {
      new DirectedGraphLayout().visit(graph);
    }
    catch (RuntimeException ex)
    {
      if (DirectedGraphPlotter.TRACING) ex.printStackTrace();
      throw ex;
    }
  }

  private Node createNode(INodeFigure figure)
  {
    checkCanceled();
    canvas.getContents().add(figure);
    figure.setFont(font);
    Dimension extent = figure.getExtent();

    Node node = new Node(figure);
    node.width = extent.width;
    node.height = extent.height;

    nodeMap.put(figure.getData(), node);
    return node;
  }

  private void drawNodeFigure(Node node)
  {
    checkCanceled();
    IFigure figure = (IFigure)node.data;
    canvas.getContents().setConstraint(figure, new Rectangle(node.x, node.y, -1, -1));

    if (TRACING && figure instanceof InstanceFigure)
    {
      System.out.println("Plotting: " + ((InstanceFigure)figure).getData());
    }
  }

  private void drawEdgeFigure(Edge edge, boolean event)
  {
    checkCanceled();

    // Decoration
    PointList pointList = new PointList();
    pointList.addPoint(-1, 1);
    pointList.addPoint(0, 0);
    pointList.addPoint(-1, -1);

    PolylineDecoration decoration = new PolylineDecoration();
    decoration.setTemplate(pointList);
    decoration.setForegroundColor(event ? ColorConstants.gray : ColorConstants.black);

    // Connection
    ConnectionAnchor sourceAnchor = new ChopboxAnchor((Figure)edge.source.data);
    ConnectionAnchor targetAnchor = new ChopboxAnchor((Figure)edge.target.data);

    PolylineConnection wireFigure = new PolylineConnection();
    wireFigure.setSourceAnchor(sourceAnchor);
    wireFigure.setTargetAnchor(targetAnchor);
    wireFigure.setTargetDecoration(decoration);
    wireFigure.setForegroundColor(event ? ColorConstants.gray : ColorConstants.black);

    canvas.getContents().add(wireFigure);
  }

  private void checkCanceled()
  {
    if (monitor.isCanceled())
    {
      throw new CancellationException();
    }
  }
}

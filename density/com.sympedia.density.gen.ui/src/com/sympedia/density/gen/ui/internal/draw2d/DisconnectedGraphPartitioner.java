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


import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.DirectedGraph;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.draw2d.graph.Subgraph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class DisconnectedGraphPartitioner
{
  private CompoundDirectedGraph compound;

  public DisconnectedGraphPartitioner()
  {
  }

  public DirectedGraph partition(DirectedGraph g)
  {
    compound = new CompoundDirectedGraph();
    int count = 0;
    for (Iterator it = g.nodes.iterator(); it.hasNext();)
    {
      Node node = (Node)it.next();
      Subgraph subGraph = getConnectedSubGraph(node, g.edges);
      if (subGraph == null)
      {
        String label = "SG" + (++count);
        subGraph = new Subgraph(label);
        compound.nodes.add(subGraph);
      }

      compound.nodes.add(node);
      node.setParent(subGraph);
      subGraph.addMember(node);
    }

    for (Iterator it = g.edges.iterator(); it.hasNext();)
    {
      Edge edge = (Edge)it.next();
      compound.edges.add(edge);
    }

    for (Iterator it1 = compound.nodes.iterator(); it1.hasNext();)
    {
      Node item1 = (Node)it1.next();
      if (item1 instanceof Subgraph)
      {
        Subgraph subGraph1 = (Subgraph)item1;
        for (Iterator it2 = compound.nodes.iterator(); it2.hasNext();)
        {
          Node item2 = (Node)it2.next();
          if (item2 instanceof Subgraph)
          {
            Subgraph subGraph2 = (Subgraph)item2;
            if (subGraph1 != subGraph2)
            {
              compound.edges.add(new Edge(subGraph1, subGraph2));
            }
          }
        }
      }
    }

    return compound;
  }

  protected Subgraph getConnectedSubGraph(Node node, EdgeList edges)
  {
    for (Iterator it = compound.nodes.iterator(); it.hasNext();)
    {
      Node item = (Node)it.next();
      if (item instanceof Subgraph)
      {
        Subgraph subGraph = (Subgraph)item;
        if (isConnected(node, subGraph, edges))
        {
          return subGraph;
        }
      }
    }

    return null;
  }

  public static boolean isConnected(Node node, Subgraph subGraph, EdgeList edges)
  {
    for (Iterator it = subGraph.members.iterator(); it.hasNext();)
    {
      Node subNode = (Node)it.next();
      if (isConnected(node, subNode, edges))
      {
        return true;
      }
    }

    return false;
  }

  public static boolean isConnected(Node node1, Node node2, EdgeList edges)
  {
    for (Iterator it = edges.iterator(); it.hasNext();)
    {
      Edge edge = (Edge)it.next();
      if (edge.source == node1 && edge.target == node2) return true;
      if (edge.source == node2 && edge.target == node1) return true;
    }

    return false;
  }
}

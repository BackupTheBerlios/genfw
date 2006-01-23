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


import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;


public abstract class NodeFigure extends Label implements INodeFigure
{
  private Dimension extent;

  public NodeFigure(String s, Color bg)
  {
    super(s);
    setBackgroundColor(bg);
    setBorder(new LineBorder());
    setOpaque(true);
  }

  public Dimension getExtent()
  {
    if (extent == null)
    {
      try
      {
        extent = getTextSize();
        extent.expand(6, 6);
        setSize(extent);
      }
      catch (RuntimeException ex)
      {
        ex.printStackTrace();
        throw ex;
      }
    }

    return extent;
  }
}

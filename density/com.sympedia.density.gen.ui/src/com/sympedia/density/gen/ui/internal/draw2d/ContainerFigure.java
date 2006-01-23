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


import com.sympedia.density.IContainer;

import org.eclipse.draw2d.ColorConstants;


public class ContainerFigure extends NodeFigure
{
  private IContainer container;

  public ContainerFigure(IContainer container)
  {
    super(container.getName(), ColorConstants.orange);
    this.container = container;
  }

  public Object getData()
  {
    return container;
  }
}

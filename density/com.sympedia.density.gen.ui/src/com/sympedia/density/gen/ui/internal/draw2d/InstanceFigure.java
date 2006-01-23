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

import org.eclipse.draw2d.ColorConstants;


public class InstanceFigure extends NodeFigure
{
  private IComponent instance;

  public InstanceFigure(IComponent instance)
  {
    super(getLabelText(instance), ColorConstants.white);
    this.instance = instance;
  }

  public Object getData()
  {
    return instance;
  }

  private static String getLabelText(IComponent instance)
  {
    String label = instance.toString();
    String prefix = instance.getContext().getContainer().getName() + ".";
    if (label.startsWith(prefix))
    {
      label = label.substring(prefix.length());
    }

    int pos = label.indexOf('[');
    if (pos != -1)
    {
      label = label.substring(0, pos) + "\n" + label.substring(pos + 1);
      if (label.endsWith("]"))
      {
        label = label.substring(0, label.length() - 1);
      }
    }

    return label;
  }
}

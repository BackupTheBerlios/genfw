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
package com.sympedia.density.util;


import com.sympedia.density.*;


public interface ICollection extends IComponent, java.util.Collection
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Attribute access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the containment property.
   * @return the value of the containment property.
   */
  public boolean isContainment();

  /**
   * Sets the value of the containment property.
   * @parm containment the new value of the containment property.
   */
  public void setContainment(boolean containment);

}

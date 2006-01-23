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


public interface IHashSet extends com.sympedia.density.util.ISet
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Attribute access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the initialCapacity property.
   * @return the value of the initialCapacity property.
   */
  public int getInitialCapacity();

  /**
   * Sets the value of the initialCapacity property.
   * @parm initialCapacity the new value of the initialCapacity property.
   */
  public void setInitialCapacity(int initialCapacity);

  /**
   * Returns the value of the loadFactor property.
   * @return the value of the loadFactor property.
   */
  public float getLoadFactor();

  /**
   * Sets the value of the loadFactor property.
   * @parm loadFactor the new value of the loadFactor property.
   */
  public void setLoadFactor(float loadFactor);

}

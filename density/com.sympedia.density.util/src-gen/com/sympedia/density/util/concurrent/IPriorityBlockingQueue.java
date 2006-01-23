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
package com.sympedia.density.util.concurrent;


import com.sympedia.density.*;


public interface IPriorityBlockingQueue extends com.sympedia.density.util.concurrent.IBlockingQueue
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
   * Returns the value of the comparator property.
   * @return the value of the comparator property.
   */
  public java.util.Comparator getComparator();

  /**
   * Sets the value of the comparator property.
   * @parm comparator the new value of the comparator property.
   */
  public void setComparator(java.util.Comparator comparator);

}

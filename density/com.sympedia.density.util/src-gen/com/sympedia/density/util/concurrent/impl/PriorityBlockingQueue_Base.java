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
package com.sympedia.density.util.concurrent.impl;


import com.sympedia.density.util.concurrent.IPriorityBlockingQueue;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class PriorityBlockingQueue_Base
  extends com.sympedia.density.util.concurrent.impl.BlockingQueueImpl
  implements IPriorityBlockingQueue
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public PriorityBlockingQueue_Base()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
  }

  @Override
  protected void doDispose() throws Exception
  {
    super.doDispose();
  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Property implementations
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * The default value of the initialCapacity property.
   */
  public static final int DEFAULT_InitialCapacity = 0;

  /**
   * The cached value of the initialCapacity property.
   */
  private int initialCapacity = DEFAULT_InitialCapacity;

  /**
   * Returns the value of the initialCapacity property.
   * @return the value of the initialCapacity property.
   */
  public int getInitialCapacity()
  {
  	return initialCapacity;
  }

  /**
   * Sets the value of the initialCapacity property.
   * @parm initialCapacity the new value of the initialCapacity property.
   */
  public void setInitialCapacity(int initialCapacity)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting initialCapacity = " + initialCapacity);
    }

  	this.initialCapacity = initialCapacity;
  }

  /**
   * The cached value of the comparator property.
   */
  private java.util.Comparator comparator;

  /**
   * Returns the value of the comparator property.
   * @return the value of the comparator property.
   */
  public java.util.Comparator getComparator()
  {
  	return comparator;
  }

  /**
   * Sets the value of the comparator property.
   * @parm comparator the new value of the comparator property.
   */
  public void setComparator(java.util.Comparator comparator)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting comparator = " + comparator);
    }

  	this.comparator = comparator;
  }



  /////////////////////////////////////////////////////////////////////////////////////
  // Context interface
  /////////////////////////////////////////////////////////////////////////////////////

  public interface IContext extends com.sympedia.density.util.concurrent.impl.BlockingQueue_Base.IContext
  {
  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Introspection
  /////////////////////////////////////////////////////////////////////////////////////

  @Override
  protected void doFillReferences(List<IComponent> references, int flags)
  {
    super.doFillReferences(references, flags);
  }
}

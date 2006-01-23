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


import com.sympedia.density.util.concurrent.ILinkedBlockingQueue;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class LinkedBlockingQueue_Base
  extends com.sympedia.density.util.concurrent.impl.BlockingQueueImpl
  implements ILinkedBlockingQueue
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public LinkedBlockingQueue_Base()
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
   * The default value of the capacity property.
   */
  public static final int DEFAULT_Capacity = -1;

  /**
   * The cached value of the capacity property.
   */
  private int capacity = DEFAULT_Capacity;

  /**
   * Returns the value of the capacity property.
   * @return the value of the capacity property.
   */
  public int getCapacity()
  {
  	return capacity;
  }

  /**
   * Sets the value of the capacity property.
   * @parm capacity the new value of the capacity property.
   */
  public void setCapacity(int capacity)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting capacity = " + capacity);
    }

  	this.capacity = capacity;
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

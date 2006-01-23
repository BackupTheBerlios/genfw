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


import java.util.Collection;
import java.util.concurrent.TimeUnit;


public abstract class BlockingQueueImpl extends BlockingQueue_Base
{
  public BlockingQueueImpl()
  {
  }

  public boolean offer(Object o, long timeout, TimeUnit unit) throws InterruptedException
  {
    return false;
  }

  public Object poll(long timeout, TimeUnit unit) throws InterruptedException
  {
    return null;
  }

  public Object take() throws InterruptedException
  {
    return null;
  }

  public void put(Object o) throws InterruptedException
  {
  }

  public int remainingCapacity()
  {
    return 0;
  }

  public int drainTo(Collection c)
  {
    return 0;
  }

  public int drainTo(Collection c, int maxElements)
  {
    return 0;
  }
}

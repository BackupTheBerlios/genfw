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


import java.util.concurrent.atomic.AtomicInteger;


public class ThreadFactoryImpl extends ThreadFactory_Base
{
  private static final AtomicInteger poolNumber = new AtomicInteger();

  private final AtomicInteger threadNumber = new AtomicInteger();

  private String prefix;

  private ThreadGroup group;

  public ThreadFactoryImpl()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    if (getNamePrefix() == null)
    {
      setNamePrefix(getContext().getId());
    }

    if (getPriority() == -1)
    {
      setPriority(Thread.NORM_PRIORITY);
    }

    prefix = createLabel(getNamePrefix(), poolNumber);
    group = new ThreadGroup(Thread.currentThread().getThreadGroup(), prefix);
  }

  public Thread newThread(Runnable runnable)
  {
    String name = createLabel(prefix, threadNumber);
    Thread thread = new Thread(group, runnable, name, getStackSize());

    if (thread.isDaemon() != isDaemon())
    {
      thread.setDaemon(isDaemon());
    }

    if (thread.getPriority() != getPriority())
    {
      thread.setPriority(getPriority());
    }

    return thread;
  }

  protected String createLabel(String prefix, AtomicInteger number)
  {
    int i = number.getAndIncrement();
    return prefix + (i == 0 ? "" : "-" + i);
  }
}

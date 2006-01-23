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
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class ThreadPoolExecutorImpl extends ThreadPoolExecutor_Base
{
  protected ThreadPoolExecutor data;

  public ThreadPoolExecutorImpl()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    Executors.newCachedThreadPool();

    if (getMaximumPoolSize() == -1)
    {
      setMaximumPoolSize(Integer.MAX_VALUE);
    }

    data = createData();
  }

  @Override
  protected void doDispose() throws Exception
  {
    super.doDispose();
  }

  public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException
  {
    return data.awaitTermination(timeout, unit);
  }

  public void execute(Runnable command)
  {
    data.execute(command);
  }

  public int getActiveCount()
  {
    return data.getActiveCount();
  }

  public long getCompletedTaskCount()
  {
    return data.getCompletedTaskCount();
  }

  public long getKeepAliveTime(TimeUnit unit)
  {
    return data.getKeepAliveTime(unit);
  }

  public int getLargestPoolSize()
  {
    return data.getLargestPoolSize();
  }

  public int getPoolSize()
  {
    return data.getPoolSize();
  }

  public RejectedExecutionHandler getRejectedExecutionHandler()
  {
    return data.getRejectedExecutionHandler();
  }

  public long getTaskCount()
  {
    return data.getTaskCount();
  }

  public <T> List<Future<T>> invokeAll(Collection<Callable<T>> arg0, long arg1, TimeUnit arg2)
          throws InterruptedException
  {
    return data.invokeAll(arg0, arg1, arg2);
  }

  public <T> List<Future<T>> invokeAll(Collection<Callable<T>> arg0) throws InterruptedException
  {
    return data.invokeAll(arg0);
  }

  public <T> T invokeAny(Collection<Callable<T>> arg0, long arg1, TimeUnit arg2)
          throws InterruptedException, ExecutionException, TimeoutException
  {
    return data.invokeAny(arg0, arg1, arg2);
  }

  public <T> T invokeAny(Collection<Callable<T>> arg0) throws InterruptedException,
          ExecutionException
  {
    return data.invokeAny(arg0);
  }

  public boolean isShutdown()
  {
    return data.isShutdown();
  }

  public boolean isTerminated()
  {
    return data.isTerminated();
  }

  public boolean isTerminating()
  {
    return data.isTerminating();
  }

  public int prestartAllCoreThreads()
  {
    return data.prestartAllCoreThreads();
  }

  public boolean prestartCoreThread()
  {
    return data.prestartCoreThread();
  }

  public void purge()
  {
    data.purge();
  }

  public boolean remove(Runnable task)
  {
    return data.remove(task);
  }

  public void setKeepAliveTime(long time, TimeUnit unit)
  {
    data.setKeepAliveTime(time, unit);
  }

  public void setRejectedExecutionHandler(RejectedExecutionHandler handler)
  {
    data.setRejectedExecutionHandler(handler);
  }

  public void setThreadFactory(ThreadFactory threadFactory)
  {
    data.setThreadFactory(threadFactory);
  }

  public void shutdown()
  {
    data.shutdown();
  }

  public List<Runnable> shutdownNow()
  {
    return data.shutdownNow();
  }

  public <T> Future<T> submit(Callable<T> task)
  {
    return data.submit(task);
  }

  public <T> Future<T> submit(Runnable task, T result)
  {
    return data.submit(task, result);
  }

  public Future<?> submit(Runnable task)
  {
    return data.submit(task);
  }

  protected ThreadPoolExecutor createData()
  {
    return new ThreadPoolExecutor(getCorePoolSize(), getMaximumPoolSize(), getKeepAliveTime(),
            TimeUnit.MILLISECONDS, getQueue(), getThreadFactory());
  }
}

package com.sympedia.density.util.concurrent.impl;


import com.sympedia.density.util.concurrent.IThreadPoolExecutor;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class ThreadPoolExecutor_Base
  extends com.sympedia.density.util.concurrent.impl.ExecutorServiceImpl
  implements IThreadPoolExecutor
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public ThreadPoolExecutor_Base()
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
   * The default value of the corePoolSize property.
   */
  public static final int DEFAULT_CorePoolSize = 0;

  /**
   * The cached value of the corePoolSize property.
   */
  private int corePoolSize = DEFAULT_CorePoolSize;

  /**
   * Returns the value of the corePoolSize property.
   * @return the value of the corePoolSize property.
   */
  public int getCorePoolSize()
  {
  	return corePoolSize;
  }

  /**
   * Sets the value of the corePoolSize property.
   * @parm corePoolSize the new value of the corePoolSize property.
   */
  public void setCorePoolSize(int corePoolSize)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting corePoolSize = " + corePoolSize);
    }

  	this.corePoolSize = corePoolSize;
  }

  /**
   * The default value of the maximumPoolSize property.
   */
  public static final int DEFAULT_MaximumPoolSize = -1;

  /**
   * The cached value of the maximumPoolSize property.
   */
  private int maximumPoolSize = DEFAULT_MaximumPoolSize;

  /**
   * Returns the value of the maximumPoolSize property.
   * @return the value of the maximumPoolSize property.
   */
  public int getMaximumPoolSize()
  {
  	return maximumPoolSize;
  }

  /**
   * Sets the value of the maximumPoolSize property.
   * @parm maximumPoolSize the new value of the maximumPoolSize property.
   */
  public void setMaximumPoolSize(int maximumPoolSize)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting maximumPoolSize = " + maximumPoolSize);
    }

  	this.maximumPoolSize = maximumPoolSize;
  }

  /**
   * The default value of the keepAliveTime property.
   */
  public static final long DEFAULT_KeepAliveTime = 0L;

  /**
   * The cached value of the keepAliveTime property.
   */
  private long keepAliveTime = DEFAULT_KeepAliveTime;

  /**
   * Returns the value of the keepAliveTime property.
   * @return the value of the keepAliveTime property.
   */
  public long getKeepAliveTime()
  {
  	return keepAliveTime;
  }

  /**
   * Sets the value of the keepAliveTime property.
   * @parm keepAliveTime the new value of the keepAliveTime property.
   */
  public void setKeepAliveTime(long keepAliveTime)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting keepAliveTime = " + keepAliveTime);
    }

  	this.keepAliveTime = keepAliveTime;
  }


  /**
   * The cached value of the queue dependency.
   */
  private com.sympedia.density.util.concurrent.IBlockingQueue queue;

  /**
   * Returns the value of the queue dependency.
   * @return the value of the queue dependency.
   */
  public com.sympedia.density.util.concurrent.IBlockingQueue getQueue()
  {
  	return queue;
  }

  /**
   * Sets the value of the queue dependency.
   * @parm queue the new value of the queue dependency.
   */
  public void setQueue(com.sympedia.density.util.concurrent.IBlockingQueue queue)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting queue = " + queue);
    }

  	this.queue = queue;
  }

  /**
   * The cached value of the threadFactory dependency.
   */
  private com.sympedia.density.util.concurrent.IThreadFactory threadFactory;

  /**
   * Returns the value of the threadFactory dependency.
   * @return the value of the threadFactory dependency.
   */
  public com.sympedia.density.util.concurrent.IThreadFactory getThreadFactory()
  {
  	return threadFactory;
  }

  /**
   * Sets the value of the threadFactory dependency.
   * @parm threadFactory the new value of the threadFactory dependency.
   */
  public void setThreadFactory(com.sympedia.density.util.concurrent.IThreadFactory threadFactory)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting threadFactory = " + threadFactory);
    }

  	this.threadFactory = threadFactory;
  }


  /////////////////////////////////////////////////////////////////////////////////////
  // Context interface
  /////////////////////////////////////////////////////////////////////////////////////

  public interface IContext extends com.sympedia.density.util.concurrent.impl.ExecutorService_Base.IContext
  {
  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Introspection
  /////////////////////////////////////////////////////////////////////////////////////

  @Override
  protected void doFillReferences(List<IComponent> references, int flags)
  {
    super.doFillReferences(references, flags);
    if (queue != null && (flags & IComponent.REFTYPE_NORMAL) != 0) references.add((IComponent)queue);
    if (threadFactory != null && (flags & IComponent.REFTYPE_NORMAL) != 0) references.add((IComponent)threadFactory);
  }
}

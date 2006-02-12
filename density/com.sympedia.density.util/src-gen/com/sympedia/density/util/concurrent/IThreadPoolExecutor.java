package com.sympedia.density.util.concurrent;


import com.sympedia.density.*;


public interface IThreadPoolExecutor extends com.sympedia.density.util.concurrent.IExecutorService
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Business methods
  /////////////////////////////////////////////////////////////////////////////////////

      /**   
       * Returns true if this executor is in the process of terminating  
       * after <tt>shutdown</tt> or <tt>shutdownNow</tt> but has not  
       * completely terminated.  This method may be useful for  
       * debugging. A return of <tt>true</tt> reported a sufficient  
       * period after shutdown may indicate that submitted tasks have  
       * ignored or suppressed interruption, causing this executor not  
       * to properly terminate.  
       * @return true if terminating but not yet terminated.  
       */  
      public boolean isTerminating();  
      
      /**  
       * Removes this task from the executor's internal queue if it is  
       * present, thus causing it not to be run if it has not already  
       * started.  
       *   
       * <p> This method may be useful as one part of a cancellation  
       * scheme.  It may fail to remove tasks that have been converted  
       * into other forms before being placed on the internal queue. For  
       * example, a task entered using <tt>submit</tt> might be  
       * converted into a form that maintains <tt>Future</tt> status.  
       * However, in such cases, method {@link ThreadPoolExecutor#purge}  
       * may be used to remove those Futures that have been cancelled.  
       *   
       *  
       * @param task the task to remove  
       * @return true if the task was removed  
       */  
      public boolean remove(Runnable task);  
      
      /**  
       * Tries to remove from the work queue all {@link Future}  
       * tasks that have been cancelled. This method can be useful as a  
       * storage reclamation operation, that has no other impact on  
       * functionality. Cancelled tasks are never executed, but may  
       * accumulate in work queues until worker threads can actively  
       * remove them. Invoking this method instead tries to remove them now.  
       * However, this method may fail to remove tasks in  
       * the presence of interference by other threads.  
       */  
      public void purge();  
      
      /**  
       * Starts a core thread, causing it to idly wait for work. This  
       * overrides the default policy of starting core threads only when  
       * new tasks are executed. This method will return <tt>false</tt>  
       * if all core threads have already been started.  
       * @return true if a thread was started  
       */  
      public boolean prestartCoreThread();  
      
      /**  
       * Starts all core threads, causing them to idly wait for work. This  
       * overrides the default policy of starting core threads only when  
       * new tasks are executed.   
       * @return the number of threads started.  
       */  
      public int prestartAllCoreThreads();  
      
      /**  
       * Sets the time limit for which threads may remain idle before  
       * being terminated.  If there are more than the core number of  
       * threads currently in the pool, after waiting this amount of  
       * time without processing a task, excess threads will be  
       * terminated.  This overrides any value set in the constructor.  
       * @param time the time to wait.  A time value of zero will cause  
       * excess threads to terminate immediately after executing tasks.  
       * @param unit  the time unit of the time argument  
       * @throws IllegalArgumentException if time less than zero  
       * @see #getKeepAliveTime  
       */  
      public void setKeepAliveTime(long time, java.util.concurrent.TimeUnit unit);  
      
      /**  
       * Returns the thread keep-alive time, which is the amount of time  
       * which threads in excess of the core pool size may remain  
       * idle before being terminated.  
       *  
       * @param unit the desired time unit of the result  
       * @return the time limit  
       * @see #setKeepAliveTime  
       */  
      public long getKeepAliveTime(java.util.concurrent.TimeUnit unit);  
      
      /**  
       * Returns the approximate number of threads that are actively  
       * executing tasks.  
       *  
       * @return the number of threads  
       */  
      public int getActiveCount();  
      
      /**  
       * Returns the approximate total number of tasks that have been  
       * scheduled for execution. Because the states of tasks and  
       * threads may change dynamically during computation, the returned  
       * value is only an approximation, but one that does not ever  
       * decrease across successive calls.  
       *  
       * @return the number of tasks  
       */  
      public long getTaskCount();  
  /////////////////////////////////////////////////////////////////////////////////////
  // Attribute access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the corePoolSize property.
   * @return the value of the corePoolSize property.
   */
  public int getCorePoolSize();

  /**
   * Sets the value of the corePoolSize property.
   * @parm corePoolSize the new value of the corePoolSize property.
   */
  public void setCorePoolSize(int corePoolSize);

  /**
   * Returns the value of the maximumPoolSize property.
   * @return the value of the maximumPoolSize property.
   */
  public int getMaximumPoolSize();

  /**
   * Sets the value of the maximumPoolSize property.
   * @parm maximumPoolSize the new value of the maximumPoolSize property.
   */
  public void setMaximumPoolSize(int maximumPoolSize);

  /**
   * Returns the value of the keepAliveTime property.
   * @return the value of the keepAliveTime property.
   */
  public long getKeepAliveTime();

  /**
   * Sets the value of the keepAliveTime property.
   * @parm keepAliveTime the new value of the keepAliveTime property.
   */
  public void setKeepAliveTime(long keepAliveTime);

  /////////////////////////////////////////////////////////////////////////////////////
  // Reference access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the queue dependency.
   * @return the value of the queue dependency.
   */
  public com.sympedia.density.util.concurrent.IBlockingQueue getQueue();

  /**
   * Sets the value of the queue dependency.
   * @parm queue the new value of the queue dependency.
   */
  public void setQueue(com.sympedia.density.util.concurrent.IBlockingQueue queue);

  /////////////////////////////////////////////////////////////////////////////////////
  // Reference access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the threadFactory dependency.
   * @return the value of the threadFactory dependency.
   */
  public com.sympedia.density.util.concurrent.IThreadFactory getThreadFactory();

  /**
   * Sets the value of the threadFactory dependency.
   * @parm threadFactory the new value of the threadFactory dependency.
   */
  public void setThreadFactory(com.sympedia.density.util.concurrent.IThreadFactory threadFactory);

}

package com.sympedia.density.util.concurrent.impl;


import com.sympedia.density.util.concurrent.IArrayBlockingQueue;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class ArrayBlockingQueue_Base
  extends com.sympedia.density.util.concurrent.impl.BlockingQueueImpl
  implements IArrayBlockingQueue
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public ArrayBlockingQueue_Base()
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
  public static final int DEFAULT_Capacity = 0;

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

  /**
   * The default value of the fair property.
   */
  public static final boolean DEFAULT_Fair = false;

  /**
   * The cached value of the fair property.
   */
  private boolean fair = DEFAULT_Fair;

  /**
   * Returns the value of the fair property.
   * @return the value of the fair property.
   */
  public boolean isFair()
  {
  	return fair;
  }

  /**
   * Sets the value of the fair property.
   * @parm fair the new value of the fair property.
   */
  public void setFair(boolean fair)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting fair = " + fair);
    }

  	this.fair = fair;
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

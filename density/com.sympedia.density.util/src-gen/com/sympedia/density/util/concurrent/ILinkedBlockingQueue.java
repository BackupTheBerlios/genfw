package com.sympedia.density.util.concurrent;


import com.sympedia.density.*;


public interface ILinkedBlockingQueue extends com.sympedia.density.util.concurrent.IBlockingQueue
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Attribute access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the capacity property.
   * @return the value of the capacity property.
   */
  public int getCapacity();

  /**
   * Sets the value of the capacity property.
   * @parm capacity the new value of the capacity property.
   */
  public void setCapacity(int capacity);

}

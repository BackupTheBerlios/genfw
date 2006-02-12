package com.sympedia.density.util.concurrent;


import com.sympedia.density.*;

public interface IArrayBlockingQueue extends com.sympedia.density.util.concurrent.IBlockingQueue
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

  /**
   * Returns the value of the fair property.
   * @return the value of the fair property.
   */
  public boolean isFair();

  /**
   * Sets the value of the fair property.
   * @parm fair the new value of the fair property.
   */
  public void setFair(boolean fair);

}

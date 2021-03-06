package com.sympedia.density.util;


import com.sympedia.density.*;

public interface IPriorityQueue extends com.sympedia.density.util.IQueue
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Attribute access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the initialCapacity property.
   * @return the value of the initialCapacity property.
   */
  public int getInitialCapacity();

  /**
   * Sets the value of the initialCapacity property.
   * @parm initialCapacity the new value of the initialCapacity property.
   */
  public void setInitialCapacity(int initialCapacity);

  /**
   * Returns the value of the comparator property.
   * @return the value of the comparator property.
   */
  public java.util.Comparator getComparator();

  /**
   * Sets the value of the comparator property.
   * @parm comparator the new value of the comparator property.
   */
  public void setComparator(java.util.Comparator comparator);

}

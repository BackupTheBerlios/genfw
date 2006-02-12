package com.sympedia.density.util;


import com.sympedia.density.*;

/* Hello World */
public interface IArrayList extends com.sympedia.density.util.IList
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

}

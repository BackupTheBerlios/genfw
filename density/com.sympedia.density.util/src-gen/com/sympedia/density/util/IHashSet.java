package com.sympedia.density.util;


import com.sympedia.density.*;

/* Hello World */
public interface IHashSet extends com.sympedia.density.util.ISet
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
   * Returns the value of the loadFactor property.
   * @return the value of the loadFactor property.
   */
  public float getLoadFactor();

  /**
   * Sets the value of the loadFactor property.
   * @parm loadFactor the new value of the loadFactor property.
   */
  public void setLoadFactor(float loadFactor);

}

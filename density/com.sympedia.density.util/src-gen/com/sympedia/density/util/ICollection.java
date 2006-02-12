package com.sympedia.density.util;


import com.sympedia.density.*;


public interface ICollection extends IComponent, java.util.Collection
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Attribute access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the containment property.
   * @return the value of the containment property.
   */
  public boolean isContainment();

  /**
   * Sets the value of the containment property.
   * @parm containment the new value of the containment property.
   */
  public void setContainment(boolean containment);

}

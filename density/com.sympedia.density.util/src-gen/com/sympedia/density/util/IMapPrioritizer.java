package com.sympedia.density.util;


import com.sympedia.density.*;

/* Hello World */
public interface IMapPrioritizer extends IComponent
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Reference access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the highPriority dependency.
   * @return the value of the highPriority dependency.
   */
  public com.sympedia.density.util.IMap getHighPriority();

  /**
   * Sets the value of the highPriority dependency.
   * @parm highPriority the new value of the highPriority dependency.
   */
  public void setHighPriority(com.sympedia.density.util.IMap highPriority);

  /////////////////////////////////////////////////////////////////////////////////////
  // Reference access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the lowPriority dependency.
   * @return the value of the lowPriority dependency.
   */
  public com.sympedia.density.util.IMap getLowPriority();

  /**
   * Sets the value of the lowPriority dependency.
   * @parm lowPriority the new value of the lowPriority dependency.
   */
  public void setLowPriority(com.sympedia.density.util.IMap lowPriority);

  /////////////////////////////////////////////////////////////////////////////////////
  // Reference access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the result dependency.
   * @return the value of the result dependency.
   */
  public com.sympedia.density.util.IMap getResult();

  /**
   * Sets the value of the result dependency.
   * @parm result the new value of the result dependency.
   */
  public void setResult(com.sympedia.density.util.IMap result);

}

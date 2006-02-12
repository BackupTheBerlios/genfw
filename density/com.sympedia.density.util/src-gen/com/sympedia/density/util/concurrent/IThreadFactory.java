package com.sympedia.density.util.concurrent;


import com.sympedia.density.*;

public interface IThreadFactory extends IComponent, java.util.concurrent.ThreadFactory
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Attribute access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the namePrefix property.
   * @return the value of the namePrefix property.
   */
  public java.lang.String getNamePrefix();

  /**
   * Sets the value of the namePrefix property.
   * @parm namePrefix the new value of the namePrefix property.
   */
  public void setNamePrefix(java.lang.String namePrefix);

  /**
   * Returns the value of the daemon property.
   * @return the value of the daemon property.
   */
  public boolean isDaemon();

  /**
   * Sets the value of the daemon property.
   * @parm daemon the new value of the daemon property.
   */
  public void setDaemon(boolean daemon);

  /**
   * Returns the value of the priority property.
   * @return the value of the priority property.
   */
  public int getPriority();

  /**
   * Sets the value of the priority property.
   * @parm priority the new value of the priority property.
   */
  public void setPriority(int priority);

  /**
   * Returns the value of the stackSize property.
   * @return the value of the stackSize property.
   */
  public long getStackSize();

  /**
   * Sets the value of the stackSize property.
   * @parm stackSize the new value of the stackSize property.
   */
  public void setStackSize(long stackSize);

}

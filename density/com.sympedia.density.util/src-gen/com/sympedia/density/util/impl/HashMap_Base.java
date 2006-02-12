package com.sympedia.density.util.impl;


import com.sympedia.density.util.IHashMap;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class HashMap_Base
  extends com.sympedia.density.util.impl.MapImpl
  implements IHashMap
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public HashMap_Base()
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
   * The default value of the initialCapacity property.
   */
  public static final int DEFAULT_InitialCapacity = 11;

  /**
   * The cached value of the initialCapacity property.
   */
  private int initialCapacity = DEFAULT_InitialCapacity;

  /**
   * Returns the value of the initialCapacity property.
   * @return the value of the initialCapacity property.
   */
  public int getInitialCapacity()
  {
  	return initialCapacity;
  }

  /**
   * Sets the value of the initialCapacity property.
   * @parm initialCapacity the new value of the initialCapacity property.
   */
  public void setInitialCapacity(int initialCapacity)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting initialCapacity = " + initialCapacity);
    }

  	this.initialCapacity = initialCapacity;
  }

  /**
   * The default value of the loadFactor property.
   */
  public static final float DEFAULT_LoadFactor = 0.75F;

  /**
   * The cached value of the loadFactor property.
   */
  private float loadFactor = DEFAULT_LoadFactor;

  /**
   * Returns the value of the loadFactor property.
   * @return the value of the loadFactor property.
   */
  public float getLoadFactor()
  {
  	return loadFactor;
  }

  /**
   * Sets the value of the loadFactor property.
   * @parm loadFactor the new value of the loadFactor property.
   */
  public void setLoadFactor(float loadFactor)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting loadFactor = " + loadFactor);
    }

  	this.loadFactor = loadFactor;
  }



  /////////////////////////////////////////////////////////////////////////////////////
  // Context interface
  /////////////////////////////////////////////////////////////////////////////////////

  public interface IContext extends com.sympedia.density.util.impl.Map_Base.IContext
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

/***************************************************************************
 * Copyright (c) 2006 Eike Stepper, Fuggerstr. 39, 10777 Berlin, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/
package com.sympedia.density.util.concurrent.impl;


import com.sympedia.density.util.concurrent.IThreadFactory;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class ThreadFactory_Base
  extends Component_Base
  implements IThreadFactory
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public ThreadFactory_Base()
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
   * The cached value of the namePrefix property.
   */
  private java.lang.String namePrefix;

  /**
   * Returns the value of the namePrefix property.
   * @return the value of the namePrefix property.
   */
  public java.lang.String getNamePrefix()
  {
  	return namePrefix;
  }

  /**
   * Sets the value of the namePrefix property.
   * @parm namePrefix the new value of the namePrefix property.
   */
  public void setNamePrefix(java.lang.String namePrefix)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting namePrefix = " + namePrefix);
    }

  	this.namePrefix = namePrefix;
  }

  /**
   * The default value of the daemon property.
   */
  public static final boolean DEFAULT_Daemon = false;

  /**
   * The cached value of the daemon property.
   */
  private boolean daemon = DEFAULT_Daemon;

  /**
   * Returns the value of the daemon property.
   * @return the value of the daemon property.
   */
  public boolean isDaemon()
  {
  	return daemon;
  }

  /**
   * Sets the value of the daemon property.
   * @parm daemon the new value of the daemon property.
   */
  public void setDaemon(boolean daemon)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting daemon = " + daemon);
    }

  	this.daemon = daemon;
  }

  /**
   * The default value of the priority property.
   */
  public static final int DEFAULT_Priority = -1;

  /**
   * The cached value of the priority property.
   */
  private int priority = DEFAULT_Priority;

  /**
   * Returns the value of the priority property.
   * @return the value of the priority property.
   */
  public int getPriority()
  {
  	return priority;
  }

  /**
   * Sets the value of the priority property.
   * @parm priority the new value of the priority property.
   */
  public void setPriority(int priority)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting priority = " + priority);
    }

  	this.priority = priority;
  }

  /**
   * The default value of the stackSize property.
   */
  public static final long DEFAULT_StackSize = 0L;

  /**
   * The cached value of the stackSize property.
   */
  private long stackSize = DEFAULT_StackSize;

  /**
   * Returns the value of the stackSize property.
   * @return the value of the stackSize property.
   */
  public long getStackSize()
  {
  	return stackSize;
  }

  /**
   * Sets the value of the stackSize property.
   * @parm stackSize the new value of the stackSize property.
   */
  public void setStackSize(long stackSize)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting stackSize = " + stackSize);
    }

  	this.stackSize = stackSize;
  }



  /////////////////////////////////////////////////////////////////////////////////////
  // Context interface
  /////////////////////////////////////////////////////////////////////////////////////

  public interface IContext extends com.sympedia.density.IContext
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

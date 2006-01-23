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
package com.sympedia.density.impl;


import com.sympedia.density.IComponent;
import com.sympedia.density.IContainer;
import com.sympedia.density.IContext;

import org.apache.log4j.Logger;


public abstract class Context_Base implements IContext
{
  private IContainer container;

  private String id;

  private boolean initialized;

  private Logger logger;

  public Context_Base(IContainer container, String id, boolean initialized)
  {
    this.container = container;
    this.id = id;
    this.initialized = initialized;
  }

  public void initialize() throws Exception
  {
  }

  public void dispose() throws Exception
  {
  }

  @Override
  public String toString()
  {
    return getFullId();
  }

  public IContainer getContainer()
  {
    return container;
  }

  public String getId()
  {
    return id;
  }

  public boolean isInitialized()
  {
    return initialized;
  }

  public String getFullId()
  {
    return getContainer().getName() + "." + id;
  }

  public Logger getLogger()
  {
    if (logger == null)
    {
      logger = Logger.getLogger(getFullId());
    }

    return logger;
  }

  public void notifyComponentInitialized(IComponent instance) throws Exception
  {
    ((Container_Base)container).fireInstanceInitialized(this, instance);
  }

  public void notifyComponentDisposed(IComponent instance) throws Exception
  {
    ((Container_Base)container).fireInstanceDisposed(this, instance);
  }
}

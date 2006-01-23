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

import com.sympedia.util.BeanHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


public abstract class SingletonContext_Base extends Context_Base
{
  private IComponent instance;

  private boolean lazy;

  public SingletonContext_Base(IContainer container, String id, boolean initialized, boolean lazy)
  {
    super(container, id, initialized);
    this.lazy = lazy;
  }

  @Override
  public void dispose() throws Exception
  {
    super.dispose();
    BeanHelper.dispose(instance);
  }

  public boolean isLazy()
  {
    return lazy;
  }

  public synchronized IComponent getInstance(List<IComponent> toBeInitialized)
  {
    if (instance == null)
    {
      instance = createInstance();
      populateInstance(instance, toBeInitialized);
      toBeInitialized.add(instance);
    }

    return instance;
  }

  public Set<IComponent> getInstances()
  {
    List<IComponent> toBeInitialized = new ArrayList<IComponent>();
    IComponent instance = getInstance(toBeInitialized);
    for (IComponent init : toBeInitialized)
    {
      try
      {
        BeanHelper.initialize(init);
      }
      catch (Exception ex)
      {
        getLogger().error("Problem while initializing " + init, ex);
      }
    }

    return Collections.singleton(instance);
  }

  public boolean isSingleton()
  {
    return true;
  }
}

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

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public abstract class PrototypeContext_Base extends Context_Base
{
  private Set<IComponent> instances = new HashSet<IComponent>();

  public PrototypeContext_Base(IContainer container, String id, boolean initialized)
  {
    super(container, id, initialized);
  }

  @Override
  public void dispose() throws Exception
  {
    super.dispose();
    Object[] array = instances.toArray(new Object[instances.size()]);
    for (int i = 0; i < array.length; i++)
    {
      Object instance = array[i];
      BeanHelper.dispose(instance);
    }
  }

  public IComponent getInstance(List<IComponent> toBeInitialized)
  {
    IComponent instance = createInstance();
    addInstance(instance);
    populateInstance(instance, toBeInitialized);
    toBeInitialized.add(instance);
    return instance;
  }

  public void addInstance(IComponent instance)
  {
    instances.add(instance);
  }

  public Set<IComponent> getInstances()
  {
    return instances;
  }

  public boolean isSingleton()
  {
    return false;
  }

  public boolean isLazy()
  {
    return true;
  }

  @Override
  public void notifyComponentDisposed(IComponent instance) throws Exception
  {
    instances.remove(instance);
    super.notifyComponentDisposed(instance);
  }
}

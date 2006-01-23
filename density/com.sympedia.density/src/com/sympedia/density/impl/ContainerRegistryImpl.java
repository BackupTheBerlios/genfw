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


import com.sympedia.density.IContainer;
import com.sympedia.density.IContainerRegistry;
import com.sympedia.density.IContainerRegistryListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class ContainerRegistryImpl implements IContainerRegistry
{
  public static final ContainerRegistryImpl IMPL = new ContainerRegistryImpl();

  private Map<String, IContainer> registry = new HashMap<String, IContainer>();

  private List<IContainerRegistryListener> listeners = new ArrayList<IContainerRegistryListener>();

  public ContainerRegistryImpl()
  {
  }

  public Collection<IContainer> getContainers()
  {
    return registry.values();
  }

  public Set<String> getContainerNames()
  {
    return registry.keySet();
  }

  public IContainer getContainer(String name)
  {
    return registry.get(name);
  }

  public void addContainerRegistryListener(IContainerRegistryListener listener)
  {
    listeners.add(listener);
  }

  public void removeContainerRegistryListener(IContainerRegistryListener listener)
  {
    listeners.remove(listener);
  }

  public void registerContainer(IContainer container)
  {
    IContainer old = registry.put(container.getName(), container);
    if (old != null)
    {
      fireContainerDeregistered(old);
    }

    fireContainerRegistered(container);
  }

  public void deregisterContainer(IContainer container)
  {
    if (registry.remove(container.getName()) != null)
    {
      fireContainerDeregistered(container);
    }
  }

  protected void fireContainerDeregistered(IContainer container)
  {
    for (IContainerRegistryListener listener : listeners)
    {
      listener.notifyContainerDeregistered(this, container);
    }
  }

  protected void fireContainerRegistered(IContainer container)
  {
    for (IContainerRegistryListener listener : listeners)
    {
      listener.notifyContainerRegistered(this, container);
    }
  }
}

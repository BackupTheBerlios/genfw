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
package com.sympedia.density;


import java.util.Collection;
import java.util.Set;


public interface IContainerRegistry
{
  public static final IContainerRegistry INSTANCE = com.sympedia.density.impl.ContainerRegistryImpl.IMPL;

  public Collection<IContainer> getContainers();

  public Set<String> getContainerNames();

  public IContainer getContainer(String name);

  public void addContainerRegistryListener(IContainerRegistryListener listener);

  public void removeContainerRegistryListener(IContainerRegistryListener listener);
}

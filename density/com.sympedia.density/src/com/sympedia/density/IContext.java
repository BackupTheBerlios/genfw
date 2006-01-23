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


import com.sympedia.util.IDisposable;
import com.sympedia.util.IInitializable;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.Set;


public interface IContext extends IInitializable, IDisposable
{
  public String getId();

  public String getFullId();

  public IContainer getContainer();

  public boolean isSingleton();

  public boolean isLazy();

  public boolean isInitialized();

  public IComponent createInstance();

  public void populateInstance(IComponent instance, List<IComponent> toBeInitialized);

  public IComponent getInstance(List<IComponent> toBeInitialized);

  public Set<IComponent> getInstances();

  public Logger getLogger();

  public void notifyComponentInitialized(IComponent instance) throws Exception;

  public void notifyComponentDisposed(IComponent instance) throws Exception;
}

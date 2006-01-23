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
import com.sympedia.density.IContextListener;

import com.sympedia.util.BeanHelper;
import com.sympedia.util.IDisposable;
import com.sympedia.util.IInitializable;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public abstract class Container_Base implements IContainer, IInitializable, IDisposable
{
  private Logger logger;

  private String name;

  private String packageName;

  private boolean incomplete;

  private List<IContext> contexts;

  private List<IContextListener> listeners = new ArrayList<IContextListener>();

  private Exception constructionException;

  public Container_Base(String name, String packageName, boolean incomplete)
  {
    this.name = name;
    this.packageName = packageName;
    this.incomplete = incomplete;

    long start = System.currentTimeMillis();
    if (getLogger().isDebugEnabled())
    {
      getLogger().debug("Initializing " + this);
    }

    try
    {
      contexts = createContexts();
      instantiateSingletons();
      ContainerRegistryImpl.IMPL.registerContainer(this);

      if (getLogger().isDebugEnabled())
      {
        long duration = System.currentTimeMillis() - start;
        getLogger().debug("Finished initializing " + this + " (" + duration + " millis)");
        getLogger().debug("===============================================================");
        getLogger().debug("");
      }
    }
    catch (Exception ex)
    {
      getLogger().error("Problem while initializing " + this, ex);
      constructionException = ex;
    }
  }

  public void initialize() throws Exception
  {
    if (constructionException != null)
    {
      try
      {
        throw constructionException;
      }
      finally
      {
        constructionException = null;
      }
    }
  }

  public void dispose() throws Exception
  {
    if (getLogger().isDebugEnabled())
    {
      getLogger().debug("");
      getLogger().debug("===============================================================");
      getLogger().debug("Disposing " + this);
    }

    ContainerRegistryImpl.IMPL.deregisterContainer(this);
    for (IContext context : contexts)
    {
      BeanHelper.dispose(context);
    }
  }

  public List<IContext> getContexts()
  {
    return contexts;
  }

  public List<IComponent> getAllInstances()
  {
    List<IComponent> result = new ArrayList<IComponent>();
    for (IContext context : getContexts())
    {
      Set<IComponent> instances = context.getInstances();
      result.addAll(instances);
    }

    return result;
  }

  public String getName()
  {
    return name;
  }

  public String getPackageName()
  {
    return packageName;
  }

  public boolean isIncomplete()
  {
    return incomplete;
  }

  @Override
  public String toString()
  {
    return getName();
  }

  protected Logger getLogger()
  {
    if (logger == null)
    {
      logger = Logger.getLogger(name != null ? name : getClass().getName());
    }

    return logger;
  }

  protected void instantiateSingletons()
  {
    List<IComponent> toBeInitialized = new ArrayList<IComponent>();
    for (IContext context : contexts)
    {
      if (!context.isLazy())
      {
        context.getInstance(toBeInitialized);
      }
    }

    initializeInstances(toBeInitialized);
  }

  protected void initializeInstances(List<IComponent> instances)
  {
    for (IComponent instance : instances)
    {
      try
      {
        BeanHelper.initialize(instance);
      }
      catch (Exception ex)
      {
        getLogger().error("Problem while initializing " + instance, ex);
        if (constructionException == null)
        {
          constructionException = ex;
        }
      }
    }
  }

  public void addContextListener(IContextListener listener)
  {
    listeners.add(listener);
  }

  public void removeContextListener(IContextListener listener)
  {
    listeners.remove(listener);
  }

  public void fireInstanceInitialized(IContext context, IComponent instance)
  {
    for (IContextListener listener : listeners)
    {
      listener.notifyInstanceInitialized(context, instance);
    }
  }

  public void fireInstanceDisposed(IContext context, IComponent instance)
  {
    for (IContextListener listener : listeners)
    {
      listener.notifyInstanceDisposed(context, instance);
    }
  }

  protected abstract List<IContext> createContexts();
}

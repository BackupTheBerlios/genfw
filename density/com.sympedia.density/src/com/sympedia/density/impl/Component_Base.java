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
import com.sympedia.density.IContext;
import com.sympedia.density.IContextAware;
import com.sympedia.density.IEvent;
import com.sympedia.density.IEventListener;

import com.sympedia.util.BeanHelper;
import com.sympedia.util.IDisposable;
import com.sympedia.util.IInitializable;
import com.sympedia.util.StringHelper;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;


public class Component_Base implements IComponent, IInitializable, IDisposable, IContextAware
{
  private IContext context;

  private boolean initialized;

  private boolean disposed;

  private List<IEventListener> eventListeners = new ArrayList<IEventListener>();

  public Component_Base()
  {
  }

  public final void initialize() throws Exception
  {
    if (getLogger().isDebugEnabled())
    {
      getLogger().debug("Initializing");
    }

    try
    {
      doInitialize();
    }
    catch (Exception ex)
    {
      getLogger().error("Problem while initializing", ex);
      throw ex;
    }

    initialized = true;
    context.notifyComponentInitialized(this);

    if (getLogger().isDebugEnabled())
    {
      getLogger().debug("Initialized");
      dumpState();
    }
  }

  public final void dispose() throws Exception
  {
    disposed = true;
    if (getLogger().isDebugEnabled())
    {
      getLogger().debug("Disposing");
    }

    try
    {
      doDispose();
    }
    catch (Exception ex)
    {
      getLogger().warn("Problem while disposing", ex);
    }

    context.notifyComponentDisposed(this);
  }

  public IContext getContext()
  {
    return context;
  }

  public void setContext(IContext context)
  {
    this.context = context;
    if (getLogger().isDebugEnabled())
    {
      getLogger().debug("Creating");
    }
  }

  public boolean isInitialized()
  {
    return initialized;
  }

  public boolean isDisposed()
  {
    return disposed;
  }

  public void addEventListener(IEventListener listener)
  {
    eventListeners.add(listener);
  }

  public void removeEventListener(IEventListener listener)
  {
    eventListeners.add(listener);
  }

  public final void notifyEvent(IEvent event)
  {
    if (initialized && !disposed)
    {
      dispatchEvent(event);
    }
  }

  public List<IComponent> getAllReferences(int flags)
  {
    List<IComponent> result = new ArrayList<IComponent>();
    if ((flags & REFTYPE_EVENT) != 0)
    {
      for (IEventListener listener : eventListeners)
      {
        if (listener instanceof IComponent)
        {
          result.add((IComponent)listener);
        }
      }
    }

    doFillReferences(result, flags);
    return result;
  }

  @Override
  public String toString()
  {
    return context == null ? super.toString() : context.getFullId();
  }

  protected void dispatchEvent(IEvent event)
  {
  }

  protected void fireEvent(IEvent event)
  {
    if (getLogger().isDebugEnabled())
    {
      getLogger().debug("Firing " + event);
    }

    IEventListener[] listeners = eventListeners.toArray(new IEventListener[eventListeners.size()]);
    for (int i = 0; i < listeners.length; i++)
    {
      IEventListener listener = listeners[i];

      try
      {
        listener.notifyEvent(event);
      }
      catch (Exception ex)
      {
        getLogger().warn("Problem while notifying " + listener + ", event = " + event, ex);
      }
    }
  }

  protected void doInitialize() throws Exception
  {
  }

  protected void doDispose() throws Exception
  {
  }

  protected void doFillReferences(List<IComponent> references, int flags)
  {
  }

  public void dumpState()
  {
    Logger logger = getLogger();
    if (logger.isDebugEnabled())
    {
      List<Field> fields = BeanHelper.getAllDeclaredFields(getClass());
      for (Field field : fields)
      {
        if ((field.getModifiers() & Modifier.STATIC) != 0) continue;
        if ((field.getModifiers() & Modifier.TRANSIENT) != 0) continue;
        if ((field.getModifiers() & Modifier.VOLATILE) != 0) continue;
        boolean old = field.isAccessible();
        if (!old) field.setAccessible(true);

        try
        {
          Object value = field.get(this);
          String name = field.getName();
          logger.debug("---> " + name + " = " + value);
        }
        catch (Exception ex)
        {
          logger.debug("Problem while dumping state: " + this, ex);
        }
        finally
        {
          if (!old) field.setAccessible(false);
        }
      }
    }
  }

  protected Logger getLogger()
  {
    if (context != null)
    {
      return context.getLogger();
    }

    return Logger.getLogger(Component_Base.class);
  }

  protected static boolean equals(Object obj1, Object obj2)
  {
    return StringHelper.equals(obj1, obj2);
  }
}

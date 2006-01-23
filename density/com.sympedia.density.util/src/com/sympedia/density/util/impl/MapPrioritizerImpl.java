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
package com.sympedia.density.util.impl;


import com.sympedia.density.util.IMap;

import java.util.Iterator;
import java.util.Map;


public class MapPrioritizerImpl extends MapPrioritizer_Base
{
  public MapPrioritizerImpl()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    for (Iterator it = getHighPriority().entrySet().iterator(); it.hasNext();)
    {
      Map.Entry entry = (Map.Entry)it.next();
      getResult().put(entry.getKey(), entry.getValue());
    }

    for (Iterator it = getLowPriority().entrySet().iterator(); it.hasNext();)
    {
      Map.Entry entry = (Map.Entry)it.next();
      if (!getResult().containsKey(entry.getKey()))
      {
        getResult().put(entry.getKey(), entry.getValue());
      }
    }
  }

  @Override
  public void notifyMapEntryAdded(IMap notifier, Object key, Object value)
  {
    if (notifier == getHighPriority())
    {
      getResult().put(key, value);
    }
    else if (notifier == getLowPriority())
    {
      if (!getResult().containsKey(key))
      {
        getResult().put(key, value);
      }
    }
  }

  @Override
  public void notifyMapEntryReadded(IMap notifier, Object key, Object value, Object oldKey)
  {
    if (notifier == getHighPriority())
    {
      if (getLowPriority().containsKey(key))
      {
        getResult().remove(key);
        Object high = getHighPriority().get(key);
        getResult().put(key, high);
      }
      else
      {
        getResult().replaceKey(oldKey, key);
        Object low = getLowPriority().get(oldKey);
        if (low != null)
        {
          getResult().put(oldKey, low);
        }
      }
    }
    else if (notifier == getLowPriority())
    {
      if (!getHighPriority().containsKey(key))
      {
        getResult().replaceKey(oldKey, key);
      }
    }
  }

  @Override
  public void notifyMapEntryRemoved(IMap notifier, Object key, Object value)
  {
    if (notifier == getHighPriority())
    {
      getResult().remove(key);
      Object low = getLowPriority().get(key);
      if (low != null)
      {
        getResult().put(key, low);
      }
    }
    else if (notifier == getLowPriority())
    {
      if (!getHighPriority().containsKey(key))
      {
        getResult().remove(key);
      }
    }
  }
}

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

import java.util.Collection;
import java.util.Iterator;


public class MapKeysAdapterImpl extends MapKeysAdapter_Base
{
  public MapKeysAdapterImpl()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    getMap().addEventListener(this);
  }

  @Override
  protected void doDispose() throws Exception
  {
    getMap().removeEventListener(this);
    super.doDispose();
  }

  @Override
  public void notifyMapEntryAdded(IMap notifier, Object key, Object value)
  {
    fireElementAdded(key);
  }

  @Override
  public void notifyMapEntryReadded(IMap notifier, Object key, Object value, Object oldKey)
  {
    fireElementRemoved(oldKey);
    fireElementAdded(key);
  }

  @Override
  public void notifyMapEntryRemoved(IMap notifier, Object key, Object value)
  {
    fireElementRemoved(key);
  }

  @Override
  protected Collection createData()
  {
    return getMap().keySet();
  }

  public int size()
  {
    return data.size();
  }

  public boolean isEmpty()
  {
    return data.isEmpty();
  }

  public boolean contains(Object o)
  {
    return data.contains(o);
  }

  public Iterator iterator()
  {
    return data.iterator();
  }

  public Object[] toArray()
  {
    return data.toArray();
  }

  public Object[] toArray(Object[] a)
  {
    return data.toArray(new Object[data.size()]);
  }

  public boolean add(Object o)
  {
    throw new UnsupportedOperationException();
  }

  public boolean remove(Object o)
  {
    throw new UnsupportedOperationException();
  }

  public boolean containsAll(Collection c)
  {
    return data.containsAll(c);
  }

  public boolean addAll(Collection c)
  {
    throw new UnsupportedOperationException();
  }

  public boolean removeAll(Collection c)
  {
    throw new UnsupportedOperationException();
  }

  public boolean retainAll(Collection c)
  {
    throw new UnsupportedOperationException();
  }

  public void clear()
  {
    throw new UnsupportedOperationException();
  }
}

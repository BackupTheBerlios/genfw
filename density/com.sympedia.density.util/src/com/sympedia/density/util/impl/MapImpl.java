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


import com.sympedia.density.IComponent;

import com.sympedia.util.Assert;
import com.sympedia.util.BeanHelper;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public abstract class MapImpl extends Map_Base
{
  protected Map data;

  public MapImpl()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    data = createData();
    Assert.notNull(data);
  }

  @Override
  protected void doDispose() throws Exception
  {
    if (isContainment())
    {
      for (Iterator it = data.values().iterator(); it.hasNext();)
      {
        Object element = it.next();
        disposeChild(element);
      }
    }

    data.clear();
    super.doDispose();
  }

  @Override
  protected void doFillReferences(List<IComponent> references, int flags)
  {
    super.doFillReferences(references, flags);
    if ((isContainment() && (flags & REFTYPE_CONTAINMENT) != 0)
            || (!isContainment() && (flags & REFTYPE_NORMAL) != 0))
    {
      for (Iterator it = data.values().iterator(); it.hasNext();)
      {
        Object reference = it.next();
        if (reference instanceof IComponent)
        {
          references.add((IComponent)reference);
        }
      }
    }
  }

  public void clear()
  {
    Map old = new HashMap(data);
    data.clear();

    for (Iterator it = old.entrySet().iterator(); it.hasNext();)
    {
      Map.Entry entry = (Map.Entry)it.next();
      fireEntryRemoved(entry.getKey(), entry.getValue());
      if (isContainment())
      {
        disposeChild(entry.getValue());
      }
    }
  }

  public boolean containsKey(Object arg0)
  {
    return data.containsKey(arg0);
  }

  public boolean containsValue(Object arg0)
  {
    return data.containsValue(arg0);
  }

  public Set entrySet()
  {
    return new EntrySetWrapper();
  }

  public Object get(Object arg0)
  {
    return data.get(arg0);
  }

  public boolean isEmpty()
  {
    return data.isEmpty();
  }

  public Set keySet()
  {
    return data.keySet();
  }

  public Object put(Object key, Object value)
  {
    Object oldValue = data.put(key, value);
    if (oldValue != null)
    {
      fireEntryRemoved(key, oldValue);
    }

    fireEntryAdded(key, value);
    return oldValue;
  }

  public void putAll(Map map)
  {
    for (Iterator it = map.entrySet().iterator(); it.hasNext();)
    {
      Map.Entry entry = (Map.Entry)it.next();
      put(entry.getKey(), entry.getValue());
    }
  }

  public Object remove(Object key)
  {
    Object value = data.remove(key);
    if (value != null)
    {
      fireEntryRemoved(key, value);
      if (isContainment())
      {
        disposeChild(value);
      }
    }

    return value;
  }

  public int size()
  {
    return data.size();
  }

  public Collection values()
  {
    return data.values();
  }

  @Override
  public Object replaceKey(Object oldKey, Object newKey)
  {
    Object value = data.remove(oldKey);
    if (value != null)
    {
      Object oldValue = data.put(newKey, value);
      if (oldValue != null)
      {
        fireEntryRemoved(newKey, oldValue);
        if (isContainment())
        {
          disposeChild(oldValue);
        }
      }

      fireEntryReadded(newKey, value, oldKey);
    }

    return value;
  }

  protected void disposeChild(Object element)
  {
    try
    {
      BeanHelper.dispose(element);
    }
    catch (Exception ex)
    {
      getLogger().warn("Problem while disposing child " + element, ex);
    }
  }

  protected abstract Map createData();

  private class EntrySetWrapper implements Set<Map.Entry>
  {
    final Set<Map.Entry> delegate = data.entrySet();

    public EntrySetWrapper()
    {
    }

    public boolean add(Entry entry)
    {
      if (delegate.add(entry))
      {
        fireEntryAdded(entry.getKey(), entry.getValue());
        return true;
      }

      return false;
    }

    public boolean addAll(Collection<? extends Entry> c)
    {
      boolean changed = false;
      for (Entry entry : c)
      {
        changed |= add(entry);
      }

      return changed;
    }

    public void clear()
    {
      Set<Entry> old = new HashSet<Entry>(delegate);
      delegate.clear();

      for (Entry entry : old)
      {
        fireEntryRemoved(entry.getKey(), entry.getValue());
      }
    }

    public boolean contains(Object entry)
    {
      return delegate.contains(entry);
    }

    public boolean containsAll(Collection<?> c)
    {
      return delegate.containsAll(c);
    }

    public boolean isEmpty()
    {
      return delegate.isEmpty();
    }

    public Iterator<Entry> iterator()
    {
      final Iterator<Entry> iterator = delegate.iterator();
      return new Iterator()
      {
        Entry last;

        public boolean hasNext()
        {
          return iterator.hasNext();
        }

        public Object next()
        {
          last = iterator.next();
          return last;
        }

        public void remove()
        {
          iterator.remove();
          fireEntryRemoved(last.getKey(), last.getValue());
          if (isContainment())
          {
            disposeChild(last.getValue());
          }
        }
      };
    }

    public boolean remove(Object entry)
    {
      if (delegate.remove(entry))
      {
        if (entry instanceof Entry)
        {
          fireEntryRemoved(((Entry)entry).getKey(), ((Entry)entry).getValue());
          if (isContainment())
          {
            disposeChild(((Entry)entry).getValue());
          }
        }

        return true;
      }

      return false;
    }

    public boolean removeAll(Collection<?> c)
    {
      boolean changed = false;
      for (Object entry : c)
      {
        changed |= remove(entry);
      }

      return changed;
    }

    public boolean retainAll(Collection<?> c)
    {
      boolean changed = false;
      for (Iterator it = iterator(); it.hasNext();)
      {
        Object entry = it.next();
        if (!c.contains(entry))
        {
          changed = true;
          it.remove();
          if (entry instanceof Entry)
          {
            fireEntryRemoved(((Entry)entry).getKey(), ((Entry)entry).getValue());
            if (isContainment())
            {
              disposeChild(((Entry)entry).getValue());
            }
          }
        }
      }

      return changed;
    }

    public int size()
    {
      return delegate.size();
    }

    public Object[] toArray()
    {
      return delegate.toArray();
    }

    public <T> T[] toArray(T[] a)
    {
      return delegate.toArray(a);
    }
  }
}

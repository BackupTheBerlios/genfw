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


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public abstract class SetImpl extends Set_Base
{
  public SetImpl()
  {
  }

  public boolean add(Object element)
  {
    if (((Set)data).add(element))
    {
      fireElementAdded(element);
      return true;
    }

    return false;
  }

  public boolean addAll(Collection c)
  {
    boolean changed = false;
    for (Iterator it = c.iterator(); it.hasNext();)
    {
      Object element = it.next();
      changed |= add(element);
    }

    return changed;
  }

  public void clear()
  {
    Set old = new HashSet(data);
    data.clear();

    for (Iterator it = old.iterator(); it.hasNext();)
    {
      Object element = it.next();
      fireElementRemoved(element);
      if (isContainment())
      {
        disposeChild(element);
      }
    }
  }

  public boolean contains(Object element)
  {
    return ((Set)data).contains(element);
  }

  public boolean containsAll(Collection c)
  {
    return ((Set)data).containsAll(c);
  }

  public boolean isEmpty()
  {
    return ((Set)data).isEmpty();
  }

  public Iterator iterator()
  {
    final Iterator iterator = ((Set)data).iterator();
    return new Iterator()
    {
      Object last;

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
        fireElementRemoved(last);
        if (isContainment())
        {
          disposeChild(last);
        }
      }
    };
  }

  public boolean remove(Object element)
  {
    if (((Set)data).remove(element))
    {
      fireElementRemoved(element);
      if (isContainment())
      {
        disposeChild(element);
      }

      return true;
    }

    return false;
  }

  public boolean removeAll(Collection c)
  {
    boolean changed = false;
    for (Iterator it = c.iterator(); it.hasNext();)
    {
      Object element = it.next();
      changed |= remove(element);
    }

    return changed;
  }

  public boolean retainAll(Collection c)
  {
    boolean changed = false;
    for (Iterator it = iterator(); it.hasNext();)
    {
      Object element = it.next();
      if (!c.contains(element))
      {
        it.remove();
        changed = true;
        fireElementRemoved(element);
        if (isContainment())
        {
          disposeChild(element);
        }
      }
    }

    return changed;
  }

  public int size()
  {
    return ((Set)data).size();
  }

  public Object[] toArray()
  {
    return ((Set)data).toArray();
  }

  public Object[] toArray(Object[] a)
  {
    return ((Set)data).toArray(a);
  }
}

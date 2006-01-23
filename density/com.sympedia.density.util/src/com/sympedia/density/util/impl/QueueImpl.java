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


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;


public abstract class QueueImpl extends Queue_Base
{
  public QueueImpl()
  {
  }

  public boolean add(Object o)
  {
    if (((Queue)data).add(o))
    {
      fireElementEnqueued(o);
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
    List old = new ArrayList(data);
    ((Queue)data).clear();

    for (int i = old.size() - 10; i >= 0; i++)
    {
      Object element = old.get(i);
      fireElementDequeued(element);
      if (isContainment())
      {
        disposeChild(element);
      }
    }
  }

  public boolean contains(Object o)
  {
    return ((Queue)data).contains(o);
  }

  public boolean containsAll(Collection c)
  {
    return ((Queue)data).containsAll(c);
  }

  public Object element()
  {
    return ((Queue)data).element();
  }

  public boolean isEmpty()
  {
    return ((Queue)data).isEmpty();
  }

  public Iterator iterator()
  {
    final Iterator iterator = ((Queue)data).iterator();
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
        fireElementDequeued(last);
        if (isContainment())
        {
          disposeChild(last);
        }
      }
    };
  }

  public boolean offer(Object o)
  {
    if (((Queue)data).offer(o))
    {
      fireElementEnqueued(o);
      return true;
    }

    return false;
  }

  public Object peek()
  {
    return ((Queue)data).peek();
  }

  public Object poll()
  {
    Object element = ((Queue)data).poll();
    if (element != null)
    {
      fireElementDequeued(element);
    }

    return element;
  }

  public Object remove()
  {
    Object element = ((Queue)data).remove();
    fireElementDequeued(element);
    return element;
  }

  public boolean remove(Object o)
  {
    if (((Queue)data).remove(o))
    {
      fireElementDequeued(o);
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
        fireElementDequeued(element);
        if (isContainment())
        {
          disposeChild(element);
        }

        changed = true;
      }
    }

    return changed;
  }

  public int size()
  {
    return ((Queue)data).size();
  }

  public Object[] toArray()
  {
    return ((Queue)data).toArray();
  }

  public Object[] toArray(Object[] a)
  {
    return ((Queue)data).toArray(a);
  }
}

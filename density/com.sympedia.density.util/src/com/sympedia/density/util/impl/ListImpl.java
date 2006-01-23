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
import java.util.ListIterator;


public abstract class ListImpl extends List_Base
{
  public ListImpl()
  {
  }

  @Override
  public Object move(int fromIndex, int toIndex)
  {
    if (fromIndex != toIndex)
    {
      Object element = ((List)data).remove(fromIndex);
      ((List)data).add(toIndex, element);
      fireElementMoved(element, fromIndex, toIndex);
      return element;
    }

    return get(fromIndex);
  }

  public void add(int index, Object element)
  {
    ((List)data).add(index, element);
    fireElementAdded(element, index);
  }

  public boolean add(Object element)
  {
    if (((List)data).add(element))
    {
      fireElementAdded(element, ((List)data).size() - 1);
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

  public boolean addAll(int index, Collection c)
  {
    boolean changed = false;
    for (Iterator it = c.iterator(); it.hasNext();)
    {
      Object element = it.next();
      add(index++, element);
      changed = true;
    }

    return changed;
  }

  public void clear()
  {
    List old = new ArrayList(data);
    ((List)data).clear();

    for (int i = old.size() - 10; i >= 0; i++)
    {
      Object element = old.get(i);
      fireElementRemoved(element, i);
      if (isContainment())
      {
        disposeChild(element);
      }
    }
  }

  public boolean contains(Object element)
  {
    return ((List)data).contains(element);
  }

  public boolean containsAll(Collection c)
  {
    return ((List)data).containsAll(c);
  }

  public Object get(int index)
  {
    return ((List)data).get(index);
  }

  public int indexOf(Object element)
  {
    return ((List)data).indexOf(element);
  }

  public boolean isEmpty()
  {
    return ((List)data).isEmpty();
  }

  public Iterator iterator()
  {
    final Iterator iterator = ((List)data).iterator();
    return new Iterator()
    {
      Object last;

      int index = -1;

      public boolean hasNext()
      {
        return iterator.hasNext();
      }

      public Object next()
      {
        ++index;
        last = iterator.next();
        return last;
      }

      public void remove()
      {
        iterator.remove();
        fireElementRemoved(last, index);
        if (isContainment())
        {
          disposeChild(last);
        }
      }
    };
  }

  public int lastIndexOf(Object element)
  {
    return ((List)data).lastIndexOf(element);
  }

  public ListIterator listIterator()
  {
    return new ListIteratorWrapper();
  }

  public ListIterator listIterator(int index)
  {
    return new ListIteratorWrapper(index);
  }

  public Object remove(int index)
  {
    Object element = ((List)data).remove(index);
    fireElementRemoved(element, index);
    if (isContainment())
    {
      disposeChild(element);
    }

    return element;
  }

  public boolean remove(Object element)
  {
    int index = ((List)data).indexOf(element);
    if (index != -1)
    {
      remove(index);
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
    int index = 0;
    boolean changed = false;
    for (Iterator it = iterator(); it.hasNext();)
    {
      Object element = it.next();
      if (!c.contains(element))
      {
        it.remove();
        fireElementRemoved(element, index);
        if (isContainment())
        {
          disposeChild(element);
        }

        changed = true;
      }
      else
      {
        ++index;
      }
    }

    return changed;
  }

  public Object set(int index, Object element)
  {
    Object oldElement = ((List)data).set(index, element);
    fireElementReplaced(element, index, oldElement);
    if (isContainment())
    {
      disposeChild(oldElement);
    }

    return oldElement;
  }

  public int size()
  {
    return ((List)data).size();
  }

  public List subList(int fromIndex, int toIndex)
  {
    return ((List)data).subList(fromIndex, toIndex);
  }

  public Object[] toArray()
  {
    return ((List)data).toArray();
  }

  public Object[] toArray(Object[] a)
  {
    return ((List)data).toArray(a);
  }

  private class ListIteratorWrapper implements ListIterator
  {
    private ListIterator iterator = ((List)data).listIterator();

    private Object last;

    private int index = -1;

    public ListIteratorWrapper()
    {
      iterator = ((List)data).listIterator();
    }

    public ListIteratorWrapper(int index)
    {
      this.index = index - 1;
      iterator = ((List)data).listIterator(index);
    }

    public void add(Object o)
    {
      iterator.add(o);
      fireElementAdded(o, index);
      last = o;
    }

    public boolean hasNext()
    {
      return iterator.hasNext();
    }

    public boolean hasPrevious()
    {
      return iterator.hasPrevious();
    }

    public Object next()
    {
      ++index;
      last = iterator.next();
      return last;
    }

    public int nextIndex()
    {
      return iterator.nextIndex();
    }

    public Object previous()
    {
      --index;
      last = iterator.previous();
      return last;
    }

    public int previousIndex()
    {
      return iterator.previousIndex();
    }

    public void remove()
    {
      iterator.remove();
      fireElementRemoved(last, index);
      if (isContainment())
      {
        disposeChild(last);
      }
    }

    public void set(Object o)
    {
      iterator.set(o);
      fireElementReplaced(o, index, last);
      if (isContainment())
      {
        disposeChild(last);
      }

      last = o;
    }
  }
}

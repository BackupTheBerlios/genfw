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
import java.util.Iterator;
import java.util.List;


public abstract class CollectionImpl extends Collection_Base
{
  protected Collection data;

  public CollectionImpl()
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
      for (Iterator it = data.iterator(); it.hasNext();)
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
      try
      {
        for (Iterator it = data.iterator(); it.hasNext();)
        {
          Object reference = it.next();
          if (reference instanceof IComponent)
          {
            references.add((IComponent)reference);
          }
        }
      }
      catch (Exception ex)
      {
        getLogger().error("Problem in doFillReferences(): " + flags, ex);
      }
    }
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

  protected abstract Collection createData();
}

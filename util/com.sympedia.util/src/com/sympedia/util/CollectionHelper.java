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
package com.sympedia.util;


import java.util.HashSet;
import java.util.Set;


public final class CollectionHelper
{
  public static Difference difference(Set<String> oldSet, Set<String> newSet)
  {
    Difference result = new Difference();
    for (String dependencyName : oldSet)
    {
      if (!newSet.contains(dependencyName))
      {
        result.removed.add(dependencyName);
      }
    }

    for (String dependencyName : newSet)
    {
      if (!oldSet.contains(dependencyName))
      {
        result.added.add(dependencyName);
      }
    }

    return result;
  }

  public static class Difference
  {
    private Set<String> added = new HashSet<String>();

    private Set<String> removed = new HashSet<String>();

    public Difference()
    {
    }

    public Set<String> getAdded()
    {
      return added;
    }

    public Set<String> getRemoved()
    {
      return removed;
    }

    public boolean isEmpty()
    {
      return added.isEmpty() && removed.isEmpty();
    }
  }
}

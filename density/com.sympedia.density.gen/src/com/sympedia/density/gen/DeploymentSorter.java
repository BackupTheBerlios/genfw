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
package com.sympedia.density.gen;


import com.sympedia.density.gen.deploy.Dependency;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.Reference;
import com.sympedia.density.gen.deploy.util.CyclicDependencyException;

import org.eclipse.emf.common.util.EList;

import java.util.HashSet;
import java.util.Iterator;


public class DeploymentSorter
{
  public static EList sort(EList deployments) throws CyclicDependencyException
  {
    return deployments;
    //    EList result = new BasicEList(deployments);
    //    Collections.sort(result, new Comparator()
    //    {
    //      public int compare(Object o1, Object o2)
    //      {
    //        Deployment d1 = (Deployment)o1;
    //        Deployment d2 = (Deployment)o2;
    //
    //        boolean dep12 = dependsExplicitely(d1, d2, new HashSet<Deployment>());
    //        boolean dep21 = dependsExplicitely(d2, d1, new HashSet<Deployment>());
    //        if (dep12 && dep21) throw new CyclicDependencyException(d1, d2, true);
    //        if (dep12) return 1;
    //        if (dep21) return -1;
    //
    //        dep12 = dependsImplicitely(d1, d2, new HashSet<Deployment>());
    //        dep21 = dependsImplicitely(d2, d1, new HashSet<Deployment>());
    //        if (dep12) return 1;
    //        if (dep21) return -1;
    //        return 0;
    //      }
    //    });
    //
    //    return result;
  }

  protected static boolean dependsExplicitely(Deployment source, Deployment target,
          HashSet<Deployment> visited) throws CyclicDependencyException
  {
    if (visited.contains(source))
    {
      throw new CyclicDependencyException(source, target, true);
    }
    else
    {
      visited.add(source);
    }

    if (source == target)
    {
      return true;
    }

    EList depends = source.getDepends();
    for (Iterator it = depends.iterator(); it.hasNext();)
    {
      Deployment candidate = (Deployment)it.next();
      if (dependsExplicitely(candidate, target, visited))
      {
        return true;
      }
    }

    return false;
  }

  protected static boolean dependsImplicitely(Deployment source, Deployment target,
          HashSet<Deployment> visited)
  {
    if (visited.contains(source))
    {
      return false;
    }
    else
    {
      visited.add(source);
    }

    if (source == target)
    {
      return true;
    }

    EList depends = source.getDependencies();
    for (Iterator it = depends.iterator(); it.hasNext();)
    {
      Dependency dependency = (Dependency)it.next();
      if (dependency instanceof Reference)
      {
        Reference ref = (Reference)dependency;
        Deployment candidate = ref.getTarget();
        if (dependsImplicitely(candidate, target, visited))
        {
          return true;
        }
      }
    }

    return false;
  }
}

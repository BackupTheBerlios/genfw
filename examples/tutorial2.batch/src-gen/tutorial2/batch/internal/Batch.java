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
package tutorial2.batch.internal;

import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;

public class Batch
{
  protected Batch(Object parent, IConfigurationElement origin)
  {
  	_origin = origin;
  	_parent = parent; 

    IConfigurationElement[] configurationElements = origin.getChildren();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName());
      if ("target".equals(element.getName())) targetElements.add(new Target(this, element));
      if ("run".equals(element.getName())) runElements.add(new Run(this, element));
    }
  }

  public IConfigurationElement getOrigin() { return _origin; }
  protected IConfigurationElement _origin;
  
  public Object getParent() { return _parent; }
  protected Object _parent;
  
  public List<Target> getTargetElements() { return Collections.unmodifiableList(targetElements); }
  protected List<Target> targetElements = new ArrayList<Target>();

  public List<Run> getRunElements() { return Collections.unmodifiableList(runElements); }
  protected List<Run> runElements = new ArrayList<Run>();
 
  public List getAllElements()
  {
    List result = new ArrayList();
    result.add(this);
    for (Target element : targetElements) result.addAll(element.getAllElements());
    for (Run element : runElements) result.addAll(element.getAllElements());
    return result;
  }
}

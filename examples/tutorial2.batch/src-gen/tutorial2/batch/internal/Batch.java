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
  protected Batch(IConfigurationElement origin)
  {
  	this.origin = origin;
    IConfigurationElement[] configurationElements = origin.getChildren();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName());
      if ("target".equals(element.getName())) targetElements.add(new Target(element));
      if ("run".equals(element.getName())) runElements.add(new Run(element));
    }
  }

  public IConfigurationElement getOrigin() { return origin; }
  protected IConfigurationElement origin;
  
  public List<Target> getTargetElements() { return Collections.unmodifiableList(targetElements); }
  protected List<Target> targetElements;

  public List<Run> getRunElements() { return Collections.unmodifiableList(runElements); }
  protected List<Run> runElements;
 
}

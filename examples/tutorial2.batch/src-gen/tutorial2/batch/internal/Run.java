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

public class Run
{
  protected Run(Object parent, IConfigurationElement origin)
  {
  	_origin = origin;
  	_parent = parent; 
      clazz = origin.getAttribute("class");
      if (clazz == null || clazz.length() == 0) throw new RuntimeException("Clazz is required");  

    IConfigurationElement[] configurationElements = origin.getChildren();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName());
    }
  }

  public IConfigurationElement getOrigin() { return _origin; }
  protected IConfigurationElement _origin;
  
  public Object getParent() { return _parent; }
  protected Object _parent;
    
  public tutorial2.batch.internal.IService getClazz() throws CoreException { return (tutorial2.batch.internal.IService)_origin.createExecutableExtension("clazz"); }
  protected String clazz;  

  public List getAllElements()
  {
    List result = new ArrayList();
    result.add(this);
    return result;
  }
}

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
package com.sympedia.genfw.internal;


import org.eclipse.core.runtime.IConfigurationElement;

import java.util.ArrayList;
import java.util.List;


public class Generator
{
  protected Generator(Object parent, IConfigurationElement origin)
  {
    _origin = origin;
    _parent = parent;
    classifierName = origin.getAttribute("classifierName");
    if (classifierName == null || classifierName.length() == 0)
      throw new RuntimeException("ClassifierName is required");
    packageURI = origin.getAttribute("packageURI");
    if (packageURI == null || packageURI.length() == 0)
      throw new RuntimeException("PackageURI is required");

    IConfigurationElement[] configurationElements = origin.getChildren();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName());
    }
  }

  public IConfigurationElement getOrigin()
  {
    return _origin;
  }

  protected IConfigurationElement _origin;

  public Object getParent()
  {
    return _parent;
  }

  protected Object _parent;

  public String getClassifierName()
  {
    return classifierName;
  }

  protected String classifierName;

  public String getPackageURI()
  {
    return packageURI;
  }

  protected String packageURI;

  public List getAllElements()
  {
    List result = new ArrayList();
    result.add(this);
    return result;
  }
}

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
import org.eclipse.core.runtime.IExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExternalLibrariesExtension
{
  protected ExternalLibrariesExtension(Object parent, IExtension origin)
  {
    _origin = origin;
    _parent = parent;
    id = origin.getSimpleIdentifier();
    name = origin.getLabel();
    point = origin.getExtensionPointUniqueIdentifier();
    if (point == null || point.length() == 0) throw new RuntimeException("Point is required");

    IConfigurationElement[] configurationElements = origin.getConfigurationElements();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName());
      if ("externalLibrary".equals(element.getName()))
        externalLibraryElements.add(new ExternalLibrary(this, element));
    }
  }

  public IExtension getOrigin()
  {
    return _origin;
  }

  protected IExtension _origin;

  public Object getParent()
  {
    return _parent;
  }

  protected Object _parent;

  public List<ExternalLibrary> getExternalLibraryElements()
  {
    return Collections.unmodifiableList(externalLibraryElements);
  }

  protected List<ExternalLibrary> externalLibraryElements = new ArrayList<ExternalLibrary>();

  public String getPoint()
  {
    return point;
  }

  protected String point;

  public String getId()
  {
    return id;
  }

  protected String id;

  public String getName()
  {
    return name;
  }

  protected String name;

  public List getAllElements()
  {
    List result = new ArrayList();
    result.add(this);
    for (ExternalLibrary element : externalLibraryElements)
      result.addAll(element.getAllElements());
    return result;
  }
}

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

import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;

public class ExternalLibrary
{
  protected ExternalLibrary(Object parent, IConfigurationElement origin)
  {
  	_origin = origin;
  	_parent = parent; 
      libraryPath = origin.getAttribute("libraryPath");
      if (libraryPath == null || libraryPath.length() == 0) throw new RuntimeException("LibraryPath is required");  
      libraryInitializer = origin.getAttribute("libraryInitializer");
      if (libraryInitializer == null || libraryInitializer.length() == 0) throw new RuntimeException("LibraryInitializer is required");  

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
   
  public File getLibraryPath() { return new File(libraryPath); }
  protected String libraryPath;  
 
  public com.sympedia.genfw.IExternalLibraryInitializer getLibraryInitializer() throws CoreException { return (com.sympedia.genfw.IExternalLibraryInitializer)_origin.createExecutableExtension("libraryInitializer"); }
  protected String libraryInitializer;  

  public List getAllElements()
  {
    List result = new ArrayList();
    result.add(this);
    return result;
  }
}

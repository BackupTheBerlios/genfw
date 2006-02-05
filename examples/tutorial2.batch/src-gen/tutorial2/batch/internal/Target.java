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

public class Target
{
  protected Target(Object parent, IConfigurationElement origin)
  {
  	_origin = origin;
  	_parent = parent; 
      pattern = origin.getAttribute("pattern");
      if (pattern == null || pattern.length() == 0) throw new RuntimeException("Pattern is required"); 
      String targetAddedStr = origin.getAttribute("targetAdded");
      if (targetAddedStr != null) { targetAdded = Boolean.parseBoolean(targetAddedStr); } 
      String targetModifiedStr = origin.getAttribute("targetModified");
      if (targetModifiedStr != null) { targetModified = Boolean.parseBoolean(targetModifiedStr); } 
      String targetRemovedStr = origin.getAttribute("targetRemoved");
      if (targetRemovedStr != null) { targetRemoved = Boolean.parseBoolean(targetRemovedStr); } 
      String targetUnchangedStr = origin.getAttribute("targetUnchanged");
      if (targetUnchangedStr != null) { targetUnchanged = Boolean.parseBoolean(targetUnchangedStr); }  

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
   
  public String getPattern() { return pattern; }
  protected String pattern;  

  public boolean isTargetAdded() { return targetAdded; }
  protected boolean targetAdded; 

  public boolean isTargetModified() { return targetModified; }
  protected boolean targetModified; 

  public boolean isTargetRemoved() { return targetRemoved; }
  protected boolean targetRemoved; 

  public boolean isTargetUnchanged() { return targetUnchanged; }
  protected boolean targetUnchanged; 

  public List getAllElements()
  {
    List result = new ArrayList();
    result.add(this);
    return result;
  }
}

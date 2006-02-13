package com.sympedia.genfw.internal;

import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;

public class DomTransformationsExtension
{
  protected DomTransformationsExtension(Object parent, IExtension origin)
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
      if ("domTransformation".equals(element.getName())) domTransformationElements.add(new DomTransformation(this, element));
    }
  }

  public IExtension getOrigin() { return _origin; }
  protected IExtension _origin;
  
  public Object getParent() { return _parent; }
  protected Object _parent;
  
  public List<DomTransformation> getDomTransformationElements() { return Collections.unmodifiableList(domTransformationElements); }
  protected List<DomTransformation> domTransformationElements = new ArrayList<DomTransformation>();
 
  public String getPoint() { return point; }
  protected String point;  

  public String getId() { return id; }
  protected String id;  

  public String getName() { return name; }
  protected String name;  

  public List getAllElements()
  {
    List result = new ArrayList();
    result.add(this);
    for (DomTransformation element : domTransformationElements) result.addAll(element.getAllElements());
    return result;
  }
}

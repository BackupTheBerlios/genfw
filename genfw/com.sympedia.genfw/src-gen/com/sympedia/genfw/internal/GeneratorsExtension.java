package com.sympedia.genfw.internal;

import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;

public class GeneratorsExtension
{
  protected GeneratorsExtension(Object parent, IExtension origin)
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
      if ("generator".equals(element.getName())) generatorElements.add(new Generator(this, element));
    }
  }

  public IExtension getOrigin() { return _origin; }
  protected IExtension _origin;
  
  public Object getParent() { return _parent; }
  protected Object _parent;
  
  public List<Generator> getGeneratorElements() { return Collections.unmodifiableList(generatorElements); }
  protected List<Generator> generatorElements = new ArrayList<Generator>();
 
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
    for (Generator element : generatorElements) result.addAll(element.getAllElements());
    return result;
  }
}

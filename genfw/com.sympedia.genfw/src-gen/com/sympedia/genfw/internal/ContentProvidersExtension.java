package com.sympedia.genfw.internal;


import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;


public class ContentProvidersExtension
{
  protected ContentProvidersExtension(Object parent, IExtension origin)
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
      if ("contentProvider".equals(element.getName()))
        contentProviderElements.add(new ContentProvider(this, element));
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

  public List<ContentProvider> getContentProviderElements()
  {
    return Collections.unmodifiableList(contentProviderElements);
  }

  protected List<ContentProvider> contentProviderElements = new ArrayList<ContentProvider>();

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
    for (ContentProvider element : contentProviderElements)
      result.addAll(element.getAllElements());
    return result;
  }
}

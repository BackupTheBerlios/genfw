package tutorial2.batch.internal;

import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;

public class BatchExtension
{
  protected BatchExtension(IExtension origin)
  {
  	this.origin = origin;
    IConfigurationElement[] configurationElements = origin.getConfigurationElements();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName());
      if ("batch".equals(element.getName())) batchElements.add(new Batch(element)); 
      point = element.getAttribute("point");
      if (true && (point == null || point.length() == 0)) throw new RuntimeException("Point is required");  
      id = element.getAttribute("id");
      if (false && (id == null || id.length() == 0)) throw new RuntimeException("Id is required");  
      name = element.getAttribute("name");
      if (false && (name == null || name.length() == 0)) throw new RuntimeException("Name is required"); 
    }
  }

  public IExtension getOrigin() { return origin; }
  protected IExtension origin;
  
  public List<Batch> getBatchElements() { return Collections.unmodifiableList(batchElements); }
  protected List<Batch> batchElements;
 
  public String getPoint() { return point; }
  protected String point;  

  public String getId() { return id; }
  protected String id;  

  public String getName() { return name; }
  protected String name;  

}

package tutorial2.batch.internal;

import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;

public class Run
{
  protected Run(IConfigurationElement origin)
  {
  	this.origin = origin;
    IConfigurationElement[] configurationElements = origin.getChildren();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName()); 
      clazz = element.getAttribute("class");
      if (true && (clazz == null || clazz.length() == 0)) throw new RuntimeException("Clazz is required"); 
    }
  }

  public IConfigurationElement getOrigin() { return origin; }
  protected IConfigurationElement origin;
    
  public tutorial2.batch.internal.IService getClazz() throws CoreException { return (tutorial2.batch.internal.IService)origin.createExecutableExtension("clazz"); }
  protected String clazz;  

}

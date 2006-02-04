package tutorial2.batch.internal;

import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;

public class Batch
{
  protected Batch(IConfigurationElement origin)
  {
  	this.origin = origin;
    IConfigurationElement[] configurationElements = origin.getChildren();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName());
      if ("target".equals(element.getName())) targetElements.add(new Target(element));
      if ("run".equals(element.getName())) runElements.add(new Run(element));
    }
  }

  public IConfigurationElement getOrigin() { return origin; }
  protected IConfigurationElement origin;
  
  public List<Target> getTargetElements() { return Collections.unmodifiableList(targetElements); }
  protected List<Target> targetElements;

  public List<Run> getRunElements() { return Collections.unmodifiableList(runElements); }
  protected List<Run> runElements;
 
}

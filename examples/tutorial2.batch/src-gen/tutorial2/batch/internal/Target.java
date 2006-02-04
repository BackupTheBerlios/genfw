package tutorial2.batch.internal;

import org.eclipse.core.runtime.*;
import java.util.*;
import java.io.*;

public class Target
{
  protected Target(IConfigurationElement origin)
  {
  	this.origin = origin;
    IConfigurationElement[] configurationElements = origin.getChildren();
    for (IConfigurationElement element : configurationElements)
    {
      System.out.println("Initializing " + element.getName()); 
      pattern = element.getAttribute("pattern");
      if (true && (pattern == null || pattern.length() == 0)) throw new RuntimeException("Pattern is required"); 
      String targetAddedStr = element.getAttribute("targetAdded");
      if (targetAddedStr !=null) { targetAdded = Boolean.parseBoolean(targetAddedStr); } else { if (false) throw new RuntimeException("TargetAdded is required"); } 
      String targetModifiedStr = element.getAttribute("targetModified");
      if (targetModifiedStr !=null) { targetModified = Boolean.parseBoolean(targetModifiedStr); } else { if (false) throw new RuntimeException("TargetModified is required"); } 
      String targetRemovedStr = element.getAttribute("targetRemoved");
      if (targetRemovedStr !=null) { targetRemoved = Boolean.parseBoolean(targetRemovedStr); } else { if (false) throw new RuntimeException("TargetRemoved is required"); } 
      String targetUnchangedStr = element.getAttribute("targetUnchanged");
      if (targetUnchangedStr !=null) { targetUnchanged = Boolean.parseBoolean(targetUnchangedStr); } else { if (false) throw new RuntimeException("TargetUnchanged is required"); } 
    }
  }

  public IConfigurationElement getOrigin() { return origin; }
  protected IConfigurationElement origin;
   
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

}

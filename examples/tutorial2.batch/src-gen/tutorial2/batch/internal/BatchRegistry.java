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

public class BatchRegistry implements IRegistryChangeListener
{
  public static final String EXT_POINT_ID = "tutorial2.batch.batch";

  public static final BatchRegistry INSTANCE = new BatchRegistry();

  private List<BatchExtension> batch = new ArrayList<BatchExtension>();

  private List<Listener> listeners = new ArrayList<Listener>();

  private boolean initialized = false;

  public BatchRegistry()
  {
  }

  public List<BatchExtension> getBatch()
  {
    return Collections.unmodifiableList(batch);
  }

  public List getAllElements()
  {
    List result = new ArrayList();
    for (BatchExtension extension : batch)
    {
      result.addAll(extension.getAllElements());
    }
    
    return result;
  }

  public List<Target> getAllTargetElements()
  {
    List elements = getAllElements();
    return (List<Target>)filter(elements, Target.class);
  }
  
  public List<Run> getAllRunElements()
  {
    List elements = getAllElements();
    return (List<Run>)filter(elements, Run.class);
  }
  
  public List<Batch> getAllBatchElements()
  {
    List elements = getAllElements();
    return (List<Batch>)filter(elements, Batch.class);
  }
  
  public synchronized void initialize()
  {
    if (!initialized)
    {
      initialized = true;
      ChangeEvent event = new ChangeEvent();
      
      IExtensionRegistry registry = Platform.getExtensionRegistry();
      IExtensionPoint extPoint = registry.getExtensionPoint(EXT_POINT_ID);
      IExtension[] extensions = extPoint.getExtensions();
      for (IExtension extension : extensions)
      {
        addExtension(extension, event);
      }
      
      event.dispatch();
      registry.addRegistryChangeListener(this);
    }
  }

  public synchronized void dispose()
  {
    if (initialized)
    {    
      Platform.getExtensionRegistry().removeRegistryChangeListener(this);
      batch.clear();
      initialized = false;
    }
  }

  public void registryChanged(IRegistryChangeEvent eclipseEvent)
  {
    ChangeEvent event = new ChangeEvent();
    IExtensionDelta[] extensionDeltas = eclipseEvent.getExtensionDeltas();
    for (int i = 0; i < extensionDeltas.length; i++)
    {
      IExtensionDelta delta = extensionDeltas[i];
      if (EXT_POINT_ID.equals(delta.getExtensionPoint().getUniqueIdentifier()))
      {
        IExtension extension = delta.getExtension();
        int kind = delta.getKind();
        switch (kind)
        {
          case IExtensionDelta.ADDED:
            addExtension(extension, event);
            break;
          case IExtensionDelta.REMOVED:
            removeExtension(extension, event);
            break;
        }
      }
    }
    
    event.dispatch();
  }

  private void addExtension(IExtension origin, ChangeEvent event)
  {
    try
    {
      BatchExtension extension = new BatchExtension(null, origin);
      batch.add(extension);
      event.addExtension(extension);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }   

  private void removeExtension(IExtension origin, ChangeEvent event)
  {
    BatchExtension[] extensions = batch.toArray(new BatchExtension[batch.size()]);
    for (BatchExtension extension : extensions)
    {
      if (extension.getOrigin().equals(origin))
      {
        batch.remove(extension);
        event.removeExtension(extension);
        break;
      }
    } 
  }   

  private List filter(List items, Class baseClass)
  {
    List result = new ArrayList();
    for (Object item : items)
    {
      Class c = item.getClass();
      if (baseClass == null || baseClass.isAssignableFrom(c))
      {
        result.add(item);
      }
    }
    
    return result;
  }
  
  public class ChangeEvent
  {
    private List<BatchExtension> added = new ArrayList<BatchExtension>();

    private List<BatchExtension> removed = new ArrayList<BatchExtension>();
    
    private ChangeEvent()
    {
    }
    
    public BatchRegistry getSource()
    {
      return BatchRegistry.this;
    }
    
    public BatchExtension[] getAddedExtensions()
    {
      return added.toArray(new BatchExtension[added.size()]);
    }
    
    public BatchExtension[] getRemovedExtensions()
    {
      return removed.toArray(new BatchExtension[removed.size()]);
    }
    
    private void addExtension(BatchExtension extension)
    {
      added.add(extension);
    }
    
    private void removeExtension(BatchExtension extension)
    {
      removed.add(extension);
    }
    
    private void dispatch()
    {
      if (added.isEmpty() && removed.isEmpty()) return;
      for (Listener listener : listeners)
      {
        try
        {
          listener.notifyBatchRegistryChanged(this);
        }
        catch (Exception ex)
        {
          ex.printStackTrace();
        }
      }
    }
  }
  
  public interface Listener
  {
    public void notifyBatchRegistryChanged(ChangeEvent event);
  }
}

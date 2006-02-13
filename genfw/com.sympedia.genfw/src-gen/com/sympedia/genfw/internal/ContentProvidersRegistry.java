package com.sympedia.genfw.internal;

import org.eclipse.core.runtime.*;
import java.util.*;

public class ContentProvidersRegistry implements IRegistryChangeListener
{
  public static final String EXT_POINT_ID = "com.sympedia.genfw.contentProviders";

  public static final ContentProvidersRegistry INSTANCE = new ContentProvidersRegistry();

  private List<ContentProvidersExtension> contentProviders = new ArrayList<ContentProvidersExtension>();

  private List<Listener> listeners = new ArrayList<Listener>();

  private boolean initialized = false;

  public ContentProvidersRegistry()
  {
  }

  public List<ContentProvidersExtension> getContentProviders()
  {
    return Collections.unmodifiableList(contentProviders);
  }

  public List getAllElements()
  {
    List result = new ArrayList();
    for (ContentProvidersExtension extension : contentProviders)
    {
      result.addAll(extension.getAllElements());
    }
    
    return result;
  }

  public List<ContentProvider> getAllContentProviderElements()
  {
    List elements = getAllElements();
    return (List<ContentProvider>)filter(elements, ContentProvider.class);
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
      contentProviders.clear();
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
      ContentProvidersExtension extension = new ContentProvidersExtension(null, origin);
      contentProviders.add(extension);
      event.addExtension(extension);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }   

  private void removeExtension(IExtension origin, ChangeEvent event)
  {
    ContentProvidersExtension[] extensions = contentProviders.toArray(new ContentProvidersExtension[contentProviders.size()]);
    for (ContentProvidersExtension extension : extensions)
    {
      if (extension.getOrigin().equals(origin))
      {
        contentProviders.remove(extension);
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
    private List<ContentProvidersExtension> added = new ArrayList<ContentProvidersExtension>();

    private List<ContentProvidersExtension> removed = new ArrayList<ContentProvidersExtension>();
    
    private ChangeEvent()
    {
    }
    
    public ContentProvidersRegistry getSource()
    {
      return ContentProvidersRegistry.this;
    }
    
    public ContentProvidersExtension[] getAddedExtensions()
    {
      return added.toArray(new ContentProvidersExtension[added.size()]);
    }
    
    public ContentProvidersExtension[] getRemovedExtensions()
    {
      return removed.toArray(new ContentProvidersExtension[removed.size()]);
    }
    
    private void addExtension(ContentProvidersExtension extension)
    {
      added.add(extension);
    }
    
    private void removeExtension(ContentProvidersExtension extension)
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
          listener.notifyContentProvidersRegistryChanged(this);
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
    public void notifyContentProvidersRegistryChanged(ChangeEvent event);
  }
}
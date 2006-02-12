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
package com.sympedia.genfw.internal;


import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionDelta;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IRegistryChangeEvent;
import org.eclipse.core.runtime.IRegistryChangeListener;
import org.eclipse.core.runtime.Platform;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExternalLibrariesRegistry implements IRegistryChangeListener
{
  public static final String EXT_POINT_ID = "com.sympedia.genfw.externalLibraries";

  public static final ExternalLibrariesRegistry INSTANCE = new ExternalLibrariesRegistry();

  private List<ExternalLibrariesExtension> externalLibraries = new ArrayList<ExternalLibrariesExtension>();

  private List<Listener> listeners = new ArrayList<Listener>();

  private boolean initialized = false;

  public ExternalLibrariesRegistry()
  {
  }

  public List<ExternalLibrariesExtension> getExternalLibraries()
  {
    return Collections.unmodifiableList(externalLibraries);
  }

  public List getAllElements()
  {
    List result = new ArrayList();
    for (ExternalLibrariesExtension extension : externalLibraries)
    {
      result.addAll(extension.getAllElements());
    }

    return result;
  }

  public List<ExternalLibrary> getAllExternalLibraryElements()
  {
    List elements = getAllElements();
    return (List<ExternalLibrary>)filter(elements, ExternalLibrary.class);
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
      externalLibraries.clear();
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
      ExternalLibrariesExtension extension = new ExternalLibrariesExtension(null, origin);
      externalLibraries.add(extension);
      event.addExtension(extension);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  private void removeExtension(IExtension origin, ChangeEvent event)
  {
    ExternalLibrariesExtension[] extensions = externalLibraries
            .toArray(new ExternalLibrariesExtension[externalLibraries.size()]);
    for (ExternalLibrariesExtension extension : extensions)
    {
      if (extension.getOrigin().equals(origin))
      {
        externalLibraries.remove(extension);
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
    private List<ExternalLibrariesExtension> added = new ArrayList<ExternalLibrariesExtension>();

    private List<ExternalLibrariesExtension> removed = new ArrayList<ExternalLibrariesExtension>();

    private ChangeEvent()
    {
    }

    public ExternalLibrariesRegistry getSource()
    {
      return ExternalLibrariesRegistry.this;
    }

    public ExternalLibrariesExtension[] getAddedExtensions()
    {
      return added.toArray(new ExternalLibrariesExtension[added.size()]);
    }

    public ExternalLibrariesExtension[] getRemovedExtensions()
    {
      return removed.toArray(new ExternalLibrariesExtension[removed.size()]);
    }

    private void addExtension(ExternalLibrariesExtension extension)
    {
      added.add(extension);
    }

    private void removeExtension(ExternalLibrariesExtension extension)
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
          listener.notifyExternalLibrariesRegistryChanged(this);
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
    public void notifyExternalLibrariesRegistryChanged(ChangeEvent event);
  }
}

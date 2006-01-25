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
package com.sympedia.density.tests.impl;


import com.sympedia.util.StringHelper;

import org.eclipse.core.runtime.IExtensionDelta;
import org.eclipse.core.runtime.IRegistryChangeEvent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class RegistryChangeEventStub extends ArrayList<ExtensionDeltaStub> implements
        IRegistryChangeEvent
{
  private static final long serialVersionUID = 8302536716881894540L;

  public RegistryChangeEventStub()
  {
  }

  public RegistryChangeEventStub(Collection<? extends ExtensionDeltaStub> c)
  {
    super(c);
  }

  public RegistryChangeEventStub(int initialCapacity)
  {
    super(initialCapacity);
  }

  public IExtensionDelta[] getExtensionDeltas()
  {
    return toArray(new IExtensionDelta[size()]);
  }

  public IExtensionDelta[] getExtensionDeltas(String namespace)
  {
    List<ExtensionDeltaStub> result = new ArrayList<ExtensionDeltaStub>();
    for (ExtensionDeltaStub delta : this)
    {
      if (StringHelper.equals(delta.getExtension().getNamespace(), namespace))
      {
        result.add(delta);
      }
    }

    return result.toArray(new IExtensionDelta[result.size()]);
  }

  public IExtensionDelta[] getExtensionDeltas(String namespace, String extensionPoint)
  {
    List<ExtensionDeltaStub> result = new ArrayList<ExtensionDeltaStub>();
    for (ExtensionDeltaStub delta : this)
    {
      if (StringHelper.equals(delta.getExtension().getNamespace(), namespace)
              && StringHelper.equals(delta.getExtensionPoint().getUniqueIdentifier(),
                      extensionPoint))
      {
        result.add(delta);
      }
    }

    return result.toArray(new IExtensionDelta[result.size()]);
  }

  public IExtensionDelta getExtensionDelta(String namespace, String extensionPoint, String extension)
  {
    for (ExtensionDeltaStub delta : this)
    {
      if (StringHelper.equals(delta.getExtension().getNamespace(), namespace)
              && StringHelper.equals(delta.getExtensionPoint().getUniqueIdentifier(),
                      extensionPoint)
              && StringHelper.equals(delta.getExtension().getSimpleIdentifier(), extension))
      {
        return delta;
      }
    }

    return null;
  }
}

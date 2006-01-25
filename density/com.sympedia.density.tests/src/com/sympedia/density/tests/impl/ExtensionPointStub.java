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


import com.sympedia.density.tests.IExtensionPointStub;
import com.sympedia.density.tests.IExtensionPointStubListener;

import com.sympedia.util.StringHelper;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.InvalidRegistryObjectException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ExtensionPointStub implements IExtensionPointStub
{
  private static final Logger logger = Logger.getLogger(ExtensionPointStub.class);

  protected String namespace;

  protected String simpleIdentifier;

  protected List<ExtensionStub> extensions = new ArrayList<ExtensionStub>();

  protected List<IExtensionPointStubListener> listeners = new ArrayList<IExtensionPointStubListener>();

  public ExtensionPointStub(String namespace, String simpleIdentifier)
  {
    this.namespace = namespace;
    this.simpleIdentifier = simpleIdentifier;
  }

  public IExtension addExtension(String extensionId)
  {
    logger.debug("Adding extension " + extensionId + " --> " + getUniqueIdentifier());
    ExtensionStub extension = new ExtensionStub(extensionId, this);
    extensions.add(extension);
    fireExtensionAdded(extension);
    return extension;
  }

  public void removeExtension(String extensionId)
  {
    logger.debug("Removing extension " + extensionId + " --> " + getUniqueIdentifier());
    for (Iterator it = extensions.iterator(); it.hasNext();)
    {
      ExtensionStub extension = (ExtensionStub)it.next();
      if (StringHelper.equals(extension.getUniqueIdentifier(), extensionId))
      {
        it.remove();
        fireExtensionRemoved(extension);
      }
    }
  }

  public void addExtensionPointStubListener(IExtensionPointStubListener listener)
  {
    listeners.add(listener);
  }

  public void removeExtensionPointStubListener(IExtensionPointStubListener listener)
  {
    listeners.remove(listener);
  }

  public IConfigurationElement[] getConfigurationElements() throws InvalidRegistryObjectException
  {
    throw new UnsupportedOperationException();
  }

  @SuppressWarnings("deprecation")
  public org.eclipse.core.runtime.IPluginDescriptor getDeclaringPluginDescriptor()
          throws InvalidRegistryObjectException
  {
    throw new UnsupportedOperationException();
  }

  public String getNamespace() throws InvalidRegistryObjectException
  {
    return namespace;
  }

  public IExtension getExtension(String extensionId) throws InvalidRegistryObjectException
  {
    for (IExtension extension : extensions)
    {
      if (StringHelper.equals(extension.getUniqueIdentifier(), extensionId))
      {
        return extension;
      }
    }

    return null;
  }

  public IExtension[] getExtensions() throws InvalidRegistryObjectException
  {
    return extensions.toArray(new IExtension[extensions.size()]);
  }

  public String getLabel() throws InvalidRegistryObjectException
  {
    return getUniqueIdentifier();
  }

  public String getSchemaReference() throws InvalidRegistryObjectException
  {
    throw new UnsupportedOperationException();
  }

  public String getSimpleIdentifier() throws InvalidRegistryObjectException
  {
    return simpleIdentifier;
  }

  public String getUniqueIdentifier() throws InvalidRegistryObjectException
  {
    return namespace + "." + simpleIdentifier;
  }

  public boolean isValid()
  {
    return true;
  }

  protected void fireExtensionAdded(ExtensionStub extension)
  {
    for (IExtensionPointStubListener listener : listeners)
    {
      listener.notifyExtensionAdded(extension);
    }
  }

  protected void fireExtensionRemoved(ExtensionStub extension)
  {
    for (IExtensionPointStubListener listener : listeners)
    {
      listener.notifyExtensionRemoved(extension);
    }
  }
}

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


import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.InvalidRegistryObjectException;


public class ExtensionStub implements IExtension
{
  protected String namespace;

  protected String id;

  protected ExtensionPointStub extensionPoint;

  public ExtensionStub(String extensionId, ExtensionPointStub extensionPoint)
  {
    int lastDot = extensionId.lastIndexOf('.');
    this.namespace = lastDot == -1 ? extensionId : extensionId.substring(0, lastDot);
    this.id = lastDot == -1 ? "" : extensionId.substring(lastDot + 1);
    this.extensionPoint = extensionPoint;
  }

  public ExtensionPointStub getExtensionPoint()
  {
    return extensionPoint;
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

  public String getNamespaceIdentifier() throws InvalidRegistryObjectException
  {
    return namespace;
  }

  public IContributor getContributor() throws InvalidRegistryObjectException
  {
    return null;
  }

  public String getExtensionPointUniqueIdentifier() throws InvalidRegistryObjectException
  {
    throw new UnsupportedOperationException();
  }

  public String getLabel() throws InvalidRegistryObjectException
  {
    throw new UnsupportedOperationException();
  }

  public String getSimpleIdentifier() throws InvalidRegistryObjectException
  {
    throw new UnsupportedOperationException();
  }

  public String getUniqueIdentifier() throws InvalidRegistryObjectException
  {
    return namespace + "." + id;
  }

  public boolean isValid()
  {
    throw new UnsupportedOperationException();
  }
}

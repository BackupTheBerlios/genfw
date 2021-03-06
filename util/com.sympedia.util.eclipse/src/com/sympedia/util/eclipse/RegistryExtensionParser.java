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
package com.sympedia.util.eclipse;


public class RegistryExtensionParser extends ExtensionParser
{
  protected ElementRegistry registry;

  public RegistryExtensionParser()
  {
  }

  public RegistryExtensionParser(ElementRegistry registry)
  {
    this.registry = registry;
  }

  public ElementRegistry getRegistry()
  {
    if (registry == null)
    {
      registry = new ElementRegistry();
    }

    return registry;
  }

  public void setRegistry(ElementRegistry registry)
  {
    this.registry = registry;
  }

  protected void validate(Element elementData)
  {
    super.validate(elementData);

    if (elementData instanceof ElementRegistry.Item)
    {
      getRegistry().put((ElementRegistry.Item)elementData);
    }
  }
}

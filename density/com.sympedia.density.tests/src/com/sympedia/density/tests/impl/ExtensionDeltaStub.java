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


import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionDelta;
import org.eclipse.core.runtime.IExtensionPoint;


public class ExtensionDeltaStub implements IExtensionDelta
{
  protected int kind;

  protected ExtensionStub extension;

  protected ExtensionPointStub extensionPoint;

  public ExtensionDeltaStub(int kind, ExtensionStub extension, ExtensionPointStub extensionPoint)
  {
    this.kind = kind;
    this.extension = extension;
    this.extensionPoint = extensionPoint;
  }

  public int getKind()
  {
    return kind;
  }

  public IExtension getExtension()
  {
    return extension;
  }

  public IExtensionPoint getExtensionPoint()
  {
    return extensionPoint;
  }
}

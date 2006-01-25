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
package com.sympedia.density.tests;


import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;


public interface IExtensionPointStub extends IExtensionPoint
{
  public IExtension addExtension(String extensionId);

  public void removeExtension(String extensionId);

  public void addExtensionPointStubListener(IExtensionPointStubListener listener);

  public void removeExtensionPointStubListener(IExtensionPointStubListener listener);
}

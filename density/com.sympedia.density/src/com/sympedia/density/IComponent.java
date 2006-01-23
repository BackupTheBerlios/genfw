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
package com.sympedia.density;


import java.util.List;


public interface IComponent extends IContextProvider, IEventNotifier, IEventListener
{
  public static final int REFTYPE_NORMAL = 0x01;

  public static final int REFTYPE_EVENT = 0x02;

  public static final int REFTYPE_CONTAINMENT = 0x04;

  public static final int REFTYPE_ALL = REFTYPE_NORMAL | REFTYPE_CONTAINMENT | REFTYPE_EVENT;

  public boolean isInitialized();

  public boolean isDisposed();

  public List<IComponent> getAllReferences(int flags);

  public void dumpState();
}

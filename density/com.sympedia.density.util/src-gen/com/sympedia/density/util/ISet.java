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
package com.sympedia.density.util;


import com.sympedia.density.*;


public interface ISet extends com.sympedia.density.util.ICollection, java.util.Set
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Listener interface for Set events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface Listener extends IEventListener
  {

    public void notifySetElementAdded(ISet notifier, java.lang.Object element);

    public void notifySetElementRemoved(ISet notifier, java.lang.Object element);
  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Interfaces for client access to Set events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface SetEvent extends IEvent
  {
  	public ISet getNotifierSet();
  }


  public interface ElementAddedEvent extends SetEvent
  {
  	public java.lang.Object getElement();
  }

  public interface ElementRemovedEvent extends SetEvent
  {
  	public java.lang.Object getElement();
  }
}

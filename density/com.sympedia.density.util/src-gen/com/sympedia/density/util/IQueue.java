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


public interface IQueue extends com.sympedia.density.util.ICollection, java.util.Queue
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Listener interface for Queue events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface Listener extends IEventListener
  {

    public void notifyQueueElementEnqueued(IQueue notifier, java.lang.Object element);

    public void notifyQueueElementDequeued(IQueue notifier, java.lang.Object element);
  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Interfaces for client access to Queue events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface QueueEvent extends IEvent
  {
  	public IQueue getNotifierQueue();
  }


  public interface ElementEnqueuedEvent extends QueueEvent
  {
  	public java.lang.Object getElement();
  }

  public interface ElementDequeuedEvent extends QueueEvent
  {
  	public java.lang.Object getElement();
  }
}

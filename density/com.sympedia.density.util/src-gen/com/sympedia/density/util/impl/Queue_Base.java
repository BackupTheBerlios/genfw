package com.sympedia.density.util.impl;


import com.sympedia.density.util.IQueue;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class Queue_Base
  extends com.sympedia.density.util.impl.CollectionImpl
  implements IQueue
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public Queue_Base()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
  }

  @Override
  protected void doDispose() throws Exception
  {
    super.doDispose();
  }


  /////////////////////////////////////////////////////////////////////////////////////
  // Support classes and methods for Queue events
  /////////////////////////////////////////////////////////////////////////////////////

  protected abstract class QueueEventImpl extends Event_Base implements QueueEvent
  {
   	public QueueEventImpl()
  	{
  	  super(Queue_Base.this);
  	}

  	public IQueue getNotifierQueue()
  	{
  	  return (IQueue)getEventNotifier();
  	}

  	@Override
  	public String toString()
  	{
  	  return "QueueEvent";
  	}
  }

  protected class ElementEnqueuedEventImpl extends QueueEventImpl implements ElementEnqueuedEvent
  {
  	private java.lang.Object element;

   	public ElementEnqueuedEventImpl(java.lang.Object element)
  	{
    	this.element = element;
  	}

  	public java.lang.Object getElement()
  	{
  	  return element;
  	}

  	@Override
  	public String toString()
  	{
  	  return "QueueElementEnqueuedEvent"
        + " element=" + element;
  	}
  }

  protected void fireElementEnqueued(java.lang.Object element)
  {
    fireEvent(new ElementEnqueuedEventImpl(element));
  }
  protected class ElementDequeuedEventImpl extends QueueEventImpl implements ElementDequeuedEvent
  {
  	private java.lang.Object element;

   	public ElementDequeuedEventImpl(java.lang.Object element)
  	{
    	this.element = element;
  	}

  	public java.lang.Object getElement()
  	{
  	  return element;
  	}

  	@Override
  	public String toString()
  	{
  	  return "QueueElementDequeuedEvent"
        + " element=" + element;
  	}
  }

  protected void fireElementDequeued(java.lang.Object element)
  {
    fireEvent(new ElementDequeuedEventImpl(element));
  }


  /////////////////////////////////////////////////////////////////////////////////////
  // Context interface
  /////////////////////////////////////////////////////////////////////////////////////

  public interface IContext extends com.sympedia.density.util.impl.Collection_Base.IContext
  {
  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Introspection
  /////////////////////////////////////////////////////////////////////////////////////

  @Override
  protected void doFillReferences(List<IComponent> references, int flags)
  {
    super.doFillReferences(references, flags);
  }
}

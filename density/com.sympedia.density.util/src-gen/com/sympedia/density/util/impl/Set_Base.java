package com.sympedia.density.util.impl;


import com.sympedia.density.util.ISet;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class Set_Base
  extends com.sympedia.density.util.impl.CollectionImpl
  implements ISet
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public Set_Base()
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
  // Support classes and methods for Set events
  /////////////////////////////////////////////////////////////////////////////////////

  protected abstract class SetEventImpl extends Event_Base implements SetEvent
  {
   	public SetEventImpl()
  	{
  	  super(Set_Base.this);
  	}

  	public ISet getNotifierSet()
  	{
  	  return (ISet)getEventNotifier();
  	}

  	@Override
  	public String toString()
  	{
  	  return "SetEvent";
  	}
  }

  protected class ElementAddedEventImpl extends SetEventImpl implements ElementAddedEvent
  {
  	private java.lang.Object element;

   	public ElementAddedEventImpl(java.lang.Object element)
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
  	  return "SetElementAddedEvent"
        + " element=" + element;
  	}
  }

  protected void fireElementAdded(java.lang.Object element)
  {
    fireEvent(new ElementAddedEventImpl(element));
  }
  protected class ElementRemovedEventImpl extends SetEventImpl implements ElementRemovedEvent
  {
  	private java.lang.Object element;

   	public ElementRemovedEventImpl(java.lang.Object element)
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
  	  return "SetElementRemovedEvent"
        + " element=" + element;
  	}
  }

  protected void fireElementRemoved(java.lang.Object element)
  {
    fireEvent(new ElementRemovedEventImpl(element));
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

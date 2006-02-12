package com.sympedia.density.util.impl;


import com.sympedia.density.util.IList;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class List_Base
  extends com.sympedia.density.util.impl.CollectionImpl
  implements IList
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public List_Base()
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
  // Abstract implementations of the business methods to allow @Override
  /////////////////////////////////////////////////////////////////////////////////////

  public abstract java.lang.Object move(int fromIndex, int toIndex);

  /////////////////////////////////////////////////////////////////////////////////////
  // Support classes and methods for List events
  /////////////////////////////////////////////////////////////////////////////////////

  protected abstract class ListEventImpl extends Event_Base implements ListEvent
  {
   	public ListEventImpl()
  	{
  	  super(List_Base.this);
  	}

  	public IList getNotifierList()
  	{
  	  return (IList)getEventNotifier();
  	}

  	@Override
  	public String toString()
  	{
  	  return "ListEvent";
  	}
  }

  protected class ElementAddedEventImpl extends ListEventImpl implements ElementAddedEvent
  {
  	private java.lang.Object element;

  	private int toIndex;

   	public ElementAddedEventImpl(java.lang.Object element, int toIndex)
  	{
    	this.element = element;
    	this.toIndex = toIndex;
  	}

  	public java.lang.Object getElement()
  	{
  	  return element;
  	}

  	public int getToIndex()
  	{
  	  return toIndex;
  	}

  	@Override
  	public String toString()
  	{
  	  return "ListElementAddedEvent"
        + " element=" + element
        + " toIndex=" + toIndex;
  	}
  }

  protected void fireElementAdded(java.lang.Object element, int toIndex)
  {
    fireEvent(new ElementAddedEventImpl(element, toIndex));
  }
  protected class ElementMovedEventImpl extends ListEventImpl implements ElementMovedEvent
  {
  	private java.lang.Object element;

  	private int fromIndex;

  	private int toIndex;

   	public ElementMovedEventImpl(java.lang.Object element, int fromIndex, int toIndex)
  	{
    	this.element = element;
    	this.fromIndex = fromIndex;
    	this.toIndex = toIndex;
  	}

  	public java.lang.Object getElement()
  	{
  	  return element;
  	}

  	public int getFromIndex()
  	{
  	  return fromIndex;
  	}

  	public int getToIndex()
  	{
  	  return toIndex;
  	}

  	@Override
  	public String toString()
  	{
  	  return "ListElementMovedEvent"
        + " element=" + element
        + " fromIndex=" + fromIndex
        + " toIndex=" + toIndex;
  	}
  }

  protected void fireElementMoved(java.lang.Object element, int fromIndex, int toIndex)
  {
    fireEvent(new ElementMovedEventImpl(element, fromIndex, toIndex));
  }
  protected class ElementRemovedEventImpl extends ListEventImpl implements ElementRemovedEvent
  {
  	private java.lang.Object element;

  	private int fromIndex;

   	public ElementRemovedEventImpl(java.lang.Object element, int fromIndex)
  	{
    	this.element = element;
    	this.fromIndex = fromIndex;
  	}

  	public java.lang.Object getElement()
  	{
  	  return element;
  	}

  	public int getFromIndex()
  	{
  	  return fromIndex;
  	}

  	@Override
  	public String toString()
  	{
  	  return "ListElementRemovedEvent"
        + " element=" + element
        + " fromIndex=" + fromIndex;
  	}
  }

  protected void fireElementRemoved(java.lang.Object element, int fromIndex)
  {
    fireEvent(new ElementRemovedEventImpl(element, fromIndex));
  }
  protected class ElementReplacedEventImpl extends ListEventImpl implements ElementReplacedEvent
  {
  	private java.lang.Object element;

  	private int index;

  	private java.lang.Object oldElement;

   	public ElementReplacedEventImpl(java.lang.Object element, int index, java.lang.Object oldElement)
  	{
    	this.element = element;
    	this.index = index;
    	this.oldElement = oldElement;
  	}

  	public java.lang.Object getElement()
  	{
  	  return element;
  	}

  	public int getIndex()
  	{
  	  return index;
  	}

  	public java.lang.Object getOldElement()
  	{
  	  return oldElement;
  	}

  	@Override
  	public String toString()
  	{
  	  return "ListElementReplacedEvent"
        + " element=" + element
        + " index=" + index
        + " oldElement=" + oldElement;
  	}
  }

  protected void fireElementReplaced(java.lang.Object element, int index, java.lang.Object oldElement)
  {
    fireEvent(new ElementReplacedEventImpl(element, index, oldElement));
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

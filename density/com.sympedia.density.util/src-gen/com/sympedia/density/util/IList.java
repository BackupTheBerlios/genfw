package com.sympedia.density.util;


import com.sympedia.density.*;


public interface IList extends com.sympedia.density.util.ICollection, java.util.List
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Business methods
  /////////////////////////////////////////////////////////////////////////////////////

  public java.lang.Object move(int fromIndex, int toIndex);

      
  /////////////////////////////////////////////////////////////////////////////////////
  // Listener interface for List events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface Listener extends IEventListener
  {

    public void notifyListElementAdded(IList notifier, java.lang.Object element, int toIndex);

    public void notifyListElementMoved(IList notifier, java.lang.Object element, int fromIndex, int toIndex);

    public void notifyListElementRemoved(IList notifier, java.lang.Object element, int fromIndex);

    public void notifyListElementReplaced(IList notifier, java.lang.Object element, int index, java.lang.Object oldElement);

  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Interfaces for client access to List events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface ListEvent extends IEvent
  {
  	public IList getNotifierList();
  }


  public interface ElementAddedEvent extends ListEvent
  {
  	public java.lang.Object getElement();

  	public int getToIndex();
  }

  public interface ElementMovedEvent extends ListEvent
  {
  	public java.lang.Object getElement();

  	public int getFromIndex();

  	public int getToIndex();
  }

  public interface ElementRemovedEvent extends ListEvent
  {
  	public java.lang.Object getElement();

  	public int getFromIndex();
  }

  public interface ElementReplacedEvent extends ListEvent
  {
  	public java.lang.Object getElement();

  	public int getIndex();

  	public java.lang.Object getOldElement();
  }

}

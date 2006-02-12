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

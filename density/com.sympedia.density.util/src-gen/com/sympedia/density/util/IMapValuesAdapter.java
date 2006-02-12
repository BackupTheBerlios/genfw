package com.sympedia.density.util;


import com.sympedia.density.*;

public interface IMapValuesAdapter extends com.sympedia.density.util.ICollection
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Reference access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the map dependency.
   * @return the value of the map dependency.
   */
  public com.sympedia.density.util.IMap getMap();

  /**
   * Sets the value of the map dependency.
   * @parm map the new value of the map dependency.
   */
  public void setMap(com.sympedia.density.util.IMap map);

  /////////////////////////////////////////////////////////////////////////////////////
  // Listener interface for MapValuesAdapter events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface Listener extends IEventListener
  {

    public void notifyMapValuesAdapterElementAdded(IMapValuesAdapter notifier, java.lang.Object element);

    public void notifyMapValuesAdapterElementRemoved(IMapValuesAdapter notifier, java.lang.Object element);
  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Interfaces for client access to MapValuesAdapter events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface MapValuesAdapterEvent extends IEvent
  {
  	public IMapValuesAdapter getNotifierMapValuesAdapter();
  }


  public interface ElementAddedEvent extends MapValuesAdapterEvent
  {
  	public java.lang.Object getElement();
  }

  public interface ElementRemovedEvent extends MapValuesAdapterEvent
  {
  	public java.lang.Object getElement();
  }
}

package com.sympedia.density.util;


import com.sympedia.density.*;


public interface IMap extends IComponent, java.util.Map
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Business methods
  /////////////////////////////////////////////////////////////////////////////////////

  public java.lang.Object replaceKey(java.lang.Object oldKey, java.lang.Object newKey);

      
  /////////////////////////////////////////////////////////////////////////////////////
  // Attribute access
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the value of the containment property.
   * @return the value of the containment property.
   */
  public boolean isContainment();

  /**
   * Sets the value of the containment property.
   * @parm containment the new value of the containment property.
   */
  public void setContainment(boolean containment);

  /////////////////////////////////////////////////////////////////////////////////////
  // Listener interface for Map events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface Listener extends IEventListener
  {

    public void notifyMapEntryAdded(IMap notifier, java.lang.Object key, java.lang.Object value);

    public void notifyMapEntryReadded(IMap notifier, java.lang.Object key, java.lang.Object value, java.lang.Object oldKey);

    public void notifyMapEntryRemoved(IMap notifier, java.lang.Object key, java.lang.Object value);

  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Interfaces for client access to Map events
  /////////////////////////////////////////////////////////////////////////////////////

  public interface MapEvent extends IEvent
  {
  	public IMap getNotifierMap();
  }


  public interface EntryAddedEvent extends MapEvent
  {
  	public java.lang.Object getKey();

  	public java.lang.Object getValue();
  }

  public interface EntryReaddedEvent extends MapEvent
  {
  	public java.lang.Object getKey();

  	public java.lang.Object getValue();

  	public java.lang.Object getOldKey();
  }

  public interface EntryRemovedEvent extends MapEvent
  {
  	public java.lang.Object getKey();

  	public java.lang.Object getValue();
  }

}

package com.sympedia.density.util.impl;


import com.sympedia.density.util.IMapValuesAdapter;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class MapValuesAdapter_Base
  extends com.sympedia.density.util.impl.CollectionImpl
  implements IMapValuesAdapter, com.sympedia.density.util.IMap.Listener
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public MapValuesAdapter_Base()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    Assert.notNull(map, "Violated " + this + ".map != null");
  }

  @Override
  protected void doDispose() throws Exception
  {
    super.doDispose();
  }

  /**
   * The cached value of the map dependency.
   */
  private com.sympedia.density.util.IMap map;

  /**
   * Returns the value of the map dependency.
   * @return the value of the map dependency.
   */
  public com.sympedia.density.util.IMap getMap()
  {
  	return map;
  }

  /**
   * Sets the value of the map dependency.
   * @parm map the new value of the map dependency.
   */
  public void setMap(com.sympedia.density.util.IMap map)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting map = " + map);
    }

  	this.map = map;
  }


  /////////////////////////////////////////////////////////////////////////////////////
  // Support classes and methods for MapValuesAdapter events
  /////////////////////////////////////////////////////////////////////////////////////

  protected abstract class MapValuesAdapterEventImpl extends Event_Base implements MapValuesAdapterEvent
  {
   	public MapValuesAdapterEventImpl()
  	{
  	  super(MapValuesAdapter_Base.this);
  	}

  	public IMapValuesAdapter getNotifierMapValuesAdapter()
  	{
  	  return (IMapValuesAdapter)getEventNotifier();
  	}

  	@Override
  	public String toString()
  	{
  	  return "MapValuesAdapterEvent";
  	}
  }

  protected class ElementAddedEventImpl extends MapValuesAdapterEventImpl implements ElementAddedEvent
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
  	  return "MapValuesAdapterElementAddedEvent"
        + " element=" + element;
  	}
  }

  protected void fireElementAdded(java.lang.Object element)
  {
    fireEvent(new ElementAddedEventImpl(element));
  }
  protected class ElementRemovedEventImpl extends MapValuesAdapterEventImpl implements ElementRemovedEvent
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
  	  return "MapValuesAdapterElementRemovedEvent"
        + " element=" + element;
  	}
  }

  protected void fireElementRemoved(java.lang.Object element)
  {
    fireEvent(new ElementRemovedEventImpl(element));
  }

  /////////////////////////////////////////////////////////////////////////////////////
  // Empty handlers for incoming Map events
  /////////////////////////////////////////////////////////////////////////////////////


  public void notifyMapEntryAdded(com.sympedia.density.util.IMap notifier, java.lang.Object key, java.lang.Object value)
  {
  }

  public void notifyMapEntryReadded(com.sympedia.density.util.IMap notifier, java.lang.Object key, java.lang.Object value, java.lang.Object oldKey)
  {
  }

  public void notifyMapEntryRemoved(com.sympedia.density.util.IMap notifier, java.lang.Object key, java.lang.Object value)
  {
  }


  @Override
  protected void dispatchEvent(IEvent event)
  {
    if (event instanceof com.sympedia.density.util.IMap.EntryAddedEvent)
    {
      com.sympedia.density.util.IMap.EntryAddedEvent e =
        (com.sympedia.density.util.IMap.EntryAddedEvent)event;
      notifyMapEntryAdded(e.getNotifierMap()
  	    , e.getKey()
  	    , e.getValue()
      );
    } else
    if (event instanceof com.sympedia.density.util.IMap.EntryReaddedEvent)
    {
      com.sympedia.density.util.IMap.EntryReaddedEvent e =
        (com.sympedia.density.util.IMap.EntryReaddedEvent)event;
      notifyMapEntryReadded(e.getNotifierMap()
  	    , e.getKey()
  	    , e.getValue()
  	    , e.getOldKey()
      );
    } else
    if (event instanceof com.sympedia.density.util.IMap.EntryRemovedEvent)
    {
      com.sympedia.density.util.IMap.EntryRemovedEvent e =
        (com.sympedia.density.util.IMap.EntryRemovedEvent)event;
      notifyMapEntryRemoved(e.getNotifierMap()
  	    , e.getKey()
  	    , e.getValue()
      );
    } else
    {
      super.dispatchEvent(event);
    }
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
    if (map != null && (flags & IComponent.REFTYPE_NORMAL) != 0) references.add((IComponent)map);
  }
}

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
package com.sympedia.density.util.impl;


import com.sympedia.density.util.IMap;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class Map_Base
  extends Component_Base
  implements IMap
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public Map_Base()
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
  // Property implementations
  /////////////////////////////////////////////////////////////////////////////////////

  /**
   * The default value of the containment property.
   */
  public static final boolean DEFAULT_Containment = false;

  /**
   * The cached value of the containment property.
   */
  private boolean containment = DEFAULT_Containment;

  /**
   * Returns the value of the containment property.
   * @return the value of the containment property.
   */
  public boolean isContainment()
  {
  	return containment;
  }

  /**
   * Sets the value of the containment property.
   * @parm containment the new value of the containment property.
   */
  public void setContainment(boolean containment)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting containment = " + containment);
    }

  	this.containment = containment;
  }


  /////////////////////////////////////////////////////////////////////////////////////
  // Abstract implementations of the business methods to allow @Override
  /////////////////////////////////////////////////////////////////////////////////////

  public abstract java.lang.Object replaceKey(java.lang.Object oldKey, java.lang.Object newKey);

  /////////////////////////////////////////////////////////////////////////////////////
  // Support classes and methods for Map events
  /////////////////////////////////////////////////////////////////////////////////////

  protected abstract class MapEventImpl extends Event_Base implements MapEvent
  {
   	public MapEventImpl()
  	{
  	  super(Map_Base.this);
  	}

  	public IMap getNotifierMap()
  	{
  	  return (IMap)getEventNotifier();
  	}

  	@Override
  	public String toString()
  	{
  	  return "MapEvent";
  	}
  }

  protected class EntryAddedEventImpl extends MapEventImpl implements EntryAddedEvent
  {
  	private java.lang.Object key;

  	private java.lang.Object value;

   	public EntryAddedEventImpl(java.lang.Object key, java.lang.Object value)
  	{
    	this.key = key;
    	this.value = value;
  	}

  	public java.lang.Object getKey()
  	{
  	  return key;
  	}

  	public java.lang.Object getValue()
  	{
  	  return value;
  	}

  	@Override
  	public String toString()
  	{
  	  return "MapEntryAddedEvent"
        + " key=" + key
        + " value=" + value;
  	}
  }

  protected void fireEntryAdded(java.lang.Object key, java.lang.Object value)
  {
    fireEvent(new EntryAddedEventImpl(key, value));
  }
  protected class EntryReaddedEventImpl extends MapEventImpl implements EntryReaddedEvent
  {
  	private java.lang.Object key;

  	private java.lang.Object value;

  	private java.lang.Object oldKey;

   	public EntryReaddedEventImpl(java.lang.Object key, java.lang.Object value, java.lang.Object oldKey)
  	{
    	this.key = key;
    	this.value = value;
    	this.oldKey = oldKey;
  	}

  	public java.lang.Object getKey()
  	{
  	  return key;
  	}

  	public java.lang.Object getValue()
  	{
  	  return value;
  	}

  	public java.lang.Object getOldKey()
  	{
  	  return oldKey;
  	}

  	@Override
  	public String toString()
  	{
  	  return "MapEntryReaddedEvent"
        + " key=" + key
        + " value=" + value
        + " oldKey=" + oldKey;
  	}
  }

  protected void fireEntryReadded(java.lang.Object key, java.lang.Object value, java.lang.Object oldKey)
  {
    fireEvent(new EntryReaddedEventImpl(key, value, oldKey));
  }
  protected class EntryRemovedEventImpl extends MapEventImpl implements EntryRemovedEvent
  {
  	private java.lang.Object key;

  	private java.lang.Object value;

   	public EntryRemovedEventImpl(java.lang.Object key, java.lang.Object value)
  	{
    	this.key = key;
    	this.value = value;
  	}

  	public java.lang.Object getKey()
  	{
  	  return key;
  	}

  	public java.lang.Object getValue()
  	{
  	  return value;
  	}

  	@Override
  	public String toString()
  	{
  	  return "MapEntryRemovedEvent"
        + " key=" + key
        + " value=" + value;
  	}
  }

  protected void fireEntryRemoved(java.lang.Object key, java.lang.Object value)
  {
    fireEvent(new EntryRemovedEventImpl(key, value));
  }


  /////////////////////////////////////////////////////////////////////////////////////
  // Context interface
  /////////////////////////////////////////////////////////////////////////////////////

  public interface IContext extends com.sympedia.density.IContext
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

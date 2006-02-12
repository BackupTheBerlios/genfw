package com.sympedia.density.util.impl;


import com.sympedia.density.util.IMapPrioritizer;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class MapPrioritizer_Base
  extends Component_Base
  implements IMapPrioritizer, com.sympedia.density.util.IMap.Listener
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public MapPrioritizer_Base()
  {
  }

  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    Assert.notNull(highPriority, "Violated " + this + ".highPriority != null");
    Assert.notNull(lowPriority, "Violated " + this + ".lowPriority != null");
    Assert.notNull(result, "Violated " + this + ".result != null");
  }

  @Override
  protected void doDispose() throws Exception
  {
    super.doDispose();
  }

  /**
   * The cached value of the highPriority dependency.
   */
  private com.sympedia.density.util.IMap highPriority;

  /**
   * Returns the value of the highPriority dependency.
   * @return the value of the highPriority dependency.
   */
  public com.sympedia.density.util.IMap getHighPriority()
  {
  	return highPriority;
  }

  /**
   * Sets the value of the highPriority dependency.
   * @parm highPriority the new value of the highPriority dependency.
   */
  public void setHighPriority(com.sympedia.density.util.IMap highPriority)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting highPriority = " + highPriority);
    }

  	this.highPriority = highPriority;
  }

  /**
   * The cached value of the lowPriority dependency.
   */
  private com.sympedia.density.util.IMap lowPriority;

  /**
   * Returns the value of the lowPriority dependency.
   * @return the value of the lowPriority dependency.
   */
  public com.sympedia.density.util.IMap getLowPriority()
  {
  	return lowPriority;
  }

  /**
   * Sets the value of the lowPriority dependency.
   * @parm lowPriority the new value of the lowPriority dependency.
   */
  public void setLowPriority(com.sympedia.density.util.IMap lowPriority)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting lowPriority = " + lowPriority);
    }

  	this.lowPriority = lowPriority;
  }

  /**
   * The cached value of the result dependency.
   */
  private com.sympedia.density.util.IMap result;

  /**
   * Returns the value of the result dependency.
   * @return the value of the result dependency.
   */
  public com.sympedia.density.util.IMap getResult()
  {
  	return result;
  }

  /**
   * Sets the value of the result dependency.
   * @parm result the new value of the result dependency.
   */
  public void setResult(com.sympedia.density.util.IMap result)
  {
    if (isInitialized() && getLogger().isDebugEnabled())
    {
      getLogger().debug("Setting result = " + result);
    }

  	this.result = result;
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
    if (highPriority != null && (flags & IComponent.REFTYPE_NORMAL) != 0) references.add((IComponent)highPriority);
    if (lowPriority != null && (flags & IComponent.REFTYPE_NORMAL) != 0) references.add((IComponent)lowPriority);
    if (result != null && (flags & IComponent.REFTYPE_NORMAL) != 0) references.add((IComponent)result);
  }
}

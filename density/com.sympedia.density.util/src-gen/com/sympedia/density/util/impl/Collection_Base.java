package com.sympedia.density.util.impl;


import com.sympedia.density.util.ICollection;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class Collection_Base
  extends Component_Base
  implements ICollection
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public Collection_Base()
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

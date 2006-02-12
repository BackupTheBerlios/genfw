package com.sympedia.density.util;


import com.sympedia.density.*;

public interface IMapKeysAdapter extends com.sympedia.density.util.ISet
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

}

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

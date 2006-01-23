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


import java.util.HashMap;
import java.util.Map;


public class HashMapImpl extends HashMap_Base
{
  public HashMapImpl()
  {
  }

  @Override
  protected Map createData()
  {
    return new HashMap(getInitialCapacity(), getLoadFactor());
  }
}

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


import java.util.Collection;
import java.util.HashSet;


public class HashSetImpl extends HashSet_Base
{
  public HashSetImpl()
  {
  }

  @Override
  protected Collection createData()
  {
    return new HashSet(getInitialCapacity(), getLoadFactor());
  }
}

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
package com.sympedia.density.util.concurrent.impl;


import com.sympedia.density.util.concurrent.IExecutor;
import com.sympedia.density.*;
import com.sympedia.density.impl.*;
import com.sympedia.util.*;
import java.util.*;


public abstract class Executor_Base
  extends Component_Base
  implements IExecutor
{
  /////////////////////////////////////////////////////////////////////////////////////
  // Object creation and lyfecycle
  /////////////////////////////////////////////////////////////////////////////////////

  public Executor_Base()
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

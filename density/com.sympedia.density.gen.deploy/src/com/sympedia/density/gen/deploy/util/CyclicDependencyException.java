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
package com.sympedia.density.gen.deploy.util;


import com.sympedia.density.gen.deploy.Deployment;


public class CyclicDependencyException extends RuntimeException
{
  private static final long serialVersionUID = -7684917951911293081L;

  private Deployment source;

  private Deployment target;

  private boolean explicit;

  public CyclicDependencyException(Deployment source, Deployment target, boolean explicit)
  {
    super("source=" + source + ", target=" + target + ", explicit=" + explicit);
    this.source = source;
    this.target = target;
    this.explicit = explicit;
  }

  public boolean isExplicit()
  {
    return explicit;
  }

  public Deployment getSource()
  {
    return source;
  }

  public Deployment getTarget()
  {
    return target;
  }
}

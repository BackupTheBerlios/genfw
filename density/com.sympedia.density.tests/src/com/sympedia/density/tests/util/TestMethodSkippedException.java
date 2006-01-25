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
package com.sympedia.density.tests.util;


public class TestMethodSkippedException extends RuntimeException
{
  private static final long serialVersionUID = 6791309919117141070L;

  public TestMethodSkippedException()
  {
  }

  public TestMethodSkippedException(String message)
  {
    super(message);
  }

  public TestMethodSkippedException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public TestMethodSkippedException(Throwable cause)
  {
    super(cause);
  }
}

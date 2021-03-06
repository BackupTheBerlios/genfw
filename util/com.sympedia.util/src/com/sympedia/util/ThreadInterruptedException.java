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
package com.sympedia.util;


public class ThreadInterruptedException extends RuntimeException
{
  /**
   * 
   */
  private static final long serialVersionUID = 3256443603340244792L;

  /**
   * 
   */
  public ThreadInterruptedException()
  {
    super();
  }

  /**
   * @param message
   */
  public ThreadInterruptedException(String message)
  {
    super(message);
  }

  /**
   * @param cause
   */
  public ThreadInterruptedException(Throwable cause)
  {
    super(cause);
  }

  /**
   * @param message
   * @param cause
   */
  public ThreadInterruptedException(String message, Throwable cause)
  {
    super(message, cause);
  }
}

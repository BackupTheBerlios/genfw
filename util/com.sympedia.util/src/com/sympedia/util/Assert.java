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


public final class Assert
{
  /* This class is not intended to be instantiated. */
  private Assert()
  {
  }

  public static void notNull(Object object)
  {
    notNull(object, null);
  }

  public static void notNull(Object object, String message)
  {
    if (object == null) exception(message);
  }

  public static void isTrue(boolean expression)
  {
    isTrue(expression, null);
  }

  public static void isTrue(boolean expression, String message)
  {
    if (!expression) exception(message);
  }

  public static void equals(Object val1, Object val2)
  {
    equals(val1, val2, null);
  }

  public static void equals(Object val1, Object val2, String message)
  {
    if (val1 == null)
    {
      if (val2 != null) exception(message);
    }
    else
    {
      if (!val1.equals(val2)) exception(message);
    }
  }

  public static void fail()
  {
    fail(null);
  }

  public static void fail(String message)
  {
    isTrue(false, message);
  }

  private static void exception(String message)
  {
    throw new AssertionFailedError("Assertion failed" + (message == null ? "" : ": " + message)); //$NON-NLS-1$    
  }
}

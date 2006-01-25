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
package tutorial1;


public class EqualityHelper
{
  public static boolean equals(boolean a, boolean b)
  {
    return a == b;
  }

  public static boolean equals(char a, char b)
  {
    return a == b;
  }

  public static boolean equals(byte a, byte b)
  {
    return a == b;
  }

  public static boolean equals(short a, short b)
  {
    return a == b;
  }

  public static boolean equals(int a, int b)
  {
    return a == b;
  }

  public static boolean equals(long a, long b)
  {
    return a == b;
  }

  public static boolean equals(float a, float b)
  {
    return a == b;
  }

  public static boolean equals(double a, double b)
  {
    return a == b;
  }

  public static boolean equals(Object a, Object b)
  {
    if (a == null) return b == null;
    return a.equals(b);
  }
}

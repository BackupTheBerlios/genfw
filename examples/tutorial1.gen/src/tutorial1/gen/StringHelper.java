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
package tutorial1.gen;

public class StringHelper
{
  public static String capitalize(String text)
  {
    if (text == null || text.length() == 0)
    {
      return text;
    }

    if (Character.isLowerCase(text.charAt(0)))
    {
      return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    return text;
  }
}

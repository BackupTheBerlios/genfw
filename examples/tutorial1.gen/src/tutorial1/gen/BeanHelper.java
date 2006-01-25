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


import tutorial1.gen.beans.Bean;
import tutorial1.gen.beans.BeanProperty;

import java.util.Iterator;


public class BeanHelper
{
  public static String formatParameters(Bean bean, boolean withTypes)
  {
    StringBuffer buffer = new StringBuffer();
    for (Iterator it = bean.getProperties().iterator(); it.hasNext();)
    {
      BeanProperty prop = (BeanProperty)it.next();
      if (withTypes)
      {
        buffer.append(prop.getTypeName());
        buffer.append(" ");
      }
      buffer.append(prop.getName());
      if (it.hasNext()) buffer.append(", ");
    }

    return buffer.toString();
  }
}

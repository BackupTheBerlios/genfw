package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.ecore.*;
import com.sympedia.density.gen.deploy.*;

public class ContainerInterface
{
  protected static String nl;
  public static synchronized ContainerInterface create(String lineSeparator)
  {
    nl = lineSeparator;
    ContainerInterface result = new ContainerInterface();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "" + NL + "import com.sympedia.density.*;" + NL + "" + NL + "" + NL + "public interface I";
  protected final String TEXT_3 = " extends IContainer " + NL + "{";
  protected final String TEXT_4 = NL + "  public ";
  protected final String TEXT_5 = " get";
  protected final String TEXT_6 = "();";
  protected final String TEXT_7 = NL + "}";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
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

Container container = (Container)argument;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(container.getPackageName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(container.getName());
    stringBuffer.append(TEXT_3);
    for (Iterator it = container.getAllDeployments().iterator(); it.hasNext();) { Deployment deployment = (Deployment)it.next();
    stringBuffer.append(TEXT_4);
    stringBuffer.append(GenUtil.getTypeName(deployment.getComponent()));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}

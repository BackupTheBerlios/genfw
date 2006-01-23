package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.ecore.*;

public class EnumDecl
{
  protected static String nl;
  public static synchronized EnumDecl create(String lineSeparator)
  {
    nl = lineSeparator;
    EnumDecl result = new EnumDecl();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "" + NL + "import com.sympedia.density.*;" + NL + "import com.sympedia.density.impl.*;" + NL + "import com.sympedia.util.*;" + NL + "import java.util.*;" + NL + "" + NL + "" + NL + "public enum ";
  protected final String TEXT_3 = NL + "{";
  protected final String TEXT_4 = NL + "  ";
  protected final String TEXT_5 = "/*(";
  protected final String TEXT_6 = ")*/";
  protected final String TEXT_7 = ", ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL + "}";
  protected final String TEXT_10 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
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

EEnum e = (EEnum)argument;
EPackage ePackage = e.getEPackage();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(GenUtil.getFullPackageName(ePackage));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(e.getName());
    stringBuffer.append(TEXT_3);
    for (Iterator it = e.getELiterals() .iterator(); it.hasNext();) { EEnumLiteral lit = (EEnumLiteral)it.next();
    stringBuffer.append(TEXT_4);
    stringBuffer.append(lit.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(lit.getValue());
    stringBuffer.append(TEXT_6);
    if(it.hasNext()) {
    stringBuffer.append(TEXT_7);
    } else {
    stringBuffer.append(TEXT_8);
    }
    }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}

package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.ecore.*;

public class ComponentImpl
{
  protected static String nl;
  public static synchronized ComponentImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ComponentImpl result = new ComponentImpl();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".impl;" + NL + "" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".I";
  protected final String TEXT_4 = ";" + NL + "import com.sympedia.density.*;" + NL + "import com.sympedia.density.impl.*;" + NL + "import com.sympedia.util.*;" + NL + "import java.util.*;" + NL + "" + NL + "" + NL + "public ";
  protected final String TEXT_5 = "abstract ";
  protected final String TEXT_6 = "class ";
  protected final String TEXT_7 = "Impl extends ";
  protected final String TEXT_8 = "_Base" + NL + "{" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Object creation and lyfecycle" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  public ";
  protected final String TEXT_9 = "Impl()" + NL + "  {" + NL + "  }" + NL + "" + NL + "  @Override" + NL + "  protected void doInitialize() throws Exception" + NL + "  {" + NL + "    super.doInitialize();" + NL + "  }" + NL + "" + NL + "  @Override" + NL + "  protected void doDispose() throws Exception" + NL + "  {" + NL + "    super.doDispose();" + NL + "  }" + NL;
  protected final String TEXT_10 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Empty handlers for incoming ";
  protected final String TEXT_11 = " events" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_12 = NL + "  @Override" + NL + "  public void notify";
  protected final String TEXT_13 = "Changed(";
  protected final String TEXT_14 = " notifier, ";
  protected final String TEXT_15 = " newValue, ";
  protected final String TEXT_16 = " oldValue)" + NL + "  {" + NL + "  }";
  protected final String TEXT_17 = NL + "  public void notify";
  protected final String TEXT_18 = "(";
  protected final String TEXT_19 = " notifier, ";
  protected final String TEXT_20 = ")" + NL + "  {" + NL + "  }";
  protected final String TEXT_21 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Implementations of the business methods" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_22 = NL + "  @Override" + NL + "  public ";
  protected final String TEXT_23 = " ";
  protected final String TEXT_24 = "(";
  protected final String TEXT_25 = ")";
  protected final String TEXT_26 = NL + "  {" + NL + "    // TODO Implement ";
  protected final String TEXT_27 = ".";
  protected final String TEXT_28 = NL + "    throw new UnsupportedOperationException();" + NL + "  }" + NL + "  ";
  protected final String TEXT_29 = NL + "}";
  protected final String TEXT_30 = NL;

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

EClass eClass = (EClass)argument;
EPackage ePackage = eClass.getEPackage();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(GenUtil.getFullPackageName(ePackage));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(GenUtil.getFullPackageName(ePackage));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_4);
    if (eClass.isAbstract()) {
    stringBuffer.append(TEXT_5);
    }
    stringBuffer.append(TEXT_6);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_9);
    if (GenUtil.hasListenerReferences(eClass)) {
    for (Iterator it1 = GenUtil.getListenerInterfaces(eClass).iterator(); it1.hasNext();) { 
    EClass target = (EClass)it1.next();
    stringBuffer.append(TEXT_10);
    stringBuffer.append(target.getName());
    stringBuffer.append(TEXT_11);
    for (Iterator it = target.getEAttributes().iterator(); it.hasNext();) { 
      EAttribute attr = (EAttribute)it.next(); 
      if (Annotations.isSignalAttribute(attr)) {
    stringBuffer.append(TEXT_12);
    stringBuffer.append(target.getName());
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    stringBuffer.append(GenUtil.newline(!target.getEOperations().isEmpty()));
    for (Iterator it = target.getEOperations().iterator(); it.hasNext();) { 
      EOperation op = (EOperation)it.next(); 
      if (Annotations.isSignalOperation(op)) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(target.getName());
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    }
    }
    if (GenUtil.hasBusinessMethods(eClass)) {
    stringBuffer.append(TEXT_21);
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) { 
    EOperation op = (EOperation)it.next(); 
    if (GenUtil.isBusinessMethod(op)) {
    stringBuffer.append(TEXT_22);
    stringBuffer.append(GenUtil.getTypeName(op.getEType()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(GenUtil.getThrowsClause(op));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_28);
    }
    }
    }
    stringBuffer.append(TEXT_29);
    stringBuffer.append(TEXT_30);
    return stringBuffer.toString();
  }
}

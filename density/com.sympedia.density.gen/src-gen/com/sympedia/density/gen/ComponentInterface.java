package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;

public class ComponentInterface
{
  protected static String nl;
  public static synchronized ComponentInterface create(String lineSeparator)
  {
    nl = lineSeparator;
    ComponentInterface result = new ComponentInterface();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "" + NL + "import com.sympedia.density.*;" + NL + "" + NL + "" + NL + "public interface I";
  protected final String TEXT_3 = NL + "{";
  protected final String TEXT_4 = NL + "  public enum ";
  protected final String TEXT_5 = " {";
  protected final String TEXT_6 = "};" + NL;
  protected final String TEXT_7 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Business methods" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_8 = NL + "  public ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = "(";
  protected final String TEXT_11 = ")";
  protected final String TEXT_12 = ";" + NL;
  protected final String TEXT_13 = NL + "  public ";
  protected final String TEXT_14 = " ";
  protected final String TEXT_15 = "(";
  protected final String TEXT_16 = ");" + NL;
  protected final String TEXT_17 = NL + "    ";
  protected final String TEXT_18 = "  ";
  protected final String TEXT_19 = NL + "  public ";
  protected final String TEXT_20 = " ";
  protected final String TEXT_21 = "(";
  protected final String TEXT_22 = ");" + NL;
  protected final String TEXT_23 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Attribute access" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_24 = NL + "  /**" + NL + "   * Returns the value of the ";
  protected final String TEXT_25 = " property." + NL + "   * @return the value of the ";
  protected final String TEXT_26 = " property." + NL + "   */" + NL + "  public ";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = "();" + NL + "" + NL + "  /**" + NL + "   * Sets the value of the ";
  protected final String TEXT_29 = " property." + NL + "   * @parm ";
  protected final String TEXT_30 = " the new value of the ";
  protected final String TEXT_31 = " property." + NL + "   */" + NL + "  public void set";
  protected final String TEXT_32 = "(";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = ");" + NL;
  protected final String TEXT_35 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Reference access" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  /**" + NL + "   * Returns the value of the ";
  protected final String TEXT_36 = " dependency." + NL + "   * @return the value of the ";
  protected final String TEXT_37 = " dependency." + NL + "   */" + NL + "  public ";
  protected final String TEXT_38 = " get";
  protected final String TEXT_39 = "();" + NL + "" + NL + "  /**" + NL + "   * Sets the value of the ";
  protected final String TEXT_40 = " dependency." + NL + "   * @parm ";
  protected final String TEXT_41 = " the new value of the ";
  protected final String TEXT_42 = " dependency." + NL + "   */" + NL + "  public void set";
  protected final String TEXT_43 = "(";
  protected final String TEXT_44 = " ";
  protected final String TEXT_45 = ");" + NL;
  protected final String TEXT_46 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Listener interface for ";
  protected final String TEXT_47 = " events" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  public interface Listener extends IEventListener" + NL + "  {";
  protected final String TEXT_48 = NL + "    public void notify";
  protected final String TEXT_49 = "Changed(I";
  protected final String TEXT_50 = " notifier, ";
  protected final String TEXT_51 = " newValue, ";
  protected final String TEXT_52 = " oldValue);";
  protected final String TEXT_53 = NL + "    public void notify";
  protected final String TEXT_54 = "(I";
  protected final String TEXT_55 = " notifier";
  protected final String TEXT_56 = ", ";
  protected final String TEXT_57 = ");";
  protected final String TEXT_58 = NL + "  }" + NL + "" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Interfaces for client access to ";
  protected final String TEXT_59 = " events" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  public interface ";
  protected final String TEXT_60 = "Event extends IEvent" + NL + "  {" + NL + "  \tpublic I";
  protected final String TEXT_61 = " getNotifier";
  protected final String TEXT_62 = "();" + NL + "  }" + NL;
  protected final String TEXT_63 = NL + "  public interface ";
  protected final String TEXT_64 = "ChangedEvent extends ";
  protected final String TEXT_65 = "Event" + NL + "  {" + NL + "  \tpublic ";
  protected final String TEXT_66 = " getNewValue();" + NL + "" + NL + "  \tpublic ";
  protected final String TEXT_67 = " getOldValue();" + NL + "  }";
  protected final String TEXT_68 = NL;
  protected final String TEXT_69 = NL + "  public interface ";
  protected final String TEXT_70 = "Event extends ";
  protected final String TEXT_71 = "Event" + NL + "  {";
  protected final String TEXT_72 = NL + "  \tpublic ";
  protected final String TEXT_73 = " get";
  protected final String TEXT_74 = "();";
  protected final String TEXT_75 = NL + "  }";
  protected final String TEXT_76 = NL + "}";
  protected final String TEXT_77 = NL;

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
    stringBuffer.append(eClass.getName());
    stringBuffer.append(GenUtil.getInterfaceExtendsClause(eClass));
    stringBuffer.append(TEXT_3);
    EList enumDefs = GenUtil.getEnumDefs(eClass); 
if (!enumDefs.isEmpty()) {
    for (Iterator it = enumDefs.iterator(); it.hasNext();) { 
    EEnum enumDef = (EEnum)it.next();
    stringBuffer.append(TEXT_4);
    stringBuffer.append(enumDef.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(GenUtil.getEnumDef(enumDef));
    stringBuffer.append(TEXT_6);
    }
    }
    if (GenUtil.hasBusinessMethods(eClass) || Annotations.getLegacyMethods(eClass).length() > 0) {
    stringBuffer.append(TEXT_7);
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) { 
    EOperation op = (EOperation)it.next(); 
    if (GenUtil.isBusinessMethod(op)) {
    stringBuffer.append(TEXT_8);
    stringBuffer.append(GenUtil.getTypeName(op.getEType()));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(GenUtil.getThrowsClause(op));
    stringBuffer.append(TEXT_12);
    }
    }
    for (Iterator it = GenUtil.getWrapMethods(eClass).iterator(); it.hasNext();) { 
    java.lang.reflect.Method method = (java.lang.reflect.Method)it.next();
    stringBuffer.append(TEXT_13);
    stringBuffer.append(method.getReturnType().getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(method.getName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(GenUtil.getParameters(method));
    stringBuffer.append(TEXT_16);
    }
    String[] lines = Annotations.getLegacyMethods(eClass).split("\t"); 
  for (int i = 0; i < lines.length; ++i) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(lines[i]);
    stringBuffer.append(TEXT_18);
    }
    }
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) { 
  EOperation op = (EOperation)it.next(); 
  if (Annotations.isCreatorOperation(op) && Annotations.isCreatorAccess(op)) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(GenUtil.getTypeName(op.getEType()));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_22);
    }
    }
    if (!eClass.getEAttributes().isEmpty()) {
    stringBuffer.append(TEXT_23);
    for (Iterator it = eClass.getEAttributes().iterator(); it.hasNext();) { 
    EAttribute attr = (EAttribute)it.next();
    stringBuffer.append(TEXT_24);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(GenUtil.getGetterName(attr));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_30);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_34);
    }
    }
    for (Iterator it = eClass.getEReferences().iterator(); it.hasNext();) { 
  EReference ref = (EReference)it.next(); 
  if (!Annotations.isListenerReference(ref) || Annotations.isListenerAccess(ref)) {
    stringBuffer.append(TEXT_35);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(GenUtil.getTypeName(ref));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(GenUtil.capitalize(ref.getName()));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(GenUtil.capitalize(ref.getName()));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(GenUtil.getTypeName(ref));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_45);
    }
    }
    if (GenUtil.hasSignals(eClass)) {
    stringBuffer.append(TEXT_46);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_47);
    for (Iterator it = eClass.getEAttributes().iterator(); it.hasNext();) { 
    EAttribute attr = (EAttribute)it.next(); 
    if (Annotations.isSignalAttribute(attr)) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    stringBuffer.append(GenUtil.newline(!eClass.getEOperations().isEmpty()));
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) { 
    EOperation op = (EOperation)it.next(); 
      if (Annotations.isSignalOperation(op)) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_55);
    String parms = GenUtil.getParameters(op); if (parms.length() != 0) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(parms);
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_61);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_62);
    for (Iterator it = eClass.getEAttributes().iterator(); it.hasNext();) { 
    EAttribute attr = (EAttribute)it.next(); 
    if (Annotations.isSignalAttribute(attr)) {
    stringBuffer.append(TEXT_63);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_67);
    }
    }
    stringBuffer.append(TEXT_68);
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) { 
    EOperation op = (EOperation)it.next(); 
    if (Annotations.isSignalOperation(op)) {
    stringBuffer.append(TEXT_69);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_71);
    for (Iterator it2 = op.getEParameters().iterator(); it2.hasNext();) { 
      EParameter parm = (EParameter)it2.next();
    stringBuffer.append(TEXT_72);
    stringBuffer.append(GenUtil.getTypeName(parm.getEType()));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(GenUtil.capitalize(parm.getName()));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(GenUtil.newline(it2.hasNext()));
    }
    stringBuffer.append(TEXT_75);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    }
    stringBuffer.append(TEXT_76);
    stringBuffer.append(TEXT_77);
    return stringBuffer.toString();
  }
}

package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.ecore.*;

public class ComponentBase
{
  protected static String nl;
  public static synchronized ComponentBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ComponentBase result = new ComponentBase();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".impl;" + NL + "" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".I";
  protected final String TEXT_4 = ";" + NL + "import com.sympedia.density.*;" + NL + "import com.sympedia.density.impl.*;" + NL + "import com.sympedia.util.*;" + NL + "import java.util.*;" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_5 = "_Base";
  protected final String TEXT_6 = NL + "  ";
  protected final String TEXT_7 = NL + "  implements I";
  protected final String TEXT_8 = NL + "{" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Object creation and lyfecycle" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  public ";
  protected final String TEXT_9 = "_Base()" + NL + "  {" + NL + "  }" + NL + "" + NL + "  @Override" + NL + "  protected void doInitialize() throws Exception" + NL + "  {" + NL + "    super.doInitialize();";
  protected final String TEXT_10 = NL + "    Assert.notNull(";
  protected final String TEXT_11 = ", \"Violated \" + this + \".";
  protected final String TEXT_12 = " != null\");";
  protected final String TEXT_13 = NL + "    Assert.notNull(";
  protected final String TEXT_14 = ", \"Violated \" + this + \".";
  protected final String TEXT_15 = " != null\");";
  protected final String TEXT_16 = NL + "  }" + NL + "" + NL + "  @Override" + NL + "  protected void doDispose() throws Exception" + NL + "  {";
  protected final String TEXT_17 = NL + "    BeanHelper.dispose(";
  protected final String TEXT_18 = ");";
  protected final String TEXT_19 = NL + "    super.doDispose();" + NL + "  }" + NL;
  protected final String TEXT_20 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Property implementations" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_21 = NL + "  /**" + NL + "   * The default value of the ";
  protected final String TEXT_22 = " property." + NL + "   */" + NL + "  public static final ";
  protected final String TEXT_23 = " DEFAULT_";
  protected final String TEXT_24 = " = ";
  protected final String TEXT_25 = ";" + NL;
  protected final String TEXT_26 = NL + "  /**" + NL + "   * The cached value of the ";
  protected final String TEXT_27 = " property." + NL + "   */" + NL + "  private ";
  protected final String TEXT_28 = " ";
  protected final String TEXT_29 = " = DEFAULT_";
  protected final String TEXT_30 = ";" + NL + "" + NL + "  /**" + NL + "   * Returns the value of the ";
  protected final String TEXT_31 = " property." + NL + "   * @return the value of the ";
  protected final String TEXT_32 = " property." + NL + "   */" + NL + "  public ";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = "()" + NL + "  {" + NL + "  \treturn ";
  protected final String TEXT_35 = ";" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * Sets the value of the ";
  protected final String TEXT_36 = " property." + NL + "   * @parm ";
  protected final String TEXT_37 = " the new value of the ";
  protected final String TEXT_38 = " property." + NL + "   */" + NL + "  public void set";
  protected final String TEXT_39 = "(";
  protected final String TEXT_40 = " ";
  protected final String TEXT_41 = ")" + NL + "  {" + NL + "    if (isInitialized() && getLogger().isDebugEnabled())" + NL + "    {" + NL + "      getLogger().debug(\"Setting ";
  protected final String TEXT_42 = " = \" + ";
  protected final String TEXT_43 = ");" + NL + "    }" + NL;
  protected final String TEXT_44 = NL + "  \tif (!equals(this.";
  protected final String TEXT_45 = ", ";
  protected final String TEXT_46 = "))" + NL + "  \t{" + NL + "      final ";
  protected final String TEXT_47 = " oldValue = this.";
  protected final String TEXT_48 = ";" + NL + "      this.";
  protected final String TEXT_49 = " = ";
  protected final String TEXT_50 = ";" + NL + "      fire";
  protected final String TEXT_51 = "Changed(";
  protected final String TEXT_52 = ", oldValue);" + NL + "  \t}" + NL + "  \t";
  protected final String TEXT_53 = NL + "  \tthis.";
  protected final String TEXT_54 = " = ";
  protected final String TEXT_55 = ";";
  protected final String TEXT_56 = NL + "  }" + NL;
  protected final String TEXT_57 = NL + "  /**" + NL + "   * A helper method to fire event notifications for changes of the ";
  protected final String TEXT_58 = " property." + NL + "   * @parm newValue the new value of the ";
  protected final String TEXT_59 = " property." + NL + "   * @parm oldValue the old value of the ";
  protected final String TEXT_60 = " property." + NL + "   */" + NL + "  protected void fire";
  protected final String TEXT_61 = "Changed(";
  protected final String TEXT_62 = " newValue, ";
  protected final String TEXT_63 = " oldValue)" + NL + "  {" + NL + "    fireEvent(new ";
  protected final String TEXT_64 = "ChangedEventImpl(newValue, oldValue));" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * A concrete implementation of IEvent that carries information about changes of the ";
  protected final String TEXT_65 = " property." + NL + "   */" + NL + "  public class ";
  protected final String TEXT_66 = "ChangedEventImpl extends ";
  protected final String TEXT_67 = "EventImpl implements ";
  protected final String TEXT_68 = "ChangedEvent" + NL + "  {" + NL + "  \tprivate ";
  protected final String TEXT_69 = " newValue;" + NL + "" + NL + "  \tprivate ";
  protected final String TEXT_70 = " oldValue;" + NL + "" + NL + "  \tpublic ";
  protected final String TEXT_71 = "ChangedEventImpl(";
  protected final String TEXT_72 = " newValue, ";
  protected final String TEXT_73 = " oldValue)" + NL + "  \t{" + NL + "  \t  this.newValue = newValue;" + NL + "  \t  this.oldValue = oldValue;" + NL + "  \t}" + NL + "" + NL + "  \tpublic ";
  protected final String TEXT_74 = " getNewValue()" + NL + "  \t{" + NL + "  \t  return newValue;" + NL + "  \t}" + NL + "" + NL + "  \tpublic ";
  protected final String TEXT_75 = " getOldValue()" + NL + "  \t{" + NL + "  \t  return oldValue;" + NL + "  \t}" + NL + "" + NL + "  \t@Override" + NL + "  \tpublic String toString()" + NL + "  \t{" + NL + "  \t  return \"";
  protected final String TEXT_76 = "ChangedEvent \" + oldValue + \" -> \" + newValue;" + NL + "  \t}" + NL + "  }";
  protected final String TEXT_77 = NL;
  protected final String TEXT_78 = NL + "  /**" + NL + "   * The cached value of the ";
  protected final String TEXT_79 = " dependency." + NL + "   */" + NL + "  private ";
  protected final String TEXT_80 = " ";
  protected final String TEXT_81 = ";" + NL + "" + NL + "  /**" + NL + "   * Returns the value of the ";
  protected final String TEXT_82 = " dependency." + NL + "   * @return the value of the ";
  protected final String TEXT_83 = " dependency." + NL + "   */" + NL + "  public ";
  protected final String TEXT_84 = " get";
  protected final String TEXT_85 = "()" + NL + "  {" + NL + "  \treturn ";
  protected final String TEXT_86 = ";" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * Sets the value of the ";
  protected final String TEXT_87 = " dependency." + NL + "   * @parm ";
  protected final String TEXT_88 = " the new value of the ";
  protected final String TEXT_89 = " dependency." + NL + "   */" + NL + "  public void set";
  protected final String TEXT_90 = "(";
  protected final String TEXT_91 = " ";
  protected final String TEXT_92 = ")" + NL + "  {" + NL + "    if (isInitialized() && getLogger().isDebugEnabled())" + NL + "    {" + NL + "      getLogger().debug(\"Setting ";
  protected final String TEXT_93 = " = \" + ";
  protected final String TEXT_94 = ");" + NL + "    }" + NL + "" + NL + "  \tthis.";
  protected final String TEXT_95 = " = ";
  protected final String TEXT_96 = ";" + NL + "  }" + NL;
  protected final String TEXT_97 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Abstract implementations of the business methods to allow @Override" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_98 = NL + "  public abstract ";
  protected final String TEXT_99 = " ";
  protected final String TEXT_100 = "(";
  protected final String TEXT_101 = ")";
  protected final String TEXT_102 = ";";
  protected final String TEXT_103 = NL + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Support classes and methods for ";
  protected final String TEXT_104 = " events" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  protected abstract class ";
  protected final String TEXT_105 = "EventImpl extends Event_Base implements ";
  protected final String TEXT_106 = "Event" + NL + "  {" + NL + "   \tpublic ";
  protected final String TEXT_107 = "EventImpl()" + NL + "  \t{" + NL + "  \t  super(";
  protected final String TEXT_108 = "_Base.this);" + NL + "  \t}" + NL + "" + NL + "  \tpublic I";
  protected final String TEXT_109 = " getNotifier";
  protected final String TEXT_110 = "()" + NL + "  \t{" + NL + "  \t  return (I";
  protected final String TEXT_111 = ")getEventNotifier();" + NL + "  \t}" + NL + "" + NL + "  \t@Override" + NL + "  \tpublic String toString()" + NL + "  \t{" + NL + "  \t  return \"";
  protected final String TEXT_112 = "Event\";" + NL + "  \t}" + NL + "  }" + NL;
  protected final String TEXT_113 = NL + "  protected class ";
  protected final String TEXT_114 = "EventImpl extends ";
  protected final String TEXT_115 = "EventImpl implements ";
  protected final String TEXT_116 = "Event" + NL + "  {";
  protected final String TEXT_117 = NL + "  \tprivate ";
  protected final String TEXT_118 = " ";
  protected final String TEXT_119 = ";" + NL;
  protected final String TEXT_120 = NL + "   \tpublic ";
  protected final String TEXT_121 = "EventImpl(";
  protected final String TEXT_122 = ")" + NL + "  \t{";
  protected final String TEXT_123 = NL + "    \tthis.";
  protected final String TEXT_124 = " = ";
  protected final String TEXT_125 = ";";
  protected final String TEXT_126 = NL + "  \t}" + NL;
  protected final String TEXT_127 = NL + "  \tpublic ";
  protected final String TEXT_128 = " get";
  protected final String TEXT_129 = "()" + NL + "  \t{" + NL + "  \t  return ";
  protected final String TEXT_130 = ";" + NL + "  \t}";
  protected final String TEXT_131 = NL + NL + "  \t@Override" + NL + "  \tpublic String toString()" + NL + "  \t{" + NL + "  \t  return \"";
  protected final String TEXT_132 = "Event\"";
  protected final String TEXT_133 = NL + "        + \" ";
  protected final String TEXT_134 = "=\" + ";
  protected final String TEXT_135 = ";" + NL + "  \t}" + NL + "  }" + NL + "" + NL + "  protected void fire";
  protected final String TEXT_136 = "(";
  protected final String TEXT_137 = ")" + NL + "  {" + NL + "    fireEvent(new ";
  protected final String TEXT_138 = "EventImpl(";
  protected final String TEXT_139 = "));" + NL + "  }";
  protected final String TEXT_140 = NL;
  protected final String TEXT_141 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Support for the ";
  protected final String TEXT_142 = " creator" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  public ";
  protected final String TEXT_143 = " ";
  protected final String TEXT_144 = "(";
  protected final String TEXT_145 = ")" + NL + "  {" + NL + "    List<IComponent> toBeInitialized = new ArrayList<IComponent>();";
  protected final String TEXT_146 = NL + "    ";
  protected final String TEXT_147 = " instance = ((IContext)getContext()).";
  protected final String TEXT_148 = "(toBeInitialized);" + NL + "    post";
  protected final String TEXT_149 = "(instance";
  protected final String TEXT_150 = ", ";
  protected final String TEXT_151 = ");" + NL + "    instance.getContext().populateInstance(instance, toBeInitialized);" + NL + "" + NL + "    for (IComponent init : toBeInitialized)" + NL + "    {" + NL + "      try" + NL + "      {" + NL + "        BeanHelper.initialize(init);" + NL + "      }" + NL + "      catch (Exception ex)" + NL + "      {" + NL + "        getLogger().error(\"Problem while initializing \" + init, ex);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    return instance;" + NL + "  }" + NL + "" + NL + "  protected void post";
  protected final String TEXT_152 = "(";
  protected final String TEXT_153 = " instance";
  protected final String TEXT_154 = ", ";
  protected final String TEXT_155 = ")" + NL + "  {" + NL + "  }";
  protected final String TEXT_156 = NL;
  protected final String TEXT_157 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Empty handlers for incoming ";
  protected final String TEXT_158 = " events" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_159 = NL + "  public void notify";
  protected final String TEXT_160 = "Changed(";
  protected final String TEXT_161 = " notifier, ";
  protected final String TEXT_162 = " newValue, ";
  protected final String TEXT_163 = " oldValue)" + NL + "  {" + NL + "  }";
  protected final String TEXT_164 = NL + "  public void notify";
  protected final String TEXT_165 = "(";
  protected final String TEXT_166 = " notifier, ";
  protected final String TEXT_167 = ")" + NL + "  {" + NL + "  }";
  protected final String TEXT_168 = NL + NL + "  @Override" + NL + "  protected void dispatchEvent(IEvent event)" + NL + "  {";
  protected final String TEXT_169 = NL + "    if (event instanceof ";
  protected final String TEXT_170 = ".";
  protected final String TEXT_171 = "ChangedEvent)" + NL + "    {";
  protected final String TEXT_172 = NL + "      ";
  protected final String TEXT_173 = ".";
  protected final String TEXT_174 = "ChangedEvent e =" + NL + "        (";
  protected final String TEXT_175 = ".";
  protected final String TEXT_176 = "ChangedEvent)event;" + NL + "      notify";
  protected final String TEXT_177 = "Changed(e.getNotifier";
  protected final String TEXT_178 = "(), e.getNewValue(), e.getOldValue());" + NL + "    } else";
  protected final String TEXT_179 = NL + "    if (event instanceof ";
  protected final String TEXT_180 = ".";
  protected final String TEXT_181 = "Event)" + NL + "    {";
  protected final String TEXT_182 = NL + "      ";
  protected final String TEXT_183 = ".";
  protected final String TEXT_184 = "Event e =" + NL + "        (";
  protected final String TEXT_185 = ".";
  protected final String TEXT_186 = "Event)event;" + NL + "      notify";
  protected final String TEXT_187 = "(e.getNotifier";
  protected final String TEXT_188 = "()";
  protected final String TEXT_189 = NL + "  \t    , e.get";
  protected final String TEXT_190 = "()";
  protected final String TEXT_191 = NL + "      );" + NL + "    } else";
  protected final String TEXT_192 = NL + "    {" + NL + "      super.dispatchEvent(event);" + NL + "    }" + NL + "  }";
  protected final String TEXT_193 = NL + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Context interface" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  public interface IContext";
  protected final String TEXT_194 = NL + "  {";
  protected final String TEXT_195 = NL + "    public ";
  protected final String TEXT_196 = " ";
  protected final String TEXT_197 = "(List<IComponent> toBeInitialized);";
  protected final String TEXT_198 = NL + "  }" + NL + "" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Introspection" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  @Override" + NL + "  protected void doFillReferences(List<IComponent> references, int flags)" + NL + "  {" + NL + "    super.doFillReferences(references, flags);";
  protected final String TEXT_199 = NL + "    if (";
  protected final String TEXT_200 = " != null && (flags & IComponent.";
  protected final String TEXT_201 = "REFTYPE_CONTAINMENT";
  protected final String TEXT_202 = "REFTYPE_NORMAL";
  protected final String TEXT_203 = ") != 0) references.add((IComponent)";
  protected final String TEXT_204 = ");";
  protected final String TEXT_205 = NL + "  }" + NL + "}";
  protected final String TEXT_206 = NL;

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
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(GenUtil.getClassExtendsClause(eClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(GenUtil.getListenerClause(eClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_9);
    for (Iterator it = eClass.getEAttributes().iterator(); it.hasNext();) { 
  EAttribute attr = (EAttribute)it.next();
    if (attr.isRequired()) {
    stringBuffer.append(TEXT_10);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_12);
    }
    }
    for (Iterator it = eClass.getEReferences().iterator(); it.hasNext();) { 
  EReference ref = (EReference)it.next(); 
  if (GenUtil.isNormalDependency(ref) && ref.isRequired()) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_15);
    }
    }
    stringBuffer.append(TEXT_16);
    for (Iterator it = eClass.getEReferences().iterator(); it.hasNext();) { 
  EReference ref = (EReference)it.next(); 
  if (GenUtil.isNormalDependency(ref)&& ref.isContainment()) {
    stringBuffer.append(TEXT_17);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_18);
    }
    }
    stringBuffer.append(TEXT_19);
    if (!eClass.getEAttributes().isEmpty()) {
    stringBuffer.append(TEXT_20);
    for (Iterator it = eClass.getEAttributes().iterator(); it.hasNext();) { 
    EAttribute attr = (EAttribute)it.next();
    if (attr.getDefaultValue() != null) {
    stringBuffer.append(TEXT_21);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(GenUtil.formatValue(attr.getDefaultValue()));
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_28);
    stringBuffer.append(attr.getName());
    if (attr.getDefaultValue() !=null) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    }
    stringBuffer.append(TEXT_30);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(GenUtil.getGetterName(attr));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_41);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_42);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_43);
    if (Annotations.isSignalAttribute(attr)) {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_45);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_48);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_50);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_52);
    } else {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_54);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    if (Annotations.isSignalAttribute(attr)) {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_58);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_60);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_62);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(attr.getName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(GenUtil.capitalize(eClass.getName()));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_72);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    stringBuffer.append(TEXT_77);
    }
    for (Iterator it = eClass.getEReferences().iterator(); it.hasNext();) { 
  EReference ref = (EReference)it.next(); 
  if (GenUtil.isNormalDependency(ref)) {
    stringBuffer.append(TEXT_78);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_79);
    stringBuffer.append(GenUtil.getTypeName(ref));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_83);
    stringBuffer.append(GenUtil.getTypeName(ref));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(GenUtil.capitalize(ref.getName()));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_86);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_87);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_88);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_89);
    stringBuffer.append(GenUtil.capitalize(ref.getName()));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(GenUtil.getTypeName(ref));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_92);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_93);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_94);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_96);
    }
    }
    if (GenUtil.hasBusinessMethods(eClass)) {
    stringBuffer.append(TEXT_97);
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) { 
    EOperation op = (EOperation)it.next(); 
    if (GenUtil.isBusinessMethod(op)) {
    stringBuffer.append(TEXT_98);
    stringBuffer.append(GenUtil.getTypeName(op.getEType()));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(GenUtil.getThrowsClause(op));
    stringBuffer.append(TEXT_102);
    }
    }
    }
    if (GenUtil.hasSignals(eClass)) {
    stringBuffer.append(TEXT_103);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_104);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_105);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_106);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_107);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_109);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_111);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_112);
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) { 
    EOperation op = (EOperation)it.next(); 
    if (Annotations.isSignalOperation(op)) {
    stringBuffer.append(TEXT_113);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_116);
    for (Iterator it2 = op.getEParameters().iterator(); it2.hasNext();) { 
        EParameter parm = (EParameter)it2.next();
    stringBuffer.append(TEXT_117);
    stringBuffer.append(GenUtil.getTypeName(parm.getEType()));
    stringBuffer.append(TEXT_118);
    stringBuffer.append(parm.getName());
    stringBuffer.append(TEXT_119);
    }
    stringBuffer.append(TEXT_120);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_122);
    for (Iterator it2 = op.getEParameters().iterator(); it2.hasNext();) { 
        EParameter parm = (EParameter)it2.next();
    stringBuffer.append(TEXT_123);
    stringBuffer.append(parm.getName());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(parm.getName());
    stringBuffer.append(TEXT_125);
    }
    stringBuffer.append(TEXT_126);
    for (Iterator it2 = op.getEParameters().iterator(); it2.hasNext();) { 
        EParameter parm = (EParameter)it2.next();
    stringBuffer.append(TEXT_127);
    stringBuffer.append(GenUtil.getTypeName(parm.getEType()));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(GenUtil.capitalize(parm.getName()));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(parm.getName());
    stringBuffer.append(TEXT_130);
    stringBuffer.append(GenUtil.newline(it2.hasNext()));
    }
    stringBuffer.append(TEXT_131);
    stringBuffer.append(eClass.getName());
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_132);
    for (Iterator it2 = op.getEParameters().iterator(); it2.hasNext();) { EParameter parm = (EParameter)it2.next();
    stringBuffer.append(TEXT_133);
    stringBuffer.append(parm.getName());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(parm.getName());
    }
    stringBuffer.append(TEXT_135);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(GenUtil.getParameterNames(op));
    stringBuffer.append(TEXT_139);
    }
    }
    stringBuffer.append(TEXT_140);
    }
    if (GenUtil.hasCreatorOperations(eClass)) {
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) {
  EOperation op = (EOperation)it.next();
  if (Annotations.isCreatorOperation(op)) {
    stringBuffer.append(TEXT_141);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(GenUtil.getTypeName(op.getEType()));
    stringBuffer.append(TEXT_143);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_144);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_145);
    stringBuffer.append(TEXT_146);
    stringBuffer.append(GenUtil.getTypeName(op.getEType()));
    stringBuffer.append(TEXT_147);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_148);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_149);
    if (!op.getEParameters().isEmpty()) {
    stringBuffer.append(TEXT_150);
    stringBuffer.append(GenUtil.getParameterNames(op));
    }
    stringBuffer.append(TEXT_151);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_152);
    stringBuffer.append(GenUtil.getTypeName(op.getEType()));
    stringBuffer.append(TEXT_153);
    if (!op.getEParameters().isEmpty()) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(GenUtil.getParameters(op));
    }
    stringBuffer.append(TEXT_155);
    }}
    stringBuffer.append(TEXT_156);
    }
    if (GenUtil.hasListenerReferences(eClass)) {
    for (Iterator it1 = GenUtil.getListenerInterfaces(eClass).iterator(); it1.hasNext();) { 
    EClass target = (EClass)it1.next();
    stringBuffer.append(TEXT_157);
    stringBuffer.append(target.getName());
    stringBuffer.append(TEXT_158);
    for (Iterator it = target.getEAttributes().iterator(); it.hasNext();) { 
      EAttribute attr = (EAttribute)it.next(); 
      if (Annotations.isSignalAttribute(attr)) {
    stringBuffer.append(TEXT_159);
    stringBuffer.append(target.getName());
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_161);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_162);
    stringBuffer.append(GenUtil.getTypeName(attr.getEType()));
    stringBuffer.append(TEXT_163);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    stringBuffer.append(GenUtil.newline(!target.getEOperations().isEmpty()));
    for (Iterator it = target.getEOperations().iterator(); it.hasNext();) { 
      EOperation op = (EOperation)it.next(); 
      if (Annotations.isSignalOperation(op)) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(target.getName());
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_166);
    stringBuffer.append(GenUtil.getParameters(op));
    stringBuffer.append(TEXT_167);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    }
    stringBuffer.append(TEXT_168);
    for (Iterator it1 = eClass.getEReferences().iterator(); it1.hasNext();) { 
    EReference ref = (EReference)it1.next(); 
    if (Annotations.isListenerReference(ref)) { 
      EClass target = (EClass)ref.getEType();
    for (Iterator it = target.getEAttributes().iterator(); it.hasNext();) { 
        EAttribute attr = (EAttribute)it.next(); 
         if (Annotations.isSignalAttribute(attr)) {
    stringBuffer.append(TEXT_169);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_171);
    stringBuffer.append(TEXT_172);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_173);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_174);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_176);
    stringBuffer.append(target.getName());
    stringBuffer.append(GenUtil.capitalize(attr.getName()));
    stringBuffer.append(TEXT_177);
    stringBuffer.append(target.getName());
    stringBuffer.append(TEXT_178);
    }
    }
    for (Iterator it = target.getEOperations().iterator(); it.hasNext();) { 
        EOperation op = (EOperation)it.next(); 
        if (Annotations.isSignalOperation(op)) {
    stringBuffer.append(TEXT_179);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_181);
    stringBuffer.append(TEXT_182);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_183);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_184);
    stringBuffer.append(GenUtil.getFullName(target, "I"));
    stringBuffer.append(TEXT_185);
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_186);
    stringBuffer.append(target.getName());
    stringBuffer.append(GenUtil.capitalize(op.getName()));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(target.getName());
    stringBuffer.append(TEXT_188);
    for (Iterator it2 = op.getEParameters().iterator(); it2.hasNext();) { 
            EParameter parm = (EParameter)it2.next();
    stringBuffer.append(TEXT_189);
    stringBuffer.append(GenUtil.capitalize(parm.getName()));
    stringBuffer.append(TEXT_190);
    }
    stringBuffer.append(TEXT_191);
    }
    }
    }
    }
    stringBuffer.append(TEXT_192);
    }
    stringBuffer.append(TEXT_193);
    stringBuffer.append(GenUtil.getContextExtendsClause(eClass));
    stringBuffer.append(TEXT_194);
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();) { 
  EOperation op = (EOperation)it.next(); 
  if (Annotations.isCreatorOperation(op)) {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(GenUtil.getTypeName(op.getEType()));
    stringBuffer.append(TEXT_196);
    stringBuffer.append(op.getName());
    stringBuffer.append(TEXT_197);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    stringBuffer.append(TEXT_198);
    for (Iterator it = eClass.getEReferences().iterator(); it.hasNext();) { 
  EReference ref = (EReference)it.next(); 
  if (GenUtil.isNormalDependency(ref) && ref.getEType() instanceof EClass) {
    stringBuffer.append(TEXT_199);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_200);
    if (ref.isContainment()) {
    stringBuffer.append(TEXT_201);
    } else {
    stringBuffer.append(TEXT_202);
    }
    stringBuffer.append(TEXT_203);
    stringBuffer.append(ref.getName());
    stringBuffer.append(TEXT_204);
    }
    }
    stringBuffer.append(TEXT_205);
    stringBuffer.append(TEXT_206);
    return stringBuffer.toString();
  }
}

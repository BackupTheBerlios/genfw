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
package tutorial2.gen;

import java.util.*;
import com.sympedia.util.*;
import javax.xml.transform.*;
import org.w3c.dom.*;
import org.apache.xpath.*;

public class ElementTemplate
{
  protected static String nl;
  public static synchronized ElementTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    ElementTemplate result = new ElementTemplate();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".internal;" + NL + "" + NL + "import org.eclipse.core.runtime.*;" + NL + "import java.util.*;" + NL + "import java.io.*;" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = NL + "{" + NL + "  protected ";
  protected final String TEXT_4 = "(Object parent, ";
  protected final String TEXT_5 = " origin)" + NL + "  {" + NL + "  \t_origin = origin;" + NL + "  \t_parent = parent;";
  protected final String TEXT_6 = NL + "    id = origin.getSimpleIdentifier();   " + NL + "    name = origin.getLabel();  " + NL + "    point = origin.getExtensionPointUniqueIdentifier();" + NL + "    if (point == null || point.length() == 0) throw new RuntimeException(\"Point is required\");";
  protected final String TEXT_7 = NL + "    String ";
  protected final String TEXT_8 = "Str = origin.getAttribute(\"";
  protected final String TEXT_9 = "\");" + NL + "    if (";
  protected final String TEXT_10 = "Str != null) { ";
  protected final String TEXT_11 = " = Boolean.parseBoolean(";
  protected final String TEXT_12 = "Str); }";
  protected final String TEXT_13 = " else throw new RuntimeException(\"";
  protected final String TEXT_14 = " is required\");";
  protected final String TEXT_15 = " ";
  protected final String TEXT_16 = " ";
  protected final String TEXT_17 = NL + "    ";
  protected final String TEXT_18 = " = origin.getAttribute(\"";
  protected final String TEXT_19 = "\");";
  protected final String TEXT_20 = NL + "    if (";
  protected final String TEXT_21 = " == null || ";
  protected final String TEXT_22 = ".length() == 0) throw new RuntimeException(\"";
  protected final String TEXT_23 = " is required\");";
  protected final String TEXT_24 = " ";
  protected final String TEXT_25 = " ";
  protected final String TEXT_26 = NL + NL + "    IConfigurationElement[] configurationElements = origin.get";
  protected final String TEXT_27 = "();" + NL + "    for (IConfigurationElement element : configurationElements)" + NL + "    {" + NL + "      System.out.println(\"Initializing \" + element.getName());";
  protected final String TEXT_28 = NL + "      if (\"";
  protected final String TEXT_29 = "\".equals(element.getName())) ";
  protected final String TEXT_30 = "Elements.add(new ";
  protected final String TEXT_31 = "(this, element));";
  protected final String TEXT_32 = NL + "    }" + NL + "  }" + NL + "" + NL + "  public ";
  protected final String TEXT_33 = " getOrigin() { return _origin; }" + NL + "  protected ";
  protected final String TEXT_34 = " _origin;" + NL + "  " + NL + "  public Object getParent() { return _parent; }" + NL + "  protected Object _parent;" + NL + "  ";
  protected final String TEXT_35 = NL + "  public List<";
  protected final String TEXT_36 = "> get";
  protected final String TEXT_37 = "Elements() { return Collections.unmodifiableList(";
  protected final String TEXT_38 = "Elements); }" + NL + "  protected List<";
  protected final String TEXT_39 = "> ";
  protected final String TEXT_40 = "Elements = new ArrayList<";
  protected final String TEXT_41 = ">();" + NL;
  protected final String TEXT_42 = " ";
  protected final String TEXT_43 = NL + "  public boolean is";
  protected final String TEXT_44 = "() { return ";
  protected final String TEXT_45 = "; }" + NL + "  protected boolean ";
  protected final String TEXT_46 = ";";
  protected final String TEXT_47 = " " + NL + "  public ";
  protected final String TEXT_48 = " get";
  protected final String TEXT_49 = "() throws CoreException { return (";
  protected final String TEXT_50 = ")_origin.createExecutableExtension(\"";
  protected final String TEXT_51 = "\"); }" + NL + "  protected String ";
  protected final String TEXT_52 = ";";
  protected final String TEXT_53 = NL + "  public File get";
  protected final String TEXT_54 = "() { return new File(";
  protected final String TEXT_55 = "); }" + NL + "  protected String ";
  protected final String TEXT_56 = ";";
  protected final String TEXT_57 = NL + "  public String get";
  protected final String TEXT_58 = "() { return ";
  protected final String TEXT_59 = "; }" + NL + "  protected String ";
  protected final String TEXT_60 = ";";
  protected final String TEXT_61 = " ";
  protected final String TEXT_62 = " " + NL;
  protected final String TEXT_63 = NL + "  public List getAllElements()" + NL + "  {" + NL + "    List result = new ArrayList();" + NL + "    result.add(this);";
  protected final String TEXT_64 = NL + "    for (";
  protected final String TEXT_65 = " element : ";
  protected final String TEXT_66 = "Elements) result.addAll(element.getAllElements());";
  protected final String TEXT_67 = NL + "    return result;" + NL + "  }" + NL + "}";
  protected final String TEXT_68 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
Element element = (Element)argument;
boolean isExtension = ExtPointHelper.isExtension(element);
String pluginId = ExtPointHelper.getPluginId(element);
String origin = isExtension ? "IExtension" : "IConfigurationElement";
String children = isExtension ? "ConfigurationElements" : "Children";
Set<String> references = ExtPointHelper.getReferences(element);
List<Element> attributes = ExtPointHelper.xPathList(element, ".//attribute");

    stringBuffer.append(TEXT_1);
    stringBuffer.append(pluginId);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(ExtPointHelper.getElementClassName(element));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(ExtPointHelper.getElementClassName(element));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(origin);
    stringBuffer.append(TEXT_5);
    if (isExtension) {
    stringBuffer.append(TEXT_6);
    } else {   
  for (Iterator<Element> it = attributes.iterator(); it.hasNext();) {
    Element attribute = it.next();
    String name = attribute.getAttribute("name");
    if ("class".equals(name)) name = "clazz";
    String capName = StringHelper.firstToUpper(name);
    boolean required = "required".equals(attribute.getAttribute("use"));
    if ("boolean".equals(attribute.getAttribute("type"))) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(attribute.getAttribute("name"));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_12);
    if (required) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    } else {
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(attribute.getAttribute("name"));
    stringBuffer.append(TEXT_19);
    if (required) {
    stringBuffer.append(TEXT_20);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    }
    }
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_26);
    stringBuffer.append(children);
    stringBuffer.append(TEXT_27);
    for (Iterator<String> it = references.iterator(); it.hasNext();) {
  String reference = it.next();
  String capRef = StringHelper.firstToUpper(reference);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    stringBuffer.append(origin);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(origin);
    stringBuffer.append(TEXT_34);
    for (Iterator<String> it = references.iterator(); it.hasNext();) {
  String reference = it.next();
  String capRef = StringHelper.firstToUpper(reference);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_41);
    }
    stringBuffer.append(TEXT_42);
    for (Iterator<Element> it = attributes.iterator(); it.hasNext();) {
  Element attribute = it.next();
  String type = attribute.getAttribute("type");
  String name = attribute.getAttribute("name");
  if ("class".equals(name)) name = "clazz";
  String capName = StringHelper.firstToUpper(name);
  if ("boolean".equals(type)) {
    stringBuffer.append(TEXT_43);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_46);
    } else {
    String kind = ExtPointHelper.getKind(attribute); 
    if ("java".equals(kind)) {
      String interfaceClass = ExtPointHelper.getBasedOn(attribute);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(interfaceClass);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(interfaceClass);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_52);
    } else if ("resource".equals(kind)) {
    stringBuffer.append(TEXT_53);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_55);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_56);
    } else {
    stringBuffer.append(TEXT_57);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_59);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_60);
    }
    stringBuffer.append(TEXT_61);
    }
    stringBuffer.append(TEXT_62);
    }
    stringBuffer.append(TEXT_63);
    for (Iterator<String> it = references.iterator(); it.hasNext();) {
  String reference = it.next();
  String capRef = StringHelper.firstToUpper(reference);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_66);
    }
    stringBuffer.append(TEXT_67);
    stringBuffer.append(TEXT_68);
    return stringBuffer.toString();
  }
}

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
  protected final String TEXT_4 = "(";
  protected final String TEXT_5 = " origin)" + NL + "  {" + NL + "  \tthis.origin = origin;" + NL + "    IConfigurationElement[] configurationElements = origin.get";
  protected final String TEXT_6 = "();" + NL + "    for (IConfigurationElement element : configurationElements)" + NL + "    {" + NL + "      System.out.println(\"Initializing \" + element.getName());";
  protected final String TEXT_7 = NL + "      if (\"";
  protected final String TEXT_8 = "\".equals(element.getName())) ";
  protected final String TEXT_9 = "Elements.add(new ";
  protected final String TEXT_10 = "(element));";
  protected final String TEXT_11 = NL + "      String ";
  protected final String TEXT_12 = "Str = element.getAttribute(\"";
  protected final String TEXT_13 = "\");" + NL + "      if (";
  protected final String TEXT_14 = "Str !=null) { ";
  protected final String TEXT_15 = " = Boolean.parseBoolean(";
  protected final String TEXT_16 = "Str); } else { if (";
  protected final String TEXT_17 = ") throw new RuntimeException(\"";
  protected final String TEXT_18 = " is required\"); }";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = NL + "      ";
  protected final String TEXT_21 = " = element.getAttribute(\"";
  protected final String TEXT_22 = "\");" + NL + "      if (";
  protected final String TEXT_23 = " && (";
  protected final String TEXT_24 = " == null || ";
  protected final String TEXT_25 = ".length() == 0)) throw new RuntimeException(\"";
  protected final String TEXT_26 = " is required\");";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = NL + "    }" + NL + "  }" + NL + "" + NL + "  public ";
  protected final String TEXT_29 = " getOrigin() { return origin; }" + NL + "  protected ";
  protected final String TEXT_30 = " origin;" + NL + "  ";
  protected final String TEXT_31 = NL + "  public List<";
  protected final String TEXT_32 = "> get";
  protected final String TEXT_33 = "Elements() { return Collections.unmodifiableList(";
  protected final String TEXT_34 = "Elements); }" + NL + "  protected List<";
  protected final String TEXT_35 = "> ";
  protected final String TEXT_36 = "Elements;" + NL;
  protected final String TEXT_37 = " ";
  protected final String TEXT_38 = NL + "  public boolean is";
  protected final String TEXT_39 = "() { return ";
  protected final String TEXT_40 = "; }" + NL + "  protected boolean ";
  protected final String TEXT_41 = ";";
  protected final String TEXT_42 = " " + NL + "  public ";
  protected final String TEXT_43 = " get";
  protected final String TEXT_44 = "() throws CoreException { return (";
  protected final String TEXT_45 = ")origin.createExecutableExtension(\"";
  protected final String TEXT_46 = "\"); }" + NL + "  protected String ";
  protected final String TEXT_47 = ";";
  protected final String TEXT_48 = NL + "  public File get";
  protected final String TEXT_49 = "() { return new File(";
  protected final String TEXT_50 = "); }" + NL + "  protected String ";
  protected final String TEXT_51 = ";";
  protected final String TEXT_52 = NL + "  public String get";
  protected final String TEXT_53 = "() { return ";
  protected final String TEXT_54 = "; }" + NL + "  protected String ";
  protected final String TEXT_55 = ";";
  protected final String TEXT_56 = " ";
  protected final String TEXT_57 = " " + NL;
  protected final String TEXT_58 = NL + "}";
  protected final String TEXT_59 = NL;

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
    stringBuffer.append(children);
    stringBuffer.append(TEXT_6);
    for (Iterator<String> it = references.iterator(); it.hasNext();) {
  String reference = it.next();
  String capRef = StringHelper.firstToUpper(reference);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_10);
    }
    for (Iterator<Element> it = attributes.iterator(); it.hasNext();) {
  Element attribute = it.next();
  String name = attribute.getAttribute("name");
  if ("class".equals(name)) name = "clazz";
  String capName = StringHelper.firstToUpper(name);
  boolean required = "required".equals(attribute.getAttribute("use"));
  if ("boolean".equals(attribute.getAttribute("type"))) {
    stringBuffer.append(TEXT_11);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(attribute.getAttribute("name"));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(required);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_18);
    } else {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(attribute.getAttribute("name"));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(required);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    }
    stringBuffer.append(TEXT_28);
    stringBuffer.append(origin);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(origin);
    stringBuffer.append(TEXT_30);
    for (Iterator<String> it = references.iterator(); it.hasNext();) {
  String reference = it.next();
  String capRef = StringHelper.firstToUpper(reference);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(reference);
    stringBuffer.append(TEXT_36);
    }
    stringBuffer.append(TEXT_37);
    for (Iterator<Element> it = attributes.iterator(); it.hasNext();) {
  Element attribute = it.next();
  String type = attribute.getAttribute("type");
  String name = attribute.getAttribute("name");
  if ("class".equals(name)) name = "clazz";
  String capName = StringHelper.firstToUpper(name);
  if ("boolean".equals(type)) {
    stringBuffer.append(TEXT_38);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_41);
    } else {
    String kind = ExtPointHelper.getKind(attribute); 
    if ("java".equals(kind)) {
      String interfaceClass = ExtPointHelper.getBasedOn(attribute);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(interfaceClass);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(interfaceClass);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_47);
    } else if ("resource".equals(kind)) {
    stringBuffer.append(TEXT_48);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_51);
    } else {
    stringBuffer.append(TEXT_52);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    }
    stringBuffer.append(TEXT_57);
    }
    stringBuffer.append(TEXT_58);
    stringBuffer.append(TEXT_59);
    return stringBuffer.toString();
  }
}

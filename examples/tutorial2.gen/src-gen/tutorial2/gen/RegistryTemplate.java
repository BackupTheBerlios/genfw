package tutorial2.gen;

import java.util.*;
import com.sympedia.util.*;
import javax.xml.transform.*;
import org.w3c.dom.*;
import org.apache.xpath.*;

public class RegistryTemplate
{
  protected static String nl;
  public static synchronized RegistryTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    RegistryTemplate result = new RegistryTemplate();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".internal;" + NL + "" + NL + "import org.eclipse.core.runtime.*;" + NL + "import java.util.*;" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = NL + "{" + NL + "  public static final String EXT_POINT_ID = \"";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = "\";" + NL + "" + NL + "  protected List<";
  protected final String TEXT_6 = "Extension> ";
  protected final String TEXT_7 = ";" + NL + "" + NL + "  public ";
  protected final String TEXT_8 = "()" + NL + "  {" + NL + "    IExtensionRegistry registry = Platform.getExtensionRegistry();" + NL + "    IExtensionPoint extPoint = registry.getExtensionPoint(EXT_POINT_ID);" + NL + "    IExtension[] extensions = extPoint.getExtensions();" + NL + "    for (IExtension extension : extensions)" + NL + "    {" + NL + "      try" + NL + "      {";
  protected final String TEXT_9 = NL + "        ";
  protected final String TEXT_10 = ".add(new ";
  protected final String TEXT_11 = "Extension(extension));" + NL + "      }" + NL + "      catch (Exception ex)" + NL + "      {" + NL + "        ex.printStackTrace();" + NL + "      }" + NL + "    }" + NL + "  }" + NL + "" + NL + "  public List<";
  protected final String TEXT_12 = "Extension> get";
  protected final String TEXT_13 = "()" + NL + "  {" + NL + "    return Collections.unmodifiableList(";
  protected final String TEXT_14 = ");" + NL + "  }" + NL + "}";

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
Element element = (Element)argument;
String pluginId = ExtPointHelper.getPluginId(element);
String extPointId = ExtPointHelper.getExtPointId(element);
String capId = StringHelper.firstToUpper(extPointId);

    stringBuffer.append(TEXT_1);
    stringBuffer.append(pluginId);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(ExtPointHelper.getRegistryClassName(element));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(pluginId);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(capId);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(ExtPointHelper.getRegistryClassName(element));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(capId);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(capId);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(capId);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_14);
    return stringBuffer.toString();
  }
}

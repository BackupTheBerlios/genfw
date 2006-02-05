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
  protected final String TEXT_3 = " implements IRegistryChangeListener" + NL + "{" + NL + "  public static final String EXT_POINT_ID = \"";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = "\";" + NL + "" + NL + "  public static final ";
  protected final String TEXT_6 = " INSTANCE = new ";
  protected final String TEXT_7 = "();" + NL + "" + NL + "  private List<";
  protected final String TEXT_8 = "> ";
  protected final String TEXT_9 = " = new ArrayList<";
  protected final String TEXT_10 = ">();" + NL + "" + NL + "  private List<Listener> listeners = new ArrayList<Listener>();" + NL + "" + NL + "  private boolean initialized = false;" + NL + "" + NL + "  public ";
  protected final String TEXT_11 = "()" + NL + "  {" + NL + "  }" + NL + "" + NL + "  public List<";
  protected final String TEXT_12 = "> get";
  protected final String TEXT_13 = "()" + NL + "  {" + NL + "    return Collections.unmodifiableList(";
  protected final String TEXT_14 = ");" + NL + "  }" + NL + "" + NL + "  public List getAllElements()" + NL + "  {" + NL + "    List result = new ArrayList();" + NL + "    for (";
  protected final String TEXT_15 = " extension : ";
  protected final String TEXT_16 = ")" + NL + "    {" + NL + "      result.addAll(extension.getAllElements());" + NL + "    }" + NL + "    " + NL + "    return result;" + NL + "  }" + NL;
  protected final String TEXT_17 = NL + "  public List<";
  protected final String TEXT_18 = "> getAll";
  protected final String TEXT_19 = "Elements()" + NL + "  {" + NL + "    List elements = getAllElements();" + NL + "    return (List<";
  protected final String TEXT_20 = ">)filter(elements, ";
  protected final String TEXT_21 = ".class);" + NL + "  }" + NL + "  ";
  protected final String TEXT_22 = NL + "  public synchronized void initialize()" + NL + "  {" + NL + "    if (!initialized)" + NL + "    {" + NL + "      initialized = true;" + NL + "      ChangeEvent event = new ChangeEvent();" + NL + "      " + NL + "      IExtensionRegistry registry = Platform.getExtensionRegistry();" + NL + "      IExtensionPoint extPoint = registry.getExtensionPoint(EXT_POINT_ID);" + NL + "      IExtension[] extensions = extPoint.getExtensions();" + NL + "      for (IExtension extension : extensions)" + NL + "      {" + NL + "        addExtension(extension, event);" + NL + "      }" + NL + "      " + NL + "      event.dispatch();" + NL + "      registry.addRegistryChangeListener(this);" + NL + "    }" + NL + "  }" + NL + "" + NL + "  public synchronized void dispose()" + NL + "  {" + NL + "    if (initialized)" + NL + "    {    " + NL + "      Platform.getExtensionRegistry().removeRegistryChangeListener(this);";
  protected final String TEXT_23 = NL + "      ";
  protected final String TEXT_24 = ".clear();" + NL + "      initialized = false;" + NL + "    }" + NL + "  }" + NL + "" + NL + "  public void registryChanged(IRegistryChangeEvent eclipseEvent)" + NL + "  {" + NL + "    ChangeEvent event = new ChangeEvent();" + NL + "    IExtensionDelta[] extensionDeltas = eclipseEvent.getExtensionDeltas();" + NL + "    for (int i = 0; i < extensionDeltas.length; i++)" + NL + "    {" + NL + "      IExtensionDelta delta = extensionDeltas[i];" + NL + "      if (EXT_POINT_ID.equals(delta.getExtensionPoint().getUniqueIdentifier()))" + NL + "      {" + NL + "        IExtension extension = delta.getExtension();" + NL + "        int kind = delta.getKind();" + NL + "        switch (kind)" + NL + "        {" + NL + "          case IExtensionDelta.ADDED:" + NL + "            addExtension(extension, event);" + NL + "            break;" + NL + "          case IExtensionDelta.REMOVED:" + NL + "            removeExtension(extension, event);" + NL + "            break;" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "    " + NL + "    event.dispatch();" + NL + "  }" + NL + "" + NL + "  private void addExtension(IExtension origin, ChangeEvent event)" + NL + "  {" + NL + "    try" + NL + "    {";
  protected final String TEXT_25 = NL + "      ";
  protected final String TEXT_26 = " extension = new ";
  protected final String TEXT_27 = "(null, origin);";
  protected final String TEXT_28 = NL + "      ";
  protected final String TEXT_29 = ".add(extension);" + NL + "      event.addExtension(extension);" + NL + "    }" + NL + "    catch (Exception ex)" + NL + "    {" + NL + "      ex.printStackTrace();" + NL + "    }" + NL + "  }   " + NL + "" + NL + "  private void removeExtension(IExtension origin, ChangeEvent event)" + NL + "  {";
  protected final String TEXT_30 = NL + "    ";
  protected final String TEXT_31 = "[] extensions = ";
  protected final String TEXT_32 = ".toArray(new ";
  protected final String TEXT_33 = "[";
  protected final String TEXT_34 = ".size()]);" + NL + "    for (";
  protected final String TEXT_35 = " extension : extensions)" + NL + "    {" + NL + "      if (extension.getOrigin().equals(origin))" + NL + "      {";
  protected final String TEXT_36 = NL + "        ";
  protected final String TEXT_37 = ".remove(extension);" + NL + "        event.removeExtension(extension);" + NL + "        break;" + NL + "      }" + NL + "    } " + NL + "  }   " + NL + "" + NL + "  private List filter(List items, Class baseClass)" + NL + "  {" + NL + "    List result = new ArrayList();" + NL + "    for (Object item : items)" + NL + "    {" + NL + "      Class c = item.getClass();" + NL + "      if (baseClass == null || baseClass.isAssignableFrom(c))" + NL + "      {" + NL + "        result.add(item);" + NL + "      }" + NL + "    }" + NL + "    " + NL + "    return result;" + NL + "  }" + NL + "  " + NL + "  public class ChangeEvent" + NL + "  {" + NL + "    private List<";
  protected final String TEXT_38 = "> added = new ArrayList<";
  protected final String TEXT_39 = ">();" + NL + "" + NL + "    private List<";
  protected final String TEXT_40 = "> removed = new ArrayList<";
  protected final String TEXT_41 = ">();" + NL + "    " + NL + "    private ChangeEvent()" + NL + "    {" + NL + "    }" + NL + "    " + NL + "    public ";
  protected final String TEXT_42 = " getSource()" + NL + "    {" + NL + "      return ";
  protected final String TEXT_43 = ".this;" + NL + "    }" + NL + "    " + NL + "    public ";
  protected final String TEXT_44 = "[] getAddedExtensions()" + NL + "    {" + NL + "      return added.toArray(new ";
  protected final String TEXT_45 = "[added.size()]);" + NL + "    }" + NL + "    " + NL + "    public ";
  protected final String TEXT_46 = "[] getRemovedExtensions()" + NL + "    {" + NL + "      return removed.toArray(new ";
  protected final String TEXT_47 = "[removed.size()]);" + NL + "    }" + NL + "    " + NL + "    private void addExtension(";
  protected final String TEXT_48 = " extension)" + NL + "    {" + NL + "      added.add(extension);" + NL + "    }" + NL + "    " + NL + "    private void removeExtension(";
  protected final String TEXT_49 = " extension)" + NL + "    {" + NL + "      removed.add(extension);" + NL + "    }" + NL + "    " + NL + "    private void dispatch()" + NL + "    {" + NL + "      if (added.isEmpty() && removed.isEmpty()) return;" + NL + "      for (Listener listener : listeners)" + NL + "      {" + NL + "        try" + NL + "        {" + NL + "          listener.notify";
  protected final String TEXT_50 = "RegistryChanged(this);" + NL + "        }" + NL + "        catch (Exception ex)" + NL + "        {" + NL + "          ex.printStackTrace();" + NL + "        }" + NL + "      }" + NL + "    }" + NL + "  }" + NL + "  " + NL + "  public interface Listener" + NL + "  {" + NL + "    public void notify";
  protected final String TEXT_51 = "RegistryChanged(ChangeEvent event);" + NL + "  }" + NL + "}";

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
Element element = (Element)argument;
String pluginId = ExtPointHelper.getPluginId(element);
String extPointId = ExtPointHelper.getExtPointId(element);
String capId = StringHelper.firstToUpper(extPointId);
String extName = capId + "Extension";
String className = ExtPointHelper.getRegistryClassName(element);
Set<String> references = ExtPointHelper.getReferences(element);

    stringBuffer.append(TEXT_1);
    stringBuffer.append(pluginId);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(pluginId);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_11);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(capId);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_16);
    for (Iterator<String> it = references.iterator(); it.hasNext();) {
  String reference = it.next();
  String capRef = StringHelper.firstToUpper(reference);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(capRef);
    stringBuffer.append(TEXT_21);
    }
    stringBuffer.append(TEXT_22);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(extPointId);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(extName);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(capId);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(capId);
    stringBuffer.append(TEXT_51);
    return stringBuffer.toString();
  }
}

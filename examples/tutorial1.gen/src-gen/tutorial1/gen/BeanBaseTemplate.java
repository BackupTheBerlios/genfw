package tutorial1.gen;

import java.util.*;
import tutorial1.gen.beans.*;

public class BeanBaseTemplate
{
  protected static String nl;
  public static synchronized BeanBaseTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    BeanBaseTemplate result = new BeanBaseTemplate();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import tutorial1.EqualityHelper;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_3 = "BeanBase" + NL + "{";
  protected final String TEXT_4 = NL + "  protected ";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + NL + "  private java.util.List<Listener> listeners = new java.util.ArrayList<Listener>();" + NL + "" + NL + "  public ";
  protected final String TEXT_8 = "BeanBase(";
  protected final String TEXT_9 = ")" + NL + "  {";
  protected final String TEXT_10 = NL + "    this.";
  protected final String TEXT_11 = " = ";
  protected final String TEXT_12 = ";";
  protected final String TEXT_13 = NL + "  }" + NL;
  protected final String TEXT_14 = NL + "  public ";
  protected final String TEXT_15 = " get";
  protected final String TEXT_16 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_17 = ";" + NL + "  }" + NL;
  protected final String TEXT_18 = NL + "  public void set";
  protected final String TEXT_19 = "(";
  protected final String TEXT_20 = " new";
  protected final String TEXT_21 = ")" + NL + "  {";
  protected final String TEXT_22 = NL + "    ";
  protected final String TEXT_23 = " old";
  protected final String TEXT_24 = " = ";
  protected final String TEXT_25 = ";" + NL + "    if (!EqualityHelper.equals(old";
  protected final String TEXT_26 = ", new";
  protected final String TEXT_27 = "))" + NL + "    {";
  protected final String TEXT_28 = NL + "      ";
  protected final String TEXT_29 = " = new";
  protected final String TEXT_30 = ";" + NL + "      for (Listener listener : listeners)" + NL + "        listener.notify";
  protected final String TEXT_31 = "Changed(this, old";
  protected final String TEXT_32 = ", new";
  protected final String TEXT_33 = ");" + NL + "    }" + NL + "  }" + NL;
  protected final String TEXT_34 = NL + "  public void addListener(Listener listener) { listeners.add(listener); }" + NL + "  " + NL + "  public void removeListener(Listener listener) { listeners.remove(listener); }" + NL + "" + NL + "  public interface Listener" + NL + "  {";
  protected final String TEXT_35 = NL + "    void notify";
  protected final String TEXT_36 = "Changed(";
  protected final String TEXT_37 = "BeanBase source, ";
  protected final String TEXT_38 = " old";
  protected final String TEXT_39 = ", ";
  protected final String TEXT_40 = " new";
  protected final String TEXT_41 = ");";
  protected final String TEXT_42 = NL + "  }" + NL + "}";
  protected final String TEXT_43 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    Bean bean = (Bean)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(bean.getBeanLibrary().getPackageName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(bean.getName());
    stringBuffer.append(TEXT_3);
    for (Iterator it = bean.getProperties().iterator(); it.hasNext();) { 
  BeanProperty prop = (BeanProperty)it.next();
    stringBuffer.append(TEXT_4);
    stringBuffer.append(prop.getTypeName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(prop.getName());
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    stringBuffer.append(bean.getName());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(BeanHelper.formatParameters(bean, true));
    stringBuffer.append(TEXT_9);
    for (Iterator it = bean.getProperties().iterator(); it.hasNext();) { 
  BeanProperty prop = (BeanProperty)it.next();
    stringBuffer.append(TEXT_10);
    stringBuffer.append(prop.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(prop.getName());
    stringBuffer.append(TEXT_12);
    }
    stringBuffer.append(TEXT_13);
    for (Iterator it = bean.getProperties().iterator(); it.hasNext();) { 
  BeanProperty prop = (BeanProperty)it.next();
  String capName = StringHelper.capitalize(prop.getName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(prop.getTypeName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(prop.getName());
    stringBuffer.append(TEXT_17);
    if (prop.isChangeable()) {
    stringBuffer.append(TEXT_18);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_19);
    stringBuffer.append(prop.getTypeName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_21);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(prop.getTypeName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(prop.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_26);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(prop.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_33);
    }
    }
    stringBuffer.append(TEXT_34);
    for (Iterator it = bean.getProperties().iterator(); it.hasNext();) { 
  BeanProperty prop = (BeanProperty)it.next();
  if (prop.isChangeable()) {
    String capName = StringHelper.capitalize(prop.getName());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(bean.getName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(
      prop.getTypeName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(prop.getTypeName());
    stringBuffer.append(TEXT_40);
    stringBuffer.append(capName);
    stringBuffer.append(TEXT_41);
    }
    }
    stringBuffer.append(TEXT_42);
    stringBuffer.append(TEXT_43);
    return stringBuffer.toString();
  }
}

package tutorial1.gen;

import java.util.*;
import tutorial1.gen.beans.*;

public class BeanTemplate
{
  protected static String nl;
  public static synchronized BeanTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    BeanTemplate result = new BeanTemplate();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = "Bean extends ";
  protected final String TEXT_4 = "BeanBase" + NL + "{" + NL + "  public ";
  protected final String TEXT_5 = "Bean(";
  protected final String TEXT_6 = ")" + NL + "  {" + NL + "    super(";
  protected final String TEXT_7 = ");" + NL + "  }" + NL + "  " + NL + "  /////////////////////////////////////////////////////////////////////////" + NL + "  // Business methods" + NL + "  /////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "}";
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    Bean bean = (Bean)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(bean.getBeanLibrary().getPackageName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(bean.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(bean.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(bean.getName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(BeanHelper.formatParameters(bean, true));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(BeanHelper.formatParameters(bean, false));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}

package com.sympedia.density.gen;

public class Classpath
{
  protected static String nl;
  public static synchronized Classpath create(String lineSeparator)
  {
    nl = lineSeparator;
    Classpath result = new Classpath();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<classpath>" + NL + "\t<classpathentry kind=\"src\" path=\"src-gen\"/>" + NL + "\t<classpathentry kind=\"src\" path=\"src\"/>" + NL + "\t<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER\"/>" + NL + "\t<classpathentry kind=\"con\" path=\"org.eclipse.pde.core.requiredPlugins\"/>" + NL + "\t<classpathentry kind=\"output\" path=\"bin\"/>" + NL + "</classpath>";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}

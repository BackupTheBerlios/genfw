package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import com.sympedia.density.gen.deploy.*;
import com.sympedia.density.gen.deploytest.*;

public class ContainerTestSuite
{
  protected static String nl;
  public static synchronized ContainerTestSuite create(String lineSeparator)
  {
    nl = lineSeparator;
    ContainerTestSuite result = new ContainerTestSuite();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "" + NL + "import com.sympedia.density.*;" + NL + "import com.sympedia.density.impl.*;" + NL + "import com.sympedia.density.tests.*;" + NL + "import com.sympedia.density.tests.impl.*;" + NL + "import com.sympedia.density.tests.util.*;" + NL + "import com.sympedia.util.*;" + NL + "" + NL + "import junit.framework.TestCase;" + NL + "" + NL + "import java.util.*;" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = "Tests extends TestCase" + NL + "{" + NL + "  public ";
  protected final String TEXT_4 = "Tests(String name)" + NL + "  {" + NL + "    super(name);" + NL + "  }" + NL + "" + NL + "  @Override" + NL + "  protected void setUp() throws Exception" + NL + "  {" + NL + "  }" + NL + "" + NL + "  @Override" + NL + "  protected void tearDown() throws Exception" + NL + "  {" + NL + "  }" + NL + "" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Test cases" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_5 = NL + "  public void test";
  protected final String TEXT_6 = "() throws Exception" + NL + "  {";
  protected final String TEXT_7 = NL + "    ";
  protected final String TEXT_8 = "TestSpec testSpec = new ";
  protected final String TEXT_9 = "TestSpec();    " + NL + "    String testCaseName = getName();" + NL + "    testSpec.test";
  protected final String TEXT_10 = "(testCaseName);" + NL + "  }";
  protected final String TEXT_11 = NL + "}";
  protected final String TEXT_12 = NL;

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

String suiteName = "All";
String specName;
String packageName;
EList allTestCases;
EList testCases;

if (argument instanceof TestSpec)
{
  TestSpec testSpec = (TestSpec)argument;
  specName = testSpec.getName();
  packageName = testSpec.getPackageName();
  allTestCases = testSpec.getAllVerifications();
  testCases = allTestCases;
}
else
{
  TestSuite testSuite = (TestSuite)argument;
  specName = testSuite.getTestSpec().getName();
  packageName = testSuite.getTestSpec().getPackageName();
  allTestCases = testSuite.getTestSpec().getAllVerifications();
  testCases = testSuite.getTestCases();
  suiteName = testSuite.getName();
}

    stringBuffer.append(TEXT_1);
    stringBuffer.append(packageName);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(suiteName);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(suiteName);
    stringBuffer.append(TEXT_4);
    for (Iterator it = testCases.iterator(); it.hasNext();) {
  Verification verification = (Verification)it.next();
  String id = GenUtil.capitalize(verification.getId());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(specName);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(specName);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}

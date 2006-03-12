package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import com.sympedia.density.gen.deploy.*;
import com.sympedia.density.gen.deploytest.*;

public class ContainerTestSpec
{
  protected static String nl;
  public static synchronized ContainerTestSpec create(String lineSeparator)
  {
    nl = lineSeparator;
    ContainerTestSpec result = new ContainerTestSpec();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "" + NL + "import com.sympedia.density.*;" + NL + "import com.sympedia.density.impl.*;" + NL + "import com.sympedia.density.tests.*;" + NL + "import com.sympedia.density.tests.impl.*;" + NL + "import com.sympedia.density.tests.util.*;" + NL + "import com.sympedia.util.*;" + NL + "" + NL + "import java.util.*;" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_3 = "TestSpec_Base extends TestSpec" + NL + "{" + NL + "  public static final String TEST_SPEC_NAME = \"";
  protected final String TEXT_4 = "\";" + NL + "  " + NL + "  protected ";
  protected final String TEXT_5 = " fixture;" + NL + "  " + NL + "  protected ";
  protected final String TEXT_6 = " container;" + NL + "  " + NL + "  public ";
  protected final String TEXT_7 = "TestSpec_Base(String testBundleId)" + NL + "  {" + NL + "    super(TEST_SPEC_NAME, testBundleId);" + NL + "  }" + NL + "" + NL + "  public IFixture getFixture()" + NL + "  {" + NL + "    return fixture;" + NL + "  }" + NL + "  ";
  protected final String TEXT_8 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Test Case ";
  protected final String TEXT_9 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  public void test";
  protected final String TEXT_10 = "(String testCaseName) throws Exception" + NL + "  {" + NL + "    long start = System.currentTimeMillis();" + NL + "    this.testCaseName = testCaseName;" + NL + "    fixture = null;" + NL + "    container = null;" + NL + "    " + NL + "\tSystem.out.println(\"**********************************************************************\");" + NL + "\tSystem.out.println(\"**********************************************************************\");" + NL + "    System.out.println(\"******* Test Case:      \" + testCaseName);" + NL + "    System.out.println(\"******* Postcondition:  \");" + NL + "    System.out.println(\"******* Precondition:   \");" + NL + "    System.out.println(\"******* Test Container: \");" + NL + "    System.out.println(\"******* Test Execution: \");" + NL + "\tSystem.out.println(\"**********************************************************************\");" + NL + "\tSystem.out.println(\"**********************************************************************\");" + NL + "" + NL + "    try" + NL + "    {" + NL + "      // Create the fixture" + NL + "      System.out.println(\"******* Creating Fixture [\" + testCaseName + \"]\");" + NL + "      fixture = test";
  protected final String TEXT_11 = "_CreateFixture();" + NL + "      BeanHelper.initialize(fixture);";
  protected final String TEXT_12 = NL + "      action";
  protected final String TEXT_13 = "(); // ";
  protected final String TEXT_14 = NL + NL + "      try" + NL + "      {" + NL + "        // Create the container" + NL + "        System.out.println(\"******* Creating Container [\" + testCaseName + \"]\");" + NL + "        container = test";
  protected final String TEXT_15 = "_CreateContainer();" + NL + "        BeanHelper.initialize(container);" + NL + "        System.out.println(\"******* Executing [\" + testCaseName + \"]\");";
  protected final String TEXT_16 = NL + "        action";
  protected final String TEXT_17 = "(); // ";
  protected final String TEXT_18 = NL + NL + "        System.out.println(\"******* Verifying [\" + testCaseName + \"]\");";
  protected final String TEXT_19 = NL + "        assertion";
  protected final String TEXT_20 = "(); // ";
  protected final String TEXT_21 = NL + "\t  }" + NL + "\t  catch (Exception ex)" + NL + "\t  {" + NL + "\t    ex.printStackTrace();" + NL + "\t    throw ex;" + NL + "\t  }" + NL + "\t  finally" + NL + "\t  {" + NL + "        System.out.println(\"******* Disposing Container [\" + testCaseName + \"]\");" + NL + "        BeanHelper.disposeSilently(container);" + NL + "\t  }" + NL + "\t}" + NL + "    catch (Exception ex)" + NL + "    {" + NL + "      ex.printStackTrace();" + NL + "      throw ex;" + NL + "    }" + NL + "\tfinally" + NL + "\t{" + NL + "      System.out.println(\"******* Disposing Fixture [\" + testCaseName + \"]\");" + NL + "      BeanHelper.disposeSilently(fixture);" + NL + "      long duration = System.currentTimeMillis() - start;" + NL + "      System.out.println(\"******* Finished after \" + duration + \" msecs [\" + testCaseName + \"]\");" + NL + "      System.out.println();" + NL + "      System.out.println();" + NL + "\t}" + NL + "  }" + NL + "" + NL + "  protected ";
  protected final String TEXT_22 = " test";
  protected final String TEXT_23 = "_CreateFixture() throws Exception" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_24 = "(this);" + NL + "  }" + NL + "" + NL + "  protected ";
  protected final String TEXT_25 = " test";
  protected final String TEXT_26 = "_CreateContainer() throws Exception" + NL + "  {";
  protected final String TEXT_27 = NL + "    return create_";
  protected final String TEXT_28 = "_Container(); ";
  protected final String TEXT_29 = NL + "    return new ";
  protected final String TEXT_30 = "();";
  protected final String TEXT_31 = NL + "  }" + NL;
  protected final String TEXT_32 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Actions" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_33 = NL + "  protected abstract void action";
  protected final String TEXT_34 = "() throws Exception;" + NL;
  protected final String TEXT_35 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Assertions" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_36 = NL + "  protected abstract void assertion";
  protected final String TEXT_37 = "() throws Exception;" + NL;
  protected final String TEXT_38 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Support for test container ";
  protected final String TEXT_39 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  protected ";
  protected final String TEXT_40 = " create_";
  protected final String TEXT_41 = "_Container()" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_42 = "();" + NL + "  }" + NL;
  protected final String TEXT_43 = NL + "  protected ";
  protected final String TEXT_44 = ".";
  protected final String TEXT_45 = "Context create_";
  protected final String TEXT_46 = "_";
  protected final String TEXT_47 = "Context(";
  protected final String TEXT_48 = " container)" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_49 = ".";
  protected final String TEXT_50 = "Context(container)" + NL + "    {" + NL + "      @Override" + NL + "      public IComponent createInstance()" + NL + "      {" + NL + "        Component_Base originalInstance = (Component_Base)super.createInstance();" + NL + "        Component_Base instance = create_";
  protected final String TEXT_51 = "_";
  protected final String TEXT_52 = "Instance(originalInstance);" + NL + "        instance.setContext(this);" + NL + "        return instance;" + NL + "      }" + NL + "    };" + NL + "  }" + NL + "" + NL + "  protected Component_Base create_";
  protected final String TEXT_53 = "_";
  protected final String TEXT_54 = "Instance(Component_Base originalInstance)" + NL + "  {" + NL + "    return originalInstance;" + NL + "  }" + NL;
  protected final String TEXT_55 = NL + "  protected class ";
  protected final String TEXT_56 = " extends ";
  protected final String TEXT_57 = NL + "  {" + NL + "    public ";
  protected final String TEXT_58 = "()" + NL + "    {" + NL + "    }";
  protected final String TEXT_59 = NL + NL + "    @Override" + NL + "    protected ";
  protected final String TEXT_60 = "Context create";
  protected final String TEXT_61 = "Context()" + NL + "    {" + NL + "      return create_";
  protected final String TEXT_62 = "_";
  protected final String TEXT_63 = "Context(this);" + NL + "    }";
  protected final String TEXT_64 = NL + "  }";
  protected final String TEXT_65 = NL + "}";
  protected final String TEXT_66 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
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

TestSpec testSpec = (TestSpec)argument;
EList allTests = testSpec.getAllVerifications();
EList allActions = testSpec.getAllActions();
EList allAssertions = testSpec.getAllAssertions();
EList containerOverrides = testSpec.getContainerOverrides();

String containerInterface = testSpec.getContainerToTest().getPackageName() + ".I" + GenUtil.capitalize(testSpec.getContainerToTest().getName());
String containerClass = testSpec.getContainerToTest().getPackageName() + ".impl." + GenUtil.capitalize(testSpec.getContainerToTest().getName()) + "Impl";
String fixtureInterface = testSpec.getFixtureInterface();
String fixtureClass = testSpec.getFixtureClass();
if (fixtureInterface == null || fixtureInterface.length() == 0) fixtureInterface = "IFixture";
if (fixtureClass == null || fixtureClass.length() == 0) fixtureClass = "Fixture";

    stringBuffer.append(TEXT_1);
    stringBuffer.append(testSpec.getPackageName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(testSpec.getName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(testSpec.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(fixtureInterface);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(containerInterface);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(testSpec.getName());
    stringBuffer.append(TEXT_7);
    for (Iterator it = allTests.iterator(); it.hasNext();) {
  Verification test = (Verification)it.next();
  EList specSequence = test.getSpecSequence();
  String id = GenUtil.capitalize(test.getId());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_11);
    for (Iterator it2 = specSequence.iterator(); it2.hasNext();) {
    TestCaseSpec tcs = (TestCaseSpec)it2.next();
    if (tcs instanceof Initialization) {
      Initialization init = (Initialization) tcs;
      for (Iterator it3 = init.getInitializationActions().iterator(); it3.hasNext();) {
        Action action = (Action)it3.next();
    stringBuffer.append(TEXT_12);
    stringBuffer.append(GenUtil.capitalize(action.getName()));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(GenUtil.capitalize(action.getName()));
    }
    }
    }
    stringBuffer.append(TEXT_14);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_15);
    for (Iterator it2 = specSequence.iterator(); it2.hasNext();) {
    TestCaseSpec tcs = (TestCaseSpec)it2.next();
    if (tcs instanceof Execution) {
      Execution exec = (Execution) tcs;
      for (Iterator it3 = exec.getExecutionActions().iterator(); it3.hasNext();) { Action action = (Action)it3.next();
    stringBuffer.append(TEXT_16);
    stringBuffer.append(GenUtil.capitalize(action.getName()));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(GenUtil.capitalize(action.getName()));
    }
    }
    }
    stringBuffer.append(TEXT_18);
    for (Iterator it3 = test.getAssertions().iterator(); it3.hasNext();) {
    Assertion assertion = (Assertion)it3.next();
    stringBuffer.append(TEXT_19);
    stringBuffer.append(GenUtil.capitalize(assertion.getName()));
    stringBuffer.append(TEXT_20);
    stringBuffer.append(GenUtil.capitalize(assertion.getName()));
    }
    stringBuffer.append(TEXT_21);
    stringBuffer.append(fixtureInterface);
    stringBuffer.append(TEXT_22);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_23);
    stringBuffer.append(fixtureClass);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(containerInterface);
    stringBuffer.append(TEXT_25);
    stringBuffer.append(id);
    stringBuffer.append(TEXT_26);
    if (test.getContainerOverride() != null) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(GenUtil.capitalize(test.getContainerOverride().getName()));
    stringBuffer.append(TEXT_28);
    } else {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(containerClass);
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    }
    stringBuffer.append(TEXT_32);
    for (Iterator it = allActions.iterator(); it.hasNext();) {
  Action action = (Action)it.next();
    stringBuffer.append(TEXT_33);
    stringBuffer.append(GenUtil.capitalize(action.getName()));
    stringBuffer.append(TEXT_34);
    }
    stringBuffer.append(TEXT_35);
    for (Iterator it = allAssertions.iterator(); it.hasNext();) {
  Assertion assertion= (Assertion)it.next();
    stringBuffer.append(TEXT_36);
    stringBuffer.append(GenUtil.capitalize(assertion.getName()));
    stringBuffer.append(TEXT_37);
    }
    
    
    
    for (Iterator it = containerOverrides.iterator(); it.hasNext();) {
  ContainerOverride containerOverride = (ContainerOverride)it.next();
  String overrideName = GenUtil.capitalize(containerOverride.getName());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(containerInterface);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_42);
    for (Iterator it2 = containerOverride.getDeploymentOverrides().iterator(); it2.hasNext();) {
    DeploymentOverride testDepl = (DeploymentOverride)it2.next(); 
    Deployment depl = testDepl.getDeploymentToOverride(); 
    String deplId = GenUtil.capitalize(depl.getId());
    stringBuffer.append(TEXT_43);
    stringBuffer.append(containerClass);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(deplId);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(deplId);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(containerClass);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(deplId);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(deplId);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(deplId);
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_55);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(containerClass);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_58);
    for (Iterator it2 = containerOverride.getDeploymentOverrides().iterator(); it2.hasNext();) {
    DeploymentOverride testDepl = (DeploymentOverride)it2.next();
    Deployment depl = testDepl.getDeploymentToOverride();
    String deplId = GenUtil.capitalize(depl.getId());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(deplId);
    stringBuffer.append(TEXT_60);
    stringBuffer.append(deplId);
    stringBuffer.append(TEXT_61);
    stringBuffer.append(overrideName);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(deplId);
    stringBuffer.append(TEXT_63);
    }
    stringBuffer.append(TEXT_64);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    stringBuffer.append(TEXT_65);
    stringBuffer.append(TEXT_66);
    return stringBuffer.toString();
  }
}

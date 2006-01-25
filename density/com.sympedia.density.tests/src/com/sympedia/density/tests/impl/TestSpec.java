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
package com.sympedia.density.tests.impl;


import com.sympedia.density.tests.ITestSpec;


public abstract class TestSpec extends junit.framework.Assert implements ITestSpec
{
  protected String testBundleId;

  protected String testSpecName;

  protected String testCaseName;

  public TestSpec(String testSpecName, String testBundleId)
  {
    this.testSpecName = testSpecName;
    this.testBundleId = testBundleId;
  }

  public String getTestBundleId()
  {
    return testBundleId;
  }

  public String getTestSpecName()
  {
    return testSpecName;
  }

  public String getTestCaseName()
  {
    return testCaseName;
  }

  public void setTestCaseName(String testCaseName)
  {
    this.testCaseName = testCaseName;
  }
}

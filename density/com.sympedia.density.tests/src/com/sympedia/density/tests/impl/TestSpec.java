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

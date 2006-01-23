package com.sympedia.density.tests;


public interface ITestSpec
{
  public String getTestBundleId();

  public String getTestSpecName();

  public String getTestCaseName();

  public void setTestCaseName(String testCaseName);

  public IFixture getFixture();
}

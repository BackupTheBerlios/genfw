package com.sympedia.density.tests;


import com.sympedia.util.IDisposable;
import com.sympedia.util.IInitializable;


public interface IFixture extends IInitializable, IDisposable
{
  public ITestSpec getTestSpec();

  public String getTestSpecName();

  public String getTestCaseName();
}

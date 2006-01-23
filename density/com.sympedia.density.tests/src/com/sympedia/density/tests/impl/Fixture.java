package com.sympedia.density.tests.impl;


import com.sympedia.density.tests.IFixture;
import com.sympedia.density.tests.ITestSpec;

import com.sympedia.util.Assert;

import org.apache.log4j.Logger;


public class Fixture extends junit.framework.Assert implements IFixture
{
  private static final Logger logger = Logger.getLogger(Fixture.class);

  private ITestSpec testSpec;

  public Fixture(ITestSpec testSpec)
  {
    this.testSpec = testSpec;
  }

  public void initialize() throws Exception
  {
    Assert.notNull(testSpec);
    logger.debug("Initializing for " + getTestSpecName() + "." + getTestCaseName());
  }

  public void dispose() throws Exception
  {
    logger.debug("Disposing of " + getTestSpecName() + "." + getTestCaseName());
    testSpec = null;
  }

  public ITestSpec getTestSpec()
  {
    return testSpec;
  }

  public String getTestSpecName()
  {
    return testSpec.getTestSpecName();
  }

  public String getTestCaseName()
  {
    return testSpec.getTestCaseName();
  }
}

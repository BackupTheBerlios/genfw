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

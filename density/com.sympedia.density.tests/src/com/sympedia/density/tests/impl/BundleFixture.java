package com.sympedia.density.tests.impl;


import com.sympedia.density.tests.IBundleFixture;
import com.sympedia.density.tests.IExtensionPointStub;
import com.sympedia.density.tests.ITestSpec;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


public class BundleFixture extends Fixture implements IBundleFixture
{
  private static final Logger logger = Logger.getLogger(BundleFixture.class);

  private Map<String, IExtensionPointStub> stubs = new HashMap<String, IExtensionPointStub>();

  public BundleFixture(ITestSpec testSpec)
  {
    super(testSpec);
  }

  @Override
  public void initialize() throws Exception
  {
    super.initialize();
  }

  @Override
  public void dispose() throws Exception
  {
    super.dispose();
  }

  public IExtensionPointStub addExtensionPoint(String namespace, String simpleIdentifier)
  {
    IExtensionPointStub stub = new ExtensionPointStub(namespace, simpleIdentifier);
    logger.debug("Adding extension point " + stub.getUniqueIdentifier());
    stubs.put(stub.getUniqueIdentifier(), stub);
    return stub;
  }

  public IExtensionPointStub getExtensionPoint(String id)
  {
    return stubs.get(id);
  }

  public Map<String, IExtensionPointStub> getStubs()
  {
    return stubs;
  }
}

package com.sympedia.density.tests;


import java.util.Map;


public interface IBundleFixture extends IFixture
{
  public IExtensionPointStub addExtensionPoint(String namespace, String simpleIdentifier);

  public IExtensionPointStub getExtensionPoint(String id);

  public Map<String, IExtensionPointStub> getStubs();
}

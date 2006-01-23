package com.sympedia.density.tests;


import com.sympedia.density.tests.impl.ExtensionStub;


public interface IExtensionPointStubListener
{
  public void notifyExtensionAdded(ExtensionStub extension);

  public void notifyExtensionRemoved(ExtensionStub extension);
}

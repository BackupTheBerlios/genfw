package com.sympedia.density.tests;


import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;


public interface IExtensionPointStub extends IExtensionPoint
{
  public IExtension addExtension(String extensionId);

  public void removeExtension(String extensionId);

  public void addExtensionPointStubListener(IExtensionPointStubListener listener);

  public void removeExtensionPointStubListener(IExtensionPointStubListener listener);
}

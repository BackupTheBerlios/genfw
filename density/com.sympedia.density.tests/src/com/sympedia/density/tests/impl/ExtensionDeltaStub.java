package com.sympedia.density.tests.impl;


import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionDelta;
import org.eclipse.core.runtime.IExtensionPoint;


public class ExtensionDeltaStub implements IExtensionDelta
{
  protected int kind;

  protected ExtensionStub extension;

  protected ExtensionPointStub extensionPoint;

  public ExtensionDeltaStub(int kind, ExtensionStub extension, ExtensionPointStub extensionPoint)
  {
    this.kind = kind;
    this.extension = extension;
    this.extensionPoint = extensionPoint;
  }

  public int getKind()
  {
    return kind;
  }

  public IExtension getExtension()
  {
    return extension;
  }

  public IExtensionPoint getExtensionPoint()
  {
    return extensionPoint;
  }
}

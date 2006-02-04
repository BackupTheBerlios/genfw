package com.sympedia.genfw.util;


import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSParser;

import java.io.InputStream;


public class DomHelper
{
  public static final String REGISTRY_CLASSNAME = "org.apache.xerces.dom.DOMXSImplementationSourceImpl";

  public static final String IMPL_NAME = "XML";

  public static final String LS_IMPL_NAME = "LS";

  private static DOMImplementationRegistry registry;

  private static DOMImplementationLS implLS;

  private static DOMImplementation impl;

  public static Document parseDocument(InputStream stream) throws ClassNotFoundException,
          InstantiationException, IllegalAccessException
  {
    DOMImplementationLS impl = getDOMImplementationLS();
    LSInput input = impl.createLSInput();
    input.setByteStream(stream);
    LSParser builder = impl.createLSParser(DOMImplementationLS.MODE_SYNCHRONOUS, null);
    Document document = builder.parse(input);
    return document;
  }

  public static synchronized DOMImplementationRegistry getDOMImplementationRegistry()
          throws ClassNotFoundException, InstantiationException, IllegalAccessException
  {
    if (registry == null)
    {
      System.setProperty(DOMImplementationRegistry.PROPERTY, REGISTRY_CLASSNAME);
      registry = DOMImplementationRegistry.newInstance();
    }

    return registry;
  }

  public static synchronized DOMImplementation getDOMImplementation()
          throws InstantiationException, IllegalAccessException, ClassNotFoundException
  {
    if (impl == null)
    {
      impl = (DOMImplementation)getDOMImplementationRegistry().getDOMImplementation(IMPL_NAME);
    }

    return impl;
  }

  public static synchronized DOMImplementationLS getDOMImplementationLS()
          throws ClassNotFoundException, InstantiationException, IllegalAccessException
  {
    if (implLS == null)
    {
      implLS = (DOMImplementationLS)getDOMImplementationRegistry().getDOMImplementation(
              LS_IMPL_NAME);
    }

    return implLS;
  }

}

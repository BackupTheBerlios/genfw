package com.sympedia.genfw.jdt.util;


import java.util.HashMap;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;


public class CodeFormatterProfileParser extends DefaultHandler
{
  private Map options = null;

  private String SETTING = "setting";

  private String ID = "id";

  private String VALUE = "value";

  private String EMPTY = "";

  public void startDocument()
  {
    options = new HashMap();
  }

  public void startElement(String namespaceURI, String localName, String qualifiedName,
          Attributes atts)
  {
    if (EMPTY.equals(namespaceURI) && SETTING.equals(localName))
    {
      String id = atts.getValue(EMPTY, ID);
      String value = atts.getValue(EMPTY, VALUE);

      if (id != null && value != null)
      {
        options.put(id, value);
      }
    }
  }

  public Map getOptions()
  {
    return options;
  }

  public static Map parse(String systemID)
  {
    try
    {
      XMLReader parser = XMLReaderFactory.createXMLReader();
      CodeFormatterProfileParser handler = new CodeFormatterProfileParser();
      parser.setContentHandler(handler);
      parser.parse(systemID);
      return handler.getOptions();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }

    return null;
  }
}

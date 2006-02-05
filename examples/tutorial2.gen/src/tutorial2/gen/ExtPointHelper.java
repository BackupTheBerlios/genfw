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
package tutorial2.gen;


import com.sympedia.util.StringHelper;

import org.apache.xpath.XPathAPI;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.transform.TransformerException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ExtPointHelper
{
  private static final String META_ATTRIBUTE_XPATH = "annotation/appInfo/meta.attribute";

  private static final String META_SCHEMA_XPATH = "/schema/annotation/appInfo/meta.schema";

  public static String xPathString(Node context, String expr)
  {
    try
    {
      return XPathAPI.eval(context, expr).toString();
    }
    catch (TransformerException ex)
    {
      throw new RuntimeException(ex);
    }
  }

  public static List<Element> xPathList(Node context, String expr)
  {
    try
    {
      List<Element> result = new ArrayList<Element>();
      NodeList list = XPathAPI.eval(context, expr).nodelist();
      for (int i = 0; i < list.getLength(); i++)
      {
        result.add((Element)list.item(i));
      }

      return result;
    }
    catch (TransformerException ex)
    {
      throw new RuntimeException(ex);
    }
  }

  public static String getElementClassName(Element element)
  {
    String name = element.getAttribute("name");
    if (!isExtension(element)) return StringHelper.firstToUpper(name);
    return StringHelper.firstToUpper(getExtPointId(element)) + "Extension";
  }

  public static String getRegistryClassName(Element element)
  {
    return StringHelper.firstToUpper(getExtPointId(element)) + "Registry";
  }

  public static boolean isExtension(Element element)
  {
    String name = element.getAttribute("name");
    return "extension".equals(name);
  }

  public static String getPluginId(Element element)
  {
    return xPathString(element, META_SCHEMA_XPATH + "/@plugin");
  }

  public static String getExtPointId(Element element)
  {
    return xPathString(element, META_SCHEMA_XPATH + "/@id");
  }

  public static Set<String> getReferences(Element element)
  {
    Set<String> result = new HashSet<String>();
    for (Element reference : xPathList(element, ".//element"))
    {
      String target = reference.getAttribute("ref");
      if (target != null && target.length() != 0)
      {
        result.add(target);
      }
    }

    return result;
  }

  public static String getKind(Element element)
  {
    List<Element> pathList = xPathList(element, META_ATTRIBUTE_XPATH);
    if (pathList.size() == 0) return null;
    Element metaAttr = pathList.get(0);
    return metaAttr.getAttribute("kind");
  }

  public static String getBasedOn(Element element)
  {
    Element metaAttr = xPathList(element, META_ATTRIBUTE_XPATH).get(0);
    String basedOn = metaAttr.getAttribute("basedOn");
    return basedOn == null || basedOn.length() == 0 ? "Object" : basedOn;
  }
}

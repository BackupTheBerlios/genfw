/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw.impl;


import com.sympedia.genfw.DomContentProvider;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.util.DomHelper;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClass;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dom Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DomContentProviderImpl extends ContentProviderImpl implements DomContentProvider
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomContentProviderImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return GenfwPackage.Literals.DOM_CONTENT_PROVIDER;
  }

  /**
   * @ADDED
   */
  @Override
  public List getRoots(String path) throws Exception
  {
    IFile file = ResourcesHelper.getFile(path);
    Document document = DomHelper.parseDocument(file.getContents());
    return Collections.singletonList(document);
  }

  /**
   * @ADDED
   */
  @Override
  public List getChildren(Object object) throws Exception
  {
    if (object instanceof Node)
    {
      NodeList childNodes = ((Node)object).getChildNodes();
      int length = childNodes.getLength();

      List result = new ArrayList(length);
      for (int i = 0; i < length; i++)
      {
        result.add(childNodes.item(i));
      }

      return result;
    }

    return Collections.EMPTY_LIST;
  }
} //DomContentProviderImpl

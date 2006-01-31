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
package com.sympedia.genfw.impl;


import com.sympedia.genfw.EcoreContentProvider;
import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.util.List;
import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EcoreContentProviderImpl extends ContentProviderImpl implements EcoreContentProvider
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EcoreContentProviderImpl()
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
    return GenfwPackage.Literals.ECORE_CONTENT_PROVIDER;
  }

  //  /**
  //   * <!-- begin-user-doc -->
  //   * <!-- end-user-doc -->
  //   * @generated NOT
  //   */
  //  public String getLabel()
  //  {
  //    return "Ecore";
  //  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public List getRoots(String path) throws Exception
  {
    ResourceSetImpl rs = new ResourceSetImpl();
    Map map = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
    map.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

    URI uri = URI.createPlatformResourceURI(path);
    Resource resource = rs.getResource(uri, true);
    return resource.getContents();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public List getChildren(Object object) throws Exception
  {
    EObject eObject = (EObject)object;
    return eObject.eContents();
  }

} //EcoreContentProviderImpl

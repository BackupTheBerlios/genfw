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


import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.PropertiesContentProvider;

import org.eclipse.emf.ecore.EClass;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PropertiesContentProviderImpl extends ContentProviderImpl implements
        PropertiesContentProvider
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertiesContentProviderImpl()
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
    return GenfwPackage.Literals.PROPERTIES_CONTENT_PROVIDER;
  }

  /**
   * @ADDED
   */
  @Override
  public List getRoots(String path)
  {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * @ADDED
   */
  @Override
  public List getChildren(Object object)
  {
    // TODO Auto-generated method stub
    return null;
  }
} //PropertiesContentProviderImpl

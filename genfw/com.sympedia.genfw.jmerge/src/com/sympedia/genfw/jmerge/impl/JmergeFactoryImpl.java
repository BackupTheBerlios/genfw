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
package com.sympedia.genfw.jmerge.impl;


import com.sympedia.genfw.jmerge.*;

import com.sympedia.genfw.jmerge.JmergeFactory;
import com.sympedia.genfw.jmerge.Jmerger;
import com.sympedia.genfw.jmerge.JmergePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JmergeFactoryImpl extends EFactoryImpl implements JmergeFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JmergeFactory init()
  {
    try
    {
      JmergeFactory theJmergeFactory = (JmergeFactory)EPackage.Registry.INSTANCE
              .getEFactory("http://www.sympedia.com/2006/genfw/jmerge");
      if (theJmergeFactory != null)
      {
        return theJmergeFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JmergeFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JmergeFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case JmergePackage.JMERGER:
      return createJmerger();
    case JmergePackage.PROPERTY_MERGER:
      return createPropertyMerger();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName()
              + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Jmerger createJmerger()
  {
    JmergerImpl jmerger = new JmergerImpl();
    return jmerger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyMerger createPropertyMerger()
  {
    PropertyMergerImpl propertyMerger = new PropertyMergerImpl();
    return propertyMerger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JmergePackage getJmergePackage()
  {
    return (JmergePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static JmergePackage getPackage()
  {
    return JmergePackage.eINSTANCE;
  }

} //JmergeFactoryImpl

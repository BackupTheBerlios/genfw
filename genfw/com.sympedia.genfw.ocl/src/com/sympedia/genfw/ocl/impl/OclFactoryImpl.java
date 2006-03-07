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
package com.sympedia.genfw.ocl.impl;


import com.sympedia.genfw.ocl.*;

import com.sympedia.genfw.ocl.ConfigurableOclRule;
import com.sympedia.genfw.ocl.DynamicPackage;
import com.sympedia.genfw.ocl.OclFactory;
import com.sympedia.genfw.ocl.OclPackage;
import com.sympedia.genfw.ocl.OclRule;
import com.sympedia.genfw.ocl.StaticPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OclFactoryImpl extends EFactoryImpl implements OclFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OclFactory init()
  {
    try
    {
      OclFactory theOclFactory = (OclFactory)EPackage.Registry.INSTANCE
              .getEFactory("http://www.sympedia.com/2006/genfw/ocl");
      if (theOclFactory != null)
      {
        return theOclFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OclFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclFactoryImpl()
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
    case OclPackage.OCL_RULE:
      return createOclRule();
    case OclPackage.CONFIGURABLE_OCL_RULE:
      return createConfigurableOclRule();
    case OclPackage.DYNAMIC_PACKAGE:
      return createDynamicPackage();
    case OclPackage.STATIC_PACKAGE:
      return createStaticPackage();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
    case OclPackage.EPACKAGE_REGISTRY:
      return createEPackageRegistryFromString(eDataType, initialValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName()
              + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
    case OclPackage.EPACKAGE_REGISTRY:
      return convertEPackageRegistryToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName()
              + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclRule createOclRule()
  {
    OclRuleImpl oclRule = new OclRuleImpl();
    return oclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurableOclRule createConfigurableOclRule()
  {
    ConfigurableOclRuleImpl configurableOclRule = new ConfigurableOclRuleImpl();
    return configurableOclRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DynamicPackage createDynamicPackage()
  {
    DynamicPackageImpl dynamicPackage = new DynamicPackageImpl();
    return dynamicPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticPackage createStaticPackage()
  {
    StaticPackageImpl staticPackage = new StaticPackageImpl();
    return staticPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Registry createEPackageRegistryFromString(EDataType eDataType, String initialValue)
  {
    return (Registry)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEPackageRegistryToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclPackage getOclPackage()
  {
    return (OclPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static OclPackage getPackage()
  {
    return OclPackage.eINSTANCE;
  }

} //OclFactoryImpl

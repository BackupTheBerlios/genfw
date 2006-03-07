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
package com.sympedia.genfw.ocl.util;


import com.sympedia.genfw.ExpressionBasedRule;
import com.sympedia.genfw.LifeCycle;
import com.sympedia.genfw.Rule;
import com.sympedia.genfw.ocl.*;

import com.sympedia.genfw.ocl.ConfigurableOclRule;
import com.sympedia.genfw.ocl.DynamicPackage;
import com.sympedia.genfw.ocl.OclPackage;
import com.sympedia.genfw.ocl.OclRule;
import com.sympedia.genfw.ocl.PackageConfiguration;
import com.sympedia.genfw.ocl.StaticPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.ocl.OclPackage
 * @generated
 */
public class OclSwitch
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OclPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = OclPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public Object doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List eSuperTypes = theEClass.getESuperTypes();
      return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass)eSuperTypes.get(0),
              theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
    case OclPackage.OCL_RULE:
    {
      OclRule oclRule = (OclRule)theEObject;
      Object result = caseOclRule(oclRule);
      if (result == null) result = caseExpressionBasedRule(oclRule);
      if (result == null) result = caseRule(oclRule);
      if (result == null) result = caseLifeCycle(oclRule);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case OclPackage.CONFIGURABLE_OCL_RULE:
    {
      ConfigurableOclRule configurableOclRule = (ConfigurableOclRule)theEObject;
      Object result = caseConfigurableOclRule(configurableOclRule);
      if (result == null) result = caseOclRule(configurableOclRule);
      if (result == null) result = caseExpressionBasedRule(configurableOclRule);
      if (result == null) result = caseRule(configurableOclRule);
      if (result == null) result = caseLifeCycle(configurableOclRule);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case OclPackage.PACKAGE_CONFIGURATION:
    {
      PackageConfiguration packageConfiguration = (PackageConfiguration)theEObject;
      Object result = casePackageConfiguration(packageConfiguration);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case OclPackage.DYNAMIC_PACKAGE:
    {
      DynamicPackage dynamicPackage = (DynamicPackage)theEObject;
      Object result = caseDynamicPackage(dynamicPackage);
      if (result == null) result = casePackageConfiguration(dynamicPackage);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case OclPackage.STATIC_PACKAGE:
    {
      StaticPackage staticPackage = (StaticPackage)theEObject;
      Object result = caseStaticPackage(staticPackage);
      if (result == null) result = casePackageConfiguration(staticPackage);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseOclRule(OclRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Configurable Ocl Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Configurable Ocl Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseConfigurableOclRule(ConfigurableOclRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Package Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Package Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object casePackageConfiguration(PackageConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Dynamic Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Dynamic Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDynamicPackage(DynamicPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Static Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Static Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseStaticPackage(StaticPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Life Cycle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Life Cycle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseLifeCycle(LifeCycle object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Expression Based Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Expression Based Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseExpressionBasedRule(ExpressionBasedRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public Object defaultCase(EObject object)
  {
    return null;
  }

} //OclSwitch

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
package com.sympedia.genfw.jet.util;


import com.sympedia.genfw.Generator;
import com.sympedia.genfw.LifeCycle;
import com.sympedia.genfw.jet.EcoreTemplate;
import com.sympedia.genfw.jet.EmfGenerator;
import com.sympedia.genfw.jet.GifColorer;
import com.sympedia.genfw.jet.JetPackage;
import com.sympedia.genfw.jet.JetTemplate;

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
 * @see com.sympedia.genfw.jet.JetPackage
 * @generated
 */
public class JetSwitch
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JetPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JetSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JetPackage.eINSTANCE;
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
    case JetPackage.JET_TEMPLATE:
    {
      JetTemplate jetTemplate = (JetTemplate)theEObject;
      Object result = caseJetTemplate(jetTemplate);
      if (result == null) result = caseGenerator(jetTemplate);
      if (result == null) result = caseLifeCycle(jetTemplate);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case JetPackage.ECORE_TEMPLATE:
    {
      EcoreTemplate ecoreTemplate = (EcoreTemplate)theEObject;
      Object result = caseEcoreTemplate(ecoreTemplate);
      if (result == null) result = caseJetTemplate(ecoreTemplate);
      if (result == null) result = caseGenerator(ecoreTemplate);
      if (result == null) result = caseLifeCycle(ecoreTemplate);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case JetPackage.EMF_GENERATOR:
    {
      EmfGenerator emfGenerator = (EmfGenerator)theEObject;
      Object result = caseEmfGenerator(emfGenerator);
      if (result == null) result = caseGenerator(emfGenerator);
      if (result == null) result = caseLifeCycle(emfGenerator);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case JetPackage.GIF_COLORER:
    {
      GifColorer gifColorer = (GifColorer)theEObject;
      Object result = caseGifColorer(gifColorer);
      if (result == null) result = caseGenerator(gifColorer);
      if (result == null) result = caseLifeCycle(gifColorer);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseJetTemplate(JetTemplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Ecore Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Ecore Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseEcoreTemplate(EcoreTemplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Emf Generator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Emf Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseEmfGenerator(EmfGenerator object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Gif Colorer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Gif Colorer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseGifColorer(GifColorer object)
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
   * Returns the result of interpretting the object as an instance of '<em>Generator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseGenerator(Generator object)
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

} //JetSwitch

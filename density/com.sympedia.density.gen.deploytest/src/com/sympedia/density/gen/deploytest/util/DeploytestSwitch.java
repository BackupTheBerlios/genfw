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
package com.sympedia.density.gen.deploytest.util;


import com.sympedia.density.gen.deploytest.*;

import com.sympedia.density.gen.deploytest.Action;
import com.sympedia.density.gen.deploytest.ActionContainer;
import com.sympedia.density.gen.deploytest.Assertion;
import com.sympedia.density.gen.deploytest.AssertionContainer;
import com.sympedia.density.gen.deploytest.BinaryOpAssertion;
import com.sympedia.density.gen.deploytest.ContainerOverride;
import com.sympedia.density.gen.deploytest.DeploymentOverride;
import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.DerivedAssertion;
import com.sympedia.density.gen.deploytest.Execution;
import com.sympedia.density.gen.deploytest.IDisplayable;
import com.sympedia.density.gen.deploytest.Initialization;
import com.sympedia.density.gen.deploytest.NamedElement;
import com.sympedia.density.gen.deploytest.TestCaseSpec;
import com.sympedia.density.gen.deploytest.TestSpec;
import com.sympedia.density.gen.deploytest.TestSuite;
import com.sympedia.density.gen.deploytest.UnaryOpAssertion;
import com.sympedia.density.gen.deploytest.Verification;

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
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage
 * @generated
 */
public class DeploytestSwitch
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DeploytestPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploytestSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DeploytestPackage.eINSTANCE;
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
      case DeploytestPackage.IDISPLAYABLE:
      {
        IDisplayable iDisplayable = (IDisplayable)theEObject;
        Object result = caseIDisplayable(iDisplayable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        Object result = caseNamedElement(namedElement);
        if (result == null) result = caseIDisplayable(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.TEST_SPEC:
      {
        TestSpec testSpec = (TestSpec)theEObject;
        Object result = caseTestSpec(testSpec);
        if (result == null) result = caseNamedElement(testSpec);
        if (result == null) result = caseIDisplayable(testSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.CONTAINER_OVERRIDE:
      {
        ContainerOverride containerOverride = (ContainerOverride)theEObject;
        Object result = caseContainerOverride(containerOverride);
        if (result == null) result = caseNamedElement(containerOverride);
        if (result == null) result = caseIDisplayable(containerOverride);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.DEPLOYMENT_OVERRIDE:
      {
        DeploymentOverride deploymentOverride = (DeploymentOverride)theEObject;
        Object result = caseDeploymentOverride(deploymentOverride);
        if (result == null) result = caseIDisplayable(deploymentOverride);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.ACTION_CONTAINER:
      {
        ActionContainer actionContainer = (ActionContainer)theEObject;
        Object result = caseActionContainer(actionContainer);
        if (result == null) result = caseNamedElement(actionContainer);
        if (result == null) result = caseIDisplayable(actionContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.ACTION:
      {
        Action action = (Action)theEObject;
        Object result = caseAction(action);
        if (result == null) result = caseNamedElement(action);
        if (result == null) result = caseIDisplayable(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.ASSERTION_CONTAINER:
      {
        AssertionContainer assertionContainer = (AssertionContainer)theEObject;
        Object result = caseAssertionContainer(assertionContainer);
        if (result == null) result = caseNamedElement(assertionContainer);
        if (result == null) result = caseIDisplayable(assertionContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.ASSERTION:
      {
        Assertion assertion = (Assertion)theEObject;
        Object result = caseAssertion(assertion);
        if (result == null) result = caseNamedElement(assertion);
        if (result == null) result = caseIDisplayable(assertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.DERIVED_ASSERTION:
      {
        DerivedAssertion derivedAssertion = (DerivedAssertion)theEObject;
        Object result = caseDerivedAssertion(derivedAssertion);
        if (result == null) result = caseAssertion(derivedAssertion);
        if (result == null) result = caseNamedElement(derivedAssertion);
        if (result == null) result = caseIDisplayable(derivedAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.UNARY_OP_ASSERTION:
      {
        UnaryOpAssertion unaryOpAssertion = (UnaryOpAssertion)theEObject;
        Object result = caseUnaryOpAssertion(unaryOpAssertion);
        if (result == null) result = caseDerivedAssertion(unaryOpAssertion);
        if (result == null) result = caseAssertion(unaryOpAssertion);
        if (result == null) result = caseNamedElement(unaryOpAssertion);
        if (result == null) result = caseIDisplayable(unaryOpAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.BINARY_OP_ASSERTION:
      {
        BinaryOpAssertion binaryOpAssertion = (BinaryOpAssertion)theEObject;
        Object result = caseBinaryOpAssertion(binaryOpAssertion);
        if (result == null) result = caseDerivedAssertion(binaryOpAssertion);
        if (result == null) result = caseAssertion(binaryOpAssertion);
        if (result == null) result = caseNamedElement(binaryOpAssertion);
        if (result == null) result = caseIDisplayable(binaryOpAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.TEST_CASE_SPEC:
      {
        TestCaseSpec testCaseSpec = (TestCaseSpec)theEObject;
        Object result = caseTestCaseSpec(testCaseSpec);
        if (result == null) result = caseIDisplayable(testCaseSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.INITIALIZATION:
      {
        Initialization initialization = (Initialization)theEObject;
        Object result = caseInitialization(initialization);
        if (result == null) result = caseTestCaseSpec(initialization);
        if (result == null) result = caseIDisplayable(initialization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.EXECUTION:
      {
        Execution execution = (Execution)theEObject;
        Object result = caseExecution(execution);
        if (result == null) result = caseTestCaseSpec(execution);
        if (result == null) result = caseIDisplayable(execution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.VERIFICATION:
      {
        Verification verification = (Verification)theEObject;
        Object result = caseVerification(verification);
        if (result == null) result = caseTestCaseSpec(verification);
        if (result == null) result = caseIDisplayable(verification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeploytestPackage.TEST_SUITE:
      {
        TestSuite testSuite = (TestSuite)theEObject;
        Object result = caseTestSuite(testSuite);
        if (result == null) result = caseNamedElement(testSuite);
        if (result == null) result = caseIDisplayable(testSuite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default:
        return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>IDisplayable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>IDisplayable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseIDisplayable(IDisplayable object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Test Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Test Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseTestSpec(TestSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Deployment Override</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Deployment Override</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDeploymentOverride(DeploymentOverride object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Action Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Action Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseActionContainer(ActionContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Assertion Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Assertion Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseAssertionContainer(AssertionContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseAssertion(Assertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Derived Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Derived Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDerivedAssertion(DerivedAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Unary Op Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Unary Op Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseUnaryOpAssertion(UnaryOpAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Binary Op Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Binary Op Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseBinaryOpAssertion(BinaryOpAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Test Case Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Test Case Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseTestCaseSpec(TestCaseSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Initialization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Initialization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseInitialization(Initialization object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Execution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Execution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseExecution(Execution object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Verification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Verification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseVerification(Verification object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Test Suite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Test Suite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseTestSuite(TestSuite object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Container Override</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Container Override</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseContainerOverride(ContainerOverride object)
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

} //DeploytestSwitch

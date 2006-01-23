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
package com.sympedia.density.gen.deploytest;


import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage
 * @generated
 */
public interface DeploytestFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeploytestFactory eINSTANCE = com.sympedia.density.gen.deploytest.impl.DeploytestFactoryImpl
          .init();

  /**
   * Returns a new object of class '<em>Test Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Spec</em>'.
   * @generated
   */
  TestSpec createTestSpec();

  /**
   * Returns a new object of class '<em>Deployment Override</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Override</em>'.
   * @generated
   */
  DeploymentOverride createDeploymentOverride();

  /**
   * Returns a new object of class '<em>Action Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action Container</em>'.
   * @generated
   */
  ActionContainer createActionContainer();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Assertion Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assertion Container</em>'.
   * @generated
   */
  AssertionContainer createAssertionContainer();

  /**
   * Returns a new object of class '<em>Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assertion</em>'.
   * @generated
   */
  Assertion createAssertion();

  /**
   * Returns a new object of class '<em>Unary Op Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Op Assertion</em>'.
   * @generated
   */
  UnaryOpAssertion createUnaryOpAssertion();

  /**
   * Returns a new object of class '<em>Binary Op Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Binary Op Assertion</em>'.
   * @generated
   */
  BinaryOpAssertion createBinaryOpAssertion();

  /**
   * Returns a new object of class '<em>Initialization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initialization</em>'.
   * @generated
   */
  Initialization createInitialization();

  /**
   * Returns a new object of class '<em>Execution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execution</em>'.
   * @generated
   */
  Execution createExecution();

  /**
   * Returns a new object of class '<em>Verification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Verification</em>'.
   * @generated
   */
  Verification createVerification();

  /**
   * Returns a new object of class '<em>Test Suite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Suite</em>'.
   * @generated
   */
  TestSuite createTestSuite();

  /**
   * Returns a new object of class '<em>Container Override</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Override</em>'.
   * @generated
   */
  ContainerOverride createContainerOverride();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DeploytestPackage getDeploytestPackage();

} //DeploytestFactory

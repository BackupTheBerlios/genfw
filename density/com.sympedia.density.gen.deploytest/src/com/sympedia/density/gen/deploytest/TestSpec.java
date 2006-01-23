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


import com.sympedia.density.gen.deploy.Container;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getFixtureInterface <em>Fixture Interface</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getFixtureClass <em>Fixture Class</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getContainerToTest <em>Container To Test</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getContainerOverrides <em>Container Overrides</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getActionContainer <em>Action Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getAssertionContainer <em>Assertion Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getTestCaseSpecs <em>Test Case Specs</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getTestSuites <em>Test Suites</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getAllVerifications <em>All Verifications</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getAllActions <em>All Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSpec#getAllAssertions <em>All Assertions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec()
 * @model annotation="http://www.topcased.org/uuid uuid='11359738054531'"
 * @generated
 */
public interface TestSpec extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Action Container</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.ActionContainer#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Container</em>' containment reference.
   * @see #setActionContainer(ActionContainer)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_ActionContainer()
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getTestSpec
   * @model opposite="testSpec" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='11359738054533'"
   * @generated
   */
  ActionContainer getActionContainer();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestSpec#getActionContainer <em>Action Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Container</em>' containment reference.
   * @see #getActionContainer()
   * @generated
   */
  void setActionContainer(ActionContainer value);

  /**
   * Returns the value of the '<em><b>Assertion Container</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertion Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertion Container</em>' containment reference.
   * @see #setAssertionContainer(AssertionContainer)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_AssertionContainer()
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getTestSpec
   * @model opposite="testSpec" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='11359738054534'"
   * @generated
   */
  AssertionContainer getAssertionContainer();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestSpec#getAssertionContainer <em>Assertion Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assertion Container</em>' containment reference.
   * @see #getAssertionContainer()
   * @generated
   */
  void setAssertionContainer(AssertionContainer value);

  /**
   * Returns the value of the '<em><b>Test Case Specs</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.TestCaseSpec}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.TestCaseSpec#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Case Specs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Case Specs</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_TestCaseSpecs()
   * @see com.sympedia.density.gen.deploytest.TestCaseSpec#getTestSpec
   * @model type="com.sympedia.density.gen.deploytest.TestCaseSpec" opposite="testSpec" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597473968715'"
   * @generated
   */
  EList getTestCaseSpecs();

  /**
   * Returns the value of the '<em><b>Test Suites</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.TestSuite}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.TestSuite#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Suites</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Suites</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_TestSuites()
   * @see com.sympedia.density.gen.deploytest.TestSuite#getTestSpec
   * @model type="com.sympedia.density.gen.deploytest.TestSuite" opposite="testSpec" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113602871081233'"
   * @generated
   */
  EList getTestSuites();

  /**
   * Returns the value of the '<em><b>All Verifications</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Verification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Verifications</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Verifications</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_AllVerifications()
   * @model type="com.sympedia.density.gen.deploytest.Verification" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113603590059336'"
   * @generated
   */
  EList getAllVerifications();

  /**
   * Returns the value of the '<em><b>All Actions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Actions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_AllActions()
   * @model type="com.sympedia.density.gen.deploytest.Action" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113697967863739'"
   * @generated
   */
  EList getAllActions();

  /**
   * Returns the value of the '<em><b>All Assertions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Assertion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Assertions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Assertions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_AllAssertions()
   * @model type="com.sympedia.density.gen.deploytest.Assertion" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113697967863740'"
   * @generated
   */
  EList getAllAssertions();

  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_PackageName()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113698059884045'"
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestSpec#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Fixture Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixture Interface</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixture Interface</em>' attribute.
   * @see #setFixtureInterface(String)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_FixtureInterface()
   * @model annotation="http://www.topcased.org/uuid uuid='113698407268448'"
   * @generated
   */
  String getFixtureInterface();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestSpec#getFixtureInterface <em>Fixture Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixture Interface</em>' attribute.
   * @see #getFixtureInterface()
   * @generated
   */
  void setFixtureInterface(String value);

  /**
   * Returns the value of the '<em><b>Fixture Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixture Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixture Class</em>' attribute.
   * @see #setFixtureClass(String)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_FixtureClass()
   * @model annotation="http://www.topcased.org/uuid uuid='113698642665352'"
   * @generated
   */
  String getFixtureClass();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestSpec#getFixtureClass <em>Fixture Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixture Class</em>' attribute.
   * @see #getFixtureClass()
   * @generated
   */
  void setFixtureClass(String value);

  /**
   * Returns the value of the '<em><b>Container To Test</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container To Test</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container To Test</em>' reference.
   * @see #setContainerToTest(Container)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_ContainerToTest()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113698642665351'"
   * @generated
   */
  Container getContainerToTest();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestSpec#getContainerToTest <em>Container To Test</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container To Test</em>' reference.
   * @see #getContainerToTest()
   * @generated
   */
  void setContainerToTest(Container value);

  /**
   * Returns the value of the '<em><b>Container Overrides</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.ContainerOverride}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.ContainerOverride#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container Overrides</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Overrides</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSpec_ContainerOverrides()
   * @see com.sympedia.density.gen.deploytest.ContainerOverride#getTestSpec
   * @model type="com.sympedia.density.gen.deploytest.ContainerOverride" opposite="testSpec" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='11359738054532'"
   * @generated
   */
  EList getContainerOverrides();

} // TestSpec

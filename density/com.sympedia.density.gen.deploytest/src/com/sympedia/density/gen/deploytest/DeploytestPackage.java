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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.deploytest.DeploytestFactory
 * @model kind="package"
 *        annotation="http://www.topcased.org/uuid uuid='11359738054370'"
 * @generated
 */
public interface DeploytestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "deploytest";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://deploytest";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "deploytest";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeploytestPackage eINSTANCE = com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl
          .init();

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.IDisplayable <em>IDisplayable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.IDisplayable
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getIDisplayable()
   * @generated
   */
  int IDISPLAYABLE = 0;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDISPLAYABLE__DISPLAY_LABEL = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDISPLAYABLE__DESCRIPTION = 1;

  /**
   * The number of structural features of the '<em>IDisplayable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDISPLAYABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.NamedElementImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__DISPLAY_LABEL = IDISPLAYABLE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__DESCRIPTION = IDISPLAYABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = IDISPLAYABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = IDISPLAYABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl <em>Test Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.TestSpecImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getTestSpec()
   * @generated
   */
  int TEST_SPEC = 2;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__DISPLAY_LABEL = NAMED_ELEMENT__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__PACKAGE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fixture Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__FIXTURE_INTERFACE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fixture Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__FIXTURE_CLASS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Container To Test</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__CONTAINER_TO_TEST = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Container Overrides</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__CONTAINER_OVERRIDES = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Action Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__ACTION_CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Assertion Container</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__ASSERTION_CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Test Case Specs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__TEST_CASE_SPECS = NAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Test Suites</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__TEST_SUITES = NAMED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>All Verifications</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__ALL_VERIFICATIONS = NAMED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>All Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__ALL_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>All Assertions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC__ALL_ASSERTIONS = NAMED_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Test Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SPEC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.DeploymentOverrideImpl <em>Deployment Override</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.DeploymentOverrideImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getDeploymentOverride()
   * @generated
   */
  int DEPLOYMENT_OVERRIDE = 4;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.ActionContainerImpl <em>Action Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.ActionContainerImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getActionContainer()
   * @generated
   */
  int ACTION_CONTAINER = 5;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.ActionImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getAction()
   * @generated
   */
  int ACTION = 6;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl <em>Assertion Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getAssertionContainer()
   * @generated
   */
  int ASSERTION_CONTAINER = 7;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.AssertionImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 8;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.DerivedAssertionImpl <em>Derived Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.DerivedAssertionImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getDerivedAssertion()
   * @generated
   */
  int DERIVED_ASSERTION = 9;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.UnaryOpAssertionImpl <em>Unary Op Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.UnaryOpAssertionImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getUnaryOpAssertion()
   * @generated
   */
  int UNARY_OP_ASSERTION = 10;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.BinaryOpAssertionImpl <em>Binary Op Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.BinaryOpAssertionImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getBinaryOpAssertion()
   * @generated
   */
  int BINARY_OP_ASSERTION = 11;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl <em>Test Case Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getTestCaseSpec()
   * @generated
   */
  int TEST_CASE_SPEC = 12;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.InitializationImpl <em>Initialization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.InitializationImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getInitialization()
   * @generated
   */
  int INITIALIZATION = 13;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.ExecutionImpl <em>Execution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.ExecutionImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getExecution()
   * @generated
   */
  int EXECUTION = 14;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.VerificationImpl <em>Verification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.VerificationImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getVerification()
   * @generated
   */
  int VERIFICATION = 15;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.TestSuiteImpl <em>Test Suite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.TestSuiteImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getTestSuite()
   * @generated
   */
  int TEST_SUITE = 16;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.impl.ContainerOverrideImpl <em>Container Override</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.impl.ContainerOverrideImpl
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getContainerOverride()
   * @generated
   */
  int CONTAINER_OVERRIDE = 3;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_OVERRIDE__DISPLAY_LABEL = NAMED_ELEMENT__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_OVERRIDE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_OVERRIDE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Test Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_OVERRIDE__TEST_SPEC = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deployment Overrides</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Container Override</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_OVERRIDE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_OVERRIDE__DISPLAY_LABEL = IDISPLAYABLE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_OVERRIDE__DESCRIPTION = IDISPLAYABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Container Override</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE = IDISPLAYABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deployment To Override</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE = IDISPLAYABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Deployment Override</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_OVERRIDE_FEATURE_COUNT = IDISPLAYABLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER__DISPLAY_LABEL = NAMED_ELEMENT__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Test Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER__TEST_SPEC = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER__SUPER_CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER__SUB_CONTAINERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>All Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER__ALL_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Action Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__DISPLAY_LABEL = NAMED_ELEMENT__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER__DISPLAY_LABEL = NAMED_ELEMENT__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Test Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER__TEST_SPEC = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER__SUPER_CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sub Containers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER__SUB_CONTAINERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER__ASSERTIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>All Assertions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER__ALL_ASSERTIONS = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Assertion Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__DISPLAY_LABEL = NAMED_ELEMENT__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION__CONTAINER = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_ASSERTION__DISPLAY_LABEL = ASSERTION__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_ASSERTION__DESCRIPTION = ASSERTION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_ASSERTION__NAME = ASSERTION__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_ASSERTION__CONTAINER = ASSERTION__CONTAINER;

  /**
   * The number of structural features of the '<em>Derived Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DERIVED_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_ASSERTION__DISPLAY_LABEL = DERIVED_ASSERTION__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_ASSERTION__DESCRIPTION = DERIVED_ASSERTION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_ASSERTION__NAME = DERIVED_ASSERTION__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_ASSERTION__CONTAINER = DERIVED_ASSERTION__CONTAINER;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_ASSERTION__OPERATOR = DERIVED_ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_ASSERTION__OPERAND = DERIVED_ASSERTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unary Op Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_OP_ASSERTION_FEATURE_COUNT = DERIVED_ASSERTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_ASSERTION__DISPLAY_LABEL = DERIVED_ASSERTION__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_ASSERTION__DESCRIPTION = DERIVED_ASSERTION__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_ASSERTION__NAME = DERIVED_ASSERTION__NAME;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_ASSERTION__CONTAINER = DERIVED_ASSERTION__CONTAINER;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_ASSERTION__OPERATOR = DERIVED_ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_ASSERTION__LEFT_OPERAND = DERIVED_ASSERTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_ASSERTION__RIGHT_OPERAND = DERIVED_ASSERTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Op Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_OP_ASSERTION_FEATURE_COUNT = DERIVED_ASSERTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_SPEC__DISPLAY_LABEL = IDISPLAYABLE__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_SPEC__DESCRIPTION = IDISPLAYABLE__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Test Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_SPEC__TEST_SPEC = IDISPLAYABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Spec Sequence</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_SPEC__SPEC_SEQUENCE = IDISPLAYABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_SPEC__ROOT = IDISPLAYABLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Test Case Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_CASE_SPEC_FEATURE_COUNT = IDISPLAYABLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__DISPLAY_LABEL = TEST_CASE_SPEC__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__DESCRIPTION = TEST_CASE_SPEC__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Test Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__TEST_SPEC = TEST_CASE_SPEC__TEST_SPEC;

  /**
   * The feature id for the '<em><b>Spec Sequence</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__SPEC_SEQUENCE = TEST_CASE_SPEC__SPEC_SEQUENCE;

  /**
   * The feature id for the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__ROOT = TEST_CASE_SPEC__ROOT;

  /**
   * The feature id for the '<em><b>Initialization Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__INITIALIZATION_ACTIONS = TEST_CASE_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Initialization</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__SUPER_INITIALIZATION = TEST_CASE_SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Verifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__VERIFICATIONS = TEST_CASE_SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Sub Initializations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__SUB_INITIALIZATIONS = TEST_CASE_SPEC_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Executions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION__EXECUTIONS = TEST_CASE_SPEC_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Initialization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIALIZATION_FEATURE_COUNT = TEST_CASE_SPEC_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__DISPLAY_LABEL = TEST_CASE_SPEC__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__DESCRIPTION = TEST_CASE_SPEC__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Test Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__TEST_SPEC = TEST_CASE_SPEC__TEST_SPEC;

  /**
   * The feature id for the '<em><b>Spec Sequence</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__SPEC_SEQUENCE = TEST_CASE_SPEC__SPEC_SEQUENCE;

  /**
   * The feature id for the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__ROOT = TEST_CASE_SPEC__ROOT;

  /**
   * The feature id for the '<em><b>Execution Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__EXECUTION_ACTIONS = TEST_CASE_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Execution</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__SUPER_EXECUTION = TEST_CASE_SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__INITIALIZATION = TEST_CASE_SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Verifications</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__VERIFICATIONS = TEST_CASE_SPEC_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Sub Executions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION__SUB_EXECUTIONS = TEST_CASE_SPEC_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Execution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_FEATURE_COUNT = TEST_CASE_SPEC_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__DISPLAY_LABEL = TEST_CASE_SPEC__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__DESCRIPTION = TEST_CASE_SPEC__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Test Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__TEST_SPEC = TEST_CASE_SPEC__TEST_SPEC;

  /**
   * The feature id for the '<em><b>Spec Sequence</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__SPEC_SEQUENCE = TEST_CASE_SPEC__SPEC_SEQUENCE;

  /**
   * The feature id for the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__ROOT = TEST_CASE_SPEC__ROOT;

  /**
   * The feature id for the '<em><b>Spec Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__SPEC_LABEL = TEST_CASE_SPEC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__ID = TEST_CASE_SPEC_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Container Override</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__CONTAINER_OVERRIDE = TEST_CASE_SPEC_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Assertions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__ASSERTIONS = TEST_CASE_SPEC_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Initialization</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__INITIALIZATION = TEST_CASE_SPEC_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Execution</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION__EXECUTION = TEST_CASE_SPEC_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Verification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_FEATURE_COUNT = TEST_CASE_SPEC_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE__DISPLAY_LABEL = NAMED_ELEMENT__DISPLAY_LABEL;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Test Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE__TEST_SPEC = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Included Actions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE__INCLUDED_ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Included Assertions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE__INCLUDED_ASSERTIONS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Test Cases</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE__TEST_CASES = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Id Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE__ID_PATTERN = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Test Suite</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_SUITE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.UnaryOpType <em>Unary Op Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.UnaryOpType
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getUnaryOpType()
   * @generated
   */
  int UNARY_OP_TYPE = 17;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploytest.BinaryOpType <em>Binary Op Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploytest.BinaryOpType
   * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getBinaryOpType()
   * @generated
   */
  int BINARY_OP_TYPE = 18;

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.IDisplayable <em>IDisplayable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IDisplayable</em>'.
   * @see com.sympedia.density.gen.deploytest.IDisplayable
   * @generated
   */
  EClass getIDisplayable();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.IDisplayable#getDisplayLabel <em>Display Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Label</em>'.
   * @see com.sympedia.density.gen.deploytest.IDisplayable#getDisplayLabel()
   * @see #getIDisplayable()
   * @generated
   */
  EAttribute getIDisplayable_DisplayLabel();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.IDisplayable#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.sympedia.density.gen.deploytest.IDisplayable#getDescription()
   * @see #getIDisplayable()
   * @generated
   */
  EAttribute getIDisplayable_Description();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see com.sympedia.density.gen.deploytest.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sympedia.density.gen.deploytest.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.TestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Spec</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec
   * @generated
   */
  EClass getTestSpec();

  /**
   * Returns the meta object for the containment reference '{@link com.sympedia.density.gen.deploytest.TestSpec#getActionContainer <em>Action Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action Container</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getActionContainer()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_ActionContainer();

  /**
   * Returns the meta object for the containment reference '{@link com.sympedia.density.gen.deploytest.TestSpec#getAssertionContainer <em>Assertion Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assertion Container</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getAssertionContainer()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_AssertionContainer();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.TestSpec#getTestCaseSpecs <em>Test Case Specs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Test Case Specs</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getTestCaseSpecs()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_TestCaseSpecs();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.TestSpec#getTestSuites <em>Test Suites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Test Suites</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getTestSuites()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_TestSuites();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.TestSpec#getAllVerifications <em>All Verifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>All Verifications</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getAllVerifications()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_AllVerifications();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.TestSpec#getAllActions <em>All Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>All Actions</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getAllActions()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_AllActions();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.TestSpec#getAllAssertions <em>All Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>All Assertions</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getAllAssertions()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_AllAssertions();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.TestSpec#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getPackageName()
   * @see #getTestSpec()
   * @generated
   */
  EAttribute getTestSpec_PackageName();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.TestSpec#getFixtureInterface <em>Fixture Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixture Interface</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getFixtureInterface()
   * @see #getTestSpec()
   * @generated
   */
  EAttribute getTestSpec_FixtureInterface();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.TestSpec#getFixtureClass <em>Fixture Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fixture Class</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getFixtureClass()
   * @see #getTestSpec()
   * @generated
   */
  EAttribute getTestSpec_FixtureClass();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploytest.TestSpec#getContainerToTest <em>Container To Test</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Container To Test</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getContainerToTest()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_ContainerToTest();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.TestSpec#getContainerOverrides <em>Container Overrides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Container Overrides</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSpec#getContainerOverrides()
   * @see #getTestSpec()
   * @generated
   */
  EReference getTestSpec_ContainerOverrides();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.DeploymentOverride <em>Deployment Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Override</em>'.
   * @see com.sympedia.density.gen.deploytest.DeploymentOverride
   * @generated
   */
  EClass getDeploymentOverride();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.DeploymentOverride#getContainerOverride <em>Container Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Container Override</em>'.
   * @see com.sympedia.density.gen.deploytest.DeploymentOverride#getContainerOverride()
   * @see #getDeploymentOverride()
   * @generated
   */
  EReference getDeploymentOverride_ContainerOverride();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploytest.DeploymentOverride#getDeploymentToOverride <em>Deployment To Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Deployment To Override</em>'.
   * @see com.sympedia.density.gen.deploytest.DeploymentOverride#getDeploymentToOverride()
   * @see #getDeploymentOverride()
   * @generated
   */
  EReference getDeploymentOverride_DeploymentToOverride();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.ActionContainer <em>Action Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Container</em>'.
   * @see com.sympedia.density.gen.deploytest.ActionContainer
   * @generated
   */
  EClass getActionContainer();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.ActionContainer#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Test Spec</em>'.
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getTestSpec()
   * @see #getActionContainer()
   * @generated
   */
  EReference getActionContainer_TestSpec();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.ActionContainer#getSuperContainer <em>Super Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Super Container</em>'.
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getSuperContainer()
   * @see #getActionContainer()
   * @generated
   */
  EReference getActionContainer_SuperContainer();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.ActionContainer#getSubContainers <em>Sub Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Containers</em>'.
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getSubContainers()
   * @see #getActionContainer()
   * @generated
   */
  EReference getActionContainer_SubContainers();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.ActionContainer#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getActions()
   * @see #getActionContainer()
   * @generated
   */
  EReference getActionContainer_Actions();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.ActionContainer#getAllActions <em>All Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>All Actions</em>'.
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getAllActions()
   * @see #getActionContainer()
   * @generated
   */
  EReference getActionContainer_AllActions();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see com.sympedia.density.gen.deploytest.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.Action#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Container</em>'.
   * @see com.sympedia.density.gen.deploytest.Action#getContainer()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Container();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.AssertionContainer <em>Assertion Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion Container</em>'.
   * @see com.sympedia.density.gen.deploytest.AssertionContainer
   * @generated
   */
  EClass getAssertionContainer();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Test Spec</em>'.
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getTestSpec()
   * @see #getAssertionContainer()
   * @generated
   */
  EReference getAssertionContainer_TestSpec();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getSuperContainer <em>Super Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Super Container</em>'.
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getSuperContainer()
   * @see #getAssertionContainer()
   * @generated
   */
  EReference getAssertionContainer_SuperContainer();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getSubContainers <em>Sub Containers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Containers</em>'.
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getSubContainers()
   * @see #getAssertionContainer()
   * @generated
   */
  EReference getAssertionContainer_SubContainers();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assertions</em>'.
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getAssertions()
   * @see #getAssertionContainer()
   * @generated
   */
  EReference getAssertionContainer_Assertions();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getAllAssertions <em>All Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>All Assertions</em>'.
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getAllAssertions()
   * @see #getAssertionContainer()
   * @generated
   */
  EReference getAssertionContainer_AllAssertions();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see com.sympedia.density.gen.deploytest.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.Assertion#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Container</em>'.
   * @see com.sympedia.density.gen.deploytest.Assertion#getContainer()
   * @see #getAssertion()
   * @generated
   */
  EReference getAssertion_Container();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.DerivedAssertion <em>Derived Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Derived Assertion</em>'.
   * @see com.sympedia.density.gen.deploytest.DerivedAssertion
   * @generated
   */
  EClass getDerivedAssertion();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.UnaryOpAssertion <em>Unary Op Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Op Assertion</em>'.
   * @see com.sympedia.density.gen.deploytest.UnaryOpAssertion
   * @generated
   */
  EClass getUnaryOpAssertion();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.UnaryOpAssertion#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.sympedia.density.gen.deploytest.UnaryOpAssertion#getOperator()
   * @see #getUnaryOpAssertion()
   * @generated
   */
  EAttribute getUnaryOpAssertion_Operator();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploytest.UnaryOpAssertion#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operand</em>'.
   * @see com.sympedia.density.gen.deploytest.UnaryOpAssertion#getOperand()
   * @see #getUnaryOpAssertion()
   * @generated
   */
  EReference getUnaryOpAssertion_Operand();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion <em>Binary Op Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Op Assertion</em>'.
   * @see com.sympedia.density.gen.deploytest.BinaryOpAssertion
   * @generated
   */
  EClass getBinaryOpAssertion();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see com.sympedia.density.gen.deploytest.BinaryOpAssertion#getOperator()
   * @see #getBinaryOpAssertion()
   * @generated
   */
  EAttribute getBinaryOpAssertion_Operator();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left Operand</em>'.
   * @see com.sympedia.density.gen.deploytest.BinaryOpAssertion#getLeftOperand()
   * @see #getBinaryOpAssertion()
   * @generated
   */
  EReference getBinaryOpAssertion_LeftOperand();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Right Operand</em>'.
   * @see com.sympedia.density.gen.deploytest.BinaryOpAssertion#getRightOperand()
   * @see #getBinaryOpAssertion()
   * @generated
   */
  EReference getBinaryOpAssertion_RightOperand();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.TestCaseSpec <em>Test Case Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Case Spec</em>'.
   * @see com.sympedia.density.gen.deploytest.TestCaseSpec
   * @generated
   */
  EClass getTestCaseSpec();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.TestCaseSpec#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Test Spec</em>'.
   * @see com.sympedia.density.gen.deploytest.TestCaseSpec#getTestSpec()
   * @see #getTestCaseSpec()
   * @generated
   */
  EReference getTestCaseSpec_TestSpec();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.TestCaseSpec#getSpecSequence <em>Spec Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Spec Sequence</em>'.
   * @see com.sympedia.density.gen.deploytest.TestCaseSpec#getSpecSequence()
   * @see #getTestCaseSpec()
   * @generated
   */
  EReference getTestCaseSpec_SpecSequence();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploytest.TestCaseSpec#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root</em>'.
   * @see com.sympedia.density.gen.deploytest.TestCaseSpec#getRoot()
   * @see #getTestCaseSpec()
   * @generated
   */
  EReference getTestCaseSpec_Root();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.Initialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initialization</em>'.
   * @see com.sympedia.density.gen.deploytest.Initialization
   * @generated
   */
  EClass getInitialization();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.Initialization#getInitializationActions <em>Initialization Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Initialization Actions</em>'.
   * @see com.sympedia.density.gen.deploytest.Initialization#getInitializationActions()
   * @see #getInitialization()
   * @generated
   */
  EReference getInitialization_InitializationActions();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.Initialization#getSuperInitialization <em>Super Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Super Initialization</em>'.
   * @see com.sympedia.density.gen.deploytest.Initialization#getSuperInitialization()
   * @see #getInitialization()
   * @generated
   */
  EReference getInitialization_SuperInitialization();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.Initialization#getSubInitializations <em>Sub Initializations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Initializations</em>'.
   * @see com.sympedia.density.gen.deploytest.Initialization#getSubInitializations()
   * @see #getInitialization()
   * @generated
   */
  EReference getInitialization_SubInitializations();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.Initialization#getExecutions <em>Executions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Executions</em>'.
   * @see com.sympedia.density.gen.deploytest.Initialization#getExecutions()
   * @see #getInitialization()
   * @generated
   */
  EReference getInitialization_Executions();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.Initialization#getVerifications <em>Verifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Verifications</em>'.
   * @see com.sympedia.density.gen.deploytest.Initialization#getVerifications()
   * @see #getInitialization()
   * @generated
   */
  EReference getInitialization_Verifications();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.Execution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execution</em>'.
   * @see com.sympedia.density.gen.deploytest.Execution
   * @generated
   */
  EClass getExecution();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.Execution#getExecutionActions <em>Execution Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Execution Actions</em>'.
   * @see com.sympedia.density.gen.deploytest.Execution#getExecutionActions()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_ExecutionActions();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.Execution#getSuperExecution <em>Super Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Super Execution</em>'.
   * @see com.sympedia.density.gen.deploytest.Execution#getSuperExecution()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_SuperExecution();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.Execution#getSubExecutions <em>Sub Executions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Executions</em>'.
   * @see com.sympedia.density.gen.deploytest.Execution#getSubExecutions()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_SubExecutions();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.Execution#getVerifications <em>Verifications</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Verifications</em>'.
   * @see com.sympedia.density.gen.deploytest.Execution#getVerifications()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_Verifications();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.Execution#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Initialization</em>'.
   * @see com.sympedia.density.gen.deploytest.Execution#getInitialization()
   * @see #getExecution()
   * @generated
   */
  EReference getExecution_Initialization();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.Verification <em>Verification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification</em>'.
   * @see com.sympedia.density.gen.deploytest.Verification
   * @generated
   */
  EClass getVerification();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploytest.Verification#getContainerOverride <em>Container Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Container Override</em>'.
   * @see com.sympedia.density.gen.deploytest.Verification#getContainerOverride()
   * @see #getVerification()
   * @generated
   */
  EReference getVerification_ContainerOverride();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.Verification#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assertions</em>'.
   * @see com.sympedia.density.gen.deploytest.Verification#getAssertions()
   * @see #getVerification()
   * @generated
   */
  EReference getVerification_Assertions();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.Verification#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Initialization</em>'.
   * @see com.sympedia.density.gen.deploytest.Verification#getInitialization()
   * @see #getVerification()
   * @generated
   */
  EReference getVerification_Initialization();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.Verification#getExecution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Execution</em>'.
   * @see com.sympedia.density.gen.deploytest.Verification#getExecution()
   * @see #getVerification()
   * @generated
   */
  EReference getVerification_Execution();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.Verification#getSpecLabel <em>Spec Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Spec Label</em>'.
   * @see com.sympedia.density.gen.deploytest.Verification#getSpecLabel()
   * @see #getVerification()
   * @generated
   */
  EAttribute getVerification_SpecLabel();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.Verification#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.sympedia.density.gen.deploytest.Verification#getId()
   * @see #getVerification()
   * @generated
   */
  EAttribute getVerification_Id();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.TestSuite <em>Test Suite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Suite</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSuite
   * @generated
   */
  EClass getTestSuite();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.TestSuite#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Test Spec</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSuite#getTestSpec()
   * @see #getTestSuite()
   * @generated
   */
  EReference getTestSuite_TestSpec();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.TestSuite#getIncludedActions <em>Included Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Included Actions</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSuite#getIncludedActions()
   * @see #getTestSuite()
   * @generated
   */
  EReference getTestSuite_IncludedActions();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.TestSuite#getIncludedAssertions <em>Included Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Included Assertions</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSuite#getIncludedAssertions()
   * @see #getTestSuite()
   * @generated
   */
  EReference getTestSuite_IncludedAssertions();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploytest.TestSuite#getTestCases <em>Test Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Test Cases</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSuite#getTestCases()
   * @see #getTestSuite()
   * @generated
   */
  EReference getTestSuite_TestCases();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploytest.TestSuite#getIdPattern <em>Id Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Pattern</em>'.
   * @see com.sympedia.density.gen.deploytest.TestSuite#getIdPattern()
   * @see #getTestSuite()
   * @generated
   */
  EAttribute getTestSuite_IdPattern();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploytest.ContainerOverride <em>Container Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Override</em>'.
   * @see com.sympedia.density.gen.deploytest.ContainerOverride
   * @generated
   */
  EClass getContainerOverride();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploytest.ContainerOverride#getTestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Test Spec</em>'.
   * @see com.sympedia.density.gen.deploytest.ContainerOverride#getTestSpec()
   * @see #getContainerOverride()
   * @generated
   */
  EReference getContainerOverride_TestSpec();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploytest.ContainerOverride#getDeploymentOverrides <em>Deployment Overrides</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deployment Overrides</em>'.
   * @see com.sympedia.density.gen.deploytest.ContainerOverride#getDeploymentOverrides()
   * @see #getContainerOverride()
   * @generated
   */
  EReference getContainerOverride_DeploymentOverrides();

  /**
   * Returns the meta object for enum '{@link com.sympedia.density.gen.deploytest.UnaryOpType <em>Unary Op Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Unary Op Type</em>'.
   * @see com.sympedia.density.gen.deploytest.UnaryOpType
   * @generated
   */
  EEnum getUnaryOpType();

  /**
   * Returns the meta object for enum '{@link com.sympedia.density.gen.deploytest.BinaryOpType <em>Binary Op Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Binary Op Type</em>'.
   * @see com.sympedia.density.gen.deploytest.BinaryOpType
   * @generated
   */
  EEnum getBinaryOpType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DeploytestFactory getDeploytestFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.IDisplayable <em>IDisplayable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.IDisplayable
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getIDisplayable()
     * @generated
     */
    EClass IDISPLAYABLE = eINSTANCE.getIDisplayable();

    /**
     * The meta object literal for the '<em><b>Display Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDISPLAYABLE__DISPLAY_LABEL = eINSTANCE.getIDisplayable_DisplayLabel();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDISPLAYABLE__DESCRIPTION = eINSTANCE.getIDisplayable_Description();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.NamedElementImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl <em>Test Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.TestSpecImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getTestSpec()
     * @generated
     */
    EClass TEST_SPEC = eINSTANCE.getTestSpec();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_SPEC__PACKAGE_NAME = eINSTANCE.getTestSpec_PackageName();

    /**
     * The meta object literal for the '<em><b>Fixture Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_SPEC__FIXTURE_INTERFACE = eINSTANCE.getTestSpec_FixtureInterface();

    /**
     * The meta object literal for the '<em><b>Fixture Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_SPEC__FIXTURE_CLASS = eINSTANCE.getTestSpec_FixtureClass();

    /**
     * The meta object literal for the '<em><b>Container To Test</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__CONTAINER_TO_TEST = eINSTANCE.getTestSpec_ContainerToTest();

    /**
     * The meta object literal for the '<em><b>Container Overrides</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__CONTAINER_OVERRIDES = eINSTANCE.getTestSpec_ContainerOverrides();

    /**
     * The meta object literal for the '<em><b>Action Container</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__ACTION_CONTAINER = eINSTANCE.getTestSpec_ActionContainer();

    /**
     * The meta object literal for the '<em><b>Assertion Container</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__ASSERTION_CONTAINER = eINSTANCE.getTestSpec_AssertionContainer();

    /**
     * The meta object literal for the '<em><b>Test Case Specs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__TEST_CASE_SPECS = eINSTANCE.getTestSpec_TestCaseSpecs();

    /**
     * The meta object literal for the '<em><b>Test Suites</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__TEST_SUITES = eINSTANCE.getTestSpec_TestSuites();

    /**
     * The meta object literal for the '<em><b>All Verifications</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__ALL_VERIFICATIONS = eINSTANCE.getTestSpec_AllVerifications();

    /**
     * The meta object literal for the '<em><b>All Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__ALL_ACTIONS = eINSTANCE.getTestSpec_AllActions();

    /**
     * The meta object literal for the '<em><b>All Assertions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SPEC__ALL_ASSERTIONS = eINSTANCE.getTestSpec_AllAssertions();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.ContainerOverrideImpl <em>Container Override</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.ContainerOverrideImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getContainerOverride()
     * @generated
     */
    EClass CONTAINER_OVERRIDE = eINSTANCE.getContainerOverride();

    /**
     * The meta object literal for the '<em><b>Test Spec</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_OVERRIDE__TEST_SPEC = eINSTANCE.getContainerOverride_TestSpec();

    /**
     * The meta object literal for the '<em><b>Deployment Overrides</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES = eINSTANCE
            .getContainerOverride_DeploymentOverrides();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.DeploymentOverrideImpl <em>Deployment Override</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.DeploymentOverrideImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getDeploymentOverride()
     * @generated
     */
    EClass DEPLOYMENT_OVERRIDE = eINSTANCE.getDeploymentOverride();

    /**
     * The meta object literal for the '<em><b>Container Override</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE = eINSTANCE
            .getDeploymentOverride_ContainerOverride();

    /**
     * The meta object literal for the '<em><b>Deployment To Override</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE = eINSTANCE
            .getDeploymentOverride_DeploymentToOverride();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.ActionContainerImpl <em>Action Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.ActionContainerImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getActionContainer()
     * @generated
     */
    EClass ACTION_CONTAINER = eINSTANCE.getActionContainer();

    /**
     * The meta object literal for the '<em><b>Test Spec</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_CONTAINER__TEST_SPEC = eINSTANCE.getActionContainer_TestSpec();

    /**
     * The meta object literal for the '<em><b>Super Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_CONTAINER__SUPER_CONTAINER = eINSTANCE.getActionContainer_SuperContainer();

    /**
     * The meta object literal for the '<em><b>Sub Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_CONTAINER__SUB_CONTAINERS = eINSTANCE.getActionContainer_SubContainers();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_CONTAINER__ACTIONS = eINSTANCE.getActionContainer_Actions();

    /**
     * The meta object literal for the '<em><b>All Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_CONTAINER__ALL_ACTIONS = eINSTANCE.getActionContainer_AllActions();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.ActionImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__CONTAINER = eINSTANCE.getAction_Container();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl <em>Assertion Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getAssertionContainer()
     * @generated
     */
    EClass ASSERTION_CONTAINER = eINSTANCE.getAssertionContainer();

    /**
     * The meta object literal for the '<em><b>Test Spec</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_CONTAINER__TEST_SPEC = eINSTANCE.getAssertionContainer_TestSpec();

    /**
     * The meta object literal for the '<em><b>Super Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_CONTAINER__SUPER_CONTAINER = eINSTANCE
            .getAssertionContainer_SuperContainer();

    /**
     * The meta object literal for the '<em><b>Sub Containers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_CONTAINER__SUB_CONTAINERS = eINSTANCE
            .getAssertionContainer_SubContainers();

    /**
     * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_CONTAINER__ASSERTIONS = eINSTANCE.getAssertionContainer_Assertions();

    /**
     * The meta object literal for the '<em><b>All Assertions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION_CONTAINER__ALL_ASSERTIONS = eINSTANCE
            .getAssertionContainer_AllAssertions();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.AssertionImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERTION__CONTAINER = eINSTANCE.getAssertion_Container();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.DerivedAssertionImpl <em>Derived Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.DerivedAssertionImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getDerivedAssertion()
     * @generated
     */
    EClass DERIVED_ASSERTION = eINSTANCE.getDerivedAssertion();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.UnaryOpAssertionImpl <em>Unary Op Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.UnaryOpAssertionImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getUnaryOpAssertion()
     * @generated
     */
    EClass UNARY_OP_ASSERTION = eINSTANCE.getUnaryOpAssertion();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNARY_OP_ASSERTION__OPERATOR = eINSTANCE.getUnaryOpAssertion_Operator();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_OP_ASSERTION__OPERAND = eINSTANCE.getUnaryOpAssertion_Operand();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.BinaryOpAssertionImpl <em>Binary Op Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.BinaryOpAssertionImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getBinaryOpAssertion()
     * @generated
     */
    EClass BINARY_OP_ASSERTION = eINSTANCE.getBinaryOpAssertion();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_OP_ASSERTION__OPERATOR = eINSTANCE.getBinaryOpAssertion_Operator();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OP_ASSERTION__LEFT_OPERAND = eINSTANCE.getBinaryOpAssertion_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_OP_ASSERTION__RIGHT_OPERAND = eINSTANCE.getBinaryOpAssertion_RightOperand();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl <em>Test Case Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getTestCaseSpec()
     * @generated
     */
    EClass TEST_CASE_SPEC = eINSTANCE.getTestCaseSpec();

    /**
     * The meta object literal for the '<em><b>Test Spec</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE_SPEC__TEST_SPEC = eINSTANCE.getTestCaseSpec_TestSpec();

    /**
     * The meta object literal for the '<em><b>Spec Sequence</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE_SPEC__SPEC_SEQUENCE = eINSTANCE.getTestCaseSpec_SpecSequence();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_CASE_SPEC__ROOT = eINSTANCE.getTestCaseSpec_Root();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.InitializationImpl <em>Initialization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.InitializationImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getInitialization()
     * @generated
     */
    EClass INITIALIZATION = eINSTANCE.getInitialization();

    /**
     * The meta object literal for the '<em><b>Initialization Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZATION__INITIALIZATION_ACTIONS = eINSTANCE
            .getInitialization_InitializationActions();

    /**
     * The meta object literal for the '<em><b>Super Initialization</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZATION__SUPER_INITIALIZATION = eINSTANCE
            .getInitialization_SuperInitialization();

    /**
     * The meta object literal for the '<em><b>Verifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZATION__VERIFICATIONS = eINSTANCE.getInitialization_Verifications();

    /**
     * The meta object literal for the '<em><b>Sub Initializations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZATION__SUB_INITIALIZATIONS = eINSTANCE
            .getInitialization_SubInitializations();

    /**
     * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INITIALIZATION__EXECUTIONS = eINSTANCE.getInitialization_Executions();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.ExecutionImpl <em>Execution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.ExecutionImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getExecution()
     * @generated
     */
    EClass EXECUTION = eINSTANCE.getExecution();

    /**
     * The meta object literal for the '<em><b>Execution Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__EXECUTION_ACTIONS = eINSTANCE.getExecution_ExecutionActions();

    /**
     * The meta object literal for the '<em><b>Super Execution</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__SUPER_EXECUTION = eINSTANCE.getExecution_SuperExecution();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__INITIALIZATION = eINSTANCE.getExecution_Initialization();

    /**
     * The meta object literal for the '<em><b>Verifications</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__VERIFICATIONS = eINSTANCE.getExecution_Verifications();

    /**
     * The meta object literal for the '<em><b>Sub Executions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTION__SUB_EXECUTIONS = eINSTANCE.getExecution_SubExecutions();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.VerificationImpl <em>Verification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.VerificationImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getVerification()
     * @generated
     */
    EClass VERIFICATION = eINSTANCE.getVerification();

    /**
     * The meta object literal for the '<em><b>Spec Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION__SPEC_LABEL = eINSTANCE.getVerification_SpecLabel();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION__ID = eINSTANCE.getVerification_Id();

    /**
     * The meta object literal for the '<em><b>Container Override</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION__CONTAINER_OVERRIDE = eINSTANCE.getVerification_ContainerOverride();

    /**
     * The meta object literal for the '<em><b>Assertions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION__ASSERTIONS = eINSTANCE.getVerification_Assertions();

    /**
     * The meta object literal for the '<em><b>Initialization</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION__INITIALIZATION = eINSTANCE.getVerification_Initialization();

    /**
     * The meta object literal for the '<em><b>Execution</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION__EXECUTION = eINSTANCE.getVerification_Execution();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.impl.TestSuiteImpl <em>Test Suite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.impl.TestSuiteImpl
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getTestSuite()
     * @generated
     */
    EClass TEST_SUITE = eINSTANCE.getTestSuite();

    /**
     * The meta object literal for the '<em><b>Test Spec</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SUITE__TEST_SPEC = eINSTANCE.getTestSuite_TestSpec();

    /**
     * The meta object literal for the '<em><b>Included Actions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SUITE__INCLUDED_ACTIONS = eINSTANCE.getTestSuite_IncludedActions();

    /**
     * The meta object literal for the '<em><b>Included Assertions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SUITE__INCLUDED_ASSERTIONS = eINSTANCE.getTestSuite_IncludedAssertions();

    /**
     * The meta object literal for the '<em><b>Test Cases</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEST_SUITE__TEST_CASES = eINSTANCE.getTestSuite_TestCases();

    /**
     * The meta object literal for the '<em><b>Id Pattern</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_SUITE__ID_PATTERN = eINSTANCE.getTestSuite_IdPattern();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.UnaryOpType <em>Unary Op Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.UnaryOpType
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getUnaryOpType()
     * @generated
     */
    EEnum UNARY_OP_TYPE = eINSTANCE.getUnaryOpType();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploytest.BinaryOpType <em>Binary Op Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploytest.BinaryOpType
     * @see com.sympedia.density.gen.deploytest.impl.DeploytestPackageImpl#getBinaryOpType()
     * @generated
     */
    EEnum BINARY_OP_TYPE = eINSTANCE.getBinaryOpType();

  }

} //DeploytestPackage

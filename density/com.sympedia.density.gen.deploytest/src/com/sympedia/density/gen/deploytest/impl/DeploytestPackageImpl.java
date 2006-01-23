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
package com.sympedia.density.gen.deploytest.impl;


import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploytest.Action;
import com.sympedia.density.gen.deploytest.ActionContainer;
import com.sympedia.density.gen.deploytest.Assertion;
import com.sympedia.density.gen.deploytest.AssertionContainer;
import com.sympedia.density.gen.deploytest.BinaryOpAssertion;
import com.sympedia.density.gen.deploytest.BinaryOpType;
import com.sympedia.density.gen.deploytest.ContainerOverride;
import com.sympedia.density.gen.deploytest.DeploymentOverride;
import com.sympedia.density.gen.deploytest.DeploytestFactory;
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
import com.sympedia.density.gen.deploytest.UnaryOpType;
import com.sympedia.density.gen.deploytest.Verification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploytestPackageImpl extends EPackageImpl implements DeploytestPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iDisplayableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentOverrideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertionContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass derivedAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryOpAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass binaryOpAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testCaseSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initializationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testSuiteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerOverrideEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum unaryOpTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum binaryOpTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DeploytestPackageImpl()
  {
    super(eNS_URI, DeploytestFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DeploytestPackage init()
  {
    if (isInited)
      return (DeploytestPackage)EPackage.Registry.INSTANCE.getEPackage(DeploytestPackage.eNS_URI);

    // Obtain or create and register package
    DeploytestPackageImpl theDeploytestPackage = (DeploytestPackageImpl)(EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) instanceof DeploytestPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) : new DeploytestPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    DeployPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theDeploytestPackage.createPackageContents();

    // Initialize created meta-data
    theDeploytestPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDeploytestPackage.freeze();

    return theDeploytestPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIDisplayable()
  {
    return iDisplayableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIDisplayable_DisplayLabel()
  {
    return (EAttribute)iDisplayableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIDisplayable_Description()
  {
    return (EAttribute)iDisplayableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestSpec()
  {
    return testSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_ActionContainer()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_AssertionContainer()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_TestCaseSpecs()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_TestSuites()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_AllVerifications()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_AllActions()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_AllAssertions()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestSpec_PackageName()
  {
    return (EAttribute)testSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestSpec_FixtureInterface()
  {
    return (EAttribute)testSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestSpec_FixtureClass()
  {
    return (EAttribute)testSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_ContainerToTest()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSpec_ContainerOverrides()
  {
    return (EReference)testSpecEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentOverride()
  {
    return deploymentOverrideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentOverride_ContainerOverride()
  {
    return (EReference)deploymentOverrideEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentOverride_DeploymentToOverride()
  {
    return (EReference)deploymentOverrideEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActionContainer()
  {
    return actionContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionContainer_TestSpec()
  {
    return (EReference)actionContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionContainer_SuperContainer()
  {
    return (EReference)actionContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionContainer_SubContainers()
  {
    return (EReference)actionContainerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionContainer_Actions()
  {
    return (EReference)actionContainerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActionContainer_AllActions()
  {
    return (EReference)actionContainerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAction()
  {
    return actionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAction_Container()
  {
    return (EReference)actionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertionContainer()
  {
    return assertionContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionContainer_TestSpec()
  {
    return (EReference)assertionContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionContainer_SuperContainer()
  {
    return (EReference)assertionContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionContainer_SubContainers()
  {
    return (EReference)assertionContainerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionContainer_Assertions()
  {
    return (EReference)assertionContainerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertionContainer_AllAssertions()
  {
    return (EReference)assertionContainerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertion()
  {
    return assertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssertion_Container()
  {
    return (EReference)assertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDerivedAssertion()
  {
    return derivedAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryOpAssertion()
  {
    return unaryOpAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryOpAssertion_Operator()
  {
    return (EAttribute)unaryOpAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryOpAssertion_Operand()
  {
    return (EReference)unaryOpAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBinaryOpAssertion()
  {
    return binaryOpAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBinaryOpAssertion_Operator()
  {
    return (EAttribute)binaryOpAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOpAssertion_LeftOperand()
  {
    return (EReference)binaryOpAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBinaryOpAssertion_RightOperand()
  {
    return (EReference)binaryOpAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestCaseSpec()
  {
    return testCaseSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestCaseSpec_TestSpec()
  {
    return (EReference)testCaseSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestCaseSpec_SpecSequence()
  {
    return (EReference)testCaseSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestCaseSpec_Root()
  {
    return (EReference)testCaseSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitialization()
  {
    return initializationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialization_InitializationActions()
  {
    return (EReference)initializationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialization_SuperInitialization()
  {
    return (EReference)initializationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialization_SubInitializations()
  {
    return (EReference)initializationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialization_Executions()
  {
    return (EReference)initializationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInitialization_Verifications()
  {
    return (EReference)initializationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecution()
  {
    return executionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_ExecutionActions()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_SuperExecution()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_SubExecutions()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_Verifications()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecution_Initialization()
  {
    return (EReference)executionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerification()
  {
    return verificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerification_ContainerOverride()
  {
    return (EReference)verificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerification_Assertions()
  {
    return (EReference)verificationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerification_Initialization()
  {
    return (EReference)verificationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerification_Execution()
  {
    return (EReference)verificationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerification_SpecLabel()
  {
    return (EAttribute)verificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerification_Id()
  {
    return (EAttribute)verificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestSuite()
  {
    return testSuiteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSuite_TestSpec()
  {
    return (EReference)testSuiteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSuite_IncludedActions()
  {
    return (EReference)testSuiteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSuite_IncludedAssertions()
  {
    return (EReference)testSuiteEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestSuite_TestCases()
  {
    return (EReference)testSuiteEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestSuite_IdPattern()
  {
    return (EAttribute)testSuiteEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerOverride()
  {
    return containerOverrideEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerOverride_TestSpec()
  {
    return (EReference)containerOverrideEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerOverride_DeploymentOverrides()
  {
    return (EReference)containerOverrideEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getUnaryOpType()
  {
    return unaryOpTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBinaryOpType()
  {
    return binaryOpTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploytestFactory getDeploytestFactory()
  {
    return (DeploytestFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    iDisplayableEClass = createEClass(IDISPLAYABLE);
    createEAttribute(iDisplayableEClass, IDISPLAYABLE__DISPLAY_LABEL);
    createEAttribute(iDisplayableEClass, IDISPLAYABLE__DESCRIPTION);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    testSpecEClass = createEClass(TEST_SPEC);
    createEAttribute(testSpecEClass, TEST_SPEC__PACKAGE_NAME);
    createEAttribute(testSpecEClass, TEST_SPEC__FIXTURE_INTERFACE);
    createEAttribute(testSpecEClass, TEST_SPEC__FIXTURE_CLASS);
    createEReference(testSpecEClass, TEST_SPEC__CONTAINER_TO_TEST);
    createEReference(testSpecEClass, TEST_SPEC__CONTAINER_OVERRIDES);
    createEReference(testSpecEClass, TEST_SPEC__ACTION_CONTAINER);
    createEReference(testSpecEClass, TEST_SPEC__ASSERTION_CONTAINER);
    createEReference(testSpecEClass, TEST_SPEC__TEST_CASE_SPECS);
    createEReference(testSpecEClass, TEST_SPEC__TEST_SUITES);
    createEReference(testSpecEClass, TEST_SPEC__ALL_VERIFICATIONS);
    createEReference(testSpecEClass, TEST_SPEC__ALL_ACTIONS);
    createEReference(testSpecEClass, TEST_SPEC__ALL_ASSERTIONS);

    containerOverrideEClass = createEClass(CONTAINER_OVERRIDE);
    createEReference(containerOverrideEClass, CONTAINER_OVERRIDE__TEST_SPEC);
    createEReference(containerOverrideEClass, CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES);

    deploymentOverrideEClass = createEClass(DEPLOYMENT_OVERRIDE);
    createEReference(deploymentOverrideEClass, DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE);
    createEReference(deploymentOverrideEClass, DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE);

    actionContainerEClass = createEClass(ACTION_CONTAINER);
    createEReference(actionContainerEClass, ACTION_CONTAINER__TEST_SPEC);
    createEReference(actionContainerEClass, ACTION_CONTAINER__SUPER_CONTAINER);
    createEReference(actionContainerEClass, ACTION_CONTAINER__SUB_CONTAINERS);
    createEReference(actionContainerEClass, ACTION_CONTAINER__ACTIONS);
    createEReference(actionContainerEClass, ACTION_CONTAINER__ALL_ACTIONS);

    actionEClass = createEClass(ACTION);
    createEReference(actionEClass, ACTION__CONTAINER);

    assertionContainerEClass = createEClass(ASSERTION_CONTAINER);
    createEReference(assertionContainerEClass, ASSERTION_CONTAINER__TEST_SPEC);
    createEReference(assertionContainerEClass, ASSERTION_CONTAINER__SUPER_CONTAINER);
    createEReference(assertionContainerEClass, ASSERTION_CONTAINER__SUB_CONTAINERS);
    createEReference(assertionContainerEClass, ASSERTION_CONTAINER__ASSERTIONS);
    createEReference(assertionContainerEClass, ASSERTION_CONTAINER__ALL_ASSERTIONS);

    assertionEClass = createEClass(ASSERTION);
    createEReference(assertionEClass, ASSERTION__CONTAINER);

    derivedAssertionEClass = createEClass(DERIVED_ASSERTION);

    unaryOpAssertionEClass = createEClass(UNARY_OP_ASSERTION);
    createEAttribute(unaryOpAssertionEClass, UNARY_OP_ASSERTION__OPERATOR);
    createEReference(unaryOpAssertionEClass, UNARY_OP_ASSERTION__OPERAND);

    binaryOpAssertionEClass = createEClass(BINARY_OP_ASSERTION);
    createEAttribute(binaryOpAssertionEClass, BINARY_OP_ASSERTION__OPERATOR);
    createEReference(binaryOpAssertionEClass, BINARY_OP_ASSERTION__LEFT_OPERAND);
    createEReference(binaryOpAssertionEClass, BINARY_OP_ASSERTION__RIGHT_OPERAND);

    testCaseSpecEClass = createEClass(TEST_CASE_SPEC);
    createEReference(testCaseSpecEClass, TEST_CASE_SPEC__TEST_SPEC);
    createEReference(testCaseSpecEClass, TEST_CASE_SPEC__SPEC_SEQUENCE);
    createEReference(testCaseSpecEClass, TEST_CASE_SPEC__ROOT);

    initializationEClass = createEClass(INITIALIZATION);
    createEReference(initializationEClass, INITIALIZATION__INITIALIZATION_ACTIONS);
    createEReference(initializationEClass, INITIALIZATION__SUPER_INITIALIZATION);
    createEReference(initializationEClass, INITIALIZATION__VERIFICATIONS);
    createEReference(initializationEClass, INITIALIZATION__SUB_INITIALIZATIONS);
    createEReference(initializationEClass, INITIALIZATION__EXECUTIONS);

    executionEClass = createEClass(EXECUTION);
    createEReference(executionEClass, EXECUTION__EXECUTION_ACTIONS);
    createEReference(executionEClass, EXECUTION__SUPER_EXECUTION);
    createEReference(executionEClass, EXECUTION__INITIALIZATION);
    createEReference(executionEClass, EXECUTION__VERIFICATIONS);
    createEReference(executionEClass, EXECUTION__SUB_EXECUTIONS);

    verificationEClass = createEClass(VERIFICATION);
    createEAttribute(verificationEClass, VERIFICATION__SPEC_LABEL);
    createEAttribute(verificationEClass, VERIFICATION__ID);
    createEReference(verificationEClass, VERIFICATION__CONTAINER_OVERRIDE);
    createEReference(verificationEClass, VERIFICATION__ASSERTIONS);
    createEReference(verificationEClass, VERIFICATION__INITIALIZATION);
    createEReference(verificationEClass, VERIFICATION__EXECUTION);

    testSuiteEClass = createEClass(TEST_SUITE);
    createEReference(testSuiteEClass, TEST_SUITE__TEST_SPEC);
    createEReference(testSuiteEClass, TEST_SUITE__INCLUDED_ACTIONS);
    createEReference(testSuiteEClass, TEST_SUITE__INCLUDED_ASSERTIONS);
    createEReference(testSuiteEClass, TEST_SUITE__TEST_CASES);
    createEAttribute(testSuiteEClass, TEST_SUITE__ID_PATTERN);

    // Create enums
    unaryOpTypeEEnum = createEEnum(UNARY_OP_TYPE);
    binaryOpTypeEEnum = createEEnum(BINARY_OP_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    DeployPackage theDeployPackage = (DeployPackage)EPackage.Registry.INSTANCE
            .getEPackage(DeployPackage.eNS_URI);

    // Add supertypes to classes
    namedElementEClass.getESuperTypes().add(this.getIDisplayable());
    testSpecEClass.getESuperTypes().add(this.getNamedElement());
    containerOverrideEClass.getESuperTypes().add(this.getNamedElement());
    deploymentOverrideEClass.getESuperTypes().add(this.getIDisplayable());
    actionContainerEClass.getESuperTypes().add(this.getNamedElement());
    actionEClass.getESuperTypes().add(this.getNamedElement());
    assertionContainerEClass.getESuperTypes().add(this.getNamedElement());
    assertionEClass.getESuperTypes().add(this.getNamedElement());
    derivedAssertionEClass.getESuperTypes().add(this.getAssertion());
    unaryOpAssertionEClass.getESuperTypes().add(this.getDerivedAssertion());
    binaryOpAssertionEClass.getESuperTypes().add(this.getDerivedAssertion());
    testCaseSpecEClass.getESuperTypes().add(this.getIDisplayable());
    initializationEClass.getESuperTypes().add(this.getTestCaseSpec());
    executionEClass.getESuperTypes().add(this.getTestCaseSpec());
    verificationEClass.getESuperTypes().add(this.getTestCaseSpec());
    testSuiteEClass.getESuperTypes().add(this.getNamedElement());

    // Initialize classes and features; add operations and parameters
    initEClass(iDisplayableEClass, IDisplayable.class, "IDisplayable", IS_ABSTRACT, IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIDisplayable_DisplayLabel(), ecorePackage.getEString(), "displayLabel", null,
            0, 1, IDisplayable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getIDisplayable_Description(), ecorePackage.getEString(), "description", null,
            0, 1, IDisplayable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
            NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testSpecEClass, TestSpec.class, "TestSpec", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestSpec_PackageName(), ecorePackage.getEString(), "packageName", null, 1, 1,
            TestSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestSpec_FixtureInterface(), ecorePackage.getEString(), "fixtureInterface",
            null, 0, 1, TestSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestSpec_FixtureClass(), ecorePackage.getEString(), "fixtureClass", null, 0,
            1, TestSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_ContainerToTest(), theDeployPackage.getContainer(), null,
            "containerToTest", null, 1, 1, TestSpec.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_ContainerOverrides(), this.getContainerOverride(), this
            .getContainerOverride_TestSpec(), "containerOverrides", null, 0, -1, TestSpec.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_ActionContainer(), this.getActionContainer(), this
            .getActionContainer_TestSpec(), "actionContainer", null, 0, 1, TestSpec.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_AssertionContainer(), this.getAssertionContainer(), this
            .getAssertionContainer_TestSpec(), "assertionContainer", null, 0, 1, TestSpec.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_TestCaseSpecs(), this.getTestCaseSpec(), this
            .getTestCaseSpec_TestSpec(), "testCaseSpecs", null, 0, -1, TestSpec.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_TestSuites(), this.getTestSuite(), this.getTestSuite_TestSpec(),
            "testSuites", null, 0, -1, TestSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_AllVerifications(), this.getVerification(), null,
            "allVerifications", null, 0, -1, TestSpec.class, IS_TRANSIENT, IS_VOLATILE,
            !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_AllActions(), this.getAction(), null, "allActions", null, 0, -1,
            TestSpec.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getTestSpec_AllAssertions(), this.getAssertion(), null, "allAssertions", null,
            0, -1, TestSpec.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(containerOverrideEClass, ContainerOverride.class, "ContainerOverride", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContainerOverride_TestSpec(), this.getTestSpec(), this
            .getTestSpec_ContainerOverrides(), "testSpec", null, 1, 1, ContainerOverride.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainerOverride_DeploymentOverrides(), this.getDeploymentOverride(), this
            .getDeploymentOverride_ContainerOverride(), "deploymentOverrides", "", 0, -1,
            ContainerOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentOverrideEClass, DeploymentOverride.class, "DeploymentOverride",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeploymentOverride_ContainerOverride(), this.getContainerOverride(), this
            .getContainerOverride_DeploymentOverrides(), "containerOverride", null, 1, 1,
            DeploymentOverride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploymentOverride_DeploymentToOverride(), theDeployPackage.getDeployment(),
            null, "deploymentToOverride", null, 1, 1, DeploymentOverride.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionContainerEClass, ActionContainer.class, "ActionContainer", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActionContainer_TestSpec(), this.getTestSpec(), this
            .getTestSpec_ActionContainer(), "testSpec", null, 0, 1, ActionContainer.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionContainer_SuperContainer(), this.getActionContainer(), this
            .getActionContainer_SubContainers(), "superContainer", null, 0, 1,
            ActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionContainer_SubContainers(), this.getActionContainer(), this
            .getActionContainer_SuperContainer(), "subContainers", null, 0, -1,
            ActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionContainer_Actions(), this.getAction(), this.getAction_Container(),
            "actions", null, 0, -1, ActionContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
    initEReference(getActionContainer_AllActions(), this.getAction(), null, "allActions", null, 0,
            -1, ActionContainer.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAction_Container(), this.getActionContainer(), this
            .getActionContainer_Actions(), "container", null, 1, 1, Action.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assertionContainerEClass, AssertionContainer.class, "AssertionContainer",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssertionContainer_TestSpec(), this.getTestSpec(), this
            .getTestSpec_AssertionContainer(), "testSpec", null, 0, 1, AssertionContainer.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssertionContainer_SuperContainer(), this.getAssertionContainer(), this
            .getAssertionContainer_SubContainers(), "superContainer", null, 0, 1,
            AssertionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssertionContainer_SubContainers(), this.getAssertionContainer(), this
            .getAssertionContainer_SuperContainer(), "subContainers", null, 0, -1,
            AssertionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssertionContainer_Assertions(), this.getAssertion(), this
            .getAssertion_Container(), "assertions", null, 0, -1, AssertionContainer.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssertionContainer_AllAssertions(), this.getAssertion(), null,
            "allAssertions", null, 0, -1, AssertionContainer.class, IS_TRANSIENT, IS_VOLATILE,
            !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            IS_DERIVED, IS_ORDERED);

    initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssertion_Container(), this.getAssertionContainer(), this
            .getAssertionContainer_Assertions(), "container", null, 1, 1, Assertion.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(derivedAssertionEClass, DerivedAssertion.class, "DerivedAssertion", IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unaryOpAssertionEClass, UnaryOpAssertion.class, "UnaryOpAssertion", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryOpAssertion_Operator(), this.getUnaryOpType(), "operator", "Not", 0, 1,
            UnaryOpAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryOpAssertion_Operand(), this.getAssertion(), null, "operand", null, 1, 1,
            UnaryOpAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(binaryOpAssertionEClass, BinaryOpAssertion.class, "BinaryOpAssertion", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBinaryOpAssertion_Operator(), this.getBinaryOpType(), "operator", "Or", 0, 1,
            BinaryOpAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryOpAssertion_LeftOperand(), this.getAssertion(), null, "leftOperand",
            null, 1, 1, BinaryOpAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBinaryOpAssertion_RightOperand(), this.getAssertion(), null, "rightOperand",
            null, 1, 1, BinaryOpAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testCaseSpecEClass, TestCaseSpec.class, "TestCaseSpec", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTestCaseSpec_TestSpec(), this.getTestSpec(),
            this.getTestSpec_TestCaseSpecs(), "testSpec", null, 0, 1, TestCaseSpec.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestCaseSpec_SpecSequence(), this.getTestCaseSpec(), null, "specSequence",
            null, 1, -1, TestCaseSpec.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getTestCaseSpec_Root(), this.getTestSpec(), null, "root", null, 1, 1,
            TestCaseSpec.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(initializationEClass, Initialization.class, "Initialization", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInitialization_InitializationActions(), this.getAction(), null,
            "initializationActions", null, 1, -1, Initialization.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialization_SuperInitialization(), this.getInitialization(), this
            .getInitialization_SubInitializations(), "superInitialization", null, 0, 1,
            Initialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialization_Verifications(), this.getVerification(), this
            .getVerification_Initialization(), "verifications", null, 0, -1, Initialization.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialization_SubInitializations(), this.getInitialization(), this
            .getInitialization_SuperInitialization(), "subInitializations", null, 0, -1,
            Initialization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInitialization_Executions(), this.getExecution(), this
            .getExecution_Initialization(), "executions", null, 0, -1, Initialization.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExecution_ExecutionActions(), this.getAction(), null, "executionActions",
            null, 1, -1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecution_SuperExecution(), this.getExecution(), this
            .getExecution_SubExecutions(), "superExecution", null, 0, 1, Execution.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecution_Initialization(), this.getInitialization(), this
            .getInitialization_Executions(), "initialization", null, 0, 1, Execution.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecution_Verifications(), this.getVerification(), this
            .getVerification_Execution(), "verifications", null, 0, -1, Execution.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecution_SubExecutions(), this.getExecution(), this
            .getExecution_SuperExecution(), "subExecutions", null, 0, -1, Execution.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationEClass, Verification.class, "Verification", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVerification_SpecLabel(), ecorePackage.getEString(), "specLabel", null, 0, 1,
            Verification.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerification_Id(), ecorePackage.getEString(), "id", null, 1, 1,
            Verification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerification_ContainerOverride(), this.getContainerOverride(), null,
            "containerOverride", null, 0, 1, Verification.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
    initEReference(getVerification_Assertions(), this.getAssertion(), null, "assertions", null, 1,
            -1, Verification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerification_Initialization(), this.getInitialization(), this
            .getInitialization_Verifications(), "initialization", null, 0, 1, Verification.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerification_Execution(), this.getExecution(), this
            .getExecution_Verifications(), "execution", null, 0, 1, Verification.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testSuiteEClass, TestSuite.class, "TestSuite", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTestSuite_TestSpec(), this.getTestSpec(), this.getTestSpec_TestSuites(),
            "testSpec", null, 1, 1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSuite_IncludedActions(), this.getAction(), null, "includedActions", null,
            0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSuite_IncludedAssertions(), this.getAssertion(), null,
            "includedAssertions", null, 0, -1, TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
    initEReference(getTestSuite_TestCases(), this.getVerification(), null, "testCases", null, 0,
            -1, TestSuite.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestSuite_IdPattern(), ecorePackage.getEString(), "idPattern", null, 0, 1,
            TestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(unaryOpTypeEEnum, UnaryOpType.class, "UnaryOpType");
    addEEnumLiteral(unaryOpTypeEEnum, UnaryOpType.FALSE_LITERAL);
    addEEnumLiteral(unaryOpTypeEEnum, UnaryOpType.IDENTITY_LITERAL);
    addEEnumLiteral(unaryOpTypeEEnum, UnaryOpType.NOT_LITERAL);
    addEEnumLiteral(unaryOpTypeEEnum, UnaryOpType.TRUE_LITERAL);

    initEEnum(binaryOpTypeEEnum, BinaryOpType.class, "BinaryOpType");
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.FALSE_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.AND_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.LEFT_AND_NOT_RIGHT_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.LEFT_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.NOT_LEFT_AND_RIGHT_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.RIGHT_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.XOR_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.OR_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.NOR_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.XN_OR_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.NOT_RIGHT_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.LEFT_OR_NOT_RIGHT_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.NOT_LEFT_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.NOT_LEFT_OR_RIGHT_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.NAND_LITERAL);
    addEEnumLiteral(binaryOpTypeEEnum, BinaryOpType.TRUE_LITERAL);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.topcased.org/uuid
    createUuidAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.topcased.org/uuid</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createUuidAnnotations()
  {
    String source = "http://www.topcased.org/uuid";
    addAnnotation(this, source, new String[] {"uuid", "11359738054370"});
    addAnnotation(iDisplayableEClass, source, new String[] {"uuid", "1135976242671132"});
    addAnnotation(getIDisplayable_DisplayLabel(), source, new String[] {"uuid", "1135977034484135"});
    addAnnotation(getIDisplayable_Description(), source, new String[] {"uuid", "1135976511078144"});
    addAnnotation(namedElementEClass, source, new String[] {"uuid", "1135976242671134"});
    addAnnotation(getNamedElement_Name(), source, new String[] {"uuid", "1135976345703141"});
    addAnnotation(testSpecEClass, source, new String[] {"uuid", "11359738054531"});
    addAnnotation(getTestSpec_PackageName(), source, new String[] {"uuid", "113698059884045"});
    addAnnotation(getTestSpec_FixtureInterface(), source, new String[] {"uuid", "113698407268448"});
    addAnnotation(getTestSpec_FixtureClass(), source, new String[] {"uuid", "113698642665352"});
    addAnnotation(getTestSpec_ContainerToTest(), source, new String[] {"uuid", "113698642665351"});
    addAnnotation(getTestSpec_ContainerOverrides(), source, new String[] {"uuid", "11359738054532"});
    addAnnotation(getTestSpec_ActionContainer(), source, new String[] {"uuid", "11359738054533"});
    addAnnotation(getTestSpec_AssertionContainer(), source, new String[] {"uuid", "11359738054534"});
    addAnnotation(getTestSpec_TestCaseSpecs(), source, new String[] {"uuid", "113597473968715"});
    addAnnotation(getTestSpec_TestSuites(), source, new String[] {"uuid", "113602871081233"});
    addAnnotation(getTestSpec_AllVerifications(), source, new String[] {"uuid", "113603590059336"});
    addAnnotation(getTestSpec_AllActions(), source, new String[] {"uuid", "113697967863739"});
    addAnnotation(getTestSpec_AllAssertions(), source, new String[] {"uuid", "113697967863740"});
    addAnnotation(containerOverrideEClass, source, new String[] {"uuid", "11359738054535"});
    addAnnotation(getContainerOverride_TestSpec(), source, new String[] {"uuid", "11359738054536"});
    addAnnotation(getContainerOverride_DeploymentOverrides(), source, new String[] {"uuid",
            "11359738054537"});
    addAnnotation(deploymentOverrideEClass, source, new String[] {"uuid", "113597380548418"});
    addAnnotation(getDeploymentOverride_ContainerOverride(), source, new String[] {"uuid",
            "113597380548419"});
    addAnnotation(getDeploymentOverride_DeploymentToOverride(), source, new String[] {"uuid",
            "113601618790679"});
    addAnnotation(actionContainerEClass, source, new String[] {"uuid", "11359738054538"});
    addAnnotation(getActionContainer_TestSpec(), source, new String[] {"uuid", "113597380546810"});
    addAnnotation(getActionContainer_SuperContainer(), source, new String[] {"uuid",
            "113597380546811"});
    addAnnotation(getActionContainer_SubContainers(), source, new String[] {"uuid",
            "113597380546812"});
    addAnnotation(getActionContainer_Actions(), source, new String[] {"uuid", "11359738054539"});
    addAnnotation(getActionContainer_AllActions(), source, new String[] {"uuid", "113697993959081"});
    addAnnotation(actionEClass, source, new String[] {"uuid", "113597380548420"});
    addAnnotation(getAction_Container(), source, new String[] {"uuid", "113597380548421"});
    addAnnotation(assertionContainerEClass, source, new String[] {"uuid", "113597380546813"});
    addAnnotation(getAssertionContainer_TestSpec(), source,
            new String[] {"uuid", "113597380546815"});
    addAnnotation(getAssertionContainer_SuperContainer(), source, new String[] {"uuid",
            "113597380546816"});
    addAnnotation(getAssertionContainer_SubContainers(), source, new String[] {"uuid",
            "113597380546817"});
    addAnnotation(getAssertionContainer_Assertions(), source, new String[] {"uuid",
            "113597380546814"});
    addAnnotation(getAssertionContainer_AllAssertions(), source, new String[] {"uuid",
            "1136979939590103"});
    addAnnotation(assertionEClass, source, new String[] {"uuid", "113597380548422"});
    addAnnotation(getAssertion_Container(), source, new String[] {"uuid", "113597380548423"});
    addAnnotation(derivedAssertionEClass, source, new String[] {"uuid", "1136018974921237"});
    addAnnotation(unaryOpAssertionEClass, source, new String[] {"uuid", "1136016888125159"});
    addAnnotation(getUnaryOpAssertion_Operator(), source, new String[] {"uuid", "1136018697046162"});
    addAnnotation(getUnaryOpAssertion_Operand(), source, new String[] {"uuid", "1136019022562165"});
    addAnnotation(binaryOpAssertionEClass, source, new String[] {"uuid", "1136016888140160"});
    addAnnotation(getBinaryOpAssertion_Operator(), source,
            new String[] {"uuid", "1136018697046162"});
    addAnnotation(getBinaryOpAssertion_LeftOperand(), source, new String[] {"uuid",
            "1136019022562172"});
    addAnnotation(getBinaryOpAssertion_RightOperand(), source, new String[] {"uuid",
            "1136019022562173"});
    addAnnotation(testCaseSpecEClass, source, new String[] {"uuid", "113597473971892"});
    addAnnotation(getTestCaseSpec_TestSpec(), source, new String[] {"uuid", "113597473971893"});
    addAnnotation(getTestCaseSpec_SpecSequence(), source, new String[] {"uuid", "1136033188296129"});
    addAnnotation(getTestCaseSpec_Root(), source, new String[] {"uuid", "1137045743765156"});
    addAnnotation(initializationEClass, source, new String[] {"uuid", "113597425729672"});
    addAnnotation(getInitialization_InitializationActions(), source, new String[] {"uuid",
            "113597473968776"});
    addAnnotation(getInitialization_SuperInitialization(), source, new String[] {"uuid",
            "113597587848490"});
    addAnnotation(getInitialization_Verifications(), source, new String[] {"uuid",
            "113597502770387"});
    addAnnotation(getInitialization_SubInitializations(), source, new String[] {"uuid",
            "113597473968777"});
    addAnnotation(getInitialization_Executions(), source, new String[] {"uuid", "113597473970378"});
    addAnnotation(executionEClass, source, new String[] {"uuid", "113597425729673"});
    addAnnotation(getExecution_ExecutionActions(), source, new String[] {"uuid", "113597473970382"});
    addAnnotation(getExecution_SuperExecution(), source, new String[] {"uuid", "1135975878484106"});
    addAnnotation(getExecution_Initialization(), source, new String[] {"uuid", "113597473970384"});
    addAnnotation(getExecution_Verifications(), source, new String[] {"uuid", "113597473970385"});
    addAnnotation(getExecution_SubExecutions(), source, new String[] {"uuid", "113597473970383"});
    addAnnotation(verificationEClass, source, new String[] {"uuid", "113597425729674"});
    addAnnotation(getVerification_SpecLabel(), source, new String[] {"uuid", "1136032886484183"});
    addAnnotation(getVerification_Id(), source, new String[] {"uuid", "1137045199218210"});
    addAnnotation(getVerification_ContainerOverride(), source, new String[] {"uuid",
            "113597473971890"});
    addAnnotation(getVerification_Assertions(), source, new String[] {"uuid", "113597473971889"});
    addAnnotation(getVerification_Initialization(), source, new String[] {"uuid",
            "1135975027703115"});
    addAnnotation(getVerification_Execution(), source, new String[] {"uuid", "113597473971891"});
    addAnnotation(testSuiteEClass, source, new String[] {"uuid", "1136028204046243"});
    addAnnotation(getTestSuite_TestSpec(), source, new String[] {"uuid", "1136028710812250"});
    addAnnotation(getTestSuite_IncludedActions(), source, new String[] {"uuid", "1136031108156189"});
    addAnnotation(getTestSuite_IncludedAssertions(), source, new String[] {"uuid",
            "1136031006109186"});
    addAnnotation(getTestSuite_TestCases(), source, new String[] {"uuid", "1136035732609198"});
    addAnnotation(getTestSuite_IdPattern(), source, new String[] {"uuid", "1137054546890231"});
    addAnnotation(unaryOpTypeEEnum, source, new String[] {"uuid", "1136016888140161"});
    addAnnotation((EEnumLiteral)unaryOpTypeEEnum.getELiterals().get(0), source, new String[] {
            "uuid", "1136016888140162"});
    addAnnotation((EEnumLiteral)unaryOpTypeEEnum.getELiterals().get(1), source, new String[] {
            "uuid", "1136016888156163"});
    addAnnotation((EEnumLiteral)unaryOpTypeEEnum.getELiterals().get(2), source, new String[] {
            "uuid", "1136018057796174"});
    addAnnotation((EEnumLiteral)unaryOpTypeEEnum.getELiterals().get(3), source, new String[] {
            "uuid", "1136018057796175"});
    addAnnotation(binaryOpTypeEEnum, source, new String[] {"uuid", "1136018057796176"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(0), source, new String[] {
            "uuid", "1136018057812177"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(1), source, new String[] {
            "uuid", "1136018057812178"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(2), source, new String[] {
            "uuid", "1136018057828179"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(3), source, new String[] {
            "uuid", "1136018057828180"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(4), source, new String[] {
            "uuid", "1136018057828181"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(5), source, new String[] {
            "uuid", "1136018057843182"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(6), source, new String[] {
            "uuid", "1136018057843183"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(7), source, new String[] {
            "uuid", "1136018057843184"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(8), source, new String[] {
            "uuid", "1136018057859185"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(9), source, new String[] {
            "uuid", "1136018057859186"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(10), source, new String[] {
            "uuid", "1136018057859187"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(11), source, new String[] {
            "uuid", "1136018057875188"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(12), source, new String[] {
            "uuid", "1136018057875189"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(13), source, new String[] {
            "uuid", "1136018235828222"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(14), source, new String[] {
            "uuid", "1136018365875225"});
    addAnnotation((EEnumLiteral)binaryOpTypeEEnum.getELiterals().get(15), source, new String[] {
            "uuid", "1136018365875226"});
  }

} //DeploytestPackageImpl

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


import com.sympedia.density.gen.deploytest.*;

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
import com.sympedia.density.gen.deploytest.Execution;
import com.sympedia.density.gen.deploytest.Initialization;
import com.sympedia.density.gen.deploytest.TestSpec;
import com.sympedia.density.gen.deploytest.TestSuite;
import com.sympedia.density.gen.deploytest.UnaryOpAssertion;
import com.sympedia.density.gen.deploytest.UnaryOpType;
import com.sympedia.density.gen.deploytest.Verification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DeploytestFactoryImpl extends EFactoryImpl implements DeploytestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeploytestFactory init()
  {
    try
    {
      DeploytestFactory theDeploytestFactory = (DeploytestFactory)EPackage.Registry.INSTANCE
              .getEFactory("http://deploytest");
      if (theDeploytestFactory != null)
      {
        return theDeploytestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeploytestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploytestFactoryImpl()
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
      case DeploytestPackage.TEST_SPEC:
        return createTestSpec();
      case DeploytestPackage.CONTAINER_OVERRIDE:
        return createContainerOverride();
      case DeploytestPackage.DEPLOYMENT_OVERRIDE:
        return createDeploymentOverride();
      case DeploytestPackage.ACTION_CONTAINER:
        return createActionContainer();
      case DeploytestPackage.ACTION:
        return createAction();
      case DeploytestPackage.ASSERTION_CONTAINER:
        return createAssertionContainer();
      case DeploytestPackage.ASSERTION:
        return createAssertion();
      case DeploytestPackage.UNARY_OP_ASSERTION:
        return createUnaryOpAssertion();
      case DeploytestPackage.BINARY_OP_ASSERTION:
        return createBinaryOpAssertion();
      case DeploytestPackage.INITIALIZATION:
        return createInitialization();
      case DeploytestPackage.EXECUTION:
        return createExecution();
      case DeploytestPackage.VERIFICATION:
        return createVerification();
      case DeploytestPackage.TEST_SUITE:
        return createTestSuite();
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
      case DeploytestPackage.UNARY_OP_TYPE:
        return createUnaryOpTypeFromString(eDataType, initialValue);
      case DeploytestPackage.BINARY_OP_TYPE:
        return createBinaryOpTypeFromString(eDataType, initialValue);
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
      case DeploytestPackage.UNARY_OP_TYPE:
        return convertUnaryOpTypeToString(eDataType, instanceValue);
      case DeploytestPackage.BINARY_OP_TYPE:
        return convertBinaryOpTypeToString(eDataType, instanceValue);
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
  public TestSpec createTestSpec()
  {
    TestSpecImpl testSpec = new TestSpecImpl();
    return testSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentOverride createDeploymentOverride()
  {
    DeploymentOverrideImpl deploymentOverride = new DeploymentOverrideImpl();
    return deploymentOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionContainer createActionContainer()
  {
    ActionContainerImpl actionContainer = new ActionContainerImpl();
    return actionContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionContainer createAssertionContainer()
  {
    AssertionContainerImpl assertionContainer = new AssertionContainerImpl();
    return assertionContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion createAssertion()
  {
    AssertionImpl assertion = new AssertionImpl();
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOpAssertion createUnaryOpAssertion()
  {
    UnaryOpAssertionImpl unaryOpAssertion = new UnaryOpAssertionImpl();
    return unaryOpAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOpAssertion createBinaryOpAssertion()
  {
    BinaryOpAssertionImpl binaryOpAssertion = new BinaryOpAssertionImpl();
    return binaryOpAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initialization createInitialization()
  {
    InitializationImpl initialization = new InitializationImpl();
    return initialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Execution createExecution()
  {
    ExecutionImpl execution = new ExecutionImpl();
    return execution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verification createVerification()
  {
    VerificationImpl verification = new VerificationImpl();
    return verification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSuite createTestSuite()
  {
    TestSuiteImpl testSuite = new TestSuiteImpl();
    return testSuite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerOverride createContainerOverride()
  {
    ContainerOverrideImpl containerOverride = new ContainerOverrideImpl();
    return containerOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOpType createUnaryOpTypeFromString(EDataType eDataType, String initialValue)
  {
    UnaryOpType result = UnaryOpType.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException("The value '" + initialValue
              + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnaryOpTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOpType createBinaryOpTypeFromString(EDataType eDataType, String initialValue)
  {
    BinaryOpType result = BinaryOpType.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException("The value '" + initialValue
              + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBinaryOpTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploytestPackage getDeploytestPackage()
  {
    return (DeploytestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static DeploytestPackage getPackage()
  {
    return DeploytestPackage.eINSTANCE;
  }

} //DeploytestFactoryImpl

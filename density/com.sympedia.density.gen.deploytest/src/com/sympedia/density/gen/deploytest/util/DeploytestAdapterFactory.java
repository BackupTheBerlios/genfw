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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage
 * @generated
 */
public class DeploytestAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DeploytestPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploytestAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DeploytestPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch the delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploytestSwitch modelSwitch = new DeploytestSwitch()
  {
    public Object caseIDisplayable(IDisplayable object)
    {
      return createIDisplayableAdapter();
    }

    public Object caseNamedElement(NamedElement object)
    {
      return createNamedElementAdapter();
    }

    public Object caseTestSpec(TestSpec object)
    {
      return createTestSpecAdapter();
    }

    public Object caseContainerOverride(ContainerOverride object)
    {
      return createContainerOverrideAdapter();
    }

    public Object caseDeploymentOverride(DeploymentOverride object)
    {
      return createDeploymentOverrideAdapter();
    }

    public Object caseActionContainer(ActionContainer object)
    {
      return createActionContainerAdapter();
    }

    public Object caseAction(Action object)
    {
      return createActionAdapter();
    }

    public Object caseAssertionContainer(AssertionContainer object)
    {
      return createAssertionContainerAdapter();
    }

    public Object caseAssertion(Assertion object)
    {
      return createAssertionAdapter();
    }

    public Object caseDerivedAssertion(DerivedAssertion object)
    {
      return createDerivedAssertionAdapter();
    }

    public Object caseUnaryOpAssertion(UnaryOpAssertion object)
    {
      return createUnaryOpAssertionAdapter();
    }

    public Object caseBinaryOpAssertion(BinaryOpAssertion object)
    {
      return createBinaryOpAssertionAdapter();
    }

    public Object caseTestCaseSpec(TestCaseSpec object)
    {
      return createTestCaseSpecAdapter();
    }

    public Object caseInitialization(Initialization object)
    {
      return createInitializationAdapter();
    }

    public Object caseExecution(Execution object)
    {
      return createExecutionAdapter();
    }

    public Object caseVerification(Verification object)
    {
      return createVerificationAdapter();
    }

    public Object caseTestSuite(TestSuite object)
    {
      return createTestSuiteAdapter();
    }

    public Object defaultCase(EObject object)
    {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  public Adapter createAdapter(Notifier target)
  {
    return (Adapter)modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.IDisplayable <em>IDisplayable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.IDisplayable
   * @generated
   */
  public Adapter createIDisplayableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.TestSpec <em>Test Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.TestSpec
   * @generated
   */
  public Adapter createTestSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.DeploymentOverride <em>Deployment Override</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.DeploymentOverride
   * @generated
   */
  public Adapter createDeploymentOverrideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.ActionContainer <em>Action Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.ActionContainer
   * @generated
   */
  public Adapter createActionContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.AssertionContainer <em>Assertion Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.AssertionContainer
   * @generated
   */
  public Adapter createAssertionContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.Assertion
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.DerivedAssertion <em>Derived Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.DerivedAssertion
   * @generated
   */
  public Adapter createDerivedAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.UnaryOpAssertion <em>Unary Op Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.UnaryOpAssertion
   * @generated
   */
  public Adapter createUnaryOpAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion <em>Binary Op Assertion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.BinaryOpAssertion
   * @generated
   */
  public Adapter createBinaryOpAssertionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.TestCaseSpec <em>Test Case Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.TestCaseSpec
   * @generated
   */
  public Adapter createTestCaseSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.Initialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.Initialization
   * @generated
   */
  public Adapter createInitializationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.Execution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.Execution
   * @generated
   */
  public Adapter createExecutionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.Verification <em>Verification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.Verification
   * @generated
   */
  public Adapter createVerificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.TestSuite <em>Test Suite</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.TestSuite
   * @generated
   */
  public Adapter createTestSuiteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploytest.ContainerOverride <em>Container Override</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploytest.ContainerOverride
   * @generated
   */
  public Adapter createContainerOverrideAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DeploytestAdapterFactory

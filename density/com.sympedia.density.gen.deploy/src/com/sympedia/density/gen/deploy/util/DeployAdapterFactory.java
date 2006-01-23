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
package com.sympedia.density.gen.deploy.util;


import com.sympedia.density.gen.deploy.*;

import com.sympedia.density.gen.deploy.BooleanParameter;
import com.sympedia.density.gen.deploy.CharParameter;
import com.sympedia.density.gen.deploy.Container;
import com.sympedia.density.gen.deploy.Creator;
import com.sympedia.density.gen.deploy.Dependency;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.DeploymentGroup;
import com.sympedia.density.gen.deploy.DoubleParameter;
import com.sympedia.density.gen.deploy.FloatParameter;
import com.sympedia.density.gen.deploy.IntegerParameter;
import com.sympedia.density.gen.deploy.Listener;
import com.sympedia.density.gen.deploy.LongParameter;
import com.sympedia.density.gen.deploy.Parameter;
import com.sympedia.density.gen.deploy.Reference;
import com.sympedia.density.gen.deploy.StringParameter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.deploy.DeployPackage
 * @generated
 */
public class DeployAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DeployPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DeployPackage.eINSTANCE;
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
  protected DeploySwitch modelSwitch = new DeploySwitch()
  {
    public Object caseContainer(Container object)
    {
      return createContainerAdapter();
    }

    public Object caseDeployment(Deployment object)
    {
      return createDeploymentAdapter();
    }

    public Object caseDeploymentGroup(DeploymentGroup object)
    {
      return createDeploymentGroupAdapter();
    }

    public Object caseParameter(Parameter object)
    {
      return createParameterAdapter();
    }

    public Object caseDependency(Dependency object)
    {
      return createDependencyAdapter();
    }

    public Object caseReference(Reference object)
    {
      return createReferenceAdapter();
    }

    public Object caseIntegerParameter(IntegerParameter object)
    {
      return createIntegerParameterAdapter();
    }

    public Object caseLongParameter(LongParameter object)
    {
      return createLongParameterAdapter();
    }

    public Object caseFloatParameter(FloatParameter object)
    {
      return createFloatParameterAdapter();
    }

    public Object caseDoubleParameter(DoubleParameter object)
    {
      return createDoubleParameterAdapter();
    }

    public Object caseBooleanParameter(BooleanParameter object)
    {
      return createBooleanParameterAdapter();
    }

    public Object caseStringParameter(StringParameter object)
    {
      return createStringParameterAdapter();
    }

    public Object caseCharParameter(CharParameter object)
    {
      return createCharParameterAdapter();
    }

    public Object caseCreator(Creator object)
    {
      return createCreatorAdapter();
    }

    public Object caseListener(Listener object)
    {
      return createListenerAdapter();
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
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.Container
   * @generated
   */
  public Adapter createContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.Deployment
   * @generated
   */
  public Adapter createDeploymentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.DeploymentGroup <em>Deployment Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.DeploymentGroup
   * @generated
   */
  public Adapter createDeploymentGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.Dependency
   * @generated
   */
  public Adapter createDependencyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.IntegerParameter <em>Integer Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.IntegerParameter
   * @generated
   */
  public Adapter createIntegerParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.LongParameter <em>Long Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.LongParameter
   * @generated
   */
  public Adapter createLongParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.FloatParameter <em>Float Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.FloatParameter
   * @generated
   */
  public Adapter createFloatParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.DoubleParameter <em>Double Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.DoubleParameter
   * @generated
   */
  public Adapter createDoubleParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.BooleanParameter <em>Boolean Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.BooleanParameter
   * @generated
   */
  public Adapter createBooleanParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.StringParameter <em>String Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.StringParameter
   * @generated
   */
  public Adapter createStringParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.CharParameter <em>Char Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.CharParameter
   * @generated
   */
  public Adapter createCharParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.Creator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.Creator
   * @generated
   */
  public Adapter createCreatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.deploy.Listener <em>Listener</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.deploy.Listener
   * @generated
   */
  public Adapter createListenerAdapter()
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

} //DeployAdapterFactory

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.ocl.OclPackage
 * @generated
 */
public class OclAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OclPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OclPackage.eINSTANCE;
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
  protected OclSwitch modelSwitch = new OclSwitch()
  {
    public Object caseOclRule(OclRule object)
    {
      return createOclRuleAdapter();
    }

    public Object caseConfigurableOclRule(ConfigurableOclRule object)
    {
      return createConfigurableOclRuleAdapter();
    }

    public Object casePackageConfiguration(PackageConfiguration object)
    {
      return createPackageConfigurationAdapter();
    }

    public Object caseDynamicPackage(DynamicPackage object)
    {
      return createDynamicPackageAdapter();
    }

    public Object caseStaticPackage(StaticPackage object)
    {
      return createStaticPackageAdapter();
    }

    public Object caseLifeCycle(LifeCycle object)
    {
      return createLifeCycleAdapter();
    }

    public Object caseRule(Rule object)
    {
      return createRuleAdapter();
    }

    public Object caseExpressionBasedRule(ExpressionBasedRule object)
    {
      return createExpressionBasedRuleAdapter();
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
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ocl.OclRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ocl.OclRule
   * @generated
   */
  public Adapter createOclRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ocl.ConfigurableOclRule <em>Configurable Ocl Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ocl.ConfigurableOclRule
   * @generated
   */
  public Adapter createConfigurableOclRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ocl.PackageConfiguration <em>Package Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ocl.PackageConfiguration
   * @generated
   */
  public Adapter createPackageConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ocl.DynamicPackage <em>Dynamic Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ocl.DynamicPackage
   * @generated
   */
  public Adapter createDynamicPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ocl.StaticPackage <em>Static Package</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ocl.StaticPackage
   * @generated
   */
  public Adapter createStaticPackageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.LifeCycle <em>Life Cycle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.LifeCycle
   * @generated
   */
  public Adapter createLifeCycleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ExpressionBasedRule <em>Expression Based Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ExpressionBasedRule
   * @generated
   */
  public Adapter createExpressionBasedRuleAdapter()
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

} //OclAdapterFactory

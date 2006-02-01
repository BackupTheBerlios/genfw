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
package com.sympedia.genfw.bsh.util;


import com.sympedia.genfw.DomTransformation;
import com.sympedia.genfw.ExpressionBasedRule;
import com.sympedia.genfw.Rule;
import com.sympedia.genfw.bsh.*;

import com.sympedia.genfw.bsh.BeanShellRule;
import com.sympedia.genfw.bsh.BshPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.bsh.BshPackage
 * @generated
 */
public class BshAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BshPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BshAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BshPackage.eINSTANCE;
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
  protected BshSwitch modelSwitch = new BshSwitch()
  {
    public Object caseBeanShellRule(BeanShellRule object)
    {
      return createBeanShellRuleAdapter();
    }

    public Object caseBeanShellTransformation(BeanShellTransformation object)
    {
      return createBeanShellTransformationAdapter();
    }

    public Object caseRule(Rule object)
    {
      return createRuleAdapter();
    }

    public Object caseExpressionBasedRule(ExpressionBasedRule object)
    {
      return createExpressionBasedRuleAdapter();
    }

    public Object caseDomTransformation(DomTransformation object)
    {
      return createDomTransformationAdapter();
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
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.bsh.BeanShellRule <em>Bean Shell Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.bsh.BeanShellRule
   * @generated
   */
  public Adapter createBeanShellRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.bsh.BeanShellTransformation <em>Bean Shell Transformation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.bsh.BeanShellTransformation
   * @generated
   */
  public Adapter createBeanShellTransformationAdapter()
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
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.DomTransformation <em>Dom Transformation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.DomTransformation
   * @generated
   */
  public Adapter createDomTransformationAdapter()
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

} //BshAdapterFactory

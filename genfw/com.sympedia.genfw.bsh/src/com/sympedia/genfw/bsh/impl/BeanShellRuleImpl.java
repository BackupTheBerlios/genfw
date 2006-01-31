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
package com.sympedia.genfw.bsh.impl;


import bsh.EvalError;
import bsh.Interpreter;

import com.sympedia.genfw.bsh.BeanShellRule;
import com.sympedia.genfw.bsh.BshPackage;
import com.sympedia.genfw.impl.ExpressionBasedRuleImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Shell Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.bsh.impl.BeanShellRuleImpl#getBootstrapCode <em>Bootstrap Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanShellRuleImpl extends ExpressionBasedRuleImpl implements BeanShellRule
{
  /**
   * The default value of the '{@link #getBootstrapCode() <em>Bootstrap Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrapCode()
   * @generated
   * @ordered
   */
  protected static final String BOOTSTRAP_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBootstrapCode() <em>Bootstrap Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrapCode()
   * @generated
   * @ordered
   */
  protected String bootstrapCode = BOOTSTRAP_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeanShellRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return BshPackage.Literals.BEAN_SHELL_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBootstrapCode()
  {
    return bootstrapCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBootstrapCode(String newBootstrapCode)
  {
    String oldBootstrapCode = bootstrapCode;
    bootstrapCode = newBootstrapCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              BshPackage.BEAN_SHELL_RULE__BOOTSTRAP_CODE, oldBootstrapCode, bootstrapCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case BshPackage.BEAN_SHELL_RULE__BOOTSTRAP_CODE:
      return getBootstrapCode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case BshPackage.BEAN_SHELL_RULE__BOOTSTRAP_CODE:
      setBootstrapCode((String)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case BshPackage.BEAN_SHELL_RULE__BOOTSTRAP_CODE:
      setBootstrapCode(BOOTSTRAP_CODE_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case BshPackage.BEAN_SHELL_RULE__BOOTSTRAP_CODE:
      return BOOTSTRAP_CODE_EDEFAULT == null ? bootstrapCode != null : !BOOTSTRAP_CODE_EDEFAULT
              .equals(bootstrapCode);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (bootstrapCode: ");
    result.append(bootstrapCode);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public boolean evaluateMatchExpression(Object inputObject, String expr)
  {
    try
    {
      Interpreter i = getBshInterpreter(inputObject);
      i.eval("boolean ___EXPR___() { return " + expr + "; }");
      i.set("self", inputObject);
      Object result = i.eval("___EXPR___()");
      return result != null && result instanceof Boolean && ((Boolean)result).booleanValue();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }

    return false;
  }

  /**
   * @ADDED
   */
  @Override
  public String getTargetPath(Object inputObject) throws Exception
  {
    String expr = getTargetPathExpression();
    if (expr == null || expr.length() == 0)
    {
      return null;
    }

    Interpreter i = getBshInterpreter(inputObject);
    i.eval("String ___EXPR___() { return " + expr + "; }");
    i.set("self", inputObject);

    Object result = i.eval("___EXPR___()");
    if (result instanceof String)
    {
      return (String)result;
    }

    return null;
  }

  /**
   * @param inputObject 
   * @ADDED
   */
  protected Interpreter getBshInterpreter(Object inputObject) throws EvalError
  {
    ClassLoader parentClassLoader = inputObject.getClass().getClassLoader();
    ClassLoader classLoader = getRuleSet().getRoot().getClassLoader(parentClassLoader);
    Interpreter i = new Interpreter();
    i.setClassLoader(classLoader);
    i.eval("import com.sympedia.genfw.*;");

    String decl = getBootstrapCode();
    if (decl != null && decl.length() != 0)
    {
      i.eval(decl);
    }

    return i;
  }
} //BeanShellRuleImpl

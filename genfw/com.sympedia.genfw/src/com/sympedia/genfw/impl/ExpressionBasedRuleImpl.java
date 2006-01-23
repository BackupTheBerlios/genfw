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
package com.sympedia.genfw.impl;


import com.sympedia.genfw.ExpressionBasedRule;
import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Based Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.ExpressionBasedRuleImpl#getMatchExpression <em>Match Expression</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.ExpressionBasedRuleImpl#getTargetPathExpression <em>Target Path Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionBasedRuleImpl extends RuleImpl implements ExpressionBasedRule
{
  /**
   * The default value of the '{@link #getMatchExpression() <em>Match Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchExpression()
   * @generated
   * @ordered
   */
  protected static final String MATCH_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMatchExpression() <em>Match Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchExpression()
   * @generated
   * @ordered
   */
  protected String matchExpression = MATCH_EXPRESSION_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetPathExpression() <em>Target Path Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetPathExpression()
   * @generated
   * @ordered
   */
  protected static final String TARGET_PATH_EXPRESSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetPathExpression() <em>Target Path Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetPathExpression()
   * @generated
   * @ordered
   */
  protected String targetPathExpression = TARGET_PATH_EXPRESSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionBasedRuleImpl()
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
    return GenfwPackage.Literals.EXPRESSION_BASED_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMatchExpression()
  {
    return matchExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatchExpression(String newMatchExpression)
  {
    String oldMatchExpression = matchExpression;
    matchExpression = newMatchExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.EXPRESSION_BASED_RULE__MATCH_EXPRESSION, oldMatchExpression,
              matchExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetPathExpression()
  {
    return targetPathExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetPathExpression(String newTargetPathExpression)
  {
    String oldTargetPathExpression = targetPathExpression;
    targetPathExpression = newTargetPathExpression;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION, oldTargetPathExpression,
              targetPathExpression));
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
    case GenfwPackage.EXPRESSION_BASED_RULE__MATCH_EXPRESSION:
      return getMatchExpression();
    case GenfwPackage.EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION:
      return getTargetPathExpression();
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
    case GenfwPackage.EXPRESSION_BASED_RULE__MATCH_EXPRESSION:
      setMatchExpression((String)newValue);
      return;
    case GenfwPackage.EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION:
      setTargetPathExpression((String)newValue);
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
    case GenfwPackage.EXPRESSION_BASED_RULE__MATCH_EXPRESSION:
      setMatchExpression(MATCH_EXPRESSION_EDEFAULT);
      return;
    case GenfwPackage.EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION:
      setTargetPathExpression(TARGET_PATH_EXPRESSION_EDEFAULT);
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
    case GenfwPackage.EXPRESSION_BASED_RULE__MATCH_EXPRESSION:
      return MATCH_EXPRESSION_EDEFAULT == null ? matchExpression != null
              : !MATCH_EXPRESSION_EDEFAULT.equals(matchExpression);
    case GenfwPackage.EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION:
      return TARGET_PATH_EXPRESSION_EDEFAULT == null ? targetPathExpression != null
              : !TARGET_PATH_EXPRESSION_EDEFAULT.equals(targetPathExpression);
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
    result.append(" (matchExpression: ");
    result.append(matchExpression);
    result.append(", targetPathExpression: ");
    result.append(targetPathExpression);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  protected boolean evaluateMatch(Object inputObject)
  {
    String expr = getMatchExpression();
    if (expr == null || expr.length() == 0) return true;
    return evaluateMatchExpression(inputObject, expr);
  }

  /**
   * @ADDED
   */
  protected abstract boolean evaluateMatchExpression(Object inputObject, String expr);
} //ExpressionBasedRuleImpl

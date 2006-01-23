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


import com.sympedia.density.gen.deploytest.Assertion;
import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.UnaryOpAssertion;
import com.sympedia.density.gen.deploytest.UnaryOpType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Op Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.UnaryOpAssertionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.UnaryOpAssertionImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryOpAssertionImpl extends DerivedAssertionImpl implements UnaryOpAssertion
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final UnaryOpType OPERATOR_EDEFAULT = UnaryOpType.NOT_LITERAL;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected UnaryOpType operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperand()
   * @generated
   * @ordered
   */
  protected Assertion operand = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryOpAssertionImpl()
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
    return DeploytestPackage.Literals.UNARY_OP_ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOpType getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(UnaryOpType newOperator)
  {
    UnaryOpType oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.UNARY_OP_ASSERTION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion getOperand()
  {
    if (operand != null && operand.eIsProxy())
    {
      InternalEObject oldOperand = (InternalEObject)operand;
      operand = (Assertion)eResolveProxy(oldOperand);
      if (operand != oldOperand)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeploytestPackage.UNARY_OP_ASSERTION__OPERAND, oldOperand, operand));
      }
    }
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion basicGetOperand()
  {
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperand(Assertion newOperand)
  {
    Assertion oldOperand = operand;
    operand = newOperand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.UNARY_OP_ASSERTION__OPERAND, oldOperand, operand));
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
      case DeploytestPackage.UNARY_OP_ASSERTION__OPERATOR:
        return getOperator();
      case DeploytestPackage.UNARY_OP_ASSERTION__OPERAND:
        if (resolve) return getOperand();
        return basicGetOperand();
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
      case DeploytestPackage.UNARY_OP_ASSERTION__OPERATOR:
        setOperator((UnaryOpType)newValue);
        return;
      case DeploytestPackage.UNARY_OP_ASSERTION__OPERAND:
        setOperand((Assertion)newValue);
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
      case DeploytestPackage.UNARY_OP_ASSERTION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case DeploytestPackage.UNARY_OP_ASSERTION__OPERAND:
        setOperand((Assertion)null);
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
      case DeploytestPackage.UNARY_OP_ASSERTION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case DeploytestPackage.UNARY_OP_ASSERTION__OPERAND:
        return operand != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public String getDisplayLabel()
  {
    if (getOperator() == UnaryOpType.FALSE_LITERAL) return "false";
    if (getOperator() == UnaryOpType.TRUE_LITERAL) return "true";
    return getOperator().toString() + " "
            + (getOperand() == null ? "?" : getOperand().getDisplayLabel());
  }
} //UnaryOpAssertionImpl

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
import com.sympedia.density.gen.deploytest.BinaryOpAssertion;
import com.sympedia.density.gen.deploytest.BinaryOpType;
import com.sympedia.density.gen.deploytest.DeploytestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Op Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.BinaryOpAssertionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.BinaryOpAssertionImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.BinaryOpAssertionImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BinaryOpAssertionImpl extends DerivedAssertionImpl implements BinaryOpAssertion
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final BinaryOpType OPERATOR_EDEFAULT = BinaryOpType.OR_LITERAL;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected BinaryOpType operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftOperand()
   * @generated
   * @ordered
   */
  protected Assertion leftOperand = null;

  /**
   * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightOperand()
   * @generated
   * @ordered
   */
  protected Assertion rightOperand = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryOpAssertionImpl()
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
    return DeploytestPackage.Literals.BINARY_OP_ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryOpType getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(BinaryOpType newOperator)
  {
    BinaryOpType oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.BINARY_OP_ASSERTION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion getLeftOperand()
  {
    if (leftOperand != null && leftOperand.eIsProxy())
    {
      InternalEObject oldLeftOperand = (InternalEObject)leftOperand;
      leftOperand = (Assertion)eResolveProxy(oldLeftOperand);
      if (leftOperand != oldLeftOperand)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeploytestPackage.BINARY_OP_ASSERTION__LEFT_OPERAND, oldLeftOperand, leftOperand));
      }
    }
    return leftOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion basicGetLeftOperand()
  {
    return leftOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftOperand(Assertion newLeftOperand)
  {
    Assertion oldLeftOperand = leftOperand;
    leftOperand = newLeftOperand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.BINARY_OP_ASSERTION__LEFT_OPERAND, oldLeftOperand, leftOperand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion getRightOperand()
  {
    if (rightOperand != null && rightOperand.eIsProxy())
    {
      InternalEObject oldRightOperand = (InternalEObject)rightOperand;
      rightOperand = (Assertion)eResolveProxy(oldRightOperand);
      if (rightOperand != oldRightOperand)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeploytestPackage.BINARY_OP_ASSERTION__RIGHT_OPERAND, oldRightOperand,
                  rightOperand));
      }
    }
    return rightOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assertion basicGetRightOperand()
  {
    return rightOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightOperand(Assertion newRightOperand)
  {
    Assertion oldRightOperand = rightOperand;
    rightOperand = newRightOperand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.BINARY_OP_ASSERTION__RIGHT_OPERAND, oldRightOperand, rightOperand));
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
      case DeploytestPackage.BINARY_OP_ASSERTION__OPERATOR:
        return getOperator();
      case DeploytestPackage.BINARY_OP_ASSERTION__LEFT_OPERAND:
        if (resolve) return getLeftOperand();
        return basicGetLeftOperand();
      case DeploytestPackage.BINARY_OP_ASSERTION__RIGHT_OPERAND:
        if (resolve) return getRightOperand();
        return basicGetRightOperand();
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
      case DeploytestPackage.BINARY_OP_ASSERTION__OPERATOR:
        setOperator((BinaryOpType)newValue);
        return;
      case DeploytestPackage.BINARY_OP_ASSERTION__LEFT_OPERAND:
        setLeftOperand((Assertion)newValue);
        return;
      case DeploytestPackage.BINARY_OP_ASSERTION__RIGHT_OPERAND:
        setRightOperand((Assertion)newValue);
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
      case DeploytestPackage.BINARY_OP_ASSERTION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case DeploytestPackage.BINARY_OP_ASSERTION__LEFT_OPERAND:
        setLeftOperand((Assertion)null);
        return;
      case DeploytestPackage.BINARY_OP_ASSERTION__RIGHT_OPERAND:
        setRightOperand((Assertion)null);
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
      case DeploytestPackage.BINARY_OP_ASSERTION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case DeploytestPackage.BINARY_OP_ASSERTION__LEFT_OPERAND:
        return leftOperand != null;
      case DeploytestPackage.BINARY_OP_ASSERTION__RIGHT_OPERAND:
        return rightOperand != null;
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
    if (getOperator() == BinaryOpType.FALSE_LITERAL) return "false";
    if (getOperator() == BinaryOpType.TRUE_LITERAL) return "true";
    return (getLeftOperand() == null ? "?" : formatOperand(getLeftOperand())) + " "
            + getOperator().toString() + " "
            + (getRightOperand() == null ? "?" : formatOperand(getRightOperand()));
  }

  /**
   * @ADDED
   */
  protected String formatOperand(Assertion operand)
  {
    if (operand instanceof BinaryOpAssertion)
    {
      return "(" + operand.getDisplayLabel() + ")";
    }

    return operand.getDisplayLabel();
  }
} //BinaryOpAssertionImpl

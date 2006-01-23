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
package com.sympedia.density.gen.deploytest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Op Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getBinaryOpAssertion()
 * @model annotation="http://www.topcased.org/uuid uuid='1136016888140160'"
 * @generated
 */
public interface BinaryOpAssertion extends DerivedAssertion
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The default value is <code>"Or"</code>.
   * The literals are from the enumeration {@link com.sympedia.density.gen.deploytest.BinaryOpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.sympedia.density.gen.deploytest.BinaryOpType
   * @see #setOperator(BinaryOpType)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getBinaryOpAssertion_Operator()
   * @model default="Or"
   *        annotation="http://www.topcased.org/uuid uuid='1136018697046162'"
   * @generated
   */
  BinaryOpType getOperator();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.sympedia.density.gen.deploytest.BinaryOpType
   * @see #getOperator()
   * @generated
   */
  void setOperator(BinaryOpType value);

  /**
   * Returns the value of the '<em><b>Left Operand</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Operand</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Operand</em>' reference.
   * @see #setLeftOperand(Assertion)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getBinaryOpAssertion_LeftOperand()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136019022562172'"
   * @generated
   */
  Assertion getLeftOperand();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getLeftOperand <em>Left Operand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Operand</em>' reference.
   * @see #getLeftOperand()
   * @generated
   */
  void setLeftOperand(Assertion value);

  /**
   * Returns the value of the '<em><b>Right Operand</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Operand</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Operand</em>' reference.
   * @see #setRightOperand(Assertion)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getBinaryOpAssertion_RightOperand()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136019022562173'"
   * @generated
   */
  Assertion getRightOperand();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.BinaryOpAssertion#getRightOperand <em>Right Operand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Operand</em>' reference.
   * @see #getRightOperand()
   * @generated
   */
  void setRightOperand(Assertion value);

} // BinaryOpAssertion

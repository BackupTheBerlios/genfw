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
 * A representation of the model object '<em><b>Unary Op Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.UnaryOpAssertion#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.UnaryOpAssertion#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getUnaryOpAssertion()
 * @model annotation="http://www.topcased.org/uuid uuid='1136016888125159'"
 * @generated
 */
public interface UnaryOpAssertion extends DerivedAssertion
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * The default value is <code>"Not"</code>.
   * The literals are from the enumeration {@link com.sympedia.density.gen.deploytest.UnaryOpType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see com.sympedia.density.gen.deploytest.UnaryOpType
   * @see #setOperator(UnaryOpType)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getUnaryOpAssertion_Operator()
   * @model default="Not"
   *        annotation="http://www.topcased.org/uuid uuid='1136018697046162'"
   * @generated
   */
  UnaryOpType getOperator();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.UnaryOpAssertion#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see com.sympedia.density.gen.deploytest.UnaryOpType
   * @see #getOperator()
   * @generated
   */
  void setOperator(UnaryOpType value);

  /**
   * Returns the value of the '<em><b>Operand</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' reference.
   * @see #setOperand(Assertion)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getUnaryOpAssertion_Operand()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136019022562165'"
   * @generated
   */
  Assertion getOperand();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.UnaryOpAssertion#getOperand <em>Operand</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(Assertion value);

} // UnaryOpAssertion

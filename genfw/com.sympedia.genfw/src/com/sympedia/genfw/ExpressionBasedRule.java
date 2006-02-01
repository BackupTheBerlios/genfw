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
package com.sympedia.genfw;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Based Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.ExpressionBasedRule#getMatchExpression <em>Match Expression</em>}</li>
 *   <li>{@link com.sympedia.genfw.ExpressionBasedRule#getTargetPathExpression <em>Target Path Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getExpressionBasedRule()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='113672129781278'"
 * @generated
 */
public interface ExpressionBasedRule extends Rule
{
  /**
   * Returns the value of the '<em><b>Match Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match Expression</em>' attribute.
   * @see #setMatchExpression(String)
   * @see com.sympedia.genfw.GenfwPackage#getExpressionBasedRule_MatchExpression()
   * @model annotation="http://www.topcased.org/uuid uuid='113672129782879'"
   *        annotation="http://www.sympedia.com/2006/celleditor editor.id='com.sympedia.Multiline'"
   * @generated
   */
  String getMatchExpression();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.ExpressionBasedRule#getMatchExpression <em>Match Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match Expression</em>' attribute.
   * @see #getMatchExpression()
   * @generated
   */
  void setMatchExpression(String value);

  /**
   * Returns the value of the '<em><b>Target Path Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Path Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Path Expression</em>' attribute.
   * @see #setTargetPathExpression(String)
   * @see com.sympedia.genfw.GenfwPackage#getExpressionBasedRule_TargetPathExpression()
   * @model annotation="http://www.topcased.org/uuid uuid='113672129782880'"
   *        annotation="http://www.sympedia.com/2006/celleditor editor.id='com.sympedia.Multiline'"
   * @generated
   */
  String getTargetPathExpression();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.ExpressionBasedRule#getTargetPathExpression <em>Target Path Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Path Expression</em>' attribute.
   * @see #getTargetPathExpression()
   * @generated
   */
  void setTargetPathExpression(String value);

} // ExpressionBasedRule

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
package com.sympedia.genfw.bsh;


import com.sympedia.genfw.ExpressionBasedRule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Shell Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.bsh.BeanShellRule#getBootstrapCode <em>Bootstrap Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.bsh.BshPackage#getBeanShellRule()
 * @model annotation="http://www.topcased.org/uuid uuid='11372283250311'"
 * @generated
 */
public interface BeanShellRule extends ExpressionBasedRule
{
  /**
   * Returns the value of the '<em><b>Bootstrap Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bootstrap Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bootstrap Code</em>' attribute.
   * @see #setBootstrapCode(String)
   * @see com.sympedia.genfw.bsh.BshPackage#getBeanShellRule_BootstrapCode()
   * @model annotation="http://www.topcased.org/uuid uuid='11372283250312'"
   *        annotation="http://www.sympedia.com/2006/celleditor editor.id='com.sympedia.Multiline'"
   * @generated
   */
  String getBootstrapCode();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.bsh.BeanShellRule#getBootstrapCode <em>Bootstrap Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bootstrap Code</em>' attribute.
   * @see #getBootstrapCode()
   * @generated
   */
  void setBootstrapCode(String value);

} // BeanShellRule

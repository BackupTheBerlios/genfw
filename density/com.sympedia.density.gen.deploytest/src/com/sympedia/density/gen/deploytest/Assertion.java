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
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.Assertion#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAssertion()
 * @model annotation="http://www.topcased.org/uuid uuid='113597380548422'"
 * @generated
 */
public interface Assertion extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' container reference.
   * @see #setContainer(AssertionContainer)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAssertion_Container()
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getAssertions
   * @model opposite="assertions" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597380548423'"
   * @generated
   */
  AssertionContainer getContainer();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Assertion#getContainer <em>Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' container reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(AssertionContainer value);

} // Assertion

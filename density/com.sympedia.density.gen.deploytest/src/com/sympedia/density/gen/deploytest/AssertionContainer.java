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


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.AssertionContainer#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.AssertionContainer#getSuperContainer <em>Super Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.AssertionContainer#getSubContainers <em>Sub Containers</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.AssertionContainer#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.AssertionContainer#getAllAssertions <em>All Assertions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAssertionContainer()
 * @model annotation="http://www.topcased.org/uuid uuid='113597380546813'"
 * @generated
 */
public interface AssertionContainer extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Test Spec</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.TestSpec#getAssertionContainer <em>Assertion Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Spec</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Spec</em>' container reference.
   * @see #setTestSpec(TestSpec)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAssertionContainer_TestSpec()
   * @see com.sympedia.density.gen.deploytest.TestSpec#getAssertionContainer
   * @model opposite="assertionContainer"
   *        annotation="http://www.topcased.org/uuid uuid='113597380546815'"
   * @generated
   */
  TestSpec getTestSpec();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getTestSpec <em>Test Spec</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Spec</em>' container reference.
   * @see #getTestSpec()
   * @generated
   */
  void setTestSpec(TestSpec value);

  /**
   * Returns the value of the '<em><b>Super Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getSubContainers <em>Sub Containers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Container</em>' container reference.
   * @see #setSuperContainer(AssertionContainer)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAssertionContainer_SuperContainer()
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getSubContainers
   * @model opposite="subContainers"
   *        annotation="http://www.topcased.org/uuid uuid='113597380546816'"
   * @generated
   */
  AssertionContainer getSuperContainer();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getSuperContainer <em>Super Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Container</em>' container reference.
   * @see #getSuperContainer()
   * @generated
   */
  void setSuperContainer(AssertionContainer value);

  /**
   * Returns the value of the '<em><b>Sub Containers</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.AssertionContainer}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.AssertionContainer#getSuperContainer <em>Super Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Containers</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAssertionContainer_SubContainers()
   * @see com.sympedia.density.gen.deploytest.AssertionContainer#getSuperContainer
   * @model type="com.sympedia.density.gen.deploytest.AssertionContainer" opposite="superContainer" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597380546817'"
   * @generated
   */
  EList getSubContainers();

  /**
   * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Assertion}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Assertion#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAssertionContainer_Assertions()
   * @see com.sympedia.density.gen.deploytest.Assertion#getContainer
   * @model type="com.sympedia.density.gen.deploytest.Assertion" opposite="container" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597380546814'"
   * @generated
   */
  EList getAssertions();

  /**
   * Returns the value of the '<em><b>All Assertions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Assertion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Assertions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Assertions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAssertionContainer_AllAssertions()
   * @model type="com.sympedia.density.gen.deploytest.Assertion" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136979939590103'"
   * @generated
   */
  EList getAllAssertions();

} // AssertionContainer

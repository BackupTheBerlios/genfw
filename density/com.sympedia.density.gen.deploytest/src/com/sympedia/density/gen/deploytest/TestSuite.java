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
 * A representation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSuite#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSuite#getIncludedActions <em>Included Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSuite#getIncludedAssertions <em>Included Assertions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSuite#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestSuite#getIdPattern <em>Id Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSuite()
 * @model annotation="http://www.topcased.org/uuid uuid='1136028204046243'"
 * @generated
 */
public interface TestSuite extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Test Spec</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.TestSpec#getTestSuites <em>Test Suites</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Spec</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Spec</em>' container reference.
   * @see #setTestSpec(TestSpec)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSuite_TestSpec()
   * @see com.sympedia.density.gen.deploytest.TestSpec#getTestSuites
   * @model opposite="testSuites" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136028710812250'"
   * @generated
   */
  TestSpec getTestSpec();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestSuite#getTestSpec <em>Test Spec</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Spec</em>' container reference.
   * @see #getTestSpec()
   * @generated
   */
  void setTestSpec(TestSpec value);

  /**
   * Returns the value of the '<em><b>Included Actions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Actions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSuite_IncludedActions()
   * @model type="com.sympedia.density.gen.deploytest.Action"
   *        annotation="http://www.topcased.org/uuid uuid='1136031108156189'"
   * @generated
   */
  EList getIncludedActions();

  /**
   * Returns the value of the '<em><b>Included Assertions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Assertion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included Assertions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included Assertions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSuite_IncludedAssertions()
   * @model type="com.sympedia.density.gen.deploytest.Assertion"
   *        annotation="http://www.topcased.org/uuid uuid='1136031006109186'"
   * @generated
   */
  EList getIncludedAssertions();

  /**
   * Returns the value of the '<em><b>Test Cases</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Verification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Cases</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Cases</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSuite_TestCases()
   * @model type="com.sympedia.density.gen.deploytest.Verification" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136035732609198'"
   * @generated
   */
  EList getTestCases();

  /**
   * Returns the value of the '<em><b>Id Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id Pattern</em>' attribute.
   * @see #setIdPattern(String)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestSuite_IdPattern()
   * @model annotation="http://www.topcased.org/uuid uuid='1137054546890231'"
   * @generated
   */
  String getIdPattern();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestSuite#getIdPattern <em>Id Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id Pattern</em>' attribute.
   * @see #getIdPattern()
   * @generated
   */
  void setIdPattern(String value);

} // TestSuite

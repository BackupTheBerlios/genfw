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
 * A representation of the model object '<em><b>Test Case Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestCaseSpec#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestCaseSpec#getSpecSequence <em>Spec Sequence</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.TestCaseSpec#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestCaseSpec()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='113597473971892'"
 * @generated
 */
public interface TestCaseSpec extends IDisplayable
{
  /**
   * Returns the value of the '<em><b>Test Spec</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.TestSpec#getTestCaseSpecs <em>Test Case Specs</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Spec</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Spec</em>' container reference.
   * @see #setTestSpec(TestSpec)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestCaseSpec_TestSpec()
   * @see com.sympedia.density.gen.deploytest.TestSpec#getTestCaseSpecs
   * @model opposite="testCaseSpecs"
   *        annotation="http://www.topcased.org/uuid uuid='113597473971893'"
   * @generated
   */
  TestSpec getTestSpec();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.TestCaseSpec#getTestSpec <em>Test Spec</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Spec</em>' container reference.
   * @see #getTestSpec()
   * @generated
   */
  void setTestSpec(TestSpec value);

  /**
   * Returns the value of the '<em><b>Spec Sequence</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.TestCaseSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec Sequence</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec Sequence</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestCaseSpec_SpecSequence()
   * @model type="com.sympedia.density.gen.deploytest.TestCaseSpec" required="true" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136033188296129'"
   * @generated
   */
  EList getSpecSequence();

  /**
   * Returns the value of the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' reference.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getTestCaseSpec_Root()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1137045743765156'"
   * @generated
   */
  TestSpec getRoot();

} // TestCaseSpec

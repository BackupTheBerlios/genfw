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
 * A representation of the model object '<em><b>Initialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.Initialization#getInitializationActions <em>Initialization Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Initialization#getSuperInitialization <em>Super Initialization</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Initialization#getVerifications <em>Verifications</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Initialization#getSubInitializations <em>Sub Initializations</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Initialization#getExecutions <em>Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getInitialization()
 * @model annotation="http://www.topcased.org/uuid uuid='113597425729672'"
 * @generated
 */
public interface Initialization extends TestCaseSpec
{
  /**
   * Returns the value of the '<em><b>Initialization Actions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization Actions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getInitialization_InitializationActions()
   * @model type="com.sympedia.density.gen.deploytest.Action" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597473968776'"
   * @generated
   */
  EList getInitializationActions();

  /**
   * Returns the value of the '<em><b>Super Initialization</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Initialization#getSubInitializations <em>Sub Initializations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Initialization</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Initialization</em>' container reference.
   * @see #setSuperInitialization(Initialization)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getInitialization_SuperInitialization()
   * @see com.sympedia.density.gen.deploytest.Initialization#getSubInitializations
   * @model opposite="subInitializations"
   *        annotation="http://www.topcased.org/uuid uuid='113597587848490'"
   * @generated
   */
  Initialization getSuperInitialization();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Initialization#getSuperInitialization <em>Super Initialization</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Initialization</em>' container reference.
   * @see #getSuperInitialization()
   * @generated
   */
  void setSuperInitialization(Initialization value);

  /**
   * Returns the value of the '<em><b>Sub Initializations</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Initialization}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Initialization#getSuperInitialization <em>Super Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Initializations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Initializations</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getInitialization_SubInitializations()
   * @see com.sympedia.density.gen.deploytest.Initialization#getSuperInitialization
   * @model type="com.sympedia.density.gen.deploytest.Initialization" opposite="superInitialization" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597473968777'"
   * @generated
   */
  EList getSubInitializations();

  /**
   * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Execution}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Execution#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Executions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Executions</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getInitialization_Executions()
   * @see com.sympedia.density.gen.deploytest.Execution#getInitialization
   * @model type="com.sympedia.density.gen.deploytest.Execution" opposite="initialization" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597473970378'"
   * @generated
   */
  EList getExecutions();

  /**
   * Returns the value of the '<em><b>Verifications</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Verification}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Verification#getInitialization <em>Initialization</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verifications</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getInitialization_Verifications()
   * @see com.sympedia.density.gen.deploytest.Verification#getInitialization
   * @model type="com.sympedia.density.gen.deploytest.Verification" opposite="initialization" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597502770387'"
   * @generated
   */
  EList getVerifications();

} // Initialization

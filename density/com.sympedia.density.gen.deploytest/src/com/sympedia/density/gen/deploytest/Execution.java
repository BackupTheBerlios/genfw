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
 * A representation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.Execution#getExecutionActions <em>Execution Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Execution#getSuperExecution <em>Super Execution</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Execution#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Execution#getVerifications <em>Verifications</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Execution#getSubExecutions <em>Sub Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getExecution()
 * @model annotation="http://www.topcased.org/uuid uuid='113597425729673'"
 * @generated
 */
public interface Execution extends TestCaseSpec
{
  /**
   * Returns the value of the '<em><b>Execution Actions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execution Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution Actions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getExecution_ExecutionActions()
   * @model type="com.sympedia.density.gen.deploytest.Action" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597473970382'"
   * @generated
   */
  EList getExecutionActions();

  /**
   * Returns the value of the '<em><b>Super Execution</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Execution#getSubExecutions <em>Sub Executions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Execution</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Execution</em>' container reference.
   * @see #setSuperExecution(Execution)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getExecution_SuperExecution()
   * @see com.sympedia.density.gen.deploytest.Execution#getSubExecutions
   * @model opposite="subExecutions"
   *        annotation="http://www.topcased.org/uuid uuid='1135975878484106'"
   * @generated
   */
  Execution getSuperExecution();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Execution#getSuperExecution <em>Super Execution</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Execution</em>' container reference.
   * @see #getSuperExecution()
   * @generated
   */
  void setSuperExecution(Execution value);

  /**
   * Returns the value of the '<em><b>Sub Executions</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Execution}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Execution#getSuperExecution <em>Super Execution</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Executions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Executions</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getExecution_SubExecutions()
   * @see com.sympedia.density.gen.deploytest.Execution#getSuperExecution
   * @model type="com.sympedia.density.gen.deploytest.Execution" opposite="superExecution" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597473970383'"
   * @generated
   */
  EList getSubExecutions();

  /**
   * Returns the value of the '<em><b>Verifications</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Verification}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Verification#getExecution <em>Execution</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verifications</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getExecution_Verifications()
   * @see com.sympedia.density.gen.deploytest.Verification#getExecution
   * @model type="com.sympedia.density.gen.deploytest.Verification" opposite="execution" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597473970385'"
   * @generated
   */
  EList getVerifications();

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Initialization#getExecutions <em>Executions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' container reference.
   * @see #setInitialization(Initialization)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getExecution_Initialization()
   * @see com.sympedia.density.gen.deploytest.Initialization#getExecutions
   * @model opposite="executions"
   *        annotation="http://www.topcased.org/uuid uuid='113597473970384'"
   * @generated
   */
  Initialization getInitialization();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Execution#getInitialization <em>Initialization</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' container reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(Initialization value);

} // Execution

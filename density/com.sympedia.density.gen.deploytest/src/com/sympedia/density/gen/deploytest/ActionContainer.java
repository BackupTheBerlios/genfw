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
 * A representation of the model object '<em><b>Action Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.ActionContainer#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.ActionContainer#getSuperContainer <em>Super Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.ActionContainer#getSubContainers <em>Sub Containers</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.ActionContainer#getActions <em>Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.ActionContainer#getAllActions <em>All Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getActionContainer()
 * @model annotation="http://www.topcased.org/uuid uuid='11359738054538'"
 * @generated
 */
public interface ActionContainer extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Test Spec</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.TestSpec#getActionContainer <em>Action Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Spec</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Spec</em>' container reference.
   * @see #setTestSpec(TestSpec)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getActionContainer_TestSpec()
   * @see com.sympedia.density.gen.deploytest.TestSpec#getActionContainer
   * @model opposite="actionContainer"
   *        annotation="http://www.topcased.org/uuid uuid='113597380546810'"
   * @generated
   */
  TestSpec getTestSpec();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.ActionContainer#getTestSpec <em>Test Spec</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Spec</em>' container reference.
   * @see #getTestSpec()
   * @generated
   */
  void setTestSpec(TestSpec value);

  /**
   * Returns the value of the '<em><b>Super Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.ActionContainer#getSubContainers <em>Sub Containers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Container</em>' container reference.
   * @see #setSuperContainer(ActionContainer)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getActionContainer_SuperContainer()
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getSubContainers
   * @model opposite="subContainers"
   *        annotation="http://www.topcased.org/uuid uuid='113597380546811'"
   * @generated
   */
  ActionContainer getSuperContainer();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.ActionContainer#getSuperContainer <em>Super Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Container</em>' container reference.
   * @see #getSuperContainer()
   * @generated
   */
  void setSuperContainer(ActionContainer value);

  /**
   * Returns the value of the '<em><b>Sub Containers</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.ActionContainer}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.ActionContainer#getSuperContainer <em>Super Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Containers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Containers</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getActionContainer_SubContainers()
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getSuperContainer
   * @model type="com.sympedia.density.gen.deploytest.ActionContainer" opposite="superContainer" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597380546812'"
   * @generated
   */
  EList getSubContainers();

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Action}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Action#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getActionContainer_Actions()
   * @see com.sympedia.density.gen.deploytest.Action#getContainer
   * @model type="com.sympedia.density.gen.deploytest.Action" opposite="container" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='11359738054539'"
   * @generated
   */
  EList getActions();

  /**
   * Returns the value of the '<em><b>All Actions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Actions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Actions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getActionContainer_AllActions()
   * @model type="com.sympedia.density.gen.deploytest.Action" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113697993959081'"
   * @generated
   */
  EList getAllActions();

} // ActionContainer

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
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.Action#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAction()
 * @model annotation="http://www.topcased.org/uuid uuid='113597380548420'"
 * @generated
 */
public interface Action extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.ActionContainer#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' container reference.
   * @see #setContainer(ActionContainer)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getAction_Container()
   * @see com.sympedia.density.gen.deploytest.ActionContainer#getActions
   * @model opposite="actions" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597380548421'"
   * @generated
   */
  ActionContainer getContainer();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Action#getContainer <em>Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' container reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(ActionContainer value);

} // Action

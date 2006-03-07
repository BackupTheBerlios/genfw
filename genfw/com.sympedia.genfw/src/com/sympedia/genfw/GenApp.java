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


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.GenApp#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getGenApp()
 * @model annotation="http://www.topcased.org/uuid uuid='1136887070640172'"
 * @generated
 */
public interface GenApp extends GenLib
{
  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.Input}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.Input#getApp <em>App</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see com.sympedia.genfw.GenfwPackage#getGenApp_Inputs()
   * @see com.sympedia.genfw.Input#getApp
   * @model type="com.sympedia.genfw.Input" opposite="app" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136887070640173'"
   * @generated
   */
  EList getInputs();

} // GenApp

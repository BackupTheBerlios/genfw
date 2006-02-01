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


import com.sympedia.genfw.DomTransformation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Shell Transformation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.bsh.BeanShellTransformation#getTransformationCode <em>Transformation Code</em>}</li>
 *   <li>{@link com.sympedia.genfw.bsh.BeanShellTransformation#getBootstrapCode <em>Bootstrap Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.bsh.BshPackage#getBeanShellTransformation()
 * @model annotation="http://www.topcased.org/uuid uuid='113879626546712'"
 * @generated
 */
public interface BeanShellTransformation extends DomTransformation
{
  /**
   * Returns the value of the '<em><b>Transformation Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation Code</em>' attribute.
   * @see #setTransformationCode(String)
   * @see com.sympedia.genfw.bsh.BshPackage#getBeanShellTransformation_TransformationCode()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113879629165415'"
   * @generated
   */
  String getTransformationCode();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.bsh.BeanShellTransformation#getTransformationCode <em>Transformation Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformation Code</em>' attribute.
   * @see #getTransformationCode()
   * @generated
   */
  void setTransformationCode(String value);

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
   * @see com.sympedia.genfw.bsh.BshPackage#getBeanShellTransformation_BootstrapCode()
   * @model annotation="http://www.topcased.org/uuid uuid='113879666923218'"
   * @generated
   */
  String getBootstrapCode();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.bsh.BeanShellTransformation#getBootstrapCode <em>Bootstrap Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bootstrap Code</em>' attribute.
   * @see #getBootstrapCode()
   * @generated
   */
  void setBootstrapCode(String value);

} // BeanShellTransformationRule

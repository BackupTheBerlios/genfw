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
package com.sympedia.density.gen.deploy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.FloatParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getFloatParameter()
 * @model annotation="http://www.topcased.org/uuid uuid='113507788570341'"
 * @generated
 */
public interface FloatParameter extends Parameter
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(float)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getFloatParameter_Value()
   * @model annotation="http://www.topcased.org/uuid uuid='113507788570342'"
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.FloatParameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

} // FloatParameter

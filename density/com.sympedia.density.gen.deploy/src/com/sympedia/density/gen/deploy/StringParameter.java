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
 * A representation of the model object '<em><b>String Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.StringParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getStringParameter()
 * @model annotation="http://www.topcased.org/uuid uuid='113507788571847'"
 * @generated
 */
public interface StringParameter extends Parameter
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
   * @see #setValue(String)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getStringParameter_Value()
   * @model annotation="http://www.topcased.org/uuid uuid='113507788571848'"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.StringParameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // StringParameter

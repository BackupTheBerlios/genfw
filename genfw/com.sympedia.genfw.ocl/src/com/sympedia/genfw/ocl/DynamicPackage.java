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
package com.sympedia.genfw.ocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.ocl.DynamicPackage#getEcoreFile <em>Ecore File</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.ocl.OclPackage#getDynamicPackage()
 * @model annotation="http://www.topcased.org/uuid uuid='113868818687517'"
 * @generated
 */
public interface DynamicPackage extends PackageConfiguration
{
  /**
   * Returns the value of the '<em><b>Ecore File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ecore File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ecore File</em>' attribute.
   * @see #setEcoreFile(String)
   * @see com.sympedia.genfw.ocl.OclPackage#getDynamicPackage_EcoreFile()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113868829778130'"
   * @generated
   */
  String getEcoreFile();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.ocl.DynamicPackage#getEcoreFile <em>Ecore File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ecore File</em>' attribute.
   * @see #getEcoreFile()
   * @generated
   */
  void setEcoreFile(String value);

} // DynamicPackage

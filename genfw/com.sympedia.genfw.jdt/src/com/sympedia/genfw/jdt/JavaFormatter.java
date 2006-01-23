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
package com.sympedia.genfw.jdt;


import com.sympedia.genfw.DelegatingGenerator;

import com.sympedia.genfw.Generator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Formatter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jdt.JavaFormatter#getProfileFile <em>Profile File</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.jdt.JdtPackage#getJavaFormatter()
 * @model
 * @generated
 */
public interface JavaFormatter extends DelegatingGenerator
{
  /**
   * Returns the value of the '<em><b>Profile File</b></em>' attribute.
   * The default value is <code>"default"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Profile File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profile File</em>' attribute.
   * @see #setProfileFile(String)
   * @see com.sympedia.genfw.jdt.JdtPackage#getJavaFormatter_ProfileFile()
   * @model default="default"
   * @generated
   */
  String getProfileFile();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.jdt.JavaFormatter#getProfileFile <em>Profile File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile File</em>' attribute.
   * @see #getProfileFile()
   * @generated
   */
  void setProfileFile(String value);

} // JavaFormatter

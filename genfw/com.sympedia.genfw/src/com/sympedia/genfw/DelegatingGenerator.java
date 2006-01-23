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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegating Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.DelegatingGenerator#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getDelegatingGenerator()
 * @model abstract="true"
 * @generated
 */
public interface DelegatingGenerator extends Generator
{
  /**
   * Returns the value of the '<em><b>Delegate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delegate</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delegate</em>' reference.
   * @see #setDelegate(Generator)
   * @see com.sympedia.genfw.GenfwPackage#getDelegatingGenerator_Delegate()
   * @model required="true"
   * @generated
   */
  Generator getDelegate();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DelegatingGenerator#getDelegate <em>Delegate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delegate</em>' reference.
   * @see #getDelegate()
   * @generated
   */
  void setDelegate(Generator value);

} // DelegatingGenerator

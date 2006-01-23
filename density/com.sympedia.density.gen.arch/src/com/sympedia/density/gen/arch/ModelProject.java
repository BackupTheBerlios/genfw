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
package com.sympedia.density.gen.arch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.ModelProject#getModelName <em>Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.arch.ArchPackage#getModelProject()
 * @model
 * @generated
 */
public interface ModelProject extends PluginProject
{
  /**
   * Returns the value of the '<em><b>Model Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Name</em>' attribute.
   * @see #setModelName(String)
   * @see com.sympedia.density.gen.arch.ArchPackage#getModelProject_ModelName()
   * @model id="true" required="true"
   * @generated
   */
  String getModelName();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.arch.ModelProject#getModelName <em>Model Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Name</em>' attribute.
   * @see #getModelName()
   * @generated
   */
  void setModelName(String value);

} // ModelProject

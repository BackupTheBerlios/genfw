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


import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDisplayable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.IDisplayable#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.IDisplayable#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getIDisplayable()
 * @model interface="true" abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='1135976242671132'"
 * @generated
 */
public interface IDisplayable extends EObject
{
  /**
   * Returns the value of the '<em><b>Display Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Label</em>' attribute.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getIDisplayable_DisplayLabel()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1135977034484135'"
   * @generated
   */
  String getDisplayLabel();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getIDisplayable_Description()
   * @model annotation="http://www.topcased.org/uuid uuid='1135976511078144'"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.IDisplayable#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // IDisplayable

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
package com.sympedia.genfw.jmerge;


import com.sympedia.genfw.DelegatingGenerator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jmerge.Jmerger#getMergeXmlUri <em>Merge Xml Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.jmerge.JmergePackage#getJmerger()
 * @model
 * @generated
 */
public interface Jmerger extends DelegatingGenerator
{
  /**
   * Returns the value of the '<em><b>Merge Xml Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Merge Xml Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Merge Xml Uri</em>' attribute.
   * @see #setMergeXmlUri(String)
   * @see com.sympedia.genfw.jmerge.JmergePackage#getJmerger_MergeXmlUri()
   * @model
   * @generated
   */
  String getMergeXmlUri();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.jmerge.Jmerger#getMergeXmlUri <em>Merge Xml Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Merge Xml Uri</em>' attribute.
   * @see #getMergeXmlUri()
   * @generated
   */
  void setMergeXmlUri(String value);

} // JmergeGenerator

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
package com.sympedia.genfw.jet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bundle Jet Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jet.BundleJetGenerator#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.jet.BundleJetGenerator#getBundleId <em>Bundle Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.jet.JetPackage#getBundleJetGenerator()
 * @model annotation="http://www.topcased.org/uuid uuid='11374431968594'"
 * @generated
 */
public interface BundleJetGenerator extends JetGenerator
{
  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see com.sympedia.genfw.jet.JetPackage#getBundleJetGenerator_ClassName()
   * @model annotation="http://www.topcased.org/uuid uuid='11374431968595'"
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.jet.BundleJetGenerator#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Bundle Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bundle Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bundle Id</em>' attribute.
   * @see #setBundleId(String)
   * @see com.sympedia.genfw.jet.JetPackage#getBundleJetGenerator_BundleId()
   * @model annotation="http://www.topcased.org/uuid uuid='11374431968596'"
   * @generated
   */
  String getBundleId();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.jet.BundleJetGenerator#getBundleId <em>Bundle Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bundle Id</em>' attribute.
   * @see #getBundleId()
   * @generated
   */
  void setBundleId(String value);

} // BundleJetGenerator

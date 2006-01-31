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


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configurable Ocl Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.ocl.ConfigurableOclRule#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.ocl.OclPackage#getConfigurableOclRule()
 * @model annotation="http://www.topcased.org/uuid uuid='113868806912512'"
 * @generated
 */
public interface ConfigurableOclRule extends OclRule
{
  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.ocl.PackageConfiguration}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.ocl.PackageConfiguration#getOclRule <em>Ocl Rule</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see com.sympedia.genfw.ocl.OclPackage#getConfigurableOclRule_Packages()
   * @see com.sympedia.genfw.ocl.PackageConfiguration#getOclRule
   * @model type="com.sympedia.genfw.ocl.PackageConfiguration" opposite="oclRule" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113868822318715'"
   * @generated
   */
  EList getPackages();

} // ConfigurableOclRule

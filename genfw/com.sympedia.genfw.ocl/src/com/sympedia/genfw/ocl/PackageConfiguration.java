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


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.ocl.PackageConfiguration#getOclRule <em>Ocl Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.ocl.OclPackage#getPackageConfiguration()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='113868818687515'"
 * @generated
 */
public interface PackageConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Ocl Rule</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.ocl.ConfigurableOclRule#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ocl Rule</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ocl Rule</em>' container reference.
   * @see #setOclRule(ConfigurableOclRule)
   * @see com.sympedia.genfw.ocl.OclPackage#getPackageConfiguration_OclRule()
   * @see com.sympedia.genfw.ocl.ConfigurableOclRule#getPackages
   * @model opposite="packages" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113868822318722'"
   * @generated
   */
  ConfigurableOclRule getOclRule();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.ocl.PackageConfiguration#getOclRule <em>Ocl Rule</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ocl Rule</em>' container reference.
   * @see #getOclRule()
   * @generated
   */
  void setOclRule(ConfigurableOclRule value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation"
   *        annotation="http://www.topcased.org/uuid uuid='113868818687516'"
   * @generated
   */
  EPackage getPackage() throws Exception;

} // PackageConfiguration

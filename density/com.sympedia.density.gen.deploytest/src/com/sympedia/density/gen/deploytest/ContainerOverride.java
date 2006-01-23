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


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Override</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.ContainerOverride#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.ContainerOverride#getDeploymentOverrides <em>Deployment Overrides</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getContainerOverride()
 * @model annotation="http://www.topcased.org/uuid uuid='11359738054535'"
 * @generated
 */
public interface ContainerOverride extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Test Spec</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.TestSpec#getContainerOverrides <em>Container Overrides</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test Spec</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test Spec</em>' container reference.
   * @see #setTestSpec(TestSpec)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getContainerOverride_TestSpec()
   * @see com.sympedia.density.gen.deploytest.TestSpec#getContainerOverrides
   * @model opposite="containerOverrides" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='11359738054536'"
   * @generated
   */
  TestSpec getTestSpec();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.ContainerOverride#getTestSpec <em>Test Spec</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test Spec</em>' container reference.
   * @see #getTestSpec()
   * @generated
   */
  void setTestSpec(TestSpec value);

  /**
   * Returns the value of the '<em><b>Deployment Overrides</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.DeploymentOverride}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.DeploymentOverride#getContainerOverride <em>Container Override</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment Overrides</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment Overrides</em>' containment reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getContainerOverride_DeploymentOverrides()
   * @see com.sympedia.density.gen.deploytest.DeploymentOverride#getContainerOverride
   * @model type="com.sympedia.density.gen.deploytest.DeploymentOverride" opposite="containerOverride" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='11359738054537'"
   * @generated
   */
  EList getDeploymentOverrides();

} // ContainerOverride

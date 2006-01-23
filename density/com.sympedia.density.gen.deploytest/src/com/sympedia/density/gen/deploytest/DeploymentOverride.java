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


import com.sympedia.density.gen.deploy.Deployment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Override</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.DeploymentOverride#getContainerOverride <em>Container Override</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.DeploymentOverride#getDeploymentToOverride <em>Deployment To Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getDeploymentOverride()
 * @model annotation="http://www.topcased.org/uuid uuid='113597380548418'"
 * @generated
 */
public interface DeploymentOverride extends IDisplayable
{
  /**
   * Returns the value of the '<em><b>Container Override</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.ContainerOverride#getDeploymentOverrides <em>Deployment Overrides</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container Override</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Override</em>' container reference.
   * @see #setContainerOverride(ContainerOverride)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getDeploymentOverride_ContainerOverride()
   * @see com.sympedia.density.gen.deploytest.ContainerOverride#getDeploymentOverrides
   * @model opposite="deploymentOverrides" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597380548419'"
   * @generated
   */
  ContainerOverride getContainerOverride();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.DeploymentOverride#getContainerOverride <em>Container Override</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container Override</em>' container reference.
   * @see #getContainerOverride()
   * @generated
   */
  void setContainerOverride(ContainerOverride value);

  /**
   * Returns the value of the '<em><b>Deployment To Override</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment To Override</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment To Override</em>' reference.
   * @see #setDeploymentToOverride(Deployment)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getDeploymentOverride_DeploymentToOverride()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113601618790679'"
   * @generated
   */
  Deployment getDeploymentToOverride();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.DeploymentOverride#getDeploymentToOverride <em>Deployment To Override</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deployment To Override</em>' reference.
   * @see #getDeploymentToOverride()
   * @generated
   */
  void setDeploymentToOverride(Deployment value);

} // DeploymentOverride

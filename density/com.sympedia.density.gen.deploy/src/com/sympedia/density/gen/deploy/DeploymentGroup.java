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
package com.sympedia.density.gen.deploy;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.DeploymentGroup#getContainer <em>Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.DeploymentGroup#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.DeploymentGroup#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.DeploymentGroup#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.DeploymentGroup#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getDeploymentGroup()
 * @model annotation="http://www.topcased.org/uuid uuid='113507788567123'"
 * @generated
 */
public interface DeploymentGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Container#getDeploymentGroups <em>Deployment Groups</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' container reference.
   * @see #setContainer(Container)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeploymentGroup_Container()
   * @see com.sympedia.density.gen.deploy.Container#getDeploymentGroups
   * @model opposite="deploymentGroups"
   *        annotation="http://www.topcased.org/uuid uuid='113507788567124'"
   * @generated
   */
  Container getContainer();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getContainer <em>Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' container reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(Container value);

  /**
   * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.DeploymentGroup}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getSuperGroup <em>Super Group</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Groups</em>' containment reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeploymentGroup_SubGroups()
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getSuperGroup
   * @model type="com.sympedia.density.gen.deploy.DeploymentGroup" opposite="superGroup" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788567125'"
   * @generated
   */
  EList getSubGroups();

  /**
   * Returns the value of the '<em><b>Super Group</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getSubGroups <em>Sub Groups</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Group</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Group</em>' container reference.
   * @see #setSuperGroup(DeploymentGroup)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeploymentGroup_SuperGroup()
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getSubGroups
   * @model opposite="subGroups"
   *        annotation="http://www.topcased.org/uuid uuid='113507788567126'"
   * @generated
   */
  DeploymentGroup getSuperGroup();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getSuperGroup <em>Super Group</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Group</em>' container reference.
   * @see #getSuperGroup()
   * @generated
   */
  void setSuperGroup(DeploymentGroup value);

  /**
   * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.Deployment}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Deployment#getDeploymentGroup <em>Deployment Group</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployments</em>' containment reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeploymentGroup_Deployments()
   * @see com.sympedia.density.gen.deploy.Deployment#getDeploymentGroup
   * @model type="com.sympedia.density.gen.deploy.Deployment" opposite="deploymentGroup" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788567127'"
   * @generated
   */
  EList getDeployments();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeploymentGroup_Name()
   * @model annotation="http://www.topcased.org/uuid uuid='113507788567128'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // DeploymentGroup

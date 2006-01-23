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
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.Container#getName <em>Name</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Container#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Container#isIncomplete <em>Incomplete</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Container#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Container#getDeploymentGroups <em>Deployment Groups</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Container#getAllDeployments <em>All Deployments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getContainer()
 * @model annotation="http://www.topcased.org/uuid uuid='11350778856251'"
 * @generated
 */
public interface Container extends EObject
{
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
   * @see com.sympedia.density.gen.deploy.DeployPackage#getContainer_Name()
   * @model annotation="http://www.topcased.org/uuid uuid='11350778856252'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Container#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getContainer_PackageName()
   * @model annotation="http://www.topcased.org/uuid uuid='11350778856253'"
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Container#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Incomplete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Incomplete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Incomplete</em>' attribute.
   * @see #setIncomplete(boolean)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getContainer_Incomplete()
   * @model annotation="http://www.topcased.org/uuid uuid='11350778856254'"
   * @generated
   */
  boolean isIncomplete();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Container#isIncomplete <em>Incomplete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Incomplete</em>' attribute.
   * @see #isIncomplete()
   * @generated
   */
  void setIncomplete(boolean value);

  /**
   * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.Deployment}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Deployment#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployments</em>' containment reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getContainer_Deployments()
   * @see com.sympedia.density.gen.deploy.Deployment#getContainer
   * @model type="com.sympedia.density.gen.deploy.Deployment" opposite="container" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='11350778856255'"
   * @generated
   */
  EList getDeployments();

  /**
   * Returns the value of the '<em><b>Deployment Groups</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.DeploymentGroup}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment Groups</em>' containment reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getContainer_DeploymentGroups()
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getContainer
   * @model type="com.sympedia.density.gen.deploy.DeploymentGroup" opposite="container" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='11350778856256'"
   * @generated
   */
  EList getDeploymentGroups();

  /**
   * Returns the value of the '<em><b>All Deployments</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.Deployment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Deployments</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Deployments</em>' reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getContainer_AllDeployments()
   * @model type="com.sympedia.density.gen.deploy.Deployment" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='11350778856407'"
   * @generated
   */
  EList getAllDeployments();

} // Container

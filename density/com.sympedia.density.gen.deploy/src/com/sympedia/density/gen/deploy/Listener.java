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


import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.Listener#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Listener#getNotifier <em>Notifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getListener()
 * @model annotation="http://www.topcased.org/uuid uuid='113507788573455'"
 * @generated
 */
public interface Listener extends EObject
{
  /**
   * Returns the value of the '<em><b>Deployment</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Deployment#getListeners <em>Listeners</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment</em>' container reference.
   * @see #setDeployment(Deployment)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getListener_Deployment()
   * @see com.sympedia.density.gen.deploy.Deployment#getListeners
   * @model opposite="listeners" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788573456'"
   * @generated
   */
  Deployment getDeployment();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Listener#getDeployment <em>Deployment</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deployment</em>' container reference.
   * @see #getDeployment()
   * @generated
   */
  void setDeployment(Deployment value);

  /**
   * Returns the value of the '<em><b>Notifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notifier</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notifier</em>' reference.
   * @see #setNotifier(Deployment)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getListener_Notifier()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788573457'"
   * @generated
   */
  Deployment getNotifier();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Listener#getNotifier <em>Notifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notifier</em>' reference.
   * @see #getNotifier()
   * @generated
   */
  void setNotifier(Deployment value);

} // Listener

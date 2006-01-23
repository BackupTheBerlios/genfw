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
import org.eclipse.emf.ecore.EStructuralFeature;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.Dependency#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Dependency#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getDependency()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='113507788568731'"
 * @generated
 */
public interface Dependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(EStructuralFeature)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDependency_Feature()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788568732'"
   * @generated
   */
  EStructuralFeature getFeature();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Dependency#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(EStructuralFeature value);

  /**
   * Returns the value of the '<em><b>Deployment</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Deployment#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment</em>' container reference.
   * @see #setDeployment(Deployment)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDependency_Deployment()
   * @see com.sympedia.density.gen.deploy.Deployment#getDependencies
   * @model opposite="dependencies" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788568733'"
   * @generated
   */
  Deployment getDeployment();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Dependency#getDeployment <em>Deployment</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deployment</em>' container reference.
   * @see #getDeployment()
   * @generated
   */
  void setDeployment(Deployment value);

} // Dependency

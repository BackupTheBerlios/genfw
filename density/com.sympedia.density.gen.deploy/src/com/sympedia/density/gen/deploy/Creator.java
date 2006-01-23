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
import org.eclipse.emf.ecore.EOperation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.Creator#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Creator#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Creator#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getCreator()
 * @model annotation="http://www.topcased.org/uuid uuid='113507788571851'"
 * @generated
 */
public interface Creator extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' reference.
   * @see #setOperation(EOperation)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getCreator_Operation()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788571852'"
   * @generated
   */
  EOperation getOperation();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Creator#getOperation <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' reference.
   * @see #getOperation()
   * @generated
   */
  void setOperation(EOperation value);

  /**
   * Returns the value of the '<em><b>Deployment</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Deployment#getCreators <em>Creators</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment</em>' container reference.
   * @see #setDeployment(Deployment)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getCreator_Deployment()
   * @see com.sympedia.density.gen.deploy.Deployment#getCreators
   * @model opposite="creators" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788573453'"
   * @generated
   */
  Deployment getDeployment();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Creator#getDeployment <em>Deployment</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deployment</em>' container reference.
   * @see #getDeployment()
   * @generated
   */
  void setDeployment(Deployment value);

  /**
   * Returns the value of the '<em><b>Product</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product</em>' reference.
   * @see #setProduct(Deployment)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getCreator_Product()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788573454'"
   * @generated
   */
  Deployment getProduct();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Creator#getProduct <em>Product</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product</em>' reference.
   * @see #getProduct()
   * @generated
   */
  void setProduct(Deployment value);

} // Creator

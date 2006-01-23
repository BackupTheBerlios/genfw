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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.Reference#getTarget <em>Target</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Reference#isListen <em>Listen</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getReference()
 * @model annotation="http://www.topcased.org/uuid uuid='113507788568734'"
 * @generated
 */
public interface Reference extends Dependency
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Deployment)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getReference_Target()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788568735'"
   * @generated
   */
  Deployment getTarget();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Reference#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Deployment value);

  /**
   * Returns the value of the '<em><b>Listen</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listen</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listen</em>' attribute.
   * @see #setListen(boolean)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getReference_Listen()
   * @model default="false"
   *        annotation="http://www.topcased.org/uuid uuid='113507788568736'"
   * @generated
   */
  boolean isListen();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Reference#isListen <em>Listen</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Listen</em>' attribute.
   * @see #isListen()
   * @generated
   */
  void setListen(boolean value);

} // Reference

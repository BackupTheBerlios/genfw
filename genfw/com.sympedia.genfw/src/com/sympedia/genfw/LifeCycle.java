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
package com.sympedia.genfw;


import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.sympedia.genfw.GenfwPackage#getLifeCycle()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='1138872040968290'"
 * @generated
 */
public interface LifeCycle extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model genappAnnotation="http://www.topcased.org/uuid uuid='113887234659333'"
   *        annotation="http://www.topcased.org/uuid uuid='1138872040968291'"
   * @generated
   */
  void initialize(GenApp genapp) throws Exception;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model genappAnnotation="http://www.topcased.org/uuid uuid='113887234659337'"
   *        annotation="http://www.topcased.org/uuid uuid='1138872040968292'"
   * @generated
   */
  void dispose(GenApp genapp);

} // LifeCycle

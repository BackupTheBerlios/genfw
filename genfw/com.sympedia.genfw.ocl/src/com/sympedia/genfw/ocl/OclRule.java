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


import com.sympedia.genfw.ExpressionBasedRule;

import org.eclipse.emf.ecore.EPackage.Registry;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.sympedia.genfw.ocl.OclPackage#getOclRule()
 * @model annotation="http://www.topcased.org/uuid uuid='11386876143283'"
 * @generated
 */
public interface OclRule extends ExpressionBasedRule
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" dataType="com.sympedia.genfw.ocl.EPackageRegistry"
   *        annotation="http://www.topcased.org/uuid uuid='11386877979216'"
   * @generated
   */
  Registry getPackageRegistry() throws Exception;

} // OclRule

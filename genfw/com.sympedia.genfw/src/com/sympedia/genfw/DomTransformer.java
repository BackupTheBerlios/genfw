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


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dom Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getDomTransformer()
 * @model annotation="http://www.topcased.org/uuid uuid='1138792484562225'"
 * @generated
 */
public interface DomTransformer extends Generator
{
  /**
   * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.DomTransformation}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.DomTransformation#getTransformer <em>Transformer</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformations</em>' containment reference list.
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_Transformations()
   * @see com.sympedia.genfw.DomTransformation#getTransformer
   * @model type="com.sympedia.genfw.DomTransformation" opposite="transformer" containment="true" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1138792632343228'"
   * @generated
   */
  EList getTransformations();

} // DomTransformer

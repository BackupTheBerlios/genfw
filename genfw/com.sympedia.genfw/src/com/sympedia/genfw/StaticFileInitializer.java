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
 * A representation of the model object '<em><b>Static File Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.StaticFileInitializer#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getStaticFileInitializer()
 * @model annotation="http://www.topcased.org/uuid uuid='1138788227656133'"
 * @generated
 */
public interface StaticFileInitializer extends Generator
{
  /**
   * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.Line}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.Line#getStaticFileInitializer <em>Static File Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lines</em>' containment reference list.
   * @see com.sympedia.genfw.GenfwPackage#getStaticFileInitializer_Lines()
   * @see com.sympedia.genfw.Line#getStaticFileInitializer
   * @model type="com.sympedia.genfw.Line" opposite="staticFileInitializer" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='1138788227656134'"
   * @generated
   */
  EList getLines();

} // StaticFileInitializer

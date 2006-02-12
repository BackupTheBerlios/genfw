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
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.Line#getContent <em>Content</em>}</li>
 *   <li>{@link com.sympedia.genfw.Line#getStaticFileInitializer <em>Static File Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getLine()
 * @model annotation="http://www.topcased.org/uuid uuid='1138788227656135'"
 * @generated
 */
public interface Line extends EObject
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see com.sympedia.genfw.GenfwPackage#getLine_Content()
   * @model annotation="http://www.topcased.org/uuid uuid='1138788227656136'"
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Line#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

  /**
   * Returns the value of the '<em><b>Static File Initializer</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.StaticFileInitializer#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static File Initializer</em>' container reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static File Initializer</em>' container reference.
   * @see #setStaticFileInitializer(StaticFileInitializer)
   * @see com.sympedia.genfw.GenfwPackage#getLine_StaticFileInitializer()
   * @see com.sympedia.genfw.StaticFileInitializer#getLines
   * @model opposite="lines" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1138788227656137'"
   * @generated
   */
  StaticFileInitializer getStaticFileInitializer();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Line#getStaticFileInitializer <em>Static File Initializer</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static File Initializer</em>' container reference.
   * @see #getStaticFileInitializer()
   * @generated
   */
  void setStaticFileInitializer(StaticFileInitializer value);

} // Line

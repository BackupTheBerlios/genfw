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

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.ContentProvider#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.genfw.ContentProvider#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getContentProvider()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='113671546137560'"
 * @generated
 */
public interface ContentProvider extends EObject
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.GenLib#getContentProviders <em>Content Providers</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' container reference.
   * @see #setRoot(GenLib)
   * @see com.sympedia.genfw.GenfwPackage#getContentProvider_Root()
   * @see com.sympedia.genfw.GenLib#getContentProviders
   * @model opposite="contentProviders" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113672221104652'"
   * @generated
   */
  GenLib getRoot();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.ContentProvider#getRoot <em>Root</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' container reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(GenLib value);

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
   * @see com.sympedia.genfw.GenfwPackage#getContentProvider_Name()
   * @model id="true" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113878822765645'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.ContentProvider#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="com.sympedia.genfw.JavaList" many="false" pathAnnotation="http://www.topcased.org/uuid uuid='113671579192166'"
   *        annotation="http://www.topcased.org/uuid uuid='113671546137561'"
   * @generated
   */
  List getRoots(String path) throws Exception;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="com.sympedia.genfw.JavaList" many="false" objectAnnotation="http://www.topcased.org/uuid uuid='113671579193768'"
   *        annotation="http://www.topcased.org/uuid uuid='113671579192167'"
   * @generated
   */
  List getChildren(Object object) throws Exception;

} // ContentProvider

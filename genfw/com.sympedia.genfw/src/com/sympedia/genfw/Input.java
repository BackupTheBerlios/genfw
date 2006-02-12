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
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.Input#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.genfw.Input#getLabel <em>Label</em>}</li>
 *   <li>{@link com.sympedia.genfw.Input#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link com.sympedia.genfw.Input#getContentProvider <em>Content Provider</em>}</li>
 *   <li>{@link com.sympedia.genfw.Input#getRuleSets <em>Rule Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getInput()
 * @model annotation="http://www.topcased.org/uuid uuid='11367080429534'"
 * @generated
 */
public interface Input extends LifeCycle
{
  /**
   * Returns the value of the '<em><b>Content Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content Provider</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content Provider</em>' reference.
   * @see #setContentProvider(ContentProvider)
   * @see com.sympedia.genfw.GenfwPackage#getInput_ContentProvider()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113671857948412'"
   * @generated
   */
  ContentProvider getContentProvider();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Input#getContentProvider <em>Content Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content Provider</em>' reference.
   * @see #getContentProvider()
   * @generated
   */
  void setContentProvider(ContentProvider value);

  /**
   * Returns the value of the '<em><b>Rule Sets</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.genfw.RuleSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Sets</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Sets</em>' reference list.
   * @see com.sympedia.genfw.GenfwPackage#getInput_RuleSets()
   * @model type="com.sympedia.genfw.RuleSet" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='11367219081719'"
   * @generated
   */
  EList getRuleSets();

  /**
   * Returns the value of the '<em><b>Root</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.GenApp#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' container reference.
   * @see #setRoot(GenApp)
   * @see com.sympedia.genfw.GenfwPackage#getInput_Root()
   * @see com.sympedia.genfw.GenApp#getInputs
   * @model opposite="inputs"
   *        annotation="http://www.topcased.org/uuid uuid='1136887070625153'"
   * @generated
   */
  GenApp getRoot();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Input#getRoot <em>Root</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' container reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(GenApp value);

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see com.sympedia.genfw.GenfwPackage#getInput_Label()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136894756921162'"
   * @generated
   */
  String getLabel();

  /**
   * Returns the value of the '<em><b>Full Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Full Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Full Path</em>' attribute.
   * @see #setFullPath(String)
   * @see com.sympedia.genfw.GenfwPackage#getInput_FullPath()
   * @model annotation="http://www.topcased.org/uuid uuid='113678603343715'"
   * @generated
   */
  String getFullPath();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Input#getFullPath <em>Full Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Full Path</em>' attribute.
   * @see #getFullPath()
   * @generated
   */
  void setFullPath(String value);

} // Input

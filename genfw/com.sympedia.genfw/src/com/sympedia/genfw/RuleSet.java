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
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.RuleSet#getRules <em>Rules</em>}</li>
 *   <li>{@link com.sympedia.genfw.RuleSet#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.genfw.RuleSet#getName <em>Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.RuleSet#isDeactivate <em>Deactivate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getRuleSet()
 * @model annotation="http://www.topcased.org/uuid uuid='113672173296897'"
 * @generated
 */
public interface RuleSet extends LifeCycle
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.Rule}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.Rule#getRuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see com.sympedia.genfw.GenfwPackage#getRuleSet_Rules()
   * @see com.sympedia.genfw.Rule#getRuleSet
   * @model type="com.sympedia.genfw.Rule" opposite="ruleSet" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113672173296898'"
   * @generated
   */
  EList getRules();

  /**
   * Returns the value of the '<em><b>Root</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.GenLib#getRuleSets <em>Rule Sets</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' container reference.
   * @see #setRoot(GenLib)
   * @see com.sympedia.genfw.GenfwPackage#getRuleSet_Root()
   * @see com.sympedia.genfw.GenLib#getRuleSets
   * @model opposite="ruleSets" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136722211046105'"
   * @generated
   */
  GenLib getRoot();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.RuleSet#getRoot <em>Root</em>}' container reference.
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
   * @see com.sympedia.genfw.GenfwPackage#getRuleSet_Name()
   * @model id="true" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136786719500114'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.RuleSet#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Deactivate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deactivate</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deactivate</em>' attribute.
   * @see #setDeactivate(boolean)
   * @see com.sympedia.genfw.GenfwPackage#getRuleSet_Deactivate()
   * @model id="true"
   *        annotation="http://www.topcased.org/uuid uuid='113878822765664'"
   * @generated
   */
  boolean isDeactivate();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.RuleSet#isDeactivate <em>Deactivate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deactivate</em>' attribute.
   * @see #isDeactivate()
   * @generated
   */
  void setDeactivate(boolean value);

} // RuleSet

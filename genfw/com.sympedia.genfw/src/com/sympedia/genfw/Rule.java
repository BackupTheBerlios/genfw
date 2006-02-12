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
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.Rule#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link com.sympedia.genfw.Rule#getName <em>Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.Rule#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link com.sympedia.genfw.Rule#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.sympedia.genfw.Rule#getMatchClassName <em>Match Class Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.Rule#isDontOverwrite <em>Dont Overwrite</em>}</li>
 *   <li>{@link com.sympedia.genfw.Rule#isDeactivate <em>Deactivate</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getRule()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='113672105539064'"
 * @generated
 */
public interface Rule extends LifeCycle
{
  /**
   * Returns the value of the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generator</em>' reference.
   * @see #setGenerator(Generator)
   * @see com.sympedia.genfw.GenfwPackage#getRule_Generator()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113672135642172'"
   * @generated
   */
  Generator getGenerator();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Rule#getGenerator <em>Generator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generator</em>' reference.
   * @see #getGenerator()
   * @generated
   */
  void setGenerator(Generator value);

  /**
   * Returns the value of the '<em><b>Rule Set</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.RuleSet#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Set</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Set</em>' container reference.
   * @see #setRuleSet(RuleSet)
   * @see com.sympedia.genfw.GenfwPackage#getRule_RuleSet()
   * @see com.sympedia.genfw.RuleSet#getRules
   * @model opposite="rules" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113672173295375'"
   * @generated
   */
  RuleSet getRuleSet();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Rule#getRuleSet <em>Rule Set</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule Set</em>' container reference.
   * @see #getRuleSet()
   * @generated
   */
  void setRuleSet(RuleSet value);

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
   * @see com.sympedia.genfw.GenfwPackage#getRule_Name()
   * @model id="true" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113878822765683'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prerequisites</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.genfw.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prerequisites</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prerequisites</em>' reference list.
   * @see com.sympedia.genfw.GenfwPackage#getRule_Prerequisites()
   * @model type="com.sympedia.genfw.Rule"
   *        annotation="http://www.topcased.org/uuid uuid='113878822765684'"
   * @generated
   */
  EList getPrerequisites();

  /**
   * Returns the value of the '<em><b>Match Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Match Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Match Class Name</em>' attribute.
   * @see #setMatchClassName(String)
   * @see com.sympedia.genfw.GenfwPackage#getRule_MatchClassName()
   * @model annotation="http://www.topcased.org/uuid uuid='113716997982888'"
   * @generated
   */
  String getMatchClassName();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Rule#getMatchClassName <em>Match Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Match Class Name</em>' attribute.
   * @see #getMatchClassName()
   * @generated
   */
  void setMatchClassName(String value);

  /**
   * Returns the value of the '<em><b>Dont Overwrite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dont Overwrite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dont Overwrite</em>' attribute.
   * @see #setDontOverwrite(boolean)
   * @see com.sympedia.genfw.GenfwPackage#getRule_DontOverwrite()
   * @model id="true"
   *        annotation="http://www.topcased.org/uuid uuid='113878822765691'"
   * @generated
   */
  boolean isDontOverwrite();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Rule#isDontOverwrite <em>Dont Overwrite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dont Overwrite</em>' attribute.
   * @see #isDontOverwrite()
   * @generated
   */
  void setDontOverwrite(boolean value);

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
   * @see com.sympedia.genfw.GenfwPackage#getRule_Deactivate()
   * @model id="true"
   *        annotation="http://www.topcased.org/uuid uuid='113878822765692'"
   * @generated
   */
  boolean isDeactivate();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Rule#isDeactivate <em>Deactivate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deactivate</em>' attribute.
   * @see #isDeactivate()
   * @generated
   */
  void setDeactivate(boolean value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model inputObjectAnnotation="http://www.topcased.org/uuid uuid='113672289210960'"
   *        annotation="http://www.topcased.org/uuid uuid='113672105540665'"
   * @generated
   */
  boolean isMatching(Object inputObject) throws Exception;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model inputObjectAnnotation="http://www.topcased.org/uuid uuid='113672289210964'"
   *        annotation="http://www.topcased.org/uuid uuid='113672120854669'"
   * @generated
   */
  String getTargetPath(Object inputObject) throws Exception;

} // Rule

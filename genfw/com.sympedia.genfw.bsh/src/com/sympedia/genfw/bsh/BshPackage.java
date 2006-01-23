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
package com.sympedia.genfw.bsh;


import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.bsh.BshFactory
 * @model kind="package"
 *        annotation="http://www.topcased.org/uuid uuid='11372283250310'"
 * @generated
 */
public interface BshPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bsh";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sympedia.com/2006/genfw/bsh";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.sympedia.genfw.bsh";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BshPackage eINSTANCE = com.sympedia.genfw.bsh.impl.BshPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sympedia.genfw.bsh.impl.BeanShellRuleImpl <em>Bean Shell Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.bsh.impl.BeanShellRuleImpl
   * @see com.sympedia.genfw.bsh.impl.BshPackageImpl#getBeanShellRule()
   * @generated
   */
  int BEAN_SHELL_RULE = 0;

  /**
   * The feature id for the '<em><b>Rule Set</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_SHELL_RULE__RULE_SET = GenfwPackage.EXPRESSION_BASED_RULE__RULE_SET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_SHELL_RULE__NAME = GenfwPackage.EXPRESSION_BASED_RULE__NAME;

  /**
   * The feature id for the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_SHELL_RULE__GENERATOR = GenfwPackage.EXPRESSION_BASED_RULE__GENERATOR;

  /**
   * The feature id for the '<em><b>Match Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_SHELL_RULE__MATCH_CLASS_NAME = GenfwPackage.EXPRESSION_BASED_RULE__MATCH_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Match Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_SHELL_RULE__MATCH_EXPRESSION = GenfwPackage.EXPRESSION_BASED_RULE__MATCH_EXPRESSION;

  /**
   * The feature id for the '<em><b>Target Path Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_SHELL_RULE__TARGET_PATH_EXPRESSION = GenfwPackage.EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION;

  /**
   * The feature id for the '<em><b>Bootstrap Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_SHELL_RULE__BOOTSTRAP_CODE = GenfwPackage.EXPRESSION_BASED_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bean Shell Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_SHELL_RULE_FEATURE_COUNT = GenfwPackage.EXPRESSION_BASED_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '<em>Interpreter</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see bsh.Interpreter
   * @see com.sympedia.genfw.bsh.impl.BshPackageImpl#getBshInterpreter()
   * @generated
   */
  int BSH_INTERPRETER = 1;

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.bsh.BeanShellRule <em>Bean Shell Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bean Shell Rule</em>'.
   * @see com.sympedia.genfw.bsh.BeanShellRule
   * @generated
   */
  EClass getBeanShellRule();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.bsh.BeanShellRule#getBootstrapCode <em>Bootstrap Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bootstrap Code</em>'.
   * @see com.sympedia.genfw.bsh.BeanShellRule#getBootstrapCode()
   * @see #getBeanShellRule()
   * @generated
   */
  EAttribute getBeanShellRule_BootstrapCode();

  /**
   * Returns the meta object for data type '{@link bsh.Interpreter <em>Interpreter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Interpreter</em>'.
   * @see bsh.Interpreter
   * @model instanceClass="bsh.Interpreter"
   *        annotation="http://www.topcased.org/uuid uuid='11372283250313'" 
   * @generated
   */
  EDataType getBshInterpreter();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BshFactory getBshFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sympedia.genfw.bsh.impl.BeanShellRuleImpl <em>Bean Shell Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.bsh.impl.BeanShellRuleImpl
     * @see com.sympedia.genfw.bsh.impl.BshPackageImpl#getBeanShellRule()
     * @generated
     */
    EClass BEAN_SHELL_RULE = eINSTANCE.getBeanShellRule();

    /**
     * The meta object literal for the '<em><b>Bootstrap Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_SHELL_RULE__BOOTSTRAP_CODE = eINSTANCE.getBeanShellRule_BootstrapCode();

    /**
     * The meta object literal for the '<em>Interpreter</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see bsh.Interpreter
     * @see com.sympedia.genfw.bsh.impl.BshPackageImpl#getBshInterpreter()
     * @generated
     */
    EDataType BSH_INTERPRETER = eINSTANCE.getBshInterpreter();

  }

} //BshPackage

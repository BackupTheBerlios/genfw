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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;


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
 * @see com.sympedia.genfw.GenfwFactory
 * @model kind="package"
 *        annotation="http://www.topcased.org/uuid uuid='11367080429370'"
 * @generated
 */
public interface GenfwPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "genfw";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sympedia.com/2006/genfw";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.sympedia.genfw";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenfwPackage eINSTANCE = com.sympedia.genfw.impl.GenfwPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.GenLibImpl <em>Gen Lib</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.GenLibImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getGenLib()
   * @generated
   */
  int GEN_LIB = 0;

  /**
   * The feature id for the '<em><b>Content Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_LIB__CONTENT_PROVIDERS = 0;

  /**
   * The feature id for the '<em><b>Generators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_LIB__GENERATORS = 1;

  /**
   * The feature id for the '<em><b>Rule Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_LIB__RULE_SETS = 2;

  /**
   * The number of structural features of the '<em>Gen Lib</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_LIB_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.GenAppImpl <em>Gen App</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.GenAppImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getGenApp()
   * @generated
   */
  int GEN_APP = 1;

  /**
   * The feature id for the '<em><b>Content Providers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_APP__CONTENT_PROVIDERS = GEN_LIB__CONTENT_PROVIDERS;

  /**
   * The feature id for the '<em><b>Generators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_APP__GENERATORS = GEN_LIB__GENERATORS;

  /**
   * The feature id for the '<em><b>Rule Sets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_APP__RULE_SETS = GEN_LIB__RULE_SETS;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_APP__INPUTS = GEN_LIB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Gen App</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GEN_APP_FEATURE_COUNT = GEN_LIB_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.LifeCycleImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getLifeCycle()
   * @generated
   */
  int LIFE_CYCLE = 2;

  /**
   * The number of structural features of the '<em>Life Cycle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFE_CYCLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.ContentProviderImpl <em>Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.ContentProviderImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getContentProvider()
   * @generated
   */
  int CONTENT_PROVIDER = 3;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__ROOT = LIFE_CYCLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER__NAME = LIFE_CYCLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_PROVIDER_FEATURE_COUNT = LIFE_CYCLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.EcoreContentProviderImpl <em>Ecore Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.EcoreContentProviderImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getEcoreContentProvider()
   * @generated
   */
  int ECORE_CONTENT_PROVIDER = 4;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_CONTENT_PROVIDER__ROOT = CONTENT_PROVIDER__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_CONTENT_PROVIDER__NAME = CONTENT_PROVIDER__NAME;

  /**
   * The number of structural features of the '<em>Ecore Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_CONTENT_PROVIDER_FEATURE_COUNT = CONTENT_PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.PropertiesContentProviderImpl <em>Properties Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.PropertiesContentProviderImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getPropertiesContentProvider()
   * @generated
   */
  int PROPERTIES_CONTENT_PROVIDER = 5;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_CONTENT_PROVIDER__ROOT = CONTENT_PROVIDER__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_CONTENT_PROVIDER__NAME = CONTENT_PROVIDER__NAME;

  /**
   * The number of structural features of the '<em>Properties Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIES_CONTENT_PROVIDER_FEATURE_COUNT = CONTENT_PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.RuleSetImpl <em>Rule Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.RuleSetImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getRuleSet()
   * @generated
   */
  int RULE_SET = 6;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__RULES = LIFE_CYCLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__ROOT = LIFE_CYCLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__NAME = LIFE_CYCLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Deactivate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET__DEACTIVATE = LIFE_CYCLE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Rule Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_SET_FEATURE_COUNT = LIFE_CYCLE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.RuleImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getRule()
   * @generated
   */
  int RULE = 7;

  /**
   * The feature id for the '<em><b>Rule Set</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__RULE_SET = LIFE_CYCLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = LIFE_CYCLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__PREREQUISITES = LIFE_CYCLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__GENERATOR = LIFE_CYCLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Match Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__MATCH_CLASS_NAME = LIFE_CYCLE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Dont Overwrite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__DONT_OVERWRITE = LIFE_CYCLE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Deactivate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__DEACTIVATE = LIFE_CYCLE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = LIFE_CYCLE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.StaticRuleImpl <em>Static Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.StaticRuleImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getStaticRule()
   * @generated
   */
  int STATIC_RULE = 8;

  /**
   * The feature id for the '<em><b>Rule Set</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE__RULE_SET = RULE__RULE_SET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE__NAME = RULE__NAME;

  /**
   * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE__PREREQUISITES = RULE__PREREQUISITES;

  /**
   * The feature id for the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE__GENERATOR = RULE__GENERATOR;

  /**
   * The feature id for the '<em><b>Match Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE__MATCH_CLASS_NAME = RULE__MATCH_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Dont Overwrite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE__DONT_OVERWRITE = RULE__DONT_OVERWRITE;

  /**
   * The feature id for the '<em><b>Deactivate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE__DEACTIVATE = RULE__DEACTIVATE;

  /**
   * The feature id for the '<em><b>Target Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE__TARGET_PATH = RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Static Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.ExpressionBasedRuleImpl <em>Expression Based Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.ExpressionBasedRuleImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getExpressionBasedRule()
   * @generated
   */
  int EXPRESSION_BASED_RULE = 9;

  /**
   * The feature id for the '<em><b>Rule Set</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__RULE_SET = RULE__RULE_SET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__NAME = RULE__NAME;

  /**
   * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__PREREQUISITES = RULE__PREREQUISITES;

  /**
   * The feature id for the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__GENERATOR = RULE__GENERATOR;

  /**
   * The feature id for the '<em><b>Match Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__MATCH_CLASS_NAME = RULE__MATCH_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Dont Overwrite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__DONT_OVERWRITE = RULE__DONT_OVERWRITE;

  /**
   * The feature id for the '<em><b>Deactivate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__DEACTIVATE = RULE__DEACTIVATE;

  /**
   * The feature id for the '<em><b>Match Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__MATCH_EXPRESSION = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Path Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Expression Based Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_BASED_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.GeneratorImpl <em>Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.GeneratorImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getGenerator()
   * @generated
   */
  int GENERATOR = 10;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__ROOT = LIFE_CYCLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR__NAME = LIFE_CYCLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATOR_FEATURE_COUNT = LIFE_CYCLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.DelegatingGeneratorImpl <em>Delegating Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.DelegatingGeneratorImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDelegatingGenerator()
   * @generated
   */
  int DELEGATING_GENERATOR = 11;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATING_GENERATOR__ROOT = GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATING_GENERATOR__NAME = GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Delegate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATING_GENERATOR__DELEGATE = GENERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Delegating Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DELEGATING_GENERATOR_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.DomTransformerImpl <em>Dom Transformer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.DomTransformerImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDomTransformer()
   * @generated
   */
  int DOM_TRANSFORMER = 12;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__ROOT = GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__NAME = GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__TRANSFORMATIONS = GENERATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__ENCODING = GENERATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Force Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__FORCE_ENCODING = GENERATOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Namespace URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__NAMESPACE_URI = GENERATOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__QUALIFIED_NAME = GENERATOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Public ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__PUBLIC_ID = GENERATOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>System ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__SYSTEM_ID = GENERATOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Force Doc Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__FORCE_DOC_TYPE = GENERATOR_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Indent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__INDENT = GENERATOR_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Indenting</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__INDENTING = GENERATOR_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Line Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__LINE_WIDTH = GENERATOR_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Line Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__LINE_SEPARATOR = GENERATOR_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Preserve Empty Attributes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES = GENERATOR_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Preserve Space</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__PRESERVE_SPACE = GENERATOR_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Force Formatting</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER__FORCE_FORMATTING = GENERATOR_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Dom Transformer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMER_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.DomTransformationImpl <em>Dom Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.DomTransformationImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDomTransformation()
   * @generated
   */
  int DOM_TRANSFORMATION = 13;

  /**
   * The feature id for the '<em><b>Transformer</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMATION__TRANSFORMER = LIFE_CYCLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMATION__LABEL = LIFE_CYCLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dom Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_TRANSFORMATION_FEATURE_COUNT = LIFE_CYCLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.InitialGeneratorImpl <em>Initial Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.InitialGeneratorImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getInitialGenerator()
   * @generated
   */
  int INITIAL_GENERATOR = 14;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_GENERATOR__ROOT = DELEGATING_GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_GENERATOR__NAME = DELEGATING_GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Delegate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_GENERATOR__DELEGATE = DELEGATING_GENERATOR__DELEGATE;

  /**
   * The number of structural features of the '<em>Initial Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_GENERATOR_FEATURE_COUNT = DELEGATING_GENERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.StaticFileInitializerImpl <em>Static File Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.StaticFileInitializerImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getStaticFileInitializer()
   * @generated
   */
  int STATIC_FILE_INITIALIZER = 15;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FILE_INITIALIZER__ROOT = GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FILE_INITIALIZER__NAME = GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Lines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FILE_INITIALIZER__LINES = GENERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Static File Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_FILE_INITIALIZER_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.LineImpl <em>Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.LineImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getLine()
   * @generated
   */
  int LINE = 16;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__CONTENT = 0;

  /**
   * The feature id for the '<em><b>Static File Initializer</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE__STATIC_FILE_INITIALIZER = 1;

  /**
   * The number of structural features of the '<em>Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.ProjectInitializerImpl <em>Project Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.ProjectInitializerImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getProjectInitializer()
   * @generated
   */
  int PROJECT_INITIALIZER = 17;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_INITIALIZER__ROOT = GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_INITIALIZER__NAME = GENERATOR__NAME;

  /**
   * The number of structural features of the '<em>Project Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_INITIALIZER_FEATURE_COUNT = GENERATOR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.ProjectInitializationProvider <em>Project Initialization Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.ProjectInitializationProvider
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getProjectInitializationProvider()
   * @generated
   */
  int PROJECT_INITIALIZATION_PROVIDER = 18;

  /**
   * The number of structural features of the '<em>Project Initialization Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_INITIALIZATION_PROVIDER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.InputImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getInput()
   * @generated
   */
  int INPUT = 19;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__ROOT = LIFE_CYCLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__LABEL = LIFE_CYCLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Full Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__FULL_PATH = LIFE_CYCLE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Content Provider</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__CONTENT_PROVIDER = LIFE_CYCLE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Rule Sets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__RULE_SETS = LIFE_CYCLE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = LIFE_CYCLE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.impl.DomContentProviderImpl <em>Dom Content Provider</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.impl.DomContentProviderImpl
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDomContentProvider()
   * @generated
   */
  int DOM_CONTENT_PROVIDER = 20;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_CONTENT_PROVIDER__ROOT = CONTENT_PROVIDER__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_CONTENT_PROVIDER__NAME = CONTENT_PROVIDER__NAME;

  /**
   * The number of structural features of the '<em>Dom Content Provider</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOM_CONTENT_PROVIDER_FEATURE_COUNT = CONTENT_PROVIDER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '<em>IPath</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.core.runtime.IPath
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getIPath()
   * @generated
   */
  int IPATH = 21;

  /**
   * The meta object id for the '<em>Java List</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.util.List
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getJavaList()
   * @generated
   */
  int JAVA_LIST = 22;

  /**
   * The meta object id for the '<em>Core Exception</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.core.runtime.CoreException
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getCoreException()
   * @generated
   */
  int CORE_EXCEPTION = 23;

  /**
   * The meta object id for the '<em>IProgress Monitor</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.core.runtime.IProgressMonitor
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getIProgressMonitor()
   * @generated
   */
  int IPROGRESS_MONITOR = 24;

  /**
   * The meta object id for the '<em>Class Loader</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.ClassLoader
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getClassLoader()
   * @generated
   */
  int CLASS_LOADER = 25;

  /**
   * The meta object id for the '<em>Output Stream</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.io.OutputStream
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getOutputStream()
   * @generated
   */
  int OUTPUT_STREAM = 26;

  /**
   * The meta object id for the '<em>Exception</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Exception
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getException()
   * @generated
   */
  int EXCEPTION = 27;

  /**
   * The meta object id for the '<em>Dom Document</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.w3c.dom.Document
   * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDomDocument()
   * @generated
   */
  int DOM_DOCUMENT = 28;

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.GenLib <em>Gen Lib</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gen Lib</em>'.
   * @see com.sympedia.genfw.GenLib
   * @generated
   */
  EClass getGenLib();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.genfw.GenLib#getContentProviders <em>Content Providers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content Providers</em>'.
   * @see com.sympedia.genfw.GenLib#getContentProviders()
   * @see #getGenLib()
   * @generated
   */
  EReference getGenLib_ContentProviders();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.genfw.GenLib#getGenerators <em>Generators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generators</em>'.
   * @see com.sympedia.genfw.GenLib#getGenerators()
   * @see #getGenLib()
   * @generated
   */
  EReference getGenLib_Generators();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.genfw.GenLib#getRuleSets <em>Rule Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rule Sets</em>'.
   * @see com.sympedia.genfw.GenLib#getRuleSets()
   * @see #getGenLib()
   * @generated
   */
  EReference getGenLib_RuleSets();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.GenApp <em>Gen App</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gen App</em>'.
   * @see com.sympedia.genfw.GenApp
   * @generated
   */
  EClass getGenApp();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.genfw.GenApp#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputs</em>'.
   * @see com.sympedia.genfw.GenApp#getInputs()
   * @see #getGenApp()
   * @generated
   */
  EReference getGenApp_Inputs();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.LifeCycle <em>Life Cycle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Life Cycle</em>'.
   * @see com.sympedia.genfw.LifeCycle
   * @generated
   */
  EClass getLifeCycle();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content Provider</em>'.
   * @see com.sympedia.genfw.ContentProvider
   * @generated
   */
  EClass getContentProvider();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.genfw.ContentProvider#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Root</em>'.
   * @see com.sympedia.genfw.ContentProvider#getRoot()
   * @see #getContentProvider()
   * @generated
   */
  EReference getContentProvider_Root();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.ContentProvider#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sympedia.genfw.ContentProvider#getName()
   * @see #getContentProvider()
   * @generated
   */
  EAttribute getContentProvider_Name();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.EcoreContentProvider <em>Ecore Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ecore Content Provider</em>'.
   * @see com.sympedia.genfw.EcoreContentProvider
   * @generated
   */
  EClass getEcoreContentProvider();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.PropertiesContentProvider <em>Properties Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties Content Provider</em>'.
   * @see com.sympedia.genfw.PropertiesContentProvider
   * @generated
   */
  EClass getPropertiesContentProvider();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.RuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Set</em>'.
   * @see com.sympedia.genfw.RuleSet
   * @generated
   */
  EClass getRuleSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.genfw.RuleSet#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see com.sympedia.genfw.RuleSet#getRules()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Rules();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.genfw.RuleSet#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Root</em>'.
   * @see com.sympedia.genfw.RuleSet#getRoot()
   * @see #getRuleSet()
   * @generated
   */
  EReference getRuleSet_Root();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.RuleSet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sympedia.genfw.RuleSet#getName()
   * @see #getRuleSet()
   * @generated
   */
  EAttribute getRuleSet_Name();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.RuleSet#isDeactivate <em>Deactivate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deactivate</em>'.
   * @see com.sympedia.genfw.RuleSet#isDeactivate()
   * @see #getRuleSet()
   * @generated
   */
  EAttribute getRuleSet_Deactivate();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see com.sympedia.genfw.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.genfw.Rule#getRuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Rule Set</em>'.
   * @see com.sympedia.genfw.Rule#getRuleSet()
   * @see #getRule()
   * @generated
   */
  EReference getRule_RuleSet();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sympedia.genfw.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.genfw.Rule#getPrerequisites <em>Prerequisites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Prerequisites</em>'.
   * @see com.sympedia.genfw.Rule#getPrerequisites()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Prerequisites();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.genfw.Rule#getGenerator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Generator</em>'.
   * @see com.sympedia.genfw.Rule#getGenerator()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Generator();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.Rule#getMatchClassName <em>Match Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Match Class Name</em>'.
   * @see com.sympedia.genfw.Rule#getMatchClassName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_MatchClassName();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.Rule#isDontOverwrite <em>Dont Overwrite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dont Overwrite</em>'.
   * @see com.sympedia.genfw.Rule#isDontOverwrite()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_DontOverwrite();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.Rule#isDeactivate <em>Deactivate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deactivate</em>'.
   * @see com.sympedia.genfw.Rule#isDeactivate()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Deactivate();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.StaticRule <em>Static Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Rule</em>'.
   * @see com.sympedia.genfw.StaticRule
   * @generated
   */
  EClass getStaticRule();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.StaticRule#getTargetPath <em>Target Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Path</em>'.
   * @see com.sympedia.genfw.StaticRule#getTargetPath()
   * @see #getStaticRule()
   * @generated
   */
  EAttribute getStaticRule_TargetPath();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ExpressionBasedRule <em>Expression Based Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Based Rule</em>'.
   * @see com.sympedia.genfw.ExpressionBasedRule
   * @generated
   */
  EClass getExpressionBasedRule();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.ExpressionBasedRule#getMatchExpression <em>Match Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Match Expression</em>'.
   * @see com.sympedia.genfw.ExpressionBasedRule#getMatchExpression()
   * @see #getExpressionBasedRule()
   * @generated
   */
  EAttribute getExpressionBasedRule_MatchExpression();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.ExpressionBasedRule#getTargetPathExpression <em>Target Path Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Path Expression</em>'.
   * @see com.sympedia.genfw.ExpressionBasedRule#getTargetPathExpression()
   * @see #getExpressionBasedRule()
   * @generated
   */
  EAttribute getExpressionBasedRule_TargetPathExpression();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.Generator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generator</em>'.
   * @see com.sympedia.genfw.Generator
   * @generated
   */
  EClass getGenerator();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.genfw.Generator#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Root</em>'.
   * @see com.sympedia.genfw.Generator#getRoot()
   * @see #getGenerator()
   * @generated
   */
  EReference getGenerator_Root();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.Generator#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sympedia.genfw.Generator#getName()
   * @see #getGenerator()
   * @generated
   */
  EAttribute getGenerator_Name();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.DelegatingGenerator <em>Delegating Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Delegating Generator</em>'.
   * @see com.sympedia.genfw.DelegatingGenerator
   * @generated
   */
  EClass getDelegatingGenerator();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.genfw.DelegatingGenerator#getDelegate <em>Delegate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Delegate</em>'.
   * @see com.sympedia.genfw.DelegatingGenerator#getDelegate()
   * @see #getDelegatingGenerator()
   * @generated
   */
  EReference getDelegatingGenerator_Delegate();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.DomTransformer <em>Dom Transformer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dom Transformer</em>'.
   * @see com.sympedia.genfw.DomTransformer
   * @generated
   */
  EClass getDomTransformer();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.genfw.DomTransformer#getTransformations <em>Transformations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transformations</em>'.
   * @see com.sympedia.genfw.DomTransformer#getTransformations()
   * @see #getDomTransformer()
   * @generated
   */
  EReference getDomTransformer_Transformations();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#getEncoding <em>Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Encoding</em>'.
   * @see com.sympedia.genfw.DomTransformer#getEncoding()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_Encoding();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#isForceEncoding <em>Force Encoding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Force Encoding</em>'.
   * @see com.sympedia.genfw.DomTransformer#isForceEncoding()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_ForceEncoding();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see com.sympedia.genfw.DomTransformer#getQualifiedName()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_QualifiedName();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#getIndent <em>Indent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Indent</em>'.
   * @see com.sympedia.genfw.DomTransformer#getIndent()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_Indent();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#isIndenting <em>Indenting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Indenting</em>'.
   * @see com.sympedia.genfw.DomTransformer#isIndenting()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_Indenting();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#getLineWidth <em>Line Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Width</em>'.
   * @see com.sympedia.genfw.DomTransformer#getLineWidth()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_LineWidth();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#getLineSeparator <em>Line Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line Separator</em>'.
   * @see com.sympedia.genfw.DomTransformer#getLineSeparator()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_LineSeparator();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#isPreserveEmptyAttributes <em>Preserve Empty Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preserve Empty Attributes</em>'.
   * @see com.sympedia.genfw.DomTransformer#isPreserveEmptyAttributes()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_PreserveEmptyAttributes();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#isPreserveSpace <em>Preserve Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Preserve Space</em>'.
   * @see com.sympedia.genfw.DomTransformer#isPreserveSpace()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_PreserveSpace();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#getPublicID <em>Public ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Public ID</em>'.
   * @see com.sympedia.genfw.DomTransformer#getPublicID()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_PublicID();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#getSystemID <em>System ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>System ID</em>'.
   * @see com.sympedia.genfw.DomTransformer#getSystemID()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_SystemID();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#isForceDocType <em>Force Doc Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Force Doc Type</em>'.
   * @see com.sympedia.genfw.DomTransformer#isForceDocType()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_ForceDocType();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#getNamespaceURI <em>Namespace URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namespace URI</em>'.
   * @see com.sympedia.genfw.DomTransformer#getNamespaceURI()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_NamespaceURI();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformer#isForceFormatting <em>Force Formatting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Force Formatting</em>'.
   * @see com.sympedia.genfw.DomTransformer#isForceFormatting()
   * @see #getDomTransformer()
   * @generated
   */
  EAttribute getDomTransformer_ForceFormatting();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.DomTransformation <em>Dom Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dom Transformation</em>'.
   * @see com.sympedia.genfw.DomTransformation
   * @generated
   */
  EClass getDomTransformation();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.genfw.DomTransformation#getTransformer <em>Transformer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Transformer</em>'.
   * @see com.sympedia.genfw.DomTransformation#getTransformer()
   * @see #getDomTransformation()
   * @generated
   */
  EReference getDomTransformation_Transformer();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.DomTransformation#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.sympedia.genfw.DomTransformation#getLabel()
   * @see #getDomTransformation()
   * @generated
   */
  EAttribute getDomTransformation_Label();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.InitialGenerator <em>Initial Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial Generator</em>'.
   * @see com.sympedia.genfw.InitialGenerator
   * @generated
   */
  EClass getInitialGenerator();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.StaticFileInitializer <em>Static File Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static File Initializer</em>'.
   * @see com.sympedia.genfw.StaticFileInitializer
   * @generated
   */
  EClass getStaticFileInitializer();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.genfw.StaticFileInitializer#getLines <em>Lines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lines</em>'.
   * @see com.sympedia.genfw.StaticFileInitializer#getLines()
   * @see #getStaticFileInitializer()
   * @generated
   */
  EReference getStaticFileInitializer_Lines();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Line</em>'.
   * @see com.sympedia.genfw.Line
   * @generated
   */
  EClass getLine();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.Line#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see com.sympedia.genfw.Line#getContent()
   * @see #getLine()
   * @generated
   */
  EAttribute getLine_Content();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.genfw.Line#getStaticFileInitializer <em>Static File Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Static File Initializer</em>'.
   * @see com.sympedia.genfw.Line#getStaticFileInitializer()
   * @see #getLine()
   * @generated
   */
  EReference getLine_StaticFileInitializer();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ProjectInitializer <em>Project Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Initializer</em>'.
   * @see com.sympedia.genfw.ProjectInitializer
   * @generated
   */
  EClass getProjectInitializer();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ProjectInitializationProvider <em>Project Initialization Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Initialization Provider</em>'.
   * @see com.sympedia.genfw.ProjectInitializationProvider
   * @generated
   */
  EClass getProjectInitializationProvider();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see com.sympedia.genfw.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.genfw.Input#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Root</em>'.
   * @see com.sympedia.genfw.Input#getRoot()
   * @see #getInput()
   * @generated
   */
  EReference getInput_Root();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.Input#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see com.sympedia.genfw.Input#getLabel()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Label();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.Input#getFullPath <em>Full Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Full Path</em>'.
   * @see com.sympedia.genfw.Input#getFullPath()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_FullPath();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.genfw.Input#getContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Content Provider</em>'.
   * @see com.sympedia.genfw.Input#getContentProvider()
   * @see #getInput()
   * @generated
   */
  EReference getInput_ContentProvider();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.genfw.Input#getRuleSets <em>Rule Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Rule Sets</em>'.
   * @see com.sympedia.genfw.Input#getRuleSets()
   * @see #getInput()
   * @generated
   */
  EReference getInput_RuleSets();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.DomContentProvider <em>Dom Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dom Content Provider</em>'.
   * @see com.sympedia.genfw.DomContentProvider
   * @generated
   */
  EClass getDomContentProvider();

  /**
   * Returns the meta object for data type '{@link org.eclipse.core.runtime.IPath <em>IPath</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IPath</em>'.
   * @see org.eclipse.core.runtime.IPath
   * @model instanceClass="org.eclipse.core.runtime.IPath"
   *        annotation="http://www.topcased.org/uuid uuid='113670815921825'" 
   * @generated
   */
  EDataType getIPath();

  /**
   * Returns the meta object for data type '{@link java.util.List <em>Java List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Java List</em>'.
   * @see java.util.List
   * @model instanceClass="java.util.List"
   *        annotation="http://www.topcased.org/uuid uuid='113671579193769'" 
   * @generated
   */
  EDataType getJavaList();

  /**
   * Returns the meta object for data type '{@link org.eclipse.core.runtime.CoreException <em>Core Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Core Exception</em>'.
   * @see org.eclipse.core.runtime.CoreException
   * @model instanceClass="org.eclipse.core.runtime.CoreException"
   *        annotation="http://www.topcased.org/uuid uuid='1136792315343141'" 
   * @generated
   */
  EDataType getCoreException();

  /**
   * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>IProgress Monitor</em>'.
   * @see org.eclipse.core.runtime.IProgressMonitor
   * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
   *        annotation="http://www.topcased.org/uuid uuid='1136792315343142'" 
   * @generated
   */
  EDataType getIProgressMonitor();

  /**
   * Returns the meta object for data type '{@link java.lang.ClassLoader <em>Class Loader</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Class Loader</em>'.
   * @see java.lang.ClassLoader
   * @model instanceClass="java.lang.ClassLoader"
   *        annotation="http://www.topcased.org/uuid uuid='113670815921825'" 
   * @generated
   */
  EDataType getClassLoader();

  /**
   * Returns the meta object for data type '{@link java.io.OutputStream <em>Output Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Output Stream</em>'.
   * @see java.io.OutputStream
   * @model instanceClass="java.io.OutputStream"
   *        annotation="http://www.topcased.org/uuid uuid='1138788227671167'" 
   * @generated
   */
  EDataType getOutputStream();

  /**
   * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Exception</em>'.
   * @see java.lang.Exception
   * @model instanceClass="java.lang.Exception"
   *        annotation="http://www.topcased.org/uuid uuid='1138788227671168'" 
   * @generated
   */
  EDataType getException();

  /**
   * Returns the meta object for data type '{@link org.w3c.dom.Document <em>Dom Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Dom Document</em>'.
   * @see org.w3c.dom.Document
   * @model instanceClass="org.w3c.dom.Document"
   *        annotation="http://www.topcased.org/uuid uuid='1138795838842228'" 
   * @generated
   */
  EDataType getDomDocument();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GenfwFactory getGenfwFactory();

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
     * The meta object literal for the '{@link com.sympedia.genfw.impl.GenLibImpl <em>Gen Lib</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.GenLibImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getGenLib()
     * @generated
     */
    EClass GEN_LIB = eINSTANCE.getGenLib();

    /**
     * The meta object literal for the '<em><b>Content Providers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEN_LIB__CONTENT_PROVIDERS = eINSTANCE.getGenLib_ContentProviders();

    /**
     * The meta object literal for the '<em><b>Generators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEN_LIB__GENERATORS = eINSTANCE.getGenLib_Generators();

    /**
     * The meta object literal for the '<em><b>Rule Sets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEN_LIB__RULE_SETS = eINSTANCE.getGenLib_RuleSets();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.GenAppImpl <em>Gen App</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.GenAppImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getGenApp()
     * @generated
     */
    EClass GEN_APP = eINSTANCE.getGenApp();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GEN_APP__INPUTS = eINSTANCE.getGenApp_Inputs();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.LifeCycleImpl <em>Life Cycle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.LifeCycleImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getLifeCycle()
     * @generated
     */
    EClass LIFE_CYCLE = eINSTANCE.getLifeCycle();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.ContentProviderImpl <em>Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.ContentProviderImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getContentProvider()
     * @generated
     */
    EClass CONTENT_PROVIDER = eINSTANCE.getContentProvider();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTENT_PROVIDER__ROOT = eINSTANCE.getContentProvider_Root();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTENT_PROVIDER__NAME = eINSTANCE.getContentProvider_Name();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.EcoreContentProviderImpl <em>Ecore Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.EcoreContentProviderImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getEcoreContentProvider()
     * @generated
     */
    EClass ECORE_CONTENT_PROVIDER = eINSTANCE.getEcoreContentProvider();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.PropertiesContentProviderImpl <em>Properties Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.PropertiesContentProviderImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getPropertiesContentProvider()
     * @generated
     */
    EClass PROPERTIES_CONTENT_PROVIDER = eINSTANCE.getPropertiesContentProvider();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.RuleSetImpl <em>Rule Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.RuleSetImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getRuleSet()
     * @generated
     */
    EClass RULE_SET = eINSTANCE.getRuleSet();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__RULES = eINSTANCE.getRuleSet_Rules();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_SET__ROOT = eINSTANCE.getRuleSet_Root();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_SET__NAME = eINSTANCE.getRuleSet_Name();

    /**
     * The meta object literal for the '<em><b>Deactivate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_SET__DEACTIVATE = eINSTANCE.getRuleSet_Deactivate();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.RuleImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Rule Set</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__RULE_SET = eINSTANCE.getRule_RuleSet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Prerequisites</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__PREREQUISITES = eINSTANCE.getRule_Prerequisites();

    /**
     * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__GENERATOR = eINSTANCE.getRule_Generator();

    /**
     * The meta object literal for the '<em><b>Match Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__MATCH_CLASS_NAME = eINSTANCE.getRule_MatchClassName();

    /**
     * The meta object literal for the '<em><b>Dont Overwrite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__DONT_OVERWRITE = eINSTANCE.getRule_DontOverwrite();

    /**
     * The meta object literal for the '<em><b>Deactivate</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__DEACTIVATE = eINSTANCE.getRule_Deactivate();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.StaticRuleImpl <em>Static Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.StaticRuleImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getStaticRule()
     * @generated
     */
    EClass STATIC_RULE = eINSTANCE.getStaticRule();

    /**
     * The meta object literal for the '<em><b>Target Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_RULE__TARGET_PATH = eINSTANCE.getStaticRule_TargetPath();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.ExpressionBasedRuleImpl <em>Expression Based Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.ExpressionBasedRuleImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getExpressionBasedRule()
     * @generated
     */
    EClass EXPRESSION_BASED_RULE = eINSTANCE.getExpressionBasedRule();

    /**
     * The meta object literal for the '<em><b>Match Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_BASED_RULE__MATCH_EXPRESSION = eINSTANCE
            .getExpressionBasedRule_MatchExpression();

    /**
     * The meta object literal for the '<em><b>Target Path Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION = eINSTANCE
            .getExpressionBasedRule_TargetPathExpression();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.GeneratorImpl <em>Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.GeneratorImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getGenerator()
     * @generated
     */
    EClass GENERATOR = eINSTANCE.getGenerator();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERATOR__ROOT = eINSTANCE.getGenerator_Root();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERATOR__NAME = eINSTANCE.getGenerator_Name();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.DelegatingGeneratorImpl <em>Delegating Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.DelegatingGeneratorImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDelegatingGenerator()
     * @generated
     */
    EClass DELEGATING_GENERATOR = eINSTANCE.getDelegatingGenerator();

    /**
     * The meta object literal for the '<em><b>Delegate</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DELEGATING_GENERATOR__DELEGATE = eINSTANCE.getDelegatingGenerator_Delegate();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.DomTransformerImpl <em>Dom Transformer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.DomTransformerImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDomTransformer()
     * @generated
     */
    EClass DOM_TRANSFORMER = eINSTANCE.getDomTransformer();

    /**
     * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOM_TRANSFORMER__TRANSFORMATIONS = eINSTANCE.getDomTransformer_Transformations();

    /**
     * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__ENCODING = eINSTANCE.getDomTransformer_Encoding();

    /**
     * The meta object literal for the '<em><b>Force Encoding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__FORCE_ENCODING = eINSTANCE.getDomTransformer_ForceEncoding();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__QUALIFIED_NAME = eINSTANCE.getDomTransformer_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Indent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__INDENT = eINSTANCE.getDomTransformer_Indent();

    /**
     * The meta object literal for the '<em><b>Indenting</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__INDENTING = eINSTANCE.getDomTransformer_Indenting();

    /**
     * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__LINE_WIDTH = eINSTANCE.getDomTransformer_LineWidth();

    /**
     * The meta object literal for the '<em><b>Line Separator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__LINE_SEPARATOR = eINSTANCE.getDomTransformer_LineSeparator();

    /**
     * The meta object literal for the '<em><b>Preserve Empty Attributes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES = eINSTANCE
            .getDomTransformer_PreserveEmptyAttributes();

    /**
     * The meta object literal for the '<em><b>Preserve Space</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__PRESERVE_SPACE = eINSTANCE.getDomTransformer_PreserveSpace();

    /**
     * The meta object literal for the '<em><b>Public ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__PUBLIC_ID = eINSTANCE.getDomTransformer_PublicID();

    /**
     * The meta object literal for the '<em><b>System ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__SYSTEM_ID = eINSTANCE.getDomTransformer_SystemID();

    /**
     * The meta object literal for the '<em><b>Force Doc Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__FORCE_DOC_TYPE = eINSTANCE.getDomTransformer_ForceDocType();

    /**
     * The meta object literal for the '<em><b>Namespace URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__NAMESPACE_URI = eINSTANCE.getDomTransformer_NamespaceURI();

    /**
     * The meta object literal for the '<em><b>Force Formatting</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMER__FORCE_FORMATTING = eINSTANCE.getDomTransformer_ForceFormatting();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.DomTransformationImpl <em>Dom Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.DomTransformationImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDomTransformation()
     * @generated
     */
    EClass DOM_TRANSFORMATION = eINSTANCE.getDomTransformation();

    /**
     * The meta object literal for the '<em><b>Transformer</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOM_TRANSFORMATION__TRANSFORMER = eINSTANCE.getDomTransformation_Transformer();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOM_TRANSFORMATION__LABEL = eINSTANCE.getDomTransformation_Label();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.InitialGeneratorImpl <em>Initial Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.InitialGeneratorImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getInitialGenerator()
     * @generated
     */
    EClass INITIAL_GENERATOR = eINSTANCE.getInitialGenerator();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.StaticFileInitializerImpl <em>Static File Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.StaticFileInitializerImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getStaticFileInitializer()
     * @generated
     */
    EClass STATIC_FILE_INITIALIZER = eINSTANCE.getStaticFileInitializer();

    /**
     * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_FILE_INITIALIZER__LINES = eINSTANCE.getStaticFileInitializer_Lines();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.LineImpl <em>Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.LineImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getLine()
     * @generated
     */
    EClass LINE = eINSTANCE.getLine();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINE__CONTENT = eINSTANCE.getLine_Content();

    /**
     * The meta object literal for the '<em><b>Static File Initializer</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINE__STATIC_FILE_INITIALIZER = eINSTANCE.getLine_StaticFileInitializer();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.ProjectInitializerImpl <em>Project Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.ProjectInitializerImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getProjectInitializer()
     * @generated
     */
    EClass PROJECT_INITIALIZER = eINSTANCE.getProjectInitializer();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.ProjectInitializationProvider <em>Project Initialization Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.ProjectInitializationProvider
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getProjectInitializationProvider()
     * @generated
     */
    EClass PROJECT_INITIALIZATION_PROVIDER = eINSTANCE.getProjectInitializationProvider();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.InputImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__ROOT = eINSTANCE.getInput_Root();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__LABEL = eINSTANCE.getInput_Label();

    /**
     * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__FULL_PATH = eINSTANCE.getInput_FullPath();

    /**
     * The meta object literal for the '<em><b>Content Provider</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__CONTENT_PROVIDER = eINSTANCE.getInput_ContentProvider();

    /**
     * The meta object literal for the '<em><b>Rule Sets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT__RULE_SETS = eINSTANCE.getInput_RuleSets();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.impl.DomContentProviderImpl <em>Dom Content Provider</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.impl.DomContentProviderImpl
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDomContentProvider()
     * @generated
     */
    EClass DOM_CONTENT_PROVIDER = eINSTANCE.getDomContentProvider();

    /**
     * The meta object literal for the '<em>IPath</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.core.runtime.IPath
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getIPath()
     * @generated
     */
    EDataType IPATH = eINSTANCE.getIPath();

    /**
     * The meta object literal for the '<em>Java List</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.List
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getJavaList()
     * @generated
     */
    EDataType JAVA_LIST = eINSTANCE.getJavaList();

    /**
     * The meta object literal for the '<em>Core Exception</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.core.runtime.CoreException
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getCoreException()
     * @generated
     */
    EDataType CORE_EXCEPTION = eINSTANCE.getCoreException();

    /**
     * The meta object literal for the '<em>IProgress Monitor</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.core.runtime.IProgressMonitor
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getIProgressMonitor()
     * @generated
     */
    EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

    /**
     * The meta object literal for the '<em>Class Loader</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.ClassLoader
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getClassLoader()
     * @generated
     */
    EDataType CLASS_LOADER = eINSTANCE.getClassLoader();

    /**
     * The meta object literal for the '<em>Output Stream</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.io.OutputStream
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getOutputStream()
     * @generated
     */
    EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

    /**
     * The meta object literal for the '<em>Exception</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.Exception
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getException()
     * @generated
     */
    EDataType EXCEPTION = eINSTANCE.getException();

    /**
     * The meta object literal for the '<em>Dom Document</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.w3c.dom.Document
     * @see com.sympedia.genfw.impl.GenfwPackageImpl#getDomDocument()
     * @generated
     */
    EDataType DOM_DOCUMENT = eINSTANCE.getDomDocument();

  }

} //GenfwPackage

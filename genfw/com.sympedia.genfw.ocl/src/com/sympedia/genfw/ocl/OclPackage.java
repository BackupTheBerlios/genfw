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


import com.sympedia.genfw.GenfwPackage;

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
 * @see com.sympedia.genfw.ocl.OclFactory
 * @model kind="package"
 *        annotation="http://www.topcased.org/uuid uuid='11386873328120'"
 * @generated
 */
public interface OclPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ocl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sympedia.com/2006/genfw/ocl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.sympedia.genfw.ocl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OclPackage eINSTANCE = com.sympedia.genfw.ocl.impl.OclPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sympedia.genfw.ocl.impl.OclRuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.ocl.impl.OclRuleImpl
   * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getOclRule()
   * @generated
   */
  int OCL_RULE = 0;

  /**
   * The feature id for the '<em><b>Rule Set</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__RULE_SET = GenfwPackage.EXPRESSION_BASED_RULE__RULE_SET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__NAME = GenfwPackage.EXPRESSION_BASED_RULE__NAME;

  /**
   * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__PREREQUISITES = GenfwPackage.EXPRESSION_BASED_RULE__PREREQUISITES;

  /**
   * The feature id for the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__GENERATOR = GenfwPackage.EXPRESSION_BASED_RULE__GENERATOR;

  /**
   * The feature id for the '<em><b>Match Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__MATCH_CLASS_NAME = GenfwPackage.EXPRESSION_BASED_RULE__MATCH_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Dont Overwrite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__DONT_OVERWRITE = GenfwPackage.EXPRESSION_BASED_RULE__DONT_OVERWRITE;

  /**
   * The feature id for the '<em><b>Deactivate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__DEACTIVATE = GenfwPackage.EXPRESSION_BASED_RULE__DEACTIVATE;

  /**
   * The feature id for the '<em><b>Match Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__MATCH_EXPRESSION = GenfwPackage.EXPRESSION_BASED_RULE__MATCH_EXPRESSION;

  /**
   * The feature id for the '<em><b>Target Path Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE__TARGET_PATH_EXPRESSION = GenfwPackage.EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OCL_RULE_FEATURE_COUNT = GenfwPackage.EXPRESSION_BASED_RULE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.ocl.impl.ConfigurableOclRuleImpl <em>Configurable Ocl Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.ocl.impl.ConfigurableOclRuleImpl
   * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getConfigurableOclRule()
   * @generated
   */
  int CONFIGURABLE_OCL_RULE = 1;

  /**
   * The feature id for the '<em><b>Rule Set</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__RULE_SET = OCL_RULE__RULE_SET;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__NAME = OCL_RULE__NAME;

  /**
   * The feature id for the '<em><b>Prerequisites</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__PREREQUISITES = OCL_RULE__PREREQUISITES;

  /**
   * The feature id for the '<em><b>Generator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__GENERATOR = OCL_RULE__GENERATOR;

  /**
   * The feature id for the '<em><b>Match Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__MATCH_CLASS_NAME = OCL_RULE__MATCH_CLASS_NAME;

  /**
   * The feature id for the '<em><b>Dont Overwrite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__DONT_OVERWRITE = OCL_RULE__DONT_OVERWRITE;

  /**
   * The feature id for the '<em><b>Deactivate</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__DEACTIVATE = OCL_RULE__DEACTIVATE;

  /**
   * The feature id for the '<em><b>Match Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__MATCH_EXPRESSION = OCL_RULE__MATCH_EXPRESSION;

  /**
   * The feature id for the '<em><b>Target Path Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__TARGET_PATH_EXPRESSION = OCL_RULE__TARGET_PATH_EXPRESSION;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE__PACKAGES = OCL_RULE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Configurable Ocl Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURABLE_OCL_RULE_FEATURE_COUNT = OCL_RULE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.ocl.impl.PackageConfigurationImpl <em>Package Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.ocl.impl.PackageConfigurationImpl
   * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getPackageConfiguration()
   * @generated
   */
  int PACKAGE_CONFIGURATION = 2;

  /**
   * The feature id for the '<em><b>Ocl Rule</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_CONFIGURATION__OCL_RULE = 0;

  /**
   * The number of structural features of the '<em>Package Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_CONFIGURATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.ocl.impl.DynamicPackageImpl <em>Dynamic Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.ocl.impl.DynamicPackageImpl
   * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getDynamicPackage()
   * @generated
   */
  int DYNAMIC_PACKAGE = 3;

  /**
   * The feature id for the '<em><b>Ocl Rule</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PACKAGE__OCL_RULE = PACKAGE_CONFIGURATION__OCL_RULE;

  /**
   * The feature id for the '<em><b>Ecore File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PACKAGE__ECORE_FILE = PACKAGE_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dynamic Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DYNAMIC_PACKAGE_FEATURE_COUNT = PACKAGE_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.ocl.impl.StaticPackageImpl <em>Static Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.ocl.impl.StaticPackageImpl
   * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getStaticPackage()
   * @generated
   */
  int STATIC_PACKAGE = 4;

  /**
   * The feature id for the '<em><b>Ocl Rule</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PACKAGE__OCL_RULE = PACKAGE_CONFIGURATION__OCL_RULE;

  /**
   * The feature id for the '<em><b>Ns URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PACKAGE__NS_URI = PACKAGE_CONFIGURATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Static Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_PACKAGE_FEATURE_COUNT = PACKAGE_CONFIGURATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '<em>EPackage Registry</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getEPackageRegistry()
   * @generated
   */
  int EPACKAGE_REGISTRY = 5;

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ocl.OclRule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see com.sympedia.genfw.ocl.OclRule
   * @generated
   */
  EClass getOclRule();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ocl.ConfigurableOclRule <em>Configurable Ocl Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configurable Ocl Rule</em>'.
   * @see com.sympedia.genfw.ocl.ConfigurableOclRule
   * @generated
   */
  EClass getConfigurableOclRule();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.genfw.ocl.ConfigurableOclRule#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see com.sympedia.genfw.ocl.ConfigurableOclRule#getPackages()
   * @see #getConfigurableOclRule()
   * @generated
   */
  EReference getConfigurableOclRule_Packages();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ocl.PackageConfiguration <em>Package Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Configuration</em>'.
   * @see com.sympedia.genfw.ocl.PackageConfiguration
   * @generated
   */
  EClass getPackageConfiguration();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.genfw.ocl.PackageConfiguration#getOclRule <em>Ocl Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Ocl Rule</em>'.
   * @see com.sympedia.genfw.ocl.PackageConfiguration#getOclRule()
   * @see #getPackageConfiguration()
   * @generated
   */
  EReference getPackageConfiguration_OclRule();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ocl.DynamicPackage <em>Dynamic Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Package</em>'.
   * @see com.sympedia.genfw.ocl.DynamicPackage
   * @generated
   */
  EClass getDynamicPackage();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.ocl.DynamicPackage#getEcoreFile <em>Ecore File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ecore File</em>'.
   * @see com.sympedia.genfw.ocl.DynamicPackage#getEcoreFile()
   * @see #getDynamicPackage()
   * @generated
   */
  EAttribute getDynamicPackage_EcoreFile();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.ocl.StaticPackage <em>Static Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Package</em>'.
   * @see com.sympedia.genfw.ocl.StaticPackage
   * @generated
   */
  EClass getStaticPackage();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.ocl.StaticPackage#getNsURI <em>Ns URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns URI</em>'.
   * @see com.sympedia.genfw.ocl.StaticPackage#getNsURI()
   * @see #getStaticPackage()
   * @generated
   */
  EAttribute getStaticPackage_NsURI();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EPackage.Registry <em>EPackage Registry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EPackage Registry</em>'.
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @model instanceClass="org.eclipse.emf.ecore.EPackage.Registry"
   *        annotation="http://www.topcased.org/uuid uuid='11386878880789'" 
   * @generated
   */
  EDataType getEPackageRegistry();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OclFactory getOclFactory();

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
     * The meta object literal for the '{@link com.sympedia.genfw.ocl.impl.OclRuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.ocl.impl.OclRuleImpl
     * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getOclRule()
     * @generated
     */
    EClass OCL_RULE = eINSTANCE.getOclRule();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.ocl.impl.ConfigurableOclRuleImpl <em>Configurable Ocl Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.ocl.impl.ConfigurableOclRuleImpl
     * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getConfigurableOclRule()
     * @generated
     */
    EClass CONFIGURABLE_OCL_RULE = eINSTANCE.getConfigurableOclRule();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURABLE_OCL_RULE__PACKAGES = eINSTANCE.getConfigurableOclRule_Packages();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.ocl.impl.PackageConfigurationImpl <em>Package Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.ocl.impl.PackageConfigurationImpl
     * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getPackageConfiguration()
     * @generated
     */
    EClass PACKAGE_CONFIGURATION = eINSTANCE.getPackageConfiguration();

    /**
     * The meta object literal for the '<em><b>Ocl Rule</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_CONFIGURATION__OCL_RULE = eINSTANCE.getPackageConfiguration_OclRule();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.ocl.impl.DynamicPackageImpl <em>Dynamic Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.ocl.impl.DynamicPackageImpl
     * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getDynamicPackage()
     * @generated
     */
    EClass DYNAMIC_PACKAGE = eINSTANCE.getDynamicPackage();

    /**
     * The meta object literal for the '<em><b>Ecore File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DYNAMIC_PACKAGE__ECORE_FILE = eINSTANCE.getDynamicPackage_EcoreFile();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.ocl.impl.StaticPackageImpl <em>Static Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.ocl.impl.StaticPackageImpl
     * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getStaticPackage()
     * @generated
     */
    EClass STATIC_PACKAGE = eINSTANCE.getStaticPackage();

    /**
     * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_PACKAGE__NS_URI = eINSTANCE.getStaticPackage_NsURI();

    /**
     * The meta object literal for the '<em>EPackage Registry</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see com.sympedia.genfw.ocl.impl.OclPackageImpl#getEPackageRegistry()
     * @generated
     */
    EDataType EPACKAGE_REGISTRY = eINSTANCE.getEPackageRegistry();

  }

} //OclPackage

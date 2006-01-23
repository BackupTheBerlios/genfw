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
package com.sympedia.density.gen.deploy;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see com.sympedia.density.gen.deploy.DeployFactory
 * @model kind="package"
 *        annotation="http://www.topcased.org/uuid uuid='11350778856090'"
 * @generated
 */
public interface DeployPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "deploy";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://deploy";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "deploy";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeployPackage eINSTANCE = com.sympedia.density.gen.deploy.impl.DeployPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.ContainerImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__NAME = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__PACKAGE_NAME = 1;

  /**
   * The feature id for the '<em><b>Incomplete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__INCOMPLETE = 2;

  /**
   * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DEPLOYMENTS = 3;

  /**
   * The feature id for the '<em><b>Deployment Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__DEPLOYMENT_GROUPS = 4;

  /**
   * The feature id for the '<em><b>All Deployments</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__ALL_DEPLOYMENTS = 5;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl <em>Deployment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.DeploymentImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDeployment()
   * @generated
   */
  int DEPLOYMENT = 1;

  /**
   * The feature id for the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__COMPONENT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__ID = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__TYPE = 2;

  /**
   * The feature id for the '<em><b>Singleton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__SINGLETON = 3;

  /**
   * The feature id for the '<em><b>Lazy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__LAZY = 4;

  /**
   * The feature id for the '<em><b>Prototype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__PROTOTYPE = 5;

  /**
   * The feature id for the '<em><b>Initialized</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__INITIALIZED = 6;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__CONTAINER = 7;

  /**
   * The feature id for the '<em><b>Deployment Group</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__DEPLOYMENT_GROUP = 8;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__DEPENDENCIES = 9;

  /**
   * The feature id for the '<em><b>Creators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__CREATORS = 10;

  /**
   * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__LISTENERS = 11;

  /**
   * The feature id for the '<em><b>Referers</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__REFERERS = 12;

  /**
   * The feature id for the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__ROOT = 13;

  /**
   * The feature id for the '<em><b>Depends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT__DEPENDS = 14;

  /**
   * The number of structural features of the '<em>Deployment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl <em>Deployment Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDeploymentGroup()
   * @generated
   */
  int DEPLOYMENT_GROUP = 2;

  /**
   * The feature id for the '<em><b>Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_GROUP__CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_GROUP__SUB_GROUPS = 1;

  /**
   * The feature id for the '<em><b>Super Group</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_GROUP__SUPER_GROUP = 2;

  /**
   * The feature id for the '<em><b>Deployments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_GROUP__DEPLOYMENTS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_GROUP__NAME = 4;

  /**
   * The number of structural features of the '<em>Deployment Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPLOYMENT_GROUP_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.DependencyImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 4;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__DEPLOYMENT = 1;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.ParameterImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__FEATURE = DEPENDENCY__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEPLOYMENT = DEPENDENCY__DEPLOYMENT;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.ReferenceImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__FEATURE = DEPENDENCY__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__DEPLOYMENT = DEPENDENCY__DEPLOYMENT;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TARGET = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Listen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__LISTEN = DEPENDENCY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.IntegerParameterImpl <em>Integer Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.IntegerParameterImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getIntegerParameter()
   * @generated
   */
  int INTEGER_PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PARAMETER__FEATURE = PARAMETER__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PARAMETER__DEPLOYMENT = PARAMETER__DEPLOYMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.LongParameterImpl <em>Long Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.LongParameterImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getLongParameter()
   * @generated
   */
  int LONG_PARAMETER = 7;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_PARAMETER__FEATURE = PARAMETER__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_PARAMETER__DEPLOYMENT = PARAMETER__DEPLOYMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Long Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.FloatParameterImpl <em>Float Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.FloatParameterImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getFloatParameter()
   * @generated
   */
  int FLOAT_PARAMETER = 8;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_PARAMETER__FEATURE = PARAMETER__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_PARAMETER__DEPLOYMENT = PARAMETER__DEPLOYMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.DoubleParameterImpl <em>Double Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.DoubleParameterImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDoubleParameter()
   * @generated
   */
  int DOUBLE_PARAMETER = 9;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_PARAMETER__FEATURE = PARAMETER__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_PARAMETER__DEPLOYMENT = PARAMETER__DEPLOYMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.BooleanParameterImpl <em>Boolean Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.BooleanParameterImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getBooleanParameter()
   * @generated
   */
  int BOOLEAN_PARAMETER = 10;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PARAMETER__FEATURE = PARAMETER__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PARAMETER__DEPLOYMENT = PARAMETER__DEPLOYMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.StringParameterImpl <em>String Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.StringParameterImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getStringParameter()
   * @generated
   */
  int STRING_PARAMETER = 11;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PARAMETER__FEATURE = PARAMETER__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PARAMETER__DEPLOYMENT = PARAMETER__DEPLOYMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.CharParameterImpl <em>Char Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.CharParameterImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getCharParameter()
   * @generated
   */
  int CHAR_PARAMETER = 12;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_PARAMETER__FEATURE = PARAMETER__FEATURE;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_PARAMETER__DEPLOYMENT = PARAMETER__DEPLOYMENT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Char Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.CreatorImpl <em>Creator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.CreatorImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getCreator()
   * @generated
   */
  int CREATOR = 13;

  /**
   * The feature id for the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__OPERATION = 0;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__DEPLOYMENT = 1;

  /**
   * The feature id for the '<em><b>Product</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR__PRODUCT = 2;

  /**
   * The number of structural features of the '<em>Creator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.impl.ListenerImpl <em>Listener</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.impl.ListenerImpl
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getListener()
   * @generated
   */
  int LISTENER = 14;

  /**
   * The feature id for the '<em><b>Deployment</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTENER__DEPLOYMENT = 0;

  /**
   * The feature id for the '<em><b>Notifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTENER__NOTIFIER = 1;

  /**
   * The number of structural features of the '<em>Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LISTENER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.deploy.DeploymentType <em>Deployment Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.deploy.DeploymentType
   * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDeploymentType()
   * @generated
   */
  int DEPLOYMENT_TYPE = 15;

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see com.sympedia.density.gen.deploy.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Container#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sympedia.density.gen.deploy.Container#getName()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Name();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Container#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see com.sympedia.density.gen.deploy.Container#getPackageName()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_PackageName();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Container#isIncomplete <em>Incomplete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Incomplete</em>'.
   * @see com.sympedia.density.gen.deploy.Container#isIncomplete()
   * @see #getContainer()
   * @generated
   */
  EAttribute getContainer_Incomplete();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploy.Container#getDeployments <em>Deployments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deployments</em>'.
   * @see com.sympedia.density.gen.deploy.Container#getDeployments()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Deployments();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploy.Container#getDeploymentGroups <em>Deployment Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deployment Groups</em>'.
   * @see com.sympedia.density.gen.deploy.Container#getDeploymentGroups()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_DeploymentGroups();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploy.Container#getAllDeployments <em>All Deployments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>All Deployments</em>'.
   * @see com.sympedia.density.gen.deploy.Container#getAllDeployments()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_AllDeployments();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.Deployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment
   * @generated
   */
  EClass getDeployment();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploy.Deployment#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getComponent()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Component();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Deployment#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getId()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Id();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Deployment#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getType()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Type();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Deployment#isSingleton <em>Singleton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Singleton</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#isSingleton()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Singleton();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Deployment#isLazy <em>Lazy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lazy</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#isLazy()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Lazy();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Deployment#isPrototype <em>Prototype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Prototype</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#isPrototype()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Prototype();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Deployment#isInitialized <em>Initialized</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initialized</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#isInitialized()
   * @see #getDeployment()
   * @generated
   */
  EAttribute getDeployment_Initialized();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploy.Deployment#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Container</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getContainer()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Container();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploy.Deployment#getDeploymentGroup <em>Deployment Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Deployment Group</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getDeploymentGroup()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_DeploymentGroup();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploy.Deployment#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getDependencies()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Dependencies();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploy.Deployment#getCreators <em>Creators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Creators</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getCreators()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Creators();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploy.Deployment#getListeners <em>Listeners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Listeners</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getListeners()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Listeners();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploy.Deployment#getReferers <em>Referers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Referers</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getReferers()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Referers();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploy.Deployment#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Root</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getRoot()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Root();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.deploy.Deployment#getDepends <em>Depends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Depends</em>'.
   * @see com.sympedia.density.gen.deploy.Deployment#getDepends()
   * @see #getDeployment()
   * @generated
   */
  EReference getDeployment_Depends();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.DeploymentGroup <em>Deployment Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deployment Group</em>'.
   * @see com.sympedia.density.gen.deploy.DeploymentGroup
   * @generated
   */
  EClass getDeploymentGroup();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getContainer <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Container</em>'.
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getContainer()
   * @see #getDeploymentGroup()
   * @generated
   */
  EReference getDeploymentGroup_Container();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getSubGroups <em>Sub Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Groups</em>'.
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getSubGroups()
   * @see #getDeploymentGroup()
   * @generated
   */
  EReference getDeploymentGroup_SubGroups();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getSuperGroup <em>Super Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Super Group</em>'.
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getSuperGroup()
   * @see #getDeploymentGroup()
   * @generated
   */
  EReference getDeploymentGroup_SuperGroup();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getDeployments <em>Deployments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deployments</em>'.
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getDeployments()
   * @see #getDeploymentGroup()
   * @generated
   */
  EReference getDeploymentGroup_Deployments();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getName()
   * @see #getDeploymentGroup()
   * @generated
   */
  EAttribute getDeploymentGroup_Name();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see com.sympedia.density.gen.deploy.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see com.sympedia.density.gen.deploy.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploy.Dependency#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see com.sympedia.density.gen.deploy.Dependency#getFeature()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Feature();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploy.Dependency#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Deployment</em>'.
   * @see com.sympedia.density.gen.deploy.Dependency#getDeployment()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Deployment();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see com.sympedia.density.gen.deploy.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploy.Reference#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see com.sympedia.density.gen.deploy.Reference#getTarget()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Target();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.Reference#isListen <em>Listen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Listen</em>'.
   * @see com.sympedia.density.gen.deploy.Reference#isListen()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Listen();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.IntegerParameter <em>Integer Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Parameter</em>'.
   * @see com.sympedia.density.gen.deploy.IntegerParameter
   * @generated
   */
  EClass getIntegerParameter();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.IntegerParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.sympedia.density.gen.deploy.IntegerParameter#getValue()
   * @see #getIntegerParameter()
   * @generated
   */
  EAttribute getIntegerParameter_Value();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.LongParameter <em>Long Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Parameter</em>'.
   * @see com.sympedia.density.gen.deploy.LongParameter
   * @generated
   */
  EClass getLongParameter();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.LongParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.sympedia.density.gen.deploy.LongParameter#getValue()
   * @see #getLongParameter()
   * @generated
   */
  EAttribute getLongParameter_Value();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.FloatParameter <em>Float Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Parameter</em>'.
   * @see com.sympedia.density.gen.deploy.FloatParameter
   * @generated
   */
  EClass getFloatParameter();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.FloatParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.sympedia.density.gen.deploy.FloatParameter#getValue()
   * @see #getFloatParameter()
   * @generated
   */
  EAttribute getFloatParameter_Value();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.DoubleParameter <em>Double Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Parameter</em>'.
   * @see com.sympedia.density.gen.deploy.DoubleParameter
   * @generated
   */
  EClass getDoubleParameter();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.DoubleParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.sympedia.density.gen.deploy.DoubleParameter#getValue()
   * @see #getDoubleParameter()
   * @generated
   */
  EAttribute getDoubleParameter_Value();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.BooleanParameter <em>Boolean Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Parameter</em>'.
   * @see com.sympedia.density.gen.deploy.BooleanParameter
   * @generated
   */
  EClass getBooleanParameter();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.BooleanParameter#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.sympedia.density.gen.deploy.BooleanParameter#isValue()
   * @see #getBooleanParameter()
   * @generated
   */
  EAttribute getBooleanParameter_Value();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.StringParameter <em>String Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Parameter</em>'.
   * @see com.sympedia.density.gen.deploy.StringParameter
   * @generated
   */
  EClass getStringParameter();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.StringParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.sympedia.density.gen.deploy.StringParameter#getValue()
   * @see #getStringParameter()
   * @generated
   */
  EAttribute getStringParameter_Value();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.CharParameter <em>Char Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Parameter</em>'.
   * @see com.sympedia.density.gen.deploy.CharParameter
   * @generated
   */
  EClass getCharParameter();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.deploy.CharParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.sympedia.density.gen.deploy.CharParameter#getValue()
   * @see #getCharParameter()
   * @generated
   */
  EAttribute getCharParameter_Value();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.Creator <em>Creator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Creator</em>'.
   * @see com.sympedia.density.gen.deploy.Creator
   * @generated
   */
  EClass getCreator();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploy.Creator#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operation</em>'.
   * @see com.sympedia.density.gen.deploy.Creator#getOperation()
   * @see #getCreator()
   * @generated
   */
  EReference getCreator_Operation();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploy.Creator#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Deployment</em>'.
   * @see com.sympedia.density.gen.deploy.Creator#getDeployment()
   * @see #getCreator()
   * @generated
   */
  EReference getCreator_Deployment();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploy.Creator#getProduct <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Product</em>'.
   * @see com.sympedia.density.gen.deploy.Creator#getProduct()
   * @see #getCreator()
   * @generated
   */
  EReference getCreator_Product();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.deploy.Listener <em>Listener</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Listener</em>'.
   * @see com.sympedia.density.gen.deploy.Listener
   * @generated
   */
  EClass getListener();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.deploy.Listener#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Deployment</em>'.
   * @see com.sympedia.density.gen.deploy.Listener#getDeployment()
   * @see #getListener()
   * @generated
   */
  EReference getListener_Deployment();

  /**
   * Returns the meta object for the reference '{@link com.sympedia.density.gen.deploy.Listener#getNotifier <em>Notifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Notifier</em>'.
   * @see com.sympedia.density.gen.deploy.Listener#getNotifier()
   * @see #getListener()
   * @generated
   */
  EReference getListener_Notifier();

  /**
   * Returns the meta object for enum '{@link com.sympedia.density.gen.deploy.DeploymentType <em>Deployment Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Deployment Type</em>'.
   * @see com.sympedia.density.gen.deploy.DeploymentType
   * @generated
   */
  EEnum getDeploymentType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DeployFactory getDeployFactory();

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
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.ContainerImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__NAME = eINSTANCE.getContainer_Name();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__PACKAGE_NAME = eINSTANCE.getContainer_PackageName();

    /**
     * The meta object literal for the '<em><b>Incomplete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTAINER__INCOMPLETE = eINSTANCE.getContainer_Incomplete();

    /**
     * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__DEPLOYMENTS = eINSTANCE.getContainer_Deployments();

    /**
     * The meta object literal for the '<em><b>Deployment Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__DEPLOYMENT_GROUPS = eINSTANCE.getContainer_DeploymentGroups();

    /**
     * The meta object literal for the '<em><b>All Deployments</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__ALL_DEPLOYMENTS = eINSTANCE.getContainer_AllDeployments();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl <em>Deployment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.DeploymentImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDeployment()
     * @generated
     */
    EClass DEPLOYMENT = eINSTANCE.getDeployment();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__COMPONENT = eINSTANCE.getDeployment_Component();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__ID = eINSTANCE.getDeployment_Id();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__TYPE = eINSTANCE.getDeployment_Type();

    /**
     * The meta object literal for the '<em><b>Singleton</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__SINGLETON = eINSTANCE.getDeployment_Singleton();

    /**
     * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__LAZY = eINSTANCE.getDeployment_Lazy();

    /**
     * The meta object literal for the '<em><b>Prototype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__PROTOTYPE = eINSTANCE.getDeployment_Prototype();

    /**
     * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT__INITIALIZED = eINSTANCE.getDeployment_Initialized();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__CONTAINER = eINSTANCE.getDeployment_Container();

    /**
     * The meta object literal for the '<em><b>Deployment Group</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__DEPLOYMENT_GROUP = eINSTANCE.getDeployment_DeploymentGroup();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__DEPENDENCIES = eINSTANCE.getDeployment_Dependencies();

    /**
     * The meta object literal for the '<em><b>Creators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__CREATORS = eINSTANCE.getDeployment_Creators();

    /**
     * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__LISTENERS = eINSTANCE.getDeployment_Listeners();

    /**
     * The meta object literal for the '<em><b>Referers</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__REFERERS = eINSTANCE.getDeployment_Referers();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__ROOT = eINSTANCE.getDeployment_Root();

    /**
     * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT__DEPENDS = eINSTANCE.getDeployment_Depends();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl <em>Deployment Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDeploymentGroup()
     * @generated
     */
    EClass DEPLOYMENT_GROUP = eINSTANCE.getDeploymentGroup();

    /**
     * The meta object literal for the '<em><b>Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_GROUP__CONTAINER = eINSTANCE.getDeploymentGroup_Container();

    /**
     * The meta object literal for the '<em><b>Sub Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_GROUP__SUB_GROUPS = eINSTANCE.getDeploymentGroup_SubGroups();

    /**
     * The meta object literal for the '<em><b>Super Group</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_GROUP__SUPER_GROUP = eINSTANCE.getDeploymentGroup_SuperGroup();

    /**
     * The meta object literal for the '<em><b>Deployments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPLOYMENT_GROUP__DEPLOYMENTS = eINSTANCE.getDeploymentGroup_Deployments();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPLOYMENT_GROUP__NAME = eINSTANCE.getDeploymentGroup_Name();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.ParameterImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.DependencyImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__FEATURE = eINSTANCE.getDependency_Feature();

    /**
     * The meta object literal for the '<em><b>Deployment</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__DEPLOYMENT = eINSTANCE.getDependency_Deployment();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.ReferenceImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__TARGET = eINSTANCE.getReference_Target();

    /**
     * The meta object literal for the '<em><b>Listen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__LISTEN = eINSTANCE.getReference_Listen();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.IntegerParameterImpl <em>Integer Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.IntegerParameterImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getIntegerParameter()
     * @generated
     */
    EClass INTEGER_PARAMETER = eINSTANCE.getIntegerParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_PARAMETER__VALUE = eINSTANCE.getIntegerParameter_Value();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.LongParameterImpl <em>Long Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.LongParameterImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getLongParameter()
     * @generated
     */
    EClass LONG_PARAMETER = eINSTANCE.getLongParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LONG_PARAMETER__VALUE = eINSTANCE.getLongParameter_Value();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.FloatParameterImpl <em>Float Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.FloatParameterImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getFloatParameter()
     * @generated
     */
    EClass FLOAT_PARAMETER = eINSTANCE.getFloatParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_PARAMETER__VALUE = eINSTANCE.getFloatParameter_Value();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.DoubleParameterImpl <em>Double Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.DoubleParameterImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDoubleParameter()
     * @generated
     */
    EClass DOUBLE_PARAMETER = eINSTANCE.getDoubleParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_PARAMETER__VALUE = eINSTANCE.getDoubleParameter_Value();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.BooleanParameterImpl <em>Boolean Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.BooleanParameterImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getBooleanParameter()
     * @generated
     */
    EClass BOOLEAN_PARAMETER = eINSTANCE.getBooleanParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_PARAMETER__VALUE = eINSTANCE.getBooleanParameter_Value();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.StringParameterImpl <em>String Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.StringParameterImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getStringParameter()
     * @generated
     */
    EClass STRING_PARAMETER = eINSTANCE.getStringParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_PARAMETER__VALUE = eINSTANCE.getStringParameter_Value();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.CharParameterImpl <em>Char Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.CharParameterImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getCharParameter()
     * @generated
     */
    EClass CHAR_PARAMETER = eINSTANCE.getCharParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAR_PARAMETER__VALUE = eINSTANCE.getCharParameter_Value();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.CreatorImpl <em>Creator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.CreatorImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getCreator()
     * @generated
     */
    EClass CREATOR = eINSTANCE.getCreator();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATOR__OPERATION = eINSTANCE.getCreator_Operation();

    /**
     * The meta object literal for the '<em><b>Deployment</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATOR__DEPLOYMENT = eINSTANCE.getCreator_Deployment();

    /**
     * The meta object literal for the '<em><b>Product</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATOR__PRODUCT = eINSTANCE.getCreator_Product();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.impl.ListenerImpl <em>Listener</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.impl.ListenerImpl
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getListener()
     * @generated
     */
    EClass LISTENER = eINSTANCE.getListener();

    /**
     * The meta object literal for the '<em><b>Deployment</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LISTENER__DEPLOYMENT = eINSTANCE.getListener_Deployment();

    /**
     * The meta object literal for the '<em><b>Notifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LISTENER__NOTIFIER = eINSTANCE.getListener_Notifier();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.deploy.DeploymentType <em>Deployment Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.deploy.DeploymentType
     * @see com.sympedia.density.gen.deploy.impl.DeployPackageImpl#getDeploymentType()
     * @generated
     */
    EEnum DEPLOYMENT_TYPE = eINSTANCE.getDeploymentType();

  }

} //DeployPackage

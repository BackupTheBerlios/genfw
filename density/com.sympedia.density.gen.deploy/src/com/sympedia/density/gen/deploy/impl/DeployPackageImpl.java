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
package com.sympedia.density.gen.deploy.impl;


import com.sympedia.density.gen.deploy.BooleanParameter;
import com.sympedia.density.gen.deploy.CharParameter;
import com.sympedia.density.gen.deploy.Container;
import com.sympedia.density.gen.deploy.Creator;
import com.sympedia.density.gen.deploy.Dependency;
import com.sympedia.density.gen.deploy.DeployFactory;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.DeploymentGroup;
import com.sympedia.density.gen.deploy.DeploymentType;
import com.sympedia.density.gen.deploy.DoubleParameter;
import com.sympedia.density.gen.deploy.FloatParameter;
import com.sympedia.density.gen.deploy.IntegerParameter;
import com.sympedia.density.gen.deploy.Listener;
import com.sympedia.density.gen.deploy.LongParameter;
import com.sympedia.density.gen.deploy.Parameter;
import com.sympedia.density.gen.deploy.Reference;
import com.sympedia.density.gen.deploy.StringParameter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeployPackageImpl extends EPackageImpl implements DeployPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deploymentGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass charParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listenerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum deploymentTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.sympedia.density.gen.deploy.DeployPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DeployPackageImpl()
  {
    super(eNS_URI, DeployFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DeployPackage init()
  {
    if (isInited)
      return (DeployPackage)EPackage.Registry.INSTANCE.getEPackage(DeployPackage.eNS_URI);

    // Obtain or create and register package
    DeployPackageImpl theDeployPackage = (DeployPackageImpl)(EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) instanceof DeployPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) : new DeployPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDeployPackage.createPackageContents();

    // Initialize created meta-data
    theDeployPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDeployPackage.freeze();

    return theDeployPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainer()
  {
    return containerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Name()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_PackageName()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainer_Incomplete()
  {
    return (EAttribute)containerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_Deployments()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_DeploymentGroups()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainer_AllDeployments()
  {
    return (EReference)containerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeployment()
  {
    return deploymentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Component()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployment_Id()
  {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployment_Type()
  {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployment_Singleton()
  {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployment_Lazy()
  {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployment_Prototype()
  {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeployment_Initialized()
  {
    return (EAttribute)deploymentEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Container()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_DeploymentGroup()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Dependencies()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Creators()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Listeners()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Referers()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Root()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeployment_Depends()
  {
    return (EReference)deploymentEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeploymentGroup()
  {
    return deploymentGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentGroup_Container()
  {
    return (EReference)deploymentGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentGroup_SubGroups()
  {
    return (EReference)deploymentGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentGroup_SuperGroup()
  {
    return (EReference)deploymentGroupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeploymentGroup_Deployments()
  {
    return (EReference)deploymentGroupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeploymentGroup_Name()
  {
    return (EAttribute)deploymentGroupEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Feature()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Deployment()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Target()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReference_Listen()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerParameter()
  {
    return integerParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerParameter_Value()
  {
    return (EAttribute)integerParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongParameter()
  {
    return longParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLongParameter_Value()
  {
    return (EAttribute)longParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatParameter()
  {
    return floatParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloatParameter_Value()
  {
    return (EAttribute)floatParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleParameter()
  {
    return doubleParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleParameter_Value()
  {
    return (EAttribute)doubleParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanParameter()
  {
    return booleanParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanParameter_Value()
  {
    return (EAttribute)booleanParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringParameter()
  {
    return stringParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringParameter_Value()
  {
    return (EAttribute)stringParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCharParameter()
  {
    return charParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCharParameter_Value()
  {
    return (EAttribute)charParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreator()
  {
    return creatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreator_Operation()
  {
    return (EReference)creatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreator_Deployment()
  {
    return (EReference)creatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreator_Product()
  {
    return (EReference)creatorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListener()
  {
    return listenerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListener_Deployment()
  {
    return (EReference)listenerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListener_Notifier()
  {
    return (EReference)listenerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDeploymentType()
  {
    return deploymentTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployFactory getDeployFactory()
  {
    return (DeployFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    containerEClass = createEClass(CONTAINER);
    createEAttribute(containerEClass, CONTAINER__NAME);
    createEAttribute(containerEClass, CONTAINER__PACKAGE_NAME);
    createEAttribute(containerEClass, CONTAINER__INCOMPLETE);
    createEReference(containerEClass, CONTAINER__DEPLOYMENTS);
    createEReference(containerEClass, CONTAINER__DEPLOYMENT_GROUPS);
    createEReference(containerEClass, CONTAINER__ALL_DEPLOYMENTS);

    deploymentEClass = createEClass(DEPLOYMENT);
    createEReference(deploymentEClass, DEPLOYMENT__COMPONENT);
    createEAttribute(deploymentEClass, DEPLOYMENT__ID);
    createEAttribute(deploymentEClass, DEPLOYMENT__TYPE);
    createEAttribute(deploymentEClass, DEPLOYMENT__SINGLETON);
    createEAttribute(deploymentEClass, DEPLOYMENT__LAZY);
    createEAttribute(deploymentEClass, DEPLOYMENT__PROTOTYPE);
    createEAttribute(deploymentEClass, DEPLOYMENT__INITIALIZED);
    createEReference(deploymentEClass, DEPLOYMENT__CONTAINER);
    createEReference(deploymentEClass, DEPLOYMENT__DEPLOYMENT_GROUP);
    createEReference(deploymentEClass, DEPLOYMENT__DEPENDENCIES);
    createEReference(deploymentEClass, DEPLOYMENT__CREATORS);
    createEReference(deploymentEClass, DEPLOYMENT__LISTENERS);
    createEReference(deploymentEClass, DEPLOYMENT__REFERERS);
    createEReference(deploymentEClass, DEPLOYMENT__ROOT);
    createEReference(deploymentEClass, DEPLOYMENT__DEPENDS);

    deploymentGroupEClass = createEClass(DEPLOYMENT_GROUP);
    createEReference(deploymentGroupEClass, DEPLOYMENT_GROUP__CONTAINER);
    createEReference(deploymentGroupEClass, DEPLOYMENT_GROUP__SUB_GROUPS);
    createEReference(deploymentGroupEClass, DEPLOYMENT_GROUP__SUPER_GROUP);
    createEReference(deploymentGroupEClass, DEPLOYMENT_GROUP__DEPLOYMENTS);
    createEAttribute(deploymentGroupEClass, DEPLOYMENT_GROUP__NAME);

    parameterEClass = createEClass(PARAMETER);

    dependencyEClass = createEClass(DEPENDENCY);
    createEReference(dependencyEClass, DEPENDENCY__FEATURE);
    createEReference(dependencyEClass, DEPENDENCY__DEPLOYMENT);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__TARGET);
    createEAttribute(referenceEClass, REFERENCE__LISTEN);

    integerParameterEClass = createEClass(INTEGER_PARAMETER);
    createEAttribute(integerParameterEClass, INTEGER_PARAMETER__VALUE);

    longParameterEClass = createEClass(LONG_PARAMETER);
    createEAttribute(longParameterEClass, LONG_PARAMETER__VALUE);

    floatParameterEClass = createEClass(FLOAT_PARAMETER);
    createEAttribute(floatParameterEClass, FLOAT_PARAMETER__VALUE);

    doubleParameterEClass = createEClass(DOUBLE_PARAMETER);
    createEAttribute(doubleParameterEClass, DOUBLE_PARAMETER__VALUE);

    booleanParameterEClass = createEClass(BOOLEAN_PARAMETER);
    createEAttribute(booleanParameterEClass, BOOLEAN_PARAMETER__VALUE);

    stringParameterEClass = createEClass(STRING_PARAMETER);
    createEAttribute(stringParameterEClass, STRING_PARAMETER__VALUE);

    charParameterEClass = createEClass(CHAR_PARAMETER);
    createEAttribute(charParameterEClass, CHAR_PARAMETER__VALUE);

    creatorEClass = createEClass(CREATOR);
    createEReference(creatorEClass, CREATOR__OPERATION);
    createEReference(creatorEClass, CREATOR__DEPLOYMENT);
    createEReference(creatorEClass, CREATOR__PRODUCT);

    listenerEClass = createEClass(LISTENER);
    createEReference(listenerEClass, LISTENER__DEPLOYMENT);
    createEReference(listenerEClass, LISTENER__NOTIFIER);

    // Create enums
    deploymentTypeEEnum = createEEnum(DEPLOYMENT_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Add supertypes to classes
    parameterEClass.getESuperTypes().add(this.getDependency());
    referenceEClass.getESuperTypes().add(this.getDependency());
    integerParameterEClass.getESuperTypes().add(this.getParameter());
    longParameterEClass.getESuperTypes().add(this.getParameter());
    floatParameterEClass.getESuperTypes().add(this.getParameter());
    doubleParameterEClass.getESuperTypes().add(this.getParameter());
    booleanParameterEClass.getESuperTypes().add(this.getParameter());
    stringParameterEClass.getESuperTypes().add(this.getParameter());
    charParameterEClass.getESuperTypes().add(this.getParameter());

    // Initialize classes and features; add operations and parameters
    initEClass(containerEClass, Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1,
            Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_PackageName(), ecorePackage.getEString(), "packageName", null, 0,
            1, Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContainer_Incomplete(), ecorePackage.getEBoolean(), "incomplete", null, 0, 1,
            Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_Deployments(), this.getDeployment(),
            this.getDeployment_Container(), "deployments", null, 0, -1, Container.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_DeploymentGroups(), this.getDeploymentGroup(), this
            .getDeploymentGroup_Container(), "deploymentGroups", null, 0, -1, Container.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContainer_AllDeployments(), this.getDeployment(), null, "allDeployments",
            null, 0, -1, Container.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeployment_Component(), ecorePackage.getEClass(), null, "component", null, 1,
            1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployment_Id(), ecorePackage.getEString(), "id", null, 0, 1,
            Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployment_Type(), this.getDeploymentType(), "type", "Singleton", 0, 1,
            Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployment_Singleton(), ecorePackage.getEBoolean(), "singleton", "true", 0,
            1, Deployment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployment_Lazy(), ecorePackage.getEBoolean(), "lazy", "true", 0, 1,
            Deployment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployment_Prototype(), ecorePackage.getEBoolean(), "prototype", "true", 0,
            1, Deployment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeployment_Initialized(), ecorePackage.getEBoolean(), "initialized", "true",
            0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Container(), this.getContainer(), this.getContainer_Deployments(),
            "container", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_DeploymentGroup(), this.getDeploymentGroup(), this
            .getDeploymentGroup_Deployments(), "deploymentGroup", null, 0, 1, Deployment.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Dependencies(), this.getDependency(), this
            .getDependency_Deployment(), "dependencies", null, 0, -1, Deployment.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Creators(), this.getCreator(), this.getCreator_Deployment(),
            "creators", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Listeners(), this.getListener(), this.getListener_Deployment(),
            "listeners", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Referers(), this.getDeployment(), null, "referers", null, 0, -1,
            Deployment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Root(), this.getContainer(), null, "root", null, 1, 1,
            Deployment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDeployment_Depends(), this.getDeployment(), null, "depends", null, 0, -1,
            Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(deploymentGroupEClass, DeploymentGroup.class, "DeploymentGroup", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeploymentGroup_Container(), this.getContainer(), this
            .getContainer_DeploymentGroups(), "container", null, 0, 1, DeploymentGroup.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploymentGroup_SubGroups(), this.getDeploymentGroup(), this
            .getDeploymentGroup_SuperGroup(), "subGroups", null, 0, -1, DeploymentGroup.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploymentGroup_SuperGroup(), this.getDeploymentGroup(), this
            .getDeploymentGroup_SubGroups(), "superGroup", null, 0, 1, DeploymentGroup.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeploymentGroup_Deployments(), this.getDeployment(), this
            .getDeployment_DeploymentGroup(), "deployments", null, 0, -1, DeploymentGroup.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeploymentGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1,
            DeploymentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

    addEOperation(parameterEClass, ecorePackage.getEString(), "getValueString", 0, 1);

    initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependency_Feature(), ecorePackage.getEStructuralFeature(), null, "feature",
            null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDependency_Deployment(), this.getDeployment(), this
            .getDeployment_Dependencies(), "deployment", null, 1, 1, Dependency.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Target(), this.getDeployment(), null, "target", null, 1, 1,
            Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReference_Listen(), ecorePackage.getEBoolean(), "listen", "false", 0, 1,
            Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerParameterEClass, IntegerParameter.class, "IntegerParameter", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerParameter_Value(), ecorePackage.getEInt(), "value", null, 0, 1,
            IntegerParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(longParameterEClass, LongParameter.class, "LongParameter", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLongParameter_Value(), ecorePackage.getELong(), "value", null, 0, 1,
            LongParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(floatParameterEClass, FloatParameter.class, "FloatParameter", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloatParameter_Value(), ecorePackage.getEFloat(), "value", null, 0, 1,
            FloatParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleParameterEClass, DoubleParameter.class, "DoubleParameter", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleParameter_Value(), ecorePackage.getEDouble(), "value", null, 0, 1,
            DoubleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanParameterEClass, BooleanParameter.class, "BooleanParameter", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanParameter_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1,
            BooleanParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringParameterEClass, StringParameter.class, "StringParameter", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1,
            StringParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(charParameterEClass, CharParameter.class, "CharParameter", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCharParameter_Value(), ecorePackage.getEChar(), "value", null, 0, 1,
            CharParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(creatorEClass, Creator.class, "Creator", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCreator_Operation(), ecorePackage.getEOperation(), null, "operation", null,
            1, 1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreator_Deployment(), this.getDeployment(), this.getDeployment_Creators(),
            "deployment", null, 1, 1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreator_Product(), this.getDeployment(), null, "product", null, 1, 1,
            Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listenerEClass, Listener.class, "Listener", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListener_Deployment(), this.getDeployment(), this.getDeployment_Listeners(),
            "deployment", null, 1, 1, Listener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListener_Notifier(), this.getDeployment(), null, "notifier", null, 1, 1,
            Listener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(deploymentTypeEEnum, DeploymentType.class, "DeploymentType");
    addEEnumLiteral(deploymentTypeEEnum, DeploymentType.SINGLETON_LITERAL);
    addEEnumLiteral(deploymentTypeEEnum, DeploymentType.LAZY_SINGLETON_LITERAL);
    addEEnumLiteral(deploymentTypeEEnum, DeploymentType.PROTOTYPE_LITERAL);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.topcased.org/uuid
    createUuidAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.topcased.org/uuid</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createUuidAnnotations()
  {
    String source = "http://www.topcased.org/uuid";
    addAnnotation(this, source, new String[] {"uuid", "11350778856090"});
    addAnnotation(containerEClass, source, new String[] {"uuid", "11350778856251"});
    addAnnotation(getContainer_Name(), source, new String[] {"uuid", "11350778856252"});
    addAnnotation(getContainer_PackageName(), source, new String[] {"uuid", "11350778856253"});
    addAnnotation(getContainer_Incomplete(), source, new String[] {"uuid", "11350778856254"});
    addAnnotation(getContainer_Deployments(), source, new String[] {"uuid", "11350778856255"});
    addAnnotation(getContainer_DeploymentGroups(), source, new String[] {"uuid", "11350778856256"});
    addAnnotation(getContainer_AllDeployments(), source, new String[] {"uuid", "11350778856407"});
    addAnnotation(deploymentEClass, source, new String[] {"uuid", "11350778856408"});
    addAnnotation(getDeployment_Component(), source, new String[] {"uuid", "11350778856409"});
    addAnnotation(getDeployment_Id(), source, new String[] {"uuid", "113507788564010"});
    addAnnotation(getDeployment_Type(), source, new String[] {"uuid", "113507788564011"});
    addAnnotation(getDeployment_Singleton(), source, new String[] {"uuid", "113507788564012"});
    addAnnotation(getDeployment_Lazy(), source, new String[] {"uuid", "113507788564013"});
    addAnnotation(getDeployment_Prototype(), source, new String[] {"uuid", "113507788564014"});
    addAnnotation(getDeployment_Initialized(), source, new String[] {"uuid", "113507788565615"});
    addAnnotation(getDeployment_Container(), source, new String[] {"uuid", "113507788565616"});
    addAnnotation(getDeployment_DeploymentGroup(), source, new String[] {"uuid", "113507788565617"});
    addAnnotation(getDeployment_Dependencies(), source, new String[] {"uuid", "113507788565618"});
    addAnnotation(getDeployment_Creators(), source, new String[] {"uuid", "113507788565619"});
    addAnnotation(getDeployment_Listeners(), source, new String[] {"uuid", "113507788565620"});
    addAnnotation(getDeployment_Referers(), source, new String[] {"uuid", "113507788565621"});
    addAnnotation(getDeployment_Root(), source, new String[] {"uuid", "113507788565622"});
    addAnnotation(getDeployment_Depends(), source, new String[] {"uuid", "113568774160969"});
    addAnnotation(deploymentGroupEClass, source, new String[] {"uuid", "113507788567123"});
    addAnnotation(getDeploymentGroup_Container(), source, new String[] {"uuid", "113507788567124"});
    addAnnotation(getDeploymentGroup_SubGroups(), source, new String[] {"uuid", "113507788567125"});
    addAnnotation(getDeploymentGroup_SuperGroup(), source, new String[] {"uuid", "113507788567126"});
    addAnnotation(getDeploymentGroup_Deployments(), source,
            new String[] {"uuid", "113507788567127"});
    addAnnotation(getDeploymentGroup_Name(), source, new String[] {"uuid", "113507788567128"});
    addAnnotation(parameterEClass, source, new String[] {"uuid", "113507788567129"});
    addAnnotation((EOperation)parameterEClass.getEOperations().get(0), source, new String[] {
            "uuid", "113507788567130"});
    addAnnotation(dependencyEClass, source, new String[] {"uuid", "113507788568731"});
    addAnnotation(getDependency_Feature(), source, new String[] {"uuid", "113507788568732"});
    addAnnotation(getDependency_Deployment(), source, new String[] {"uuid", "113507788568733"});
    addAnnotation(referenceEClass, source, new String[] {"uuid", "113507788568734"});
    addAnnotation(getReference_Target(), source, new String[] {"uuid", "113507788568735"});
    addAnnotation(getReference_Listen(), source, new String[] {"uuid", "113507788568736"});
    addAnnotation(integerParameterEClass, source, new String[] {"uuid", "113507788568737"});
    addAnnotation(getIntegerParameter_Value(), source, new String[] {"uuid", "113507788568738"});
    addAnnotation(longParameterEClass, source, new String[] {"uuid", "113507788570339"});
    addAnnotation(getLongParameter_Value(), source, new String[] {"uuid", "113507788570340"});
    addAnnotation(floatParameterEClass, source, new String[] {"uuid", "113507788570341"});
    addAnnotation(getFloatParameter_Value(), source, new String[] {"uuid", "113507788570342"});
    addAnnotation(doubleParameterEClass, source, new String[] {"uuid", "113507788570343"});
    addAnnotation(getDoubleParameter_Value(), source, new String[] {"uuid", "113507788570344"});
    addAnnotation(booleanParameterEClass, source, new String[] {"uuid", "113507788570345"});
    addAnnotation(getBooleanParameter_Value(), source, new String[] {"uuid", "113507788571846"});
    addAnnotation(stringParameterEClass, source, new String[] {"uuid", "113507788571847"});
    addAnnotation(getStringParameter_Value(), source, new String[] {"uuid", "113507788571848"});
    addAnnotation(charParameterEClass, source, new String[] {"uuid", "113507788571849"});
    addAnnotation(getCharParameter_Value(), source, new String[] {"uuid", "113507788571850"});
    addAnnotation(creatorEClass, source, new String[] {"uuid", "113507788571851"});
    addAnnotation(getCreator_Operation(), source, new String[] {"uuid", "113507788571852"});
    addAnnotation(getCreator_Deployment(), source, new String[] {"uuid", "113507788573453"});
    addAnnotation(getCreator_Product(), source, new String[] {"uuid", "113507788573454"});
    addAnnotation(listenerEClass, source, new String[] {"uuid", "113507788573455"});
    addAnnotation(getListener_Deployment(), source, new String[] {"uuid", "113507788573456"});
    addAnnotation(getListener_Notifier(), source, new String[] {"uuid", "113507788573457"});
    addAnnotation(deploymentTypeEEnum, source, new String[] {"uuid", "113507788573458"});
    addAnnotation((EEnumLiteral)deploymentTypeEEnum.getELiterals().get(0), source, new String[] {
            "uuid", "113507788573459"});
    addAnnotation((EEnumLiteral)deploymentTypeEEnum.getELiterals().get(1), source, new String[] {
            "uuid", "113507788573460"});
    addAnnotation((EEnumLiteral)deploymentTypeEEnum.getELiterals().get(2), source, new String[] {
            "uuid", "113507788573461"});
  }

} //DeployPackageImpl

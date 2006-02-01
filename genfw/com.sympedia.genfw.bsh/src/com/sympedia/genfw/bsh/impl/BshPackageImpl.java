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
package com.sympedia.genfw.bsh.impl;


import bsh.Interpreter;

import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.bsh.BeanShellRule;
import com.sympedia.genfw.bsh.BeanShellTransformation;
import com.sympedia.genfw.bsh.BshFactory;
import com.sympedia.genfw.bsh.BshPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BshPackageImpl extends EPackageImpl implements BshPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beanShellRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beanShellTransformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType bshInterpreterEDataType = null;

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
   * @see com.sympedia.genfw.bsh.BshPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BshPackageImpl()
  {
    super(eNS_URI, BshFactory.eINSTANCE);
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
  public static BshPackage init()
  {
    if (isInited) return (BshPackage)EPackage.Registry.INSTANCE.getEPackage(BshPackage.eNS_URI);

    // Obtain or create and register package
    BshPackageImpl theBshPackage = (BshPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof BshPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI)
            : new BshPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    GenfwPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theBshPackage.createPackageContents();

    // Initialize created meta-data
    theBshPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBshPackage.freeze();

    return theBshPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeanShellRule()
  {
    return beanShellRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanShellRule_BootstrapCode()
  {
    return (EAttribute)beanShellRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeanShellTransformation()
  {
    return beanShellTransformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanShellTransformation_TransformationCode()
  {
    return (EAttribute)beanShellTransformationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanShellTransformation_BootstrapCode()
  {
    return (EAttribute)beanShellTransformationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBshInterpreter()
  {
    return bshInterpreterEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BshFactory getBshFactory()
  {
    return (BshFactory)getEFactoryInstance();
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
    beanShellRuleEClass = createEClass(BEAN_SHELL_RULE);
    createEAttribute(beanShellRuleEClass, BEAN_SHELL_RULE__BOOTSTRAP_CODE);

    beanShellTransformationEClass = createEClass(BEAN_SHELL_TRANSFORMATION);
    createEAttribute(beanShellTransformationEClass, BEAN_SHELL_TRANSFORMATION__TRANSFORMATION_CODE);
    createEAttribute(beanShellTransformationEClass, BEAN_SHELL_TRANSFORMATION__BOOTSTRAP_CODE);

    // Create data types
    bshInterpreterEDataType = createEDataType(BSH_INTERPRETER);
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

    // Obtain other dependent packages
    GenfwPackage theGenfwPackage = (GenfwPackage)EPackage.Registry.INSTANCE
            .getEPackage(GenfwPackage.eNS_URI);

    // Add supertypes to classes
    beanShellRuleEClass.getESuperTypes().add(theGenfwPackage.getExpressionBasedRule());
    beanShellTransformationEClass.getESuperTypes().add(theGenfwPackage.getDomTransformation());

    // Initialize classes and features; add operations and parameters
    initEClass(beanShellRuleEClass, BeanShellRule.class, "BeanShellRule", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBeanShellRule_BootstrapCode(), ecorePackage.getEString(), "bootstrapCode",
            null, 0, 1, BeanShellRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beanShellTransformationEClass, BeanShellTransformation.class,
            "BeanShellTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBeanShellTransformation_TransformationCode(), ecorePackage.getEString(),
            "transformationCode", "return false;", 1, 1, BeanShellTransformation.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBeanShellTransformation_BootstrapCode(), ecorePackage.getEString(),
            "bootstrapCode", null, 0, 1, BeanShellTransformation.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(bshInterpreterEDataType, Interpreter.class, "BshInterpreter", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.topcased.org/uuid
    createUuidAnnotations();
    // http://www.sympedia.com/2006/celleditor
    createCelleditorAnnotations();
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
    addAnnotation(this, source, new String[] {"uuid", "11372283250310"});
    addAnnotation(bshInterpreterEDataType, source, new String[] {"uuid", "11372283250313"});
    addAnnotation(beanShellRuleEClass, source, new String[] {"uuid", "11372283250311"});
    addAnnotation(getBeanShellRule_BootstrapCode(), source, new String[] {"uuid", "11372283250312"});
    addAnnotation(beanShellTransformationEClass, source, new String[] {"uuid", "113879626546712"});
    addAnnotation(getBeanShellTransformation_TransformationCode(), source, new String[] {"uuid",
            "113879629165415"});
    addAnnotation(getBeanShellTransformation_BootstrapCode(), source, new String[] {"uuid",
            "113879666923218"});
  }

  /**
   * Initializes the annotations for <b>http://www.sympedia.com/2006/celleditor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createCelleditorAnnotations()
  {
    String source = "http://www.sympedia.com/2006/celleditor";
    addAnnotation(getBeanShellRule_BootstrapCode(), source, new String[] {"editor.id",
            "com.sympedia.Multiline"});
    addAnnotation(getBeanShellTransformation_TransformationCode(), source, new String[] {
            "editor.id", "com.sympedia.Multiline"});
    addAnnotation(getBeanShellTransformation_BootstrapCode(), source, new String[] {"editor.id",
            "com.sympedia.Multiline"});
  }

} //BshPackageImpl

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
package com.sympedia.genfw.ocl.impl;


import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.ocl.ConfigurableOclRule;
import com.sympedia.genfw.ocl.DynamicPackage;
import com.sympedia.genfw.ocl.OclFactory;
import com.sympedia.genfw.ocl.OclPackage;
import com.sympedia.genfw.ocl.OclRule;
import com.sympedia.genfw.ocl.PackageConfiguration;
import com.sympedia.genfw.ocl.StaticPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class OclPackageImpl extends EPackageImpl implements OclPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oclRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurableOclRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dynamicPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType ePackageRegistryEDataType = null;

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
   * @see com.sympedia.genfw.ocl.OclPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OclPackageImpl()
  {
    super(eNS_URI, OclFactory.eINSTANCE);
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
  public static OclPackage init()
  {
    if (isInited) return (OclPackage)EPackage.Registry.INSTANCE.getEPackage(OclPackage.eNS_URI);

    // Obtain or create and register package
    OclPackageImpl theOclPackage = (OclPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof OclPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI)
            : new OclPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    GenfwPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theOclPackage.createPackageContents();

    // Initialize created meta-data
    theOclPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOclPackage.freeze();

    return theOclPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOclRule()
  {
    return oclRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigurableOclRule()
  {
    return configurableOclRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigurableOclRule_Packages()
  {
    return (EReference)configurableOclRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageConfiguration()
  {
    return packageConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageConfiguration_OclRule()
  {
    return (EReference)packageConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDynamicPackage()
  {
    return dynamicPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDynamicPackage_EcoreFile()
  {
    return (EAttribute)dynamicPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticPackage()
  {
    return staticPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticPackage_NsURI()
  {
    return (EAttribute)staticPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEPackageRegistry()
  {
    return ePackageRegistryEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OclFactory getOclFactory()
  {
    return (OclFactory)getEFactoryInstance();
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
    oclRuleEClass = createEClass(OCL_RULE);

    configurableOclRuleEClass = createEClass(CONFIGURABLE_OCL_RULE);
    createEReference(configurableOclRuleEClass, CONFIGURABLE_OCL_RULE__PACKAGES);

    packageConfigurationEClass = createEClass(PACKAGE_CONFIGURATION);
    createEReference(packageConfigurationEClass, PACKAGE_CONFIGURATION__OCL_RULE);

    dynamicPackageEClass = createEClass(DYNAMIC_PACKAGE);
    createEAttribute(dynamicPackageEClass, DYNAMIC_PACKAGE__ECORE_FILE);

    staticPackageEClass = createEClass(STATIC_PACKAGE);
    createEAttribute(staticPackageEClass, STATIC_PACKAGE__NS_URI);

    // Create data types
    ePackageRegistryEDataType = createEDataType(EPACKAGE_REGISTRY);
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
    oclRuleEClass.getESuperTypes().add(theGenfwPackage.getExpressionBasedRule());
    configurableOclRuleEClass.getESuperTypes().add(this.getOclRule());
    dynamicPackageEClass.getESuperTypes().add(this.getPackageConfiguration());
    staticPackageEClass.getESuperTypes().add(this.getPackageConfiguration());

    // Initialize classes and features; add operations and parameters
    initEClass(oclRuleEClass, OclRule.class, "OclRule", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(oclRuleEClass, this.getEPackageRegistry(), "getPackageRegistry",
            0, 1);
    addEException(op, theGenfwPackage.getException());

    initEClass(configurableOclRuleEClass, ConfigurableOclRule.class, "ConfigurableOclRule",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConfigurableOclRule_Packages(), this.getPackageConfiguration(), this
            .getPackageConfiguration_OclRule(), "packages", null, 0, -1, ConfigurableOclRule.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageConfigurationEClass, PackageConfiguration.class, "PackageConfiguration",
            IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackageConfiguration_OclRule(), this.getConfigurableOclRule(), this
            .getConfigurableOclRule_Packages(), "oclRule", null, 1, 1, PackageConfiguration.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(packageConfigurationEClass, ecorePackage.getEPackage(), "getPackage", 0, 1);
    addEException(op, theGenfwPackage.getException());

    initEClass(dynamicPackageEClass, DynamicPackage.class, "DynamicPackage", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDynamicPackage_EcoreFile(), ecorePackage.getEString(), "ecoreFile", null, 1,
            1, DynamicPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(staticPackageEClass, StaticPackage.class, "StaticPackage", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStaticPackage_NsURI(), ecorePackage.getEString(), "nsURI", null, 1, 1,
            StaticPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(ePackageRegistryEDataType, Registry.class, "EPackageRegistry", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);

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
    addAnnotation(this, source, new String[] {"uuid", "11386873328120"});
    addAnnotation(oclRuleEClass, source, new String[] {"uuid", "11386876143283"});
    addAnnotation((EOperation)oclRuleEClass.getEOperations().get(0), source, new String[] {"uuid",
            "11386877979216"});
    addAnnotation(ePackageRegistryEDataType, source, new String[] {"uuid", "11386878880789"});
    addAnnotation(configurableOclRuleEClass, source, new String[] {"uuid", "113868806912512"});
    addAnnotation(getConfigurableOclRule_Packages(), source, new String[] {"uuid",
            "113868822318715"});
    addAnnotation(packageConfigurationEClass, source, new String[] {"uuid", "113868818687515"});
    addAnnotation((EOperation)packageConfigurationEClass.getEOperations().get(0), source,
            new String[] {"uuid", "113868818687516"});
    addAnnotation(getPackageConfiguration_OclRule(), source, new String[] {"uuid",
            "113868822318722"});
    addAnnotation(dynamicPackageEClass, source, new String[] {"uuid", "113868818687517"});
    addAnnotation(getDynamicPackage_EcoreFile(), source, new String[] {"uuid", "113868829778130"});
    addAnnotation(staticPackageEClass, source, new String[] {"uuid", "113868818687518"});
    addAnnotation(getStaticPackage_NsURI(), source, new String[] {"uuid", "113868829778134"});
  }

} //OclPackageImpl

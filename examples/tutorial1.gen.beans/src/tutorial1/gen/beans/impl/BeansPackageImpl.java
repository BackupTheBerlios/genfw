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
package tutorial1.gen.beans.impl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tutorial1.gen.beans.Bean;
import tutorial1.gen.beans.BeanLibrary;
import tutorial1.gen.beans.BeanProperty;
import tutorial1.gen.beans.BeansFactory;
import tutorial1.gen.beans.BeansPackage;
import tutorial1.gen.beans.NamedElement;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BeansPackageImpl extends EPackageImpl implements BeansPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beanLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beanPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

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
   * @see tutorial1.gen.beans.BeansPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BeansPackageImpl()
  {
    super(eNS_URI, BeansFactory.eINSTANCE);
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
  public static BeansPackage init()
  {
    if (isInited)
      return (BeansPackage)EPackage.Registry.INSTANCE.getEPackage(BeansPackage.eNS_URI);

    // Obtain or create and register package
    BeansPackageImpl theBeansPackage = (BeansPackageImpl)(EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) instanceof BeansPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) : new BeansPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBeansPackage.createPackageContents();

    // Initialize created meta-data
    theBeansPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBeansPackage.freeze();

    return theBeansPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeanLibrary()
  {
    return beanLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanLibrary_PackageName()
  {
    return (EAttribute)beanLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeanLibrary_Beans()
  {
    return (EReference)beanLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBean()
  {
    return beanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBean_BeanLibrary()
  {
    return (EReference)beanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBean_Properties()
  {
    return (EReference)beanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeanProperty()
  {
    return beanPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanProperty_TypeName()
  {
    return (EAttribute)beanPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBeanProperty_Bean()
  {
    return (EReference)beanPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBeanProperty_Changeable()
  {
    return (EAttribute)beanPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeansFactory getBeansFactory()
  {
    return (BeansFactory)getEFactoryInstance();
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
    beanLibraryEClass = createEClass(BEAN_LIBRARY);
    createEAttribute(beanLibraryEClass, BEAN_LIBRARY__PACKAGE_NAME);
    createEReference(beanLibraryEClass, BEAN_LIBRARY__BEANS);

    beanEClass = createEClass(BEAN);
    createEReference(beanEClass, BEAN__BEAN_LIBRARY);
    createEReference(beanEClass, BEAN__PROPERTIES);

    beanPropertyEClass = createEClass(BEAN_PROPERTY);
    createEAttribute(beanPropertyEClass, BEAN_PROPERTY__TYPE_NAME);
    createEReference(beanPropertyEClass, BEAN_PROPERTY__BEAN);
    createEAttribute(beanPropertyEClass, BEAN_PROPERTY__CHANGEABLE);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
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
    beanLibraryEClass.getESuperTypes().add(this.getNamedElement());
    beanEClass.getESuperTypes().add(this.getNamedElement());
    beanPropertyEClass.getESuperTypes().add(this.getNamedElement());

    // Initialize classes and features; add operations and parameters
    initEClass(beanLibraryEClass, BeanLibrary.class, "BeanLibrary", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBeanLibrary_PackageName(), ecorePackage.getEString(), "packageName", null, 1,
            1, BeanLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeanLibrary_Beans(), this.getBean(), this.getBean_BeanLibrary(), "beans",
            null, 1, -1, BeanLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beanEClass, Bean.class, "Bean", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBean_BeanLibrary(), this.getBeanLibrary(), this.getBeanLibrary_Beans(),
            "beanLibrary", null, 1, 1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBean_Properties(), this.getBeanProperty(), this.getBeanProperty_Bean(),
            "properties", null, 1, -1, Bean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beanPropertyEClass, BeanProperty.class, "BeanProperty", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBeanProperty_TypeName(), ecorePackage.getEString(), "typeName", null, 1, 1,
            BeanProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBeanProperty_Bean(), this.getBean(), this.getBean_Properties(), "bean", null,
            1, 1, BeanProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBeanProperty_Changeable(), ecorePackage.getEBoolean(), "changeable", null, 0,
            1, BeanProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
            NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    addAnnotation(this, source, new String[] {"uuid", "11380327744840"});
    addAnnotation(beanLibraryEClass, source, new String[] {"uuid", "11380328734373"});
    addAnnotation(getBeanLibrary_PackageName(), source, new String[] {"uuid", "11380328734374"});
    addAnnotation(getBeanLibrary_Beans(), source, new String[] {"uuid", "11380330393759"});
    addAnnotation(beanEClass, source, new String[] {"uuid", "11380328734375"});
    addAnnotation(getBean_BeanLibrary(), source, new String[] {"uuid", "113803303937513"});
    addAnnotation(getBean_Properties(), source, new String[] {"uuid", "113803303937514"});
    addAnnotation(beanPropertyEClass, source, new String[] {"uuid", "11380328734376"});
    addAnnotation(getBeanProperty_TypeName(), source, new String[] {"uuid", "113803294367115"});
    addAnnotation(getBeanProperty_Bean(), source, new String[] {"uuid", "113803303937521"});
    addAnnotation(getBeanProperty_Changeable(), source, new String[] {"uuid", "113803303937522"});
    addAnnotation(namedElementEClass, source, new String[] {"uuid", "11380328734377"});
    addAnnotation(getNamedElement_Name(), source, new String[] {"uuid", "113803294367119"});
  }

} //BeansPackageImpl

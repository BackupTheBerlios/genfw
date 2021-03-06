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
package com.sympedia.genfw.jet.impl;


import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.jet.EcoreTemplate;
import com.sympedia.genfw.jet.EmfGenerator;
import com.sympedia.genfw.jet.GifColorer;
import com.sympedia.genfw.jet.JetFactory;
import com.sympedia.genfw.jet.JetPackage;
import com.sympedia.genfw.jet.JetTemplate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JetPackageImpl extends EPackageImpl implements JetPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jetTemplateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecoreTemplateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emfGeneratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gifColorerEClass = null;

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
   * @see com.sympedia.genfw.jet.JetPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JetPackageImpl()
  {
    super(eNS_URI, JetFactory.eINSTANCE);
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
  public static JetPackage init()
  {
    if (isInited) return (JetPackage)EPackage.Registry.INSTANCE.getEPackage(JetPackage.eNS_URI);

    // Obtain or create and register package
    JetPackageImpl theJetPackage = (JetPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JetPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI)
            : new JetPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    GenfwPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theJetPackage.createPackageContents();

    // Initialize created meta-data
    theJetPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJetPackage.freeze();

    return theJetPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJetTemplate()
  {
    return jetTemplateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJetTemplate_ClassName()
  {
    return (EAttribute)jetTemplateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEcoreTemplate()
  {
    return ecoreTemplateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEcoreTemplate_GenerateInterface()
  {
    return (EAttribute)ecoreTemplateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEcoreTemplate_GenerateImplementation()
  {
    return (EAttribute)ecoreTemplateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmfGenerator()
  {
    return emfGeneratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGifColorer()
  {
    return gifColorerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGifColorer_IconURL()
  {
    return (EAttribute)gifColorerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGifColorer_ColorKey1()
  {
    return (EAttribute)gifColorerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGifColorer_ColorKey2()
  {
    return (EAttribute)gifColorerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JetFactory getJetFactory()
  {
    return (JetFactory)getEFactoryInstance();
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
    jetTemplateEClass = createEClass(JET_TEMPLATE);
    createEAttribute(jetTemplateEClass, JET_TEMPLATE__CLASS_NAME);

    ecoreTemplateEClass = createEClass(ECORE_TEMPLATE);
    createEAttribute(ecoreTemplateEClass, ECORE_TEMPLATE__GENERATE_INTERFACE);
    createEAttribute(ecoreTemplateEClass, ECORE_TEMPLATE__GENERATE_IMPLEMENTATION);

    emfGeneratorEClass = createEClass(EMF_GENERATOR);

    gifColorerEClass = createEClass(GIF_COLORER);
    createEAttribute(gifColorerEClass, GIF_COLORER__ICON_URL);
    createEAttribute(gifColorerEClass, GIF_COLORER__COLOR_KEY1);
    createEAttribute(gifColorerEClass, GIF_COLORER__COLOR_KEY2);
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
    jetTemplateEClass.getESuperTypes().add(theGenfwPackage.getGenerator());
    ecoreTemplateEClass.getESuperTypes().add(this.getJetTemplate());
    emfGeneratorEClass.getESuperTypes().add(theGenfwPackage.getGenerator());
    gifColorerEClass.getESuperTypes().add(theGenfwPackage.getGenerator());

    // Initialize classes and features; add operations and parameters
    initEClass(jetTemplateEClass, JetTemplate.class, "JetTemplate", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJetTemplate_ClassName(), ecorePackage.getEString(), "className", null, 0, 1,
            JetTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ecoreTemplateEClass, EcoreTemplate.class, "EcoreTemplate", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEcoreTemplate_GenerateInterface(), ecorePackage.getEBoolean(),
            "generateInterface", "true", 0, 1, EcoreTemplate.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEcoreTemplate_GenerateImplementation(), ecorePackage.getEBoolean(),
            "generateImplementation", "true", 0, 1, EcoreTemplate.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emfGeneratorEClass, EmfGenerator.class, "EmfGenerator", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

    initEClass(gifColorerEClass, GifColorer.class, "GifColorer", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGifColorer_IconURL(), ecorePackage.getEString(), "iconURL", null, 1, 1,
            GifColorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGifColorer_ColorKey1(), ecorePackage.getEString(), "colorKey1", null, 0, 1,
            GifColorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGifColorer_ColorKey2(), ecorePackage.getEString(), "colorKey2", null, 0, 1,
            GifColorer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //JetPackageImpl

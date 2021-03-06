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
package com.sympedia.genfw.jmerge.impl;


import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.jmerge.JmergeFactory;
import com.sympedia.genfw.jmerge.Jmerger;
import com.sympedia.genfw.jmerge.PropertyMerger;

import com.sympedia.genfw.jmerge.JmergePackage;

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
public class JmergePackageImpl extends EPackageImpl implements JmergePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jmergerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyMergerEClass = null;

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
   * @see com.sympedia.genfw.jmerge.JmergePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JmergePackageImpl()
  {
    super(eNS_URI, JmergeFactory.eINSTANCE);
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
  public static JmergePackage init()
  {
    if (isInited)
      return (JmergePackage)EPackage.Registry.INSTANCE.getEPackage(JmergePackage.eNS_URI);

    // Obtain or create and register package
    JmergePackageImpl theJmergePackage = (JmergePackageImpl)(EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) instanceof JmergePackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) : new JmergePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    GenfwPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theJmergePackage.createPackageContents();

    // Initialize created meta-data
    theJmergePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJmergePackage.freeze();

    return theJmergePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJmerger()
  {
    return jmergerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJmerger_MergeXmlUri()
  {
    return (EAttribute)jmergerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyMerger()
  {
    return propertyMergerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JmergeFactory getJmergeFactory()
  {
    return (JmergeFactory)getEFactoryInstance();
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
    jmergerEClass = createEClass(JMERGER);
    createEAttribute(jmergerEClass, JMERGER__MERGE_XML_URI);

    propertyMergerEClass = createEClass(PROPERTY_MERGER);
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
    jmergerEClass.getESuperTypes().add(theGenfwPackage.getDelegatingGenerator());
    propertyMergerEClass.getESuperTypes().add(theGenfwPackage.getDelegatingGenerator());

    // Initialize classes and features; add operations and parameters
    initEClass(jmergerEClass, Jmerger.class, "Jmerger", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJmerger_MergeXmlUri(), ecorePackage.getEString(), "mergeXmlUri", null, 0, 1,
            Jmerger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyMergerEClass, PropertyMerger.class, "PropertyMerger", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //JmergePackageImpl

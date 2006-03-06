/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtPackageImpl.java,v 1.1 2006/03/06 07:56:47 stepper Exp $
 */
package com.sympedia.genfw.swt.impl;


import com.sympedia.genfw.GenfwPackage;

import com.sympedia.genfw.impl.GenfwPackageImpl;

import com.sympedia.genfw.swt.GifOverlayer;
import com.sympedia.genfw.swt.SwtFactory;
import com.sympedia.genfw.swt.SwtPackage;

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
public class SwtPackageImpl extends EPackageImpl implements SwtPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gifOverlayerEClass = null;

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
   * @see com.sympedia.genfw.swt.SwtPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SwtPackageImpl()
  {
    super(eNS_URI, SwtFactory.eINSTANCE);
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
  public static SwtPackage init()
  {
    if (isInited) return (SwtPackage)EPackage.Registry.INSTANCE.getEPackage(SwtPackage.eNS_URI);

    // Obtain or create and register package
    SwtPackageImpl theSwtPackage = (SwtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SwtPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI)
            : new SwtPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    GenfwPackageImpl.init();

    // Create package meta-data objects
    theSwtPackage.createPackageContents();

    // Initialize created meta-data
    theSwtPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSwtPackage.freeze();

    return theSwtPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGifOverlayer()
  {
    return gifOverlayerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGifOverlayer_OverlayURL()
  {
    return (EAttribute)gifOverlayerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGifOverlayer_Underlay()
  {
    return (EAttribute)gifOverlayerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwtFactory getSwtFactory()
  {
    return (SwtFactory)getEFactoryInstance();
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
    gifOverlayerEClass = createEClass(GIF_OVERLAYER);
    createEAttribute(gifOverlayerEClass, GIF_OVERLAYER__OVERLAY_URL);
    createEAttribute(gifOverlayerEClass, GIF_OVERLAYER__UNDERLAY);
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
    GenfwPackageImpl theGenfwPackage = (GenfwPackageImpl)EPackage.Registry.INSTANCE
            .getEPackage(GenfwPackage.eNS_URI);

    // Add supertypes to classes
    gifOverlayerEClass.getESuperTypes().add(theGenfwPackage.getGenerator());

    // Initialize classes and features; add operations and parameters
    initEClass(gifOverlayerEClass, GifOverlayer.class, "GifOverlayer", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGifOverlayer_OverlayURL(), ecorePackage.getEString(), "overlayURL", null, 0,
            1, GifOverlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGifOverlayer_Underlay(), ecorePackage.getEBoolean(), "underlay", null, 0, 1,
            GifOverlayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SwtPackageImpl

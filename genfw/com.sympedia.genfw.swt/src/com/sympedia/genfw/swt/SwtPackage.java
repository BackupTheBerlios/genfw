/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtPackage.java,v 1.2 2006/04/06 20:54:24 stepper Exp $
 */
package com.sympedia.genfw.swt;

import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.sympedia.genfw.swt.SwtFactory
 * @model kind="package"
 * @generated
 */
public interface SwtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "swt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sympedia.com/2006/genfw/swt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.sympedia.genfw.swt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SwtPackage eINSTANCE = com.sympedia.genfw.swt.impl.SwtPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.sympedia.genfw.swt.impl.GifOverlayerImpl <em>Gif Overlayer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sympedia.genfw.swt.impl.GifOverlayerImpl
	 * @see com.sympedia.genfw.swt.impl.SwtPackageImpl#getGifOverlayer()
	 * @generated
	 */
	int GIF_OVERLAYER = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_OVERLAYER__ROOT = GenfwPackage.GENERATOR__ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_OVERLAYER__NAME = GenfwPackage.GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Overlay URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_OVERLAYER__OVERLAY_URL = GenfwPackage.GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Underlay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_OVERLAYER__UNDERLAY = GenfwPackage.GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Gif Overlayer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIF_OVERLAYER_FEATURE_COUNT = GenfwPackage.GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.sympedia.genfw.swt.impl.CreateChildOverlayerImpl <em>Create Child Overlayer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sympedia.genfw.swt.impl.CreateChildOverlayerImpl
	 * @see com.sympedia.genfw.swt.impl.SwtPackageImpl#getCreateChildOverlayer()
	 * @generated
	 */
	int CREATE_CHILD_OVERLAYER = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHILD_OVERLAYER__ROOT = GIF_OVERLAYER__ROOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHILD_OVERLAYER__NAME = GIF_OVERLAYER__NAME;

	/**
	 * The feature id for the '<em><b>Overlay URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHILD_OVERLAYER__OVERLAY_URL = GIF_OVERLAYER__OVERLAY_URL;

	/**
	 * The feature id for the '<em><b>Underlay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHILD_OVERLAYER__UNDERLAY = GIF_OVERLAYER__UNDERLAY;

	/**
	 * The number of structural features of the '<em>Create Child Overlayer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CHILD_OVERLAYER_FEATURE_COUNT = GIF_OVERLAYER_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link com.sympedia.genfw.swt.GifOverlayer <em>Gif Overlayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gif Overlayer</em>'.
	 * @see com.sympedia.genfw.swt.GifOverlayer
	 * @generated
	 */
	EClass getGifOverlayer();

	/**
	 * Returns the meta object for the attribute '{@link com.sympedia.genfw.swt.GifOverlayer#getOverlayURL <em>Overlay URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overlay URL</em>'.
	 * @see com.sympedia.genfw.swt.GifOverlayer#getOverlayURL()
	 * @see #getGifOverlayer()
	 * @generated
	 */
	EAttribute getGifOverlayer_OverlayURL();

	/**
	 * Returns the meta object for the attribute '{@link com.sympedia.genfw.swt.GifOverlayer#isUnderlay <em>Underlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underlay</em>'.
	 * @see com.sympedia.genfw.swt.GifOverlayer#isUnderlay()
	 * @see #getGifOverlayer()
	 * @generated
	 */
	EAttribute getGifOverlayer_Underlay();

	/**
	 * Returns the meta object for class '{@link com.sympedia.genfw.swt.CreateChildOverlayer <em>Create Child Overlayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Child Overlayer</em>'.
	 * @see com.sympedia.genfw.swt.CreateChildOverlayer
	 * @generated
	 */
	EClass getCreateChildOverlayer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SwtFactory getSwtFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.sympedia.genfw.swt.impl.GifOverlayerImpl <em>Gif Overlayer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sympedia.genfw.swt.impl.GifOverlayerImpl
		 * @see com.sympedia.genfw.swt.impl.SwtPackageImpl#getGifOverlayer()
		 * @generated
		 */
		EClass GIF_OVERLAYER = eINSTANCE.getGifOverlayer();

		/**
		 * The meta object literal for the '<em><b>Overlay URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIF_OVERLAYER__OVERLAY_URL = eINSTANCE
				.getGifOverlayer_OverlayURL();

		/**
		 * The meta object literal for the '<em><b>Underlay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIF_OVERLAYER__UNDERLAY = eINSTANCE
				.getGifOverlayer_Underlay();

		/**
		 * The meta object literal for the '{@link com.sympedia.genfw.swt.impl.CreateChildOverlayerImpl <em>Create Child Overlayer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sympedia.genfw.swt.impl.CreateChildOverlayerImpl
		 * @see com.sympedia.genfw.swt.impl.SwtPackageImpl#getCreateChildOverlayer()
		 * @generated
		 */
		EClass CREATE_CHILD_OVERLAYER = eINSTANCE.getCreateChildOverlayer();

	}

} //SwtPackage

/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtFactoryImpl.java,v 1.2 2006/04/06 20:54:24 stepper Exp $
 */
package com.sympedia.genfw.swt.impl;

import com.sympedia.genfw.swt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwtFactoryImpl extends EFactoryImpl implements SwtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SwtFactory init() {
		try {
			SwtFactory theSwtFactory = (SwtFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://www.sympedia.com/2006/genfw/swt");
			if (theSwtFactory != null) {
				return theSwtFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SwtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SwtPackage.GIF_OVERLAYER:
			return createGifOverlayer();
		case SwtPackage.CREATE_CHILD_OVERLAYER:
			return createCreateChildOverlayer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GifOverlayer createGifOverlayer() {
		GifOverlayerImpl gifOverlayer = new GifOverlayerImpl();
		return gifOverlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateChildOverlayer createCreateChildOverlayer() {
		CreateChildOverlayerImpl createChildOverlayer = new CreateChildOverlayerImpl();
		return createChildOverlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtPackage getSwtPackage() {
		return (SwtPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SwtPackage getPackage() {
		return SwtPackage.eINSTANCE;
	}

} //SwtFactoryImpl

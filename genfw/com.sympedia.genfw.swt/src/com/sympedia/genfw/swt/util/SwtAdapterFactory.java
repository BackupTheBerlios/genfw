/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtAdapterFactory.java,v 1.2 2006/04/06 20:54:24 stepper Exp $
 */
package com.sympedia.genfw.swt.util;

import com.sympedia.genfw.Generator;
import com.sympedia.genfw.LifeCycle;

import com.sympedia.genfw.swt.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.swt.SwtPackage
 * @generated
 */
public class SwtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SwtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SwtPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwtSwitch modelSwitch = new SwtSwitch() {
		public Object caseGifOverlayer(GifOverlayer object) {
			return createGifOverlayerAdapter();
		}

		public Object caseCreateChildOverlayer(CreateChildOverlayer object) {
			return createCreateChildOverlayerAdapter();
		}

		public Object caseLifeCycle(LifeCycle object) {
			return createLifeCycleAdapter();
		}

		public Object caseGenerator(Generator object) {
			return createGeneratorAdapter();
		}

		public Object defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter) modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sympedia.genfw.swt.GifOverlayer <em>Gif Overlayer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sympedia.genfw.swt.GifOverlayer
	 * @generated
	 */
	public Adapter createGifOverlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sympedia.genfw.swt.CreateChildOverlayer <em>Create Child Overlayer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sympedia.genfw.swt.CreateChildOverlayer
	 * @generated
	 */
	public Adapter createCreateChildOverlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sympedia.genfw.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sympedia.genfw.LifeCycle
	 * @generated
	 */
	public Adapter createLifeCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.sympedia.genfw.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.sympedia.genfw.Generator
	 * @generated
	 */
	public Adapter createGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SwtAdapterFactory

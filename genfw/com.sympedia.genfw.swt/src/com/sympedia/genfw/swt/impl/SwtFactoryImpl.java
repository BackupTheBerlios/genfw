/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtFactoryImpl.java,v 1.1 2006/03/06 07:56:47 stepper Exp $
 */
package com.sympedia.genfw.swt.impl;


import com.sympedia.genfw.swt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SwtFactoryImpl extends EFactoryImpl implements SwtFactory
{
  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwtFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case SwtPackage.GIF_OVERLAYER:
      return createGifOverlayer();
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
  public GifOverlayer createGifOverlayer()
  {
    GifOverlayerImpl gifOverlayer = new GifOverlayerImpl();
    return gifOverlayer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwtPackage getSwtPackage()
  {
    return (SwtPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static SwtPackage getPackage()
  {
    return SwtPackage.eINSTANCE;
  }

} //SwtFactoryImpl

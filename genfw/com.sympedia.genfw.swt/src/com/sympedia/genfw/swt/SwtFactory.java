/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwtFactory.java,v 1.1 2006/03/06 07:56:47 stepper Exp $
 */
package com.sympedia.genfw.swt;


import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.swt.SwtPackage
 * @generated
 */
public interface SwtFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SwtFactory eINSTANCE = new com.sympedia.genfw.swt.impl.SwtFactoryImpl();

  /**
   * Returns a new object of class '<em>Gif Overlayer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gif Overlayer</em>'.
   * @generated
   */
  GifOverlayer createGifOverlayer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SwtPackage getSwtPackage();

} //SwtFactory

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
package com.sympedia.genfw.jet;


import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.jet.JetPackage
 * @generated
 */
public interface JetFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JetFactory eINSTANCE = com.sympedia.genfw.jet.impl.JetFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template</em>'.
   * @generated
   */
  JetTemplate createJetTemplate();

  /**
   * Returns a new object of class '<em>Ecore Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ecore Template</em>'.
   * @generated
   */
  EcoreTemplate createEcoreTemplate();

  /**
   * Returns a new object of class '<em>Emf Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Emf Generator</em>'.
   * @generated
   */
  EmfGenerator createEmfGenerator();

  /**
   * Returns a new object of class '<em>Gif Colorer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gif Colorer</em>'.
   * @generated
   */
  GifColorer createGifColorer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JetPackage getJetPackage();

} //JetFactory

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
package com.sympedia.genfw.bsh;


import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.bsh.BshPackage
 * @generated
 */
public interface BshFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BshFactory eINSTANCE = com.sympedia.genfw.bsh.impl.BshFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Bean Shell Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bean Shell Rule</em>'.
   * @generated
   */
  BeanShellRule createBeanShellRule();

  /**
   * Returns a new object of class '<em>Bean Shell Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bean Shell Transformation</em>'.
   * @generated
   */
  BeanShellTransformation createBeanShellTransformation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BshPackage getBshPackage();

} //BshFactory

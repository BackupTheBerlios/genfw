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
package com.sympedia.density.gen.deploy;


import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.deploy.DeployPackage
 * @generated
 */
public interface DeployFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DeployFactory eINSTANCE = com.sympedia.density.gen.deploy.impl.DeployFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
  Container createContainer();

  /**
   * Returns a new object of class '<em>Deployment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment</em>'.
   * @generated
   */
  Deployment createDeployment();

  /**
   * Returns a new object of class '<em>Deployment Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deployment Group</em>'.
   * @generated
   */
  DeploymentGroup createDeploymentGroup();

  /**
   * Returns a new object of class '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference</em>'.
   * @generated
   */
  Reference createReference();

  /**
   * Returns a new object of class '<em>Integer Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Parameter</em>'.
   * @generated
   */
  IntegerParameter createIntegerParameter();

  /**
   * Returns a new object of class '<em>Long Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Long Parameter</em>'.
   * @generated
   */
  LongParameter createLongParameter();

  /**
   * Returns a new object of class '<em>Float Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Parameter</em>'.
   * @generated
   */
  FloatParameter createFloatParameter();

  /**
   * Returns a new object of class '<em>Double Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Double Parameter</em>'.
   * @generated
   */
  DoubleParameter createDoubleParameter();

  /**
   * Returns a new object of class '<em>Boolean Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Parameter</em>'.
   * @generated
   */
  BooleanParameter createBooleanParameter();

  /**
   * Returns a new object of class '<em>String Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Parameter</em>'.
   * @generated
   */
  StringParameter createStringParameter();

  /**
   * Returns a new object of class '<em>Char Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Char Parameter</em>'.
   * @generated
   */
  CharParameter createCharParameter();

  /**
   * Returns a new object of class '<em>Creator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Creator</em>'.
   * @generated
   */
  Creator createCreator();

  /**
   * Returns a new object of class '<em>Listener</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Listener</em>'.
   * @generated
   */
  Listener createListener();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DeployPackage getDeployPackage();

} //DeployFactory

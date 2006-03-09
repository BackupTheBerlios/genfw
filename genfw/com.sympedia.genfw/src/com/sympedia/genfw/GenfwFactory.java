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
package com.sympedia.genfw;


import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.GenfwPackage
 * @generated
 */
public interface GenfwFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GenfwFactory eINSTANCE = com.sympedia.genfw.impl.GenfwFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Gen Lib</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gen Lib</em>'.
   * @generated
   */
  GenLib createGenLib();

  /**
   * Returns a new object of class '<em>Gen App</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Gen App</em>'.
   * @generated
   */
  GenApp createGenApp();

  /**
   * Returns a new object of class '<em>Ecore Content Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ecore Content Provider</em>'.
   * @generated
   */
  EcoreContentProvider createEcoreContentProvider();

  /**
   * Returns a new object of class '<em>Properties Content Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Properties Content Provider</em>'.
   * @generated
   */
  PropertiesContentProvider createPropertiesContentProvider();

  /**
   * Returns a new object of class '<em>Rule Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Set</em>'.
   * @generated
   */
  RuleSet createRuleSet();

  /**
   * Returns a new object of class '<em>Static Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static Rule</em>'.
   * @generated
   */
  StaticRule createStaticRule();

  /**
   * Returns a new object of class '<em>Dom Transformer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dom Transformer</em>'.
   * @generated
   */
  DomTransformer createDomTransformer();

  /**
   * Returns a new object of class '<em>Initial Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initial Generator</em>'.
   * @generated
   */
  InitialGenerator createInitialGenerator();

  /**
   * Returns a new object of class '<em>Static File Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static File Initializer</em>'.
   * @generated
   */
  StaticFileInitializer createStaticFileInitializer();

  /**
   * Returns a new object of class '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line</em>'.
   * @generated
   */
  Line createLine();

  /**
   * Returns a new object of class '<em>Project Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project Initializer</em>'.
   * @generated
   */
  ProjectInitializer createProjectInitializer();

  /**
   * Returns a new object of class '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input</em>'.
   * @generated
   */
  Input createInput();

  /**
   * Returns a new object of class '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Context</em>'.
   * @generated
   */
  Context createContext();

  /**
   * Returns a new object of class '<em>Dom Content Provider</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dom Content Provider</em>'.
   * @generated
   */
  DomContentProvider createDomContentProvider();

  /**
   * Returns a new object of class '<em>Identity Generator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identity Generator</em>'.
   * @generated
   */
  IdentityGenerator createIdentityGenerator();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GenfwPackage getGenfwPackage();

  /**
   * @ADDED
   */
  Context createContext(GenApp runtime);
} //GenfwFactory

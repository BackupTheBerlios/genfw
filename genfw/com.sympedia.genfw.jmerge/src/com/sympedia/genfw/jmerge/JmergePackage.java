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
package com.sympedia.genfw.jmerge;


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
 * @see com.sympedia.genfw.jmerge.JmergeFactory
 * @model kind="package"
 * @generated
 */
public interface JmergePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jmerge";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sympedia.com/2006/genfw/jmerge";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.sympedia.genfw.jmerge";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JmergePackage eINSTANCE = com.sympedia.genfw.jmerge.impl.JmergePackageImpl.init();

  /**
   * The meta object id for the '{@link com.sympedia.genfw.jmerge.impl.JmergeGeneratorImpl <em>Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.jmerge.impl.JmergeGeneratorImpl
   * @see com.sympedia.genfw.jmerge.impl.JmergePackageImpl#getJmergeGenerator()
   * @generated
   */
  int JMERGE_GENERATOR = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGE_GENERATOR__ROOT = GenfwPackage.DELEGATING_GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGE_GENERATOR__NAME = GenfwPackage.DELEGATING_GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Delegate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGE_GENERATOR__DELEGATE = GenfwPackage.DELEGATING_GENERATOR__DELEGATE;

  /**
   * The feature id for the '<em><b>Merge Xml Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGE_GENERATOR__MERGE_XML_URI = GenfwPackage.DELEGATING_GENERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGE_GENERATOR_FEATURE_COUNT = GenfwPackage.DELEGATING_GENERATOR_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.jmerge.JmergeGenerator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generator</em>'.
   * @see com.sympedia.genfw.jmerge.JmergeGenerator
   * @generated
   */
  EClass getJmergeGenerator();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.jmerge.JmergeGenerator#getMergeXmlUri <em>Merge Xml Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Merge Xml Uri</em>'.
   * @see com.sympedia.genfw.jmerge.JmergeGenerator#getMergeXmlUri()
   * @see #getJmergeGenerator()
   * @generated
   */
  EAttribute getJmergeGenerator_MergeXmlUri();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JmergeFactory getJmergeFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sympedia.genfw.jmerge.impl.JmergeGeneratorImpl <em>Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.jmerge.impl.JmergeGeneratorImpl
     * @see com.sympedia.genfw.jmerge.impl.JmergePackageImpl#getJmergeGenerator()
     * @generated
     */
    EClass JMERGE_GENERATOR = eINSTANCE.getJmergeGenerator();

    /**
     * The meta object literal for the '<em><b>Merge Xml Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JMERGE_GENERATOR__MERGE_XML_URI = eINSTANCE.getJmergeGenerator_MergeXmlUri();

  }

} //JmergePackage

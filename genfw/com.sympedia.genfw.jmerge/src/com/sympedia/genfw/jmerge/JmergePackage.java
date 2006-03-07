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
   * The meta object id for the '{@link com.sympedia.genfw.jmerge.impl.JmergerImpl <em>Jmerger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.jmerge.impl.JmergerImpl
   * @see com.sympedia.genfw.jmerge.impl.JmergePackageImpl#getJmerger()
   * @generated
   */
  int JMERGER = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGER__ROOT = GenfwPackage.DELEGATING_GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGER__NAME = GenfwPackage.DELEGATING_GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Delegate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGER__DELEGATE = GenfwPackage.DELEGATING_GENERATOR__DELEGATE;

  /**
   * The feature id for the '<em><b>Merge Xml Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGER__MERGE_XML_URI = GenfwPackage.DELEGATING_GENERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Jmerger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JMERGER_FEATURE_COUNT = GenfwPackage.DELEGATING_GENERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.jmerge.impl.PropertyMergerImpl <em>Property Merger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.jmerge.impl.PropertyMergerImpl
   * @see com.sympedia.genfw.jmerge.impl.JmergePackageImpl#getPropertyMerger()
   * @generated
   */
  int PROPERTY_MERGER = 1;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MERGER__ROOT = GenfwPackage.DELEGATING_GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MERGER__NAME = GenfwPackage.DELEGATING_GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Delegate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MERGER__DELEGATE = GenfwPackage.DELEGATING_GENERATOR__DELEGATE;

  /**
   * The number of structural features of the '<em>Property Merger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MERGER_FEATURE_COUNT = GenfwPackage.DELEGATING_GENERATOR_FEATURE_COUNT + 0;

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.jmerge.Jmerger <em>Jmerger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jmerger</em>'.
   * @see com.sympedia.genfw.jmerge.Jmerger
   * @generated
   */
  EClass getJmerger();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.jmerge.Jmerger#getMergeXmlUri <em>Merge Xml Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Merge Xml Uri</em>'.
   * @see com.sympedia.genfw.jmerge.Jmerger#getMergeXmlUri()
   * @see #getJmerger()
   * @generated
   */
  EAttribute getJmerger_MergeXmlUri();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.jmerge.PropertyMerger <em>Property Merger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Merger</em>'.
   * @see com.sympedia.genfw.jmerge.PropertyMerger
   * @generated
   */
  EClass getPropertyMerger();

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
     * The meta object literal for the '{@link com.sympedia.genfw.jmerge.impl.JmergerImpl <em>Jmerger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.jmerge.impl.JmergerImpl
     * @see com.sympedia.genfw.jmerge.impl.JmergePackageImpl#getJmerger()
     * @generated
     */
    EClass JMERGER = eINSTANCE.getJmerger();

    /**
     * The meta object literal for the '<em><b>Merge Xml Uri</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JMERGER__MERGE_XML_URI = eINSTANCE.getJmerger_MergeXmlUri();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.jmerge.impl.PropertyMergerImpl <em>Property Merger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.jmerge.impl.PropertyMergerImpl
     * @see com.sympedia.genfw.jmerge.impl.JmergePackageImpl#getPropertyMerger()
     * @generated
     */
    EClass PROPERTY_MERGER = eINSTANCE.getPropertyMerger();

  }

} //JmergePackage

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
package com.sympedia.genfw.jdt;


import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;


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
 * @see com.sympedia.genfw.jdt.JdtFactory
 * @model kind="package"
 * @generated
 */
public interface JdtPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jdt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sympedia.com/2006/genfw/jdt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.sympedia.genfw.jdt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JdtPackage eINSTANCE = com.sympedia.genfw.jdt.impl.JdtPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sympedia.genfw.jdt.impl.JavaFormatterImpl <em>Java Formatter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.jdt.impl.JavaFormatterImpl
   * @see com.sympedia.genfw.jdt.impl.JdtPackageImpl#getJavaFormatter()
   * @generated
   */
  int JAVA_FORMATTER = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FORMATTER__ROOT = GenfwPackage.DELEGATING_GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FORMATTER__NAME = GenfwPackage.DELEGATING_GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Delegate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FORMATTER__DELEGATE = GenfwPackage.DELEGATING_GENERATOR__DELEGATE;

  /**
   * The feature id for the '<em><b>Profile File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FORMATTER__PROFILE_FILE = GenfwPackage.DELEGATING_GENERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Java Formatter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_FORMATTER_FEATURE_COUNT = GenfwPackage.DELEGATING_GENERATOR_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.jdt.JavaFormatter <em>Java Formatter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Formatter</em>'.
   * @see com.sympedia.genfw.jdt.JavaFormatter
   * @generated
   */
  EClass getJavaFormatter();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.jdt.JavaFormatter#getProfileFile <em>Profile File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Profile File</em>'.
   * @see com.sympedia.genfw.jdt.JavaFormatter#getProfileFile()
   * @see #getJavaFormatter()
   * @generated
   */
  EAttribute getJavaFormatter_ProfileFile();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JdtFactory getJdtFactory();

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
     * The meta object literal for the '{@link com.sympedia.genfw.jdt.impl.JavaFormatterImpl <em>Java Formatter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.jdt.impl.JavaFormatterImpl
     * @see com.sympedia.genfw.jdt.impl.JdtPackageImpl#getJavaFormatter()
     * @generated
     */
    EClass JAVA_FORMATTER = eINSTANCE.getJavaFormatter();

    /**
     * The meta object literal for the '<em><b>Profile File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_FORMATTER__PROFILE_FILE = eINSTANCE.getJavaFormatter_ProfileFile();

  }

} //JdtPackage

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
 * @see com.sympedia.genfw.jet.JetFactory
 * @model kind="package"
 * @generated
 */
public interface JetPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jet";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sympedia.com/2006/genfw/jet";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.sympedia.genfw.jet";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JetPackage eINSTANCE = com.sympedia.genfw.jet.impl.JetPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sympedia.genfw.jet.impl.JetTemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.jet.impl.JetTemplateImpl
   * @see com.sympedia.genfw.jet.impl.JetPackageImpl#getJetTemplate()
   * @generated
   */
  int JET_TEMPLATE = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JET_TEMPLATE__ROOT = GenfwPackage.GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JET_TEMPLATE__NAME = GenfwPackage.GENERATOR__NAME;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JET_TEMPLATE__CLASS_NAME = GenfwPackage.GENERATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JET_TEMPLATE_FEATURE_COUNT = GenfwPackage.GENERATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.jet.impl.EcoreTemplateImpl <em>Ecore Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.jet.impl.EcoreTemplateImpl
   * @see com.sympedia.genfw.jet.impl.JetPackageImpl#getEcoreTemplate()
   * @generated
   */
  int ECORE_TEMPLATE = 1;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_TEMPLATE__ROOT = JET_TEMPLATE__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_TEMPLATE__NAME = JET_TEMPLATE__NAME;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_TEMPLATE__CLASS_NAME = JET_TEMPLATE__CLASS_NAME;

  /**
   * The feature id for the '<em><b>Generate Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_TEMPLATE__GENERATE_INTERFACE = JET_TEMPLATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Generate Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_TEMPLATE__GENERATE_IMPLEMENTATION = JET_TEMPLATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ecore Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECORE_TEMPLATE_FEATURE_COUNT = JET_TEMPLATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sympedia.genfw.jet.impl.EmfGeneratorImpl <em>Emf Generator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.genfw.jet.impl.EmfGeneratorImpl
   * @see com.sympedia.genfw.jet.impl.JetPackageImpl#getEmfGenerator()
   * @generated
   */
  int EMF_GENERATOR = 2;

  /**
   * The feature id for the '<em><b>Root</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_GENERATOR__ROOT = GenfwPackage.GENERATOR__ROOT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_GENERATOR__NAME = GenfwPackage.GENERATOR__NAME;

  /**
   * The number of structural features of the '<em>Emf Generator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMF_GENERATOR_FEATURE_COUNT = GenfwPackage.GENERATOR_FEATURE_COUNT + 0;

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.jet.JetTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see com.sympedia.genfw.jet.JetTemplate
   * @generated
   */
  EClass getJetTemplate();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.jet.JetTemplate#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see com.sympedia.genfw.jet.JetTemplate#getClassName()
   * @see #getJetTemplate()
   * @generated
   */
  EAttribute getJetTemplate_ClassName();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.jet.EcoreTemplate <em>Ecore Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ecore Template</em>'.
   * @see com.sympedia.genfw.jet.EcoreTemplate
   * @generated
   */
  EClass getEcoreTemplate();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.jet.EcoreTemplate#isGenerateInterface <em>Generate Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Interface</em>'.
   * @see com.sympedia.genfw.jet.EcoreTemplate#isGenerateInterface()
   * @see #getEcoreTemplate()
   * @generated
   */
  EAttribute getEcoreTemplate_GenerateInterface();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.genfw.jet.EcoreTemplate#isGenerateImplementation <em>Generate Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generate Implementation</em>'.
   * @see com.sympedia.genfw.jet.EcoreTemplate#isGenerateImplementation()
   * @see #getEcoreTemplate()
   * @generated
   */
  EAttribute getEcoreTemplate_GenerateImplementation();

  /**
   * Returns the meta object for class '{@link com.sympedia.genfw.jet.EmfGenerator <em>Emf Generator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emf Generator</em>'.
   * @see com.sympedia.genfw.jet.EmfGenerator
   * @generated
   */
  EClass getEmfGenerator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JetFactory getJetFactory();

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
     * The meta object literal for the '{@link com.sympedia.genfw.jet.impl.JetTemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.jet.impl.JetTemplateImpl
     * @see com.sympedia.genfw.jet.impl.JetPackageImpl#getJetTemplate()
     * @generated
     */
    EClass JET_TEMPLATE = eINSTANCE.getJetTemplate();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JET_TEMPLATE__CLASS_NAME = eINSTANCE.getJetTemplate_ClassName();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.jet.impl.EcoreTemplateImpl <em>Ecore Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.jet.impl.EcoreTemplateImpl
     * @see com.sympedia.genfw.jet.impl.JetPackageImpl#getEcoreTemplate()
     * @generated
     */
    EClass ECORE_TEMPLATE = eINSTANCE.getEcoreTemplate();

    /**
     * The meta object literal for the '<em><b>Generate Interface</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECORE_TEMPLATE__GENERATE_INTERFACE = eINSTANCE.getEcoreTemplate_GenerateInterface();

    /**
     * The meta object literal for the '<em><b>Generate Implementation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECORE_TEMPLATE__GENERATE_IMPLEMENTATION = eINSTANCE
            .getEcoreTemplate_GenerateImplementation();

    /**
     * The meta object literal for the '{@link com.sympedia.genfw.jet.impl.EmfGeneratorImpl <em>Emf Generator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.genfw.jet.impl.EmfGeneratorImpl
     * @see com.sympedia.genfw.jet.impl.JetPackageImpl#getEmfGenerator()
     * @generated
     */
    EClass EMF_GENERATOR = eINSTANCE.getEmfGenerator();

  }

} //JetPackage

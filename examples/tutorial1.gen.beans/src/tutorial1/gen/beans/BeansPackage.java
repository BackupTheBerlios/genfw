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
package tutorial1.gen.beans;


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
 * @see tutorial1.gen.beans.BeansFactory
 * @model kind="package"
 *        annotation="http://www.topcased.org/uuid uuid='11380327744840'"
 * @generated
 */
public interface BeansPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "beans";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://beans";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "beans";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BeansPackage eINSTANCE = tutorial1.gen.beans.impl.BeansPackageImpl.init();

  /**
   * The meta object id for the '{@link tutorial1.gen.beans.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tutorial1.gen.beans.impl.NamedElementImpl
   * @see tutorial1.gen.beans.impl.BeansPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tutorial1.gen.beans.impl.BeanLibraryImpl <em>Bean Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tutorial1.gen.beans.impl.BeanLibraryImpl
   * @see tutorial1.gen.beans.impl.BeansPackageImpl#getBeanLibrary()
   * @generated
   */
  int BEAN_LIBRARY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_LIBRARY__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_LIBRARY__PACKAGE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Beans</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_LIBRARY__BEANS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bean Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link tutorial1.gen.beans.impl.BeanImpl <em>Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tutorial1.gen.beans.impl.BeanImpl
   * @see tutorial1.gen.beans.impl.BeansPackageImpl#getBean()
   * @generated
   */
  int BEAN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Bean Library</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN__BEAN_LIBRARY = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link tutorial1.gen.beans.impl.BeanPropertyImpl <em>Bean Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tutorial1.gen.beans.impl.BeanPropertyImpl
   * @see tutorial1.gen.beans.impl.BeansPackageImpl#getBeanProperty()
   * @generated
   */
  int BEAN_PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY__TYPE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bean</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY__BEAN = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY__CHANGEABLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Bean Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEAN_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * Returns the meta object for class '{@link tutorial1.gen.beans.BeanLibrary <em>Bean Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bean Library</em>'.
   * @see tutorial1.gen.beans.BeanLibrary
   * @generated
   */
  EClass getBeanLibrary();

  /**
   * Returns the meta object for the attribute '{@link tutorial1.gen.beans.BeanLibrary#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see tutorial1.gen.beans.BeanLibrary#getPackageName()
   * @see #getBeanLibrary()
   * @generated
   */
  EAttribute getBeanLibrary_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link tutorial1.gen.beans.BeanLibrary#getBeans <em>Beans</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Beans</em>'.
   * @see tutorial1.gen.beans.BeanLibrary#getBeans()
   * @see #getBeanLibrary()
   * @generated
   */
  EReference getBeanLibrary_Beans();

  /**
   * Returns the meta object for class '{@link tutorial1.gen.beans.Bean <em>Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bean</em>'.
   * @see tutorial1.gen.beans.Bean
   * @generated
   */
  EClass getBean();

  /**
   * Returns the meta object for the container reference '{@link tutorial1.gen.beans.Bean#getBeanLibrary <em>Bean Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Bean Library</em>'.
   * @see tutorial1.gen.beans.Bean#getBeanLibrary()
   * @see #getBean()
   * @generated
   */
  EReference getBean_BeanLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link tutorial1.gen.beans.Bean#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see tutorial1.gen.beans.Bean#getProperties()
   * @see #getBean()
   * @generated
   */
  EReference getBean_Properties();

  /**
   * Returns the meta object for class '{@link tutorial1.gen.beans.BeanProperty <em>Bean Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bean Property</em>'.
   * @see tutorial1.gen.beans.BeanProperty
   * @generated
   */
  EClass getBeanProperty();

  /**
   * Returns the meta object for the attribute '{@link tutorial1.gen.beans.BeanProperty#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see tutorial1.gen.beans.BeanProperty#getTypeName()
   * @see #getBeanProperty()
   * @generated
   */
  EAttribute getBeanProperty_TypeName();

  /**
   * Returns the meta object for the container reference '{@link tutorial1.gen.beans.BeanProperty#getBean <em>Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Bean</em>'.
   * @see tutorial1.gen.beans.BeanProperty#getBean()
   * @see #getBeanProperty()
   * @generated
   */
  EReference getBeanProperty_Bean();

  /**
   * Returns the meta object for the attribute '{@link tutorial1.gen.beans.BeanProperty#isChangeable <em>Changeable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Changeable</em>'.
   * @see tutorial1.gen.beans.BeanProperty#isChangeable()
   * @see #getBeanProperty()
   * @generated
   */
  EAttribute getBeanProperty_Changeable();

  /**
   * Returns the meta object for class '{@link tutorial1.gen.beans.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see tutorial1.gen.beans.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link tutorial1.gen.beans.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see tutorial1.gen.beans.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BeansFactory getBeansFactory();

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
     * The meta object literal for the '{@link tutorial1.gen.beans.impl.BeanLibraryImpl <em>Bean Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tutorial1.gen.beans.impl.BeanLibraryImpl
     * @see tutorial1.gen.beans.impl.BeansPackageImpl#getBeanLibrary()
     * @generated
     */
    EClass BEAN_LIBRARY = eINSTANCE.getBeanLibrary();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_LIBRARY__PACKAGE_NAME = eINSTANCE.getBeanLibrary_PackageName();

    /**
     * The meta object literal for the '<em><b>Beans</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN_LIBRARY__BEANS = eINSTANCE.getBeanLibrary_Beans();

    /**
     * The meta object literal for the '{@link tutorial1.gen.beans.impl.BeanImpl <em>Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tutorial1.gen.beans.impl.BeanImpl
     * @see tutorial1.gen.beans.impl.BeansPackageImpl#getBean()
     * @generated
     */
    EClass BEAN = eINSTANCE.getBean();

    /**
     * The meta object literal for the '<em><b>Bean Library</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN__BEAN_LIBRARY = eINSTANCE.getBean_BeanLibrary();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN__PROPERTIES = eINSTANCE.getBean_Properties();

    /**
     * The meta object literal for the '{@link tutorial1.gen.beans.impl.BeanPropertyImpl <em>Bean Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tutorial1.gen.beans.impl.BeanPropertyImpl
     * @see tutorial1.gen.beans.impl.BeansPackageImpl#getBeanProperty()
     * @generated
     */
    EClass BEAN_PROPERTY = eINSTANCE.getBeanProperty();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_PROPERTY__TYPE_NAME = eINSTANCE.getBeanProperty_TypeName();

    /**
     * The meta object literal for the '<em><b>Bean</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEAN_PROPERTY__BEAN = eINSTANCE.getBeanProperty_Bean();

    /**
     * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEAN_PROPERTY__CHANGEABLE = eINSTANCE.getBeanProperty_Changeable();

    /**
     * The meta object literal for the '{@link tutorial1.gen.beans.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tutorial1.gen.beans.impl.NamedElementImpl
     * @see tutorial1.gen.beans.impl.BeansPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

  }

} //BeansPackage

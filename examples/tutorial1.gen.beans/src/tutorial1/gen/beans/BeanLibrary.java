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


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tutorial1.gen.beans.BeanLibrary#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link tutorial1.gen.beans.BeanLibrary#getBeans <em>Beans</em>}</li>
 * </ul>
 * </p>
 *
 * @see tutorial1.gen.beans.BeansPackage#getBeanLibrary()
 * @model annotation="http://www.topcased.org/uuid uuid='11380328734373'"
 * @generated
 */
public interface BeanLibrary extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see tutorial1.gen.beans.BeansPackage#getBeanLibrary_PackageName()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='11380328734374'"
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link tutorial1.gen.beans.BeanLibrary#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Beans</b></em>' containment reference list.
   * The list contents are of type {@link tutorial1.gen.beans.Bean}.
   * It is bidirectional and its opposite is '{@link tutorial1.gen.beans.Bean#getBeanLibrary <em>Bean Library</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Beans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beans</em>' containment reference list.
   * @see tutorial1.gen.beans.BeansPackage#getBeanLibrary_Beans()
   * @see tutorial1.gen.beans.Bean#getBeanLibrary
   * @model type="tutorial1.gen.beans.Bean" opposite="beanLibrary" containment="true" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='11380330393759'"
   * @generated
   */
  EList getBeans();

} // BeanLibrary

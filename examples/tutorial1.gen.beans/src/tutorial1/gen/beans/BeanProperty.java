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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bean Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tutorial1.gen.beans.BeanProperty#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link tutorial1.gen.beans.BeanProperty#getBean <em>Bean</em>}</li>
 *   <li>{@link tutorial1.gen.beans.BeanProperty#isChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @see tutorial1.gen.beans.BeansPackage#getBeanProperty()
 * @model annotation="http://www.topcased.org/uuid uuid='11380328734376'"
 * @generated
 */
public interface BeanProperty extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name</em>' attribute.
   * @see #setTypeName(String)
   * @see tutorial1.gen.beans.BeansPackage#getBeanProperty_TypeName()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113803294367115'"
   * @generated
   */
  String getTypeName();

  /**
   * Sets the value of the '{@link tutorial1.gen.beans.BeanProperty#getTypeName <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name</em>' attribute.
   * @see #getTypeName()
   * @generated
   */
  void setTypeName(String value);

  /**
   * Returns the value of the '<em><b>Bean</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link tutorial1.gen.beans.Bean#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bean</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bean</em>' container reference.
   * @see #setBean(Bean)
   * @see tutorial1.gen.beans.BeansPackage#getBeanProperty_Bean()
   * @see tutorial1.gen.beans.Bean#getProperties
   * @model opposite="properties" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113803303937521'"
   * @generated
   */
  Bean getBean();

  /**
   * Sets the value of the '{@link tutorial1.gen.beans.BeanProperty#getBean <em>Bean</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bean</em>' container reference.
   * @see #getBean()
   * @generated
   */
  void setBean(Bean value);

  /**
   * Returns the value of the '<em><b>Changeable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Changeable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Changeable</em>' attribute.
   * @see #setChangeable(boolean)
   * @see tutorial1.gen.beans.BeansPackage#getBeanProperty_Changeable()
   * @model annotation="http://www.topcased.org/uuid uuid='113803303937522'"
   * @generated
   */
  boolean isChangeable();

  /**
   * Sets the value of the '{@link tutorial1.gen.beans.BeanProperty#isChangeable <em>Changeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Changeable</em>' attribute.
   * @see #isChangeable()
   * @generated
   */
  void setChangeable(boolean value);

} // BeanProperty

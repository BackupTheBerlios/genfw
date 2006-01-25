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
 * A representation of the model object '<em><b>Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tutorial1.gen.beans.Bean#getBeanLibrary <em>Bean Library</em>}</li>
 *   <li>{@link tutorial1.gen.beans.Bean#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see tutorial1.gen.beans.BeansPackage#getBean()
 * @model annotation="http://www.topcased.org/uuid uuid='11380328734375'"
 * @generated
 */
public interface Bean extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Bean Library</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link tutorial1.gen.beans.BeanLibrary#getBeans <em>Beans</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bean Library</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bean Library</em>' container reference.
   * @see #setBeanLibrary(BeanLibrary)
   * @see tutorial1.gen.beans.BeansPackage#getBean_BeanLibrary()
   * @see tutorial1.gen.beans.BeanLibrary#getBeans
   * @model opposite="beans" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113803303937513'"
   * @generated
   */
  BeanLibrary getBeanLibrary();

  /**
   * Sets the value of the '{@link tutorial1.gen.beans.Bean#getBeanLibrary <em>Bean Library</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bean Library</em>' container reference.
   * @see #getBeanLibrary()
   * @generated
   */
  void setBeanLibrary(BeanLibrary value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link tutorial1.gen.beans.BeanProperty}.
   * It is bidirectional and its opposite is '{@link tutorial1.gen.beans.BeanProperty#getBean <em>Bean</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see tutorial1.gen.beans.BeansPackage#getBean_Properties()
   * @see tutorial1.gen.beans.BeanProperty#getBean
   * @model type="tutorial1.gen.beans.BeanProperty" opposite="bean" containment="true" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113803303937514'"
   * @generated
   */
  EList getProperties();

} // Bean

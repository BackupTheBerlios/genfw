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


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.GenLib#getContentProviders <em>Content Providers</em>}</li>
 *   <li>{@link com.sympedia.genfw.GenLib#getGenerators <em>Generators</em>}</li>
 *   <li>{@link com.sympedia.genfw.GenLib#getRuleSets <em>Rule Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getGenLib()
 * @model annotation="http://www.topcased.org/uuid uuid='113672173296899'"
 * @generated
 */
public interface GenLib extends EObject
{
  /**
   * Returns the value of the '<em><b>Content Providers</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.ContentProvider}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.ContentProvider#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content Providers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content Providers</em>' containment reference list.
   * @see com.sympedia.genfw.GenfwPackage#getGenLib_ContentProviders()
   * @see com.sympedia.genfw.ContentProvider#getRoot
   * @model type="com.sympedia.genfw.ContentProvider" opposite="root" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136722211062110'"
   * @generated
   */
  EList getContentProviders();

  /**
   * Returns the value of the '<em><b>Generators</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.Generator}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.Generator#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generators</em>' containment reference list.
   * @see com.sympedia.genfw.GenfwPackage#getGenLib_Generators()
   * @see com.sympedia.genfw.Generator#getRoot
   * @model type="com.sympedia.genfw.Generator" opposite="root" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136722211062112'"
   * @generated
   */
  EList getGenerators();

  /**
   * Returns the value of the '<em><b>Rule Sets</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.RuleSet}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.RuleSet#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule Sets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule Sets</em>' containment reference list.
   * @see com.sympedia.genfw.GenfwPackage#getGenLib_RuleSets()
   * @see com.sympedia.genfw.RuleSet#getRoot
   * @model type="com.sympedia.genfw.RuleSet" opposite="root" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136722211062111'"
   * @generated
   */
  EList getRuleSets();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model dataType="com.sympedia.genfw.ClassLoader" parentClassLoaderDataType="com.sympedia.genfw.ClassLoader"
   *        parentClassLoaderAnnotation="http://www.topcased.org/uuid uuid='11371699798129'"
   *        annotation="http://www.topcased.org/uuid uuid='11368054601876'"
   * @generated
   */
  ClassLoader getClassLoader(ClassLoader parentClassLoader);

} // GenLib

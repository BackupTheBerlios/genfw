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
package com.sympedia.density.gen.arch;


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.PluginProject#getRequires <em>Requires</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.PluginProject#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.PluginProject#getContainedBy <em>Contained By</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.arch.ArchPackage#getPluginProject()
 * @model
 * @generated
 */
public interface PluginProject extends WorkspaceProject
{
  /**
   * Returns the value of the '<em><b>Requires</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.PluginProject}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.PluginProject#getRequiredBy <em>Required By</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getPluginProject_Requires()
   * @see com.sympedia.density.gen.arch.PluginProject#getRequiredBy
   * @model type="com.sympedia.density.gen.arch.PluginProject" opposite="requiredBy"
   * @generated
   */
  EList getRequires();

  /**
   * Returns the value of the '<em><b>Required By</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.PluginProject}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.PluginProject#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required By</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required By</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getPluginProject_RequiredBy()
   * @see com.sympedia.density.gen.arch.PluginProject#getRequires
   * @model type="com.sympedia.density.gen.arch.PluginProject" opposite="requires"
   * @generated
   */
  EList getRequiredBy();

  /**
   * Returns the value of the '<em><b>Contained By</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.FeatureProject}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.FeatureProject#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contained By</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contained By</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getPluginProject_ContainedBy()
   * @see com.sympedia.density.gen.arch.FeatureProject#getContains
   * @model type="com.sympedia.density.gen.arch.FeatureProject" opposite="contains"
   * @generated
   */
  EList getContainedBy();

} // PluginProject

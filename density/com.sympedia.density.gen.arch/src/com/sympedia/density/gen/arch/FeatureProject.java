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
 * A representation of the model object '<em><b>Feature Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.FeatureProject#getIncludes <em>Includes</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.FeatureProject#getIncludedBy <em>Included By</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.FeatureProject#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.arch.ArchPackage#getFeatureProject()
 * @model
 * @generated
 */
public interface FeatureProject extends WorkspaceProject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.FeatureProject}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.FeatureProject#getIncludedBy <em>Included By</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getFeatureProject_Includes()
   * @see com.sympedia.density.gen.arch.FeatureProject#getIncludedBy
   * @model type="com.sympedia.density.gen.arch.FeatureProject" opposite="includedBy"
   * @generated
   */
  EList getIncludes();

  /**
   * Returns the value of the '<em><b>Included By</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.FeatureProject}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.FeatureProject#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Included By</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Included By</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getFeatureProject_IncludedBy()
   * @see com.sympedia.density.gen.arch.FeatureProject#getIncludes
   * @model type="com.sympedia.density.gen.arch.FeatureProject" opposite="includes"
   * @generated
   */
  EList getIncludedBy();

  /**
   * Returns the value of the '<em><b>Contains</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.PluginProject}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.PluginProject#getContainedBy <em>Contained By</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contains</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contains</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getFeatureProject_Contains()
   * @see com.sympedia.density.gen.arch.PluginProject#getContainedBy
   * @model type="com.sympedia.density.gen.arch.PluginProject" opposite="containedBy"
   * @generated
   */
  EList getContains();

} // FeatureProject

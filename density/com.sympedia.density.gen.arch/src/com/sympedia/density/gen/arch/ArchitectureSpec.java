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

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.ArchitectureSpec#getBuilders <em>Builders</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.ArchitectureSpec#getNatures <em>Natures</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.ArchitectureSpec#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.arch.ArchPackage#getArchitectureSpec()
 * @model
 * @generated
 */
public interface ArchitectureSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Builders</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.ProjectBuilder}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.ProjectBuilder#getArchSpec <em>Arch Spec</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builders</em>' containment reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getArchitectureSpec_Builders()
   * @see com.sympedia.density.gen.arch.ProjectBuilder#getArchSpec
   * @model type="com.sympedia.density.gen.arch.ProjectBuilder" opposite="archSpec" containment="true"
   * @generated
   */
  EList getBuilders();

  /**
   * Returns the value of the '<em><b>Natures</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.ProjectNature}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.ProjectNature#getArchSpec <em>Arch Spec</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Natures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Natures</em>' containment reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getArchitectureSpec_Natures()
   * @see com.sympedia.density.gen.arch.ProjectNature#getArchSpec
   * @model type="com.sympedia.density.gen.arch.ProjectNature" opposite="archSpec" containment="true"
   * @generated
   */
  EList getNatures();

  /**
   * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.WorkspaceProject}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.WorkspaceProject#getArchSpec <em>Arch Spec</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projects</em>' containment reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getArchitectureSpec_Projects()
   * @see com.sympedia.density.gen.arch.WorkspaceProject#getArchSpec
   * @model type="com.sympedia.density.gen.arch.WorkspaceProject" opposite="archSpec" containment="true" required="true"
   * @generated
   */
  EList getProjects();

} // ArchitectureSpec

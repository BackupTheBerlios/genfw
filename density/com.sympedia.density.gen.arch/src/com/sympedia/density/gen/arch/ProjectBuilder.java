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
 * A representation of the model object '<em><b>Project Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.ProjectBuilder#getBuilderId <em>Builder Id</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.ProjectBuilder#getWorkspaceProjects <em>Workspace Projects</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.ProjectBuilder#getArchSpec <em>Arch Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.arch.ArchPackage#getProjectBuilder()
 * @model
 * @generated
 */
public interface ProjectBuilder extends EObject
{
  /**
   * Returns the value of the '<em><b>Builder Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builder Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builder Id</em>' attribute.
   * @see #setBuilderId(String)
   * @see com.sympedia.density.gen.arch.ArchPackage#getProjectBuilder_BuilderId()
   * @model id="true" required="true"
   * @generated
   */
  String getBuilderId();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.arch.ProjectBuilder#getBuilderId <em>Builder Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Builder Id</em>' attribute.
   * @see #getBuilderId()
   * @generated
   */
  void setBuilderId(String value);

  /**
   * Returns the value of the '<em><b>Workspace Projects</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.WorkspaceProject}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.WorkspaceProject#getBuilders <em>Builders</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace Projects</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace Projects</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getProjectBuilder_WorkspaceProjects()
   * @see com.sympedia.density.gen.arch.WorkspaceProject#getBuilders
   * @model type="com.sympedia.density.gen.arch.WorkspaceProject" opposite="builders"
   * @generated
   */
  EList getWorkspaceProjects();

  /**
   * Returns the value of the '<em><b>Arch Spec</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.ArchitectureSpec#getBuilders <em>Builders</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arch Spec</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arch Spec</em>' container reference.
   * @see #setArchSpec(ArchitectureSpec)
   * @see com.sympedia.density.gen.arch.ArchPackage#getProjectBuilder_ArchSpec()
   * @see com.sympedia.density.gen.arch.ArchitectureSpec#getBuilders
   * @model opposite="builders" required="true"
   * @generated
   */
  ArchitectureSpec getArchSpec();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.arch.ProjectBuilder#getArchSpec <em>Arch Spec</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arch Spec</em>' container reference.
   * @see #getArchSpec()
   * @generated
   */
  void setArchSpec(ArchitectureSpec value);

} // ProjectBuilder

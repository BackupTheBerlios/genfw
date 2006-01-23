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


import com.sympedia.genfw.ProjectInitializationProvider;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.WorkspaceProject#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.WorkspaceProject#getBuilders <em>Builders</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.WorkspaceProject#getNatures <em>Natures</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.WorkspaceProject#getArchSpec <em>Arch Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.arch.ArchPackage#getWorkspaceProject()
 * @model
 * @generated
 */
public interface WorkspaceProject extends ProjectInitializationProvider
{
  /**
   * Returns the value of the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Name</em>' attribute.
   * @see #setProjectName(String)
   * @see com.sympedia.density.gen.arch.ArchPackage#getWorkspaceProject_ProjectName()
   * @model id="true" required="true"
   * @generated
   */
  String getProjectName();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.arch.WorkspaceProject#getProjectName <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Name</em>' attribute.
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(String value);

  /**
   * Returns the value of the '<em><b>Builders</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.ProjectBuilder}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.ProjectBuilder#getWorkspaceProjects <em>Workspace Projects</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Builders</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Builders</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getWorkspaceProject_Builders()
   * @see com.sympedia.density.gen.arch.ProjectBuilder#getWorkspaceProjects
   * @model type="com.sympedia.density.gen.arch.ProjectBuilder" opposite="workspaceProjects"
   * @generated
   */
  EList getBuilders();

  /**
   * Returns the value of the '<em><b>Natures</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.arch.ProjectNature}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.ProjectNature#getWorkspaceProjects <em>Workspace Projects</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Natures</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Natures</em>' reference list.
   * @see com.sympedia.density.gen.arch.ArchPackage#getWorkspaceProject_Natures()
   * @see com.sympedia.density.gen.arch.ProjectNature#getWorkspaceProjects
   * @model type="com.sympedia.density.gen.arch.ProjectNature" opposite="workspaceProjects"
   * @generated
   */
  EList getNatures();

  /**
   * Returns the value of the '<em><b>Arch Spec</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.arch.ArchitectureSpec#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arch Spec</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arch Spec</em>' container reference.
   * @see #setArchSpec(ArchitectureSpec)
   * @see com.sympedia.density.gen.arch.ArchPackage#getWorkspaceProject_ArchSpec()
   * @see com.sympedia.density.gen.arch.ArchitectureSpec#getProjects
   * @model opposite="projects" required="true"
   * @generated
   */
  ArchitectureSpec getArchSpec();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.arch.WorkspaceProject#getArchSpec <em>Arch Spec</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arch Spec</em>' container reference.
   * @see #getArchSpec()
   * @generated
   */
  void setArchSpec(ArchitectureSpec value);

} // WorkspaceProject

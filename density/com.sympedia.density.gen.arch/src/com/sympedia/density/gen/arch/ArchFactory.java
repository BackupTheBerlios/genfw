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


import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.arch.ArchPackage
 * @generated
 */
public interface ArchFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArchFactory eINSTANCE = com.sympedia.density.gen.arch.impl.ArchFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Workspace Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workspace Project</em>'.
   * @generated
   */
  WorkspaceProject createWorkspaceProject();

  /**
   * Returns a new object of class '<em>Project Builder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project Builder</em>'.
   * @generated
   */
  ProjectBuilder createProjectBuilder();

  /**
   * Returns a new object of class '<em>Project Nature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Project Nature</em>'.
   * @generated
   */
  ProjectNature createProjectNature();

  /**
   * Returns a new object of class '<em>Plugin Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plugin Project</em>'.
   * @generated
   */
  PluginProject createPluginProject();

  /**
   * Returns a new object of class '<em>Feature Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Project</em>'.
   * @generated
   */
  FeatureProject createFeatureProject();

  /**
   * Returns a new object of class '<em>Architecture Spec</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Architecture Spec</em>'.
   * @generated
   */
  ArchitectureSpec createArchitectureSpec();

  /**
   * Returns a new object of class '<em>Model Project</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Project</em>'.
   * @generated
   */
  ModelProject createModelProject();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArchPackage getArchPackage();

} //ArchFactory

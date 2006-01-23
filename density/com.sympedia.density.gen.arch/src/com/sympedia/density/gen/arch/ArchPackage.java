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


import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.arch.ArchFactory
 * @model kind="package"
 * @generated
 */
public interface ArchPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "arch";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sympedia.com/2006/density.gen.arch";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com.sympedia.density.gen.arch";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArchPackage eINSTANCE = com.sympedia.density.gen.arch.impl.ArchPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.arch.impl.WorkspaceProjectImpl <em>Workspace Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.arch.impl.WorkspaceProjectImpl
   * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getWorkspaceProject()
   * @generated
   */
  int WORKSPACE_PROJECT = 0;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__PROJECT_NAME = GenfwPackage.PROJECT_INITIALIZATION_PROVIDER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Builders</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__BUILDERS = GenfwPackage.PROJECT_INITIALIZATION_PROVIDER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Natures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__NATURES = GenfwPackage.PROJECT_INITIALIZATION_PROVIDER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Arch Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT__ARCH_SPEC = GenfwPackage.PROJECT_INITIALIZATION_PROVIDER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Workspace Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_PROJECT_FEATURE_COUNT = GenfwPackage.PROJECT_INITIALIZATION_PROVIDER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.arch.impl.ProjectBuilderImpl <em>Project Builder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.arch.impl.ProjectBuilderImpl
   * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getProjectBuilder()
   * @generated
   */
  int PROJECT_BUILDER = 1;

  /**
   * The feature id for the '<em><b>Builder Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_BUILDER__BUILDER_ID = 0;

  /**
   * The feature id for the '<em><b>Workspace Projects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_BUILDER__WORKSPACE_PROJECTS = 1;

  /**
   * The feature id for the '<em><b>Arch Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_BUILDER__ARCH_SPEC = 2;

  /**
   * The number of structural features of the '<em>Project Builder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_BUILDER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.arch.impl.ProjectNatureImpl <em>Project Nature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.arch.impl.ProjectNatureImpl
   * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getProjectNature()
   * @generated
   */
  int PROJECT_NATURE = 2;

  /**
   * The feature id for the '<em><b>Nature Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_NATURE__NATURE_ID = 0;

  /**
   * The feature id for the '<em><b>Workspace Projects</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_NATURE__WORKSPACE_PROJECTS = 1;

  /**
   * The feature id for the '<em><b>Arch Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_NATURE__ARCH_SPEC = 2;

  /**
   * The number of structural features of the '<em>Project Nature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_NATURE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.arch.impl.PluginProjectImpl <em>Plugin Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.arch.impl.PluginProjectImpl
   * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getPluginProject()
   * @generated
   */
  int PLUGIN_PROJECT = 3;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_PROJECT__PROJECT_NAME = WORKSPACE_PROJECT__PROJECT_NAME;

  /**
   * The feature id for the '<em><b>Builders</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_PROJECT__BUILDERS = WORKSPACE_PROJECT__BUILDERS;

  /**
   * The feature id for the '<em><b>Natures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_PROJECT__NATURES = WORKSPACE_PROJECT__NATURES;

  /**
   * The feature id for the '<em><b>Arch Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_PROJECT__ARCH_SPEC = WORKSPACE_PROJECT__ARCH_SPEC;

  /**
   * The feature id for the '<em><b>Requires</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_PROJECT__REQUIRES = WORKSPACE_PROJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Required By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_PROJECT__REQUIRED_BY = WORKSPACE_PROJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Contained By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_PROJECT__CONTAINED_BY = WORKSPACE_PROJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Plugin Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUGIN_PROJECT_FEATURE_COUNT = WORKSPACE_PROJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.arch.impl.FeatureProjectImpl <em>Feature Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.arch.impl.FeatureProjectImpl
   * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getFeatureProject()
   * @generated
   */
  int FEATURE_PROJECT = 4;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PROJECT__PROJECT_NAME = WORKSPACE_PROJECT__PROJECT_NAME;

  /**
   * The feature id for the '<em><b>Builders</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PROJECT__BUILDERS = WORKSPACE_PROJECT__BUILDERS;

  /**
   * The feature id for the '<em><b>Natures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PROJECT__NATURES = WORKSPACE_PROJECT__NATURES;

  /**
   * The feature id for the '<em><b>Arch Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PROJECT__ARCH_SPEC = WORKSPACE_PROJECT__ARCH_SPEC;

  /**
   * The feature id for the '<em><b>Includes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PROJECT__INCLUDES = WORKSPACE_PROJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Included By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PROJECT__INCLUDED_BY = WORKSPACE_PROJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Contains</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PROJECT__CONTAINS = WORKSPACE_PROJECT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Feature Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_PROJECT_FEATURE_COUNT = WORKSPACE_PROJECT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.arch.impl.ArchitectureSpecImpl <em>Architecture Spec</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.arch.impl.ArchitectureSpecImpl
   * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getArchitectureSpec()
   * @generated
   */
  int ARCHITECTURE_SPEC = 5;

  /**
   * The feature id for the '<em><b>Builders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_SPEC__BUILDERS = 0;

  /**
   * The feature id for the '<em><b>Natures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_SPEC__NATURES = 1;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_SPEC__PROJECTS = 2;

  /**
   * The number of structural features of the '<em>Architecture Spec</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARCHITECTURE_SPEC_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.sympedia.density.gen.arch.impl.ModelProjectImpl <em>Model Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sympedia.density.gen.arch.impl.ModelProjectImpl
   * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getModelProject()
   * @generated
   */
  int MODEL_PROJECT = 6;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT__PROJECT_NAME = PLUGIN_PROJECT__PROJECT_NAME;

  /**
   * The feature id for the '<em><b>Builders</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT__BUILDERS = PLUGIN_PROJECT__BUILDERS;

  /**
   * The feature id for the '<em><b>Natures</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT__NATURES = PLUGIN_PROJECT__NATURES;

  /**
   * The feature id for the '<em><b>Arch Spec</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT__ARCH_SPEC = PLUGIN_PROJECT__ARCH_SPEC;

  /**
   * The feature id for the '<em><b>Requires</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT__REQUIRES = PLUGIN_PROJECT__REQUIRES;

  /**
   * The feature id for the '<em><b>Required By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT__REQUIRED_BY = PLUGIN_PROJECT__REQUIRED_BY;

  /**
   * The feature id for the '<em><b>Contained By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT__CONTAINED_BY = PLUGIN_PROJECT__CONTAINED_BY;

  /**
   * The feature id for the '<em><b>Model Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT__MODEL_NAME = PLUGIN_PROJECT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Model Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_PROJECT_FEATURE_COUNT = PLUGIN_PROJECT_FEATURE_COUNT + 1;

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.arch.WorkspaceProject <em>Workspace Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workspace Project</em>'.
   * @see com.sympedia.density.gen.arch.WorkspaceProject
   * @generated
   */
  EClass getWorkspaceProject();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.arch.WorkspaceProject#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see com.sympedia.density.gen.arch.WorkspaceProject#getProjectName()
   * @see #getWorkspaceProject()
   * @generated
   */
  EAttribute getWorkspaceProject_ProjectName();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.WorkspaceProject#getBuilders <em>Builders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Builders</em>'.
   * @see com.sympedia.density.gen.arch.WorkspaceProject#getBuilders()
   * @see #getWorkspaceProject()
   * @generated
   */
  EReference getWorkspaceProject_Builders();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.WorkspaceProject#getNatures <em>Natures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Natures</em>'.
   * @see com.sympedia.density.gen.arch.WorkspaceProject#getNatures()
   * @see #getWorkspaceProject()
   * @generated
   */
  EReference getWorkspaceProject_Natures();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.arch.WorkspaceProject#getArchSpec <em>Arch Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Arch Spec</em>'.
   * @see com.sympedia.density.gen.arch.WorkspaceProject#getArchSpec()
   * @see #getWorkspaceProject()
   * @generated
   */
  EReference getWorkspaceProject_ArchSpec();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.arch.ProjectBuilder <em>Project Builder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Builder</em>'.
   * @see com.sympedia.density.gen.arch.ProjectBuilder
   * @generated
   */
  EClass getProjectBuilder();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.arch.ProjectBuilder#getBuilderId <em>Builder Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Builder Id</em>'.
   * @see com.sympedia.density.gen.arch.ProjectBuilder#getBuilderId()
   * @see #getProjectBuilder()
   * @generated
   */
  EAttribute getProjectBuilder_BuilderId();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.ProjectBuilder#getWorkspaceProjects <em>Workspace Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Workspace Projects</em>'.
   * @see com.sympedia.density.gen.arch.ProjectBuilder#getWorkspaceProjects()
   * @see #getProjectBuilder()
   * @generated
   */
  EReference getProjectBuilder_WorkspaceProjects();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.arch.ProjectBuilder#getArchSpec <em>Arch Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Arch Spec</em>'.
   * @see com.sympedia.density.gen.arch.ProjectBuilder#getArchSpec()
   * @see #getProjectBuilder()
   * @generated
   */
  EReference getProjectBuilder_ArchSpec();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.arch.ProjectNature <em>Project Nature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project Nature</em>'.
   * @see com.sympedia.density.gen.arch.ProjectNature
   * @generated
   */
  EClass getProjectNature();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.arch.ProjectNature#getNatureId <em>Nature Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nature Id</em>'.
   * @see com.sympedia.density.gen.arch.ProjectNature#getNatureId()
   * @see #getProjectNature()
   * @generated
   */
  EAttribute getProjectNature_NatureId();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.ProjectNature#getWorkspaceProjects <em>Workspace Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Workspace Projects</em>'.
   * @see com.sympedia.density.gen.arch.ProjectNature#getWorkspaceProjects()
   * @see #getProjectNature()
   * @generated
   */
  EReference getProjectNature_WorkspaceProjects();

  /**
   * Returns the meta object for the container reference '{@link com.sympedia.density.gen.arch.ProjectNature#getArchSpec <em>Arch Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Arch Spec</em>'.
   * @see com.sympedia.density.gen.arch.ProjectNature#getArchSpec()
   * @see #getProjectNature()
   * @generated
   */
  EReference getProjectNature_ArchSpec();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.arch.PluginProject <em>Plugin Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plugin Project</em>'.
   * @see com.sympedia.density.gen.arch.PluginProject
   * @generated
   */
  EClass getPluginProject();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.PluginProject#getRequires <em>Requires</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Requires</em>'.
   * @see com.sympedia.density.gen.arch.PluginProject#getRequires()
   * @see #getPluginProject()
   * @generated
   */
  EReference getPluginProject_Requires();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.PluginProject#getRequiredBy <em>Required By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Required By</em>'.
   * @see com.sympedia.density.gen.arch.PluginProject#getRequiredBy()
   * @see #getPluginProject()
   * @generated
   */
  EReference getPluginProject_RequiredBy();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.PluginProject#getContainedBy <em>Contained By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Contained By</em>'.
   * @see com.sympedia.density.gen.arch.PluginProject#getContainedBy()
   * @see #getPluginProject()
   * @generated
   */
  EReference getPluginProject_ContainedBy();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.arch.FeatureProject <em>Feature Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Project</em>'.
   * @see com.sympedia.density.gen.arch.FeatureProject
   * @generated
   */
  EClass getFeatureProject();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.FeatureProject#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Includes</em>'.
   * @see com.sympedia.density.gen.arch.FeatureProject#getIncludes()
   * @see #getFeatureProject()
   * @generated
   */
  EReference getFeatureProject_Includes();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.FeatureProject#getIncludedBy <em>Included By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Included By</em>'.
   * @see com.sympedia.density.gen.arch.FeatureProject#getIncludedBy()
   * @see #getFeatureProject()
   * @generated
   */
  EReference getFeatureProject_IncludedBy();

  /**
   * Returns the meta object for the reference list '{@link com.sympedia.density.gen.arch.FeatureProject#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Contains</em>'.
   * @see com.sympedia.density.gen.arch.FeatureProject#getContains()
   * @see #getFeatureProject()
   * @generated
   */
  EReference getFeatureProject_Contains();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.arch.ArchitectureSpec <em>Architecture Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Architecture Spec</em>'.
   * @see com.sympedia.density.gen.arch.ArchitectureSpec
   * @generated
   */
  EClass getArchitectureSpec();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.arch.ArchitectureSpec#getBuilders <em>Builders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Builders</em>'.
   * @see com.sympedia.density.gen.arch.ArchitectureSpec#getBuilders()
   * @see #getArchitectureSpec()
   * @generated
   */
  EReference getArchitectureSpec_Builders();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.arch.ArchitectureSpec#getNatures <em>Natures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Natures</em>'.
   * @see com.sympedia.density.gen.arch.ArchitectureSpec#getNatures()
   * @see #getArchitectureSpec()
   * @generated
   */
  EReference getArchitectureSpec_Natures();

  /**
   * Returns the meta object for the containment reference list '{@link com.sympedia.density.gen.arch.ArchitectureSpec#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see com.sympedia.density.gen.arch.ArchitectureSpec#getProjects()
   * @see #getArchitectureSpec()
   * @generated
   */
  EReference getArchitectureSpec_Projects();

  /**
   * Returns the meta object for class '{@link com.sympedia.density.gen.arch.ModelProject <em>Model Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Project</em>'.
   * @see com.sympedia.density.gen.arch.ModelProject
   * @generated
   */
  EClass getModelProject();

  /**
   * Returns the meta object for the attribute '{@link com.sympedia.density.gen.arch.ModelProject#getModelName <em>Model Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Name</em>'.
   * @see com.sympedia.density.gen.arch.ModelProject#getModelName()
   * @see #getModelProject()
   * @generated
   */
  EAttribute getModelProject_ModelName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArchFactory getArchFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.arch.impl.WorkspaceProjectImpl <em>Workspace Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.arch.impl.WorkspaceProjectImpl
     * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getWorkspaceProject()
     * @generated
     */
    EClass WORKSPACE_PROJECT = eINSTANCE.getWorkspaceProject();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKSPACE_PROJECT__PROJECT_NAME = eINSTANCE.getWorkspaceProject_ProjectName();

    /**
     * The meta object literal for the '<em><b>Builders</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE_PROJECT__BUILDERS = eINSTANCE.getWorkspaceProject_Builders();

    /**
     * The meta object literal for the '<em><b>Natures</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE_PROJECT__NATURES = eINSTANCE.getWorkspaceProject_Natures();

    /**
     * The meta object literal for the '<em><b>Arch Spec</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE_PROJECT__ARCH_SPEC = eINSTANCE.getWorkspaceProject_ArchSpec();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.arch.impl.ProjectBuilderImpl <em>Project Builder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.arch.impl.ProjectBuilderImpl
     * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getProjectBuilder()
     * @generated
     */
    EClass PROJECT_BUILDER = eINSTANCE.getProjectBuilder();

    /**
     * The meta object literal for the '<em><b>Builder Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT_BUILDER__BUILDER_ID = eINSTANCE.getProjectBuilder_BuilderId();

    /**
     * The meta object literal for the '<em><b>Workspace Projects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT_BUILDER__WORKSPACE_PROJECTS = eINSTANCE
            .getProjectBuilder_WorkspaceProjects();

    /**
     * The meta object literal for the '<em><b>Arch Spec</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT_BUILDER__ARCH_SPEC = eINSTANCE.getProjectBuilder_ArchSpec();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.arch.impl.ProjectNatureImpl <em>Project Nature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.arch.impl.ProjectNatureImpl
     * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getProjectNature()
     * @generated
     */
    EClass PROJECT_NATURE = eINSTANCE.getProjectNature();

    /**
     * The meta object literal for the '<em><b>Nature Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT_NATURE__NATURE_ID = eINSTANCE.getProjectNature_NatureId();

    /**
     * The meta object literal for the '<em><b>Workspace Projects</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT_NATURE__WORKSPACE_PROJECTS = eINSTANCE.getProjectNature_WorkspaceProjects();

    /**
     * The meta object literal for the '<em><b>Arch Spec</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT_NATURE__ARCH_SPEC = eINSTANCE.getProjectNature_ArchSpec();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.arch.impl.PluginProjectImpl <em>Plugin Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.arch.impl.PluginProjectImpl
     * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getPluginProject()
     * @generated
     */
    EClass PLUGIN_PROJECT = eINSTANCE.getPluginProject();

    /**
     * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_PROJECT__REQUIRES = eINSTANCE.getPluginProject_Requires();

    /**
     * The meta object literal for the '<em><b>Required By</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_PROJECT__REQUIRED_BY = eINSTANCE.getPluginProject_RequiredBy();

    /**
     * The meta object literal for the '<em><b>Contained By</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUGIN_PROJECT__CONTAINED_BY = eINSTANCE.getPluginProject_ContainedBy();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.arch.impl.FeatureProjectImpl <em>Feature Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.arch.impl.FeatureProjectImpl
     * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getFeatureProject()
     * @generated
     */
    EClass FEATURE_PROJECT = eINSTANCE.getFeatureProject();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_PROJECT__INCLUDES = eINSTANCE.getFeatureProject_Includes();

    /**
     * The meta object literal for the '<em><b>Included By</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_PROJECT__INCLUDED_BY = eINSTANCE.getFeatureProject_IncludedBy();

    /**
     * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_PROJECT__CONTAINS = eINSTANCE.getFeatureProject_Contains();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.arch.impl.ArchitectureSpecImpl <em>Architecture Spec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.arch.impl.ArchitectureSpecImpl
     * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getArchitectureSpec()
     * @generated
     */
    EClass ARCHITECTURE_SPEC = eINSTANCE.getArchitectureSpec();

    /**
     * The meta object literal for the '<em><b>Builders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_SPEC__BUILDERS = eINSTANCE.getArchitectureSpec_Builders();

    /**
     * The meta object literal for the '<em><b>Natures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_SPEC__NATURES = eINSTANCE.getArchitectureSpec_Natures();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARCHITECTURE_SPEC__PROJECTS = eINSTANCE.getArchitectureSpec_Projects();

    /**
     * The meta object literal for the '{@link com.sympedia.density.gen.arch.impl.ModelProjectImpl <em>Model Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sympedia.density.gen.arch.impl.ModelProjectImpl
     * @see com.sympedia.density.gen.arch.impl.ArchPackageImpl#getModelProject()
     * @generated
     */
    EClass MODEL_PROJECT = eINSTANCE.getModelProject();

    /**
     * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_PROJECT__MODEL_NAME = eINSTANCE.getModelProject_ModelName();

  }

} //ArchPackage

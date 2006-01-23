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
package com.sympedia.density.gen.arch.impl;


import com.sympedia.density.gen.arch.ArchFactory;
import com.sympedia.density.gen.arch.ArchPackage;
import com.sympedia.density.gen.arch.ArchitectureSpec;
import com.sympedia.density.gen.arch.FeatureProject;
import com.sympedia.density.gen.arch.ModelProject;
import com.sympedia.density.gen.arch.PluginProject;
import com.sympedia.density.gen.arch.ProjectBuilder;
import com.sympedia.density.gen.arch.ProjectNature;
import com.sympedia.density.gen.arch.WorkspaceProject;

import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchPackageImpl extends EPackageImpl implements ArchPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass workspaceProjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectBuilderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectNatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pluginProjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureProjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architectureSpecEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelProjectEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.sympedia.density.gen.arch.ArchPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArchPackageImpl()
  {
    super(eNS_URI, ArchFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArchPackage init()
  {
    if (isInited) return (ArchPackage)EPackage.Registry.INSTANCE.getEPackage(ArchPackage.eNS_URI);

    // Obtain or create and register package
    ArchPackageImpl theArchPackage = (ArchPackageImpl)(EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) instanceof ArchPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) : new ArchPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    GenfwPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theArchPackage.createPackageContents();

    // Initialize created meta-data
    theArchPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArchPackage.freeze();

    return theArchPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorkspaceProject()
  {
    return workspaceProjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWorkspaceProject_ProjectName()
  {
    return (EAttribute)workspaceProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkspaceProject_Builders()
  {
    return (EReference)workspaceProjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkspaceProject_Natures()
  {
    return (EReference)workspaceProjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorkspaceProject_ArchSpec()
  {
    return (EReference)workspaceProjectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectBuilder()
  {
    return projectBuilderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectBuilder_BuilderId()
  {
    return (EAttribute)projectBuilderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectBuilder_WorkspaceProjects()
  {
    return (EReference)projectBuilderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectBuilder_ArchSpec()
  {
    return (EReference)projectBuilderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectNature()
  {
    return projectNatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectNature_NatureId()
  {
    return (EAttribute)projectNatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectNature_WorkspaceProjects()
  {
    return (EReference)projectNatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectNature_ArchSpec()
  {
    return (EReference)projectNatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPluginProject()
  {
    return pluginProjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginProject_Requires()
  {
    return (EReference)pluginProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginProject_RequiredBy()
  {
    return (EReference)pluginProjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPluginProject_ContainedBy()
  {
    return (EReference)pluginProjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureProject()
  {
    return featureProjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureProject_Includes()
  {
    return (EReference)featureProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureProject_IncludedBy()
  {
    return (EReference)featureProjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureProject_Contains()
  {
    return (EReference)featureProjectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchitectureSpec()
  {
    return architectureSpecEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureSpec_Builders()
  {
    return (EReference)architectureSpecEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureSpec_Natures()
  {
    return (EReference)architectureSpecEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureSpec_Projects()
  {
    return (EReference)architectureSpecEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelProject()
  {
    return modelProjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelProject_ModelName()
  {
    return (EAttribute)modelProjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchFactory getArchFactory()
  {
    return (ArchFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    workspaceProjectEClass = createEClass(WORKSPACE_PROJECT);
    createEAttribute(workspaceProjectEClass, WORKSPACE_PROJECT__PROJECT_NAME);
    createEReference(workspaceProjectEClass, WORKSPACE_PROJECT__BUILDERS);
    createEReference(workspaceProjectEClass, WORKSPACE_PROJECT__NATURES);
    createEReference(workspaceProjectEClass, WORKSPACE_PROJECT__ARCH_SPEC);

    projectBuilderEClass = createEClass(PROJECT_BUILDER);
    createEAttribute(projectBuilderEClass, PROJECT_BUILDER__BUILDER_ID);
    createEReference(projectBuilderEClass, PROJECT_BUILDER__WORKSPACE_PROJECTS);
    createEReference(projectBuilderEClass, PROJECT_BUILDER__ARCH_SPEC);

    projectNatureEClass = createEClass(PROJECT_NATURE);
    createEAttribute(projectNatureEClass, PROJECT_NATURE__NATURE_ID);
    createEReference(projectNatureEClass, PROJECT_NATURE__WORKSPACE_PROJECTS);
    createEReference(projectNatureEClass, PROJECT_NATURE__ARCH_SPEC);

    pluginProjectEClass = createEClass(PLUGIN_PROJECT);
    createEReference(pluginProjectEClass, PLUGIN_PROJECT__REQUIRES);
    createEReference(pluginProjectEClass, PLUGIN_PROJECT__REQUIRED_BY);
    createEReference(pluginProjectEClass, PLUGIN_PROJECT__CONTAINED_BY);

    featureProjectEClass = createEClass(FEATURE_PROJECT);
    createEReference(featureProjectEClass, FEATURE_PROJECT__INCLUDES);
    createEReference(featureProjectEClass, FEATURE_PROJECT__INCLUDED_BY);
    createEReference(featureProjectEClass, FEATURE_PROJECT__CONTAINS);

    architectureSpecEClass = createEClass(ARCHITECTURE_SPEC);
    createEReference(architectureSpecEClass, ARCHITECTURE_SPEC__BUILDERS);
    createEReference(architectureSpecEClass, ARCHITECTURE_SPEC__NATURES);
    createEReference(architectureSpecEClass, ARCHITECTURE_SPEC__PROJECTS);

    modelProjectEClass = createEClass(MODEL_PROJECT);
    createEAttribute(modelProjectEClass, MODEL_PROJECT__MODEL_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    GenfwPackage theGenfwPackage = (GenfwPackage)EPackage.Registry.INSTANCE
            .getEPackage(GenfwPackage.eNS_URI);

    // Add supertypes to classes
    workspaceProjectEClass.getESuperTypes().add(theGenfwPackage.getProjectInitializationProvider());
    pluginProjectEClass.getESuperTypes().add(this.getWorkspaceProject());
    featureProjectEClass.getESuperTypes().add(this.getWorkspaceProject());
    modelProjectEClass.getESuperTypes().add(this.getPluginProject());

    // Initialize classes and features; add operations and parameters
    initEClass(workspaceProjectEClass, WorkspaceProject.class, "WorkspaceProject", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWorkspaceProject_ProjectName(), ecorePackage.getEString(), "projectName",
            null, 1, 1, WorkspaceProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkspaceProject_Builders(), this.getProjectBuilder(), this
            .getProjectBuilder_WorkspaceProjects(), "builders", null, 0, -1,
            WorkspaceProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkspaceProject_Natures(), this.getProjectNature(), this
            .getProjectNature_WorkspaceProjects(), "natures", null, 0, -1, WorkspaceProject.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWorkspaceProject_ArchSpec(), this.getArchitectureSpec(), this
            .getArchitectureSpec_Projects(), "archSpec", null, 1, 1, WorkspaceProject.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectBuilderEClass, ProjectBuilder.class, "ProjectBuilder", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProjectBuilder_BuilderId(), ecorePackage.getEString(), "builderId", null, 1,
            1, ProjectBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectBuilder_WorkspaceProjects(), this.getWorkspaceProject(), this
            .getWorkspaceProject_Builders(), "workspaceProjects", null, 0, -1,
            ProjectBuilder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectBuilder_ArchSpec(), this.getArchitectureSpec(), this
            .getArchitectureSpec_Builders(), "archSpec", null, 1, 1, ProjectBuilder.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectNatureEClass, ProjectNature.class, "ProjectNature", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProjectNature_NatureId(), ecorePackage.getEString(), "natureId", null, 1, 1,
            ProjectNature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectNature_WorkspaceProjects(), this.getWorkspaceProject(), this
            .getWorkspaceProject_Natures(), "workspaceProjects", null, 0, -1, ProjectNature.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectNature_ArchSpec(), this.getArchitectureSpec(), this
            .getArchitectureSpec_Natures(), "archSpec", null, 1, 1, ProjectNature.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pluginProjectEClass, PluginProject.class, "PluginProject", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPluginProject_Requires(), this.getPluginProject(), this
            .getPluginProject_RequiredBy(), "requires", null, 0, -1, PluginProject.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPluginProject_RequiredBy(), this.getPluginProject(), this
            .getPluginProject_Requires(), "requiredBy", null, 0, -1, PluginProject.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPluginProject_ContainedBy(), this.getFeatureProject(), this
            .getFeatureProject_Contains(), "containedBy", null, 0, -1, PluginProject.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(featureProjectEClass, FeatureProject.class, "FeatureProject", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureProject_Includes(), this.getFeatureProject(), this
            .getFeatureProject_IncludedBy(), "includes", null, 0, -1, FeatureProject.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureProject_IncludedBy(), this.getFeatureProject(), this
            .getFeatureProject_Includes(), "includedBy", null, 0, -1, FeatureProject.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureProject_Contains(), this.getPluginProject(), this
            .getPluginProject_ContainedBy(), "contains", null, 0, -1, FeatureProject.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(architectureSpecEClass, ArchitectureSpec.class, "ArchitectureSpec", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArchitectureSpec_Builders(), this.getProjectBuilder(), this
            .getProjectBuilder_ArchSpec(), "builders", null, 0, -1, ArchitectureSpec.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitectureSpec_Natures(), this.getProjectNature(), this
            .getProjectNature_ArchSpec(), "natures", null, 0, -1, ArchitectureSpec.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitectureSpec_Projects(), this.getWorkspaceProject(), this
            .getWorkspaceProject_ArchSpec(), "projects", null, 1, -1, ArchitectureSpec.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelProjectEClass, ModelProject.class, "ModelProject", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelProject_ModelName(), ecorePackage.getEString(), "modelName", null, 1, 1,
            ModelProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ArchPackageImpl

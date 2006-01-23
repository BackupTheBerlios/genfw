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


import com.sympedia.density.gen.arch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchFactoryImpl extends EFactoryImpl implements ArchFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArchFactory init()
  {
    try
    {
      ArchFactory theArchFactory = (ArchFactory)EPackage.Registry.INSTANCE
              .getEFactory("http://www.sympedia.com/2006/density.gen.arch");
      if (theArchFactory != null)
      {
        return theArchFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArchFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case ArchPackage.WORKSPACE_PROJECT:
      return createWorkspaceProject();
    case ArchPackage.PROJECT_BUILDER:
      return createProjectBuilder();
    case ArchPackage.PROJECT_NATURE:
      return createProjectNature();
    case ArchPackage.PLUGIN_PROJECT:
      return createPluginProject();
    case ArchPackage.FEATURE_PROJECT:
      return createFeatureProject();
    case ArchPackage.ARCHITECTURE_SPEC:
      return createArchitectureSpec();
    case ArchPackage.MODEL_PROJECT:
      return createModelProject();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName()
              + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkspaceProject createWorkspaceProject()
  {
    WorkspaceProjectImpl workspaceProject = new WorkspaceProjectImpl();
    return workspaceProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectBuilder createProjectBuilder()
  {
    ProjectBuilderImpl projectBuilder = new ProjectBuilderImpl();
    return projectBuilder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectNature createProjectNature()
  {
    ProjectNatureImpl projectNature = new ProjectNatureImpl();
    return projectNature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PluginProject createPluginProject()
  {
    PluginProjectImpl pluginProject = new PluginProjectImpl();
    return pluginProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureProject createFeatureProject()
  {
    FeatureProjectImpl featureProject = new FeatureProjectImpl();
    return featureProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureSpec createArchitectureSpec()
  {
    ArchitectureSpecImpl architectureSpec = new ArchitectureSpecImpl();
    return architectureSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelProject createModelProject()
  {
    ModelProjectImpl modelProject = new ModelProjectImpl();
    return modelProject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchPackage getArchPackage()
  {
    return (ArchPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static ArchPackage getPackage()
  {
    return ArchPackage.eINSTANCE;
  }

} //ArchFactoryImpl

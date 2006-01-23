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
package com.sympedia.density.gen.arch.util;


import com.sympedia.density.gen.arch.*;

import com.sympedia.genfw.ProjectInitializationProvider;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.arch.ArchPackage
 * @generated
 */
public class ArchAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArchPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ArchPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch the delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchSwitch modelSwitch = new ArchSwitch()
  {
    public Object caseWorkspaceProject(WorkspaceProject object)
    {
      return createWorkspaceProjectAdapter();
    }

    public Object caseProjectBuilder(ProjectBuilder object)
    {
      return createProjectBuilderAdapter();
    }

    public Object caseProjectNature(ProjectNature object)
    {
      return createProjectNatureAdapter();
    }

    public Object casePluginProject(PluginProject object)
    {
      return createPluginProjectAdapter();
    }

    public Object caseFeatureProject(FeatureProject object)
    {
      return createFeatureProjectAdapter();
    }

    public Object caseArchitectureSpec(ArchitectureSpec object)
    {
      return createArchitectureSpecAdapter();
    }

    public Object caseModelProject(ModelProject object)
    {
      return createModelProjectAdapter();
    }

    public Object caseProjectInitializationProvider(ProjectInitializationProvider object)
    {
      return createProjectInitializationProviderAdapter();
    }

    public Object defaultCase(EObject object)
    {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  public Adapter createAdapter(Notifier target)
  {
    return (Adapter)modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.arch.WorkspaceProject <em>Workspace Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.arch.WorkspaceProject
   * @generated
   */
  public Adapter createWorkspaceProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.arch.ProjectBuilder <em>Project Builder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.arch.ProjectBuilder
   * @generated
   */
  public Adapter createProjectBuilderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.arch.ProjectNature <em>Project Nature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.arch.ProjectNature
   * @generated
   */
  public Adapter createProjectNatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.arch.PluginProject <em>Plugin Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.arch.PluginProject
   * @generated
   */
  public Adapter createPluginProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.arch.FeatureProject <em>Feature Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.arch.FeatureProject
   * @generated
   */
  public Adapter createFeatureProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.arch.ArchitectureSpec <em>Architecture Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.arch.ArchitectureSpec
   * @generated
   */
  public Adapter createArchitectureSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.density.gen.arch.ModelProject <em>Model Project</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.density.gen.arch.ModelProject
   * @generated
   */
  public Adapter createModelProjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ProjectInitializationProvider <em>Project Initialization Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ProjectInitializationProvider
   * @generated
   */
  public Adapter createProjectInitializationProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ArchAdapterFactory

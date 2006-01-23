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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.arch.ArchPackage
 * @generated
 */
public class ArchSwitch
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArchPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ArchPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public Object doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List eSuperTypes = theEClass.getESuperTypes();
      return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass)eSuperTypes.get(0),
              theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
    case ArchPackage.WORKSPACE_PROJECT:
    {
      WorkspaceProject workspaceProject = (WorkspaceProject)theEObject;
      Object result = caseWorkspaceProject(workspaceProject);
      if (result == null) result = caseProjectInitializationProvider(workspaceProject);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case ArchPackage.PROJECT_BUILDER:
    {
      ProjectBuilder projectBuilder = (ProjectBuilder)theEObject;
      Object result = caseProjectBuilder(projectBuilder);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case ArchPackage.PROJECT_NATURE:
    {
      ProjectNature projectNature = (ProjectNature)theEObject;
      Object result = caseProjectNature(projectNature);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case ArchPackage.PLUGIN_PROJECT:
    {
      PluginProject pluginProject = (PluginProject)theEObject;
      Object result = casePluginProject(pluginProject);
      if (result == null) result = caseWorkspaceProject(pluginProject);
      if (result == null) result = caseProjectInitializationProvider(pluginProject);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case ArchPackage.FEATURE_PROJECT:
    {
      FeatureProject featureProject = (FeatureProject)theEObject;
      Object result = caseFeatureProject(featureProject);
      if (result == null) result = caseWorkspaceProject(featureProject);
      if (result == null) result = caseProjectInitializationProvider(featureProject);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case ArchPackage.ARCHITECTURE_SPEC:
    {
      ArchitectureSpec architectureSpec = (ArchitectureSpec)theEObject;
      Object result = caseArchitectureSpec(architectureSpec);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case ArchPackage.MODEL_PROJECT:
    {
      ModelProject modelProject = (ModelProject)theEObject;
      Object result = caseModelProject(modelProject);
      if (result == null) result = casePluginProject(modelProject);
      if (result == null) result = caseWorkspaceProject(modelProject);
      if (result == null) result = caseProjectInitializationProvider(modelProject);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Workspace Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Workspace Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseWorkspaceProject(WorkspaceProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Project Builder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Project Builder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseProjectBuilder(ProjectBuilder object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Project Nature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Project Nature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseProjectNature(ProjectNature object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Plugin Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Plugin Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object casePluginProject(PluginProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Feature Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Feature Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseFeatureProject(FeatureProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Architecture Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Architecture Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseArchitectureSpec(ArchitectureSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Model Project</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Model Project</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseModelProject(ModelProject object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Project Initialization Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Project Initialization Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseProjectInitializationProvider(ProjectInitializationProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public Object defaultCase(EObject object)
  {
    return null;
  }

} //ArchSwitch

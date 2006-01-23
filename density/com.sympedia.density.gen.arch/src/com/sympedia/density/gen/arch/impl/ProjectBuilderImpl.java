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


import com.sympedia.density.gen.arch.ArchPackage;
import com.sympedia.density.gen.arch.ArchitectureSpec;
import com.sympedia.density.gen.arch.ProjectBuilder;
import com.sympedia.density.gen.arch.WorkspaceProject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.impl.ProjectBuilderImpl#getBuilderId <em>Builder Id</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.ProjectBuilderImpl#getWorkspaceProjects <em>Workspace Projects</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.ProjectBuilderImpl#getArchSpec <em>Arch Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectBuilderImpl extends EObjectImpl implements ProjectBuilder
{
  /**
   * The default value of the '{@link #getBuilderId() <em>Builder Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilderId()
   * @generated
   * @ordered
   */
  protected static final String BUILDER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBuilderId() <em>Builder Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilderId()
   * @generated
   * @ordered
   */
  protected String builderId = BUILDER_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getWorkspaceProjects() <em>Workspace Projects</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkspaceProjects()
   * @generated
   * @ordered
   */
  protected EList workspaceProjects = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectBuilderImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return ArchPackage.Literals.PROJECT_BUILDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBuilderId()
  {
    return builderId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBuilderId(String newBuilderId)
  {
    String oldBuilderId = builderId;
    builderId = newBuilderId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              ArchPackage.PROJECT_BUILDER__BUILDER_ID, oldBuilderId, builderId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getWorkspaceProjects()
  {
    if (workspaceProjects == null)
    {
      workspaceProjects = new EObjectWithInverseResolvingEList.ManyInverse(WorkspaceProject.class,
              this, ArchPackage.PROJECT_BUILDER__WORKSPACE_PROJECTS,
              ArchPackage.WORKSPACE_PROJECT__BUILDERS);
    }
    return workspaceProjects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureSpec getArchSpec()
  {
    if (eContainerFeatureID != ArchPackage.PROJECT_BUILDER__ARCH_SPEC) return null;
    return (ArchitectureSpec)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchSpec(ArchitectureSpec newArchSpec)
  {
    if (newArchSpec != eInternalContainer()
            || (eContainerFeatureID != ArchPackage.PROJECT_BUILDER__ARCH_SPEC && newArchSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newArchSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newArchSpec != null)
        msgs = ((InternalEObject)newArchSpec).eInverseAdd(this,
                ArchPackage.ARCHITECTURE_SPEC__BUILDERS, ArchitectureSpec.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newArchSpec,
              ArchPackage.PROJECT_BUILDER__ARCH_SPEC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArchPackage.PROJECT_BUILDER__ARCH_SPEC,
              newArchSpec, newArchSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
          NotificationChain msgs)
  {
    switch (featureID)
    {
    case ArchPackage.PROJECT_BUILDER__WORKSPACE_PROJECTS:
      return ((InternalEList)getWorkspaceProjects()).basicAdd(otherEnd, msgs);
    case ArchPackage.PROJECT_BUILDER__ARCH_SPEC:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, ArchPackage.PROJECT_BUILDER__ARCH_SPEC, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
          NotificationChain msgs)
  {
    switch (featureID)
    {
    case ArchPackage.PROJECT_BUILDER__WORKSPACE_PROJECTS:
      return ((InternalEList)getWorkspaceProjects()).basicRemove(otherEnd, msgs);
    case ArchPackage.PROJECT_BUILDER__ARCH_SPEC:
      return eBasicSetContainer(null, ArchPackage.PROJECT_BUILDER__ARCH_SPEC, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
    case ArchPackage.PROJECT_BUILDER__ARCH_SPEC:
      return eInternalContainer().eInverseRemove(this, ArchPackage.ARCHITECTURE_SPEC__BUILDERS,
              ArchitectureSpec.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ArchPackage.PROJECT_BUILDER__BUILDER_ID:
      return getBuilderId();
    case ArchPackage.PROJECT_BUILDER__WORKSPACE_PROJECTS:
      return getWorkspaceProjects();
    case ArchPackage.PROJECT_BUILDER__ARCH_SPEC:
      return getArchSpec();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ArchPackage.PROJECT_BUILDER__BUILDER_ID:
      setBuilderId((String)newValue);
      return;
    case ArchPackage.PROJECT_BUILDER__WORKSPACE_PROJECTS:
      getWorkspaceProjects().clear();
      getWorkspaceProjects().addAll((Collection)newValue);
      return;
    case ArchPackage.PROJECT_BUILDER__ARCH_SPEC:
      setArchSpec((ArchitectureSpec)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case ArchPackage.PROJECT_BUILDER__BUILDER_ID:
      setBuilderId(BUILDER_ID_EDEFAULT);
      return;
    case ArchPackage.PROJECT_BUILDER__WORKSPACE_PROJECTS:
      getWorkspaceProjects().clear();
      return;
    case ArchPackage.PROJECT_BUILDER__ARCH_SPEC:
      setArchSpec((ArchitectureSpec)null);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case ArchPackage.PROJECT_BUILDER__BUILDER_ID:
      return BUILDER_ID_EDEFAULT == null ? builderId != null : !BUILDER_ID_EDEFAULT
              .equals(builderId);
    case ArchPackage.PROJECT_BUILDER__WORKSPACE_PROJECTS:
      return workspaceProjects != null && !workspaceProjects.isEmpty();
    case ArchPackage.PROJECT_BUILDER__ARCH_SPEC:
      return getArchSpec() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (builderId: ");
    result.append(builderId);
    result.append(')');
    return result.toString();
  }

} //ProjectBuilderImpl

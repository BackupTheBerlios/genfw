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
import com.sympedia.density.gen.arch.ProjectNature;
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.impl.WorkspaceProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.WorkspaceProjectImpl#getBuilders <em>Builders</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.WorkspaceProjectImpl#getNatures <em>Natures</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.WorkspaceProjectImpl#getArchSpec <em>Arch Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkspaceProjectImpl extends EObjectImpl implements WorkspaceProject
{
  /**
   * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected static final String PROJECT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjectName()
   * @generated
   * @ordered
   */
  protected String projectName = PROJECT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBuilders() <em>Builders</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilders()
   * @generated
   * @ordered
   */
  protected EList builders = null;

  /**
   * The cached value of the '{@link #getNatures() <em>Natures</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNatures()
   * @generated
   * @ordered
   */
  protected EList natures = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkspaceProjectImpl()
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
    return ArchPackage.Literals.WORKSPACE_PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjectName()
  {
    return projectName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjectName(String newProjectName)
  {
    String oldProjectName = projectName;
    projectName = newProjectName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              ArchPackage.WORKSPACE_PROJECT__PROJECT_NAME, oldProjectName, projectName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getBuilders()
  {
    if (builders == null)
    {
      builders = new EObjectWithInverseResolvingEList.ManyInverse(ProjectBuilder.class, this,
              ArchPackage.WORKSPACE_PROJECT__BUILDERS,
              ArchPackage.PROJECT_BUILDER__WORKSPACE_PROJECTS);
    }
    return builders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getNatures()
  {
    if (natures == null)
    {
      natures = new EObjectWithInverseResolvingEList.ManyInverse(ProjectNature.class, this,
              ArchPackage.WORKSPACE_PROJECT__NATURES,
              ArchPackage.PROJECT_NATURE__WORKSPACE_PROJECTS);
    }
    return natures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureSpec getArchSpec()
  {
    if (eContainerFeatureID != ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC) return null;
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
            || (eContainerFeatureID != ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC && newArchSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newArchSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newArchSpec != null)
        msgs = ((InternalEObject)newArchSpec).eInverseAdd(this,
                ArchPackage.ARCHITECTURE_SPEC__PROJECTS, ArchitectureSpec.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newArchSpec,
              ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC, newArchSpec, newArchSpec));
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
    case ArchPackage.WORKSPACE_PROJECT__BUILDERS:
      return ((InternalEList)getBuilders()).basicAdd(otherEnd, msgs);
    case ArchPackage.WORKSPACE_PROJECT__NATURES:
      return ((InternalEList)getNatures()).basicAdd(otherEnd, msgs);
    case ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC, msgs);
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
    case ArchPackage.WORKSPACE_PROJECT__BUILDERS:
      return ((InternalEList)getBuilders()).basicRemove(otherEnd, msgs);
    case ArchPackage.WORKSPACE_PROJECT__NATURES:
      return ((InternalEList)getNatures()).basicRemove(otherEnd, msgs);
    case ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC:
      return eBasicSetContainer(null, ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC, msgs);
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
    case ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC:
      return eInternalContainer().eInverseRemove(this, ArchPackage.ARCHITECTURE_SPEC__PROJECTS,
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
    case ArchPackage.WORKSPACE_PROJECT__PROJECT_NAME:
      return getProjectName();
    case ArchPackage.WORKSPACE_PROJECT__BUILDERS:
      return getBuilders();
    case ArchPackage.WORKSPACE_PROJECT__NATURES:
      return getNatures();
    case ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC:
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
    case ArchPackage.WORKSPACE_PROJECT__PROJECT_NAME:
      setProjectName((String)newValue);
      return;
    case ArchPackage.WORKSPACE_PROJECT__BUILDERS:
      getBuilders().clear();
      getBuilders().addAll((Collection)newValue);
      return;
    case ArchPackage.WORKSPACE_PROJECT__NATURES:
      getNatures().clear();
      getNatures().addAll((Collection)newValue);
      return;
    case ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC:
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
    case ArchPackage.WORKSPACE_PROJECT__PROJECT_NAME:
      setProjectName(PROJECT_NAME_EDEFAULT);
      return;
    case ArchPackage.WORKSPACE_PROJECT__BUILDERS:
      getBuilders().clear();
      return;
    case ArchPackage.WORKSPACE_PROJECT__NATURES:
      getNatures().clear();
      return;
    case ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC:
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
    case ArchPackage.WORKSPACE_PROJECT__PROJECT_NAME:
      return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT
              .equals(projectName);
    case ArchPackage.WORKSPACE_PROJECT__BUILDERS:
      return builders != null && !builders.isEmpty();
    case ArchPackage.WORKSPACE_PROJECT__NATURES:
      return natures != null && !natures.isEmpty();
    case ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC:
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
    result.append(" (projectName: ");
    result.append(projectName);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  public List<String> getBuilderIdsToInitialize()
  {
    List<String> result = new ArrayList<String>();
    for (Iterator it = getBuilders().iterator(); it.hasNext();)
    {
      ProjectBuilder builder = (ProjectBuilder)it.next();
      String builderId = builder.getBuilderId();
      if (builderId != null && builderId.length() != 0)
      {
        result.add(builderId);
      }
    }

    return result;
  }

  /**
   * @ADDED
   */
  public List<String> getNatureIdsToInitialize()
  {
    List<String> result = new ArrayList<String>();
    for (Iterator it = getNatures().iterator(); it.hasNext();)
    {
      ProjectNature nature = (ProjectNature)it.next();
      String natureId = nature.getNatureId();
      if (natureId != null && natureId.length() != 0)
      {
        result.add(natureId);
      }
    }

    return result;
  }

  /**
   * @ADDED
   */
  public String getProjectNameToInitialize()
  {
    return getProjectName();
  }
} //WorkspaceProjectImpl

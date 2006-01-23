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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.impl.ArchitectureSpecImpl#getBuilders <em>Builders</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.ArchitectureSpecImpl#getNatures <em>Natures</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.ArchitectureSpecImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitectureSpecImpl extends EObjectImpl implements ArchitectureSpec
{
  /**
   * The cached value of the '{@link #getBuilders() <em>Builders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBuilders()
   * @generated
   * @ordered
   */
  protected EList builders = null;

  /**
   * The cached value of the '{@link #getNatures() <em>Natures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNatures()
   * @generated
   * @ordered
   */
  protected EList natures = null;

  /**
   * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjects()
   * @generated
   * @ordered
   */
  protected EList projects = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchitectureSpecImpl()
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
    return ArchPackage.Literals.ARCHITECTURE_SPEC;
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
      builders = new EObjectContainmentWithInverseEList(ProjectBuilder.class, this,
              ArchPackage.ARCHITECTURE_SPEC__BUILDERS, ArchPackage.PROJECT_BUILDER__ARCH_SPEC);
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
      natures = new EObjectContainmentWithInverseEList(ProjectNature.class, this,
              ArchPackage.ARCHITECTURE_SPEC__NATURES, ArchPackage.PROJECT_NATURE__ARCH_SPEC);
    }
    return natures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getProjects()
  {
    if (projects == null)
    {
      projects = new EObjectContainmentWithInverseEList(WorkspaceProject.class, this,
              ArchPackage.ARCHITECTURE_SPEC__PROJECTS, ArchPackage.WORKSPACE_PROJECT__ARCH_SPEC);
    }
    return projects;
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
    case ArchPackage.ARCHITECTURE_SPEC__BUILDERS:
      return ((InternalEList)getBuilders()).basicAdd(otherEnd, msgs);
    case ArchPackage.ARCHITECTURE_SPEC__NATURES:
      return ((InternalEList)getNatures()).basicAdd(otherEnd, msgs);
    case ArchPackage.ARCHITECTURE_SPEC__PROJECTS:
      return ((InternalEList)getProjects()).basicAdd(otherEnd, msgs);
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
    case ArchPackage.ARCHITECTURE_SPEC__BUILDERS:
      return ((InternalEList)getBuilders()).basicRemove(otherEnd, msgs);
    case ArchPackage.ARCHITECTURE_SPEC__NATURES:
      return ((InternalEList)getNatures()).basicRemove(otherEnd, msgs);
    case ArchPackage.ARCHITECTURE_SPEC__PROJECTS:
      return ((InternalEList)getProjects()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case ArchPackage.ARCHITECTURE_SPEC__BUILDERS:
      return getBuilders();
    case ArchPackage.ARCHITECTURE_SPEC__NATURES:
      return getNatures();
    case ArchPackage.ARCHITECTURE_SPEC__PROJECTS:
      return getProjects();
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
    case ArchPackage.ARCHITECTURE_SPEC__BUILDERS:
      getBuilders().clear();
      getBuilders().addAll((Collection)newValue);
      return;
    case ArchPackage.ARCHITECTURE_SPEC__NATURES:
      getNatures().clear();
      getNatures().addAll((Collection)newValue);
      return;
    case ArchPackage.ARCHITECTURE_SPEC__PROJECTS:
      getProjects().clear();
      getProjects().addAll((Collection)newValue);
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
    case ArchPackage.ARCHITECTURE_SPEC__BUILDERS:
      getBuilders().clear();
      return;
    case ArchPackage.ARCHITECTURE_SPEC__NATURES:
      getNatures().clear();
      return;
    case ArchPackage.ARCHITECTURE_SPEC__PROJECTS:
      getProjects().clear();
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
    case ArchPackage.ARCHITECTURE_SPEC__BUILDERS:
      return builders != null && !builders.isEmpty();
    case ArchPackage.ARCHITECTURE_SPEC__NATURES:
      return natures != null && !natures.isEmpty();
    case ArchPackage.ARCHITECTURE_SPEC__PROJECTS:
      return projects != null && !projects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArchitectureSpecImpl

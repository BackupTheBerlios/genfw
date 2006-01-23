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
import com.sympedia.density.gen.arch.FeatureProject;
import com.sympedia.density.gen.arch.PluginProject;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.impl.FeatureProjectImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.FeatureProjectImpl#getIncludedBy <em>Included By</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.FeatureProjectImpl#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureProjectImpl extends WorkspaceProjectImpl implements FeatureProject
{
  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList includes = null;

  /**
   * The cached value of the '{@link #getIncludedBy() <em>Included By</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedBy()
   * @generated
   * @ordered
   */
  protected EList includedBy = null;

  /**
   * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContains()
   * @generated
   * @ordered
   */
  protected EList contains = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureProjectImpl()
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
    return ArchPackage.Literals.FEATURE_PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectWithInverseResolvingEList.ManyInverse(FeatureProject.class, this,
              ArchPackage.FEATURE_PROJECT__INCLUDES, ArchPackage.FEATURE_PROJECT__INCLUDED_BY);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getIncludedBy()
  {
    if (includedBy == null)
    {
      includedBy = new EObjectWithInverseResolvingEList.ManyInverse(FeatureProject.class, this,
              ArchPackage.FEATURE_PROJECT__INCLUDED_BY, ArchPackage.FEATURE_PROJECT__INCLUDES);
    }
    return includedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getContains()
  {
    if (contains == null)
    {
      contains = new EObjectWithInverseResolvingEList.ManyInverse(PluginProject.class, this,
              ArchPackage.FEATURE_PROJECT__CONTAINS, ArchPackage.PLUGIN_PROJECT__CONTAINED_BY);
    }
    return contains;
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
    case ArchPackage.FEATURE_PROJECT__INCLUDES:
      return ((InternalEList)getIncludes()).basicAdd(otherEnd, msgs);
    case ArchPackage.FEATURE_PROJECT__INCLUDED_BY:
      return ((InternalEList)getIncludedBy()).basicAdd(otherEnd, msgs);
    case ArchPackage.FEATURE_PROJECT__CONTAINS:
      return ((InternalEList)getContains()).basicAdd(otherEnd, msgs);
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
    case ArchPackage.FEATURE_PROJECT__INCLUDES:
      return ((InternalEList)getIncludes()).basicRemove(otherEnd, msgs);
    case ArchPackage.FEATURE_PROJECT__INCLUDED_BY:
      return ((InternalEList)getIncludedBy()).basicRemove(otherEnd, msgs);
    case ArchPackage.FEATURE_PROJECT__CONTAINS:
      return ((InternalEList)getContains()).basicRemove(otherEnd, msgs);
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
    case ArchPackage.FEATURE_PROJECT__INCLUDES:
      return getIncludes();
    case ArchPackage.FEATURE_PROJECT__INCLUDED_BY:
      return getIncludedBy();
    case ArchPackage.FEATURE_PROJECT__CONTAINS:
      return getContains();
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
    case ArchPackage.FEATURE_PROJECT__INCLUDES:
      getIncludes().clear();
      getIncludes().addAll((Collection)newValue);
      return;
    case ArchPackage.FEATURE_PROJECT__INCLUDED_BY:
      getIncludedBy().clear();
      getIncludedBy().addAll((Collection)newValue);
      return;
    case ArchPackage.FEATURE_PROJECT__CONTAINS:
      getContains().clear();
      getContains().addAll((Collection)newValue);
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
    case ArchPackage.FEATURE_PROJECT__INCLUDES:
      getIncludes().clear();
      return;
    case ArchPackage.FEATURE_PROJECT__INCLUDED_BY:
      getIncludedBy().clear();
      return;
    case ArchPackage.FEATURE_PROJECT__CONTAINS:
      getContains().clear();
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
    case ArchPackage.FEATURE_PROJECT__INCLUDES:
      return includes != null && !includes.isEmpty();
    case ArchPackage.FEATURE_PROJECT__INCLUDED_BY:
      return includedBy != null && !includedBy.isEmpty();
    case ArchPackage.FEATURE_PROJECT__CONTAINS:
      return contains != null && !contains.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FeatureProjectImpl

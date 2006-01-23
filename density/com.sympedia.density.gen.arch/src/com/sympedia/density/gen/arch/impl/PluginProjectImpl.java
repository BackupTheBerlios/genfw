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
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.arch.impl.PluginProjectImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.PluginProjectImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link com.sympedia.density.gen.arch.impl.PluginProjectImpl#getContainedBy <em>Contained By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PluginProjectImpl extends WorkspaceProjectImpl implements PluginProject
{
  private static final String SCHEMA_BUILDER = "org.eclipse.pde.SchemaBuilder";

  private static final String MANIFEST_BUILDER = "org.eclipse.pde.ManifestBuilder";

  private static final String JAVA_BUILDER = "org.eclipse.jdt.core.javabuilder";

  private static final String JAVA_NATURE = "org.eclipse.jdt.core.javanature";

  private static final String PLUGIN_NATURE = "org.eclipse.pde.PluginNature";

  /**
   * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequires()
   * @generated
   * @ordered
   */
  protected EList requires = null;

  /**
   * The cached value of the '{@link #getRequiredBy() <em>Required By</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredBy()
   * @generated
   * @ordered
   */
  protected EList requiredBy = null;

  /**
   * The cached value of the '{@link #getContainedBy() <em>Contained By</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainedBy()
   * @generated
   * @ordered
   */
  protected EList containedBy = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PluginProjectImpl()
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
    return ArchPackage.Literals.PLUGIN_PROJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRequires()
  {
    if (requires == null)
    {
      requires = new EObjectWithInverseResolvingEList.ManyInverse(PluginProject.class, this,
              ArchPackage.PLUGIN_PROJECT__REQUIRES, ArchPackage.PLUGIN_PROJECT__REQUIRED_BY);
    }
    return requires;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRequiredBy()
  {
    if (requiredBy == null)
    {
      requiredBy = new EObjectWithInverseResolvingEList.ManyInverse(PluginProject.class, this,
              ArchPackage.PLUGIN_PROJECT__REQUIRED_BY, ArchPackage.PLUGIN_PROJECT__REQUIRES);
    }
    return requiredBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getContainedBy()
  {
    if (containedBy == null)
    {
      containedBy = new EObjectWithInverseResolvingEList.ManyInverse(FeatureProject.class, this,
              ArchPackage.PLUGIN_PROJECT__CONTAINED_BY, ArchPackage.FEATURE_PROJECT__CONTAINS);
    }
    return containedBy;
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
    case ArchPackage.PLUGIN_PROJECT__REQUIRES:
      return ((InternalEList)getRequires()).basicAdd(otherEnd, msgs);
    case ArchPackage.PLUGIN_PROJECT__REQUIRED_BY:
      return ((InternalEList)getRequiredBy()).basicAdd(otherEnd, msgs);
    case ArchPackage.PLUGIN_PROJECT__CONTAINED_BY:
      return ((InternalEList)getContainedBy()).basicAdd(otherEnd, msgs);
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
    case ArchPackage.PLUGIN_PROJECT__REQUIRES:
      return ((InternalEList)getRequires()).basicRemove(otherEnd, msgs);
    case ArchPackage.PLUGIN_PROJECT__REQUIRED_BY:
      return ((InternalEList)getRequiredBy()).basicRemove(otherEnd, msgs);
    case ArchPackage.PLUGIN_PROJECT__CONTAINED_BY:
      return ((InternalEList)getContainedBy()).basicRemove(otherEnd, msgs);
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
    case ArchPackage.PLUGIN_PROJECT__REQUIRES:
      return getRequires();
    case ArchPackage.PLUGIN_PROJECT__REQUIRED_BY:
      return getRequiredBy();
    case ArchPackage.PLUGIN_PROJECT__CONTAINED_BY:
      return getContainedBy();
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
    case ArchPackage.PLUGIN_PROJECT__REQUIRES:
      getRequires().clear();
      getRequires().addAll((Collection)newValue);
      return;
    case ArchPackage.PLUGIN_PROJECT__REQUIRED_BY:
      getRequiredBy().clear();
      getRequiredBy().addAll((Collection)newValue);
      return;
    case ArchPackage.PLUGIN_PROJECT__CONTAINED_BY:
      getContainedBy().clear();
      getContainedBy().addAll((Collection)newValue);
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
    case ArchPackage.PLUGIN_PROJECT__REQUIRES:
      getRequires().clear();
      return;
    case ArchPackage.PLUGIN_PROJECT__REQUIRED_BY:
      getRequiredBy().clear();
      return;
    case ArchPackage.PLUGIN_PROJECT__CONTAINED_BY:
      getContainedBy().clear();
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
    case ArchPackage.PLUGIN_PROJECT__REQUIRES:
      return requires != null && !requires.isEmpty();
    case ArchPackage.PLUGIN_PROJECT__REQUIRED_BY:
      return requiredBy != null && !requiredBy.isEmpty();
    case ArchPackage.PLUGIN_PROJECT__CONTAINED_BY:
      return containedBy != null && !containedBy.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  @Override
  public List<String> getBuilderIdsToInitialize()
  {
    List<String> result = super.getBuilderIdsToInitialize();
    if (!result.contains(JAVA_BUILDER))
    {
      result.add(JAVA_BUILDER);
    }

    if (!result.contains(MANIFEST_BUILDER))
    {
      result.add(MANIFEST_BUILDER);
    }

    if (!result.contains(SCHEMA_BUILDER))
    {
      result.add(SCHEMA_BUILDER);
    }

    return result;
  }

  /**
   * @ADDED
   */
  public List<String> getNatureIdsToInitialize()
  {
    List<String> result = super.getNatureIdsToInitialize();
    if (!result.contains(JAVA_NATURE))
    {
      result.add(JAVA_NATURE);
    }

    if (!result.contains(PLUGIN_NATURE))
    {
      result.add(PLUGIN_NATURE);
    }

    return result;
  }
} //PluginProjectImpl

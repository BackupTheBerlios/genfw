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
package com.sympedia.genfw.impl;


import com.sympedia.genfw.ContentProvider;
import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.Generator;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.RuleSet;
import com.sympedia.genfw.util.ClasspathHelper;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.GenLibImpl#getContentProviders <em>Content Providers</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.GenLibImpl#getGenerators <em>Generators</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.GenLibImpl#getRuleSets <em>Rule Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenLibImpl extends EObjectImpl implements GenLib
{
  /**
   * The cached value of the '{@link #getContentProviders() <em>Content Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentProviders()
   * @generated
   * @ordered
   */
  protected EList contentProviders = null;

  /**
   * The cached value of the '{@link #getGenerators() <em>Generators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerators()
   * @generated
   * @ordered
   */
  protected EList generators = null;

  /**
   * The cached value of the '{@link #getRuleSets() <em>Rule Sets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleSets()
   * @generated
   * @ordered
   */
  protected EList ruleSets = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenLibImpl()
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
    return GenfwPackage.Literals.GEN_LIB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getContentProviders()
  {
    if (contentProviders == null)
    {
      contentProviders = new EObjectContainmentWithInverseEList(ContentProvider.class, this,
              GenfwPackage.GEN_LIB__CONTENT_PROVIDERS, GenfwPackage.CONTENT_PROVIDER__ROOT);
    }
    return contentProviders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getGenerators()
  {
    if (generators == null)
    {
      generators = new EObjectContainmentWithInverseEList(Generator.class, this,
              GenfwPackage.GEN_LIB__GENERATORS, GenfwPackage.GENERATOR__ROOT);
    }
    return generators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRuleSets()
  {
    if (ruleSets == null)
    {
      ruleSets = new EObjectContainmentWithInverseEList(RuleSet.class, this,
              GenfwPackage.GEN_LIB__RULE_SETS, GenfwPackage.RULE_SET__ROOT);
    }
    return ruleSets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public ClassLoader getClassLoader(ClassLoader parentClassLoader)
  {
    if (eResource() != lastEResource)
    {
      cachedClassLoaders.clear();
      lastEResource = eResource();
    }

    if (lastEResource == null)
    {
      return parentClassLoader;
    }

    ClassLoader result = cachedClassLoaders.get(parentClassLoader);
    if (result == null)
    {
      result = ClasspathHelper.getClassLoader(eResource(), parentClassLoader);
      cachedClassLoaders.put(parentClassLoader, result);
    }

    return result;
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
    case GenfwPackage.GEN_LIB__CONTENT_PROVIDERS:
      return ((InternalEList)getContentProviders()).basicAdd(otherEnd, msgs);
    case GenfwPackage.GEN_LIB__GENERATORS:
      return ((InternalEList)getGenerators()).basicAdd(otherEnd, msgs);
    case GenfwPackage.GEN_LIB__RULE_SETS:
      return ((InternalEList)getRuleSets()).basicAdd(otherEnd, msgs);
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
    case GenfwPackage.GEN_LIB__CONTENT_PROVIDERS:
      return ((InternalEList)getContentProviders()).basicRemove(otherEnd, msgs);
    case GenfwPackage.GEN_LIB__GENERATORS:
      return ((InternalEList)getGenerators()).basicRemove(otherEnd, msgs);
    case GenfwPackage.GEN_LIB__RULE_SETS:
      return ((InternalEList)getRuleSets()).basicRemove(otherEnd, msgs);
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
    case GenfwPackage.GEN_LIB__CONTENT_PROVIDERS:
      return getContentProviders();
    case GenfwPackage.GEN_LIB__GENERATORS:
      return getGenerators();
    case GenfwPackage.GEN_LIB__RULE_SETS:
      return getRuleSets();
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
    case GenfwPackage.GEN_LIB__CONTENT_PROVIDERS:
      getContentProviders().clear();
      getContentProviders().addAll((Collection)newValue);
      return;
    case GenfwPackage.GEN_LIB__GENERATORS:
      getGenerators().clear();
      getGenerators().addAll((Collection)newValue);
      return;
    case GenfwPackage.GEN_LIB__RULE_SETS:
      getRuleSets().clear();
      getRuleSets().addAll((Collection)newValue);
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
    case GenfwPackage.GEN_LIB__CONTENT_PROVIDERS:
      getContentProviders().clear();
      return;
    case GenfwPackage.GEN_LIB__GENERATORS:
      getGenerators().clear();
      return;
    case GenfwPackage.GEN_LIB__RULE_SETS:
      getRuleSets().clear();
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
    case GenfwPackage.GEN_LIB__CONTENT_PROVIDERS:
      return contentProviders != null && !contentProviders.isEmpty();
    case GenfwPackage.GEN_LIB__GENERATORS:
      return generators != null && !generators.isEmpty();
    case GenfwPackage.GEN_LIB__RULE_SETS:
      return ruleSets != null && !ruleSets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  private Map<ClassLoader, ClassLoader> cachedClassLoaders = new HashMap<ClassLoader, ClassLoader>();

  /**
   * @ADDED
   */
  private Resource lastEResource;
} //GenLibImpl

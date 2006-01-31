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
package com.sympedia.genfw.ocl.impl;


import com.sympedia.genfw.ocl.ConfigurableOclRule;
import com.sympedia.genfw.ocl.OclPackage;
import com.sympedia.genfw.ocl.PackageConfiguration;
import com.sympedia.genfw.ocl.internal.OclActivator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurable Ocl Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.ocl.impl.ConfigurableOclRuleImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurableOclRuleImpl extends OclRuleImpl implements ConfigurableOclRule
{
  /**
   * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackages()
   * @generated
   * @ordered
   */
  protected EList packages = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurableOclRuleImpl()
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
    return OclPackage.Literals.CONFIGURABLE_OCL_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getPackages()
  {
    if (packages == null)
    {
      packages = new EObjectContainmentWithInverseEList(PackageConfiguration.class, this,
              OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES,
              OclPackage.PACKAGE_CONFIGURATION__OCL_RULE);
    }
    return packages;
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
    case OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES:
      return ((InternalEList)getPackages()).basicAdd(otherEnd, msgs);
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
    case OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES:
      return ((InternalEList)getPackages()).basicRemove(otherEnd, msgs);
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
    case OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES:
      return getPackages();
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
    case OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES:
      getPackages().clear();
      getPackages().addAll((Collection)newValue);
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
    case OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES:
      getPackages().clear();
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
    case OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES:
      return packages != null && !packages.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  @Override
  public Registry getPackageRegistry() throws Exception
  {
    Registry registry = new EPackageRegistryImpl();
    EList packageConfigs = getPackages();
    for (Iterator it = packageConfigs.iterator(); it.hasNext();)
    {
      PackageConfiguration packageConfig = (PackageConfiguration)it.next();
      EPackage ePackage = packageConfig.getPackage();
      if (ePackage == null)
      {
        OclActivator.INSTANCE.log("No EPackage: " + this);
      }
      else
      {
        registry.put(ePackage.getNsURI(), ePackage);
      }
    }

    return registry;
  }
} //ConfigurableOclRuleImpl

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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.ocl.impl.PackageConfigurationImpl#getOclRule <em>Ocl Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PackageConfigurationImpl extends EObjectImpl implements PackageConfiguration
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageConfigurationImpl()
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
    return OclPackage.Literals.PACKAGE_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurableOclRule getOclRule()
  {
    if (eContainerFeatureID != OclPackage.PACKAGE_CONFIGURATION__OCL_RULE) return null;
    return (ConfigurableOclRule)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOclRule(ConfigurableOclRule newOclRule)
  {
    if (newOclRule != eInternalContainer()
            || (eContainerFeatureID != OclPackage.PACKAGE_CONFIGURATION__OCL_RULE && newOclRule != null))
    {
      if (EcoreUtil.isAncestor(this, newOclRule))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newOclRule != null)
        msgs = ((InternalEObject)newOclRule).eInverseAdd(this,
                OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES, ConfigurableOclRule.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newOclRule,
              OclPackage.PACKAGE_CONFIGURATION__OCL_RULE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              OclPackage.PACKAGE_CONFIGURATION__OCL_RULE, newOclRule, newOclRule));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public abstract EPackage getPackage() throws Exception;

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
    case OclPackage.PACKAGE_CONFIGURATION__OCL_RULE:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, OclPackage.PACKAGE_CONFIGURATION__OCL_RULE, msgs);
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
    case OclPackage.PACKAGE_CONFIGURATION__OCL_RULE:
      return eBasicSetContainer(null, OclPackage.PACKAGE_CONFIGURATION__OCL_RULE, msgs);
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
    case OclPackage.PACKAGE_CONFIGURATION__OCL_RULE:
      return eInternalContainer().eInverseRemove(this, OclPackage.CONFIGURABLE_OCL_RULE__PACKAGES,
              ConfigurableOclRule.class, msgs);
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
    case OclPackage.PACKAGE_CONFIGURATION__OCL_RULE:
      return getOclRule();
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
    case OclPackage.PACKAGE_CONFIGURATION__OCL_RULE:
      setOclRule((ConfigurableOclRule)newValue);
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
    case OclPackage.PACKAGE_CONFIGURATION__OCL_RULE:
      setOclRule((ConfigurableOclRule)null);
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
    case OclPackage.PACKAGE_CONFIGURATION__OCL_RULE:
      return getOclRule() != null;
    }
    return super.eIsSet(featureID);
  }

} //PackageConfigurationImpl

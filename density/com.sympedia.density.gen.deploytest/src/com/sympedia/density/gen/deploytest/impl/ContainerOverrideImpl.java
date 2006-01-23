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
package com.sympedia.density.gen.deploytest.impl;


import com.sympedia.density.gen.deploytest.ContainerOverride;
import com.sympedia.density.gen.deploytest.DeploymentOverride;
import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.TestSpec;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Override</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ContainerOverrideImpl#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ContainerOverrideImpl#getDeploymentOverrides <em>Deployment Overrides</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerOverrideImpl extends NamedElementImpl implements ContainerOverride
{
  /**
   * The cached value of the '{@link #getDeploymentOverrides() <em>Deployment Overrides</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeploymentOverrides()
   * @generated
   * @ordered
   */
  protected EList deploymentOverrides = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerOverrideImpl()
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
    return DeploytestPackage.Literals.CONTAINER_OVERRIDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSpec getTestSpec()
  {
    if (eContainerFeatureID != DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC) return null;
    return (TestSpec)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTestSpec(TestSpec newTestSpec)
  {
    if (newTestSpec != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC && newTestSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newTestSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newTestSpec != null)
        msgs = ((InternalEObject)newTestSpec).eInverseAdd(this,
                DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES, TestSpec.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newTestSpec,
              DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC, newTestSpec, newTestSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDeploymentOverrides()
  {
    if (deploymentOverrides == null)
    {
      deploymentOverrides = new EObjectContainmentWithInverseEList(DeploymentOverride.class, this,
              DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES,
              DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE);
    }
    return deploymentOverrides;
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
      case DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC, msgs);
      case DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES:
        return ((InternalEList)getDeploymentOverrides()).basicAdd(otherEnd, msgs);
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
      case DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC:
        return eBasicSetContainer(null, DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC, msgs);
      case DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES:
        return ((InternalEList)getDeploymentOverrides()).basicRemove(otherEnd, msgs);
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
      case DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES, TestSpec.class, msgs);
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
      case DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC:
        return getTestSpec();
      case DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES:
        return getDeploymentOverrides();
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
      case DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC:
        setTestSpec((TestSpec)newValue);
        return;
      case DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES:
        getDeploymentOverrides().clear();
        getDeploymentOverrides().addAll((Collection)newValue);
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
      case DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC:
        setTestSpec((TestSpec)null);
        return;
      case DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES:
        getDeploymentOverrides().clear();
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
      case DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC:
        return getTestSpec() != null;
      case DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES:
        return deploymentOverrides != null && !deploymentOverrides.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  @Override
  public String getDisplayLabel()
  {
    return getName() == null || getName().length() == 0 ? null : getName();
  }
} //ContainerOverrideImpl

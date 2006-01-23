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
package com.sympedia.density.gen.deploy.impl;


import com.sympedia.density.gen.deploy.Dependency;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DependencyImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DependencyImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DependencyImpl extends EObjectImpl implements Dependency
{
  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EStructuralFeature feature = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
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
    return DeployPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature getFeature()
  {
    if (feature != null && feature.eIsProxy())
    {
      InternalEObject oldFeature = (InternalEObject)feature;
      feature = (EStructuralFeature)eResolveProxy(oldFeature);
      if (feature != oldFeature)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeployPackage.DEPENDENCY__FEATURE, oldFeature, feature));
      }
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EStructuralFeature basicGetFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(EStructuralFeature newFeature)
  {
    EStructuralFeature oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.DEPENDENCY__FEATURE,
              oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment getDeployment()
  {
    if (eContainerFeatureID != DeployPackage.DEPENDENCY__DEPLOYMENT) return null;
    return (Deployment)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeployment(Deployment newDeployment)
  {
    if (newDeployment != eInternalContainer()
            || (eContainerFeatureID != DeployPackage.DEPENDENCY__DEPLOYMENT && newDeployment != null))
    {
      if (EcoreUtil.isAncestor(this, newDeployment))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newDeployment != null)
        msgs = ((InternalEObject)newDeployment).eInverseAdd(this,
                DeployPackage.DEPLOYMENT__DEPENDENCIES, Deployment.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newDeployment,
              DeployPackage.DEPENDENCY__DEPLOYMENT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.DEPENDENCY__DEPLOYMENT,
              newDeployment, newDeployment));
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
      case DeployPackage.DEPENDENCY__DEPLOYMENT:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeployPackage.DEPENDENCY__DEPLOYMENT, msgs);
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
      case DeployPackage.DEPENDENCY__DEPLOYMENT:
        return eBasicSetContainer(null, DeployPackage.DEPENDENCY__DEPLOYMENT, msgs);
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
      case DeployPackage.DEPENDENCY__DEPLOYMENT:
        return eInternalContainer().eInverseRemove(this, DeployPackage.DEPLOYMENT__DEPENDENCIES,
                Deployment.class, msgs);
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
      case DeployPackage.DEPENDENCY__FEATURE:
        if (resolve) return getFeature();
        return basicGetFeature();
      case DeployPackage.DEPENDENCY__DEPLOYMENT:
        return getDeployment();
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
      case DeployPackage.DEPENDENCY__FEATURE:
        setFeature((EStructuralFeature)newValue);
        return;
      case DeployPackage.DEPENDENCY__DEPLOYMENT:
        setDeployment((Deployment)newValue);
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
      case DeployPackage.DEPENDENCY__FEATURE:
        setFeature((EStructuralFeature)null);
        return;
      case DeployPackage.DEPENDENCY__DEPLOYMENT:
        setDeployment((Deployment)null);
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
      case DeployPackage.DEPENDENCY__FEATURE:
        return feature != null;
      case DeployPackage.DEPENDENCY__DEPLOYMENT:
        return getDeployment() != null;
    }
    return super.eIsSet(featureID);
  }

} //DependencyImpl

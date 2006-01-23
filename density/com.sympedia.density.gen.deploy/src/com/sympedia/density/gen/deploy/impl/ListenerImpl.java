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


import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.Listener;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.ListenerImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.ListenerImpl#getNotifier <em>Notifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListenerImpl extends EObjectImpl implements Listener
{
  /**
   * The cached value of the '{@link #getNotifier() <em>Notifier</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotifier()
   * @generated
   * @ordered
   */
  protected Deployment notifier = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListenerImpl()
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
    return DeployPackage.Literals.LISTENER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment getDeployment()
  {
    if (eContainerFeatureID != DeployPackage.LISTENER__DEPLOYMENT) return null;
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
            || (eContainerFeatureID != DeployPackage.LISTENER__DEPLOYMENT && newDeployment != null))
    {
      if (EcoreUtil.isAncestor(this, newDeployment))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newDeployment != null)
        msgs = ((InternalEObject)newDeployment).eInverseAdd(this,
                DeployPackage.DEPLOYMENT__LISTENERS, Deployment.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newDeployment, DeployPackage.LISTENER__DEPLOYMENT,
              msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.LISTENER__DEPLOYMENT,
              newDeployment, newDeployment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment getNotifier()
  {
    if (notifier != null && notifier.eIsProxy())
    {
      InternalEObject oldNotifier = (InternalEObject)notifier;
      notifier = (Deployment)eResolveProxy(oldNotifier);
      if (notifier != oldNotifier)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeployPackage.LISTENER__NOTIFIER, oldNotifier, notifier));
      }
    }
    return notifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment basicGetNotifier()
  {
    return notifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotifier(Deployment newNotifier)
  {
    Deployment oldNotifier = notifier;
    notifier = newNotifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.LISTENER__NOTIFIER,
              oldNotifier, notifier));
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
      case DeployPackage.LISTENER__DEPLOYMENT:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeployPackage.LISTENER__DEPLOYMENT, msgs);
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
      case DeployPackage.LISTENER__DEPLOYMENT:
        return eBasicSetContainer(null, DeployPackage.LISTENER__DEPLOYMENT, msgs);
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
      case DeployPackage.LISTENER__DEPLOYMENT:
        return eInternalContainer().eInverseRemove(this, DeployPackage.DEPLOYMENT__LISTENERS,
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
      case DeployPackage.LISTENER__DEPLOYMENT:
        return getDeployment();
      case DeployPackage.LISTENER__NOTIFIER:
        if (resolve) return getNotifier();
        return basicGetNotifier();
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
      case DeployPackage.LISTENER__DEPLOYMENT:
        setDeployment((Deployment)newValue);
        return;
      case DeployPackage.LISTENER__NOTIFIER:
        setNotifier((Deployment)newValue);
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
      case DeployPackage.LISTENER__DEPLOYMENT:
        setDeployment((Deployment)null);
        return;
      case DeployPackage.LISTENER__NOTIFIER:
        setNotifier((Deployment)null);
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
      case DeployPackage.LISTENER__DEPLOYMENT:
        return getDeployment() != null;
      case DeployPackage.LISTENER__NOTIFIER:
        return notifier != null;
    }
    return super.eIsSet(featureID);
  }

} //ListenerImpl

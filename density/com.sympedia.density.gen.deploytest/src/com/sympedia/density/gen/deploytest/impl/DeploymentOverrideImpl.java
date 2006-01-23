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


import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploytest.ContainerOverride;
import com.sympedia.density.gen.deploytest.DeploymentOverride;
import com.sympedia.density.gen.deploytest.DeploytestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Override</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.DeploymentOverrideImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.DeploymentOverrideImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.DeploymentOverrideImpl#getContainerOverride <em>Container Override</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.DeploymentOverrideImpl#getDeploymentToOverride <em>Deployment To Override</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentOverrideImpl extends EObjectImpl implements DeploymentOverride
{
  /**
   * The default value of the '{@link #getDisplayLabel() <em>Display Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayLabel()
   * @generated
   * @ordered
   */
  protected static final String DISPLAY_LABEL_EDEFAULT = null;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeploymentToOverride() <em>Deployment To Override</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeploymentToOverride()
   * @generated
   * @ordered
   */
  protected Deployment deploymentToOverride = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentOverrideImpl()
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
    return DeploytestPackage.Literals.DEPLOYMENT_OVERRIDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getDisplayLabel()
  {
    return (getDeploymentToOverride() == null ? null : getDeploymentToOverride().getId())
            + (getDescription() != null && getDescription().length() != 0 ? " (" + getDescription()
                    + ")" : "");
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.DEPLOYMENT_OVERRIDE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerOverride getContainerOverride()
  {
    if (eContainerFeatureID != DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE)
      return null;
    return (ContainerOverride)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerOverride(ContainerOverride newContainerOverride)
  {
    if (newContainerOverride != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE && newContainerOverride != null))
    {
      if (EcoreUtil.isAncestor(this, newContainerOverride))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newContainerOverride != null)
        msgs = ((InternalEObject)newContainerOverride).eInverseAdd(this,
                DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES,
                ContainerOverride.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newContainerOverride,
              DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE, newContainerOverride,
              newContainerOverride));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment getDeploymentToOverride()
  {
    if (deploymentToOverride != null && deploymentToOverride.eIsProxy())
    {
      InternalEObject oldDeploymentToOverride = (InternalEObject)deploymentToOverride;
      deploymentToOverride = (Deployment)eResolveProxy(oldDeploymentToOverride);
      if (deploymentToOverride != oldDeploymentToOverride)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeploytestPackage.DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE,
                  oldDeploymentToOverride, deploymentToOverride));
      }
    }
    return deploymentToOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment basicGetDeploymentToOverride()
  {
    return deploymentToOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeploymentToOverride(Deployment newDeploymentToOverride)
  {
    Deployment oldDeploymentToOverride = deploymentToOverride;
    deploymentToOverride = newDeploymentToOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE,
              oldDeploymentToOverride, deploymentToOverride));
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
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd,
                DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE, msgs);
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
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE:
        return eBasicSetContainer(null, DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE,
                msgs);
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
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.CONTAINER_OVERRIDE__DEPLOYMENT_OVERRIDES,
                ContainerOverride.class, msgs);
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
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DISPLAY_LABEL:
        return getDisplayLabel();
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DESCRIPTION:
        return getDescription();
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE:
        return getContainerOverride();
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE:
        if (resolve) return getDeploymentToOverride();
        return basicGetDeploymentToOverride();
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
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE:
        setContainerOverride((ContainerOverride)newValue);
        return;
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE:
        setDeploymentToOverride((Deployment)newValue);
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
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE:
        setContainerOverride((ContainerOverride)null);
        return;
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE:
        setDeploymentToOverride((Deployment)null);
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
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DISPLAY_LABEL:
        return DISPLAY_LABEL_EDEFAULT == null ? getDisplayLabel() != null : !DISPLAY_LABEL_EDEFAULT
                .equals(getDisplayLabel());
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT
                .equals(description);
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__CONTAINER_OVERRIDE:
        return getContainerOverride() != null;
      case DeploytestPackage.DEPLOYMENT_OVERRIDE__DEPLOYMENT_TO_OVERRIDE:
        return deploymentToOverride != null;
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
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //DeploymentOverrideImpl

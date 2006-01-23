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


import com.sympedia.density.gen.deploy.Container;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.DeploymentGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentGroupImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentGroupImpl extends EObjectImpl implements DeploymentGroup
{
  /**
   * The cached value of the '{@link #getSubGroups() <em>Sub Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubGroups()
   * @generated
   * @ordered
   */
  protected EList subGroups = null;

  /**
   * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployments()
   * @generated
   * @ordered
   */
  protected EList deployments = null;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentGroupImpl()
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
    return DeployPackage.Literals.DEPLOYMENT_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Container getContainer()
  {
    if (eContainerFeatureID != DeployPackage.DEPLOYMENT_GROUP__CONTAINER) return null;
    return (Container)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(Container newContainer)
  {
    if (newContainer != eInternalContainer()
            || (eContainerFeatureID != DeployPackage.DEPLOYMENT_GROUP__CONTAINER && newContainer != null))
    {
      if (EcoreUtil.isAncestor(this, newContainer))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newContainer != null)
        msgs = ((InternalEObject)newContainer).eInverseAdd(this,
                DeployPackage.CONTAINER__DEPLOYMENT_GROUPS, Container.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newContainer,
              DeployPackage.DEPLOYMENT_GROUP__CONTAINER, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeployPackage.DEPLOYMENT_GROUP__CONTAINER, newContainer, newContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getSubGroups()
  {
    if (subGroups == null)
    {
      subGroups = new EObjectContainmentWithInverseEList(DeploymentGroup.class, this,
              DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS,
              DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP);
    }
    return subGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentGroup getSuperGroup()
  {
    if (eContainerFeatureID != DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP) return null;
    return (DeploymentGroup)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperGroup(DeploymentGroup newSuperGroup)
  {
    if (newSuperGroup != eInternalContainer()
            || (eContainerFeatureID != DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP && newSuperGroup != null))
    {
      if (EcoreUtil.isAncestor(this, newSuperGroup))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newSuperGroup != null)
        msgs = ((InternalEObject)newSuperGroup).eInverseAdd(this,
                DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS, DeploymentGroup.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newSuperGroup,
              DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP, newSuperGroup, newSuperGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDeployments()
  {
    if (deployments == null)
    {
      deployments = new EObjectContainmentWithInverseEList(Deployment.class, this,
              DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS,
              DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP);
    }
    return deployments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.DEPLOYMENT_GROUP__NAME,
              oldName, name));
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
      case DeployPackage.DEPLOYMENT_GROUP__CONTAINER:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeployPackage.DEPLOYMENT_GROUP__CONTAINER, msgs);
      case DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS:
        return ((InternalEList)getSubGroups()).basicAdd(otherEnd, msgs);
      case DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP, msgs);
      case DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS:
        return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
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
      case DeployPackage.DEPLOYMENT_GROUP__CONTAINER:
        return eBasicSetContainer(null, DeployPackage.DEPLOYMENT_GROUP__CONTAINER, msgs);
      case DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS:
        return ((InternalEList)getSubGroups()).basicRemove(otherEnd, msgs);
      case DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP:
        return eBasicSetContainer(null, DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP, msgs);
      case DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS:
        return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
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
      case DeployPackage.DEPLOYMENT_GROUP__CONTAINER:
        return eInternalContainer().eInverseRemove(this,
                DeployPackage.CONTAINER__DEPLOYMENT_GROUPS, Container.class, msgs);
      case DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP:
        return eInternalContainer().eInverseRemove(this,
                DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS, DeploymentGroup.class, msgs);
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
      case DeployPackage.DEPLOYMENT_GROUP__CONTAINER:
        return getContainer();
      case DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS:
        return getSubGroups();
      case DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP:
        return getSuperGroup();
      case DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS:
        return getDeployments();
      case DeployPackage.DEPLOYMENT_GROUP__NAME:
        return getName();
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
      case DeployPackage.DEPLOYMENT_GROUP__CONTAINER:
        setContainer((Container)newValue);
        return;
      case DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS:
        getSubGroups().clear();
        getSubGroups().addAll((Collection)newValue);
        return;
      case DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP:
        setSuperGroup((DeploymentGroup)newValue);
        return;
      case DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS:
        getDeployments().clear();
        getDeployments().addAll((Collection)newValue);
        return;
      case DeployPackage.DEPLOYMENT_GROUP__NAME:
        setName((String)newValue);
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
      case DeployPackage.DEPLOYMENT_GROUP__CONTAINER:
        setContainer((Container)null);
        return;
      case DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS:
        getSubGroups().clear();
        return;
      case DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP:
        setSuperGroup((DeploymentGroup)null);
        return;
      case DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS:
        getDeployments().clear();
        return;
      case DeployPackage.DEPLOYMENT_GROUP__NAME:
        setName(NAME_EDEFAULT);
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
      case DeployPackage.DEPLOYMENT_GROUP__CONTAINER:
        return getContainer() != null;
      case DeployPackage.DEPLOYMENT_GROUP__SUB_GROUPS:
        return subGroups != null && !subGroups.isEmpty();
      case DeployPackage.DEPLOYMENT_GROUP__SUPER_GROUP:
        return getSuperGroup() != null;
      case DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS:
        return deployments != null && !deployments.isEmpty();
      case DeployPackage.DEPLOYMENT_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DeploymentGroupImpl

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


import com.sympedia.density.gen.deploytest.Action;
import com.sympedia.density.gen.deploytest.ActionContainer;
import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.TestSpec;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ActionContainerImpl#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ActionContainerImpl#getSuperContainer <em>Super Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ActionContainerImpl#getSubContainers <em>Sub Containers</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ActionContainerImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ActionContainerImpl#getAllActions <em>All Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionContainerImpl extends NamedElementImpl implements ActionContainer
{
  /**
   * The cached value of the '{@link #getSubContainers() <em>Sub Containers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubContainers()
   * @generated
   * @ordered
   */
  protected EList subContainers = null;

  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList actions = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionContainerImpl()
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
    return DeploytestPackage.Literals.ACTION_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSpec getTestSpec()
  {
    if (eContainerFeatureID != DeploytestPackage.ACTION_CONTAINER__TEST_SPEC) return null;
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
            || (eContainerFeatureID != DeploytestPackage.ACTION_CONTAINER__TEST_SPEC && newTestSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newTestSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newTestSpec != null)
        msgs = ((InternalEObject)newTestSpec).eInverseAdd(this,
                DeploytestPackage.TEST_SPEC__ACTION_CONTAINER, TestSpec.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newTestSpec,
              DeploytestPackage.ACTION_CONTAINER__TEST_SPEC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.ACTION_CONTAINER__TEST_SPEC, newTestSpec, newTestSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionContainer getSuperContainer()
  {
    if (eContainerFeatureID != DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER) return null;
    return (ActionContainer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperContainer(ActionContainer newSuperContainer)
  {
    if (newSuperContainer != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER && newSuperContainer != null))
    {
      if (EcoreUtil.isAncestor(this, newSuperContainer))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newSuperContainer != null)
        msgs = ((InternalEObject)newSuperContainer).eInverseAdd(this,
                DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS, ActionContainer.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newSuperContainer,
              DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER, newSuperContainer,
              newSuperContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getSubContainers()
  {
    if (subContainers == null)
    {
      subContainers = new EObjectContainmentWithInverseEList(ActionContainer.class, this,
              DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS,
              DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER);
    }
    return subContainers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentWithInverseEList(Action.class, this,
              DeploytestPackage.ACTION_CONTAINER__ACTIONS, DeploytestPackage.ACTION__CONTAINER);
    }
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getAllActions()
  {
    EList result = new BasicEList();
    for (Iterator it = getActions().iterator(); it.hasNext();)
    {
      Action item = (Action)it.next();
      result.add(item);
    }

    for (Iterator it = getSubContainers().iterator(); it.hasNext();)
    {
      ActionContainer container = (ActionContainer)it.next();
      EList items = container.getAllActions();
      result.addAll(items);
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
      case DeploytestPackage.ACTION_CONTAINER__TEST_SPEC:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.ACTION_CONTAINER__TEST_SPEC, msgs);
      case DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER,
                msgs);
      case DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS:
        return ((InternalEList)getSubContainers()).basicAdd(otherEnd, msgs);
      case DeploytestPackage.ACTION_CONTAINER__ACTIONS:
        return ((InternalEList)getActions()).basicAdd(otherEnd, msgs);
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
      case DeploytestPackage.ACTION_CONTAINER__TEST_SPEC:
        return eBasicSetContainer(null, DeploytestPackage.ACTION_CONTAINER__TEST_SPEC, msgs);
      case DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER:
        return eBasicSetContainer(null, DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER, msgs);
      case DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS:
        return ((InternalEList)getSubContainers()).basicRemove(otherEnd, msgs);
      case DeploytestPackage.ACTION_CONTAINER__ACTIONS:
        return ((InternalEList)getActions()).basicRemove(otherEnd, msgs);
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
      case DeploytestPackage.ACTION_CONTAINER__TEST_SPEC:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.TEST_SPEC__ACTION_CONTAINER, TestSpec.class, msgs);
      case DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS, ActionContainer.class, msgs);
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
      case DeploytestPackage.ACTION_CONTAINER__TEST_SPEC:
        return getTestSpec();
      case DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER:
        return getSuperContainer();
      case DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS:
        return getSubContainers();
      case DeploytestPackage.ACTION_CONTAINER__ACTIONS:
        return getActions();
      case DeploytestPackage.ACTION_CONTAINER__ALL_ACTIONS:
        return getAllActions();
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
      case DeploytestPackage.ACTION_CONTAINER__TEST_SPEC:
        setTestSpec((TestSpec)newValue);
        return;
      case DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER:
        setSuperContainer((ActionContainer)newValue);
        return;
      case DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS:
        getSubContainers().clear();
        getSubContainers().addAll((Collection)newValue);
        return;
      case DeploytestPackage.ACTION_CONTAINER__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection)newValue);
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
      case DeploytestPackage.ACTION_CONTAINER__TEST_SPEC:
        setTestSpec((TestSpec)null);
        return;
      case DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER:
        setSuperContainer((ActionContainer)null);
        return;
      case DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS:
        getSubContainers().clear();
        return;
      case DeploytestPackage.ACTION_CONTAINER__ACTIONS:
        getActions().clear();
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
      case DeploytestPackage.ACTION_CONTAINER__TEST_SPEC:
        return getTestSpec() != null;
      case DeploytestPackage.ACTION_CONTAINER__SUPER_CONTAINER:
        return getSuperContainer() != null;
      case DeploytestPackage.ACTION_CONTAINER__SUB_CONTAINERS:
        return subContainers != null && !subContainers.isEmpty();
      case DeploytestPackage.ACTION_CONTAINER__ACTIONS:
        return actions != null && !actions.isEmpty();
      case DeploytestPackage.ACTION_CONTAINER__ALL_ACTIONS:
        return !getAllActions().isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActionContainerImpl

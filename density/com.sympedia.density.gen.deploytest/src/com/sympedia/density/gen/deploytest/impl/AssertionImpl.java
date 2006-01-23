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


import com.sympedia.density.gen.deploytest.Assertion;
import com.sympedia.density.gen.deploytest.AssertionContainer;
import com.sympedia.density.gen.deploytest.DeploytestPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.AssertionImpl#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionImpl extends NamedElementImpl implements Assertion
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionImpl()
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
    return DeploytestPackage.Literals.ASSERTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionContainer getContainer()
  {
    if (eContainerFeatureID != DeploytestPackage.ASSERTION__CONTAINER) return null;
    return (AssertionContainer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(AssertionContainer newContainer)
  {
    if (newContainer != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.ASSERTION__CONTAINER && newContainer != null))
    {
      if (EcoreUtil.isAncestor(this, newContainer))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newContainer != null)
        msgs = ((InternalEObject)newContainer).eInverseAdd(this,
                DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS, AssertionContainer.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newContainer,
              DeploytestPackage.ASSERTION__CONTAINER, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploytestPackage.ASSERTION__CONTAINER,
              newContainer, newContainer));
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
      case DeploytestPackage.ASSERTION__CONTAINER:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.ASSERTION__CONTAINER, msgs);
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
      case DeploytestPackage.ASSERTION__CONTAINER:
        return eBasicSetContainer(null, DeploytestPackage.ASSERTION__CONTAINER, msgs);
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
      case DeploytestPackage.ASSERTION__CONTAINER:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS, AssertionContainer.class, msgs);
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
      case DeploytestPackage.ASSERTION__CONTAINER:
        return getContainer();
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
      case DeploytestPackage.ASSERTION__CONTAINER:
        setContainer((AssertionContainer)newValue);
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
      case DeploytestPackage.ASSERTION__CONTAINER:
        setContainer((AssertionContainer)null);
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
      case DeploytestPackage.ASSERTION__CONTAINER:
        return getContainer() != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertionImpl

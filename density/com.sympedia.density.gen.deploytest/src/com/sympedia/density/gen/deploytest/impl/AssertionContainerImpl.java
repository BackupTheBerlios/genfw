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
 * An implementation of the model object '<em><b>Assertion Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl#getSuperContainer <em>Super Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl#getSubContainers <em>Sub Containers</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.AssertionContainerImpl#getAllAssertions <em>All Assertions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionContainerImpl extends NamedElementImpl implements AssertionContainer
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
   * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertions()
   * @generated
   * @ordered
   */
  protected EList assertions = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionContainerImpl()
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
    return DeploytestPackage.Literals.ASSERTION_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSpec getTestSpec()
  {
    if (eContainerFeatureID != DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC) return null;
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
            || (eContainerFeatureID != DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC && newTestSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newTestSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newTestSpec != null)
        msgs = ((InternalEObject)newTestSpec).eInverseAdd(this,
                DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER, TestSpec.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newTestSpec,
              DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC, newTestSpec, newTestSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionContainer getSuperContainer()
  {
    if (eContainerFeatureID != DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER) return null;
    return (AssertionContainer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperContainer(AssertionContainer newSuperContainer)
  {
    if (newSuperContainer != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER && newSuperContainer != null))
    {
      if (EcoreUtil.isAncestor(this, newSuperContainer))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newSuperContainer != null)
        msgs = ((InternalEObject)newSuperContainer).eInverseAdd(this,
                DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS, AssertionContainer.class,
                msgs);
      msgs = eBasicSetContainer((InternalEObject)newSuperContainer,
              DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER, newSuperContainer,
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
      subContainers = new EObjectContainmentWithInverseEList(AssertionContainer.class, this,
              DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS,
              DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER);
    }
    return subContainers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getAssertions()
  {
    if (assertions == null)
    {
      assertions = new EObjectContainmentWithInverseEList(Assertion.class, this,
              DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS,
              DeploytestPackage.ASSERTION__CONTAINER);
    }
    return assertions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getAllAssertions()
  {
    EList result = new BasicEList();
    for (Iterator it = getAssertions().iterator(); it.hasNext();)
    {
      Assertion item = (Assertion)it.next();
      result.add(item);
    }

    for (Iterator it = getSubContainers().iterator(); it.hasNext();)
    {
      AssertionContainer container = (AssertionContainer)it.next();
      EList items = container.getAllAssertions();
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
      case DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC, msgs);
      case DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER,
                msgs);
      case DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS:
        return ((InternalEList)getSubContainers()).basicAdd(otherEnd, msgs);
      case DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS:
        return ((InternalEList)getAssertions()).basicAdd(otherEnd, msgs);
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
      case DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC:
        return eBasicSetContainer(null, DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC, msgs);
      case DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER:
        return eBasicSetContainer(null, DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER,
                msgs);
      case DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS:
        return ((InternalEList)getSubContainers()).basicRemove(otherEnd, msgs);
      case DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS:
        return ((InternalEList)getAssertions()).basicRemove(otherEnd, msgs);
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
      case DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER, TestSpec.class, msgs);
      case DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS, AssertionContainer.class,
                msgs);
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
      case DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC:
        return getTestSpec();
      case DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER:
        return getSuperContainer();
      case DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS:
        return getSubContainers();
      case DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS:
        return getAssertions();
      case DeploytestPackage.ASSERTION_CONTAINER__ALL_ASSERTIONS:
        return getAllAssertions();
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
      case DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC:
        setTestSpec((TestSpec)newValue);
        return;
      case DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER:
        setSuperContainer((AssertionContainer)newValue);
        return;
      case DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS:
        getSubContainers().clear();
        getSubContainers().addAll((Collection)newValue);
        return;
      case DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS:
        getAssertions().clear();
        getAssertions().addAll((Collection)newValue);
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
      case DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC:
        setTestSpec((TestSpec)null);
        return;
      case DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER:
        setSuperContainer((AssertionContainer)null);
        return;
      case DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS:
        getSubContainers().clear();
        return;
      case DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS:
        getAssertions().clear();
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
      case DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC:
        return getTestSpec() != null;
      case DeploytestPackage.ASSERTION_CONTAINER__SUPER_CONTAINER:
        return getSuperContainer() != null;
      case DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS:
        return subContainers != null && !subContainers.isEmpty();
      case DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS:
        return assertions != null && !assertions.isEmpty();
      case DeploytestPackage.ASSERTION_CONTAINER__ALL_ASSERTIONS:
        return !getAllAssertions().isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssertionContainerImpl

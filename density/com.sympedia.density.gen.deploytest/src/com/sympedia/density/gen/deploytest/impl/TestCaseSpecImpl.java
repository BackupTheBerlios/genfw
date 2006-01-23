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


import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.IDisplayable;
import com.sympedia.density.gen.deploytest.TestCaseSpec;
import com.sympedia.density.gen.deploytest.TestSpec;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl#getDisplayLabel <em>Display Label</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl#getSpecSequence <em>Spec Sequence</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestCaseSpecImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TestCaseSpecImpl extends EObjectImpl implements TestCaseSpec
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestCaseSpecImpl()
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
    return DeploytestPackage.Literals.TEST_CASE_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getDisplayLabel()
  {
    return getDescription();
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
              DeploytestPackage.TEST_CASE_SPEC__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSpec getTestSpec()
  {
    if (eContainerFeatureID != DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC) return null;
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
            || (eContainerFeatureID != DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC && newTestSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newTestSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newTestSpec != null)
        msgs = ((InternalEObject)newTestSpec).eInverseAdd(this,
                DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS, TestSpec.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newTestSpec,
              DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC, newTestSpec, newTestSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public abstract EList getSpecSequence();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSpec getRoot()
  {
    TestSpec root = basicGetRoot();
    return root != null && root.eIsProxy() ? (TestSpec)eResolveProxy((InternalEObject)root) : root;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public abstract TestSpec basicGetRoot();

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
      case DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC, msgs);
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
      case DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC:
        return eBasicSetContainer(null, DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC, msgs);
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
      case DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS, TestSpec.class, msgs);
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
      case DeploytestPackage.TEST_CASE_SPEC__DISPLAY_LABEL:
        return getDisplayLabel();
      case DeploytestPackage.TEST_CASE_SPEC__DESCRIPTION:
        return getDescription();
      case DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC:
        return getTestSpec();
      case DeploytestPackage.TEST_CASE_SPEC__SPEC_SEQUENCE:
        return getSpecSequence();
      case DeploytestPackage.TEST_CASE_SPEC__ROOT:
        if (resolve) return getRoot();
        return basicGetRoot();
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
      case DeploytestPackage.TEST_CASE_SPEC__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC:
        setTestSpec((TestSpec)newValue);
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
      case DeploytestPackage.TEST_CASE_SPEC__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC:
        setTestSpec((TestSpec)null);
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
      case DeploytestPackage.TEST_CASE_SPEC__DISPLAY_LABEL:
        return DISPLAY_LABEL_EDEFAULT == null ? getDisplayLabel() != null : !DISPLAY_LABEL_EDEFAULT
                .equals(getDisplayLabel());
      case DeploytestPackage.TEST_CASE_SPEC__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT
                .equals(description);
      case DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC:
        return getTestSpec() != null;
      case DeploytestPackage.TEST_CASE_SPEC__SPEC_SEQUENCE:
        return !getSpecSequence().isEmpty();
      case DeploytestPackage.TEST_CASE_SPEC__ROOT:
        return basicGetRoot() != null;
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

  /**
   * @ADDED
   */
  public static String formatList(EList list)
  {
    StringBuffer buffer = new StringBuffer();
    for (Iterator it = list.iterator(); it.hasNext();)
    {
      Object element = it.next();
      if (element instanceof IDisplayable)
      {
        buffer.append(((IDisplayable)element).getDisplayLabel());
      }
      else
      {
        buffer.append(element);
      }

      if (it.hasNext())
      {
        buffer.append(", ");
      }
    }

    return buffer.toString();
  }

  /**
   * @ADDED
   */
  public static EList filterList(EList list, Class filter)
  {
    EList result = new BasicEList();
    for (Iterator it = list.iterator(); it.hasNext();)
    {
      Object element = it.next();
      if (filter.isAssignableFrom(element.getClass()))
      {
        result.add(element);
      }
    }

    return result;
  }
} //TestCaseSpecImpl

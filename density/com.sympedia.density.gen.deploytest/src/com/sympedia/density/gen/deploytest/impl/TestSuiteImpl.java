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
import com.sympedia.density.gen.deploytest.Assertion;
import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.Execution;
import com.sympedia.density.gen.deploytest.Initialization;
import com.sympedia.density.gen.deploytest.TestCaseSpec;
import com.sympedia.density.gen.deploytest.TestSpec;
import com.sympedia.density.gen.deploytest.TestSuite;
import com.sympedia.density.gen.deploytest.Verification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.Collection;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSuiteImpl#getTestSpec <em>Test Spec</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSuiteImpl#getIncludedActions <em>Included Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSuiteImpl#getIncludedAssertions <em>Included Assertions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSuiteImpl#getTestCases <em>Test Cases</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSuiteImpl#getIdPattern <em>Id Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuiteImpl extends NamedElementImpl implements TestSuite
{
  /**
   * The cached value of the '{@link #getIncludedActions() <em>Included Actions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedActions()
   * @generated
   * @ordered
   */
  protected EList includedActions = null;

  /**
   * The cached value of the '{@link #getIncludedAssertions() <em>Included Assertions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedAssertions()
   * @generated
   * @ordered
   */
  protected EList includedAssertions = null;

  /**
   * The default value of the '{@link #getIdPattern() <em>Id Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdPattern()
   * @generated
   * @ordered
   */
  protected static final String ID_PATTERN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdPattern() <em>Id Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdPattern()
   * @generated
   * @ordered
   */
  protected String idPattern = ID_PATTERN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestSuiteImpl()
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
    return DeploytestPackage.Literals.TEST_SUITE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSpec getTestSpec()
  {
    if (eContainerFeatureID != DeploytestPackage.TEST_SUITE__TEST_SPEC) return null;
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
            || (eContainerFeatureID != DeploytestPackage.TEST_SUITE__TEST_SPEC && newTestSpec != null))
    {
      if (EcoreUtil.isAncestor(this, newTestSpec))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newTestSpec != null)
        msgs = ((InternalEObject)newTestSpec).eInverseAdd(this,
                DeploytestPackage.TEST_SPEC__TEST_SUITES, TestSpec.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newTestSpec,
              DeploytestPackage.TEST_SUITE__TEST_SPEC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SUITE__TEST_SPEC, newTestSpec, newTestSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getIncludedActions()
  {
    if (includedActions == null)
    {
      includedActions = new EObjectResolvingEList(Action.class, this,
              DeploytestPackage.TEST_SUITE__INCLUDED_ACTIONS);
    }
    return includedActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getIncludedAssertions()
  {
    if (includedAssertions == null)
    {
      includedAssertions = new EObjectResolvingEList(Assertion.class, this,
              DeploytestPackage.TEST_SUITE__INCLUDED_ASSERTIONS);
    }
    return includedAssertions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getTestCases()
  {
    EList result = new BasicEList();
    EList all = getTestSpec().getAllVerifications();
    for (Iterator it = all.iterator(); it.hasNext();)
    {
      Verification tc = (Verification)it.next();
      if (isMatching(tc))
      {
        result.add(tc);
      }
    }

    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdPattern()
  {
    return idPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdPattern(String newIdPattern)
  {
    String oldIdPattern = idPattern;
    idPattern = newIdPattern;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SUITE__ID_PATTERN, oldIdPattern, idPattern));
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
      case DeploytestPackage.TEST_SUITE__TEST_SPEC:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.TEST_SUITE__TEST_SPEC, msgs);
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
      case DeploytestPackage.TEST_SUITE__TEST_SPEC:
        return eBasicSetContainer(null, DeploytestPackage.TEST_SUITE__TEST_SPEC, msgs);
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
      case DeploytestPackage.TEST_SUITE__TEST_SPEC:
        return eInternalContainer().eInverseRemove(this, DeploytestPackage.TEST_SPEC__TEST_SUITES,
                TestSpec.class, msgs);
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
      case DeploytestPackage.TEST_SUITE__TEST_SPEC:
        return getTestSpec();
      case DeploytestPackage.TEST_SUITE__INCLUDED_ACTIONS:
        return getIncludedActions();
      case DeploytestPackage.TEST_SUITE__INCLUDED_ASSERTIONS:
        return getIncludedAssertions();
      case DeploytestPackage.TEST_SUITE__TEST_CASES:
        return getTestCases();
      case DeploytestPackage.TEST_SUITE__ID_PATTERN:
        return getIdPattern();
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
      case DeploytestPackage.TEST_SUITE__TEST_SPEC:
        setTestSpec((TestSpec)newValue);
        return;
      case DeploytestPackage.TEST_SUITE__INCLUDED_ACTIONS:
        getIncludedActions().clear();
        getIncludedActions().addAll((Collection)newValue);
        return;
      case DeploytestPackage.TEST_SUITE__INCLUDED_ASSERTIONS:
        getIncludedAssertions().clear();
        getIncludedAssertions().addAll((Collection)newValue);
        return;
      case DeploytestPackage.TEST_SUITE__ID_PATTERN:
        setIdPattern((String)newValue);
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
      case DeploytestPackage.TEST_SUITE__TEST_SPEC:
        setTestSpec((TestSpec)null);
        return;
      case DeploytestPackage.TEST_SUITE__INCLUDED_ACTIONS:
        getIncludedActions().clear();
        return;
      case DeploytestPackage.TEST_SUITE__INCLUDED_ASSERTIONS:
        getIncludedAssertions().clear();
        return;
      case DeploytestPackage.TEST_SUITE__ID_PATTERN:
        setIdPattern(ID_PATTERN_EDEFAULT);
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
      case DeploytestPackage.TEST_SUITE__TEST_SPEC:
        return getTestSpec() != null;
      case DeploytestPackage.TEST_SUITE__INCLUDED_ACTIONS:
        return includedActions != null && !includedActions.isEmpty();
      case DeploytestPackage.TEST_SUITE__INCLUDED_ASSERTIONS:
        return includedAssertions != null && !includedAssertions.isEmpty();
      case DeploytestPackage.TEST_SUITE__TEST_CASES:
        return !getTestCases().isEmpty();
      case DeploytestPackage.TEST_SUITE__ID_PATTERN:
        return ID_PATTERN_EDEFAULT == null ? idPattern != null : !ID_PATTERN_EDEFAULT
                .equals(idPattern);
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
    result.append(" (idPattern: ");
    result.append(idPattern);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  protected boolean isMatching(Verification tc)
  {
    EList sequence = tc.getSpecSequence();
    sequence.remove(sequence.size() - 1);

    for (Iterator it = getIncludedAssertions().iterator(); it.hasNext();)
    {
      Assertion assertion = (Assertion)it.next();
      if (tc.getAssertions().contains(assertion))
      {
        return true;
      }
    }

    for (Iterator it = getIncludedActions().iterator(); it.hasNext();)
    {
      Action action = (Action)it.next();
      if (isMatching(action, sequence))
      {
        return true;
      }
    }

    return false;
  }

  /**
   * @ADDED
   */
  protected boolean isMatching(Action action, EList sequence)
  {
    for (Iterator it = sequence.iterator(); it.hasNext();)
    {
      TestCaseSpec spec = (TestCaseSpec)it.next();
      if (spec instanceof Initialization)
      {
        if (((Initialization)spec).getInitializationActions().contains(action))
        {
          return true;
        }
      }
      else if (spec instanceof Execution)
      {
        if (((Execution)spec).getExecutionActions().contains(action))
        {
          return true;
        }
      }
    }

    return false;
  }
} //TestSuiteImpl

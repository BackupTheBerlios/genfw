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


import com.sympedia.density.gen.deploy.Container;
import com.sympedia.density.gen.deploytest.ActionContainer;
import com.sympedia.density.gen.deploytest.AssertionContainer;
import com.sympedia.density.gen.deploytest.ContainerOverride;
import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.Execution;
import com.sympedia.density.gen.deploytest.Initialization;
import com.sympedia.density.gen.deploytest.TestCaseSpec;
import com.sympedia.density.gen.deploytest.TestSpec;
import com.sympedia.density.gen.deploytest.TestSuite;
import com.sympedia.density.gen.deploytest.Verification;

import com.sympedia.util.StringHelper;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getFixtureInterface <em>Fixture Interface</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getFixtureClass <em>Fixture Class</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getContainerToTest <em>Container To Test</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getContainerOverrides <em>Container Overrides</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getActionContainer <em>Action Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getAssertionContainer <em>Assertion Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getTestCaseSpecs <em>Test Case Specs</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getTestSuites <em>Test Suites</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getAllVerifications <em>All Verifications</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getAllActions <em>All Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.TestSpecImpl#getAllAssertions <em>All Assertions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSpecImpl extends NamedElementImpl implements TestSpec
{
  /**
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFixtureInterface() <em>Fixture Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixtureInterface()
   * @generated
   * @ordered
   */
  protected static final String FIXTURE_INTERFACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFixtureInterface() <em>Fixture Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixtureInterface()
   * @generated
   * @ordered
   */
  protected String fixtureInterface = FIXTURE_INTERFACE_EDEFAULT;

  /**
   * The default value of the '{@link #getFixtureClass() <em>Fixture Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixtureClass()
   * @generated
   * @ordered
   */
  protected static final String FIXTURE_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFixtureClass() <em>Fixture Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFixtureClass()
   * @generated
   * @ordered
   */
  protected String fixtureClass = FIXTURE_CLASS_EDEFAULT;

  /**
   * The cached value of the '{@link #getContainerToTest() <em>Container To Test</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerToTest()
   * @generated
   * @ordered
   */
  protected Container containerToTest = null;

  /**
   * The cached value of the '{@link #getContainerOverrides() <em>Container Overrides</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerOverrides()
   * @generated
   * @ordered
   */
  protected EList containerOverrides = null;

  /**
   * The cached value of the '{@link #getActionContainer() <em>Action Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionContainer()
   * @generated
   * @ordered
   */
  protected ActionContainer actionContainer = null;

  /**
   * The cached value of the '{@link #getAssertionContainer() <em>Assertion Container</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertionContainer()
   * @generated
   * @ordered
   */
  protected AssertionContainer assertionContainer = null;

  /**
   * The cached value of the '{@link #getTestCaseSpecs() <em>Test Case Specs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestCaseSpecs()
   * @generated
   * @ordered
   */
  protected EList testCaseSpecs = null;

  /**
   * The cached value of the '{@link #getTestSuites() <em>Test Suites</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTestSuites()
   * @generated
   * @ordered
   */
  protected EList testSuites = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestSpecImpl()
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
    return DeploytestPackage.Literals.TEST_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionContainer getActionContainer()
  {
    return actionContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionContainer(ActionContainer newActionContainer,
          NotificationChain msgs)
  {
    ActionContainer oldActionContainer = actionContainer;
    actionContainer = newActionContainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SPEC__ACTION_CONTAINER, oldActionContainer, newActionContainer);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionContainer(ActionContainer newActionContainer)
  {
    if (newActionContainer != actionContainer)
    {
      NotificationChain msgs = null;
      if (actionContainer != null)
        msgs = ((InternalEObject)actionContainer).eInverseRemove(this,
                DeploytestPackage.ACTION_CONTAINER__TEST_SPEC, ActionContainer.class, msgs);
      if (newActionContainer != null)
        msgs = ((InternalEObject)newActionContainer).eInverseAdd(this,
                DeploytestPackage.ACTION_CONTAINER__TEST_SPEC, ActionContainer.class, msgs);
      msgs = basicSetActionContainer(newActionContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SPEC__ACTION_CONTAINER, newActionContainer, newActionContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionContainer getAssertionContainer()
  {
    return assertionContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertionContainer(AssertionContainer newAssertionContainer,
          NotificationChain msgs)
  {
    AssertionContainer oldAssertionContainer = assertionContainer;
    assertionContainer = newAssertionContainer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER, oldAssertionContainer,
              newAssertionContainer);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertionContainer(AssertionContainer newAssertionContainer)
  {
    if (newAssertionContainer != assertionContainer)
    {
      NotificationChain msgs = null;
      if (assertionContainer != null)
        msgs = ((InternalEObject)assertionContainer).eInverseRemove(this,
                DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC, AssertionContainer.class, msgs);
      if (newAssertionContainer != null)
        msgs = ((InternalEObject)newAssertionContainer).eInverseAdd(this,
                DeploytestPackage.ASSERTION_CONTAINER__TEST_SPEC, AssertionContainer.class, msgs);
      msgs = basicSetAssertionContainer(newAssertionContainer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER, newAssertionContainer,
              newAssertionContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getTestCaseSpecs()
  {
    if (testCaseSpecs == null)
    {
      testCaseSpecs = new EObjectContainmentWithInverseEList(TestCaseSpec.class, this,
              DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS,
              DeploytestPackage.TEST_CASE_SPEC__TEST_SPEC)
      {
        private static final long serialVersionUID = 6411439939207323013L;

        @Override
        protected void didAdd(int index, Object newObject)
        {
          super.didAdd(index, newObject);
          adjustVerificationId(newObject);
        }
      };
    }

    return testCaseSpecs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getTestSuites()
  {
    if (testSuites == null)
    {
      testSuites = new EObjectContainmentWithInverseEList(TestSuite.class, this,
              DeploytestPackage.TEST_SPEC__TEST_SUITES, DeploytestPackage.TEST_SUITE__TEST_SPEC);
    }
    return testSuites;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getAllVerifications()
  {
    EList result = new BasicEList();
    for (Iterator it = getTestCaseSpecs().iterator(); it.hasNext();)
    {
      TestCaseSpec tc = (TestCaseSpec)it.next();
      if (tc instanceof Initialization)
      {
        collectVerifications((Initialization)tc, result);
      }
      else if (tc instanceof Execution)
      {
        collectVerifications((Execution)tc, result);
      }
      else if (tc instanceof Verification)
      {
        result.add(tc);
      }
    }

    Collections.sort(result, new Comparator()
    {
      public int compare(Object o1, Object o2)
      {
        String id1 = ((Verification)o1).getId();
        String id2 = ((Verification)o2).getId();
        if (id1 == null) return id2 == null ? 0 : -1;
        if (id2 == null) return 1;
        return id1.compareTo(id2);
      }
    });

    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getAllActions()
  {
    return getActionContainer().getAllActions();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getAllAssertions()
  {
    return getAssertionContainer().getAllAssertions();
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
    case DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES:
      return ((InternalEList)getContainerOverrides()).basicAdd(otherEnd, msgs);
    case DeploytestPackage.TEST_SPEC__ACTION_CONTAINER:
      if (actionContainer != null)
        msgs = ((InternalEObject)actionContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                - DeploytestPackage.TEST_SPEC__ACTION_CONTAINER, null, msgs);
      return basicSetActionContainer((ActionContainer)otherEnd, msgs);
    case DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER:
      if (assertionContainer != null)
        msgs = ((InternalEObject)assertionContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                - DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER, null, msgs);
      return basicSetAssertionContainer((AssertionContainer)otherEnd, msgs);
    case DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS:
      return ((InternalEList)getTestCaseSpecs()).basicAdd(otherEnd, msgs);
    case DeploytestPackage.TEST_SPEC__TEST_SUITES:
      return ((InternalEList)getTestSuites()).basicAdd(otherEnd, msgs);
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
    case DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES:
      return ((InternalEList)getContainerOverrides()).basicRemove(otherEnd, msgs);
    case DeploytestPackage.TEST_SPEC__ACTION_CONTAINER:
      return basicSetActionContainer(null, msgs);
    case DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER:
      return basicSetAssertionContainer(null, msgs);
    case DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS:
      return ((InternalEList)getTestCaseSpecs()).basicRemove(otherEnd, msgs);
    case DeploytestPackage.TEST_SPEC__TEST_SUITES:
      return ((InternalEList)getTestSuites()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
    case DeploytestPackage.TEST_SPEC__PACKAGE_NAME:
      return getPackageName();
    case DeploytestPackage.TEST_SPEC__FIXTURE_INTERFACE:
      return getFixtureInterface();
    case DeploytestPackage.TEST_SPEC__FIXTURE_CLASS:
      return getFixtureClass();
    case DeploytestPackage.TEST_SPEC__CONTAINER_TO_TEST:
      if (resolve) return getContainerToTest();
      return basicGetContainerToTest();
    case DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES:
      return getContainerOverrides();
    case DeploytestPackage.TEST_SPEC__ACTION_CONTAINER:
      return getActionContainer();
    case DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER:
      return getAssertionContainer();
    case DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS:
      return getTestCaseSpecs();
    case DeploytestPackage.TEST_SPEC__TEST_SUITES:
      return getTestSuites();
    case DeploytestPackage.TEST_SPEC__ALL_VERIFICATIONS:
      return getAllVerifications();
    case DeploytestPackage.TEST_SPEC__ALL_ACTIONS:
      return getAllActions();
    case DeploytestPackage.TEST_SPEC__ALL_ASSERTIONS:
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
    case DeploytestPackage.TEST_SPEC__PACKAGE_NAME:
      setPackageName((String)newValue);
      return;
    case DeploytestPackage.TEST_SPEC__FIXTURE_INTERFACE:
      setFixtureInterface((String)newValue);
      return;
    case DeploytestPackage.TEST_SPEC__FIXTURE_CLASS:
      setFixtureClass((String)newValue);
      return;
    case DeploytestPackage.TEST_SPEC__CONTAINER_TO_TEST:
      setContainerToTest((Container)newValue);
      return;
    case DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES:
      getContainerOverrides().clear();
      getContainerOverrides().addAll((Collection)newValue);
      return;
    case DeploytestPackage.TEST_SPEC__ACTION_CONTAINER:
      setActionContainer((ActionContainer)newValue);
      return;
    case DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER:
      setAssertionContainer((AssertionContainer)newValue);
      return;
    case DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS:
      getTestCaseSpecs().clear();
      getTestCaseSpecs().addAll((Collection)newValue);
      return;
    case DeploytestPackage.TEST_SPEC__TEST_SUITES:
      getTestSuites().clear();
      getTestSuites().addAll((Collection)newValue);
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
    case DeploytestPackage.TEST_SPEC__PACKAGE_NAME:
      setPackageName(PACKAGE_NAME_EDEFAULT);
      return;
    case DeploytestPackage.TEST_SPEC__FIXTURE_INTERFACE:
      setFixtureInterface(FIXTURE_INTERFACE_EDEFAULT);
      return;
    case DeploytestPackage.TEST_SPEC__FIXTURE_CLASS:
      setFixtureClass(FIXTURE_CLASS_EDEFAULT);
      return;
    case DeploytestPackage.TEST_SPEC__CONTAINER_TO_TEST:
      setContainerToTest((Container)null);
      return;
    case DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES:
      getContainerOverrides().clear();
      return;
    case DeploytestPackage.TEST_SPEC__ACTION_CONTAINER:
      setActionContainer((ActionContainer)null);
      return;
    case DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER:
      setAssertionContainer((AssertionContainer)null);
      return;
    case DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS:
      getTestCaseSpecs().clear();
      return;
    case DeploytestPackage.TEST_SPEC__TEST_SUITES:
      getTestSuites().clear();
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
    case DeploytestPackage.TEST_SPEC__PACKAGE_NAME:
      return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT
              .equals(packageName);
    case DeploytestPackage.TEST_SPEC__FIXTURE_INTERFACE:
      return FIXTURE_INTERFACE_EDEFAULT == null ? fixtureInterface != null
              : !FIXTURE_INTERFACE_EDEFAULT.equals(fixtureInterface);
    case DeploytestPackage.TEST_SPEC__FIXTURE_CLASS:
      return FIXTURE_CLASS_EDEFAULT == null ? fixtureClass != null : !FIXTURE_CLASS_EDEFAULT
              .equals(fixtureClass);
    case DeploytestPackage.TEST_SPEC__CONTAINER_TO_TEST:
      return containerToTest != null;
    case DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES:
      return containerOverrides != null && !containerOverrides.isEmpty();
    case DeploytestPackage.TEST_SPEC__ACTION_CONTAINER:
      return actionContainer != null;
    case DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER:
      return assertionContainer != null;
    case DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS:
      return testCaseSpecs != null && !testCaseSpecs.isEmpty();
    case DeploytestPackage.TEST_SPEC__TEST_SUITES:
      return testSuites != null && !testSuites.isEmpty();
    case DeploytestPackage.TEST_SPEC__ALL_VERIFICATIONS:
      return !getAllVerifications().isEmpty();
    case DeploytestPackage.TEST_SPEC__ALL_ACTIONS:
      return !getAllActions().isEmpty();
    case DeploytestPackage.TEST_SPEC__ALL_ASSERTIONS:
      return !getAllAssertions().isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SPEC__PACKAGE_NAME, oldPackageName, packageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFixtureInterface()
  {
    return fixtureInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixtureInterface(String newFixtureInterface)
  {
    String oldFixtureInterface = fixtureInterface;
    fixtureInterface = newFixtureInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SPEC__FIXTURE_INTERFACE, oldFixtureInterface, fixtureInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFixtureClass()
  {
    return fixtureClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFixtureClass(String newFixtureClass)
  {
    String oldFixtureClass = fixtureClass;
    fixtureClass = newFixtureClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SPEC__FIXTURE_CLASS, oldFixtureClass, fixtureClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Container getContainerToTest()
  {
    if (containerToTest != null && containerToTest.eIsProxy())
    {
      InternalEObject oldContainerToTest = (InternalEObject)containerToTest;
      containerToTest = (Container)eResolveProxy(oldContainerToTest);
      if (containerToTest != oldContainerToTest)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeploytestPackage.TEST_SPEC__CONTAINER_TO_TEST, oldContainerToTest,
                  containerToTest));
      }
    }
    return containerToTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Container basicGetContainerToTest()
  {
    return containerToTest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerToTest(Container newContainerToTest)
  {
    Container oldContainerToTest = containerToTest;
    containerToTest = newContainerToTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.TEST_SPEC__CONTAINER_TO_TEST, oldContainerToTest, containerToTest));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getContainerOverrides()
  {
    if (containerOverrides == null)
    {
      containerOverrides = new EObjectContainmentWithInverseEList(ContainerOverride.class, this,
              DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES,
              DeploytestPackage.CONTAINER_OVERRIDE__TEST_SPEC);
    }
    return containerOverrides;
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
    result.append(" (packageName: ");
    result.append(packageName);
    result.append(", fixtureInterface: ");
    result.append(fixtureInterface);
    result.append(", fixtureClass: ");
    result.append(fixtureClass);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  public void adjustVerificationId(Object newObject)
  {
    if (newObject instanceof Verification)
    {
      Verification newVerification = (Verification)newObject;
      String origId = newVerification.getId();
      String origPrefix = extractAlphaPrefix(origId);
      boolean violation = origId == null || origId.length() == 0;
      int maxSuffix = 0;

      EList allVerifications = getAllVerifications();
      for (Iterator it = allVerifications.iterator(); it.hasNext();)
      {
        Verification verification = (Verification)it.next();
        String id = verification.getId();
        if (verification != newVerification)
        {
          violation |= StringHelper.equals(origId, id);
          String prefix = extractAlphaPrefix(id);

          if ((origPrefix != null && StringHelper.equals(origPrefix, prefix))
                  || (origPrefix == null && prefix == null))
          {
            int suffix = extractNumberSuffix(id);
            if (suffix > maxSuffix) maxSuffix = suffix;
          }
        }
      }

      if (violation)
      {
        String newPrefix = origPrefix == null ? "" : origPrefix;
        String newSuffix = String.valueOf(maxSuffix + 1);
        while (newSuffix.length() < 3)
        {
          newSuffix = "0" + newSuffix;
        }

        newVerification.setId(newPrefix + newSuffix);
      }
    }

    if (newObject instanceof EObject)
    {
      EList contents = ((EObject)newObject).eContents();
      for (Iterator it = contents.iterator(); it.hasNext();)
      {
        EObject child = (EObject)it.next();
        adjustVerificationId(child);
      }
    }
  }

  /**
   * @ADDED
   */
  public static String extractAlphaPrefix(String str)
  {
    if (str == null) return null;
    for (int i = str.length() - 1; i >= 0; i--)
    {
      if (!Character.isDigit(str.charAt(i)))
      {
        return str.substring(0, i + 1);
      }
    }

    return null;
  }

  /**
   * @ADDED
   */
  public static int extractNumberSuffix(String str)
  {
    if (str == null) return 0;
    for (int i = str.length() - 1; i >= 0; i--)
    {
      if (!Character.isDigit(str.charAt(i)))
      {
        String digits = str.substring(i + 1);
        return Integer.parseInt(digits);
      }
    }

    return 0;
  }

  /**
   * @ADDED
   */
  public static void collectVerifications(Initialization initialization, EList result)
  {
    for (Iterator it = initialization.getVerifications().iterator(); it.hasNext();)
    {
      Verification tc = (Verification)it.next();
      result.add(tc);
    }

    for (Iterator it = initialization.getSubInitializations().iterator(); it.hasNext();)
    {
      Initialization tc = (Initialization)it.next();
      collectVerifications(tc, result);
    }

    for (Iterator it = initialization.getExecutions().iterator(); it.hasNext();)
    {
      Execution tc = (Execution)it.next();
      collectVerifications(tc, result);
    }
  }

  /**
   * @ADDED
   */
  public static void collectVerifications(Execution execution, EList result)
  {
    for (Iterator it = execution.getVerifications().iterator(); it.hasNext();)
    {
      Verification tc = (Verification)it.next();
      result.add(tc);
    }

    for (Iterator it = execution.getSubExecutions().iterator(); it.hasNext();)
    {
      Execution tc = (Execution)it.next();
      collectVerifications(tc, result);
    }
  }

} //TestSpecImpl

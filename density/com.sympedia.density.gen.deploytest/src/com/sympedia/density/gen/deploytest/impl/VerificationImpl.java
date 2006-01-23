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
import com.sympedia.density.gen.deploytest.ContainerOverride;
import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.Execution;
import com.sympedia.density.gen.deploytest.Initialization;
import com.sympedia.density.gen.deploytest.TestSpec;
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


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.VerificationImpl#getSpecLabel <em>Spec Label</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.VerificationImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.VerificationImpl#getContainerOverride <em>Container Override</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.VerificationImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.VerificationImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.VerificationImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationImpl extends TestCaseSpecImpl implements Verification
{
  /**
   * The default value of the '{@link #getSpecLabel() <em>Spec Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecLabel()
   * @generated
   * @ordered
   */
  protected static final String SPEC_LABEL_EDEFAULT = null;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getContainerOverride() <em>Container Override</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContainerOverride()
   * @generated
   * @ordered
   */
  protected ContainerOverride containerOverride = null;

  /**
   * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' reference list.
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
  protected VerificationImpl()
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
    return DeploytestPackage.Literals.VERIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerOverride getContainerOverride()
  {
    if (containerOverride != null && containerOverride.eIsProxy())
    {
      InternalEObject oldContainerOverride = (InternalEObject)containerOverride;
      containerOverride = (ContainerOverride)eResolveProxy(oldContainerOverride);
      if (containerOverride != oldContainerOverride)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeploytestPackage.VERIFICATION__CONTAINER_OVERRIDE, oldContainerOverride,
                  containerOverride));
      }
    }
    return containerOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerOverride basicGetContainerOverride()
  {
    return containerOverride;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainerOverride(ContainerOverride newContainerOverride)
  {
    ContainerOverride oldContainerOverride = containerOverride;
    containerOverride = newContainerOverride;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.VERIFICATION__CONTAINER_OVERRIDE, oldContainerOverride,
              containerOverride));
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
      assertions = new EObjectResolvingEList(Assertion.class, this,
              DeploytestPackage.VERIFICATION__ASSERTIONS);
    }
    return assertions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initialization getInitialization()
  {
    if (eContainerFeatureID != DeploytestPackage.VERIFICATION__INITIALIZATION) return null;
    return (Initialization)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialization(Initialization newInitialization)
  {
    if (newInitialization != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.VERIFICATION__INITIALIZATION && newInitialization != null))
    {
      if (EcoreUtil.isAncestor(this, newInitialization))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newInitialization != null)
        msgs = ((InternalEObject)newInitialization).eInverseAdd(this,
                DeploytestPackage.INITIALIZATION__VERIFICATIONS, Initialization.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newInitialization,
              DeploytestPackage.VERIFICATION__INITIALIZATION, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.VERIFICATION__INITIALIZATION, newInitialization, newInitialization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Execution getExecution()
  {
    if (eContainerFeatureID != DeploytestPackage.VERIFICATION__EXECUTION) return null;
    return (Execution)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExecution(Execution newExecution)
  {
    if (newExecution != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.VERIFICATION__EXECUTION && newExecution != null))
    {
      if (EcoreUtil.isAncestor(this, newExecution))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newExecution != null)
        msgs = ((InternalEObject)newExecution).eInverseAdd(this,
                DeploytestPackage.EXECUTION__VERIFICATIONS, Execution.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newExecution,
              DeploytestPackage.VERIFICATION__EXECUTION, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.VERIFICATION__EXECUTION, newExecution, newExecution));
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
      case DeploytestPackage.VERIFICATION__INITIALIZATION:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.VERIFICATION__INITIALIZATION, msgs);
      case DeploytestPackage.VERIFICATION__EXECUTION:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.VERIFICATION__EXECUTION, msgs);
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
      case DeploytestPackage.VERIFICATION__INITIALIZATION:
        return eBasicSetContainer(null, DeploytestPackage.VERIFICATION__INITIALIZATION, msgs);
      case DeploytestPackage.VERIFICATION__EXECUTION:
        return eBasicSetContainer(null, DeploytestPackage.VERIFICATION__EXECUTION, msgs);
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
      case DeploytestPackage.VERIFICATION__INITIALIZATION:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.INITIALIZATION__VERIFICATIONS, Initialization.class, msgs);
      case DeploytestPackage.VERIFICATION__EXECUTION:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.EXECUTION__VERIFICATIONS, Execution.class, msgs);
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
      case DeploytestPackage.VERIFICATION__SPEC_LABEL:
        return getSpecLabel();
      case DeploytestPackage.VERIFICATION__ID:
        return getId();
      case DeploytestPackage.VERIFICATION__CONTAINER_OVERRIDE:
        if (resolve) return getContainerOverride();
        return basicGetContainerOverride();
      case DeploytestPackage.VERIFICATION__ASSERTIONS:
        return getAssertions();
      case DeploytestPackage.VERIFICATION__INITIALIZATION:
        return getInitialization();
      case DeploytestPackage.VERIFICATION__EXECUTION:
        return getExecution();
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
      case DeploytestPackage.VERIFICATION__ID:
        setId((String)newValue);
        return;
      case DeploytestPackage.VERIFICATION__CONTAINER_OVERRIDE:
        setContainerOverride((ContainerOverride)newValue);
        return;
      case DeploytestPackage.VERIFICATION__ASSERTIONS:
        getAssertions().clear();
        getAssertions().addAll((Collection)newValue);
        return;
      case DeploytestPackage.VERIFICATION__INITIALIZATION:
        setInitialization((Initialization)newValue);
        return;
      case DeploytestPackage.VERIFICATION__EXECUTION:
        setExecution((Execution)newValue);
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
      case DeploytestPackage.VERIFICATION__ID:
        setId(ID_EDEFAULT);
        return;
      case DeploytestPackage.VERIFICATION__CONTAINER_OVERRIDE:
        setContainerOverride((ContainerOverride)null);
        return;
      case DeploytestPackage.VERIFICATION__ASSERTIONS:
        getAssertions().clear();
        return;
      case DeploytestPackage.VERIFICATION__INITIALIZATION:
        setInitialization((Initialization)null);
        return;
      case DeploytestPackage.VERIFICATION__EXECUTION:
        setExecution((Execution)null);
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
      case DeploytestPackage.VERIFICATION__SPEC_LABEL:
        return SPEC_LABEL_EDEFAULT == null ? getSpecLabel() != null : !SPEC_LABEL_EDEFAULT
                .equals(getSpecLabel());
      case DeploytestPackage.VERIFICATION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DeploytestPackage.VERIFICATION__CONTAINER_OVERRIDE:
        return containerOverride != null;
      case DeploytestPackage.VERIFICATION__ASSERTIONS:
        return assertions != null && !assertions.isEmpty();
      case DeploytestPackage.VERIFICATION__INITIALIZATION:
        return getInitialization() != null;
      case DeploytestPackage.VERIFICATION__EXECUTION:
        return getExecution() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getSpecLabel()
  {
    EList sequence = getSpecSequence();
    EList initializations = filterList(sequence, Initialization.class);
    EList executions = filterList(sequence, Execution.class);
    String baseContainer = getRoot() == null || getRoot().getContainerToTest() == null ? "DEFAULT"
            : getRoot().getContainerToTest().getName();

    StringBuffer buffer = new StringBuffer();
    buffer.append(formatList(initializations));
    buffer.append(buffer.length() > 0 ? ", " : "");

    buffer.append("[");
    buffer.append(getContainerOverride() == null ? baseContainer : getContainerOverride()
            .getDisplayLabel());
    buffer.append("]");
    buffer.append(executions.isEmpty() ? "" : ", ");

    buffer.append(formatList(executions));
    buffer.append(" --> ");

    buffer.append(formatList(getAssertions()));
    return getId() + ": " + buffer.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploytestPackage.VERIFICATION__ID,
              oldId, id));
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public String getDisplayLabel()
  {
    return getSpecLabel();
    //    return (getTestContainer() == null ? "?" : getTestContainer().getName()) + " "
    //            + formatList(getAssertions());
  }

  /**
   * @ADDED
   */
  @Override
  public EList getSpecSequence()
  {
    EList result = new BasicEList();
    if (getInitialization() != null)
    {
      result.addAll(getInitialization().getSpecSequence());
    }
    else if (getExecution() != null)
    {
      result.addAll(getExecution().getSpecSequence());
    }

    result.add(this);
    return result;
  }

  /**
   * @ADDED
   */
  @Override
  public TestSpec basicGetRoot()
  {
    if (getTestSpec() != null) return getTestSpec();
    if (getInitialization() != null) return getInitialization().getRoot();
    if (getExecution() != null) return getExecution().getRoot();
    return null;
  }
} //VerificationImpl

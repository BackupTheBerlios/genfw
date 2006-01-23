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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ExecutionImpl#getExecutionActions <em>Execution Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ExecutionImpl#getSuperExecution <em>Super Execution</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ExecutionImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ExecutionImpl#getVerifications <em>Verifications</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.ExecutionImpl#getSubExecutions <em>Sub Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutionImpl extends TestCaseSpecImpl implements Execution
{
  /**
   * The cached value of the '{@link #getExecutionActions() <em>Execution Actions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutionActions()
   * @generated
   * @ordered
   */
  protected EList executionActions = null;

  /**
   * The cached value of the '{@link #getVerifications() <em>Verifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerifications()
   * @generated
   * @ordered
   */
  protected EList verifications = null;

  /**
   * The cached value of the '{@link #getSubExecutions() <em>Sub Executions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubExecutions()
   * @generated
   * @ordered
   */
  protected EList subExecutions = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecutionImpl()
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
    return DeploytestPackage.Literals.EXECUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getExecutionActions()
  {
    if (executionActions == null)
    {
      executionActions = new EObjectResolvingEList(Action.class, this,
              DeploytestPackage.EXECUTION__EXECUTION_ACTIONS);
    }
    return executionActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Execution getSuperExecution()
  {
    if (eContainerFeatureID != DeploytestPackage.EXECUTION__SUPER_EXECUTION) return null;
    return (Execution)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperExecution(Execution newSuperExecution)
  {
    if (newSuperExecution != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.EXECUTION__SUPER_EXECUTION && newSuperExecution != null))
    {
      if (EcoreUtil.isAncestor(this, newSuperExecution))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newSuperExecution != null)
        msgs = ((InternalEObject)newSuperExecution).eInverseAdd(this,
                DeploytestPackage.EXECUTION__SUB_EXECUTIONS, Execution.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newSuperExecution,
              DeploytestPackage.EXECUTION__SUPER_EXECUTION, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.EXECUTION__SUPER_EXECUTION, newSuperExecution, newSuperExecution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getSubExecutions()
  {
    if (subExecutions == null)
    {
      subExecutions = new EObjectContainmentWithInverseEList(Execution.class, this,
              DeploytestPackage.EXECUTION__SUB_EXECUTIONS,
              DeploytestPackage.EXECUTION__SUPER_EXECUTION)
      {
        private static final long serialVersionUID = 3848708425609720829L;

        @Override
        protected void didAdd(int index, Object newObject)
        {
          super.didAdd(index, newObject);
          TestSpecImpl root = (TestSpecImpl)getRoot();
          if (root != null)
          {
            root.adjustVerificationId(newObject);
          }
        }
      };
    }
    return subExecutions;
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
      case DeploytestPackage.EXECUTION__SUPER_EXECUTION:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.EXECUTION__SUPER_EXECUTION, msgs);
      case DeploytestPackage.EXECUTION__INITIALIZATION:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.EXECUTION__INITIALIZATION, msgs);
      case DeploytestPackage.EXECUTION__VERIFICATIONS:
        return ((InternalEList)getVerifications()).basicAdd(otherEnd, msgs);
      case DeploytestPackage.EXECUTION__SUB_EXECUTIONS:
        return ((InternalEList)getSubExecutions()).basicAdd(otherEnd, msgs);
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
      case DeploytestPackage.EXECUTION__SUPER_EXECUTION:
        return eBasicSetContainer(null, DeploytestPackage.EXECUTION__SUPER_EXECUTION, msgs);
      case DeploytestPackage.EXECUTION__INITIALIZATION:
        return eBasicSetContainer(null, DeploytestPackage.EXECUTION__INITIALIZATION, msgs);
      case DeploytestPackage.EXECUTION__VERIFICATIONS:
        return ((InternalEList)getVerifications()).basicRemove(otherEnd, msgs);
      case DeploytestPackage.EXECUTION__SUB_EXECUTIONS:
        return ((InternalEList)getSubExecutions()).basicRemove(otherEnd, msgs);
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
      case DeploytestPackage.EXECUTION__SUPER_EXECUTION:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.EXECUTION__SUB_EXECUTIONS, Execution.class, msgs);
      case DeploytestPackage.EXECUTION__INITIALIZATION:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.INITIALIZATION__EXECUTIONS, Initialization.class, msgs);
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
      case DeploytestPackage.EXECUTION__EXECUTION_ACTIONS:
        return getExecutionActions();
      case DeploytestPackage.EXECUTION__SUPER_EXECUTION:
        return getSuperExecution();
      case DeploytestPackage.EXECUTION__INITIALIZATION:
        return getInitialization();
      case DeploytestPackage.EXECUTION__VERIFICATIONS:
        return getVerifications();
      case DeploytestPackage.EXECUTION__SUB_EXECUTIONS:
        return getSubExecutions();
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
      case DeploytestPackage.EXECUTION__EXECUTION_ACTIONS:
        getExecutionActions().clear();
        getExecutionActions().addAll((Collection)newValue);
        return;
      case DeploytestPackage.EXECUTION__SUPER_EXECUTION:
        setSuperExecution((Execution)newValue);
        return;
      case DeploytestPackage.EXECUTION__INITIALIZATION:
        setInitialization((Initialization)newValue);
        return;
      case DeploytestPackage.EXECUTION__VERIFICATIONS:
        getVerifications().clear();
        getVerifications().addAll((Collection)newValue);
        return;
      case DeploytestPackage.EXECUTION__SUB_EXECUTIONS:
        getSubExecutions().clear();
        getSubExecutions().addAll((Collection)newValue);
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
      case DeploytestPackage.EXECUTION__EXECUTION_ACTIONS:
        getExecutionActions().clear();
        return;
      case DeploytestPackage.EXECUTION__SUPER_EXECUTION:
        setSuperExecution((Execution)null);
        return;
      case DeploytestPackage.EXECUTION__INITIALIZATION:
        setInitialization((Initialization)null);
        return;
      case DeploytestPackage.EXECUTION__VERIFICATIONS:
        getVerifications().clear();
        return;
      case DeploytestPackage.EXECUTION__SUB_EXECUTIONS:
        getSubExecutions().clear();
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
      case DeploytestPackage.EXECUTION__EXECUTION_ACTIONS:
        return executionActions != null && !executionActions.isEmpty();
      case DeploytestPackage.EXECUTION__SUPER_EXECUTION:
        return getSuperExecution() != null;
      case DeploytestPackage.EXECUTION__INITIALIZATION:
        return getInitialization() != null;
      case DeploytestPackage.EXECUTION__VERIFICATIONS:
        return verifications != null && !verifications.isEmpty();
      case DeploytestPackage.EXECUTION__SUB_EXECUTIONS:
        return subExecutions != null && !subExecutions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getVerifications()
  {
    if (verifications == null)
    {
      verifications = new EObjectContainmentWithInverseEList(Verification.class, this,
              DeploytestPackage.EXECUTION__VERIFICATIONS, DeploytestPackage.VERIFICATION__EXECUTION)
      {
        private static final long serialVersionUID = 3848708425609720829L;

        @Override
        protected void didAdd(int index, Object newObject)
        {
          super.didAdd(index, newObject);
          TestSpecImpl root = (TestSpecImpl)getRoot();
          if (root != null)
          {
            root.adjustVerificationId(newObject);
          }
        }
      };
    }
    return verifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initialization getInitialization()
  {
    if (eContainerFeatureID != DeploytestPackage.EXECUTION__INITIALIZATION) return null;
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
            || (eContainerFeatureID != DeploytestPackage.EXECUTION__INITIALIZATION && newInitialization != null))
    {
      if (EcoreUtil.isAncestor(this, newInitialization))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newInitialization != null)
        msgs = ((InternalEObject)newInitialization).eInverseAdd(this,
                DeploytestPackage.INITIALIZATION__EXECUTIONS, Initialization.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newInitialization,
              DeploytestPackage.EXECUTION__INITIALIZATION, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.EXECUTION__INITIALIZATION, newInitialization, newInitialization));
  }

  /**
   * @ADDED
   */
  @Override
  public String getDisplayLabel()
  {
    return formatList(getExecutionActions());
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
    else if (getSuperExecution() != null)
    {
      result.addAll(getSuperExecution().getSpecSequence());
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
    if (getSuperExecution() != null) return getSuperExecution().getRoot();
    return null;
  }
} //ExecutionImpl

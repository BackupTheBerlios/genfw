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
 * An implementation of the model object '<em><b>Initialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.InitializationImpl#getInitializationActions <em>Initialization Actions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.InitializationImpl#getSuperInitialization <em>Super Initialization</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.InitializationImpl#getVerifications <em>Verifications</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.InitializationImpl#getSubInitializations <em>Sub Initializations</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.impl.InitializationImpl#getExecutions <em>Executions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitializationImpl extends TestCaseSpecImpl implements Initialization
{
  /**
   * The cached value of the '{@link #getInitializationActions() <em>Initialization Actions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitializationActions()
   * @generated
   * @ordered
   */
  protected EList initializationActions = null;

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
   * The cached value of the '{@link #getSubInitializations() <em>Sub Initializations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubInitializations()
   * @generated
   * @ordered
   */
  protected EList subInitializations = null;

  /**
   * The cached value of the '{@link #getExecutions() <em>Executions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecutions()
   * @generated
   * @ordered
   */
  protected EList executions = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitializationImpl()
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
    return DeploytestPackage.Literals.INITIALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getInitializationActions()
  {
    if (initializationActions == null)
    {
      initializationActions = new EObjectResolvingEList(Action.class, this,
              DeploytestPackage.INITIALIZATION__INITIALIZATION_ACTIONS);
    }
    return initializationActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Initialization getSuperInitialization()
  {
    if (eContainerFeatureID != DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION) return null;
    return (Initialization)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperInitialization(Initialization newSuperInitialization)
  {
    if (newSuperInitialization != eInternalContainer()
            || (eContainerFeatureID != DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION && newSuperInitialization != null))
    {
      if (EcoreUtil.isAncestor(this, newSuperInitialization))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newSuperInitialization != null)
        msgs = ((InternalEObject)newSuperInitialization).eInverseAdd(this,
                DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS, Initialization.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newSuperInitialization,
              DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION, newSuperInitialization,
              newSuperInitialization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getSubInitializations()
  {
    if (subInitializations == null)
    {
      subInitializations = new EObjectContainmentWithInverseEList(Initialization.class, this,
              DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS,
              DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION)
      {
        private static final long serialVersionUID = -2285858800953095293L;

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
    return subInitializations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getExecutions()
  {
    if (executions == null)
    {
      executions = new EObjectContainmentWithInverseEList(Execution.class, this,
              DeploytestPackage.INITIALIZATION__EXECUTIONS,
              DeploytestPackage.EXECUTION__INITIALIZATION)
      {
        private static final long serialVersionUID = 4795014540336683002L;

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
    return executions;
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
      case DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION,
                msgs);
      case DeploytestPackage.INITIALIZATION__VERIFICATIONS:
        return ((InternalEList)getVerifications()).basicAdd(otherEnd, msgs);
      case DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS:
        return ((InternalEList)getSubInitializations()).basicAdd(otherEnd, msgs);
      case DeploytestPackage.INITIALIZATION__EXECUTIONS:
        return ((InternalEList)getExecutions()).basicAdd(otherEnd, msgs);
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
      case DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION:
        return eBasicSetContainer(null, DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION,
                msgs);
      case DeploytestPackage.INITIALIZATION__VERIFICATIONS:
        return ((InternalEList)getVerifications()).basicRemove(otherEnd, msgs);
      case DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS:
        return ((InternalEList)getSubInitializations()).basicRemove(otherEnd, msgs);
      case DeploytestPackage.INITIALIZATION__EXECUTIONS:
        return ((InternalEList)getExecutions()).basicRemove(otherEnd, msgs);
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
      case DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION:
        return eInternalContainer().eInverseRemove(this,
                DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS, Initialization.class, msgs);
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
      case DeploytestPackage.INITIALIZATION__INITIALIZATION_ACTIONS:
        return getInitializationActions();
      case DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION:
        return getSuperInitialization();
      case DeploytestPackage.INITIALIZATION__VERIFICATIONS:
        return getVerifications();
      case DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS:
        return getSubInitializations();
      case DeploytestPackage.INITIALIZATION__EXECUTIONS:
        return getExecutions();
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
      case DeploytestPackage.INITIALIZATION__INITIALIZATION_ACTIONS:
        getInitializationActions().clear();
        getInitializationActions().addAll((Collection)newValue);
        return;
      case DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION:
        setSuperInitialization((Initialization)newValue);
        return;
      case DeploytestPackage.INITIALIZATION__VERIFICATIONS:
        getVerifications().clear();
        getVerifications().addAll((Collection)newValue);
        return;
      case DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS:
        getSubInitializations().clear();
        getSubInitializations().addAll((Collection)newValue);
        return;
      case DeploytestPackage.INITIALIZATION__EXECUTIONS:
        getExecutions().clear();
        getExecutions().addAll((Collection)newValue);
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
      case DeploytestPackage.INITIALIZATION__INITIALIZATION_ACTIONS:
        getInitializationActions().clear();
        return;
      case DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION:
        setSuperInitialization((Initialization)null);
        return;
      case DeploytestPackage.INITIALIZATION__VERIFICATIONS:
        getVerifications().clear();
        return;
      case DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS:
        getSubInitializations().clear();
        return;
      case DeploytestPackage.INITIALIZATION__EXECUTIONS:
        getExecutions().clear();
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
      case DeploytestPackage.INITIALIZATION__INITIALIZATION_ACTIONS:
        return initializationActions != null && !initializationActions.isEmpty();
      case DeploytestPackage.INITIALIZATION__SUPER_INITIALIZATION:
        return getSuperInitialization() != null;
      case DeploytestPackage.INITIALIZATION__VERIFICATIONS:
        return verifications != null && !verifications.isEmpty();
      case DeploytestPackage.INITIALIZATION__SUB_INITIALIZATIONS:
        return subInitializations != null && !subInitializations.isEmpty();
      case DeploytestPackage.INITIALIZATION__EXECUTIONS:
        return executions != null && !executions.isEmpty();
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
              DeploytestPackage.INITIALIZATION__VERIFICATIONS,
              DeploytestPackage.VERIFICATION__INITIALIZATION)
      {
        private static final long serialVersionUID = -2285858800953095293L;

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
   * @ADDED
   */
  @Override
  public String getDisplayLabel()
  {
    return formatList(getInitializationActions());
  }

  /**
   * @ADDED
   */
  @Override
  public EList getSpecSequence()
  {
    EList result = new BasicEList();
    if (getSuperInitialization() != null)
    {
      result.addAll(getSuperInitialization().getSpecSequence());
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
    if (getSuperInitialization() != null) return getSuperInitialization().getRoot();
    return null;
  }
} //InitializationImpl

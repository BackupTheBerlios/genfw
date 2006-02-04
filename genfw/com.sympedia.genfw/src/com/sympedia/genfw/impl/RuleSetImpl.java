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
package com.sympedia.genfw.impl;


import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.Rule;
import com.sympedia.genfw.RuleSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
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
 * An implementation of the model object '<em><b>Rule Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.RuleSetImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleSetImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleSetImpl#isDeactivate <em>Deactivate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleSetImpl extends LifeCycleImpl implements RuleSet
{
  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList rules = null;

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
   * The default value of the '{@link #isDeactivate() <em>Deactivate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeactivate()
   * @generated
   * @ordered
   */
  protected static final boolean DEACTIVATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDeactivate() <em>Deactivate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDeactivate()
   * @generated
   * @ordered
   */
  protected boolean deactivate = DEACTIVATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleSetImpl()
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
    return GenfwPackage.Literals.RULE_SET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentWithInverseEList(Rule.class, this,
              GenfwPackage.RULE_SET__RULES, GenfwPackage.RULE__RULE_SET);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenLib getRoot()
  {
    if (eContainerFeatureID != GenfwPackage.RULE_SET__ROOT) return null;
    return (GenLib)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(GenLib newRoot)
  {
    if (newRoot != eInternalContainer()
            || (eContainerFeatureID != GenfwPackage.RULE_SET__ROOT && newRoot != null))
    {
      if (EcoreUtil.isAncestor(this, newRoot))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, GenfwPackage.GEN_LIB__RULE_SETS,
                GenLib.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newRoot, GenfwPackage.RULE_SET__ROOT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE_SET__ROOT, newRoot,
              newRoot));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE_SET__NAME, oldName,
              name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDeactivate()
  {
    return deactivate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeactivate(boolean newDeactivate)
  {
    boolean oldDeactivate = deactivate;
    deactivate = newDeactivate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE_SET__DEACTIVATE,
              oldDeactivate, deactivate));
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
    case GenfwPackage.RULE_SET__RULES:
      return ((InternalEList)getRules()).basicAdd(otherEnd, msgs);
    case GenfwPackage.RULE_SET__ROOT:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, GenfwPackage.RULE_SET__ROOT, msgs);
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
    case GenfwPackage.RULE_SET__RULES:
      return ((InternalEList)getRules()).basicRemove(otherEnd, msgs);
    case GenfwPackage.RULE_SET__ROOT:
      return eBasicSetContainer(null, GenfwPackage.RULE_SET__ROOT, msgs);
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
    case GenfwPackage.RULE_SET__ROOT:
      return eInternalContainer().eInverseRemove(this, GenfwPackage.GEN_LIB__RULE_SETS,
              GenLib.class, msgs);
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
    case GenfwPackage.RULE_SET__RULES:
      return getRules();
    case GenfwPackage.RULE_SET__ROOT:
      return getRoot();
    case GenfwPackage.RULE_SET__NAME:
      return getName();
    case GenfwPackage.RULE_SET__DEACTIVATE:
      return isDeactivate() ? Boolean.TRUE : Boolean.FALSE;
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
    case GenfwPackage.RULE_SET__RULES:
      getRules().clear();
      getRules().addAll((Collection)newValue);
      return;
    case GenfwPackage.RULE_SET__ROOT:
      setRoot((GenLib)newValue);
      return;
    case GenfwPackage.RULE_SET__NAME:
      setName((String)newValue);
      return;
    case GenfwPackage.RULE_SET__DEACTIVATE:
      setDeactivate(((Boolean)newValue).booleanValue());
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
    case GenfwPackage.RULE_SET__RULES:
      getRules().clear();
      return;
    case GenfwPackage.RULE_SET__ROOT:
      setRoot((GenLib)null);
      return;
    case GenfwPackage.RULE_SET__NAME:
      setName(NAME_EDEFAULT);
      return;
    case GenfwPackage.RULE_SET__DEACTIVATE:
      setDeactivate(DEACTIVATE_EDEFAULT);
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
    case GenfwPackage.RULE_SET__RULES:
      return rules != null && !rules.isEmpty();
    case GenfwPackage.RULE_SET__ROOT:
      return getRoot() != null;
    case GenfwPackage.RULE_SET__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case GenfwPackage.RULE_SET__DEACTIVATE:
      return deactivate != DEACTIVATE_EDEFAULT;
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
    result.append(", deactivate: ");
    result.append(deactivate);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    for (Iterator it = getRules().iterator(); it.hasNext();)
    {
      Rule rule = (Rule)it.next();
      rule.initialize(getRuntimeGenApp());
    }
  }

  /**
   * @ADDED
   */
  @Override
  protected void doDispose() throws Exception
  {
    for (Iterator it = getRules().iterator(); it.hasNext();)
    {
      Rule rule = (Rule)it.next();
      rule.dispose(getRuntimeGenApp());
    }

    super.doDispose();
  }
} //RuleSetImpl

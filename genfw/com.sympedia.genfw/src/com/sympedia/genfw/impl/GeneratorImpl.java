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
import com.sympedia.genfw.Generator;
import com.sympedia.genfw.GenfwPackage;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.GeneratorImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.GeneratorImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GeneratorImpl extends LifeCycleImpl implements Generator
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneratorImpl()
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
    return GenfwPackage.Literals.GENERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenLib getRoot()
  {
    if (eContainerFeatureID != GenfwPackage.GENERATOR__ROOT) return null;
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
            || (eContainerFeatureID != GenfwPackage.GENERATOR__ROOT && newRoot != null))
    {
      if (EcoreUtil.isAncestor(this, newRoot))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, GenfwPackage.GEN_LIB__GENERATORS,
                GenLib.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newRoot, GenfwPackage.GENERATOR__ROOT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.GENERATOR__ROOT, newRoot,
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.GENERATOR__NAME, oldName,
              name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public abstract String generate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception;

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
    case GenfwPackage.GENERATOR__ROOT:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, GenfwPackage.GENERATOR__ROOT, msgs);
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
    case GenfwPackage.GENERATOR__ROOT:
      return eBasicSetContainer(null, GenfwPackage.GENERATOR__ROOT, msgs);
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
    case GenfwPackage.GENERATOR__ROOT:
      return eInternalContainer().eInverseRemove(this, GenfwPackage.GEN_LIB__GENERATORS,
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
    case GenfwPackage.GENERATOR__ROOT:
      return getRoot();
    case GenfwPackage.GENERATOR__NAME:
      return getName();
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
    case GenfwPackage.GENERATOR__ROOT:
      setRoot((GenLib)newValue);
      return;
    case GenfwPackage.GENERATOR__NAME:
      setName((String)newValue);
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
    case GenfwPackage.GENERATOR__ROOT:
      setRoot((GenLib)null);
      return;
    case GenfwPackage.GENERATOR__NAME:
      setName(NAME_EDEFAULT);
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
    case GenfwPackage.GENERATOR__ROOT:
      return getRoot() != null;
    case GenfwPackage.GENERATOR__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(')');
    return result.toString();
  }

} //GeneratorImpl

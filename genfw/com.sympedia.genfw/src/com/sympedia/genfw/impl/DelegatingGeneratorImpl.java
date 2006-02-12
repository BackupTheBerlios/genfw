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


import com.sympedia.genfw.DelegatingGenerator;
import com.sympedia.genfw.Generator;
import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegating Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.DelegatingGeneratorImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DelegatingGeneratorImpl extends GeneratorImpl implements DelegatingGenerator
{
  /**
   * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegate()
   * @generated
   * @ordered
   */
  protected Generator delegate = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DelegatingGeneratorImpl()
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
    return GenfwPackage.Literals.DELEGATING_GENERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator getDelegate()
  {
    if (delegate != null && delegate.eIsProxy())
    {
      InternalEObject oldDelegate = (InternalEObject)delegate;
      delegate = (Generator)eResolveProxy(oldDelegate);
      if (delegate != oldDelegate)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  GenfwPackage.DELEGATING_GENERATOR__DELEGATE, oldDelegate, delegate));
      }
    }
    return delegate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator basicGetDelegate()
  {
    return delegate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelegate(Generator newDelegate)
  {
    Generator oldDelegate = delegate;
    delegate = newDelegate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DELEGATING_GENERATOR__DELEGATE, oldDelegate, delegate));
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
    case GenfwPackage.DELEGATING_GENERATOR__DELEGATE:
      if (resolve) return getDelegate();
      return basicGetDelegate();
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
    case GenfwPackage.DELEGATING_GENERATOR__DELEGATE:
      setDelegate((Generator)newValue);
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
    case GenfwPackage.DELEGATING_GENERATOR__DELEGATE:
      setDelegate((Generator)null);
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
    case GenfwPackage.DELEGATING_GENERATOR__DELEGATE:
      return delegate != null;
    }
    return super.eIsSet(featureID);
  }

} //DelegatingGeneratorImpl

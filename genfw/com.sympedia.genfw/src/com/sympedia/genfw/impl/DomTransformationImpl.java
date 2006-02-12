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


import com.sympedia.genfw.DomTransformation;
import com.sympedia.genfw.DomTransformer;
import com.sympedia.genfw.GenfwPackage;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.w3c.dom.Document;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dom Transformation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformationImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformationImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DomTransformationImpl extends LifeCycleImpl implements DomTransformation
{
  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomTransformationImpl()
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
    return GenfwPackage.Literals.DOM_TRANSFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomTransformer getTransformer()
  {
    if (eContainerFeatureID != GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER) return null;
    return (DomTransformer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransformer(DomTransformer newTransformer)
  {
    if (newTransformer != eInternalContainer()
            || (eContainerFeatureID != GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER && newTransformer != null))
    {
      if (EcoreUtil.isAncestor(this, newTransformer))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newTransformer != null)
        msgs = ((InternalEObject)newTransformer).eInverseAdd(this,
                GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS, DomTransformer.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newTransformer,
              GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER, newTransformer, newTransformer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public abstract String getLabel();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public abstract boolean transform(Object inputObject, Document document, IProgressMonitor monitor)
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
    case GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER, msgs);
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
    case GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER:
      return eBasicSetContainer(null, GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER, msgs);
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
    case GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER:
      return eInternalContainer().eInverseRemove(this,
              GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS, DomTransformer.class, msgs);
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
    case GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER:
      return getTransformer();
    case GenfwPackage.DOM_TRANSFORMATION__LABEL:
      return getLabel();
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
    case GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER:
      setTransformer((DomTransformer)newValue);
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
    case GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER:
      setTransformer((DomTransformer)null);
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
    case GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER:
      return getTransformer() != null;
    case GenfwPackage.DOM_TRANSFORMATION__LABEL:
      return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
    }
    return super.eIsSet(featureID);
  }

} //DomTransformationRuleImpl

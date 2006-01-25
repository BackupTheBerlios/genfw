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
package tutorial1.gen.beans.impl;


import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tutorial1.gen.beans.Bean;
import tutorial1.gen.beans.BeanLibrary;
import tutorial1.gen.beans.BeanProperty;
import tutorial1.gen.beans.BeansPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tutorial1.gen.beans.impl.BeanImpl#getBeanLibrary <em>Bean Library</em>}</li>
 *   <li>{@link tutorial1.gen.beans.impl.BeanImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanImpl extends NamedElementImpl implements Bean
{
  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList properties = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeanImpl()
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
    return BeansPackage.Literals.BEAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeanLibrary getBeanLibrary()
  {
    if (eContainerFeatureID != BeansPackage.BEAN__BEAN_LIBRARY) return null;
    return (BeanLibrary)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeanLibrary(BeanLibrary newBeanLibrary)
  {
    if (newBeanLibrary != eInternalContainer()
            || (eContainerFeatureID != BeansPackage.BEAN__BEAN_LIBRARY && newBeanLibrary != null))
    {
      if (EcoreUtil.isAncestor(this, newBeanLibrary))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newBeanLibrary != null)
        msgs = ((InternalEObject)newBeanLibrary).eInverseAdd(this,
                BeansPackage.BEAN_LIBRARY__BEANS, BeanLibrary.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newBeanLibrary, BeansPackage.BEAN__BEAN_LIBRARY,
              msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BEAN__BEAN_LIBRARY,
              newBeanLibrary, newBeanLibrary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentWithInverseEList(BeanProperty.class, this,
              BeansPackage.BEAN__PROPERTIES, BeansPackage.BEAN_PROPERTY__BEAN);
    }
    return properties;
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
    case BeansPackage.BEAN__BEAN_LIBRARY:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, BeansPackage.BEAN__BEAN_LIBRARY, msgs);
    case BeansPackage.BEAN__PROPERTIES:
      return ((InternalEList)getProperties()).basicAdd(otherEnd, msgs);
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
    case BeansPackage.BEAN__BEAN_LIBRARY:
      return eBasicSetContainer(null, BeansPackage.BEAN__BEAN_LIBRARY, msgs);
    case BeansPackage.BEAN__PROPERTIES:
      return ((InternalEList)getProperties()).basicRemove(otherEnd, msgs);
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
    case BeansPackage.BEAN__BEAN_LIBRARY:
      return eInternalContainer().eInverseRemove(this, BeansPackage.BEAN_LIBRARY__BEANS,
              BeanLibrary.class, msgs);
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
    case BeansPackage.BEAN__BEAN_LIBRARY:
      return getBeanLibrary();
    case BeansPackage.BEAN__PROPERTIES:
      return getProperties();
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
    case BeansPackage.BEAN__BEAN_LIBRARY:
      setBeanLibrary((BeanLibrary)newValue);
      return;
    case BeansPackage.BEAN__PROPERTIES:
      getProperties().clear();
      getProperties().addAll((Collection)newValue);
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
    case BeansPackage.BEAN__BEAN_LIBRARY:
      setBeanLibrary((BeanLibrary)null);
      return;
    case BeansPackage.BEAN__PROPERTIES:
      getProperties().clear();
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
    case BeansPackage.BEAN__BEAN_LIBRARY:
      return getBeanLibrary() != null;
    case BeansPackage.BEAN__PROPERTIES:
      return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BeanImpl

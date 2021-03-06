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


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import tutorial1.gen.beans.Bean;
import tutorial1.gen.beans.BeanProperty;
import tutorial1.gen.beans.BeansPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bean Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tutorial1.gen.beans.impl.BeanPropertyImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link tutorial1.gen.beans.impl.BeanPropertyImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link tutorial1.gen.beans.impl.BeanPropertyImpl#isChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BeanPropertyImpl extends NamedElementImpl implements BeanProperty
{
  /**
   * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected static final String TYPE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeName()
   * @generated
   * @ordered
   */
  protected String typeName = TYPE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isChangeable()
   * @generated
   * @ordered
   */
  protected static final boolean CHANGEABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isChangeable()
   * @generated
   * @ordered
   */
  protected boolean changeable = CHANGEABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BeanPropertyImpl()
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
    return BeansPackage.Literals.BEAN_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeName()
  {
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeName(String newTypeName)
  {
    String oldTypeName = typeName;
    typeName = newTypeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BEAN_PROPERTY__TYPE_NAME,
              oldTypeName, typeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bean getBean()
  {
    if (eContainerFeatureID != BeansPackage.BEAN_PROPERTY__BEAN) return null;
    return (Bean)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBean(Bean newBean)
  {
    if (newBean != eInternalContainer()
            || (eContainerFeatureID != BeansPackage.BEAN_PROPERTY__BEAN && newBean != null))
    {
      if (EcoreUtil.isAncestor(this, newBean))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newBean != null)
        msgs = ((InternalEObject)newBean).eInverseAdd(this, BeansPackage.BEAN__PROPERTIES,
                Bean.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newBean, BeansPackage.BEAN_PROPERTY__BEAN, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BEAN_PROPERTY__BEAN,
              newBean, newBean));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isChangeable()
  {
    return changeable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChangeable(boolean newChangeable)
  {
    boolean oldChangeable = changeable;
    changeable = newChangeable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BeansPackage.BEAN_PROPERTY__CHANGEABLE,
              oldChangeable, changeable));
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
    case BeansPackage.BEAN_PROPERTY__BEAN:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, BeansPackage.BEAN_PROPERTY__BEAN, msgs);
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
    case BeansPackage.BEAN_PROPERTY__BEAN:
      return eBasicSetContainer(null, BeansPackage.BEAN_PROPERTY__BEAN, msgs);
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
    case BeansPackage.BEAN_PROPERTY__BEAN:
      return eInternalContainer().eInverseRemove(this, BeansPackage.BEAN__PROPERTIES, Bean.class,
              msgs);
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
    case BeansPackage.BEAN_PROPERTY__TYPE_NAME:
      return getTypeName();
    case BeansPackage.BEAN_PROPERTY__BEAN:
      return getBean();
    case BeansPackage.BEAN_PROPERTY__CHANGEABLE:
      return isChangeable() ? Boolean.TRUE : Boolean.FALSE;
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
    case BeansPackage.BEAN_PROPERTY__TYPE_NAME:
      setTypeName((String)newValue);
      return;
    case BeansPackage.BEAN_PROPERTY__BEAN:
      setBean((Bean)newValue);
      return;
    case BeansPackage.BEAN_PROPERTY__CHANGEABLE:
      setChangeable(((Boolean)newValue).booleanValue());
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
    case BeansPackage.BEAN_PROPERTY__TYPE_NAME:
      setTypeName(TYPE_NAME_EDEFAULT);
      return;
    case BeansPackage.BEAN_PROPERTY__BEAN:
      setBean((Bean)null);
      return;
    case BeansPackage.BEAN_PROPERTY__CHANGEABLE:
      setChangeable(CHANGEABLE_EDEFAULT);
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
    case BeansPackage.BEAN_PROPERTY__TYPE_NAME:
      return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
    case BeansPackage.BEAN_PROPERTY__BEAN:
      return getBean() != null;
    case BeansPackage.BEAN_PROPERTY__CHANGEABLE:
      return changeable != CHANGEABLE_EDEFAULT;
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
    result.append(" (typeName: ");
    result.append(typeName);
    result.append(", changeable: ");
    result.append(changeable);
    result.append(')');
    return result.toString();
  }

} //BeanPropertyImpl

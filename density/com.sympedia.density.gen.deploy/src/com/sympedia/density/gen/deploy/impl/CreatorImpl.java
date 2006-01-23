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
package com.sympedia.density.gen.deploy.impl;


import com.sympedia.density.gen.deploy.Creator;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.CreatorImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.CreatorImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.CreatorImpl#getProduct <em>Product</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreatorImpl extends EObjectImpl implements Creator
{
  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected EOperation operation = null;

  /**
   * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProduct()
   * @generated
   * @ordered
   */
  protected Deployment product = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreatorImpl()
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
    return DeployPackage.Literals.CREATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation getOperation()
  {
    if (operation != null && operation.eIsProxy())
    {
      InternalEObject oldOperation = (InternalEObject)operation;
      operation = (EOperation)eResolveProxy(oldOperation);
      if (operation != oldOperation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeployPackage.CREATOR__OPERATION, oldOperation, operation));
      }
    }
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EOperation basicGetOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(EOperation newOperation)
  {
    EOperation oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.CREATOR__OPERATION,
              oldOperation, operation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment getDeployment()
  {
    if (eContainerFeatureID != DeployPackage.CREATOR__DEPLOYMENT) return null;
    return (Deployment)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeployment(Deployment newDeployment)
  {
    if (newDeployment != eInternalContainer()
            || (eContainerFeatureID != DeployPackage.CREATOR__DEPLOYMENT && newDeployment != null))
    {
      if (EcoreUtil.isAncestor(this, newDeployment))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newDeployment != null)
        msgs = ((InternalEObject)newDeployment).eInverseAdd(this,
                DeployPackage.DEPLOYMENT__CREATORS, Deployment.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newDeployment, DeployPackage.CREATOR__DEPLOYMENT,
              msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.CREATOR__DEPLOYMENT,
              newDeployment, newDeployment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment getProduct()
  {
    if (product != null && product.eIsProxy())
    {
      InternalEObject oldProduct = (InternalEObject)product;
      product = (Deployment)eResolveProxy(oldProduct);
      if (product != oldProduct)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeployPackage.CREATOR__PRODUCT,
                  oldProduct, product));
      }
    }
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment basicGetProduct()
  {
    return product;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProduct(Deployment newProduct)
  {
    Deployment oldProduct = product;
    product = newProduct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.CREATOR__PRODUCT,
              oldProduct, product));
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
      case DeployPackage.CREATOR__DEPLOYMENT:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeployPackage.CREATOR__DEPLOYMENT, msgs);
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
      case DeployPackage.CREATOR__DEPLOYMENT:
        return eBasicSetContainer(null, DeployPackage.CREATOR__DEPLOYMENT, msgs);
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
      case DeployPackage.CREATOR__DEPLOYMENT:
        return eInternalContainer().eInverseRemove(this, DeployPackage.DEPLOYMENT__CREATORS,
                Deployment.class, msgs);
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
      case DeployPackage.CREATOR__OPERATION:
        if (resolve) return getOperation();
        return basicGetOperation();
      case DeployPackage.CREATOR__DEPLOYMENT:
        return getDeployment();
      case DeployPackage.CREATOR__PRODUCT:
        if (resolve) return getProduct();
        return basicGetProduct();
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
      case DeployPackage.CREATOR__OPERATION:
        setOperation((EOperation)newValue);
        return;
      case DeployPackage.CREATOR__DEPLOYMENT:
        setDeployment((Deployment)newValue);
        return;
      case DeployPackage.CREATOR__PRODUCT:
        setProduct((Deployment)newValue);
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
      case DeployPackage.CREATOR__OPERATION:
        setOperation((EOperation)null);
        return;
      case DeployPackage.CREATOR__DEPLOYMENT:
        setDeployment((Deployment)null);
        return;
      case DeployPackage.CREATOR__PRODUCT:
        setProduct((Deployment)null);
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
      case DeployPackage.CREATOR__OPERATION:
        return operation != null;
      case DeployPackage.CREATOR__DEPLOYMENT:
        return getDeployment() != null;
      case DeployPackage.CREATOR__PRODUCT:
        return product != null;
    }
    return super.eIsSet(featureID);
  }

} //CreatorImpl

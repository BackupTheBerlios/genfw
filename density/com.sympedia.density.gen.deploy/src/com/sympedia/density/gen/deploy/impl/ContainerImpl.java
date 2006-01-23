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


import com.sympedia.density.gen.deploy.Container;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.DeploymentGroup;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.ContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.ContainerImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.ContainerImpl#isIncomplete <em>Incomplete</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.ContainerImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.ContainerImpl#getDeploymentGroups <em>Deployment Groups</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.ContainerImpl#getAllDeployments <em>All Deployments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerImpl extends EObjectImpl implements Container
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
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isIncomplete() <em>Incomplete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncomplete()
   * @generated
   * @ordered
   */
  protected static final boolean INCOMPLETE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIncomplete() <em>Incomplete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIncomplete()
   * @generated
   * @ordered
   */
  protected boolean incomplete = INCOMPLETE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeployments()
   * @generated
   * @ordered
   */
  protected EList deployments = null;

  /**
   * The cached value of the '{@link #getDeploymentGroups() <em>Deployment Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeploymentGroups()
   * @generated
   * @ordered
   */
  protected EList deploymentGroups = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerImpl()
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
    return DeployPackage.Literals.CONTAINER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.CONTAINER__NAME, oldName,
              name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.CONTAINER__PACKAGE_NAME,
              oldPackageName, packageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIncomplete()
  {
    return incomplete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncomplete(boolean newIncomplete)
  {
    boolean oldIncomplete = incomplete;
    incomplete = newIncomplete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.CONTAINER__INCOMPLETE,
              oldIncomplete, incomplete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDeployments()
  {
    if (deployments == null)
    {
      deployments = new EObjectContainmentWithInverseEList(Deployment.class, this,
              DeployPackage.CONTAINER__DEPLOYMENTS, DeployPackage.DEPLOYMENT__CONTAINER);
    }
    return deployments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDeploymentGroups()
  {
    if (deploymentGroups == null)
    {
      deploymentGroups = new EObjectContainmentWithInverseEList(DeploymentGroup.class, this,
              DeployPackage.CONTAINER__DEPLOYMENT_GROUPS, DeployPackage.DEPLOYMENT_GROUP__CONTAINER);
    }
    return deploymentGroups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getAllDeployments()
  {
    BasicEList result = new BasicEList();
    try
    {
      recurseAllDeployments(this, result);
    }
    catch (Exception ex)
    {
      EcorePlugin.getPlugin().getLog().log(
              new Status(IStatus.WARNING, EcorePlugin.getPlugin().getBundle().getSymbolicName(),
                      IStatus.WARNING, "Problem in getAllDeployments()", ex));
    }

    return result;
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
      case DeployPackage.CONTAINER__DEPLOYMENTS:
        return ((InternalEList)getDeployments()).basicAdd(otherEnd, msgs);
      case DeployPackage.CONTAINER__DEPLOYMENT_GROUPS:
        return ((InternalEList)getDeploymentGroups()).basicAdd(otherEnd, msgs);
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
      case DeployPackage.CONTAINER__DEPLOYMENTS:
        return ((InternalEList)getDeployments()).basicRemove(otherEnd, msgs);
      case DeployPackage.CONTAINER__DEPLOYMENT_GROUPS:
        return ((InternalEList)getDeploymentGroups()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DeployPackage.CONTAINER__NAME:
        return getName();
      case DeployPackage.CONTAINER__PACKAGE_NAME:
        return getPackageName();
      case DeployPackage.CONTAINER__INCOMPLETE:
        return isIncomplete() ? Boolean.TRUE : Boolean.FALSE;
      case DeployPackage.CONTAINER__DEPLOYMENTS:
        return getDeployments();
      case DeployPackage.CONTAINER__DEPLOYMENT_GROUPS:
        return getDeploymentGroups();
      case DeployPackage.CONTAINER__ALL_DEPLOYMENTS:
        return getAllDeployments();
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
      case DeployPackage.CONTAINER__NAME:
        setName((String)newValue);
        return;
      case DeployPackage.CONTAINER__PACKAGE_NAME:
        setPackageName((String)newValue);
        return;
      case DeployPackage.CONTAINER__INCOMPLETE:
        setIncomplete(((Boolean)newValue).booleanValue());
        return;
      case DeployPackage.CONTAINER__DEPLOYMENTS:
        getDeployments().clear();
        getDeployments().addAll((Collection)newValue);
        return;
      case DeployPackage.CONTAINER__DEPLOYMENT_GROUPS:
        getDeploymentGroups().clear();
        getDeploymentGroups().addAll((Collection)newValue);
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
      case DeployPackage.CONTAINER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DeployPackage.CONTAINER__PACKAGE_NAME:
        setPackageName(PACKAGE_NAME_EDEFAULT);
        return;
      case DeployPackage.CONTAINER__INCOMPLETE:
        setIncomplete(INCOMPLETE_EDEFAULT);
        return;
      case DeployPackage.CONTAINER__DEPLOYMENTS:
        getDeployments().clear();
        return;
      case DeployPackage.CONTAINER__DEPLOYMENT_GROUPS:
        getDeploymentGroups().clear();
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
      case DeployPackage.CONTAINER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DeployPackage.CONTAINER__PACKAGE_NAME:
        return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT
                .equals(packageName);
      case DeployPackage.CONTAINER__INCOMPLETE:
        return incomplete != INCOMPLETE_EDEFAULT;
      case DeployPackage.CONTAINER__DEPLOYMENTS:
        return deployments != null && !deployments.isEmpty();
      case DeployPackage.CONTAINER__DEPLOYMENT_GROUPS:
        return deploymentGroups != null && !deploymentGroups.isEmpty();
      case DeployPackage.CONTAINER__ALL_DEPLOYMENTS:
        return !getAllDeployments().isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  private static void recurseAllDeployments(EObject object, EList result)
  {
    if (object instanceof Container)
    {
      for (Iterator it = ((Container)object).getDeploymentGroups().iterator(); it.hasNext();)
      {
        DeploymentGroup group = (DeploymentGroup)it.next();
        recurseAllDeployments(group, result);
      }

      for (Iterator it = ((Container)object).getDeployments().iterator(); it.hasNext();)
      {
        Deployment deployment = (Deployment)it.next();
        recurseAllDeployments(deployment, result);
      }
    }
    else if (object instanceof DeploymentGroup)
    {
      for (Iterator it = ((DeploymentGroup)object).getSubGroups().iterator(); it.hasNext();)
      {
        DeploymentGroup group = (DeploymentGroup)it.next();
        recurseAllDeployments(group, result);
      }

      for (Iterator it = ((DeploymentGroup)object).getDeployments().iterator(); it.hasNext();)
      {
        Deployment deployment = (Deployment)it.next();
        recurseAllDeployments(deployment, result);
      }
    }
    else if (object instanceof Deployment)
    {
      result.add(object);
      //      for (Iterator it = ((Deployment)object).getSubDeployments().iterator(); it.hasNext();)
      //      {
      //        Deployment deployment = (Deployment)it.next();
      //        recurseAllDeployments(deployment, result);
      //      }
    }
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
    result.append(", packageName: ");
    result.append(packageName);
    result.append(", incomplete: ");
    result.append(incomplete);
    result.append(')');
    return result.toString();
  }

} //ContainerImpl

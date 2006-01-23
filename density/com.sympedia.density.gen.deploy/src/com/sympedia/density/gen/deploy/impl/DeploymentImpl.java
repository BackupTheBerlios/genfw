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
import com.sympedia.density.gen.deploy.Creator;
import com.sympedia.density.gen.deploy.Dependency;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.DeploymentGroup;
import com.sympedia.density.gen.deploy.DeploymentType;
import com.sympedia.density.gen.deploy.Listener;
import com.sympedia.density.gen.deploy.Reference;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import java.util.Collection;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#isPrototype <em>Prototype</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getDeploymentGroup <em>Deployment Group</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getCreators <em>Creators</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getReferers <em>Referers</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.impl.DeploymentImpl#getDepends <em>Depends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends EObjectImpl implements Deployment
{
  /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
  protected EClass component = null;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final DeploymentType TYPE_EDEFAULT = DeploymentType.SINGLETON_LITERAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DeploymentType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isSingleton() <em>Singleton</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSingleton()
   * @generated
   * @ordered
   */
  protected static final boolean SINGLETON_EDEFAULT = true;

  /**
   * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLazy()
   * @generated
   * @ordered
   */
  protected static final boolean LAZY_EDEFAULT = true;

  /**
   * The default value of the '{@link #isPrototype() <em>Prototype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrototype()
   * @generated
   * @ordered
   */
  protected static final boolean PROTOTYPE_EDEFAULT = true;

  /**
   * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInitialized()
   * @generated
   * @ordered
   */
  protected static final boolean INITIALIZED_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInitialized()
   * @generated
   * @ordered
   */
  protected boolean initialized = INITIALIZED_EDEFAULT;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList dependencies = null;

  /**
   * The cached value of the '{@link #getCreators() <em>Creators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreators()
   * @generated
   * @ordered
   */
  protected EList creators = null;

  /**
   * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeners()
   * @generated
   * @ordered
   */
  protected EList listeners = null;

  /**
   * The cached value of the '{@link #getDepends() <em>Depends</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepends()
   * @generated
   * @ordered
   */
  protected EList depends = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentImpl()
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
    return DeployPackage.Literals.DEPLOYMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.DEPLOYMENT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DeploymentType newType)
  {
    DeploymentType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.DEPLOYMENT__TYPE,
              oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Container getContainer()
  {
    if (eContainerFeatureID != DeployPackage.DEPLOYMENT__CONTAINER) return null;
    return (Container)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContainer(Container newContainer)
  {
    if (newContainer != eInternalContainer()
            || (eContainerFeatureID != DeployPackage.DEPLOYMENT__CONTAINER && newContainer != null))
    {
      if (EcoreUtil.isAncestor(this, newContainer))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newContainer != null)
        msgs = ((InternalEObject)newContainer).eInverseAdd(this,
                DeployPackage.CONTAINER__DEPLOYMENTS, Container.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newContainer, DeployPackage.DEPLOYMENT__CONTAINER,
              msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.DEPLOYMENT__CONTAINER,
              newContainer, newContainer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    if (component != null && component.eIsProxy())
    {
      InternalEObject oldComponent = (InternalEObject)component;
      component = (EClass)eResolveProxy(oldComponent);
      if (component != oldComponent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  DeployPackage.DEPLOYMENT__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass basicGetComponent()
  {
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent(EClass newComponent)
  {
    EClass oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.DEPLOYMENT__COMPONENT,
              oldComponent, component));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentWithInverseEList(Dependency.class, this,
              DeployPackage.DEPLOYMENT__DEPENDENCIES, DeployPackage.DEPENDENCY__DEPLOYMENT);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getCreators()
  {
    if (creators == null)
    {
      creators = new EObjectContainmentWithInverseEList(Creator.class, this,
              DeployPackage.DEPLOYMENT__CREATORS, DeployPackage.CREATOR__DEPLOYMENT);
    }
    return creators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getListeners()
  {
    if (listeners == null)
    {
      listeners = new EObjectContainmentWithInverseEList(Listener.class, this,
              DeployPackage.DEPLOYMENT__LISTENERS, DeployPackage.LISTENER__DEPLOYMENT);
    }
    return listeners;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public EList getReferers()
  {
    return getReferers(this, true);
  }

  /**
   * @ADDED
   */
  public static BasicEList getReferers(Deployment deployment, boolean all)
  {
    BasicEList result = new BasicEList();

    try
    {
      EList allDeployments = deployment.getRoot().getAllDeployments();
      for (Iterator it = allDeployments.iterator(); it.hasNext();)
      {
        Deployment ref = (Deployment)it.next();
        if (isReferenced(deployment, ref, all))
        {
          result.add(ref);
        }
      }
    }
    catch (Exception ex)
    {
      EcorePlugin.getPlugin().getLog().log(
              new Status(IStatus.WARNING, EcorePlugin.getPlugin().getBundle().getSymbolicName(),
                      IStatus.WARNING, "Problem in getReferers()", ex));
    }

    return result;
  }

  /**
   * @ADDED
   */
  private static boolean isReferenced(Deployment target, Deployment referer, boolean all)
  {
    EList dependencies = referer.getDependencies();
    for (Iterator it = dependencies.iterator(); it.hasNext();)
    {
      Dependency dep = (Dependency)it.next();
      if (dep instanceof Reference)
      {
        Reference ref = (Reference)dep;
        if (ref.getTarget() == target)
        {
          return true;
        }
      }
    }

    if (!all)
    {
      return false;
    }

    EList listeners = referer.getListeners();
    for (Iterator it = listeners.iterator(); it.hasNext();)
    {
      Listener listener = (Listener)it.next();
      if (listener.getNotifier() == target)
      {
        return true;
      }
    }

    EList creators = referer.getCreators();
    for (Iterator it = creators.iterator(); it.hasNext();)
    {
      Creator creator = (Creator)it.next();
      if (creator.getProduct() == target)
      {
        return true;
      }
    }

    return false;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Container getRoot()
  {
    if (getContainer() != null)
    {
      return getContainer();
    }

    DeploymentGroup group = getDeploymentGroup();
    while (group != null)
    {
      if (group.getContainer() != null)
      {
        return group.getContainer();
      }

      group = group.getSuperGroup();
    }

    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getDepends()
  {
    if (depends == null)
    {
      depends = new EObjectResolvingEList(Deployment.class, this, DeployPackage.DEPLOYMENT__DEPENDS);
    }
    return depends;
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
      case DeployPackage.DEPLOYMENT__CONTAINER:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeployPackage.DEPLOYMENT__CONTAINER, msgs);
      case DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP:
        if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP, msgs);
      case DeployPackage.DEPLOYMENT__DEPENDENCIES:
        return ((InternalEList)getDependencies()).basicAdd(otherEnd, msgs);
      case DeployPackage.DEPLOYMENT__CREATORS:
        return ((InternalEList)getCreators()).basicAdd(otherEnd, msgs);
      case DeployPackage.DEPLOYMENT__LISTENERS:
        return ((InternalEList)getListeners()).basicAdd(otherEnd, msgs);
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
      case DeployPackage.DEPLOYMENT__CONTAINER:
        return eBasicSetContainer(null, DeployPackage.DEPLOYMENT__CONTAINER, msgs);
      case DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP:
        return eBasicSetContainer(null, DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP, msgs);
      case DeployPackage.DEPLOYMENT__DEPENDENCIES:
        return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
      case DeployPackage.DEPLOYMENT__CREATORS:
        return ((InternalEList)getCreators()).basicRemove(otherEnd, msgs);
      case DeployPackage.DEPLOYMENT__LISTENERS:
        return ((InternalEList)getListeners()).basicRemove(otherEnd, msgs);
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
      case DeployPackage.DEPLOYMENT__CONTAINER:
        return eInternalContainer().eInverseRemove(this, DeployPackage.CONTAINER__DEPLOYMENTS,
                Container.class, msgs);
      case DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP:
        return eInternalContainer().eInverseRemove(this,
                DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS, DeploymentGroup.class, msgs);
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
      case DeployPackage.DEPLOYMENT__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
      case DeployPackage.DEPLOYMENT__ID:
        return getId();
      case DeployPackage.DEPLOYMENT__TYPE:
        return getType();
      case DeployPackage.DEPLOYMENT__SINGLETON:
        return isSingleton() ? Boolean.TRUE : Boolean.FALSE;
      case DeployPackage.DEPLOYMENT__LAZY:
        return isLazy() ? Boolean.TRUE : Boolean.FALSE;
      case DeployPackage.DEPLOYMENT__PROTOTYPE:
        return isPrototype() ? Boolean.TRUE : Boolean.FALSE;
      case DeployPackage.DEPLOYMENT__INITIALIZED:
        return isInitialized() ? Boolean.TRUE : Boolean.FALSE;
      case DeployPackage.DEPLOYMENT__CONTAINER:
        return getContainer();
      case DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP:
        return getDeploymentGroup();
      case DeployPackage.DEPLOYMENT__DEPENDENCIES:
        return getDependencies();
      case DeployPackage.DEPLOYMENT__CREATORS:
        return getCreators();
      case DeployPackage.DEPLOYMENT__LISTENERS:
        return getListeners();
      case DeployPackage.DEPLOYMENT__REFERERS:
        return getReferers();
      case DeployPackage.DEPLOYMENT__ROOT:
        return getRoot();
      case DeployPackage.DEPLOYMENT__DEPENDS:
        return getDepends();
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
      case DeployPackage.DEPLOYMENT__COMPONENT:
        setComponent((EClass)newValue);
        return;
      case DeployPackage.DEPLOYMENT__ID:
        setId((String)newValue);
        return;
      case DeployPackage.DEPLOYMENT__TYPE:
        setType((DeploymentType)newValue);
        return;
      case DeployPackage.DEPLOYMENT__INITIALIZED:
        setInitialized(((Boolean)newValue).booleanValue());
        return;
      case DeployPackage.DEPLOYMENT__CONTAINER:
        setContainer((Container)newValue);
        return;
      case DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP:
        setDeploymentGroup((DeploymentGroup)newValue);
        return;
      case DeployPackage.DEPLOYMENT__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection)newValue);
        return;
      case DeployPackage.DEPLOYMENT__CREATORS:
        getCreators().clear();
        getCreators().addAll((Collection)newValue);
        return;
      case DeployPackage.DEPLOYMENT__LISTENERS:
        getListeners().clear();
        getListeners().addAll((Collection)newValue);
        return;
      case DeployPackage.DEPLOYMENT__DEPENDS:
        getDepends().clear();
        getDepends().addAll((Collection)newValue);
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
      case DeployPackage.DEPLOYMENT__COMPONENT:
        setComponent((EClass)null);
        return;
      case DeployPackage.DEPLOYMENT__ID:
        setId(ID_EDEFAULT);
        return;
      case DeployPackage.DEPLOYMENT__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DeployPackage.DEPLOYMENT__INITIALIZED:
        setInitialized(INITIALIZED_EDEFAULT);
        return;
      case DeployPackage.DEPLOYMENT__CONTAINER:
        setContainer((Container)null);
        return;
      case DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP:
        setDeploymentGroup((DeploymentGroup)null);
        return;
      case DeployPackage.DEPLOYMENT__DEPENDENCIES:
        getDependencies().clear();
        return;
      case DeployPackage.DEPLOYMENT__CREATORS:
        getCreators().clear();
        return;
      case DeployPackage.DEPLOYMENT__LISTENERS:
        getListeners().clear();
        return;
      case DeployPackage.DEPLOYMENT__DEPENDS:
        getDepends().clear();
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
      case DeployPackage.DEPLOYMENT__COMPONENT:
        return component != null;
      case DeployPackage.DEPLOYMENT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DeployPackage.DEPLOYMENT__TYPE:
        return type != TYPE_EDEFAULT;
      case DeployPackage.DEPLOYMENT__SINGLETON:
        return isSingleton() != SINGLETON_EDEFAULT;
      case DeployPackage.DEPLOYMENT__LAZY:
        return isLazy() != LAZY_EDEFAULT;
      case DeployPackage.DEPLOYMENT__PROTOTYPE:
        return isPrototype() != PROTOTYPE_EDEFAULT;
      case DeployPackage.DEPLOYMENT__INITIALIZED:
        return initialized != INITIALIZED_EDEFAULT;
      case DeployPackage.DEPLOYMENT__CONTAINER:
        return getContainer() != null;
      case DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP:
        return getDeploymentGroup() != null;
      case DeployPackage.DEPLOYMENT__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case DeployPackage.DEPLOYMENT__CREATORS:
        return creators != null && !creators.isEmpty();
      case DeployPackage.DEPLOYMENT__LISTENERS:
        return listeners != null && !listeners.isEmpty();
      case DeployPackage.DEPLOYMENT__REFERERS:
        return !getReferers().isEmpty();
      case DeployPackage.DEPLOYMENT__ROOT:
        return getRoot() != null;
      case DeployPackage.DEPLOYMENT__DEPENDS:
        return depends != null && !depends.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentGroup getDeploymentGroup()
  {
    if (eContainerFeatureID != DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP) return null;
    return (DeploymentGroup)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeploymentGroup(DeploymentGroup newDeploymentGroup)
  {
    if (newDeploymentGroup != eInternalContainer()
            || (eContainerFeatureID != DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP && newDeploymentGroup != null))
    {
      if (EcoreUtil.isAncestor(this, newDeploymentGroup))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newDeploymentGroup != null)
        msgs = ((InternalEObject)newDeploymentGroup).eInverseAdd(this,
                DeployPackage.DEPLOYMENT_GROUP__DEPLOYMENTS, DeploymentGroup.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newDeploymentGroup,
              DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              DeployPackage.DEPLOYMENT__DEPLOYMENT_GROUP, newDeploymentGroup, newDeploymentGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public boolean isSingleton()
  {
    return type != DeploymentType.PROTOTYPE_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public boolean isLazy()
  {
    return type != DeploymentType.SINGLETON_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public boolean isPrototype()
  {
    return type == DeploymentType.PROTOTYPE_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInitialized()
  {
    return initialized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialized(boolean newInitialized)
  {
    boolean oldInitialized = initialized;
    initialized = newInitialized;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPackage.DEPLOYMENT__INITIALIZED,
              oldInitialized, initialized));
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
    result.append(" (id: ");
    result.append(id);
    result.append(", type: ");
    result.append(type);
    result.append(", initialized: ");
    result.append(initialized);
    result.append(')');
    return result.toString();
  }

} //DeploymentImpl

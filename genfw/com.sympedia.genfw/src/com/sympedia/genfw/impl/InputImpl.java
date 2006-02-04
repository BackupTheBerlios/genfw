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


import com.sympedia.genfw.ContentProvider;
import com.sympedia.genfw.GenApp;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.Input;
import com.sympedia.genfw.RuleSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.Collection;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.InputImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.InputImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.InputImpl#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.InputImpl#getContentProvider <em>Content Provider</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.InputImpl#getRuleSets <em>Rule Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputImpl extends LifeCycleImpl implements Input
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
   * The default value of the '{@link #getFullPath() <em>Full Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullPath()
   * @generated
   * @ordered
   */
  protected static final String FULL_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFullPath() <em>Full Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFullPath()
   * @generated
   * @ordered
   */
  protected String fullPath = FULL_PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getContentProvider() <em>Content Provider</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContentProvider()
   * @generated
   * @ordered
   */
  protected ContentProvider contentProvider = null;

  /**
   * The cached value of the '{@link #getRuleSets() <em>Rule Sets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleSets()
   * @generated
   * @ordered
   */
  protected EList ruleSets = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputImpl()
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
    return GenfwPackage.Literals.INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProvider getContentProvider()
  {
    if (contentProvider != null && contentProvider.eIsProxy())
    {
      InternalEObject oldContentProvider = (InternalEObject)contentProvider;
      contentProvider = (ContentProvider)eResolveProxy(oldContentProvider);
      if (contentProvider != oldContentProvider)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                  GenfwPackage.INPUT__CONTENT_PROVIDER, oldContentProvider, contentProvider));
      }
    }
    return contentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContentProvider basicGetContentProvider()
  {
    return contentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContentProvider(ContentProvider newContentProvider)
  {
    ContentProvider oldContentProvider = contentProvider;
    contentProvider = newContentProvider;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.INPUT__CONTENT_PROVIDER,
              oldContentProvider, contentProvider));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getRuleSets()
  {
    if (ruleSets == null)
    {
      ruleSets = new EObjectResolvingEList(RuleSet.class, this, GenfwPackage.INPUT__RULE_SETS);
    }
    return ruleSets;
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
    case GenfwPackage.INPUT__ROOT:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, GenfwPackage.INPUT__ROOT, msgs);
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
    case GenfwPackage.INPUT__ROOT:
      return eBasicSetContainer(null, GenfwPackage.INPUT__ROOT, msgs);
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
    case GenfwPackage.INPUT__ROOT:
      return eInternalContainer().eInverseRemove(this, GenfwPackage.GEN_APP__INPUTS, GenApp.class,
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
    case GenfwPackage.INPUT__ROOT:
      return getRoot();
    case GenfwPackage.INPUT__LABEL:
      return getLabel();
    case GenfwPackage.INPUT__FULL_PATH:
      return getFullPath();
    case GenfwPackage.INPUT__CONTENT_PROVIDER:
      if (resolve) return getContentProvider();
      return basicGetContentProvider();
    case GenfwPackage.INPUT__RULE_SETS:
      return getRuleSets();
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
    case GenfwPackage.INPUT__ROOT:
      setRoot((GenApp)newValue);
      return;
    case GenfwPackage.INPUT__FULL_PATH:
      setFullPath((String)newValue);
      return;
    case GenfwPackage.INPUT__CONTENT_PROVIDER:
      setContentProvider((ContentProvider)newValue);
      return;
    case GenfwPackage.INPUT__RULE_SETS:
      getRuleSets().clear();
      getRuleSets().addAll((Collection)newValue);
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
    case GenfwPackage.INPUT__ROOT:
      setRoot((GenApp)null);
      return;
    case GenfwPackage.INPUT__FULL_PATH:
      setFullPath(FULL_PATH_EDEFAULT);
      return;
    case GenfwPackage.INPUT__CONTENT_PROVIDER:
      setContentProvider((ContentProvider)null);
      return;
    case GenfwPackage.INPUT__RULE_SETS:
      getRuleSets().clear();
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
    case GenfwPackage.INPUT__ROOT:
      return getRoot() != null;
    case GenfwPackage.INPUT__LABEL:
      return LABEL_EDEFAULT == null ? getLabel() != null : !LABEL_EDEFAULT.equals(getLabel());
    case GenfwPackage.INPUT__FULL_PATH:
      return FULL_PATH_EDEFAULT == null ? fullPath != null : !FULL_PATH_EDEFAULT.equals(fullPath);
    case GenfwPackage.INPUT__CONTENT_PROVIDER:
      return contentProvider != null;
    case GenfwPackage.INPUT__RULE_SETS:
      return ruleSets != null && !ruleSets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenApp getRoot()
  {
    if (eContainerFeatureID != GenfwPackage.INPUT__ROOT) return null;
    return (GenApp)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRoot(GenApp newRoot)
  {
    if (newRoot != eInternalContainer()
            || (eContainerFeatureID != GenfwPackage.INPUT__ROOT && newRoot != null))
    {
      if (EcoreUtil.isAncestor(this, newRoot))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newRoot != null)
        msgs = ((InternalEObject)newRoot).eInverseAdd(this, GenfwPackage.GEN_APP__INPUTS,
                GenApp.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newRoot, GenfwPackage.INPUT__ROOT, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.INPUT__ROOT, newRoot,
              newRoot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getLabel()
  {
    StringBuffer buffer = new StringBuffer();
    for (Iterator it = getRuleSets().iterator(); it.hasNext();)
    {
      RuleSet ruleSet = (RuleSet)it.next();
      buffer.append(ruleSet.getName());
      if (it.hasNext()) buffer.append(", ");
    }

    return getFullPath() + (buffer.length() == 0 ? "" : " -> " + buffer.toString());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFullPath()
  {
    return fullPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFullPath(String newFullPath)
  {
    String oldFullPath = fullPath;
    fullPath = newFullPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.INPUT__FULL_PATH,
              oldFullPath, fullPath));
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
    result.append(" (fullPath: ");
    result.append(fullPath);
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
    getContentProvider().initialize(getRuntimeGenApp());
    for (Iterator it = getRuleSets().iterator(); it.hasNext();)
    {
      RuleSet ruleSet = (RuleSet)it.next();
      ruleSet.initialize(getRuntimeGenApp());
    }
  }

  /**
   * @ADDED
   */
  @Override
  protected void doDispose() throws Exception
  {
    getContentProvider().dispose(getRuntimeGenApp());
    for (Iterator it = getRuleSets().iterator(); it.hasNext();)
    {
      RuleSet ruleSet = (RuleSet)it.next();
      ruleSet.dispose(getRuntimeGenApp());
    }

    super.doDispose();
  }
} //InputImpl

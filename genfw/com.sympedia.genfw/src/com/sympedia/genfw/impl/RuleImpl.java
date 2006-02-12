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
import com.sympedia.genfw.Rule;
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
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.RuleImpl#getRuleSet <em>Rule Set</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleImpl#getPrerequisites <em>Prerequisites</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleImpl#getGenerator <em>Generator</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleImpl#getMatchClassName <em>Match Class Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleImpl#isDontOverwrite <em>Dont Overwrite</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.RuleImpl#isDeactivate <em>Deactivate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RuleImpl extends LifeCycleImpl implements Rule
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
   * The cached value of the '{@link #getPrerequisites() <em>Prerequisites</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrerequisites()
   * @generated
   * @ordered
   */
  protected EList prerequisites = null;

  /**
   * The cached value of the '{@link #getGenerator() <em>Generator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerator()
   * @generated
   * @ordered
   */
  protected Generator generator = null;

  /**
   * The default value of the '{@link #getMatchClassName() <em>Match Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchClassName()
   * @generated
   * @ordered
   */
  protected static final String MATCH_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMatchClassName() <em>Match Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMatchClassName()
   * @generated
   * @ordered
   */
  protected String matchClassName = MATCH_CLASS_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isDontOverwrite() <em>Dont Overwrite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDontOverwrite()
   * @generated
   * @ordered
   */
  protected static final boolean DONT_OVERWRITE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDontOverwrite() <em>Dont Overwrite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDontOverwrite()
   * @generated
   * @ordered
   */
  protected boolean dontOverwrite = DONT_OVERWRITE_EDEFAULT;

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
  protected RuleImpl()
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
    return GenfwPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleSet getRuleSet()
  {
    if (eContainerFeatureID != GenfwPackage.RULE__RULE_SET) return null;
    return (RuleSet)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRuleSet(RuleSet newRuleSet)
  {
    if (newRuleSet != eInternalContainer()
            || (eContainerFeatureID != GenfwPackage.RULE__RULE_SET && newRuleSet != null))
    {
      if (EcoreUtil.isAncestor(this, newRuleSet))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      if (newRuleSet != null)
        msgs = ((InternalEObject)newRuleSet).eInverseAdd(this, GenfwPackage.RULE_SET__RULES,
                RuleSet.class, msgs);
      msgs = eBasicSetContainer((InternalEObject)newRuleSet, GenfwPackage.RULE__RULE_SET, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE__RULE_SET,
              newRuleSet, newRuleSet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getPrerequisites()
  {
    if (prerequisites == null)
    {
      prerequisites = new EObjectResolvingEList(Rule.class, this, GenfwPackage.RULE__PREREQUISITES);
    }
    return prerequisites;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator getGenerator()
  {
    if (generator != null && generator.eIsProxy())
    {
      InternalEObject oldGenerator = (InternalEObject)generator;
      generator = (Generator)eResolveProxy(oldGenerator);
      if (generator != oldGenerator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenfwPackage.RULE__GENERATOR,
                  oldGenerator, generator));
      }
    }
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generator basicGetGenerator()
  {
    return generator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenerator(Generator newGenerator)
  {
    Generator oldGenerator = generator;
    generator = newGenerator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE__GENERATOR,
              oldGenerator, generator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMatchClassName()
  {
    return matchClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMatchClassName(String newMatchClassName)
  {
    String oldMatchClassName = matchClassName;
    matchClassName = newMatchClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE__MATCH_CLASS_NAME,
              oldMatchClassName, matchClassName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDontOverwrite()
  {
    return dontOverwrite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDontOverwrite(boolean newDontOverwrite)
  {
    boolean oldDontOverwrite = dontOverwrite;
    dontOverwrite = newDontOverwrite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE__DONT_OVERWRITE,
              oldDontOverwrite, dontOverwrite));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.RULE__DEACTIVATE,
              oldDeactivate, deactivate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public boolean isMatching(Object inputObject) throws Exception
  {
    String className = getMatchClassName();
    if (className != null && className.length() != 0)
    {
      if (!className.equals(inputObject.getClass().getName()))
      {
        return false;
      }
    }

    if (!evaluateMatch(inputObject))
    {
      return false;
    }

    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public abstract String getTargetPath(Object inputObject) throws Exception;

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
    case GenfwPackage.RULE__RULE_SET:
      if (eInternalContainer() != null) msgs = eBasicRemoveFromContainer(msgs);
      return eBasicSetContainer(otherEnd, GenfwPackage.RULE__RULE_SET, msgs);
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
    case GenfwPackage.RULE__RULE_SET:
      return eBasicSetContainer(null, GenfwPackage.RULE__RULE_SET, msgs);
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
    case GenfwPackage.RULE__RULE_SET:
      return eInternalContainer().eInverseRemove(this, GenfwPackage.RULE_SET__RULES, RuleSet.class,
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
    case GenfwPackage.RULE__RULE_SET:
      return getRuleSet();
    case GenfwPackage.RULE__NAME:
      return getName();
    case GenfwPackage.RULE__PREREQUISITES:
      return getPrerequisites();
    case GenfwPackage.RULE__GENERATOR:
      if (resolve) return getGenerator();
      return basicGetGenerator();
    case GenfwPackage.RULE__MATCH_CLASS_NAME:
      return getMatchClassName();
    case GenfwPackage.RULE__DONT_OVERWRITE:
      return isDontOverwrite() ? Boolean.TRUE : Boolean.FALSE;
    case GenfwPackage.RULE__DEACTIVATE:
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
    case GenfwPackage.RULE__RULE_SET:
      setRuleSet((RuleSet)newValue);
      return;
    case GenfwPackage.RULE__NAME:
      setName((String)newValue);
      return;
    case GenfwPackage.RULE__PREREQUISITES:
      getPrerequisites().clear();
      getPrerequisites().addAll((Collection)newValue);
      return;
    case GenfwPackage.RULE__GENERATOR:
      setGenerator((Generator)newValue);
      return;
    case GenfwPackage.RULE__MATCH_CLASS_NAME:
      setMatchClassName((String)newValue);
      return;
    case GenfwPackage.RULE__DONT_OVERWRITE:
      setDontOverwrite(((Boolean)newValue).booleanValue());
      return;
    case GenfwPackage.RULE__DEACTIVATE:
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
    case GenfwPackage.RULE__RULE_SET:
      setRuleSet((RuleSet)null);
      return;
    case GenfwPackage.RULE__NAME:
      setName(NAME_EDEFAULT);
      return;
    case GenfwPackage.RULE__PREREQUISITES:
      getPrerequisites().clear();
      return;
    case GenfwPackage.RULE__GENERATOR:
      setGenerator((Generator)null);
      return;
    case GenfwPackage.RULE__MATCH_CLASS_NAME:
      setMatchClassName(MATCH_CLASS_NAME_EDEFAULT);
      return;
    case GenfwPackage.RULE__DONT_OVERWRITE:
      setDontOverwrite(DONT_OVERWRITE_EDEFAULT);
      return;
    case GenfwPackage.RULE__DEACTIVATE:
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
    case GenfwPackage.RULE__RULE_SET:
      return getRuleSet() != null;
    case GenfwPackage.RULE__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case GenfwPackage.RULE__PREREQUISITES:
      return prerequisites != null && !prerequisites.isEmpty();
    case GenfwPackage.RULE__GENERATOR:
      return generator != null;
    case GenfwPackage.RULE__MATCH_CLASS_NAME:
      return MATCH_CLASS_NAME_EDEFAULT == null ? matchClassName != null
              : !MATCH_CLASS_NAME_EDEFAULT.equals(matchClassName);
    case GenfwPackage.RULE__DONT_OVERWRITE:
      return dontOverwrite != DONT_OVERWRITE_EDEFAULT;
    case GenfwPackage.RULE__DEACTIVATE:
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
    result.append(", matchClassName: ");
    result.append(matchClassName);
    result.append(", dontOverwrite: ");
    result.append(dontOverwrite);
    result.append(", deactivate: ");
    result.append(deactivate);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  protected abstract boolean evaluateMatch(Object inputObject) throws Exception;

  /**
   * @ADDED
   */
  @Override
  protected void doInitialize() throws Exception
  {
    super.doInitialize();
    getGenerator().initialize(getContext());
    for (Iterator it = getPrerequisites().iterator(); it.hasNext();)
    {
      Rule rule = (Rule)it.next();
      rule.initialize(getContext());
    }
  }

  /**
   * @ADDED
   */
  @Override
  protected void doDispose() throws Exception
  {
    getGenerator().dispose();
    for (Iterator it = getPrerequisites().iterator(); it.hasNext();)
    {
      Rule rule = (Rule)it.next();
      rule.dispose();
    }

    super.doDispose();
  }

  /**
   * @ADDED
   */
  @Override
  public GenLib getRoot()
  {
    return getRuleSet().getRoot();
  }
} //RuleImpl

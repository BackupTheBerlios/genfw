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
package com.sympedia.genfw.jet.impl;


import com.sympedia.genfw.impl.GeneratorImpl;
import com.sympedia.genfw.jet.JetPackage;
import com.sympedia.genfw.jet.JetTemplate;
import com.sympedia.genfw.jet.internal.Activator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jet.impl.JetTemplateImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JetTemplateImpl extends GeneratorImpl implements JetTemplate
{
  /**
   * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected String className = CLASS_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JetTemplateImpl()
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
    return JetPackage.Literals.JET_TEMPLATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(String newClassName)
  {
    String oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JetPackage.JET_TEMPLATE__CLASS_NAME,
              oldClassName, className));
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
    case JetPackage.JET_TEMPLATE__CLASS_NAME:
      return getClassName();
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
    case JetPackage.JET_TEMPLATE__CLASS_NAME:
      setClassName((String)newValue);
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
    case JetPackage.JET_TEMPLATE__CLASS_NAME:
      setClassName(CLASS_NAME_EDEFAULT);
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
    case JetPackage.JET_TEMPLATE__CLASS_NAME:
      return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT
              .equals(className);
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
    result.append(" (className: ");
    result.append(className);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public String generate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws CoreException
  {
    ClassLoader inputClassLoader = inputObject.getClass().getClassLoader();
    ClassLoader parentClassLoader = getRoot().getClassLoader(inputClassLoader);
    Class template = getTemplate(parentClassLoader);
    if (template == null)
    {
      throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR,
              "Template not found for " + this, null));
    }

    String result = callTemplate(template, inputObject);
    return result;
  }

  /**
   * @ADDED
   */
  public Class getTemplate(ClassLoader classLoader)
  {
    Class result = null;
    String className = getClassName();

    try
    {
      result = Class.forName(className, true, classLoader);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }

    return result;
  }

  /**
   * @ADDED
   */
  protected String callTemplate(Class templateClass, Object inputObject)
  {
    if (templateClass == null)
    {
      return "No template class";
    }

    try
    {
      Method method = templateClass.getMethod("generate", new Class[] {Object.class});
      if (method == null || method.getReturnType() != String.class)
      {
        return "Invalid template class: " + templateClass.getName();
      }

      Object template = templateClass.newInstance();
      Object result = method.invoke(template, new Object[] {inputObject});
      return (String)result;
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      ByteArrayOutputStream stream = new ByteArrayOutputStream();
      PrintStream printer = new PrintStream(stream);
      ex.printStackTrace(printer);
      return stream.toString();
    }
  }
} //JetTemplateImpl

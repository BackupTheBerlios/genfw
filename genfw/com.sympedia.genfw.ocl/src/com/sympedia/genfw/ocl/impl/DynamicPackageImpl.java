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
package com.sympedia.genfw.ocl.impl;


import com.sympedia.genfw.ocl.DynamicPackage;
import com.sympedia.genfw.ocl.OclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.ocl.impl.DynamicPackageImpl#getEcoreFile <em>Ecore File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicPackageImpl extends PackageConfigurationImpl implements DynamicPackage
{
  /**
   * The default value of the '{@link #getEcoreFile() <em>Ecore File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreFile()
   * @generated
   * @ordered
   */
  protected static final String ECORE_FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEcoreFile() <em>Ecore File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcoreFile()
   * @generated
   * @ordered
   */
  protected String ecoreFile = ECORE_FILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicPackageImpl()
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
    return OclPackage.Literals.DYNAMIC_PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEcoreFile()
  {
    return ecoreFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcoreFile(String newEcoreFile)
  {
    String oldEcoreFile = ecoreFile;
    ecoreFile = newEcoreFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OclPackage.DYNAMIC_PACKAGE__ECORE_FILE,
              oldEcoreFile, ecoreFile));
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
    case OclPackage.DYNAMIC_PACKAGE__ECORE_FILE:
      return getEcoreFile();
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
    case OclPackage.DYNAMIC_PACKAGE__ECORE_FILE:
      setEcoreFile((String)newValue);
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
    case OclPackage.DYNAMIC_PACKAGE__ECORE_FILE:
      setEcoreFile(ECORE_FILE_EDEFAULT);
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
    case OclPackage.DYNAMIC_PACKAGE__ECORE_FILE:
      return ECORE_FILE_EDEFAULT == null ? ecoreFile != null : !ECORE_FILE_EDEFAULT
              .equals(ecoreFile);
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
    result.append(" (ecoreFile: ");
    result.append(ecoreFile);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public EPackage getPackage() throws Exception
  {
    throw new UnsupportedOperationException();

    //    String path = getEcoreFile();
    //    if (path == null || path.length() == 0) return null;
    //
    //    GenLib genlib = getOclRule().getRuleSet().getRoot();
    //    ClassLoader classLoader = genlib.getClassLoader(OclActivator.class.getClassLoader());
    //    InputStream stream = classLoader.getResourceAsStream(path);
    //
    //    ...
    //    
    //    return null;
  }
} //DynamicPackageImpl

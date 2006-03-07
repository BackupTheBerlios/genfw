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


import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.Line;
import com.sympedia.genfw.StaticFileInitializer;
import com.sympedia.util.IOHelper;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static File Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.StaticFileInitializerImpl#getFileURL <em>File URL</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.StaticFileInitializerImpl#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticFileInitializerImpl extends GeneratorImpl implements StaticFileInitializer
{
  /**
   * The default value of the '{@link #getFileURL() <em>File URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileURL()
   * @generated
   * @ordered
   */
  protected static final String FILE_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFileURL() <em>File URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileURL()
   * @generated
   * @ordered
   */
  protected String fileURL = FILE_URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected EList lines = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaticFileInitializerImpl()
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
    return GenfwPackage.Literals.STATIC_FILE_INITIALIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFileURL()
  {
    return fileURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileURL(String newFileURL)
  {
    String oldFileURL = fileURL;
    fileURL = newFileURL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.STATIC_FILE_INITIALIZER__FILE_URL, oldFileURL, fileURL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getLines()
  {
    if (lines == null)
    {
      lines = new EObjectContainmentWithInverseEList(Line.class, this,
              GenfwPackage.STATIC_FILE_INITIALIZER__LINES,
              GenfwPackage.LINE__STATIC_FILE_INITIALIZER);
    }
    return lines;
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
    case GenfwPackage.STATIC_FILE_INITIALIZER__LINES:
      return ((InternalEList)getLines()).basicAdd(otherEnd, msgs);
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
    case GenfwPackage.STATIC_FILE_INITIALIZER__LINES:
      return ((InternalEList)getLines()).basicRemove(otherEnd, msgs);
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
    case GenfwPackage.STATIC_FILE_INITIALIZER__FILE_URL:
      return getFileURL();
    case GenfwPackage.STATIC_FILE_INITIALIZER__LINES:
      return getLines();
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
    case GenfwPackage.STATIC_FILE_INITIALIZER__FILE_URL:
      setFileURL((String)newValue);
      return;
    case GenfwPackage.STATIC_FILE_INITIALIZER__LINES:
      getLines().clear();
      getLines().addAll((Collection)newValue);
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
    case GenfwPackage.STATIC_FILE_INITIALIZER__FILE_URL:
      setFileURL(FILE_URL_EDEFAULT);
      return;
    case GenfwPackage.STATIC_FILE_INITIALIZER__LINES:
      getLines().clear();
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
    case GenfwPackage.STATIC_FILE_INITIALIZER__FILE_URL:
      return FILE_URL_EDEFAULT == null ? fileURL != null : !FILE_URL_EDEFAULT.equals(fileURL);
    case GenfwPackage.STATIC_FILE_INITIALIZER__LINES:
      return lines != null && !lines.isEmpty();
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
    result.append(" (fileURL: ");
    result.append(fileURL);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public byte[] doGenerate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    if (targetPath == null || targetPath.length() == 0) return null;
    ByteArrayOutputStream stream = new ByteArrayOutputStream();

    String urlStr = getFileURL();
    URL url = urlStr != null && urlStr.length() != 0 ? new URL(urlStr) : extractURL(inputObject);
    if (url != null)
    {
      // TODO add input path to context
      InputStream inputStream = url.openStream();
      if (stream != null)
      {
        IOHelper.copy(inputStream, stream);
      }
    }

    if (!getLines().isEmpty())
    {
      PrintStream printer = new PrintStream(stream);
      for (Iterator it = getLines().iterator(); it.hasNext();)
      {
        Line line = (Line)it.next();
        String content = line.getContent();
        if (content != null) printer.println(content);
      }

      printer.flush();
    }

    return stream.toByteArray();
  }
} //StaticFileInitializerImpl

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
package com.sympedia.genfw.jdt.impl;


import com.sympedia.genfw.Generator;
import com.sympedia.genfw.impl.DelegatingGeneratorImpl;
import com.sympedia.genfw.jdt.JavaFormatter;
import com.sympedia.genfw.jdt.JdtPackage;
import com.sympedia.genfw.jdt.internal.JdtActivator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.core.ToolFactory;
import org.eclipse.jdt.core.formatter.CodeFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Formatter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jdt.impl.JavaFormatterImpl#getProfileFile <em>Profile File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaFormatterImpl extends DelegatingGeneratorImpl implements JavaFormatter
{
  /**
   * The default value of the '{@link #getProfileFile() <em>Profile File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfileFile()
   * @generated
   * @ordered
   */
  protected static final String PROFILE_FILE_EDEFAULT = "default";

  /**
   * The cached value of the '{@link #getProfileFile() <em>Profile File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfileFile()
   * @generated
   * @ordered
   */
  protected String profileFile = PROFILE_FILE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JavaFormatterImpl()
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
    return JdtPackage.Literals.JAVA_FORMATTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProfileFile()
  {
    return profileFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProfileFile(String newProfileFile)
  {
    String oldProfileFile = profileFile;
    profileFile = newProfileFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              JdtPackage.JAVA_FORMATTER__PROFILE_FILE, oldProfileFile, profileFile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String generate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws CoreException
  {
    Generator delegate = getDelegate();
    if (delegate == null) return null;

    String result = delegate.generate(inputObject, targetPath, monitor);
    if (result == null) return null;

    String profileFile = getProfileFile();
    if (profileFile != null)
    {
      if (profileFile.length() == 0 || profileFile.equals("default"))
      {
        profileFile = null;
      }
    }

    Map options = null;
    if (profileFile != null)
    {
      //    options = CodeFormatterProfileParser.parse(profileName);
      //      if (options == null)
      //      {
      //        throw new CoreException(new Status(IStatus.ERROR, JdtActivator.getPlugin()
      //                .getBundle().getSymbolicName(), 0, "Unable to read profile file: '" + profileFile
      //                + "'", null));
      //      }
    }

    CodeFormatter codeFormatter = ToolFactory.createCodeFormatter(options);
    result = formatCode(result, codeFormatter);
    return result;
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
    case JdtPackage.JAVA_FORMATTER__PROFILE_FILE:
      return getProfileFile();
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
    case JdtPackage.JAVA_FORMATTER__PROFILE_FILE:
      setProfileFile((String)newValue);
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
    case JdtPackage.JAVA_FORMATTER__PROFILE_FILE:
      setProfileFile(PROFILE_FILE_EDEFAULT);
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
    case JdtPackage.JAVA_FORMATTER__PROFILE_FILE:
      return PROFILE_FILE_EDEFAULT == null ? profileFile != null : !PROFILE_FILE_EDEFAULT
              .equals(profileFile);
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
    result.append(" (profileFile: ");
    result.append(profileFile);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  public static String formatCode(String contents, CodeFormatter codeFormatter)
  {
    IDocument doc = new Document(contents);
    TextEdit edit = codeFormatter.format(CodeFormatter.K_COMPILATION_UNIT, doc.get(), 0, doc.get()
            .length(), 0, null);

    try
    {
      edit.apply(doc);
      contents = doc.get();
    }
    catch (Exception exception)
    {
      JdtActivator.INSTANCE.log(exception);
    }

    return contents;
  }
} //JavaFormatterImpl

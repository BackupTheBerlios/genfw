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
package com.sympedia.genfw.jmerge.impl;


import com.sympedia.genfw.impl.DelegatingGeneratorImpl;

import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.Generator;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.jmerge.JmergeGenerator;
import com.sympedia.genfw.jmerge.JmergePackage;
import com.sympedia.genfw.jmerge.internal.JmergeActivator;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.CodeGenPlugin;
import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.jdom.JDOMFacadeHelper;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jmerge.impl.JmergeGeneratorImpl#getMergeXmlUri <em>Merge Xml Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JmergeGeneratorImpl extends DelegatingGeneratorImpl implements JmergeGenerator
{
  public static final String EMF_MERGE_XML_URI = "platform:/plugin/" + CodeGenPlugin.ID
          + ".ecore/templates/emf-merge.xml";

  /**
   * The default value of the '{@link #getMergeXmlUri() <em>Merge Xml Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMergeXmlUri()
   * @generated
   * @ordered
   */
  protected static final String MERGE_XML_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMergeXmlUri() <em>Merge Xml Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMergeXmlUri()
   * @generated
   * @ordered
   */
  protected String mergeXmlUri = MERGE_XML_URI_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JmergeGeneratorImpl()
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
    return JmergePackage.Literals.JMERGE_GENERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   //   * <!-- end-user-doc -->
   * @generated
   */
  public String getMergeXmlUri()
  {
    return mergeXmlUri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMergeXmlUri(String newMergeXmlUri)
  {
    String oldMergeXmlUri = mergeXmlUri;
    mergeXmlUri = newMergeXmlUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              JmergePackage.JMERGE_GENERATOR__MERGE_XML_URI, oldMergeXmlUri, mergeXmlUri));
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

    try
    {
      File existingFile = ResourcesHelper.ROOT.getLocation().append(targetPath).toFile();
      if (!existingFile.exists()) return result;
      InputStream existingContent = new FileInputStream(existingFile);

      JMerger merger = getJMerger();
      merger.setSourceCompilationUnit(merger.createCompilationUnitForContents(result));
      merger.setTargetCompilationUnit(merger.createCompilationUnitForInputStream(existingContent));
      merger.merge();
      return merger.getTargetCompilationUnit().getContents();
    }
    catch (CoreException ex)
    {
      throw ex;
    }
    catch (Exception ex)
    {
      throw new CoreException(new Status(IStatus.ERROR, JmergeActivator.PLUGIN_ID, IStatus.ERROR,
              "Problem while merging: " + targetPath, ex));
    }
  }

  /**
   * @ADDED
   */
  protected JMerger getJMerger() throws CoreException
  {
    String uri = getMergeXmlUri();
    if (uri == null || uri.length() == 0)
    {
      try
      {
        uri = Platform.asLocalURL(new URL(EMF_MERGE_XML_URI)).toString();
      }
      catch (Exception ex)
      {
        throw new CoreException(new Status(IStatus.ERROR, JmergeActivator.PLUGIN_ID, IStatus.ERROR,
                "Malformed URI: " + uri, ex));
      }
    }

    JControlModel controlModel = new JControlModel();
    controlModel.initialize(new JDOMFacadeHelper(), uri);
    return new JMerger(controlModel);
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
    case JmergePackage.JMERGE_GENERATOR__MERGE_XML_URI:
      return getMergeXmlUri();
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
    case JmergePackage.JMERGE_GENERATOR__MERGE_XML_URI:
      setMergeXmlUri((String)newValue);
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
    case JmergePackage.JMERGE_GENERATOR__MERGE_XML_URI:
      setMergeXmlUri(MERGE_XML_URI_EDEFAULT);
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
    case JmergePackage.JMERGE_GENERATOR__MERGE_XML_URI:
      return MERGE_XML_URI_EDEFAULT == null ? mergeXmlUri != null : !MERGE_XML_URI_EDEFAULT
              .equals(mergeXmlUri);
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
    result.append(" (mergeXmlUri: ");
    result.append(mergeXmlUri);
    result.append(')');
    return result.toString();
  }

} //JmergeGeneratorImpl

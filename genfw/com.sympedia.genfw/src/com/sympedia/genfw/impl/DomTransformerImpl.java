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


import com.sympedia.genfw.DomTransformation;
import com.sympedia.genfw.DomTransformer;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSParser;
import org.w3c.dom.ls.LSSerializer;

import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Iterator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dom Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getTransformations <em>Transformations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomTransformerImpl extends GeneratorImpl implements DomTransformer
{
  /**
   * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransformations()
   * @generated
   * @ordered
   */
  protected EList transformations = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomTransformerImpl()
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
    return GenfwPackage.Literals.DOM_TRANSFORMER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList getTransformations()
  {
    if (transformations == null)
    {
      transformations = new EObjectContainmentWithInverseEList(DomTransformation.class, this,
              GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS,
              GenfwPackage.DOM_TRANSFORMATION__TRANSFORMER);
    }
    return transformations;
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
    case GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS:
      return ((InternalEList)getTransformations()).basicAdd(otherEnd, msgs);
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
    case GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS:
      return ((InternalEList)getTransformations()).basicRemove(otherEnd, msgs);
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
    case GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS:
      return getTransformations();
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
    case GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS:
      getTransformations().clear();
      getTransformations().addAll((Collection)newValue);
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
    case GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS:
      getTransformations().clear();
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
    case GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS:
      return transformations != null && !transformations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  @Override
  public String generate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    Document document = getXmlDocument(targetPath);
    DOMConfiguration config = document.getDomConfig();
    config.setParameter("element-content-whitespace", Boolean.TRUE);
    config.setParameter("cdata-sections", Boolean.TRUE);
    config.setParameter("comments", Boolean.TRUE);
    config.setParameter("entities", Boolean.TRUE);

    boolean touchedAtAll = false;
    boolean modified;

    do
    {
      modified = false;
      for (Iterator it = getTransformations().iterator(); it.hasNext();)
      {
        DomTransformation xform = (DomTransformation)it.next();
        if (xform.transform(inputObject, document, monitor))
        {
          touchedAtAll = true;
          modified = true;
        }
      }
    } while (modified);

    if (!touchedAtAll) return null;

    document.normalizeDocument();
    DOMImplementationLS impl = getDOMImplementationLS();

    LSSerializer writer = impl.createLSSerializer();
    config = writer.getDomConfig();
    config.setParameter("element-content-whitespace", Boolean.TRUE);
    config.setParameter("cdata-sections", Boolean.TRUE);
    config.setParameter("comments", Boolean.TRUE);
    config.setParameter("entities", Boolean.TRUE);

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    LSOutput output = impl.createLSOutput();
    output.setEncoding("UTF-8"); // TODO Fetch encoding from input file, if possible
    output.setByteStream(outputStream);
    writer.write(document, output);
    return outputStream.toString();
  }

  /**
   * @ADDED
   */
  private Document getXmlDocument(String targetPath) throws InstantiationException,
          IllegalAccessException, CoreException, ClassNotFoundException
  {
    if (targetPath == null || targetPath.length() == 0)
    {
      throw new IllegalArgumentException("Target path not specified");
    }

    Path path = new Path(targetPath);

    IResource resource = ResourcesHelper.ROOT.findMember(path);
    if (resource != null && resource.exists())
    {
      if (resource instanceof IFile)
      {
        IFile file = (IFile)resource;
        DOMImplementationLS impl = getDOMImplementationLS();
        LSInput input = impl.createLSInput();
        input.setByteStream(file.getContents());
        LSParser builder = impl.createLSParser(DOMImplementationLS.MODE_SYNCHRONOUS, null);
        DOMConfiguration config = builder.getDomConfig();
        config.setParameter("element-content-whitespace", Boolean.TRUE);
        config.setParameter("cdata-sections", Boolean.TRUE);
        config.setParameter("comments", Boolean.TRUE);
        config.setParameter("entities", Boolean.TRUE);
        return builder.parse(input);
      }
      else
      {
        throw new IllegalArgumentException("Target path is not a file");
      }
    }

    DOMImplementation impl = getDOMImplementation();
    return impl.createDocument(null, null, null);
  }

  /**
   * @ADDED
   */
  private DOMImplementationLS getDOMImplementationLS() throws ClassNotFoundException,
          InstantiationException, IllegalAccessException
  {
    DOMImplementationRegistry registry = getDOMImplementationRegistry();
    return (DOMImplementationLS)registry.getDOMImplementation("LS");
  }

  /**
   * @ADDED
   */
  private DOMImplementation getDOMImplementation() throws InstantiationException,
          IllegalAccessException, ClassNotFoundException
  {
    DOMImplementationRegistry registry = getDOMImplementationRegistry();
    return (DOMImplementation)registry.getDOMImplementation("XML");
  }

  /**
   * @ADDED
   */
  private DOMImplementationRegistry getDOMImplementationRegistry() throws ClassNotFoundException,
          InstantiationException, IllegalAccessException
  {
    System.setProperty(DOMImplementationRegistry.PROPERTY,
            "org.apache.xerces.dom.DOMXSImplementationSourceImpl");
    return DOMImplementationRegistry.newInstance();
  }
} //DomTransformerImpl

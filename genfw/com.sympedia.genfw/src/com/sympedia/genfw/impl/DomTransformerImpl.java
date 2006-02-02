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

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSParser;

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
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#isForceEncoding <em>Force Encoding</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getPublicID <em>Public ID</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getSystemID <em>System ID</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#isForceDocType <em>Force Doc Type</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getIndent <em>Indent</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#isIndenting <em>Indenting</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#getLineSeparator <em>Line Separator</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#isPreserveEmptyAttributes <em>Preserve Empty Attributes</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#isPreserveSpace <em>Preserve Space</em>}</li>
 *   <li>{@link com.sympedia.genfw.impl.DomTransformerImpl#isForceFormatting <em>Force Formatting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomTransformerImpl extends GeneratorImpl implements DomTransformer
{
  private static final String NEWLY_CREATED = "__NEWLY_CREATED__";

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
   * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncoding()
   * @generated
   * @ordered
   */
  protected static final String ENCODING_EDEFAULT = "UTF-8";

  /**
   * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEncoding()
   * @generated
   * @ordered
   */
  protected String encoding = ENCODING_EDEFAULT;

  /**
   * The default value of the '{@link #isForceEncoding() <em>Force Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForceEncoding()
   * @generated
   * @ordered
   */
  protected static final boolean FORCE_ENCODING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForceEncoding() <em>Force Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForceEncoding()
   * @generated
   * @ordered
   */
  protected boolean forceEncoding = FORCE_ENCODING_EDEFAULT;

  /**
   * The default value of the '{@link #getNamespaceURI() <em>Namespace URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaceURI()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespaceURI() <em>Namespace URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaceURI()
   * @generated
   * @ordered
   */
  protected String namespaceURI = NAMESPACE_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_NAME_EDEFAULT = "xml";

  /**
   * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPublicID() <em>Public ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublicID()
   * @generated
   * @ordered
   */
  protected static final String PUBLIC_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPublicID() <em>Public ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublicID()
   * @generated
   * @ordered
   */
  protected String publicID = PUBLIC_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemID()
   * @generated
   * @ordered
   */
  protected static final String SYSTEM_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSystemID() <em>System ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemID()
   * @generated
   * @ordered
   */
  protected String systemID = SYSTEM_ID_EDEFAULT;

  /**
   * The default value of the '{@link #isForceDocType() <em>Force Doc Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForceDocType()
   * @generated
   * @ordered
   */
  protected static final boolean FORCE_DOC_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isForceDocType() <em>Force Doc Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForceDocType()
   * @generated
   * @ordered
   */
  protected boolean forceDocType = FORCE_DOC_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getIndent() <em>Indent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndent()
   * @generated
   * @ordered
   */
  protected static final int INDENT_EDEFAULT = 2;

  /**
   * The cached value of the '{@link #getIndent() <em>Indent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndent()
   * @generated
   * @ordered
   */
  protected int indent = INDENT_EDEFAULT;

  /**
   * The default value of the '{@link #isIndenting() <em>Indenting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIndenting()
   * @generated
   * @ordered
   */
  protected static final boolean INDENTING_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isIndenting() <em>Indenting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIndenting()
   * @generated
   * @ordered
   */
  protected boolean indenting = INDENTING_EDEFAULT;

  /**
   * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineWidth()
   * @generated
   * @ordered
   */
  protected static final int LINE_WIDTH_EDEFAULT = 80;

  /**
   * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineWidth()
   * @generated
   * @ordered
   */
  protected int lineWidth = LINE_WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getLineSeparator() <em>Line Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineSeparator()
   * @generated
   * @ordered
   */
  protected static final String LINE_SEPARATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLineSeparator() <em>Line Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineSeparator()
   * @generated
   * @ordered
   */
  protected String lineSeparator = LINE_SEPARATOR_EDEFAULT;

  /**
   * The default value of the '{@link #isPreserveEmptyAttributes() <em>Preserve Empty Attributes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPreserveEmptyAttributes()
   * @generated
   * @ordered
   */
  protected static final boolean PRESERVE_EMPTY_ATTRIBUTES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPreserveEmptyAttributes() <em>Preserve Empty Attributes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPreserveEmptyAttributes()
   * @generated
   * @ordered
   */
  protected boolean preserveEmptyAttributes = PRESERVE_EMPTY_ATTRIBUTES_EDEFAULT;

  /**
   * The default value of the '{@link #isPreserveSpace() <em>Preserve Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPreserveSpace()
   * @generated
   * @ordered
   */
  protected static final boolean PRESERVE_SPACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPreserveSpace() <em>Preserve Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPreserveSpace()
   * @generated
   * @ordered
   */
  protected boolean preserveSpace = PRESERVE_SPACE_EDEFAULT;

  /**
   * The default value of the '{@link #isForceFormatting() <em>Force Formatting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForceFormatting()
   * @generated
   * @ordered
   */
  protected static final boolean FORCE_FORMATTING_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isForceFormatting() <em>Force Formatting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isForceFormatting()
   * @generated
   * @ordered
   */
  protected boolean forceFormatting = FORCE_FORMATTING_EDEFAULT;

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
  public String getEncoding()
  {
    return encoding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEncoding(String newEncoding)
  {
    String oldEncoding = encoding;
    encoding = newEncoding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.DOM_TRANSFORMER__ENCODING,
              oldEncoding, encoding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForceEncoding()
  {
    return forceEncoding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForceEncoding(boolean newForceEncoding)
  {
    boolean oldForceEncoding = forceEncoding;
    forceEncoding = newForceEncoding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__FORCE_ENCODING, oldForceEncoding, forceEncoding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifiedName()
  {
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedName(String newQualifiedName)
  {
    String oldQualifiedName = qualifiedName;
    qualifiedName = newQualifiedName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIndent()
  {
    return indent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndent(int newIndent)
  {
    int oldIndent = indent;
    indent = newIndent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GenfwPackage.DOM_TRANSFORMER__INDENT,
              oldIndent, indent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIndenting()
  {
    return indenting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndenting(boolean newIndenting)
  {
    boolean oldIndenting = indenting;
    indenting = newIndenting;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__INDENTING, oldIndenting, indenting));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLineWidth()
  {
    return lineWidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineWidth(int newLineWidth)
  {
    int oldLineWidth = lineWidth;
    lineWidth = newLineWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__LINE_WIDTH, oldLineWidth, lineWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLineSeparator()
  {
    return lineSeparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineSeparator(String newLineSeparator)
  {
    String oldLineSeparator = lineSeparator;
    lineSeparator = newLineSeparator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__LINE_SEPARATOR, oldLineSeparator, lineSeparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPreserveEmptyAttributes()
  {
    return preserveEmptyAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreserveEmptyAttributes(boolean newPreserveEmptyAttributes)
  {
    boolean oldPreserveEmptyAttributes = preserveEmptyAttributes;
    preserveEmptyAttributes = newPreserveEmptyAttributes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES, oldPreserveEmptyAttributes,
              preserveEmptyAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPreserveSpace()
  {
    return preserveSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPreserveSpace(boolean newPreserveSpace)
  {
    boolean oldPreserveSpace = preserveSpace;
    preserveSpace = newPreserveSpace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__PRESERVE_SPACE, oldPreserveSpace, preserveSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPublicID()
  {
    return publicID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublicID(String newPublicID)
  {
    String oldPublicID = publicID;
    publicID = newPublicID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__PUBLIC_ID, oldPublicID, publicID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSystemID()
  {
    return systemID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystemID(String newSystemID)
  {
    String oldSystemID = systemID;
    systemID = newSystemID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__SYSTEM_ID, oldSystemID, systemID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForceDocType()
  {
    return forceDocType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForceDocType(boolean newForceDocType)
  {
    boolean oldForceDocType = forceDocType;
    forceDocType = newForceDocType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__FORCE_DOC_TYPE, oldForceDocType, forceDocType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespaceURI()
  {
    return namespaceURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespaceURI(String newNamespaceURI)
  {
    String oldNamespaceURI = namespaceURI;
    namespaceURI = newNamespaceURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__NAMESPACE_URI, oldNamespaceURI, namespaceURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isForceFormatting()
  {
    return forceFormatting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForceFormatting(boolean newForceFormatting)
  {
    boolean oldForceFormatting = forceFormatting;
    forceFormatting = newForceFormatting;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              GenfwPackage.DOM_TRANSFORMER__FORCE_FORMATTING, oldForceFormatting, forceFormatting));
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
    case GenfwPackage.DOM_TRANSFORMER__ENCODING:
      return getEncoding();
    case GenfwPackage.DOM_TRANSFORMER__FORCE_ENCODING:
      return isForceEncoding() ? Boolean.TRUE : Boolean.FALSE;
    case GenfwPackage.DOM_TRANSFORMER__NAMESPACE_URI:
      return getNamespaceURI();
    case GenfwPackage.DOM_TRANSFORMER__QUALIFIED_NAME:
      return getQualifiedName();
    case GenfwPackage.DOM_TRANSFORMER__PUBLIC_ID:
      return getPublicID();
    case GenfwPackage.DOM_TRANSFORMER__SYSTEM_ID:
      return getSystemID();
    case GenfwPackage.DOM_TRANSFORMER__FORCE_DOC_TYPE:
      return isForceDocType() ? Boolean.TRUE : Boolean.FALSE;
    case GenfwPackage.DOM_TRANSFORMER__INDENT:
      return new Integer(getIndent());
    case GenfwPackage.DOM_TRANSFORMER__INDENTING:
      return isIndenting() ? Boolean.TRUE : Boolean.FALSE;
    case GenfwPackage.DOM_TRANSFORMER__LINE_WIDTH:
      return new Integer(getLineWidth());
    case GenfwPackage.DOM_TRANSFORMER__LINE_SEPARATOR:
      return getLineSeparator();
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES:
      return isPreserveEmptyAttributes() ? Boolean.TRUE : Boolean.FALSE;
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_SPACE:
      return isPreserveSpace() ? Boolean.TRUE : Boolean.FALSE;
    case GenfwPackage.DOM_TRANSFORMER__FORCE_FORMATTING:
      return isForceFormatting() ? Boolean.TRUE : Boolean.FALSE;
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
    case GenfwPackage.DOM_TRANSFORMER__ENCODING:
      setEncoding((String)newValue);
      return;
    case GenfwPackage.DOM_TRANSFORMER__FORCE_ENCODING:
      setForceEncoding(((Boolean)newValue).booleanValue());
      return;
    case GenfwPackage.DOM_TRANSFORMER__NAMESPACE_URI:
      setNamespaceURI((String)newValue);
      return;
    case GenfwPackage.DOM_TRANSFORMER__QUALIFIED_NAME:
      setQualifiedName((String)newValue);
      return;
    case GenfwPackage.DOM_TRANSFORMER__PUBLIC_ID:
      setPublicID((String)newValue);
      return;
    case GenfwPackage.DOM_TRANSFORMER__SYSTEM_ID:
      setSystemID((String)newValue);
      return;
    case GenfwPackage.DOM_TRANSFORMER__FORCE_DOC_TYPE:
      setForceDocType(((Boolean)newValue).booleanValue());
      return;
    case GenfwPackage.DOM_TRANSFORMER__INDENT:
      setIndent(((Integer)newValue).intValue());
      return;
    case GenfwPackage.DOM_TRANSFORMER__INDENTING:
      setIndenting(((Boolean)newValue).booleanValue());
      return;
    case GenfwPackage.DOM_TRANSFORMER__LINE_WIDTH:
      setLineWidth(((Integer)newValue).intValue());
      return;
    case GenfwPackage.DOM_TRANSFORMER__LINE_SEPARATOR:
      setLineSeparator((String)newValue);
      return;
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES:
      setPreserveEmptyAttributes(((Boolean)newValue).booleanValue());
      return;
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_SPACE:
      setPreserveSpace(((Boolean)newValue).booleanValue());
      return;
    case GenfwPackage.DOM_TRANSFORMER__FORCE_FORMATTING:
      setForceFormatting(((Boolean)newValue).booleanValue());
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
    case GenfwPackage.DOM_TRANSFORMER__ENCODING:
      setEncoding(ENCODING_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__FORCE_ENCODING:
      setForceEncoding(FORCE_ENCODING_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__NAMESPACE_URI:
      setNamespaceURI(NAMESPACE_URI_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__QUALIFIED_NAME:
      setQualifiedName(QUALIFIED_NAME_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__PUBLIC_ID:
      setPublicID(PUBLIC_ID_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__SYSTEM_ID:
      setSystemID(SYSTEM_ID_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__FORCE_DOC_TYPE:
      setForceDocType(FORCE_DOC_TYPE_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__INDENT:
      setIndent(INDENT_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__INDENTING:
      setIndenting(INDENTING_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__LINE_WIDTH:
      setLineWidth(LINE_WIDTH_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__LINE_SEPARATOR:
      setLineSeparator(LINE_SEPARATOR_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES:
      setPreserveEmptyAttributes(PRESERVE_EMPTY_ATTRIBUTES_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_SPACE:
      setPreserveSpace(PRESERVE_SPACE_EDEFAULT);
      return;
    case GenfwPackage.DOM_TRANSFORMER__FORCE_FORMATTING:
      setForceFormatting(FORCE_FORMATTING_EDEFAULT);
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
    case GenfwPackage.DOM_TRANSFORMER__ENCODING:
      return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
    case GenfwPackage.DOM_TRANSFORMER__FORCE_ENCODING:
      return forceEncoding != FORCE_ENCODING_EDEFAULT;
    case GenfwPackage.DOM_TRANSFORMER__NAMESPACE_URI:
      return NAMESPACE_URI_EDEFAULT == null ? namespaceURI != null : !NAMESPACE_URI_EDEFAULT
              .equals(namespaceURI);
    case GenfwPackage.DOM_TRANSFORMER__QUALIFIED_NAME:
      return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT
              .equals(qualifiedName);
    case GenfwPackage.DOM_TRANSFORMER__PUBLIC_ID:
      return PUBLIC_ID_EDEFAULT == null ? publicID != null : !PUBLIC_ID_EDEFAULT.equals(publicID);
    case GenfwPackage.DOM_TRANSFORMER__SYSTEM_ID:
      return SYSTEM_ID_EDEFAULT == null ? systemID != null : !SYSTEM_ID_EDEFAULT.equals(systemID);
    case GenfwPackage.DOM_TRANSFORMER__FORCE_DOC_TYPE:
      return forceDocType != FORCE_DOC_TYPE_EDEFAULT;
    case GenfwPackage.DOM_TRANSFORMER__INDENT:
      return indent != INDENT_EDEFAULT;
    case GenfwPackage.DOM_TRANSFORMER__INDENTING:
      return indenting != INDENTING_EDEFAULT;
    case GenfwPackage.DOM_TRANSFORMER__LINE_WIDTH:
      return lineWidth != LINE_WIDTH_EDEFAULT;
    case GenfwPackage.DOM_TRANSFORMER__LINE_SEPARATOR:
      return LINE_SEPARATOR_EDEFAULT == null ? lineSeparator != null : !LINE_SEPARATOR_EDEFAULT
              .equals(lineSeparator);
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES:
      return preserveEmptyAttributes != PRESERVE_EMPTY_ATTRIBUTES_EDEFAULT;
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_SPACE:
      return preserveSpace != PRESERVE_SPACE_EDEFAULT;
    case GenfwPackage.DOM_TRANSFORMER__FORCE_FORMATTING:
      return forceFormatting != FORCE_FORMATTING_EDEFAULT;
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
    result.append(" (encoding: ");
    result.append(encoding);
    result.append(", forceEncoding: ");
    result.append(forceEncoding);
    result.append(", namespaceURI: ");
    result.append(namespaceURI);
    result.append(", qualifiedName: ");
    result.append(qualifiedName);
    result.append(", publicID: ");
    result.append(publicID);
    result.append(", systemID: ");
    result.append(systemID);
    result.append(", forceDocType: ");
    result.append(forceDocType);
    result.append(", indent: ");
    result.append(indent);
    result.append(", indenting: ");
    result.append(indenting);
    result.append(", lineWidth: ");
    result.append(lineWidth);
    result.append(", lineSeparator: ");
    result.append(lineSeparator);
    result.append(", preserveEmptyAttributes: ");
    result.append(preserveEmptyAttributes);
    result.append(", preserveSpace: ");
    result.append(preserveSpace);
    result.append(", forceFormatting: ");
    result.append(forceFormatting);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  @Override
  public String generate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    Document document = getXmlDocument(targetPath);
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

      document.normalizeDocument();
    } while (modified);

    if (!touchedAtAll) return null;

    OutputFormat format = getOutputFormat(document);
    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    XMLSerializer serializer = new XMLSerializer(stream, format);
    serializer.serialize(document);
    return stream.toString();
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
        Document document = builder.parse(input);
        document.setUserData(NEWLY_CREATED, Boolean.FALSE, null);
        return document;
      }
      else
      {
        throw new IllegalArgumentException("Target path is not a file");
      }
    }

    return createXmlDocument();
  }

  /**
   * @ADDED
   */
  private Document createXmlDocument() throws InstantiationException, IllegalAccessException,
          ClassNotFoundException
  {
    DOMImplementation impl = getDOMImplementation();
    String namespaceURI = getNamespaceURI() == null || getNamespaceURI().length() == 0 ? null
            : getNamespaceURI();
    String qualifiedName = getQualifiedName() == null || getQualifiedName().length() == 0 ? "xml"
            : getQualifiedName();
    String publicID = getPublicID() == null || getPublicID().length() == 0 ? null : getPublicID();
    String systemID = getSystemID() == null || getSystemID().length() == 0 ? null : getSystemID();

    DocumentType documentType = qualifiedName == null && publicID != null && systemID != null ? null
            : impl.createDocumentType(qualifiedName, publicID, systemID);

    Document document = impl.createDocument(namespaceURI, qualifiedName, documentType);
    document.setUserData(NEWLY_CREATED, Boolean.TRUE, null);
    return document;
  }

  /**
   * @ADDED
   */
  private OutputFormat getOutputFormat(Document document)
  {
    OutputFormat format = new OutputFormat(document);
    if (isForceFormatting())
    {
      format.setLineWidth(80);
      format.setIndent(getIndent());
      format.setIndenting(isIndenting());
      format.setPreserveEmptyAttributes(isPreserveEmptyAttributes());
      format.setPreserveSpace(isPreserveSpace());

      if (getLineSeparator() != null && getLineSeparator().length() != 0)
        format.setLineSeparator(getLineSeparator());
    }

    boolean isNew = ((Boolean)document.getUserData(NEWLY_CREATED)).booleanValue();
    if (!isNew)
    {
      if (isForceEncoding()) format.setEncoding(getEncoding());
      if (isForceDocType()) format.setDoctype(getPublicID(), getSystemID());
    }

    return format;
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

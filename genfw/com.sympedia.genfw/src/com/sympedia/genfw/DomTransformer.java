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
package com.sympedia.genfw;


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dom Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#isForceEncoding <em>Force Encoding</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getNamespaceURI <em>Namespace URI</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getPublicID <em>Public ID</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getSystemID <em>System ID</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#isForceDocType <em>Force Doc Type</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getIndent <em>Indent</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#isIndenting <em>Indenting</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#getLineSeparator <em>Line Separator</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#isPreserveEmptyAttributes <em>Preserve Empty Attributes</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#isPreserveSpace <em>Preserve Space</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformer#isForceFormatting <em>Force Formatting</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getDomTransformer()
 * @model annotation="http://www.topcased.org/uuid uuid='1138792484562225'"
 * @generated
 */
public interface DomTransformer extends Generator
{
  /**
   * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.genfw.DomTransformation}.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.DomTransformation#getTransformer <em>Transformer</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformations</em>' containment reference list.
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_Transformations()
   * @see com.sympedia.genfw.DomTransformation#getTransformer
   * @model type="com.sympedia.genfw.DomTransformation" opposite="transformer" containment="true" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1138792632343228'"
   * @generated
   */
  EList getTransformations();

  /**
   * Returns the value of the '<em><b>Encoding</b></em>' attribute.
   * The default value is <code>"UTF-8"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Encoding</em>' attribute.
   * @see #setEncoding(String)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_Encoding()
   * @model default="UTF-8"
   *        annotation="http://www.topcased.org/uuid uuid='1138859750437164'"
   * @generated
   */
  String getEncoding();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#getEncoding <em>Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Encoding</em>' attribute.
   * @see #getEncoding()
   * @generated
   */
  void setEncoding(String value);

  /**
   * Returns the value of the '<em><b>Force Encoding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Force Encoding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Force Encoding</em>' attribute.
   * @see #setForceEncoding(boolean)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_ForceEncoding()
   * @model annotation="http://www.topcased.org/uuid uuid='1138859750437165'"
   * @generated
   */
  boolean isForceEncoding();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#isForceEncoding <em>Force Encoding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Force Encoding</em>' attribute.
   * @see #isForceEncoding()
   * @generated
   */
  void setForceEncoding(boolean value);

  /**
   * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
   * The default value is <code>"xml"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Name</em>' attribute.
   * @see #setQualifiedName(String)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_QualifiedName()
   * @model default="xml"
   *        annotation="http://www.topcased.org/uuid uuid='1138859750437166'"
   * @generated
   */
  String getQualifiedName();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#getQualifiedName <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Name</em>' attribute.
   * @see #getQualifiedName()
   * @generated
   */
  void setQualifiedName(String value);

  /**
   * Returns the value of the '<em><b>Indent</b></em>' attribute.
   * The default value is <code>"2"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indent</em>' attribute.
   * @see #setIndent(int)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_Indent()
   * @model default="2"
   *        annotation="http://www.topcased.org/uuid uuid='1138859973281176'"
   * @generated
   */
  int getIndent();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#getIndent <em>Indent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indent</em>' attribute.
   * @see #getIndent()
   * @generated
   */
  void setIndent(int value);

  /**
   * Returns the value of the '<em><b>Indenting</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indenting</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indenting</em>' attribute.
   * @see #setIndenting(boolean)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_Indenting()
   * @model default="true"
   *        annotation="http://www.topcased.org/uuid uuid='1138859973281177'"
   * @generated
   */
  boolean isIndenting();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#isIndenting <em>Indenting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indenting</em>' attribute.
   * @see #isIndenting()
   * @generated
   */
  void setIndenting(boolean value);

  /**
   * Returns the value of the '<em><b>Line Width</b></em>' attribute.
   * The default value is <code>"80"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Width</em>' attribute.
   * @see #setLineWidth(int)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_LineWidth()
   * @model default="80"
   *        annotation="http://www.topcased.org/uuid uuid='1138859973281178'"
   * @generated
   */
  int getLineWidth();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#getLineWidth <em>Line Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Width</em>' attribute.
   * @see #getLineWidth()
   * @generated
   */
  void setLineWidth(int value);

  /**
   * Returns the value of the '<em><b>Line Separator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line Separator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line Separator</em>' attribute.
   * @see #setLineSeparator(String)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_LineSeparator()
   * @model annotation="http://www.topcased.org/uuid uuid='1138859973281179'"
   * @generated
   */
  String getLineSeparator();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#getLineSeparator <em>Line Separator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line Separator</em>' attribute.
   * @see #getLineSeparator()
   * @generated
   */
  void setLineSeparator(String value);

  /**
   * Returns the value of the '<em><b>Preserve Empty Attributes</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preserve Empty Attributes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preserve Empty Attributes</em>' attribute.
   * @see #setPreserveEmptyAttributes(boolean)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_PreserveEmptyAttributes()
   * @model default="false"
   *        annotation="http://www.topcased.org/uuid uuid='1138859973281180'"
   * @generated
   */
  boolean isPreserveEmptyAttributes();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#isPreserveEmptyAttributes <em>Preserve Empty Attributes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preserve Empty Attributes</em>' attribute.
   * @see #isPreserveEmptyAttributes()
   * @generated
   */
  void setPreserveEmptyAttributes(boolean value);

  /**
   * Returns the value of the '<em><b>Preserve Space</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Preserve Space</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preserve Space</em>' attribute.
   * @see #setPreserveSpace(boolean)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_PreserveSpace()
   * @model default="false"
   *        annotation="http://www.topcased.org/uuid uuid='1138859994093191'"
   * @generated
   */
  boolean isPreserveSpace();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#isPreserveSpace <em>Preserve Space</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preserve Space</em>' attribute.
   * @see #isPreserveSpace()
   * @generated
   */
  void setPreserveSpace(boolean value);

  /**
   * Returns the value of the '<em><b>Public ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Public ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Public ID</em>' attribute.
   * @see #setPublicID(String)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_PublicID()
   * @model annotation="http://www.topcased.org/uuid uuid='1138860266515194'"
   * @generated
   */
  String getPublicID();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#getPublicID <em>Public ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Public ID</em>' attribute.
   * @see #getPublicID()
   * @generated
   */
  void setPublicID(String value);

  /**
   * Returns the value of the '<em><b>System ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System ID</em>' attribute.
   * @see #setSystemID(String)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_SystemID()
   * @model annotation="http://www.topcased.org/uuid uuid='1138860266515195'"
   * @generated
   */
  String getSystemID();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#getSystemID <em>System ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System ID</em>' attribute.
   * @see #getSystemID()
   * @generated
   */
  void setSystemID(String value);

  /**
   * Returns the value of the '<em><b>Force Doc Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Force Doc Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Force Doc Type</em>' attribute.
   * @see #setForceDocType(boolean)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_ForceDocType()
   * @model annotation="http://www.topcased.org/uuid uuid='1138860266515196'"
   * @generated
   */
  boolean isForceDocType();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#isForceDocType <em>Force Doc Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Force Doc Type</em>' attribute.
   * @see #isForceDocType()
   * @generated
   */
  void setForceDocType(boolean value);

  /**
   * Returns the value of the '<em><b>Namespace URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace URI</em>' attribute.
   * @see #setNamespaceURI(String)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_NamespaceURI()
   * @model annotation="http://www.topcased.org/uuid uuid='1138860266515197'"
   * @generated
   */
  String getNamespaceURI();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#getNamespaceURI <em>Namespace URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace URI</em>' attribute.
   * @see #getNamespaceURI()
   * @generated
   */
  void setNamespaceURI(String value);

  /**
   * Returns the value of the '<em><b>Force Formatting</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Force Formatting</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Force Formatting</em>' attribute.
   * @see #setForceFormatting(boolean)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformer_ForceFormatting()
   * @model default="true"
   *        annotation="http://www.topcased.org/uuid uuid='1138860971937209'"
   * @generated
   */
  boolean isForceFormatting();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformer#isForceFormatting <em>Force Formatting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Force Formatting</em>' attribute.
   * @see #isForceFormatting()
   * @generated
   */
  void setForceFormatting(boolean value);

} // DomTransformer

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


import org.eclipse.core.runtime.IProgressMonitor;
import org.w3c.dom.Document;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dom Transformation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.DomTransformation#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link com.sympedia.genfw.DomTransformation#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getDomTransformation()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='1138792538890228'"
 * @generated
 */
public interface DomTransformation extends LifeCycle
{
  /**
   * Returns the value of the '<em><b>Transformer</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.DomTransformer#getTransformations <em>Transformations</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformer</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformer</em>' container reference.
   * @see #setTransformer(DomTransformer)
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformation_Transformer()
   * @see com.sympedia.genfw.DomTransformer#getTransformations
   * @model opposite="transformations" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1138792632343232'"
   * @generated
   */
  DomTransformer getTransformer();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.DomTransformation#getTransformer <em>Transformer</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformer</em>' container reference.
   * @see #getTransformer()
   * @generated
   */
  void setTransformer(DomTransformer value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model inputObjectAnnotation="http://www.topcased.org/uuid uuid='1138795838842162'" documentDataType="com.sympedia.genfw.DomDocument"
   *        documentAnnotation="http://www.topcased.org/uuid uuid='1138795838842163'" monitorDataType="com.sympedia.genfw.IProgressMonitor"
   *        monitorAnnotation="http://www.topcased.org/uuid uuid='1138795838842164'"
   *        annotation="http://www.topcased.org/uuid uuid='1138795739467159'"
   * @generated
   */
  boolean transform(Object inputObject, Document document, IProgressMonitor monitor)
          throws Exception;

  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see com.sympedia.genfw.GenfwPackage#getDomTransformation_Label()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1138797323014174'"
   * @generated
   */
  String getLabel();

} // DomTransformationRule

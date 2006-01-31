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


import java.io.OutputStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.Generator#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.genfw.Generator#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getGenerator()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='113672105540666'"
 * @generated
 */
public interface Generator extends EObject
{
  /**
   * Returns the value of the '<em><b>Root</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.genfw.GenLib#getGenerators <em>Generators</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' container reference.
   * @see #setRoot(GenLib)
   * @see com.sympedia.genfw.GenfwPackage#getGenerator_Root()
   * @see com.sympedia.genfw.GenLib#getGenerators
   * @model opposite="generators" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113672221104686'"
   * @generated
   */
  GenLib getRoot();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Generator#getRoot <em>Root</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' container reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(GenLib value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.sympedia.genfw.GenfwPackage#getGenerator_Name()
   * @model id="true" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.Generator#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model inputObjectAnnotation="http://www.topcased.org/uuid uuid='113672289210977'" targetPathAnnotation="http://www.topcased.org/uuid uuid='113672289210978'" monitorDataType="com.sympedia.genfw.IProgressMonitor"
   *        monitorAnnotation="http://www.topcased.org/uuid uuid='1136795172375105'"
   *        annotation="http://www.topcased.org/uuid uuid='113672120854673'"
   * @generated
   */
  String generate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws CoreException, Exception;

} // Generator

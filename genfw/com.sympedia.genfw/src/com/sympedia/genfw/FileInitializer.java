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


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.sympedia.genfw.GenfwPackage#getFileInitializer()
 * @model abstract="true"
 * @generated
 */
public interface FileInitializer extends Generator
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model monitorDataType="com.sympedia.genfw.IProgressMonitor"
   * @generated
   */
  String getContent(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws CoreException;

} // FileInitializer

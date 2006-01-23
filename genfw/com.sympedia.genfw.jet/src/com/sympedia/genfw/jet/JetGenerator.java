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
package com.sympedia.genfw.jet;


import com.sympedia.genfw.Generator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.sympedia.genfw.jet.JetPackage#getJetGenerator()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='11374431968591'"
 * @generated
 */
public interface JetGenerator extends Generator
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model parentClassLoaderDataType="com.sympedia.genfw.ClassLoader"
   *        parentClassLoaderAnnotation="http://www.topcased.org/uuid uuid='11374431968593'"
   *        annotation="http://www.topcased.org/uuid uuid='11374431968592'"
   * @generated
   */
  Class getTemplate(ClassLoader parentClassLoader);

} // JetGenerator

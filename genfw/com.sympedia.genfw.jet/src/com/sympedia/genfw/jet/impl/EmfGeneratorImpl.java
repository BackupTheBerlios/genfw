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
package com.sympedia.genfw.jet.impl;


import com.sympedia.genfw.impl.GeneratorImpl;
import com.sympedia.genfw.jet.EmfGenerator;
import com.sympedia.genfw.jet.JetPackage;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EmfGeneratorImpl extends GeneratorImpl implements EmfGenerator
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmfGeneratorImpl()
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
    return JetPackage.Literals.EMF_GENERATOR;
  }

  /**
   * @ADDED
   */

  public byte[] doGenerate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    GenBase genBase = (GenBase)inputObject;
    genBase.getGenModel().setCanGenerate(true);
    genBase.generate(monitor);
    return null;
  }
} //EmfGeneratorImpl

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


import com.sympedia.genfw.jet.*;

import com.sympedia.genfw.jet.EcoreTemplate;
import com.sympedia.genfw.jet.EmfGenerator;
import com.sympedia.genfw.jet.GifColorer;
import com.sympedia.genfw.jet.JetFactory;
import com.sympedia.genfw.jet.JetPackage;
import com.sympedia.genfw.jet.JetTemplate;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JetFactoryImpl extends EFactoryImpl implements JetFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JetFactory init()
  {
    try
    {
      JetFactory theJetFactory = (JetFactory)EPackage.Registry.INSTANCE
              .getEFactory("http://www.sympedia.com/2006/genfw/jet");
      if (theJetFactory != null)
      {
        return theJetFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JetFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JetFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case JetPackage.JET_TEMPLATE:
      return createJetTemplate();
    case JetPackage.ECORE_TEMPLATE:
      return createEcoreTemplate();
    case JetPackage.EMF_GENERATOR:
      return createEmfGenerator();
    case JetPackage.GIF_COLORER:
      return createGifColorer();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName()
              + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JetTemplate createJetTemplate()
  {
    JetTemplateImpl jetTemplate = new JetTemplateImpl();
    return jetTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcoreTemplate createEcoreTemplate()
  {
    EcoreTemplateImpl ecoreTemplate = new EcoreTemplateImpl();
    return ecoreTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmfGenerator createEmfGenerator()
  {
    EmfGeneratorImpl emfGenerator = new EmfGeneratorImpl();
    return emfGenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GifColorer createGifColorer()
  {
    GifColorerImpl gifColorer = new GifColorerImpl();
    return gifColorer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JetPackage getJetPackage()
  {
    return (JetPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static JetPackage getPackage()
  {
    return JetPackage.eINSTANCE;
  }

} //JetFactoryImpl

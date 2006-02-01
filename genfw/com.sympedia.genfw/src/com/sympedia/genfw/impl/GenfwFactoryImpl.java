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


import com.sympedia.genfw.*;

import java.io.OutputStream;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3c.dom.Document;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenfwFactoryImpl extends EFactoryImpl implements GenfwFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GenfwFactory init()
  {
    try
    {
      GenfwFactory theGenfwFactory = (GenfwFactory)EPackage.Registry.INSTANCE
              .getEFactory("http://www.sympedia.com/2006/genfw");
      if (theGenfwFactory != null)
      {
        return theGenfwFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GenfwFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenfwFactoryImpl()
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
    case GenfwPackage.GEN_LIB:
      return createGenLib();
    case GenfwPackage.GEN_APP:
      return createGenApp();
    case GenfwPackage.ECORE_CONTENT_PROVIDER:
      return createEcoreContentProvider();
    case GenfwPackage.PROPERTIES_CONTENT_PROVIDER:
      return createPropertiesContentProvider();
    case GenfwPackage.RULE_SET:
      return createRuleSet();
    case GenfwPackage.STATIC_RULE:
      return createStaticRule();
    case GenfwPackage.DOM_TRANSFORMER:
      return createDomTransformer();
    case GenfwPackage.INITIAL_GENERATOR:
      return createInitialGenerator();
    case GenfwPackage.STATIC_FILE_INITIALIZER:
      return createStaticFileInitializer();
    case GenfwPackage.LINE:
      return createLine();
    case GenfwPackage.PROJECT_INITIALIZER:
      return createProjectInitializer();
    case GenfwPackage.INPUT:
      return createInput();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
    case GenfwPackage.IPATH:
      return createIPathFromString(eDataType, initialValue);
    case GenfwPackage.JAVA_LIST:
      return createJavaListFromString(eDataType, initialValue);
    case GenfwPackage.CORE_EXCEPTION:
      return createCoreExceptionFromString(eDataType, initialValue);
    case GenfwPackage.IPROGRESS_MONITOR:
      return createIProgressMonitorFromString(eDataType, initialValue);
    case GenfwPackage.CLASS_LOADER:
      return createClassLoaderFromString(eDataType, initialValue);
    case GenfwPackage.OUTPUT_STREAM:
      return createOutputStreamFromString(eDataType, initialValue);
    case GenfwPackage.EXCEPTION:
      return createExceptionFromString(eDataType, initialValue);
    case GenfwPackage.DOM_DOCUMENT:
      return createDomDocumentFromString(eDataType, initialValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName()
              + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
    case GenfwPackage.IPATH:
      return convertIPathToString(eDataType, instanceValue);
    case GenfwPackage.JAVA_LIST:
      return convertJavaListToString(eDataType, instanceValue);
    case GenfwPackage.CORE_EXCEPTION:
      return convertCoreExceptionToString(eDataType, instanceValue);
    case GenfwPackage.IPROGRESS_MONITOR:
      return convertIProgressMonitorToString(eDataType, instanceValue);
    case GenfwPackage.CLASS_LOADER:
      return convertClassLoaderToString(eDataType, instanceValue);
    case GenfwPackage.OUTPUT_STREAM:
      return convertOutputStreamToString(eDataType, instanceValue);
    case GenfwPackage.EXCEPTION:
      return convertExceptionToString(eDataType, instanceValue);
    case GenfwPackage.DOM_DOCUMENT:
      return convertDomDocumentToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName()
              + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenLib createGenLib()
  {
    GenLibImpl genLib = new GenLibImpl();
    return genLib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenApp createGenApp()
  {
    GenAppImpl genApp = new GenAppImpl();
    return genApp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcoreContentProvider createEcoreContentProvider()
  {
    EcoreContentProviderImpl ecoreContentProvider = new EcoreContentProviderImpl();
    return ecoreContentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertiesContentProvider createPropertiesContentProvider()
  {
    PropertiesContentProviderImpl propertiesContentProvider = new PropertiesContentProviderImpl();
    return propertiesContentProvider;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleSet createRuleSet()
  {
    RuleSetImpl ruleSet = new RuleSetImpl();
    return ruleSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticRule createStaticRule()
  {
    StaticRuleImpl staticRule = new StaticRuleImpl();
    return staticRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomTransformer createDomTransformer()
  {
    DomTransformerImpl domTransformer = new DomTransformerImpl();
    return domTransformer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitialGenerator createInitialGenerator()
  {
    InitialGeneratorImpl initialGenerator = new InitialGeneratorImpl();
    return initialGenerator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticFileInitializer createStaticFileInitializer()
  {
    StaticFileInitializerImpl staticFileInitializer = new StaticFileInitializerImpl();
    return staticFileInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line createLine()
  {
    LineImpl line = new LineImpl();
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProjectInitializer createProjectInitializer()
  {
    ProjectInitializerImpl projectInitializer = new ProjectInitializerImpl();
    return projectInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IPath createIPathFromString(EDataType eDataType, String initialValue)
  {
    return (IPath)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIPathToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createJavaListFromString(EDataType eDataType, String initialValue)
  {
    return (List)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJavaListToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreException createCoreExceptionFromString(EDataType eDataType, String initialValue)
  {
    return (CoreException)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCoreExceptionToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue)
  {
    return (IProgressMonitor)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassLoader createClassLoaderFromString(EDataType eDataType, String initialValue)
  {
    return (ClassLoader)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertClassLoaderToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputStream createOutputStreamFromString(EDataType eDataType, String initialValue)
  {
    return (OutputStream)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertOutputStreamToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exception createExceptionFromString(EDataType eDataType, String initialValue)
  {
    return (Exception)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertExceptionToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDomDocumentFromString(EDataType eDataType, String initialValue)
  {
    return (Document)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDomDocumentToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenfwPackage getGenfwPackage()
  {
    return (GenfwPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static GenfwPackage getPackage()
  {
    return GenfwPackage.eINSTANCE;
  }

} //GenfwFactoryImpl

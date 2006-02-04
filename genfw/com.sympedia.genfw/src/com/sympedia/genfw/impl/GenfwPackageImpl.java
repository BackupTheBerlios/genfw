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


import com.sympedia.genfw.ContentProvider;
import com.sympedia.genfw.DelegatingGenerator;
import com.sympedia.genfw.DomContentProvider;
import com.sympedia.genfw.DomTransformation;
import com.sympedia.genfw.DomTransformer;
import com.sympedia.genfw.EcoreContentProvider;
import com.sympedia.genfw.ExpressionBasedRule;
import com.sympedia.genfw.GenApp;
import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.Generator;
import com.sympedia.genfw.GenfwFactory;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.InitialGenerator;
import com.sympedia.genfw.Input;
import com.sympedia.genfw.LifeCycle;
import com.sympedia.genfw.Line;
import com.sympedia.genfw.ProjectInitializationProvider;
import com.sympedia.genfw.ProjectInitializer;
import com.sympedia.genfw.PropertiesContentProvider;
import com.sympedia.genfw.Rule;
import com.sympedia.genfw.RuleSet;
import com.sympedia.genfw.StaticFileInitializer;
import com.sympedia.genfw.StaticRule;

import java.io.OutputStream;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.w3c.dom.Document;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenfwPackageImpl extends EPackageImpl implements GenfwPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genLibEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genAppEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lifeCycleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contentProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecoreContentProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertiesContentProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionBasedRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass delegatingGeneratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domTransformerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domTransformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialGeneratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticFileInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectInitializationProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domContentProviderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iPathEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType javaListEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType coreExceptionEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType iProgressMonitorEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType classLoaderEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType outputStreamEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType exceptionEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType domDocumentEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.sympedia.genfw.GenfwPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GenfwPackageImpl()
  {
    super(eNS_URI, GenfwFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GenfwPackage init()
  {
    if (isInited)
      return (GenfwPackage)EPackage.Registry.INSTANCE.getEPackage(GenfwPackage.eNS_URI);

    // Obtain or create and register package
    GenfwPackageImpl theGenfwPackage = (GenfwPackageImpl)(EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) instanceof GenfwPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI) : new GenfwPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theGenfwPackage.createPackageContents();

    // Initialize created meta-data
    theGenfwPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theGenfwPackage.freeze();

    return theGenfwPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenLib()
  {
    return genLibEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenLib_ContentProviders()
  {
    return (EReference)genLibEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenLib_Generators()
  {
    return (EReference)genLibEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenLib_RuleSets()
  {
    return (EReference)genLibEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenApp()
  {
    return genAppEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenApp_Inputs()
  {
    return (EReference)genAppEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLifeCycle()
  {
    return lifeCycleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContentProvider()
  {
    return contentProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContentProvider_Root()
  {
    return (EReference)contentProviderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContentProvider_Name()
  {
    return (EAttribute)contentProviderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEcoreContentProvider()
  {
    return ecoreContentProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertiesContentProvider()
  {
    return propertiesContentProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRuleSet()
  {
    return ruleSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleSet_Rules()
  {
    return (EReference)ruleSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRuleSet_Root()
  {
    return (EReference)ruleSetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleSet_Name()
  {
    return (EAttribute)ruleSetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRuleSet_Deactivate()
  {
    return (EAttribute)ruleSetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_RuleSet()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Name()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Prerequisites()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_Generator()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_MatchClassName()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_DontOverwrite()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Deactivate()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticRule()
  {
    return staticRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStaticRule_TargetPath()
  {
    return (EAttribute)staticRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionBasedRule()
  {
    return expressionBasedRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionBasedRule_MatchExpression()
  {
    return (EAttribute)expressionBasedRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionBasedRule_TargetPathExpression()
  {
    return (EAttribute)expressionBasedRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGenerator()
  {
    return generatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGenerator_Root()
  {
    return (EReference)generatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGenerator_Name()
  {
    return (EAttribute)generatorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDelegatingGenerator()
  {
    return delegatingGeneratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDelegatingGenerator_Delegate()
  {
    return (EReference)delegatingGeneratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomTransformer()
  {
    return domTransformerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomTransformer_Transformations()
  {
    return (EReference)domTransformerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_Encoding()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_ForceEncoding()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_QualifiedName()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_Indent()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_Indenting()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_LineWidth()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_LineSeparator()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_PreserveEmptyAttributes()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_PreserveSpace()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_PublicID()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_SystemID()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_ForceDocType()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_NamespaceURI()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformer_ForceFormatting()
  {
    return (EAttribute)domTransformerEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomTransformation()
  {
    return domTransformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomTransformation_Transformer()
  {
    return (EReference)domTransformationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomTransformation_Label()
  {
    return (EAttribute)domTransformationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitialGenerator()
  {
    return initialGeneratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticFileInitializer()
  {
    return staticFileInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStaticFileInitializer_Lines()
  {
    return (EReference)staticFileInitializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLine()
  {
    return lineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLine_Content()
  {
    return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLine_StaticFileInitializer()
  {
    return (EReference)lineEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectInitializer()
  {
    return projectInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectInitializationProvider()
  {
    return projectInitializationProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_Root()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Label()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_FullPath()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_ContentProvider()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInput_RuleSets()
  {
    return (EReference)inputEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomContentProvider()
  {
    return domContentProviderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIPath()
  {
    return iPathEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getJavaList()
  {
    return javaListEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getCoreException()
  {
    return coreExceptionEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getIProgressMonitor()
  {
    return iProgressMonitorEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getClassLoader()
  {
    return classLoaderEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getOutputStream()
  {
    return outputStreamEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getException()
  {
    return exceptionEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getDomDocument()
  {
    return domDocumentEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenfwFactory getGenfwFactory()
  {
    return (GenfwFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    genLibEClass = createEClass(GEN_LIB);
    createEReference(genLibEClass, GEN_LIB__CONTENT_PROVIDERS);
    createEReference(genLibEClass, GEN_LIB__GENERATORS);
    createEReference(genLibEClass, GEN_LIB__RULE_SETS);

    genAppEClass = createEClass(GEN_APP);
    createEReference(genAppEClass, GEN_APP__INPUTS);

    lifeCycleEClass = createEClass(LIFE_CYCLE);

    contentProviderEClass = createEClass(CONTENT_PROVIDER);
    createEReference(contentProviderEClass, CONTENT_PROVIDER__ROOT);
    createEAttribute(contentProviderEClass, CONTENT_PROVIDER__NAME);

    ecoreContentProviderEClass = createEClass(ECORE_CONTENT_PROVIDER);

    propertiesContentProviderEClass = createEClass(PROPERTIES_CONTENT_PROVIDER);

    ruleSetEClass = createEClass(RULE_SET);
    createEReference(ruleSetEClass, RULE_SET__RULES);
    createEReference(ruleSetEClass, RULE_SET__ROOT);
    createEAttribute(ruleSetEClass, RULE_SET__NAME);
    createEAttribute(ruleSetEClass, RULE_SET__DEACTIVATE);

    ruleEClass = createEClass(RULE);
    createEReference(ruleEClass, RULE__RULE_SET);
    createEAttribute(ruleEClass, RULE__NAME);
    createEReference(ruleEClass, RULE__PREREQUISITES);
    createEReference(ruleEClass, RULE__GENERATOR);
    createEAttribute(ruleEClass, RULE__MATCH_CLASS_NAME);
    createEAttribute(ruleEClass, RULE__DONT_OVERWRITE);
    createEAttribute(ruleEClass, RULE__DEACTIVATE);

    staticRuleEClass = createEClass(STATIC_RULE);
    createEAttribute(staticRuleEClass, STATIC_RULE__TARGET_PATH);

    expressionBasedRuleEClass = createEClass(EXPRESSION_BASED_RULE);
    createEAttribute(expressionBasedRuleEClass, EXPRESSION_BASED_RULE__MATCH_EXPRESSION);
    createEAttribute(expressionBasedRuleEClass, EXPRESSION_BASED_RULE__TARGET_PATH_EXPRESSION);

    generatorEClass = createEClass(GENERATOR);
    createEReference(generatorEClass, GENERATOR__ROOT);
    createEAttribute(generatorEClass, GENERATOR__NAME);

    delegatingGeneratorEClass = createEClass(DELEGATING_GENERATOR);
    createEReference(delegatingGeneratorEClass, DELEGATING_GENERATOR__DELEGATE);

    domTransformerEClass = createEClass(DOM_TRANSFORMER);
    createEReference(domTransformerEClass, DOM_TRANSFORMER__TRANSFORMATIONS);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__ENCODING);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__FORCE_ENCODING);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__NAMESPACE_URI);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__QUALIFIED_NAME);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__PUBLIC_ID);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__SYSTEM_ID);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__FORCE_DOC_TYPE);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__INDENT);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__INDENTING);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__LINE_WIDTH);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__LINE_SEPARATOR);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__PRESERVE_SPACE);
    createEAttribute(domTransformerEClass, DOM_TRANSFORMER__FORCE_FORMATTING);

    domTransformationEClass = createEClass(DOM_TRANSFORMATION);
    createEReference(domTransformationEClass, DOM_TRANSFORMATION__TRANSFORMER);
    createEAttribute(domTransformationEClass, DOM_TRANSFORMATION__LABEL);

    initialGeneratorEClass = createEClass(INITIAL_GENERATOR);

    staticFileInitializerEClass = createEClass(STATIC_FILE_INITIALIZER);
    createEReference(staticFileInitializerEClass, STATIC_FILE_INITIALIZER__LINES);

    lineEClass = createEClass(LINE);
    createEAttribute(lineEClass, LINE__CONTENT);
    createEReference(lineEClass, LINE__STATIC_FILE_INITIALIZER);

    projectInitializerEClass = createEClass(PROJECT_INITIALIZER);

    projectInitializationProviderEClass = createEClass(PROJECT_INITIALIZATION_PROVIDER);

    inputEClass = createEClass(INPUT);
    createEReference(inputEClass, INPUT__ROOT);
    createEAttribute(inputEClass, INPUT__LABEL);
    createEAttribute(inputEClass, INPUT__FULL_PATH);
    createEReference(inputEClass, INPUT__CONTENT_PROVIDER);
    createEReference(inputEClass, INPUT__RULE_SETS);

    domContentProviderEClass = createEClass(DOM_CONTENT_PROVIDER);

    // Create data types
    iPathEDataType = createEDataType(IPATH);
    javaListEDataType = createEDataType(JAVA_LIST);
    coreExceptionEDataType = createEDataType(CORE_EXCEPTION);
    iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
    classLoaderEDataType = createEDataType(CLASS_LOADER);
    outputStreamEDataType = createEDataType(OUTPUT_STREAM);
    exceptionEDataType = createEDataType(EXCEPTION);
    domDocumentEDataType = createEDataType(DOM_DOCUMENT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Add supertypes to classes
    genAppEClass.getESuperTypes().add(this.getGenLib());
    contentProviderEClass.getESuperTypes().add(this.getLifeCycle());
    ecoreContentProviderEClass.getESuperTypes().add(this.getContentProvider());
    propertiesContentProviderEClass.getESuperTypes().add(this.getContentProvider());
    ruleSetEClass.getESuperTypes().add(this.getLifeCycle());
    ruleEClass.getESuperTypes().add(this.getLifeCycle());
    staticRuleEClass.getESuperTypes().add(this.getRule());
    expressionBasedRuleEClass.getESuperTypes().add(this.getRule());
    generatorEClass.getESuperTypes().add(this.getLifeCycle());
    delegatingGeneratorEClass.getESuperTypes().add(this.getGenerator());
    domTransformerEClass.getESuperTypes().add(this.getGenerator());
    domTransformationEClass.getESuperTypes().add(this.getLifeCycle());
    initialGeneratorEClass.getESuperTypes().add(this.getDelegatingGenerator());
    staticFileInitializerEClass.getESuperTypes().add(this.getGenerator());
    projectInitializerEClass.getESuperTypes().add(this.getGenerator());
    inputEClass.getESuperTypes().add(this.getLifeCycle());
    domContentProviderEClass.getESuperTypes().add(this.getContentProvider());

    // Initialize classes and features; add operations and parameters
    initEClass(genLibEClass, GenLib.class, "GenLib", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenLib_ContentProviders(), this.getContentProvider(), this
            .getContentProvider_Root(), "contentProviders", null, 0, -1, GenLib.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenLib_Generators(), this.getGenerator(), this.getGenerator_Root(),
            "generators", null, 0, -1, GenLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGenLib_RuleSets(), this.getRuleSet(), this.getRuleSet_Root(), "ruleSets",
            null, 0, -1, GenLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    EOperation op = addEOperation(genLibEClass, this.getClassLoader(), "getClassLoader", 0, 1);
    addEParameter(op, this.getClassLoader(), "parentClassLoader", 0, 1);

    initEClass(genAppEClass, GenApp.class, "GenApp", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenApp_Inputs(), this.getInput(), this.getInput_Root(), "inputs", null, 0,
            -1, GenApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lifeCycleEClass, LifeCycle.class, "LifeCycle", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(lifeCycleEClass, null, "initialize");
    addEParameter(op, this.getGenApp(), "genapp", 0, 1);
    addEException(op, this.getException());

    op = addEOperation(lifeCycleEClass, null, "dispose");
    addEParameter(op, this.getGenApp(), "genapp", 0, 1);

    initEClass(contentProviderEClass, ContentProvider.class, "ContentProvider", IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContentProvider_Root(), this.getGenLib(), this.getGenLib_ContentProviders(),
            "root", null, 1, 1, ContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContentProvider_Name(), ecorePackage.getEString(), "name", null, 1, 1,
            ContentProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(contentProviderEClass, this.getJavaList(), "getRoots", 0, 1);
    addEParameter(op, ecorePackage.getEString(), "path", 0, 1);
    addEException(op, this.getException());

    op = addEOperation(contentProviderEClass, this.getJavaList(), "getChildren", 0, 1);
    addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1);
    addEException(op, this.getException());

    initEClass(ecoreContentProviderEClass, EcoreContentProvider.class, "EcoreContentProvider",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertiesContentProviderEClass, PropertiesContentProvider.class,
            "PropertiesContentProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRuleSet_Rules(), this.getRule(), this.getRule_RuleSet(), "rules", null, 0,
            -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRuleSet_Root(), this.getGenLib(), this.getGenLib_RuleSets(), "root", null, 1,
            1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleSet_Name(), ecorePackage.getEString(), "name", null, 1, 1, RuleSet.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRuleSet_Deactivate(), ecorePackage.getEBoolean(), "deactivate", null, 0, 1,
            RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRule_RuleSet(), this.getRuleSet(), this.getRuleSet_Rules(), "ruleSet", null,
            1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Prerequisites(), this.getRule(), null, "prerequisites", null, 0, -1,
            Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_Generator(), this.getGenerator(), null, "generator", null, 1, 1,
            Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_MatchClassName(), ecorePackage.getEString(), "matchClassName", null, 0,
            1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_DontOverwrite(), ecorePackage.getEBoolean(), "dontOverwrite", null, 0,
            1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_Deactivate(), ecorePackage.getEBoolean(), "deactivate", null, 0, 1,
            Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(ruleEClass, ecorePackage.getEBoolean(), "isMatching", 0, 1);
    addEParameter(op, ecorePackage.getEJavaObject(), "inputObject", 0, 1);
    addEException(op, this.getException());

    op = addEOperation(ruleEClass, ecorePackage.getEString(), "getTargetPath", 0, 1);
    addEParameter(op, ecorePackage.getEJavaObject(), "inputObject", 0, 1);
    addEException(op, this.getException());

    initEClass(staticRuleEClass, StaticRule.class, "StaticRule", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStaticRule_TargetPath(), ecorePackage.getEString(), "targetPath", null, 0, 1,
            StaticRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionBasedRuleEClass, ExpressionBasedRule.class, "ExpressionBasedRule",
            IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionBasedRule_MatchExpression(), ecorePackage.getEString(),
            "matchExpression", null, 0, 1, ExpressionBasedRule.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionBasedRule_TargetPathExpression(), ecorePackage.getEString(),
            "targetPathExpression", null, 0, 1, ExpressionBasedRule.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(generatorEClass, Generator.class, "Generator", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGenerator_Root(), this.getGenLib(), this.getGenLib_Generators(), "root",
            null, 1, 1, Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGenerator_Name(), ecorePackage.getEString(), "name", null, 1, 1,
            Generator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(generatorEClass, ecorePackage.getEString(), "generate", 0, 1);
    addEParameter(op, ecorePackage.getEJavaObject(), "inputObject", 0, 1);
    addEParameter(op, ecorePackage.getEString(), "targetPath", 0, 1);
    addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);
    addEException(op, this.getException());

    initEClass(delegatingGeneratorEClass, DelegatingGenerator.class, "DelegatingGenerator",
            IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDelegatingGenerator_Delegate(), this.getGenerator(), null, "delegate", null,
            1, 1, DelegatingGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domTransformerEClass, DomTransformer.class, "DomTransformer", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomTransformer_Transformations(), this.getDomTransformation(), this
            .getDomTransformation_Transformer(), "transformations", null, 1, -1,
            DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_Encoding(), ecorePackage.getEString(), "encoding", "UTF-8", 0,
            1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_ForceEncoding(), ecorePackage.getEBoolean(), "forceEncoding",
            null, 0, 1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_NamespaceURI(), ecorePackage.getEString(), "namespaceURI",
            null, 0, 1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_QualifiedName(), ecorePackage.getEString(), "qualifiedName",
            "xml", 0, 1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_PublicID(), ecorePackage.getEString(), "publicID", null, 0, 1,
            DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_SystemID(), ecorePackage.getEString(), "systemID", null, 0, 1,
            DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_ForceDocType(), ecorePackage.getEBoolean(), "forceDocType",
            null, 0, 1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_Indent(), ecorePackage.getEInt(), "indent", "2", 0, 1,
            DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_Indenting(), ecorePackage.getEBoolean(), "indenting", "true",
            0, 1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_LineWidth(), ecorePackage.getEInt(), "lineWidth", "80", 0, 1,
            DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_LineSeparator(), ecorePackage.getEString(), "lineSeparator",
            null, 0, 1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_PreserveEmptyAttributes(), ecorePackage.getEBoolean(),
            "preserveEmptyAttributes", "false", 0, 1, DomTransformer.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_PreserveSpace(), ecorePackage.getEBoolean(), "preserveSpace",
            "false", 0, 1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformer_ForceFormatting(), ecorePackage.getEBoolean(),
            "forceFormatting", "true", 0, 1, DomTransformer.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domTransformationEClass, DomTransformation.class, "DomTransformation", IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomTransformation_Transformer(), this.getDomTransformer(), this
            .getDomTransformer_Transformations(), "transformer", null, 1, 1,
            DomTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomTransformation_Label(), ecorePackage.getEString(), "label", null, 0, 1,
            DomTransformation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE,
            !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    op = addEOperation(domTransformationEClass, ecorePackage.getEBoolean(), "transform", 0, 1);
    addEParameter(op, ecorePackage.getEJavaObject(), "inputObject", 0, 1);
    addEParameter(op, this.getDomDocument(), "document", 0, 1);
    addEParameter(op, this.getIProgressMonitor(), "monitor", 0, 1);
    addEException(op, this.getException());

    initEClass(initialGeneratorEClass, InitialGenerator.class, "InitialGenerator", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(staticFileInitializerEClass, StaticFileInitializer.class, "StaticFileInitializer",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStaticFileInitializer_Lines(), this.getLine(), this
            .getLine_StaticFileInitializer(), "lines", null, 0, -1, StaticFileInitializer.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLine_Content(), ecorePackage.getEString(), "content", null, 0, 1, Line.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
    initEReference(getLine_StaticFileInitializer(), this.getStaticFileInitializer(), this
            .getStaticFileInitializer_Lines(), "staticFileInitializer", null, 1, 1, Line.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectInitializerEClass, ProjectInitializer.class, "ProjectInitializer",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(projectInitializationProviderEClass, ProjectInitializationProvider.class,
            "ProjectInitializationProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInput_Root(), this.getGenApp(), this.getGenApp_Inputs(), "root", null, 0, 1,
            Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_Label(), ecorePackage.getEString(), "label", null, 0, 1, Input.class,
            IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            IS_DERIVED, IS_ORDERED);
    initEAttribute(getInput_FullPath(), ecorePackage.getEString(), "fullPath", null, 0, 1,
            Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_ContentProvider(), this.getContentProvider(), null, "contentProvider",
            null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInput_RuleSets(), this.getRuleSet(), null, "ruleSets", null, 1, -1,
            Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domContentProviderEClass, DomContentProvider.class, "DomContentProvider",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize data types
    initEDataType(iPathEDataType, IPath.class, "IPath", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(javaListEDataType, List.class, "JavaList", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(coreExceptionEDataType, CoreException.class, "CoreException", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor",
            IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(classLoaderEDataType, ClassLoader.class, "ClassLoader", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(outputStreamEDataType, OutputStream.class, "OutputStream", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(domDocumentEDataType, Document.class, "DomDocument", IS_SERIALIZABLE,
            !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.topcased.org/uuid
    createUuidAnnotations();
    // http://www.sympedia.com/2006/celleditor
    createCelleditorAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.topcased.org/uuid</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createUuidAnnotations()
  {
    String source = "http://www.topcased.org/uuid";
    addAnnotation(this, source, new String[] {"uuid", "11367080429370"});
    addAnnotation(genLibEClass, source, new String[] {"uuid", "113672173296899"});
    addAnnotation((EOperation)genLibEClass.getEOperations().get(0), source, new String[] {"uuid",
            "11368054601876"});
    addAnnotation((EParameter)((EOperation)genLibEClass.getEOperations().get(0)).getEParameters()
            .get(0), source, new String[] {"uuid", "11371699798129"});
    addAnnotation(getGenLib_ContentProviders(), source, new String[] {"uuid", "1136722211062110"});
    addAnnotation(getGenLib_Generators(), source, new String[] {"uuid", "1136722211062112"});
    addAnnotation(getGenLib_RuleSets(), source, new String[] {"uuid", "1136722211062111"});
    addAnnotation(genAppEClass, source, new String[] {"uuid", "1136887070640172"});
    addAnnotation(getGenApp_Inputs(), source, new String[] {"uuid", "1136887070640173"});
    addAnnotation(lifeCycleEClass, source, new String[] {"uuid", "1138872040968290"});
    addAnnotation((EOperation)lifeCycleEClass.getEOperations().get(0), source, new String[] {
            "uuid", "1138872040968291"});
    addAnnotation((EParameter)((EOperation)lifeCycleEClass.getEOperations().get(0))
            .getEParameters().get(0), source, new String[] {"uuid", "113887234659333"});
    addAnnotation((EOperation)lifeCycleEClass.getEOperations().get(1), source, new String[] {
            "uuid", "1138872040968292"});
    addAnnotation((EParameter)((EOperation)lifeCycleEClass.getEOperations().get(1))
            .getEParameters().get(0), source, new String[] {"uuid", "113887234659337"});
    addAnnotation(contentProviderEClass, source, new String[] {"uuid", "113671546137560"});
    addAnnotation((EOperation)contentProviderEClass.getEOperations().get(0), source, new String[] {
            "uuid", "113671546137561"});
    addAnnotation((EParameter)((EOperation)contentProviderEClass.getEOperations().get(0))
            .getEParameters().get(0), source, new String[] {"uuid", "113671579192166"});
    addAnnotation((EOperation)contentProviderEClass.getEOperations().get(1), source, new String[] {
            "uuid", "113671579192167"});
    addAnnotation((EParameter)((EOperation)contentProviderEClass.getEOperations().get(1))
            .getEParameters().get(0), source, new String[] {"uuid", "113671579193768"});
    addAnnotation(getContentProvider_Root(), source, new String[] {"uuid", "113672221104652"});
    addAnnotation(getContentProvider_Name(), source, new String[] {"uuid", "113878822765645"});
    addAnnotation(domContentProviderEClass, source, new String[] {"uuid", "1138909106468305"});
    addAnnotation(ecoreContentProviderEClass, source, new String[] {"uuid", "113671583842178"});
    addAnnotation(propertiesContentProviderEClass, source, new String[] {"uuid", "113671672139081"});
    addAnnotation(ruleSetEClass, source, new String[] {"uuid", "113672173296897"});
    addAnnotation(getRuleSet_Rules(), source, new String[] {"uuid", "113672173296898"});
    addAnnotation(getRuleSet_Root(), source, new String[] {"uuid", "1136722211046105"});
    addAnnotation(getRuleSet_Name(), source, new String[] {"uuid", "1136786719500114"});
    addAnnotation(getRuleSet_Deactivate(), source, new String[] {"uuid", "113878822765664"});
    addAnnotation(ruleEClass, source, new String[] {"uuid", "113672105539064"});
    addAnnotation((EOperation)ruleEClass.getEOperations().get(0), source, new String[] {"uuid",
            "113672105540665"});
    addAnnotation((EParameter)((EOperation)ruleEClass.getEOperations().get(0)).getEParameters()
            .get(0), source, new String[] {"uuid", "113672289210960"});
    addAnnotation((EOperation)ruleEClass.getEOperations().get(1), source, new String[] {"uuid",
            "113672120854669"});
    addAnnotation((EParameter)((EOperation)ruleEClass.getEOperations().get(1)).getEParameters()
            .get(0), source, new String[] {"uuid", "113672289210964"});
    addAnnotation(getRule_RuleSet(), source, new String[] {"uuid", "113672173295375"});
    addAnnotation(getRule_Name(), source, new String[] {"uuid", "113878822765683"});
    addAnnotation(getRule_Prerequisites(), source, new String[] {"uuid", "113878822765684"});
    addAnnotation(getRule_Generator(), source, new String[] {"uuid", "113672135642172"});
    addAnnotation(getRule_MatchClassName(), source, new String[] {"uuid", "113716997982888"});
    addAnnotation(getRule_DontOverwrite(), source, new String[] {"uuid", "113878822765691"});
    addAnnotation(getRule_Deactivate(), source, new String[] {"uuid", "113878822765692"});
    addAnnotation(staticRuleEClass, source, new String[] {"uuid", "113878822765693"});
    addAnnotation(getStaticRule_TargetPath(), source, new String[] {"uuid", "113878822765694"});
    addAnnotation(expressionBasedRuleEClass, source, new String[] {"uuid", "113672129781278"});
    addAnnotation(getExpressionBasedRule_MatchExpression(), source, new String[] {"uuid",
            "113672129782879"});
    addAnnotation(getExpressionBasedRule_MatchExpression(), 1, "http://www.topcased.org/uuid",
            new String[] {"uuid", "1138859646437117"});
    addAnnotation(getExpressionBasedRule_MatchExpression(), 1, "http://www.topcased.org/uuid",
            new String[] {"uuid", "1138859646437117"});
    addAnnotation(getExpressionBasedRule_TargetPathExpression(), source, new String[] {"uuid",
            "113672129782880"});
    addAnnotation(getExpressionBasedRule_TargetPathExpression(), 1, "http://www.topcased.org/uuid",
            new String[] {"uuid", "1138859646437122"});
    addAnnotation(getExpressionBasedRule_TargetPathExpression(), 1, "http://www.topcased.org/uuid",
            new String[] {"uuid", "1138859646437122"});
    addAnnotation(generatorEClass, source, new String[] {"uuid", "113672105540666"});
    addAnnotation((EOperation)generatorEClass.getEOperations().get(0), source, new String[] {
            "uuid", "113672120854673"});
    addAnnotation((EParameter)((EOperation)generatorEClass.getEOperations().get(0))
            .getEParameters().get(0), source, new String[] {"uuid", "113672289210977"});
    addAnnotation((EParameter)((EOperation)generatorEClass.getEOperations().get(0))
            .getEParameters().get(1), source, new String[] {"uuid", "113672289210978"});
    addAnnotation((EParameter)((EOperation)generatorEClass.getEOperations().get(0))
            .getEParameters().get(2), source, new String[] {"uuid", "1136795172375105"});
    addAnnotation(getGenerator_Root(), source, new String[] {"uuid", "113672221104686"});
    addAnnotation(getGenerator_Name(), source, new String[] {"uuid", "1138788227656122"});
    addAnnotation(delegatingGeneratorEClass, source, new String[] {"uuid", "1138788227656123"});
    addAnnotation(getDelegatingGenerator_Delegate(), source, new String[] {"uuid",
            "1138788227656124"});
    addAnnotation(initialGeneratorEClass, source, new String[] {"uuid", "1137441848828180"});
    addAnnotation(domTransformerEClass, source, new String[] {"uuid", "1138792484562225"});
    addAnnotation(getDomTransformer_Transformations(), source, new String[] {"uuid",
            "1138792632343228"});
    addAnnotation(getDomTransformer_Encoding(), source, new String[] {"uuid", "1138859750437164"});
    addAnnotation(getDomTransformer_ForceEncoding(), source, new String[] {"uuid",
            "1138859750437165"});
    addAnnotation(getDomTransformer_NamespaceURI(), source, new String[] {"uuid",
            "1138860266515197"});
    addAnnotation(getDomTransformer_QualifiedName(), source, new String[] {"uuid",
            "1138859750437166"});
    addAnnotation(getDomTransformer_PublicID(), source, new String[] {"uuid", "1138860266515194"});
    addAnnotation(getDomTransformer_SystemID(), source, new String[] {"uuid", "1138860266515195"});
    addAnnotation(getDomTransformer_ForceDocType(), source, new String[] {"uuid",
            "1138860266515196"});
    addAnnotation(getDomTransformer_Indent(), source, new String[] {"uuid", "1138859973281176"});
    addAnnotation(getDomTransformer_Indenting(), source, new String[] {"uuid", "1138859973281177"});
    addAnnotation(getDomTransformer_LineWidth(), source, new String[] {"uuid", "1138859973281178"});
    addAnnotation(getDomTransformer_LineSeparator(), source, new String[] {"uuid",
            "1138859973281179"});
    addAnnotation(getDomTransformer_PreserveEmptyAttributes(), source, new String[] {"uuid",
            "1138859973281180"});
    addAnnotation(getDomTransformer_PreserveSpace(), source, new String[] {"uuid",
            "1138859994093191"});
    addAnnotation(getDomTransformer_ForceFormatting(), source, new String[] {"uuid",
            "1138860971937209"});
    addAnnotation(domTransformationEClass, source, new String[] {"uuid", "1138792538890228"});
    addAnnotation((EOperation)domTransformationEClass.getEOperations().get(0), source,
            new String[] {"uuid", "1138795739467159"});
    addAnnotation((EParameter)((EOperation)domTransformationEClass.getEOperations().get(0))
            .getEParameters().get(0), source, new String[] {"uuid", "1138795838842162"});
    addAnnotation((EParameter)((EOperation)domTransformationEClass.getEOperations().get(0))
            .getEParameters().get(1), source, new String[] {"uuid", "1138795838842163"});
    addAnnotation((EParameter)((EOperation)domTransformationEClass.getEOperations().get(0))
            .getEParameters().get(2), source, new String[] {"uuid", "1138795838842164"});
    addAnnotation(getDomTransformation_Transformer(), source, new String[] {"uuid",
            "1138792632343232"});
    addAnnotation(getDomTransformation_Label(), source, new String[] {"uuid", "1138797323014174"});
    addAnnotation(staticFileInitializerEClass, source, new String[] {"uuid", "1138788227656133"});
    addAnnotation(getStaticFileInitializer_Lines(), source, new String[] {"uuid",
            "1138788227656134"});
    addAnnotation(lineEClass, source, new String[] {"uuid", "1138788227656135"});
    addAnnotation(getLine_Content(), source, new String[] {"uuid", "1138788227656136"});
    addAnnotation(getLine_StaticFileInitializer(), source,
            new String[] {"uuid", "1138788227656137"});
    addAnnotation(projectInitializerEClass, source, new String[] {"uuid", "1138788227671138"});
    addAnnotation(projectInitializationProviderEClass, source, new String[] {"uuid",
            "1138788227671139"});
    addAnnotation(inputEClass, source, new String[] {"uuid", "11367080429534"});
    addAnnotation(getInput_Root(), source, new String[] {"uuid", "1136887070625153"});
    addAnnotation(getInput_Label(), source, new String[] {"uuid", "1136894756921162"});
    addAnnotation(getInput_FullPath(), source, new String[] {"uuid", "113678603343715"});
    addAnnotation(getInput_ContentProvider(), source, new String[] {"uuid", "113671857948412"});
    addAnnotation(getInput_RuleSets(), source, new String[] {"uuid", "11367219081719"});
    addAnnotation(classLoaderEDataType, source, new String[] {"uuid", "113670815921825"});
    addAnnotation(iPathEDataType, source, new String[] {"uuid", "113670815921825"});
    addAnnotation(javaListEDataType, source, new String[] {"uuid", "113671579193769"});
    addAnnotation(outputStreamEDataType, source, new String[] {"uuid", "1138788227671167"});
    addAnnotation(exceptionEDataType, source, new String[] {"uuid", "1138788227671168"});
    addAnnotation(coreExceptionEDataType, source, new String[] {"uuid", "1136792315343141"});
    addAnnotation(iProgressMonitorEDataType, source, new String[] {"uuid", "1136792315343142"});
    addAnnotation(domDocumentEDataType, source, new String[] {"uuid", "1138795838842228"});
  }

  /**
   * Initializes the annotations for <b>http://www.sympedia.com/2006/celleditor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createCelleditorAnnotations()
  {
    String source = "http://www.sympedia.com/2006/celleditor";
    addAnnotation(getExpressionBasedRule_MatchExpression(), source, new String[] {"editor.id",
            "com.sympedia.Multiline"});
    addAnnotation(getExpressionBasedRule_MatchExpression(), 1, "http://www.topcased.org/uuid",
            new String[] {"uuid", "1138859646437117"});
    addAnnotation(getExpressionBasedRule_MatchExpression(), 1, "http://www.topcased.org/uuid",
            new String[] {"uuid", "1138859646437117"});
    addAnnotation(getExpressionBasedRule_TargetPathExpression(), source, new String[] {"editor.id",
            "com.sympedia.Multiline"});
    addAnnotation(getExpressionBasedRule_TargetPathExpression(), 1, "http://www.topcased.org/uuid",
            new String[] {"uuid", "1138859646437122"});
    addAnnotation(getExpressionBasedRule_TargetPathExpression(), 1, "http://www.topcased.org/uuid",
            new String[] {"uuid", "1138859646437122"});
  }

} //GenfwPackageImpl

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
package com.sympedia.genfw.util;


import com.sympedia.genfw.*;

import com.sympedia.genfw.ContentProvider;
import com.sympedia.genfw.Context;
import com.sympedia.genfw.DelegatingGenerator;
import com.sympedia.genfw.DomContentProvider;
import com.sympedia.genfw.DomTransformation;
import com.sympedia.genfw.DomTransformer;
import com.sympedia.genfw.EcoreContentProvider;
import com.sympedia.genfw.ExpressionBasedRule;
import com.sympedia.genfw.GenApp;
import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.Generator;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.GenfwPackage
 * @generated
 */
public class GenfwAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GenfwPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenfwAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GenfwPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch the delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenfwSwitch modelSwitch = new GenfwSwitch()
  {
    public Object caseGenLib(GenLib object)
    {
      return createGenLibAdapter();
    }

    public Object caseGenApp(GenApp object)
    {
      return createGenAppAdapter();
    }

    public Object caseLifeCycle(LifeCycle object)
    {
      return createLifeCycleAdapter();
    }

    public Object caseContentProvider(ContentProvider object)
    {
      return createContentProviderAdapter();
    }

    public Object caseEcoreContentProvider(EcoreContentProvider object)
    {
      return createEcoreContentProviderAdapter();
    }

    public Object casePropertiesContentProvider(PropertiesContentProvider object)
    {
      return createPropertiesContentProviderAdapter();
    }

    public Object caseRuleSet(RuleSet object)
    {
      return createRuleSetAdapter();
    }

    public Object caseRule(Rule object)
    {
      return createRuleAdapter();
    }

    public Object caseStaticRule(StaticRule object)
    {
      return createStaticRuleAdapter();
    }

    public Object caseExpressionBasedRule(ExpressionBasedRule object)
    {
      return createExpressionBasedRuleAdapter();
    }

    public Object caseGenerator(Generator object)
    {
      return createGeneratorAdapter();
    }

    public Object caseDelegatingGenerator(DelegatingGenerator object)
    {
      return createDelegatingGeneratorAdapter();
    }

    public Object caseDomTransformer(DomTransformer object)
    {
      return createDomTransformerAdapter();
    }

    public Object caseDomTransformation(DomTransformation object)
    {
      return createDomTransformationAdapter();
    }

    public Object caseInitialGenerator(InitialGenerator object)
    {
      return createInitialGeneratorAdapter();
    }

    public Object caseStaticFileInitializer(StaticFileInitializer object)
    {
      return createStaticFileInitializerAdapter();
    }

    public Object caseLine(Line object)
    {
      return createLineAdapter();
    }

    public Object caseProjectInitializer(ProjectInitializer object)
    {
      return createProjectInitializerAdapter();
    }

    public Object caseProjectInitializationProvider(ProjectInitializationProvider object)
    {
      return createProjectInitializationProviderAdapter();
    }

    public Object caseInput(Input object)
    {
      return createInputAdapter();
    }

    public Object caseContext(Context object)
    {
      return createContextAdapter();
    }

    public Object caseDomContentProvider(DomContentProvider object)
    {
      return createDomContentProviderAdapter();
    }

    public Object caseIdentityGenerator(IdentityGenerator object)
    {
      return createIdentityGeneratorAdapter();
    }

    public Object defaultCase(EObject object)
    {
      return createEObjectAdapter();
    }
  };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  public Adapter createAdapter(Notifier target)
  {
    return (Adapter)modelSwitch.doSwitch((EObject)target);
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.GenLib <em>Gen Lib</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.GenLib
   * @generated
   */
  public Adapter createGenLibAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.GenApp <em>Gen App</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.GenApp
   * @generated
   */
  public Adapter createGenAppAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.LifeCycle <em>Life Cycle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.LifeCycle
   * @generated
   */
  public Adapter createLifeCycleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ContentProvider <em>Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ContentProvider
   * @generated
   */
  public Adapter createContentProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.EcoreContentProvider <em>Ecore Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.EcoreContentProvider
   * @generated
   */
  public Adapter createEcoreContentProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.PropertiesContentProvider <em>Properties Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.PropertiesContentProvider
   * @generated
   */
  public Adapter createPropertiesContentProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.RuleSet <em>Rule Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.RuleSet
   * @generated
   */
  public Adapter createRuleSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.StaticRule <em>Static Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.StaticRule
   * @generated
   */
  public Adapter createStaticRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ExpressionBasedRule <em>Expression Based Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ExpressionBasedRule
   * @generated
   */
  public Adapter createExpressionBasedRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.Generator <em>Generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.Generator
   * @generated
   */
  public Adapter createGeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.DelegatingGenerator <em>Delegating Generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.DelegatingGenerator
   * @generated
   */
  public Adapter createDelegatingGeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.DomTransformer <em>Dom Transformer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.DomTransformer
   * @generated
   */
  public Adapter createDomTransformerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.DomTransformation <em>Dom Transformation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.DomTransformation
   * @generated
   */
  public Adapter createDomTransformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.InitialGenerator <em>Initial Generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.InitialGenerator
   * @generated
   */
  public Adapter createInitialGeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.StaticFileInitializer <em>Static File Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.StaticFileInitializer
   * @generated
   */
  public Adapter createStaticFileInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.Line <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.Line
   * @generated
   */
  public Adapter createLineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ProjectInitializer <em>Project Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ProjectInitializer
   * @generated
   */
  public Adapter createProjectInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.ProjectInitializationProvider <em>Project Initialization Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.ProjectInitializationProvider
   * @generated
   */
  public Adapter createProjectInitializationProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.DomContentProvider <em>Dom Content Provider</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.DomContentProvider
   * @generated
   */
  public Adapter createDomContentProviderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.sympedia.genfw.IdentityGenerator <em>Identity Generator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.sympedia.genfw.IdentityGenerator
   * @generated
   */
  public Adapter createIdentityGeneratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GenfwAdapterFactory

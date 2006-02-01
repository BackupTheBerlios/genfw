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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.sympedia.genfw.GenfwPackage
 * @generated
 */
public class GenfwSwitch
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GenfwPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenfwSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GenfwPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public Object doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List eSuperTypes = theEClass.getESuperTypes();
      return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch((EClass)eSuperTypes.get(0),
              theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected Object doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
    case GenfwPackage.GEN_LIB:
    {
      GenLib genLib = (GenLib)theEObject;
      Object result = caseGenLib(genLib);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.GEN_APP:
    {
      GenApp genApp = (GenApp)theEObject;
      Object result = caseGenApp(genApp);
      if (result == null) result = caseGenLib(genApp);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.CONTENT_PROVIDER:
    {
      ContentProvider contentProvider = (ContentProvider)theEObject;
      Object result = caseContentProvider(contentProvider);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.ECORE_CONTENT_PROVIDER:
    {
      EcoreContentProvider ecoreContentProvider = (EcoreContentProvider)theEObject;
      Object result = caseEcoreContentProvider(ecoreContentProvider);
      if (result == null) result = caseContentProvider(ecoreContentProvider);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.PROPERTIES_CONTENT_PROVIDER:
    {
      PropertiesContentProvider propertiesContentProvider = (PropertiesContentProvider)theEObject;
      Object result = casePropertiesContentProvider(propertiesContentProvider);
      if (result == null) result = caseContentProvider(propertiesContentProvider);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.RULE_SET:
    {
      RuleSet ruleSet = (RuleSet)theEObject;
      Object result = caseRuleSet(ruleSet);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.RULE:
    {
      Rule rule = (Rule)theEObject;
      Object result = caseRule(rule);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.STATIC_RULE:
    {
      StaticRule staticRule = (StaticRule)theEObject;
      Object result = caseStaticRule(staticRule);
      if (result == null) result = caseRule(staticRule);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.EXPRESSION_BASED_RULE:
    {
      ExpressionBasedRule expressionBasedRule = (ExpressionBasedRule)theEObject;
      Object result = caseExpressionBasedRule(expressionBasedRule);
      if (result == null) result = caseRule(expressionBasedRule);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.GENERATOR:
    {
      Generator generator = (Generator)theEObject;
      Object result = caseGenerator(generator);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.DELEGATING_GENERATOR:
    {
      DelegatingGenerator delegatingGenerator = (DelegatingGenerator)theEObject;
      Object result = caseDelegatingGenerator(delegatingGenerator);
      if (result == null) result = caseGenerator(delegatingGenerator);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.DOM_TRANSFORMER:
    {
      DomTransformer domTransformer = (DomTransformer)theEObject;
      Object result = caseDomTransformer(domTransformer);
      if (result == null) result = caseGenerator(domTransformer);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.DOM_TRANSFORMATION:
    {
      DomTransformation domTransformation = (DomTransformation)theEObject;
      Object result = caseDomTransformation(domTransformation);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.INITIAL_GENERATOR:
    {
      InitialGenerator initialGenerator = (InitialGenerator)theEObject;
      Object result = caseInitialGenerator(initialGenerator);
      if (result == null) result = caseDelegatingGenerator(initialGenerator);
      if (result == null) result = caseGenerator(initialGenerator);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.STATIC_FILE_INITIALIZER:
    {
      StaticFileInitializer staticFileInitializer = (StaticFileInitializer)theEObject;
      Object result = caseStaticFileInitializer(staticFileInitializer);
      if (result == null) result = caseGenerator(staticFileInitializer);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.LINE:
    {
      Line line = (Line)theEObject;
      Object result = caseLine(line);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.PROJECT_INITIALIZER:
    {
      ProjectInitializer projectInitializer = (ProjectInitializer)theEObject;
      Object result = caseProjectInitializer(projectInitializer);
      if (result == null) result = caseGenerator(projectInitializer);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.PROJECT_INITIALIZATION_PROVIDER:
    {
      ProjectInitializationProvider projectInitializationProvider = (ProjectInitializationProvider)theEObject;
      Object result = caseProjectInitializationProvider(projectInitializationProvider);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    case GenfwPackage.INPUT:
    {
      Input input = (Input)theEObject;
      Object result = caseInput(input);
      if (result == null) result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Gen Lib</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Gen Lib</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseGenLib(GenLib object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Gen App</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Gen App</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseGenApp(GenApp object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Content Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Content Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseContentProvider(ContentProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Ecore Content Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Ecore Content Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseEcoreContentProvider(EcoreContentProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Properties Content Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Properties Content Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object casePropertiesContentProvider(PropertiesContentProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Rule Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Rule Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseRuleSet(RuleSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Static Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Static Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseStaticRule(StaticRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Expression Based Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Expression Based Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseExpressionBasedRule(ExpressionBasedRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Generator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseGenerator(Generator object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Delegating Generator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Delegating Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDelegatingGenerator(DelegatingGenerator object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Dom Transformer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Dom Transformer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDomTransformer(DomTransformer object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Dom Transformation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Dom Transformation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDomTransformation(DomTransformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Initial Generator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Initial Generator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseInitialGenerator(InitialGenerator object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Static File Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Static File Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseStaticFileInitializer(StaticFileInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseLine(Line object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Project Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Project Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseProjectInitializer(ProjectInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Project Initialization Provider</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Project Initialization Provider</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseProjectInitializationProvider(ProjectInitializationProvider object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseInput(Input object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public Object defaultCase(EObject object)
  {
    return null;
  }

} //GenfwSwitch

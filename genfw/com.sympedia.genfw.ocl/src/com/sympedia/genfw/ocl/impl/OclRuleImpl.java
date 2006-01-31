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
package com.sympedia.genfw.ocl.impl;


import com.sympedia.genfw.impl.ExpressionBasedRuleImpl;
import com.sympedia.genfw.ocl.OclPackage;
import com.sympedia.genfw.ocl.OclRule;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ocl.expressions.OclExpression;
import org.eclipse.emf.ocl.expressions.util.ExpressionsUtil;
import org.eclipse.emf.ocl.parser.EcoreEnvironmentFactory;
import org.eclipse.emf.ocl.parser.Environment;
import org.eclipse.emf.ocl.query.Query;
import org.eclipse.emf.ocl.query.QueryFactory;

import java.util.Map;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OclRuleImpl extends ExpressionBasedRuleImpl implements OclRule
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OclRuleImpl()
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
    return OclPackage.Literals.OCL_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Registry getPackageRegistry() throws Exception
  {
    return EPackage.Registry.INSTANCE;
  }

  /**
   * @throws Exception 
   * @ADDED
   */
  @Override
  protected boolean evaluateMatchExpression(Object inputObject, String expr) throws Exception
  {
    Boolean result = (Boolean)evaluateQuery(inputObject, expr);
    return result.booleanValue();
  }

  /**
   * @ADDED
   */
  @Override
  public String getTargetPath(Object inputObject) throws Exception
  {
    String expr = getTargetPathExpression();
    if (expr == null || expr.length() == 0) return null;

    String result = (String)evaluateQuery(inputObject, expr);
    return result;
  }

  /**
   * @ADDED
   */
  protected Object evaluateQuery(Object inputObject, String expr) throws Exception
  {
    EObject eObject = (EObject)inputObject;
    EClass eClass = eObject.eClass();

    Registry packageRegistry = getPackageRegistry();
    EcoreEnvironmentFactory factory = new EcoreEnvironmentFactory(packageRegistry);
    Environment env = factory.createClassifierContext(eClass);
    OclExpression ast = ExpressionsUtil.createInvariant(env, expr, true);

    Map extentMap = factory.createExtentMap(eObject);
    Query query = QueryFactory.eINSTANCE.createQuery(ast);
    query.setExtentMap(extentMap);

    Object result = query.evaluate(eObject);
    return result;
  }
} //OclRuleImpl

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
package com.sympedia.density.gen.deploy.util;


import com.sympedia.density.gen.deploy.*;

import com.sympedia.density.gen.deploy.BooleanParameter;
import com.sympedia.density.gen.deploy.CharParameter;
import com.sympedia.density.gen.deploy.Container;
import com.sympedia.density.gen.deploy.Creator;
import com.sympedia.density.gen.deploy.Dependency;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.DeploymentGroup;
import com.sympedia.density.gen.deploy.DoubleParameter;
import com.sympedia.density.gen.deploy.FloatParameter;
import com.sympedia.density.gen.deploy.IntegerParameter;
import com.sympedia.density.gen.deploy.Listener;
import com.sympedia.density.gen.deploy.LongParameter;
import com.sympedia.density.gen.deploy.Parameter;
import com.sympedia.density.gen.deploy.Reference;
import com.sympedia.density.gen.deploy.StringParameter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import java.util.List;


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
 * @see com.sympedia.density.gen.deploy.DeployPackage
 * @generated
 */
public class DeploySwitch
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DeployPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploySwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DeployPackage.eINSTANCE;
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
      case DeployPackage.CONTAINER:
      {
        Container container = (Container)theEObject;
        Object result = caseContainer(container);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.DEPLOYMENT:
      {
        Deployment deployment = (Deployment)theEObject;
        Object result = caseDeployment(deployment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.DEPLOYMENT_GROUP:
      {
        DeploymentGroup deploymentGroup = (DeploymentGroup)theEObject;
        Object result = caseDeploymentGroup(deploymentGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        Object result = caseParameter(parameter);
        if (result == null) result = caseDependency(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.DEPENDENCY:
      {
        Dependency dependency = (Dependency)theEObject;
        Object result = caseDependency(dependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        Object result = caseReference(reference);
        if (result == null) result = caseDependency(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.INTEGER_PARAMETER:
      {
        IntegerParameter integerParameter = (IntegerParameter)theEObject;
        Object result = caseIntegerParameter(integerParameter);
        if (result == null) result = caseParameter(integerParameter);
        if (result == null) result = caseDependency(integerParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.LONG_PARAMETER:
      {
        LongParameter longParameter = (LongParameter)theEObject;
        Object result = caseLongParameter(longParameter);
        if (result == null) result = caseParameter(longParameter);
        if (result == null) result = caseDependency(longParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.FLOAT_PARAMETER:
      {
        FloatParameter floatParameter = (FloatParameter)theEObject;
        Object result = caseFloatParameter(floatParameter);
        if (result == null) result = caseParameter(floatParameter);
        if (result == null) result = caseDependency(floatParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.DOUBLE_PARAMETER:
      {
        DoubleParameter doubleParameter = (DoubleParameter)theEObject;
        Object result = caseDoubleParameter(doubleParameter);
        if (result == null) result = caseParameter(doubleParameter);
        if (result == null) result = caseDependency(doubleParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.BOOLEAN_PARAMETER:
      {
        BooleanParameter booleanParameter = (BooleanParameter)theEObject;
        Object result = caseBooleanParameter(booleanParameter);
        if (result == null) result = caseParameter(booleanParameter);
        if (result == null) result = caseDependency(booleanParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.STRING_PARAMETER:
      {
        StringParameter stringParameter = (StringParameter)theEObject;
        Object result = caseStringParameter(stringParameter);
        if (result == null) result = caseParameter(stringParameter);
        if (result == null) result = caseDependency(stringParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.CHAR_PARAMETER:
      {
        CharParameter charParameter = (CharParameter)theEObject;
        Object result = caseCharParameter(charParameter);
        if (result == null) result = caseParameter(charParameter);
        if (result == null) result = caseDependency(charParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.CREATOR:
      {
        Creator creator = (Creator)theEObject;
        Object result = caseCreator(creator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DeployPackage.LISTENER:
      {
        Listener listener = (Listener)theEObject;
        Object result = caseListener(listener);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default:
        return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseContainer(Container object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Deployment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Deployment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDeployment(Deployment object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Deployment Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Deployment Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDeploymentGroup(DeploymentGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDependency(Dependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Integer Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Integer Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseIntegerParameter(IntegerParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Long Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Long Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseLongParameter(LongParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Float Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Float Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseFloatParameter(FloatParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Double Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Double Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseDoubleParameter(DoubleParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Boolean Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Boolean Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseBooleanParameter(BooleanParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>String Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>String Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseStringParameter(StringParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Char Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Char Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseCharParameter(CharParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Creator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Creator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseCreator(Creator object)
  {
    return null;
  }

  /**
   * Returns the result of interpretting the object as an instance of '<em>Listener</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpretting the object as an instance of '<em>Listener</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public Object caseListener(Listener object)
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

} //DeploySwitch

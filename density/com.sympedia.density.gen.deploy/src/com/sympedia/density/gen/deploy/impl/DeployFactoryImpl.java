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
package com.sympedia.density.gen.deploy.impl;


import com.sympedia.density.gen.deploy.*;

import com.sympedia.density.gen.deploy.BooleanParameter;
import com.sympedia.density.gen.deploy.CharParameter;
import com.sympedia.density.gen.deploy.Container;
import com.sympedia.density.gen.deploy.Creator;
import com.sympedia.density.gen.deploy.DeployFactory;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.DeploymentGroup;
import com.sympedia.density.gen.deploy.DeploymentType;
import com.sympedia.density.gen.deploy.DoubleParameter;
import com.sympedia.density.gen.deploy.FloatParameter;
import com.sympedia.density.gen.deploy.IntegerParameter;
import com.sympedia.density.gen.deploy.Listener;
import com.sympedia.density.gen.deploy.LongParameter;
import com.sympedia.density.gen.deploy.Reference;
import com.sympedia.density.gen.deploy.StringParameter;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DeployFactoryImpl extends EFactoryImpl implements DeployFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeployFactory init()
  {
    try
    {
      DeployFactory theDeployFactory = (DeployFactory)EPackage.Registry.INSTANCE
              .getEFactory("http://deploy");
      if (theDeployFactory != null)
      {
        return theDeployFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DeployFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployFactoryImpl()
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
      case DeployPackage.CONTAINER:
        return createContainer();
      case DeployPackage.DEPLOYMENT:
        return createDeployment();
      case DeployPackage.DEPLOYMENT_GROUP:
        return createDeploymentGroup();
      case DeployPackage.REFERENCE:
        return createReference();
      case DeployPackage.INTEGER_PARAMETER:
        return createIntegerParameter();
      case DeployPackage.LONG_PARAMETER:
        return createLongParameter();
      case DeployPackage.FLOAT_PARAMETER:
        return createFloatParameter();
      case DeployPackage.DOUBLE_PARAMETER:
        return createDoubleParameter();
      case DeployPackage.BOOLEAN_PARAMETER:
        return createBooleanParameter();
      case DeployPackage.STRING_PARAMETER:
        return createStringParameter();
      case DeployPackage.CHAR_PARAMETER:
        return createCharParameter();
      case DeployPackage.CREATOR:
        return createCreator();
      case DeployPackage.LISTENER:
        return createListener();
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
      case DeployPackage.DEPLOYMENT_TYPE:
        return createDeploymentTypeFromString(eDataType, initialValue);
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
      case DeployPackage.DEPLOYMENT_TYPE:
        return convertDeploymentTypeToString(eDataType, instanceValue);
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
  public Container createContainer()
  {
    ContainerImpl container = new ContainerImpl();
    return container;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Deployment createDeployment()
  {
    DeploymentImpl deployment = new DeploymentImpl();
    return deployment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentGroup createDeploymentGroup()
  {
    DeploymentGroupImpl deploymentGroup = new DeploymentGroupImpl();
    return deploymentGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerParameter createIntegerParameter()
  {
    IntegerParameterImpl integerParameter = new IntegerParameterImpl();
    return integerParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongParameter createLongParameter()
  {
    LongParameterImpl longParameter = new LongParameterImpl();
    return longParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatParameter createFloatParameter()
  {
    FloatParameterImpl floatParameter = new FloatParameterImpl();
    return floatParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleParameter createDoubleParameter()
  {
    DoubleParameterImpl doubleParameter = new DoubleParameterImpl();
    return doubleParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanParameter createBooleanParameter()
  {
    BooleanParameterImpl booleanParameter = new BooleanParameterImpl();
    return booleanParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringParameter createStringParameter()
  {
    StringParameterImpl stringParameter = new StringParameterImpl();
    return stringParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CharParameter createCharParameter()
  {
    CharParameterImpl charParameter = new CharParameterImpl();
    return charParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Creator createCreator()
  {
    CreatorImpl creator = new CreatorImpl();
    return creator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Listener createListener()
  {
    ListenerImpl listener = new ListenerImpl();
    return listener;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentType createDeploymentTypeFromString(EDataType eDataType, String initialValue)
  {
    DeploymentType result = DeploymentType.get(initialValue);
    if (result == null)
      throw new IllegalArgumentException("The value '" + initialValue
              + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDeploymentTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployPackage getDeployPackage()
  {
    return (DeployPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  public static DeployPackage getPackage()
  {
    return DeployPackage.eINSTANCE;
  }

} //DeployFactoryImpl

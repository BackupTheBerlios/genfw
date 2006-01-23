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
package com.sympedia.density.gen.deploy;


import org.eclipse.emf.common.util.AbstractEnumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Deployment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.deploy.DeployPackage#getDeploymentType()
 * @model
 * @generated
 */
public final class DeploymentType extends AbstractEnumerator
{
  /**
   * The '<em><b>Singleton</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Singleton</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SINGLETON_LITERAL
   * @model name="Singleton"
   *        annotation="http://www.topcased.org/uuid uuid='113507788573459'"
   * @generated
   * @ordered
   */
  public static final int SINGLETON = 0;

  /**
   * The '<em><b>Lazy Singleton</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Lazy Singleton</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LAZY_SINGLETON_LITERAL
   * @model name="LazySingleton"
   *        annotation="http://www.topcased.org/uuid uuid='113507788573460'"
   * @generated
   * @ordered
   */
  public static final int LAZY_SINGLETON = 1;

  /**
   * The '<em><b>Prototype</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Prototype</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROTOTYPE_LITERAL
   * @model name="Prototype"
   *        annotation="http://www.topcased.org/uuid uuid='113507788573461'"
   * @generated
   * @ordered
   */
  public static final int PROTOTYPE = 2;

  /**
   * The '<em><b>Singleton</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SINGLETON
   * @generated
   * @ordered
   */
  public static final DeploymentType SINGLETON_LITERAL = new DeploymentType(SINGLETON, "Singleton",
          "Singleton");

  /**
   * The '<em><b>Lazy Singleton</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LAZY_SINGLETON
   * @generated
   * @ordered
   */
  public static final DeploymentType LAZY_SINGLETON_LITERAL = new DeploymentType(LAZY_SINGLETON,
          "LazySingleton", "LazySingleton");

  /**
   * The '<em><b>Prototype</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROTOTYPE
   * @generated
   * @ordered
   */
  public static final DeploymentType PROTOTYPE_LITERAL = new DeploymentType(PROTOTYPE, "Prototype",
          "Prototype");

  /**
   * An array of all the '<em><b>Deployment Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DeploymentType[] VALUES_ARRAY = new DeploymentType[] {SINGLETON_LITERAL,
          LAZY_SINGLETON_LITERAL, PROTOTYPE_LITERAL,};

  /**
   * A public read-only list of all the '<em><b>Deployment Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Deployment Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeploymentType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DeploymentType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Deployment Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeploymentType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DeploymentType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Deployment Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DeploymentType get(int value)
  {
    switch (value)
    {
      case SINGLETON:
        return SINGLETON_LITERAL;
      case LAZY_SINGLETON:
        return LAZY_SINGLETON_LITERAL;
      case PROTOTYPE:
        return PROTOTYPE_LITERAL;
    }
    return null;
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DeploymentType(int value, String name, String literal)
  {
    super(value, name, literal);
  }

} //DeploymentType

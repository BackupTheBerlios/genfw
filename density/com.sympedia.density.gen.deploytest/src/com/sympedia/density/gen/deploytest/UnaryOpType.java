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
package com.sympedia.density.gen.deploytest;


import org.eclipse.emf.common.util.AbstractEnumerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unary Op Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getUnaryOpType()
 * @model
 * @generated
 */
public final class UnaryOpType extends AbstractEnumerator
{
  /**
   * The '<em><b>False</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>False</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FALSE_LITERAL
   * @model name="False"
   *        annotation="http://www.topcased.org/uuid uuid='1136016888140162'"
   * @generated
   * @ordered
   */
  public static final int FALSE = 0;

  /**
   * The '<em><b>Identity</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Identity</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IDENTITY_LITERAL
   * @model name="Identity"
   *        annotation="http://www.topcased.org/uuid uuid='1136016888156163'"
   * @generated
   * @ordered
   */
  public static final int IDENTITY = 1;

  /**
   * The '<em><b>Not</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Not</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_LITERAL
   * @model name="Not"
   *        annotation="http://www.topcased.org/uuid uuid='1136018057796174'"
   * @generated
   * @ordered
   */
  public static final int NOT = 2;

  /**
   * The '<em><b>True</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>True</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRUE_LITERAL
   * @model name="True"
   *        annotation="http://www.topcased.org/uuid uuid='1136018057796175'"
   * @generated
   * @ordered
   */
  public static final int TRUE = 3;

  /**
   * The '<em><b>False</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FALSE
   * @generated
   * @ordered
   */
  public static final UnaryOpType FALSE_LITERAL = new UnaryOpType(FALSE, "False", "False");

  /**
   * The '<em><b>Identity</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IDENTITY
   * @generated
   * @ordered
   */
  public static final UnaryOpType IDENTITY_LITERAL = new UnaryOpType(IDENTITY, "Identity",
          "Identity");

  /**
   * The '<em><b>Not</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT
   * @generated
   * @ordered
   */
  public static final UnaryOpType NOT_LITERAL = new UnaryOpType(NOT, "Not", "Not");

  /**
   * The '<em><b>True</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRUE
   * @generated
   * @ordered
   */
  public static final UnaryOpType TRUE_LITERAL = new UnaryOpType(TRUE, "True", "True");

  /**
   * An array of all the '<em><b>Unary Op Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UnaryOpType[] VALUES_ARRAY = new UnaryOpType[] {FALSE_LITERAL,
          IDENTITY_LITERAL, NOT_LITERAL, TRUE_LITERAL,};

  /**
   * A public read-only list of all the '<em><b>Unary Op Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Unary Op Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UnaryOpType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UnaryOpType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unary Op Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UnaryOpType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      UnaryOpType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Unary Op Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UnaryOpType get(int value)
  {
    switch (value)
    {
      case FALSE:
        return FALSE_LITERAL;
      case IDENTITY:
        return IDENTITY_LITERAL;
      case NOT:
        return NOT_LITERAL;
      case TRUE:
        return TRUE_LITERAL;
    }
    return null;
  }

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private UnaryOpType(int value, String name, String literal)
  {
    super(value, name, literal);
  }

} //UnaryOpType

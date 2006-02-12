/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw;


import java.util.Set;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.Context#getRuntime <em>Runtime</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.GenfwPackage#getContext()
 * @model annotation="http://www.topcased.org/uuid uuid='1139667148578308'"
 * @generated
 */
public interface Context extends EObject
{
  /**
   * Returns the value of the '<em><b>Runtime</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Runtime</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runtime</em>' reference.
   * @see com.sympedia.genfw.GenfwPackage#getContext_Runtime()
   * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1139667207078311'"
   * @generated
   */
  GenApp getRuntime();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model fullPathAnnotation="http://www.topcased.org/uuid uuid='1139669532859311'"
   *        annotation="http://www.topcased.org/uuid uuid='1139669390750308'"
   * @generated
   */
  void addInputPath(String fullPath);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model fullPathAnnotation="http://www.topcased.org/uuid uuid='1139669532859315'"
   *        annotation="http://www.topcased.org/uuid uuid='1139669390750309'"
   * @generated
   */
  void addTargetPath(String fullPath);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" dataType="com.sympedia.genfw.PathSet"
   *        annotation="http://www.topcased.org/uuid uuid='1139669390750310'"
   * @generated
   */
  Set getInputPaths();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" dataType="com.sympedia.genfw.PathSet"
   *        annotation="http://www.topcased.org/uuid uuid='1139669390750311'"
   * @generated
   */
  Set getTargetPaths();

} // Context

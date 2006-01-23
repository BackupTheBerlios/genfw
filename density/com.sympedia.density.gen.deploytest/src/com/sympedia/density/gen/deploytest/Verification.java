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


import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploytest.Verification#getSpecLabel <em>Spec Label</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Verification#getId <em>Id</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Verification#getContainerOverride <em>Container Override</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Verification#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Verification#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploytest.Verification#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getVerification()
 * @model annotation="http://www.topcased.org/uuid uuid='113597425729674'"
 * @generated
 */
public interface Verification extends TestCaseSpec
{
  /**
   * Returns the value of the '<em><b>Container Override</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container Override</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container Override</em>' reference.
   * @see #setContainerOverride(ContainerOverride)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getVerification_ContainerOverride()
   * @model annotation="http://www.topcased.org/uuid uuid='113597473971890'"
   * @generated
   */
  ContainerOverride getContainerOverride();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Verification#getContainerOverride <em>Container Override</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container Override</em>' reference.
   * @see #getContainerOverride()
   * @generated
   */
  void setContainerOverride(ContainerOverride value);

  /**
   * Returns the value of the '<em><b>Assertions</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploytest.Assertion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertions</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertions</em>' reference list.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getVerification_Assertions()
   * @model type="com.sympedia.density.gen.deploytest.Assertion" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='113597473971889'"
   * @generated
   */
  EList getAssertions();

  /**
   * Returns the value of the '<em><b>Initialization</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Initialization#getVerifications <em>Verifications</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' container reference.
   * @see #setInitialization(Initialization)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getVerification_Initialization()
   * @see com.sympedia.density.gen.deploytest.Initialization#getVerifications
   * @model opposite="verifications"
   *        annotation="http://www.topcased.org/uuid uuid='1135975027703115'"
   * @generated
   */
  Initialization getInitialization();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Verification#getInitialization <em>Initialization</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' container reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(Initialization value);

  /**
   * Returns the value of the '<em><b>Execution</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploytest.Execution#getVerifications <em>Verifications</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Execution</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Execution</em>' container reference.
   * @see #setExecution(Execution)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getVerification_Execution()
   * @see com.sympedia.density.gen.deploytest.Execution#getVerifications
   * @model opposite="verifications"
   *        annotation="http://www.topcased.org/uuid uuid='113597473971891'"
   * @generated
   */
  Execution getExecution();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Verification#getExecution <em>Execution</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Execution</em>' container reference.
   * @see #getExecution()
   * @generated
   */
  void setExecution(Execution value);

  /**
   * Returns the value of the '<em><b>Spec Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spec Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spec Label</em>' attribute.
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getVerification_SpecLabel()
   * @model transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='1136032886484183'"
   * @generated
   */
  String getSpecLabel();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.sympedia.density.gen.deploytest.DeploytestPackage#getVerification_Id()
   * @model id="true" required="true"
   *        annotation="http://www.topcased.org/uuid uuid='1137045199218210'"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploytest.Verification#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Verification

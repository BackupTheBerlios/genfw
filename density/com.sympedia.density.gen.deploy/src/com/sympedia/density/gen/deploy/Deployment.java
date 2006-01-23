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


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getComponent <em>Component</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getId <em>Id</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getType <em>Type</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#isSingleton <em>Singleton</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#isLazy <em>Lazy</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#isPrototype <em>Prototype</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getContainer <em>Container</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getDeploymentGroup <em>Deployment Group</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getCreators <em>Creators</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getListeners <em>Listeners</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getReferers <em>Referers</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getRoot <em>Root</em>}</li>
 *   <li>{@link com.sympedia.density.gen.deploy.Deployment#getDepends <em>Depends</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment()
 * @model annotation="http://www.topcased.org/uuid uuid='11350778856408'"
 * @generated
 */
public interface Deployment extends EObject
{
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
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Id()
   * @model id="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788564010'"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Deployment#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The default value is <code>"Singleton"</code>.
   * The literals are from the enumeration {@link com.sympedia.density.gen.deploy.DeploymentType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.sympedia.density.gen.deploy.DeploymentType
   * @see #setType(DeploymentType)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Type()
   * @model default="Singleton"
   *        annotation="http://www.topcased.org/uuid uuid='113507788564011'"
   * @generated
   */
  DeploymentType getType();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Deployment#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.sympedia.density.gen.deploy.DeploymentType
   * @see #getType()
   * @generated
   */
  void setType(DeploymentType value);

  /**
   * Returns the value of the '<em><b>Container</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Container#getDeployments <em>Deployments</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Container</em>' container reference.
   * @see #setContainer(Container)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Container()
   * @see com.sympedia.density.gen.deploy.Container#getDeployments
   * @model opposite="deployments"
   *        annotation="http://www.topcased.org/uuid uuid='113507788565616'"
   * @generated
   */
  Container getContainer();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Deployment#getContainer <em>Container</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Container</em>' container reference.
   * @see #getContainer()
   * @generated
   */
  void setContainer(Container value);

  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(EClass)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Component()
   * @model required="true"
   *        annotation="http://www.topcased.org/uuid uuid='11350778856409'"
   * @generated
   */
  EClass getComponent();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Deployment#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(EClass value);

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.Dependency}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Dependency#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Dependencies()
   * @see com.sympedia.density.gen.deploy.Dependency#getDeployment
   * @model type="com.sympedia.density.gen.deploy.Dependency" opposite="deployment" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788565618'"
   * @generated
   */
  EList getDependencies();

  /**
   * Returns the value of the '<em><b>Creators</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.Creator}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Creator#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Creators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Creators</em>' containment reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Creators()
   * @see com.sympedia.density.gen.deploy.Creator#getDeployment
   * @model type="com.sympedia.density.gen.deploy.Creator" opposite="deployment" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788565619'"
   * @generated
   */
  EList getCreators();

  /**
   * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.Listener}.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.Listener#getDeployment <em>Deployment</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listeners</em>' containment reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Listeners()
   * @see com.sympedia.density.gen.deploy.Listener#getDeployment
   * @model type="com.sympedia.density.gen.deploy.Listener" opposite="deployment" containment="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788565620'"
   * @generated
   */
  EList getListeners();

  /**
   * Returns the value of the '<em><b>Referers</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.Deployment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referers</em>' reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Referers()
   * @model type="com.sympedia.density.gen.deploy.Deployment" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788565621'"
   * @generated
   */
  EList getReferers();

  /**
   * Returns the value of the '<em><b>Root</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' reference.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Root()
   * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788565622'"
   * @generated
   */
  Container getRoot();

  /**
   * Returns the value of the '<em><b>Depends</b></em>' reference list.
   * The list contents are of type {@link com.sympedia.density.gen.deploy.Deployment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Depends</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends</em>' reference list.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Depends()
   * @model type="com.sympedia.density.gen.deploy.Deployment"
   *        annotation="http://www.topcased.org/uuid uuid='113568774160969'"
   * @generated
   */
  EList getDepends();

  /**
   * Returns the value of the '<em><b>Deployment Group</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link com.sympedia.density.gen.deploy.DeploymentGroup#getDeployments <em>Deployments</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment Group</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment Group</em>' container reference.
   * @see #setDeploymentGroup(DeploymentGroup)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_DeploymentGroup()
   * @see com.sympedia.density.gen.deploy.DeploymentGroup#getDeployments
   * @model opposite="deployments"
   *        annotation="http://www.topcased.org/uuid uuid='113507788565617'"
   * @generated
   */
  DeploymentGroup getDeploymentGroup();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Deployment#getDeploymentGroup <em>Deployment Group</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deployment Group</em>' container reference.
   * @see #getDeploymentGroup()
   * @generated
   */
  void setDeploymentGroup(DeploymentGroup value);

  /**
   * Returns the value of the '<em><b>Singleton</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Singleton</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Singleton</em>' attribute.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Singleton()
   * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788564012'"
   * @generated
   */
  boolean isSingleton();

  /**
   * Returns the value of the '<em><b>Lazy</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lazy</em>' attribute.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Lazy()
   * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788564013'"
   * @generated
   */
  boolean isLazy();

  /**
   * Returns the value of the '<em><b>Prototype</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prototype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prototype</em>' attribute.
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Prototype()
   * @model default="true" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788564014'"
   * @generated
   */
  boolean isPrototype();

  /**
   * Returns the value of the '<em><b>Initialized</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialized</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialized</em>' attribute.
   * @see #setInitialized(boolean)
   * @see com.sympedia.density.gen.deploy.DeployPackage#getDeployment_Initialized()
   * @model default="true"
   *        annotation="http://www.topcased.org/uuid uuid='113507788565615'"
   * @generated
   */
  boolean isInitialized();

  /**
   * Sets the value of the '{@link com.sympedia.density.gen.deploy.Deployment#isInitialized <em>Initialized</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialized</em>' attribute.
   * @see #isInitialized()
   * @generated
   */
  void setInitialized(boolean value);

} // Deployment

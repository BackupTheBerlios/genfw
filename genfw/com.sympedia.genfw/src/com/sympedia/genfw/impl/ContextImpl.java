/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw.impl;


import com.sympedia.genfw.Context;
import com.sympedia.genfw.GenApp;
import com.sympedia.genfw.GenfwPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import java.util.HashSet;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.impl.ContextImpl#getRuntime <em>Runtime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextImpl extends EObjectImpl implements Context
{
  /**
   * @ADDED
   */
  private GenApp runtime;

  /**
   * @ADDED
   */
  private Set inputPaths = new HashSet();

  /**
   * @ADDED
   */
  private Set targetPaths = new HashSet();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextImpl()
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
    return GenfwPackage.Literals.CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public GenApp getRuntime()
  {
    return runtime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void addInputPath(String fullPath)
  {
    if (fullPath != null) inputPaths.add(fullPath);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void addTargetPath(String fullPath)
  {
    if (fullPath != null) targetPaths.add(fullPath);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Set getInputPaths()
  {
    return inputPaths;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Set getTargetPaths()
  {
    return targetPaths;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case GenfwPackage.CONTEXT__RUNTIME:
      return getRuntime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case GenfwPackage.CONTEXT__RUNTIME:
      return getRuntime() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * @ADDED
   */
  public void setRuntime(GenApp runtime)
  {
    this.runtime = runtime;
  }
} //ContextImpl

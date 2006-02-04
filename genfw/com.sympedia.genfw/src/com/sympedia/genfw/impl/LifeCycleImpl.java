/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw.impl;


import com.sympedia.genfw.GenApp;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.LifeCycle;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class LifeCycleImpl extends EObjectImpl implements LifeCycle
{
  /**
   * @ADDED
   */
  private GenApp runtimeGenApp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LifeCycleImpl()
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
    return GenfwPackage.Literals.LIFE_CYCLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public final void initialize(GenApp genapp) throws Exception
  {
    if (!isInitialized())
    {
      System.out.println("Initializing " + this);
      runtimeGenApp = genapp;
      doInitialize();
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public final void dispose(GenApp genapp)
  {
    if (isInitialized())
    {
      try
      {
        System.out.println("Disposing " + this);
        doDispose();
      }
      catch (Exception ignore)
      {
      }

      runtimeGenApp = null;
    }
  }

  /**
   * @ADDED
   */
  protected void doInitialize() throws Exception
  {
    // Intentionally left empty
  }

  /**
   * @ADDED
   */
  protected void doDispose() throws Exception
  {
    // Intentionally left empty
  }

  /**
   * @ADDED
   */
  protected GenApp getRuntimeGenApp()
  {
    return runtimeGenApp;
  }

  /**
   * @ADDED
   */
  protected boolean isInitialized()
  {
    return runtimeGenApp != null;
  }
} //LifeCycleImpl

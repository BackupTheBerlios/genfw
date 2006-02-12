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
package com.sympedia.genfw.impl;


import com.sympedia.genfw.Context;
import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.LifeCycle;
import com.sympedia.util.emf.EcoreHelper;

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
  private Context context;

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
  public final void initialize(Context context) throws Exception
  {
    if (!isInitialized())
    {
      System.out.println("Initializing " + this);
      this.context = context;
      String fullPath = EcoreHelper.getFullPath(eResource().getURI());
      context.addInputPath(fullPath);
      doInitialize();
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public final void dispose()
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

      context = null;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public abstract GenLib getRoot();

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
  protected Context getContext()
  {
    return context;
  }

  /**
   * @ADDED
   */
  protected boolean isInitialized()
  {
    return context != null;
  }
} //LifeCycleImpl

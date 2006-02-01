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


import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.PropertiesContentProvider;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PropertiesContentProviderImpl extends ContentProviderImpl implements
        PropertiesContentProvider
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertiesContentProviderImpl()
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
    return GenfwPackage.Literals.PROPERTIES_CONTENT_PROVIDER;
  }

  /**
   * @ADDED
   */
  @Override
  public List getRoots(String path) throws Exception
  {
    Properties properties = new Properties();
    IResource resource = ResourcesHelper.ROOT.findMember(path);
    if (resource != null && resource.exists())
    {
      if (resource instanceof IFile)
      {
        IFile file = (IFile)resource;
        properties.load(file.getContents());
      }
      else
      {
        throw new IllegalArgumentException("Target path is not a file");
      }
    }

    return new ArrayList(properties.entrySet());
  }

  /**
   * @ADDED
   */
  @Override
  public List getChildren(Object object) throws Exception
  {
    return Collections.EMPTY_LIST;
  }
} //PropertiesContentProviderImpl

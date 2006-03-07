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
import com.sympedia.genfw.IProjectInitializationProvider;
import com.sympedia.genfw.ProjectInitializer;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProjectInitializerImpl extends GeneratorImpl implements ProjectInitializer
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectInitializerImpl()
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
    return GenfwPackage.Literals.PROJECT_INITIALIZER;
  }

  /**
   * @ADDED
   */
  @Override
  public byte[] doGenerate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    getContext().addTargetPath(targetPath + "/.project");
    if (inputObject instanceof IProjectInitializationProvider)
    {
      IProjectInitializationProvider provider = (IProjectInitializationProvider)inputObject;
      String projectName = provider.getProjectNameToInitialize();
      if (projectName == null || projectName.length() == 0) return null;

      IProject project = ResourcesHelper.ROOT.getProject(projectName);
      if (project != null && project.exists()) return null;

      System.out.println("Creating project " + projectName);
      project.create(monitor);
      if (!project.isOpen())
      {
        project.open(monitor);
      }

      List<String> builderIds = provider.getBuilderIdsToInitialize();
      if (builderIds != null)
      {
        for (String builderId : builderIds)
        {
          if (builderId != null && builderId.length() != 0)
          {
            System.out.println("Adding builder " + builderId + " to project " + projectName);
            ResourcesHelper.addBuilderToProject(builderId, project, monitor);
          }
        }
      }

      List<String> natureIds = provider.getNatureIdsToInitialize();
      if (natureIds != null)
      {
        for (String natureId : natureIds)
        {
          if (natureId != null && natureId.length() != 0)
          {
            System.out.println("Adding nature " + natureId + " to project " + projectName);
            ResourcesHelper.addNatureToProject(natureId, project, monitor);
          }
        }
      }
    }

    return null;
  }
} //ProjectInitializerImpl

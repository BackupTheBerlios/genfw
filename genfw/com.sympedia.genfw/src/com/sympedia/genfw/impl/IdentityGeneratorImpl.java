/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw.impl;


import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.IdentityGenerator;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identity Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IdentityGeneratorImpl extends GeneratorImpl implements IdentityGenerator
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentityGeneratorImpl()
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
    return GenfwPackage.Literals.IDENTITY_GENERATOR;
  }

  /**
   * @ADDED
   */
  @Override
  public byte[] doGenerate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    if (targetPath == null || targetPath.length() == 0) return null;
    IResource resource = ResourcesHelper.ROOT.findMember(new Path(targetPath));
    if (resource == null || !(resource instanceof IFile)) return null;

    byte[] result = ResourcesHelper.readFileIntoByteArray((IFile)resource);
    return result;
  }
} //IdentityGeneratorImpl

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw.jmerge.impl;


import com.sympedia.genfw.Generator;
import com.sympedia.genfw.impl.DelegatingGeneratorImpl;
import com.sympedia.genfw.jmerge.JmergePackage;
import com.sympedia.genfw.jmerge.PropertyMerger;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;

import java.io.FileInputStream;
import java.io.InputStream;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Merger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PropertyMergerImpl extends DelegatingGeneratorImpl implements PropertyMerger
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyMergerImpl()
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
    return JmergePackage.Literals.PROPERTY_MERGER;
  }

  /**
   * @ADDED
   */
  public byte[] doGenerate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    Generator delegate = getDelegate();
    if (delegate == null) return null;

    byte[] result = delegate.generate(inputObject, targetPath, monitor);
    if (result == null) return null;

    IResource resource = ResourcesHelper.ROOT.findMember(targetPath);
    if (resource == null || !resource.exists()) return result;
    InputStream existingContent = new FileInputStream(resource.getLocation().toFile());

    org.eclipse.emf.codegen.merge.properties.PropertyMerger merger = new org.eclipse.emf.codegen.merge.properties.PropertyMerger();
    merger.setSourceProperties(new String(result));
    merger.setTargetProperties(merger.createPropertiesForInputStream(existingContent));
    merger.merge();
    return merger.getTargetProperties().getBytes();
  }
} //PropertyMergerImpl

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
package com.sympedia.genfw.internal;


import com.sympedia.genfw.IExternalLibraryInitializer;
import com.sympedia.genfw.util.GenAppManager;
import com.sympedia.util.BeanHelper;
import com.sympedia.util.ImplementationError;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleContext;

import java.util.ArrayList;
import java.util.List;


/**
 * This is the central singleton for the Genfw edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class GenfwActivator extends EMFPlugin
{
  /**
   * @ADDED
   */
  public static final String PLUGIN_ID = "com.sympedia.genfw";

  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final GenfwActivator INSTANCE = new GenfwActivator();

  /**
   * Keep track of the singleton.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static Implementation plugin;

  /**
   * Create the instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenfwActivator()
  {
    super(new ResourceLocator[] {});
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public ResourceLocator getPluginResourceLocator()
  {
    return plugin;
  }

  /**
   * Returns the singleton instance of the Eclipse plugin.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the singleton instance.
   * @generated
   */
  public static Implementation getPlugin()
  {
    return plugin;
  }

  /**
   * The actual implementation of the Eclipse <b>Plugin</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static class Implementation extends EclipsePlugin
  {
    /**
     * Creates an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Implementation()
    {
      super();

      // Remember the static instance.
      //
      plugin = this;
    }

    /**
     * @ADDED
     */
    public ClassLoader getBundleClassLoader(String bundleId)
    {
      for (ExternalLibrary library : ExternalLibrariesRegistry.INSTANCE
              .getAllExternalLibraryElements())
      {
        if (library.getOrigin().getNamespaceIdentifier().equals(bundleId))
        {
          try
          {
            IExternalLibraryInitializer initializer = library.getLibraryInitializer();
            if (initializer == null) throw new ImplementationError();
            ClassLoader classLoader = initializer.getClass().getClassLoader();
            return classLoader;
          }
          catch (Exception ex)
          {
            log(ex);
          }
        }
      }

      return null;
    }

    /**
     * @ADDED
     */
    public List<EClass> getContentProviders()
    {
      List<EClass> result = new ArrayList<EClass>();
      for (ContentProvider element : ContentProvidersRegistry.INSTANCE
              .getAllContentProviderElements())
      {
        result.add(getEClass(element.getClassifierName(), element.getPackageURI()));
      }

      return result;
    }

    /**
     * @ADDED
     */
    public List<EClass> getGenerators()
    {
      List<EClass> result = new ArrayList<EClass>();
      for (Generator element : GeneratorsRegistry.INSTANCE.getAllGeneratorElements())
      {
        result.add(getEClass(element.getClassifierName(), element.getPackageURI()));
      }

      return result;
    }

    /**
     * @ADDED
     */
    public List<EClass> getRules()
    {
      List<EClass> result = new ArrayList<EClass>();
      for (Rule element : RulesRegistry.INSTANCE.getAllRuleElements())
      {
        result.add(getEClass(element.getClassifierName(), element.getPackageURI()));
      }

      return result;
    }

    /**
     * @ADDED
     */
    public List<EClass> getDomTransformations()
    {
      List<EClass> result = new ArrayList<EClass>();
      for (DomTransformation element : DomTransformationsRegistry.INSTANCE
              .getAllDomTransformationElements())
      {
        result.add(getEClass(element.getClassifierName(), element.getPackageURI()));
      }

      return result;
    }

    /**
     * @ADDED
     */
    @Override
    public void start(BundleContext context) throws Exception
    {
      super.start(context);
      ContentProvidersRegistry.INSTANCE.initialize();
      DomTransformationsRegistry.INSTANCE.initialize();
      ExternalLibrariesRegistry.INSTANCE.initialize();
      GeneratorsRegistry.INSTANCE.initialize();
      RulesRegistry.INSTANCE.initialize();
    }

    /**
     * @ADDED
     */
    @Override
    public void stop(BundleContext context) throws Exception
    {
      BeanHelper.dispose(GenAppManager.INSTANCE);
      ContentProvidersRegistry.INSTANCE.dispose();
      DomTransformationsRegistry.INSTANCE.dispose();
      ExternalLibrariesRegistry.INSTANCE.dispose();
      GeneratorsRegistry.INSTANCE.dispose();
      RulesRegistry.INSTANCE.dispose();
      super.stop(context);
    }

    /**
     * @ADDED
     */
    private EClass getEClass(String classifierName, String packageURI)
    {
      try
      {
        EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(packageURI);
        if (ePackage == null)
        {
          throw new IllegalArgumentException("Package " + packageURI
                  + " not found in global registry");
        }

        EClassifier classifier = ePackage.getEClassifier(classifierName);
        if (classifier == null)
        {
          throw new IllegalArgumentException("Classifier " + classifierName
                  + " not found in package" + ePackage.getName());
        }

        if (!(classifier instanceof EClass))
        {
          throw new IllegalArgumentException("Classifier " + classifierName + " is not an EClass");
        }

        return (EClass)classifier;
      }
      catch (Exception ex)
      {
        log(ex);
      }

      return null;
    }
  }
}

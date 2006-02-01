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


import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.util.GenAppManager;
import com.sympedia.util.BeanHelper;
import com.sympedia.util.ImplementationError;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * This is the central singleton for the Genfw model plugin.
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
   * @ADDED
   */
  public static final String EXTERNAL_LIBRARIES_EXTPOINT = PLUGIN_ID + ".externalLibraries";

  /**
   * @ADDED
   */
  public static final String CONTENT_PROVIDERS_EXTPOINT = PLUGIN_ID + ".contentProviders";

  /**
   * @ADDED
   */
  public static final String GENERATORS_EXTPOINT = PLUGIN_ID + ".generators";

  /**
   * @ADDED
   */
  public static final String RULES_EXTPOINT = PLUGIN_ID + ".rules";

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
     * @ADDED
     */
    private Map<String, ClassLoader> bundleClassLoaders = new HashMap<String, ClassLoader>();

    /**
     * @ADDED
     */
    private List<EClass> contentProviders = new ArrayList<EClass>();

    /**
     * @ADDED
     */
    private List<EClass> generators = new ArrayList<EClass>();

    /**
     * @ADDED
     */
    private List<EClass> rules = new ArrayList<EClass>();

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
    public Map<String, ClassLoader> getBundleClassLoaders()
    {
      return bundleClassLoaders;
    }

    /**
     * @ADDED
     */
    public List<EClass> getContentProviders()
    {
      return contentProviders;
    }

    /**
     * @ADDED
     */
    public List<EClass> getGenerators()
    {
      return generators;
    }

    /**
     * @ADDED
     */
    public List<EClass> getRules()
    {
      return rules;
    }

    /**
     * @ADDED
     */
    @Override
    public void start(BundleContext context) throws Exception
    {
      super.start(context);
      processExternalLibraries();
      processExtensions();
    }

    /**
     * @ADDED
     */
    @Override
    public void stop(BundleContext context) throws Exception
    {
      BeanHelper.dispose(GenAppManager.INSTANCE);
      super.stop(context);
    }

    /**
     * @ADDED
     */
    private void processExternalLibraries()
    {
      IExtension[] extensions = getExtensions(EXTERNAL_LIBRARIES_EXTPOINT);
      for (IExtension extension : extensions)
      {
        IConfigurationElement[] configurationElements = extension.getConfigurationElements();
        for (IConfigurationElement element : configurationElements)
        {
          try
          {
            Object initializer = element.createExecutableExtension("libraryInitializer");
            if (initializer == null) throw new ImplementationError();
            ClassLoader classLoader = initializer.getClass().getClassLoader();
            String bundleId = extension.getNamespace();
            bundleClassLoaders.put(bundleId, classLoader);
          }
          catch (Exception ex)
          {
            GenfwActivator.INSTANCE.log(ex);
          }
        }
      }
    }

    /**
     * @ADDED
     */
    private void processExtensions()
    {
      final GenfwPackage genfw = GenfwPackage.eINSTANCE;
      EClass[] dimensions = {genfw.getContentProvider(), genfw.getGenerator(), genfw.getRule()};
      String[] extpointIds = {CONTENT_PROVIDERS_EXTPOINT, GENERATORS_EXTPOINT, RULES_EXTPOINT};
      List[] results = {contentProviders, generators, rules};

      for (int i = 0; i < dimensions.length; i++)
      {
        processExtensions(dimensions[i], extpointIds[i], results[i]);
      }
    }

    /**
     * @ADDED
     */
    private void processExtensions(EClass dimension, String extpointId, List<EClass> result)
    {
      IExtension[] extensions = getExtensions(extpointId);
      for (IExtension extension : extensions)
      {
        IConfigurationElement[] configurationElements = extension.getConfigurationElements();
        for (IConfigurationElement element : configurationElements)
        {
          try
          {
            String classifierName = getAttribute(element, "classifierName");
            String packageURI = getAttribute(element, "packageURI");

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
              throw new IllegalArgumentException("Classifier " + classifierName
                      + " is not an EClass");
            }

            EClass eClass = (EClass)classifier;
            if (!dimension.isSuperTypeOf(eClass))
            {
              throw new IllegalArgumentException("Class " + classifierName + " does not implement "
                      + dimension.getName());
            }

            result.add(eClass);
          }
          catch (Exception ex)
          {
            GenfwActivator.INSTANCE.log(ex);
          }
        }
      }
    }

    /**
     * @ADDED
     */
    private IExtension[] getExtensions(String extpointID)
    {
      IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
      IExtensionPoint extensionPoint = extensionRegistry.getExtensionPoint(extpointID);
      if (extensionPoint == null) throw new ImplementationError();
      return extensionPoint.getExtensions();
    }

    /**
     * @ADDED
     */
    private String getAttribute(IConfigurationElement element, String name)
    {
      String value = element.getAttribute(name);
      if (value == null || value.length() == 0)
      {
        throw new IllegalArgumentException("Attribute " + element.getName() + "." + name
                + " is not set");
      }

      return value;
    }
  }
}

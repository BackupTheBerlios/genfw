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
package com.sympedia.genfw.jet.impl;


import com.sympedia.genfw.jet.EcoreTemplate;
import com.sympedia.genfw.jet.JetPackage;
import com.sympedia.genfw.jet.internal.Activator;
import com.sympedia.util.BeanHelper;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl;
import org.eclipse.emf.codegen.ecore.templates.edit.ItemProvider;
import org.eclipse.emf.codegen.ecore.templates.edit.ItemProviderAdapterFactory;
import org.eclipse.emf.codegen.ecore.templates.editor.ActionBarContributor;
import org.eclipse.emf.codegen.ecore.templates.editor.Advisor;
import org.eclipse.emf.codegen.ecore.templates.editor.Editor;
import org.eclipse.emf.codegen.ecore.templates.editor.ModelWizard;
import org.eclipse.emf.codegen.ecore.templates.model.AdapterFactoryClass;
import org.eclipse.emf.codegen.ecore.templates.model.FactoryClass;
import org.eclipse.emf.codegen.ecore.templates.model.PackageClass;
import org.eclipse.emf.codegen.ecore.templates.model.Plugin;
import org.eclipse.emf.codegen.ecore.templates.model.PluginProperties;
import org.eclipse.emf.codegen.ecore.templates.model.ResourceClass;
import org.eclipse.emf.codegen.ecore.templates.model.ResourceFactoryClass;
import org.eclipse.emf.codegen.ecore.templates.model.SwitchClass;
import org.eclipse.emf.codegen.ecore.templates.model.ValidatorClass;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ecore Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jet.impl.EcoreTemplateImpl#isGenerateInterface <em>Generate Interface</em>}</li>
 *   <li>{@link com.sympedia.genfw.jet.impl.EcoreTemplateImpl#isGenerateImplementation <em>Generate Implementation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcoreTemplateImpl extends JetTemplateImpl implements EcoreTemplate
{
  /**
   * The default value of the '{@link #isGenerateInterface() <em>Generate Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenerateInterface()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_INTERFACE_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isGenerateInterface() <em>Generate Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenerateInterface()
   * @generated
   * @ordered
   */
  protected boolean generateInterface = GENERATE_INTERFACE_EDEFAULT;

  /**
   * The default value of the '{@link #isGenerateImplementation() <em>Generate Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenerateImplementation()
   * @generated
   * @ordered
   */
  protected static final boolean GENERATE_IMPLEMENTATION_EDEFAULT = true;

  /**
   * The cached value of the '{@link #isGenerateImplementation() <em>Generate Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isGenerateImplementation()
   * @generated
   * @ordered
   */
  protected boolean generateImplementation = GENERATE_IMPLEMENTATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EcoreTemplateImpl()
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
    return JetPackage.Literals.ECORE_TEMPLATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGenerateInterface()
  {
    return generateInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenerateInterface(boolean newGenerateInterface)
  {
    boolean oldGenerateInterface = generateInterface;
    generateInterface = newGenerateInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              JetPackage.ECORE_TEMPLATE__GENERATE_INTERFACE, oldGenerateInterface,
              generateInterface));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isGenerateImplementation()
  {
    return generateImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGenerateImplementation(boolean newGenerateImplementation)
  {
    boolean oldGenerateImplementation = generateImplementation;
    generateImplementation = newGenerateImplementation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
              JetPackage.ECORE_TEMPLATE__GENERATE_IMPLEMENTATION, oldGenerateImplementation,
              generateImplementation));
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
    case JetPackage.ECORE_TEMPLATE__GENERATE_INTERFACE:
      return isGenerateInterface() ? Boolean.TRUE : Boolean.FALSE;
    case JetPackage.ECORE_TEMPLATE__GENERATE_IMPLEMENTATION:
      return isGenerateImplementation() ? Boolean.TRUE : Boolean.FALSE;
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case JetPackage.ECORE_TEMPLATE__GENERATE_INTERFACE:
      setGenerateInterface(((Boolean)newValue).booleanValue());
      return;
    case JetPackage.ECORE_TEMPLATE__GENERATE_IMPLEMENTATION:
      setGenerateImplementation(((Boolean)newValue).booleanValue());
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case JetPackage.ECORE_TEMPLATE__GENERATE_INTERFACE:
      setGenerateInterface(GENERATE_INTERFACE_EDEFAULT);
      return;
    case JetPackage.ECORE_TEMPLATE__GENERATE_IMPLEMENTATION:
      setGenerateImplementation(GENERATE_IMPLEMENTATION_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
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
    case JetPackage.ECORE_TEMPLATE__GENERATE_INTERFACE:
      return generateInterface != GENERATE_INTERFACE_EDEFAULT;
    case JetPackage.ECORE_TEMPLATE__GENERATE_IMPLEMENTATION:
      return generateImplementation != GENERATE_IMPLEMENTATION_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (generateInterface: ");
    result.append(generateInterface);
    result.append(", generateImplementation: ");
    result.append(generateImplementation);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  public byte[] doGenerate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    GenBase genBase = (GenBase)inputObject;
    GenModel genModel = genBase.getGenModel();
    genModel.setCanGenerate(true);

    ClassLoader inputClassLoader = genBase.getClass().getClassLoader();
    ClassLoader templateClassLoader = getRoot().getClassLoader(inputClassLoader);
    Class template = getTemplate(templateClassLoader);
    if (template == null)
    {
      throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR,
              "Template not found for " + this, null));
    }

    ImportManager importManager = createImportManager(genBase, template);
    if (importManager != null)
    {
      Method setter = BeanHelper.findMethod(genModel.getClass(), "setImportManager");
      setter.setAccessible(true);
      setter.invoke(genModel, new Object[] {importManager});
      setter.setAccessible(false);// TODO try/finally
    }

    if (genBase instanceof GenPackageImpl)
    {
      Class genPackageClass = GenPackageImpl.class;
      Class depHelperClass = Class.forName(genPackageClass.getName() + "$DependencyHelper");
      Constructor ctor = depHelperClass.getDeclaredConstructor(new Class[] {genPackageClass});
      ctor.setAccessible(true);
      Object depHelper = ctor.newInstance(new Object[] {genBase});
      ctor.setAccessible(false);// TODO try/finally

      Field field = BeanHelper.findField(genPackageClass, "dependencyHelper");
      field.setAccessible(true);
      field.set(genBase, depHelper);
      field.setAccessible(false);// TODO try/finally
    }

    if (!isGenerateInterface() && !isGenerateImplementation())
    {
      byte[] result = callTemplate(template, genBase);
      return result;
    }
    else
    {
      Boolean genInterface = new Boolean(isGenerateInterface());
      Boolean genImplementation = new Boolean(isGenerateImplementation());
      Object[] argument = new Object[] {genBase, genInterface, genImplementation};
      byte[] result = callTemplate(template, argument);
      return result;
    }
  }

  /**
   * @ADDED
   */
  protected ImportManager createImportManager(GenBase genBase, Class template) throws CoreException
  {
    String templateName = template.getName();
    if (genBase instanceof GenModel)
    {
      GenModel genModel = (GenModel)genBase;
      if (templateName.equals(Plugin.class.getName()))
      {
        String packageName = genModel.getModelPluginPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genModel.getModelPluginClassName());
        return importManager;
      }

      if (templateName.equals(PluginProperties.class.getName()))
      {
        return null;
      }

      if (templateName.equals(org.eclipse.emf.codegen.ecore.templates.edit.Plugin.class.getName()))
      {
        String packageName = genModel.getEditPluginPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genModel.getEditPluginClassName());
        return importManager;
      }

      if (templateName.equals(org.eclipse.emf.codegen.ecore.templates.edit.PluginProperties.class
              .getName()))
      {
        return null;
      }

      if (templateName
              .equals(org.eclipse.emf.codegen.ecore.templates.editor.Plugin.class.getName()))
      {
        String packageName = genModel.getEditorPluginPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genModel.getEditorPluginClassName());
        return importManager;
      }

      if (templateName.equals(org.eclipse.emf.codegen.ecore.templates.editor.PluginProperties.class
              .getName()))
      {
        return null;
      }

      if (templateName.equals(Advisor.class.getName()))
      {
        String packageName = genModel.getEditorPluginPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genModel.getEditorAdvisorClassName());
        return importManager;
      }

    }
    else if (genBase instanceof GenPackage)
    {
      GenPackage genPackage = (GenPackage)genBase;
      if (templateName.equals(PackageClass.class.getName()))
      {
        if (isGenerateImplementation())
        {
          String packageName = genPackage.getClassPackageName();
          ImportManager importManager = new ImportManager(packageName);
          importManager.addMasterImport(packageName, genPackage.getPackageClassName());
          return importManager;
        }

        if (isGenerateInterface())
        {
          String packageName = genPackage.getInterfacePackageName();
          ImportManager importManager = new ImportManager(packageName);
          importManager.addMasterImport(packageName, genPackage.getPackageInterfaceName());
          return importManager;
        }
      }

      if (templateName.equals(FactoryClass.class.getName()))
      {
        if (isGenerateImplementation())
        {
          String packageName = genPackage.getClassPackageName();
          ImportManager importManager = new ImportManager(packageName);
          importManager.addMasterImport(packageName, genPackage.getFactoryClassName());
          return importManager;
        }

        if (isGenerateInterface())
        {
          String packageName = genPackage.getInterfacePackageName();
          ImportManager importManager = new ImportManager(packageName);
          importManager.addMasterImport(packageName, genPackage.getFactoryInterfaceName());
          return importManager;
        }
      }

      if (templateName.equals(AdapterFactoryClass.class.getName()))
      {
        String packageName = genPackage.getUtilitiesPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage.getAdapterFactoryClassName());
        return importManager;
      }

      if (templateName.equals(SwitchClass.class.getName()))
      {
        String packageName = genPackage.getUtilitiesPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage.getSwitchClassName());
        return importManager;
      }

      if (templateName.equals(ValidatorClass.class.getName()))
      {
        String packageName = genPackage.getUtilitiesPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage.getValidatorClassName());
        return importManager;
      }

      if (templateName.equals(ResourceClass.class.getName()))
      {
        String packageName = genPackage.getUtilitiesPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage.getResourceClassName());
        return importManager;
      }

      if (templateName.equals(ResourceFactoryClass.class.getName()))
      {
        String packageName = genPackage.getUtilitiesPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage.getResourceFactoryClassName());
        return importManager;
      }

      if (templateName.equals(ItemProviderAdapterFactory.class.getName()))
      {
        String packageName = genPackage.getProviderPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage
                .getItemProviderAdapterFactoryClassName());
        return importManager;
      }

      if (templateName.equals(ActionBarContributor.class.getName()))
      {
        String packageName = genPackage.getPresentationPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage.getActionBarContributorClassName());
        return importManager;
      }

      if (templateName.equals(Editor.class.getName()))
      {
        String packageName = genPackage.getPresentationPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage.getEditorClassName());
        return importManager;
      }

      if (templateName.equals(ModelWizard.class.getName()))
      {
        String packageName = genPackage.getPresentationPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genPackage.getModelWizardClassName());
        return importManager;
      }
    }
    else if (genBase instanceof GenClass)
    {
      GenClass genClass = (GenClass)genBase;
      GenPackage genPackage = genClass.getGenPackage();

      if (templateName.equals(org.eclipse.emf.codegen.ecore.templates.model.Class.class.getName()))
      {
        if (isGenerateImplementation())
        {
          String packageName = genPackage.getClassPackageName();
          ImportManager importManager = new ImportManager(packageName);
          importManager.addMasterImport(packageName, genClass.getClassName());
          return importManager;
        }

        if (isGenerateInterface())
        {
          String packageName = genPackage.getInterfacePackageName();
          ImportManager importManager = new ImportManager(packageName);
          importManager.addMasterImport(packageName, genClass.getInterfaceName());
          return importManager;
        }
      }

      if (templateName.equals(ItemProvider.class.getName()))
      {
        String packageName = genPackage.getProviderPackageName();
        ImportManager importManager = new ImportManager(packageName);
        importManager.addMasterImport(packageName, genClass.getProviderClassName());
        return importManager;
      }
    }
    else if (genBase instanceof GenEnum)
    {
      GenEnum genEnum = (GenEnum)genBase;
      GenPackage genPackage = genEnum.getGenPackage();

      String packageName = genPackage.getInterfacePackageName();
      ImportManager importManager = new ImportManager(packageName);
      importManager.addMasterImport(packageName, genEnum.getName());
      return importManager;
    }

    throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR,
            "Unable to create ImportManager for " + genBase + ", template=" + templateName, null));
  }
} //EcoreTemplateImpl

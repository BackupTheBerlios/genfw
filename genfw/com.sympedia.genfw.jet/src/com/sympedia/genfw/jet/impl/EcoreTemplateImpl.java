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
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
  @Override
  public String generate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws CoreException
  {
    try
    {
      GenBase genBase = (GenBase)inputObject;
      ImportManager importManager = createImportManager(genBase);

      GenModel genModel = genBase.getGenModel();
      genModel.setCanGenerate(true);

      Method setter = BeanHelper.findMethod(genModel.getClass(), "setImportManager");
      setter.setAccessible(true);
      setter.invoke(genModel, new Object[] {importManager});
      setter.setAccessible(false);

      ClassLoader inputClassLoader = genBase.getClass().getClassLoader();
      Class template = getTemplate(inputClassLoader);
      if (template == null)
      {
        throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR,
                "Template not found for " + this, null));
      }

      if (!isGenerateInterface() && !isGenerateImplementation())
      {
        //              Class shClass = Class.forName("org.eclipse.emf.codegen.ecore.genmodel.impl.GenPackageImpl.SwitchHelper");
        //              Object switchHelper = shClass.newInstance();
        //              Field field = BeanHelper.findField(shClass, "switchHelper");
        //              field.setAccessible(true);
        //              field.set(genBase, switchHelper);
        //              field.setAccessible(false);

        String result = callTemplate(template, genBase);
        return result;
      }
      else
      {
        Boolean genInterface = new Boolean(isGenerateInterface());
        Boolean genImplementation = new Boolean(isGenerateImplementation());
        Object[] argument = new Object[] {genBase, genInterface, genImplementation};
        String result = callTemplate(template, argument);
        return result;
      }
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
      ByteArrayOutputStream stream = new ByteArrayOutputStream();
      PrintStream printer = new PrintStream(stream);
      ex.printStackTrace(printer);
      return stream.toString();
    }
  }

  /**
   * @ADDED
   */
  protected ImportManager createImportManager(GenBase genBase) throws CoreException
  {
    String compilationUnitPackage = null;
    if (genBase instanceof GenPackage)
    {
      compilationUnitPackage = ((GenPackage)genBase).getQualifiedPackageName();
      if (!isGenerateInterface() && !isGenerateImplementation())
      {
        compilationUnitPackage += ".util";
      }
    }
    else if (genBase instanceof GenClassifier)
    {
      compilationUnitPackage = ((GenClassifier)genBase).getGenPackage().getQualifiedPackageName();
    }
    else
    {
      throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.ERROR,
              "Input object is neither GenPackage nor GenClassifier " + genBase, null));
    }

    if (isGenerateImplementation()) compilationUnitPackage += ".impl";
    return new ImportManager(compilationUnitPackage);
  }
} //EcoreTemplateImpl

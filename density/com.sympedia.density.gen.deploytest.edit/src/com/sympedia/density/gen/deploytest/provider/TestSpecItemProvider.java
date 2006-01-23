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
package com.sympedia.density.gen.deploytest.provider;


import com.sympedia.density.gen.deploytest.DeploytestFactory;
import com.sympedia.density.gen.deploytest.DeploytestPackage;
import com.sympedia.density.gen.deploytest.TestSpec;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import java.util.Collection;
import java.util.List;


/**
 * This is the item provider adapter for a {@link com.sympedia.density.gen.deploytest.TestSpec} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TestSpecItemProvider extends NamedElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestSpecItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addPackageNamePropertyDescriptor(object);
      addFixtureInterfacePropertyDescriptor(object);
      addFixtureClassPropertyDescriptor(object);
      addContainerToTestPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Package Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPackageNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_TestSpec_packageName_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_TestSpec_packageName_feature",
                    "_UI_TestSpec_type"), DeploytestPackage.Literals.TEST_SPEC__PACKAGE_NAME, true,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Fixture Interface feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFixtureInterfacePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_TestSpec_fixtureInterface_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_TestSpec_fixtureInterface_feature",
                    "_UI_TestSpec_type"), DeploytestPackage.Literals.TEST_SPEC__FIXTURE_INTERFACE,
            true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Fixture Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFixtureClassPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_TestSpec_fixtureClass_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_TestSpec_fixtureClass_feature",
                    "_UI_TestSpec_type"), DeploytestPackage.Literals.TEST_SPEC__FIXTURE_CLASS,
            true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Container To Test feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addContainerToTestPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_TestSpec_containerToTest_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_TestSpec_containerToTest_feature",
                    "_UI_TestSpec_type"), DeploytestPackage.Literals.TEST_SPEC__CONTAINER_TO_TEST,
            true, null, null, null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(DeploytestPackage.Literals.TEST_SPEC__CONTAINER_OVERRIDES);
      childrenFeatures.add(DeploytestPackage.Literals.TEST_SPEC__ACTION_CONTAINER);
      childrenFeatures.add(DeploytestPackage.Literals.TEST_SPEC__ASSERTION_CONTAINER);
      childrenFeatures.add(DeploytestPackage.Literals.TEST_SPEC__TEST_CASE_SPECS);
      childrenFeatures.add(DeploytestPackage.Literals.TEST_SPEC__TEST_SUITES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns TestSpec.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object)
  {
    return getResourceLocator().getImage("full/obj16/TestSpec");
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getText(Object object)
  {
    String label = ((TestSpec)object).getName();
    return label == null || label.length() == 0 ? getString("_UI_TestSpec_type") : label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(TestSpec.class))
    {
      case DeploytestPackage.TEST_SPEC__PACKAGE_NAME:
      case DeploytestPackage.TEST_SPEC__FIXTURE_INTERFACE:
      case DeploytestPackage.TEST_SPEC__FIXTURE_CLASS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false,
                true));
        return;
      case DeploytestPackage.TEST_SPEC__CONTAINER_OVERRIDES:
      case DeploytestPackage.TEST_SPEC__ACTION_CONTAINER:
      case DeploytestPackage.TEST_SPEC__ASSERTION_CONTAINER:
      case DeploytestPackage.TEST_SPEC__TEST_CASE_SPECS:
      case DeploytestPackage.TEST_SPEC__TEST_SUITES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true,
                false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
   * describing all of the children that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.TEST_SPEC__CONTAINER_OVERRIDES, DeploytestFactory.eINSTANCE
                    .createContainerOverride()));

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.TEST_SPEC__ACTION_CONTAINER, DeploytestFactory.eINSTANCE
                    .createActionContainer()));

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.TEST_SPEC__ASSERTION_CONTAINER, DeploytestFactory.eINSTANCE
                    .createAssertionContainer()));

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.TEST_SPEC__TEST_CASE_SPECS, DeploytestFactory.eINSTANCE
                    .createInitialization()));

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.TEST_SPEC__TEST_CASE_SPECS, DeploytestFactory.eINSTANCE
                    .createExecution()));

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.TEST_SPEC__TEST_CASE_SPECS, DeploytestFactory.eINSTANCE
                    .createVerification()));

    newChildDescriptors.add(createChildParameter(DeploytestPackage.Literals.TEST_SPEC__TEST_SUITES,
            DeploytestFactory.eINSTANCE.createTestSuite()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator()
  {
    return DeploytestEditPlugin.INSTANCE;
  }

}

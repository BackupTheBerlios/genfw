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


import com.sympedia.density.gen.deploytest.AssertionContainer;
import com.sympedia.density.gen.deploytest.DeploytestFactory;
import com.sympedia.density.gen.deploytest.DeploytestPackage;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

import java.util.Collection;
import java.util.List;


/**
 * This is the item provider adapter for a {@link com.sympedia.density.gen.deploytest.AssertionContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertionContainerItemProvider extends NamedElementItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertionContainerItemProvider(AdapterFactory adapterFactory)
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

      addAllAssertionsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the All Assertions feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAllAssertionsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors
            .add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory)
                    .getRootAdapterFactory(), getResourceLocator(),
                    getString("_UI_AssertionContainer_allAssertions_feature"), getString(
                            "_UI_PropertyDescriptor_description",
                            "_UI_AssertionContainer_allAssertions_feature",
                            "_UI_AssertionContainer_type"),
                    DeploytestPackage.Literals.ASSERTION_CONTAINER__ALL_ASSERTIONS, false, null,
                    null, null));
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
      childrenFeatures.add(DeploytestPackage.Literals.ASSERTION_CONTAINER__SUB_CONTAINERS);
      childrenFeatures.add(DeploytestPackage.Literals.ASSERTION_CONTAINER__ASSERTIONS);
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
   * This returns AssertionContainer.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object)
  {
    return getResourceLocator().getImage("full/obj16/AssertionContainer");
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getText(Object object)
  {
    String label = ((AssertionContainer)object).getName();
    return label == null || label.length() == 0 ? getString("_UI_AssertionContainer_type") : label;
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

    switch (notification.getFeatureID(AssertionContainer.class))
    {
      case DeploytestPackage.ASSERTION_CONTAINER__SUB_CONTAINERS:
      case DeploytestPackage.ASSERTION_CONTAINER__ASSERTIONS:
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
            DeploytestPackage.Literals.ASSERTION_CONTAINER__SUB_CONTAINERS,
            DeploytestFactory.eINSTANCE.createAssertionContainer()));

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.ASSERTION_CONTAINER__ASSERTIONS, DeploytestFactory.eINSTANCE
                    .createAssertion()));

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.ASSERTION_CONTAINER__ASSERTIONS, DeploytestFactory.eINSTANCE
                    .createUnaryOpAssertion()));

    newChildDescriptors.add(createChildParameter(
            DeploytestPackage.Literals.ASSERTION_CONTAINER__ASSERTIONS, DeploytestFactory.eINSTANCE
                    .createBinaryOpAssertion()));
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

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
package com.sympedia.density.gen.deploy.provider;


import com.sympedia.density.gen.deploy.Dependency;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import org.eclipse.emf.edit.provider.ViewerNotification;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


/**
 * This is the item provider adapter for a {@link com.sympedia.density.gen.deploy.Dependency} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DependencyItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyItemProvider(AdapterFactory adapterFactory)
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

      addFeaturePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Feature feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected void addFeaturePropertyDescriptor(Object object)
  {
    ItemPropertyDescriptor descriptor = new ItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Dependency_feature_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Dependency_feature_feature",
                    "_UI_Dependency_type"), DeployPackage.eINSTANCE.getDependency_Feature(), true,
            null, null, null)
    {
      protected Collection getComboBoxObjects(Object object)
      {
        Deployment deployment = ((Dependency)object).getDeployment();
        if (deployment == null || deployment.getComponent() == null)
        {
          return Collections.EMPTY_LIST;
        }

        EClass component = deployment.getComponent();
        Collection comboBoxObjects = super.getComboBoxObjects(object);
        for (Iterator it = comboBoxObjects.iterator(); it.hasNext();)
        {
          EStructuralFeature feature = (EStructuralFeature)it.next();
          if (feature != null)
          {
            EClass containingClass = feature.getEContainingClass();
            if (containingClass == null //
                    || !containingClass.isSuperTypeOf(component) //
                    || !isMatching(feature))
            {
              it.remove();
            }
          }
        }

        return comboBoxObjects;
      }
    };

    itemPropertyDescriptors.add(descriptor);
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText(Object object)
  {
    return getString("_UI_Dependency_type");
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

    switch (notification.getFeatureID(Dependency.class))
    {
      case DeployPackage.DEPENDENCY__FEATURE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false,
                true));
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
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator()
  {
    return DeployEditPlugin.INSTANCE;
  }

  /**
   * @ADDED
   */
  protected boolean isMatching(EStructuralFeature feature)
  {
    return false;
  }
}

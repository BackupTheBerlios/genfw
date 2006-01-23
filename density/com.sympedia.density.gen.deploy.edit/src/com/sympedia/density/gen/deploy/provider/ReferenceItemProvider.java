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


import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.Reference;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
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
import java.util.Iterator;
import java.util.List;


/**
 * This is the item provider adapter for a {@link com.sympedia.density.gen.deploy.Reference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferenceItemProvider extends DependencyItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceItemProvider(AdapterFactory adapterFactory)
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

      addTargetPropertyDescriptor(object);
      addListenPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Target feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  protected void addTargetPropertyDescriptor(Object object)
  {
    ItemPropertyDescriptor descriptor = new ItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Reference_target_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Reference_target_feature",
                    "_UI_Reference_type"), DeployPackage.eINSTANCE.getReference_Target(), true,
            null, null, null)
    {
      protected Collection getComboBoxObjects(Object object)
      {
        Reference ref = (Reference)object;
        EClass type = (EClass)ref.getFeature().getEType();
        Collection comboBoxObjects = super.getComboBoxObjects(object);
        for (Iterator it = comboBoxObjects.iterator(); it.hasNext();)
        {
          Deployment deployment = (Deployment)it.next();
          if (deployment != null)
          {
            EClass candidate = deployment.getComponent();
            if (candidate != null)
            {
              if (!type.isSuperTypeOf(candidate))
              {
                it.remove();
              }
            }
          }
        }

        return comboBoxObjects;
      }
    };

    itemPropertyDescriptors.add(descriptor);
  }

  /**
   * This adds a property descriptor for the Listen feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addListenPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Reference_listen_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Reference_listen_feature",
                    "_UI_Reference_type"), DeployPackage.Literals.REFERENCE__LISTEN, true,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This returns Reference.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Object getImage(Object object)
  {
    if (((Reference)object).isListen())
    {
      return getResourceLocator().getImage("full/obj16/ReferenceListener");
    }
    else
    {
      return getResourceLocator().getImage("full/obj16/Reference");
    }
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getText(Object object)
  {
    EStructuralFeature feature = ((Reference)object).getFeature();
    Deployment target = ((Reference)object).getTarget();
    return (feature == null ? getString("_UI_Reference_type") : feature.getName())
            + (target == null ? "" : " -> " + target.getId());
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

    switch (notification.getFeatureID(Reference.class))
    {
      case DeployPackage.REFERENCE__TARGET:
      case DeployPackage.REFERENCE__LISTEN:
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
  @Override
  protected boolean isMatching(EStructuralFeature feature)
  {
    return feature instanceof EReference;
  }
}

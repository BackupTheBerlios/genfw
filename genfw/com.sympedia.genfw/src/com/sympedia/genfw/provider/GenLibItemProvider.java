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
package com.sympedia.genfw.provider;


import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.GenfwFactory;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.internal.GenfwActivator;
import com.sympedia.util.emf.edit.EmfEditHelper;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import java.util.Collection;
import java.util.List;


/**
 * This is the item provider adapter for a {@link com.sympedia.genfw.GenLib} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenLibItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider,
        IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenLibItemProvider(AdapterFactory adapterFactory)
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

    }
    return itemPropertyDescriptors;
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
      childrenFeatures.add(GenfwPackage.Literals.GEN_LIB__CONTENT_PROVIDERS);
      childrenFeatures.add(GenfwPackage.Literals.GEN_LIB__GENERATORS);
      childrenFeatures.add(GenfwPackage.Literals.GEN_LIB__RULE_SETS);
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
   * This returns GenLib.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/GenLib"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText(Object object)
  {
    return getString("_UI_GenLib_type");
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

    switch (notification.getFeatureID(GenLib.class))
    {
    case GenfwPackage.GEN_LIB__CONTENT_PROVIDERS:
    case GenfwPackage.GEN_LIB__GENERATORS:
    case GenfwPackage.GEN_LIB__RULE_SETS:
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
   * @generated NOT
   */
  protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add(createChildParameter(GenfwPackage.Literals.GEN_LIB__CONTENT_PROVIDERS,
            GenfwFactory.eINSTANCE.createDomContentProvider()));

    newChildDescriptors.add(createChildParameter(GenfwPackage.Literals.GEN_LIB__CONTENT_PROVIDERS,
            GenfwFactory.eINSTANCE.createEcoreContentProvider()));

    newChildDescriptors.add(createChildParameter(GenfwPackage.Literals.GEN_LIB__CONTENT_PROVIDERS,
            GenfwFactory.eINSTANCE.createPropertiesContentProvider()));

    EmfEditHelper.collectNewChildDescriptors(newChildDescriptors,
            GenfwPackage.Literals.GEN_LIB__CONTENT_PROVIDERS, GenfwActivator.getPlugin()
                    .getContentProviders());

    newChildDescriptors.add(createChildParameter(GenfwPackage.Literals.GEN_LIB__GENERATORS,
            GenfwFactory.eINSTANCE.createInitialGenerator()));

    newChildDescriptors.add(createChildParameter(GenfwPackage.Literals.GEN_LIB__GENERATORS,
            GenfwFactory.eINSTANCE.createStaticFileInitializer()));

    newChildDescriptors.add(createChildParameter(GenfwPackage.Literals.GEN_LIB__GENERATORS,
            GenfwFactory.eINSTANCE.createProjectInitializer()));

    newChildDescriptors.add(createChildParameter(GenfwPackage.Literals.GEN_LIB__GENERATORS,
            GenfwFactory.eINSTANCE.createDomTransformer()));

    EmfEditHelper.collectNewChildDescriptors(newChildDescriptors,
            GenfwPackage.Literals.GEN_LIB__GENERATORS, GenfwActivator.getPlugin().getGenerators());

    newChildDescriptors.add(createChildParameter(GenfwPackage.Literals.GEN_LIB__RULE_SETS,
            GenfwFactory.eINSTANCE.createRuleSet()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator()
  {
    return GenfwActivator.INSTANCE;
  }

}

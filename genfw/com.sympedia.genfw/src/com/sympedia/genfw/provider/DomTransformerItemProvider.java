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


import com.sympedia.genfw.DomTransformer;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.internal.GenfwActivator;
import com.sympedia.util.emf.edit.EmfEditHelper;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
 * This is the item provider adapter for a {@link com.sympedia.genfw.DomTransformer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DomTransformerItemProvider extends GeneratorItemProvider implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomTransformerItemProvider(AdapterFactory adapterFactory)
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

      addEncodingPropertyDescriptor(object);
      addForceEncodingPropertyDescriptor(object);
      addNamespaceURIPropertyDescriptor(object);
      addQualifiedNamePropertyDescriptor(object);
      addPublicIDPropertyDescriptor(object);
      addSystemIDPropertyDescriptor(object);
      addForceDocTypePropertyDescriptor(object);
      addIndentPropertyDescriptor(object);
      addIndentingPropertyDescriptor(object);
      addLineWidthPropertyDescriptor(object);
      addLineSeparatorPropertyDescriptor(object);
      addPreserveEmptyAttributesPropertyDescriptor(object);
      addPreserveSpacePropertyDescriptor(object);
      addForceFormattingPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Encoding feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addEncodingPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_encoding_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_DomTransformer_encoding_feature",
                    "_UI_DomTransformer_type"), GenfwPackage.Literals.DOM_TRANSFORMER__ENCODING,
            true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Force Encoding feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addForceEncodingPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_forceEncoding_feature"), getString(
                    "_UI_PropertyDescriptor_description",
                    "_UI_DomTransformer_forceEncoding_feature", "_UI_DomTransformer_type"),
            GenfwPackage.Literals.DOM_TRANSFORMER__FORCE_ENCODING, true,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Qualified Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addQualifiedNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_qualifiedName_feature"), getString(
                    "_UI_PropertyDescriptor_description",
                    "_UI_DomTransformer_qualifiedName_feature", "_UI_DomTransformer_type"),
            GenfwPackage.Literals.DOM_TRANSFORMER__QUALIFIED_NAME, true,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Indent feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIndentPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_indent_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_DomTransformer_indent_feature",
                    "_UI_DomTransformer_type"), GenfwPackage.Literals.DOM_TRANSFORMER__INDENT,
            true, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Indenting feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIndentingPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_indenting_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_DomTransformer_indenting_feature",
                    "_UI_DomTransformer_type"), GenfwPackage.Literals.DOM_TRANSFORMER__INDENTING,
            true, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Line Width feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLineWidthPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_lineWidth_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_DomTransformer_lineWidth_feature",
                    "_UI_DomTransformer_type"), GenfwPackage.Literals.DOM_TRANSFORMER__LINE_WIDTH,
            true, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Line Separator feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLineSeparatorPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_lineSeparator_feature"), getString(
                    "_UI_PropertyDescriptor_description",
                    "_UI_DomTransformer_lineSeparator_feature", "_UI_DomTransformer_type"),
            GenfwPackage.Literals.DOM_TRANSFORMER__LINE_SEPARATOR, true,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Preserve Empty Attributes feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPreserveEmptyAttributesPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors
            .add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory)
                    .getRootAdapterFactory(), getResourceLocator(),
                    getString("_UI_DomTransformer_preserveEmptyAttributes_feature"), getString(
                            "_UI_PropertyDescriptor_description",
                            "_UI_DomTransformer_preserveEmptyAttributes_feature",
                            "_UI_DomTransformer_type"),
                    GenfwPackage.Literals.DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES, true,
                    ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Preserve Space feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPreserveSpacePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_preserveSpace_feature"), getString(
                    "_UI_PropertyDescriptor_description",
                    "_UI_DomTransformer_preserveSpace_feature", "_UI_DomTransformer_type"),
            GenfwPackage.Literals.DOM_TRANSFORMER__PRESERVE_SPACE, true,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Public ID feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPublicIDPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_publicID_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_DomTransformer_publicID_feature",
                    "_UI_DomTransformer_type"), GenfwPackage.Literals.DOM_TRANSFORMER__PUBLIC_ID,
            true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the System ID feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSystemIDPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_systemID_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_DomTransformer_systemID_feature",
                    "_UI_DomTransformer_type"), GenfwPackage.Literals.DOM_TRANSFORMER__SYSTEM_ID,
            true, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Force Doc Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addForceDocTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_forceDocType_feature"), getString(
                    "_UI_PropertyDescriptor_description",
                    "_UI_DomTransformer_forceDocType_feature", "_UI_DomTransformer_type"),
            GenfwPackage.Literals.DOM_TRANSFORMER__FORCE_DOC_TYPE, true,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Namespace URI feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamespaceURIPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_namespaceURI_feature"), getString(
                    "_UI_PropertyDescriptor_description",
                    "_UI_DomTransformer_namespaceURI_feature", "_UI_DomTransformer_type"),
            GenfwPackage.Literals.DOM_TRANSFORMER__NAMESPACE_URI, true,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Force Formatting feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addForceFormattingPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_DomTransformer_forceFormatting_feature"),
            getString("_UI_PropertyDescriptor_description",
                    "_UI_DomTransformer_forceFormatting_feature", "_UI_DomTransformer_type"),
            GenfwPackage.Literals.DOM_TRANSFORMER__FORCE_FORMATTING, true,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
      childrenFeatures.add(GenfwPackage.Literals.DOM_TRANSFORMER__TRANSFORMATIONS);
    }
    return childrenFeatures;
  }

  /**
   * This returns DomTransformer.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/DomTransformer"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public String getText(Object object)
  {
    String label = ((DomTransformer)object).getName();
    return label == null || label.length() == 0 ? getString("_UI_DomTransformer_type") : label;
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

    switch (notification.getFeatureID(DomTransformer.class))
    {
    case GenfwPackage.DOM_TRANSFORMER__ENCODING:
    case GenfwPackage.DOM_TRANSFORMER__FORCE_ENCODING:
    case GenfwPackage.DOM_TRANSFORMER__NAMESPACE_URI:
    case GenfwPackage.DOM_TRANSFORMER__QUALIFIED_NAME:
    case GenfwPackage.DOM_TRANSFORMER__PUBLIC_ID:
    case GenfwPackage.DOM_TRANSFORMER__SYSTEM_ID:
    case GenfwPackage.DOM_TRANSFORMER__FORCE_DOC_TYPE:
    case GenfwPackage.DOM_TRANSFORMER__INDENT:
    case GenfwPackage.DOM_TRANSFORMER__INDENTING:
    case GenfwPackage.DOM_TRANSFORMER__LINE_WIDTH:
    case GenfwPackage.DOM_TRANSFORMER__LINE_SEPARATOR:
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_EMPTY_ATTRIBUTES:
    case GenfwPackage.DOM_TRANSFORMER__PRESERVE_SPACE:
    case GenfwPackage.DOM_TRANSFORMER__FORCE_FORMATTING:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false,
              true));
      return;
    case GenfwPackage.DOM_TRANSFORMER__TRANSFORMATIONS:
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

    EmfEditHelper.collectNewChildDescriptors(newChildDescriptors,
            GenfwPackage.Literals.DOM_TRANSFORMER__TRANSFORMATIONS, GenfwActivator.getPlugin()
                    .getDomTransformations());
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

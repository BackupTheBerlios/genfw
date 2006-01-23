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


import com.sympedia.density.gen.deploy.Creator;
import com.sympedia.density.gen.deploy.Dependency;
import com.sympedia.density.gen.deploy.DeployFactory;
import com.sympedia.density.gen.deploy.DeployPackage;
import com.sympedia.density.gen.deploy.Deployment;
import com.sympedia.density.gen.deploy.Parameter;
import com.sympedia.density.gen.deploy.Reference;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
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
import java.util.Iterator;
import java.util.List;


/**
 * This is the item provider adapter for a {@link com.sympedia.density.gen.deploy.Deployment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentItemProvider extends ItemProviderAdapter implements
        IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider,
        IItemLabelProvider, IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeploymentItemProvider(AdapterFactory adapterFactory)
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

      addComponentPropertyDescriptor(object);
      addIdPropertyDescriptor(object);
      addTypePropertyDescriptor(object);
      addSingletonPropertyDescriptor(object);
      addLazyPropertyDescriptor(object);
      addPrototypePropertyDescriptor(object);
      addInitializedPropertyDescriptor(object);
      addReferersPropertyDescriptor(object);
      addRootPropertyDescriptor(object);
      addDependsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Component feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addComponentPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_component_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_component_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__COMPONENT, true,
            null, null, null));
  }

  /**
   * This adds a property descriptor for the Id feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIdPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_id_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_id_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__ID, true,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_type_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_type_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__TYPE, true,
            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Singleton feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSingletonPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_singleton_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_singleton_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__SINGLETON, false,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Lazy feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLazyPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_lazy_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_lazy_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__LAZY, false,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Prototype feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPrototypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_prototype_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_prototype_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__PROTOTYPE, false,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Initialized feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addInitializedPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_initialized_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_initialized_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__INITIALIZED, true,
            ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Referers feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addReferersPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_referers_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_referers_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__REFERERS, false,
            null, null, null));
  }

  /**
   * This adds a property descriptor for the Root feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRootPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_root_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_root_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__ROOT, false, null,
            null, null));
  }

  /**
   * This adds a property descriptor for the Depends feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDependsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(
            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
            getResourceLocator(), getString("_UI_Deployment_depends_feature"), getString(
                    "_UI_PropertyDescriptor_description", "_UI_Deployment_depends_feature",
                    "_UI_Deployment_type"), DeployPackage.Literals.DEPLOYMENT__DEPENDS, true, null,
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
      childrenFeatures.add(DeployPackage.Literals.DEPLOYMENT__DEPENDENCIES);
      childrenFeatures.add(DeployPackage.Literals.DEPLOYMENT__CREATORS);
      childrenFeatures.add(DeployPackage.Literals.DEPLOYMENT__LISTENERS);
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
   * This returns Deployment.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public Object getImage(Object object)
  {
    if (((Deployment)object).isSingleton())
    {
      return getResourceLocator().getImage("full/obj16/Deployment");
    }
    else
    {
      return getResourceLocator().getImage("full/obj16/DeploymentPrototype");
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
    String id = ((Deployment)object).getId();
    EClass component = ((Deployment)object).getComponent();
    return (id != null && id.length() != 0 ? id : getString("_UI_Deployment_type"))
            + (component != null ? " [" + component.getName() + "]" : "");
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

    switch (notification.getFeatureID(Deployment.class))
    {
      case DeployPackage.DEPLOYMENT__COMPONENT:
      case DeployPackage.DEPLOYMENT__ID:
      case DeployPackage.DEPLOYMENT__TYPE:
      case DeployPackage.DEPLOYMENT__SINGLETON:
      case DeployPackage.DEPLOYMENT__LAZY:
      case DeployPackage.DEPLOYMENT__PROTOTYPE:
      case DeployPackage.DEPLOYMENT__INITIALIZED:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false,
                true));
        return;
      case DeployPackage.DEPLOYMENT__DEPENDENCIES:
      case DeployPackage.DEPLOYMENT__CREATORS:
      case DeployPackage.DEPLOYMENT__LISTENERS:
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

    Deployment deployment = (Deployment)object;
    EClass component = deployment.getComponent();
    if (component != null)
    {
      for (Iterator it = component.getEAllReferences().iterator(); it.hasNext();)
      {
        EReference reference = (EReference)it.next();
        if (!hasDependency(deployment, reference))
        {
          Reference ref = DeployFactory.eINSTANCE.createReference();
          ref.setFeature(reference);
          newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
                  .getDeployment_Dependencies(), ref));
        }
      }

      for (Iterator it = component.getEAllAttributes().iterator(); it.hasNext();)
      {
        EAttribute attribute = (EAttribute)it.next();
        if (!hasDependency(deployment, attribute))
        {
          Parameter param = createParameter(attribute);
          if (param != null)
          {
            newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
                    .getDeployment_Dependencies(), param));
          }
        }
      }

      for (Iterator it = component.getEAllOperations().iterator(); it.hasNext();)
      {
        EOperation op = (EOperation)it.next();
        if (!hasCreator(deployment, op))
        {
          Creator creator = DeployFactory.eINSTANCE.createCreator();
          creator.setOperation(op);
          newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
                  .getDeployment_Creators(), creator));
        }
      }
    }
    else
    {
      newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
              .getDeployment_Dependencies(), DeployFactory.eINSTANCE.createReference()));

      newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
              .getDeployment_Dependencies(), DeployFactory.eINSTANCE.createIntegerParameter()));

      newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
              .getDeployment_Dependencies(), DeployFactory.eINSTANCE.createLongParameter()));

      newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
              .getDeployment_Dependencies(), DeployFactory.eINSTANCE.createFloatParameter()));

      newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
              .getDeployment_Dependencies(), DeployFactory.eINSTANCE.createDoubleParameter()));

      newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
              .getDeployment_Dependencies(), DeployFactory.eINSTANCE.createBooleanParameter()));

      newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
              .getDeployment_Dependencies(), DeployFactory.eINSTANCE.createStringParameter()));

      newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE
              .getDeployment_Dependencies(), DeployFactory.eINSTANCE.createCharParameter()));

      newChildDescriptors.add(createChildParameter(
              DeployPackage.eINSTANCE.getDeployment_Creators(), DeployFactory.eINSTANCE
                      .createCreator()));
    }

    newChildDescriptors.add(createChildParameter(DeployPackage.eINSTANCE.getDeployment_Listeners(),
            DeployFactory.eINSTANCE.createListener()));
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
  public static boolean hasDependency(Deployment deployment, EStructuralFeature feature)
  {
    for (Iterator it = deployment.getDependencies().iterator(); it.hasNext();)
    {
      Dependency dependency = (Dependency)it.next();
      if (dependency.getFeature() == feature)
      {
        return true;
      }
    }

    return false;
  }

  /**
   * @ADDED
   */
  public static boolean hasCreator(Deployment deployment, EOperation op)
  {
    for (Iterator it = deployment.getCreators().iterator(); it.hasNext();)
    {
      Creator creator = (Creator)it.next();
      if (creator.getOperation() == op)
      {
        return true;
      }
    }

    return false;
  }

  /**
   * @ADDED
   */
  public static Parameter createParameter(EAttribute attribute)
  {
    Parameter param = null;
    EClassifier type = attribute.getEType();

    if (type == EcorePackage.eINSTANCE.getEInt()
            || type == EcorePackage.eINSTANCE.getEIntegerObject())
    {
      param = DeployFactory.eINSTANCE.createIntegerParameter();
    }
    else if (type == EcorePackage.eINSTANCE.getEBoolean()
            || type == EcorePackage.eINSTANCE.getEBooleanObject())
    {
      param = DeployFactory.eINSTANCE.createBooleanParameter();
    }
    else if (type == EcorePackage.eINSTANCE.getEChar()
            || type == EcorePackage.eINSTANCE.getECharacterObject())
    {
      param = DeployFactory.eINSTANCE.createCharParameter();
    }
    else if (type == EcorePackage.eINSTANCE.getEDouble()
            || type == EcorePackage.eINSTANCE.getEDoubleObject())
    {
      param = DeployFactory.eINSTANCE.createDoubleParameter();
    }
    else if (type == EcorePackage.eINSTANCE.getEFloat()
            || type == EcorePackage.eINSTANCE.getEFloatObject())
    {
      param = DeployFactory.eINSTANCE.createFloatParameter();
    }
    else if (type == EcorePackage.eINSTANCE.getELong()
            || type == EcorePackage.eINSTANCE.getELongObject())
    {
      param = DeployFactory.eINSTANCE.createLongParameter();
    }
    else if (type == EcorePackage.eINSTANCE.getEString())
    {
      param = DeployFactory.eINSTANCE.createStringParameter();
    }

    if (param != null)
    {
      param.setFeature(attribute);
    }

    return param;
  }

  /**
   * @ADDED
   */
  @Override
  public String getCreateChildText(Object owner, Object feature, Object child, Collection selection)
  {
    if (child instanceof Parameter && ((Parameter)child).getFeature() != null)
    {
      return getString("_UI_Parameter_type") + " " + ((Parameter)child).getFeature().getName();
    }

    if (child instanceof Reference && ((Reference)child).getFeature() != null)
    {
      return getString("_UI_Reference_type") + " " + ((Reference)child).getFeature().getName();
    }

    if (child instanceof Creator && ((Creator)child).getOperation() != null)
    {
      return getString("_UI_Creator_type") + " " + ((Creator)child).getOperation().getName();
    }

    return super.getCreateChildText(owner, feature, child, selection);
  }
}

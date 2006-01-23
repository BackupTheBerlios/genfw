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


import com.sympedia.density.gen.deploy.util.DeployAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import java.util.ArrayList;
import java.util.Collection;


/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeployItemProviderAdapterFactory extends DeployAdapterFactory implements
        ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection supportedTypes = new ArrayList();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeployItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.Container} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerItemProvider containerItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.Container}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createContainerAdapter()
  {
    if (containerItemProvider == null)
    {
      containerItemProvider = new ContainerItemProvider(this);
    }

    return containerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.Deployment} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentItemProvider deploymentItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.Deployment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createDeploymentAdapter()
  {
    if (deploymentItemProvider == null)
    {
      deploymentItemProvider = new DeploymentItemProvider(this);
    }

    return deploymentItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.DeploymentGroup} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentGroupItemProvider deploymentGroupItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.DeploymentGroup}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createDeploymentGroupAdapter()
  {
    if (deploymentGroupItemProvider == null)
    {
      deploymentGroupItemProvider = new DeploymentGroupItemProvider(this);
    }

    return deploymentGroupItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.Reference} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceItemProvider referenceItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.Reference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    if (referenceItemProvider == null)
    {
      referenceItemProvider = new ReferenceItemProvider(this);
    }

    return referenceItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.IntegerParameter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerParameterItemProvider integerParameterItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.IntegerParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createIntegerParameterAdapter()
  {
    if (integerParameterItemProvider == null)
    {
      integerParameterItemProvider = new IntegerParameterItemProvider(this);
    }

    return integerParameterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.LongParameter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LongParameterItemProvider longParameterItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.LongParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createLongParameterAdapter()
  {
    if (longParameterItemProvider == null)
    {
      longParameterItemProvider = new LongParameterItemProvider(this);
    }

    return longParameterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.FloatParameter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FloatParameterItemProvider floatParameterItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.FloatParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createFloatParameterAdapter()
  {
    if (floatParameterItemProvider == null)
    {
      floatParameterItemProvider = new FloatParameterItemProvider(this);
    }

    return floatParameterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.DoubleParameter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoubleParameterItemProvider doubleParameterItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.DoubleParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createDoubleParameterAdapter()
  {
    if (doubleParameterItemProvider == null)
    {
      doubleParameterItemProvider = new DoubleParameterItemProvider(this);
    }

    return doubleParameterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.BooleanParameter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BooleanParameterItemProvider booleanParameterItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.BooleanParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createBooleanParameterAdapter()
  {
    if (booleanParameterItemProvider == null)
    {
      booleanParameterItemProvider = new BooleanParameterItemProvider(this);
    }

    return booleanParameterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.StringParameter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StringParameterItemProvider stringParameterItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.StringParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createStringParameterAdapter()
  {
    if (stringParameterItemProvider == null)
    {
      stringParameterItemProvider = new StringParameterItemProvider(this);
    }

    return stringParameterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.CharParameter} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharParameterItemProvider charParameterItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.CharParameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createCharParameterAdapter()
  {
    if (charParameterItemProvider == null)
    {
      charParameterItemProvider = new CharParameterItemProvider(this);
    }

    return charParameterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.Creator} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreatorItemProvider creatorItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.Creator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createCreatorAdapter()
  {
    if (creatorItemProvider == null)
    {
      creatorItemProvider = new CreatorItemProvider(this);
    }

    return creatorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploy.Listener} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListenerItemProvider listenerItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploy.Listener}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createListenerAdapter()
  {
    if (listenerItemProvider == null)
    {
      listenerItemProvider = new ListenerItemProvider(this);
    }

    return listenerItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class) || (((Class)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (containerItemProvider != null) containerItemProvider.dispose();
    if (deploymentItemProvider != null) deploymentItemProvider.dispose();
    if (deploymentGroupItemProvider != null) deploymentGroupItemProvider.dispose();
    if (referenceItemProvider != null) referenceItemProvider.dispose();
    if (integerParameterItemProvider != null) integerParameterItemProvider.dispose();
    if (longParameterItemProvider != null) longParameterItemProvider.dispose();
    if (floatParameterItemProvider != null) floatParameterItemProvider.dispose();
    if (doubleParameterItemProvider != null) doubleParameterItemProvider.dispose();
    if (booleanParameterItemProvider != null) booleanParameterItemProvider.dispose();
    if (stringParameterItemProvider != null) stringParameterItemProvider.dispose();
    if (charParameterItemProvider != null) charParameterItemProvider.dispose();
    if (creatorItemProvider != null) creatorItemProvider.dispose();
    if (listenerItemProvider != null) listenerItemProvider.dispose();
  }

}

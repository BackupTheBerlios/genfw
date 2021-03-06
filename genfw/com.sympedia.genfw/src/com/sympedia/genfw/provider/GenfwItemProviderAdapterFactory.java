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


import com.sympedia.genfw.util.GenfwAdapterFactory;

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
public class GenfwItemProviderAdapterFactory extends GenfwAdapterFactory implements
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
  public GenfwItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.GenLib} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenLibItemProvider genLibItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.GenLib}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createGenLibAdapter()
  {
    if (genLibItemProvider == null)
    {
      genLibItemProvider = new GenLibItemProvider(this);
    }

    return genLibItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.GenApp} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenAppItemProvider genAppItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.GenApp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createGenAppAdapter()
  {
    if (genAppItemProvider == null)
    {
      genAppItemProvider = new GenAppItemProvider(this);
    }

    return genAppItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.EcoreContentProvider} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EcoreContentProviderItemProvider ecoreContentProviderItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.EcoreContentProvider}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createEcoreContentProviderAdapter()
  {
    if (ecoreContentProviderItemProvider == null)
    {
      ecoreContentProviderItemProvider = new EcoreContentProviderItemProvider(this);
    }

    return ecoreContentProviderItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.PropertiesContentProvider} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertiesContentProviderItemProvider propertiesContentProviderItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.PropertiesContentProvider}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createPropertiesContentProviderAdapter()
  {
    if (propertiesContentProviderItemProvider == null)
    {
      propertiesContentProviderItemProvider = new PropertiesContentProviderItemProvider(this);
    }

    return propertiesContentProviderItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.RuleSet} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleSetItemProvider ruleSetItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.RuleSet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createRuleSetAdapter()
  {
    if (ruleSetItemProvider == null)
    {
      ruleSetItemProvider = new RuleSetItemProvider(this);
    }

    return ruleSetItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.StaticRule} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaticRuleItemProvider staticRuleItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.StaticRule}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createStaticRuleAdapter()
  {
    if (staticRuleItemProvider == null)
    {
      staticRuleItemProvider = new StaticRuleItemProvider(this);
    }

    return staticRuleItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.DomTransformer} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomTransformerItemProvider domTransformerItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.DomTransformer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createDomTransformerAdapter()
  {
    if (domTransformerItemProvider == null)
    {
      domTransformerItemProvider = new DomTransformerItemProvider(this);
    }

    return domTransformerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.Input} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputItemProvider inputItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.Input}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createInputAdapter()
  {
    if (inputItemProvider == null)
    {
      inputItemProvider = new InputItemProvider(this);
    }

    return inputItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.Context} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextItemProvider contextItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.Context}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createContextAdapter()
  {
    if (contextItemProvider == null)
    {
      contextItemProvider = new ContextItemProvider(this);
    }

    return contextItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.DomContentProvider} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomContentProviderItemProvider domContentProviderItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.DomContentProvider}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createDomContentProviderAdapter()
  {
    if (domContentProviderItemProvider == null)
    {
      domContentProviderItemProvider = new DomContentProviderItemProvider(this);
    }

    return domContentProviderItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.IdentityGenerator} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentityGeneratorItemProvider identityGeneratorItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.IdentityGenerator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createIdentityGeneratorAdapter()
  {
    if (identityGeneratorItemProvider == null)
    {
      identityGeneratorItemProvider = new IdentityGeneratorItemProvider(this);
    }

    return identityGeneratorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.InitialGenerator} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitialGeneratorItemProvider initialGeneratorItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.InitialGenerator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createInitialGeneratorAdapter()
  {
    if (initialGeneratorItemProvider == null)
    {
      initialGeneratorItemProvider = new InitialGeneratorItemProvider(this);
    }

    return initialGeneratorItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.StaticFileInitializer} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaticFileInitializerItemProvider staticFileInitializerItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.StaticFileInitializer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createStaticFileInitializerAdapter()
  {
    if (staticFileInitializerItemProvider == null)
    {
      staticFileInitializerItemProvider = new StaticFileInitializerItemProvider(this);
    }

    return staticFileInitializerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.Line} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LineItemProvider lineItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.Line}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createLineAdapter()
  {
    if (lineItemProvider == null)
    {
      lineItemProvider = new LineItemProvider(this);
    }

    return lineItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.genfw.ProjectInitializer} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectInitializerItemProvider projectInitializerItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.genfw.ProjectInitializer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createProjectInitializerAdapter()
  {
    if (projectInitializerItemProvider == null)
    {
      projectInitializerItemProvider = new ProjectInitializerItemProvider(this);
    }

    return projectInitializerItemProvider;
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
    if (genLibItemProvider != null) genLibItemProvider.dispose();
    if (genAppItemProvider != null) genAppItemProvider.dispose();
    if (contextItemProvider != null) contextItemProvider.dispose();
    if (domContentProviderItemProvider != null) domContentProviderItemProvider.dispose();
    if (ecoreContentProviderItemProvider != null) ecoreContentProviderItemProvider.dispose();
    if (propertiesContentProviderItemProvider != null)
      propertiesContentProviderItemProvider.dispose();
    if (ruleSetItemProvider != null) ruleSetItemProvider.dispose();
    if (staticRuleItemProvider != null) staticRuleItemProvider.dispose();
    if (initialGeneratorItemProvider != null) initialGeneratorItemProvider.dispose();
    if (domTransformerItemProvider != null) domTransformerItemProvider.dispose();
    if (staticFileInitializerItemProvider != null) staticFileInitializerItemProvider.dispose();
    if (identityGeneratorItemProvider != null) identityGeneratorItemProvider.dispose();
    if (lineItemProvider != null) lineItemProvider.dispose();
    if (projectInitializerItemProvider != null) projectInitializerItemProvider.dispose();
    if (inputItemProvider != null) inputItemProvider.dispose();
  }

}

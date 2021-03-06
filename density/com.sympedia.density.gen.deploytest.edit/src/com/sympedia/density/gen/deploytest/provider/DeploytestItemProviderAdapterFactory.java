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


import com.sympedia.density.gen.deploytest.util.DeploytestAdapterFactory;

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
public class DeploytestItemProviderAdapterFactory extends DeploytestAdapterFactory implements
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
  public DeploytestItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.TestSpec} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestSpecItemProvider testSpecItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.TestSpec}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createTestSpecAdapter()
  {
    if (testSpecItemProvider == null)
    {
      testSpecItemProvider = new TestSpecItemProvider(this);
    }

    return testSpecItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.DeploymentOverride} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentOverrideItemProvider deploymentOverrideItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.DeploymentOverride}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createDeploymentOverrideAdapter()
  {
    if (deploymentOverrideItemProvider == null)
    {
      deploymentOverrideItemProvider = new DeploymentOverrideItemProvider(this);
    }

    return deploymentOverrideItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.ActionContainer} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionContainerItemProvider actionContainerItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.ActionContainer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createActionContainerAdapter()
  {
    if (actionContainerItemProvider == null)
    {
      actionContainerItemProvider = new ActionContainerItemProvider(this);
    }

    return actionContainerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.Action} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionItemProvider actionItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createActionAdapter()
  {
    if (actionItemProvider == null)
    {
      actionItemProvider = new ActionItemProvider(this);
    }

    return actionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.AssertionContainer} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionContainerItemProvider assertionContainerItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.AssertionContainer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createAssertionContainerAdapter()
  {
    if (assertionContainerItemProvider == null)
    {
      assertionContainerItemProvider = new AssertionContainerItemProvider(this);
    }

    return assertionContainerItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.Assertion} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionItemProvider assertionItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.Assertion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createAssertionAdapter()
  {
    if (assertionItemProvider == null)
    {
      assertionItemProvider = new AssertionItemProvider(this);
    }

    return assertionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.UnaryOpAssertion} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryOpAssertionItemProvider unaryOpAssertionItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.UnaryOpAssertion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createUnaryOpAssertionAdapter()
  {
    if (unaryOpAssertionItemProvider == null)
    {
      unaryOpAssertionItemProvider = new UnaryOpAssertionItemProvider(this);
    }

    return unaryOpAssertionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.BinaryOpAssertion} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BinaryOpAssertionItemProvider binaryOpAssertionItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.BinaryOpAssertion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createBinaryOpAssertionAdapter()
  {
    if (binaryOpAssertionItemProvider == null)
    {
      binaryOpAssertionItemProvider = new BinaryOpAssertionItemProvider(this);
    }

    return binaryOpAssertionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.Initialization} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitializationItemProvider initializationItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.Initialization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createInitializationAdapter()
  {
    if (initializationItemProvider == null)
    {
      initializationItemProvider = new InitializationItemProvider(this);
    }

    return initializationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.Execution} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecutionItemProvider executionItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.Execution}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createExecutionAdapter()
  {
    if (executionItemProvider == null)
    {
      executionItemProvider = new ExecutionItemProvider(this);
    }

    return executionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.Verification} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerificationItemProvider verificationItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.Verification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createVerificationAdapter()
  {
    if (verificationItemProvider == null)
    {
      verificationItemProvider = new VerificationItemProvider(this);
    }

    return verificationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.TestSuite} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TestSuiteItemProvider testSuiteItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.TestSuite}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createTestSuiteAdapter()
  {
    if (testSuiteItemProvider == null)
    {
      testSuiteItemProvider = new TestSuiteItemProvider(this);
    }

    return testSuiteItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link com.sympedia.density.gen.deploytest.ContainerOverride} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContainerOverrideItemProvider containerOverrideItemProvider;

  /**
   * This creates an adapter for a {@link com.sympedia.density.gen.deploytest.ContainerOverride}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Adapter createContainerOverrideAdapter()
  {
    if (containerOverrideItemProvider == null)
    {
      containerOverrideItemProvider = new ContainerOverrideItemProvider(this);
    }

    return containerOverrideItemProvider;
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
    if (testSpecItemProvider != null) testSpecItemProvider.dispose();
    if (containerOverrideItemProvider != null) containerOverrideItemProvider.dispose();
    if (deploymentOverrideItemProvider != null) deploymentOverrideItemProvider.dispose();
    if (actionContainerItemProvider != null) actionContainerItemProvider.dispose();
    if (actionItemProvider != null) actionItemProvider.dispose();
    if (assertionContainerItemProvider != null) assertionContainerItemProvider.dispose();
    if (assertionItemProvider != null) assertionItemProvider.dispose();
    if (unaryOpAssertionItemProvider != null) unaryOpAssertionItemProvider.dispose();
    if (binaryOpAssertionItemProvider != null) binaryOpAssertionItemProvider.dispose();
    if (initializationItemProvider != null) initializationItemProvider.dispose();
    if (executionItemProvider != null) executionItemProvider.dispose();
    if (verificationItemProvider != null) verificationItemProvider.dispose();
    if (testSuiteItemProvider != null) testSuiteItemProvider.dispose();
  }

}

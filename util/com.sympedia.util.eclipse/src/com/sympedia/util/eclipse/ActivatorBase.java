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
package com.sympedia.util.eclipse;


import com.sympedia.util.ClassLoaderFactory;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.Bundle;

import java.io.IOException;
import java.net.URL;


/**
 * The main plugin class to be used in the desktop.
 */
public abstract class ActivatorBase extends EMFPlugin implements ClassLoaderFactory
{
  protected final Logger logger = Logger.getLogger(getClass());

  public ActivatorBase(ResourceLocator[] delegateResourceLocators)
  {
    super(delegateResourceLocators);
  }

  public ClassLoader getClassLoader()
  {
    return getClass().getClassLoader();
  }

  @Override
  public String getString(String key, boolean translate)
  {
    try
    {
      return super.getString(key, translate);
    }
    catch (RuntimeException ex)
    {
      logger.error("getString: " + key, ex);
      throw ex;
    }
  }

  @Override
  public String getString(String key, Object[] substitutions, boolean translate)
  {
    try
    {
      return super.getString(key, substitutions, translate);
    }
    catch (RuntimeException ex)
    {
      logger.error("getString: " + key, ex);
      throw ex;
    }
  }

  public static void checkCanceled(IProgressMonitor monitor)
  {
    if (monitor.isCanceled()) cancelOperation();
  }

  public static void cancelOperation()
  {
    throw new OperationCanceledException();
  }

  public static IProgressMonitor monitorFor(IProgressMonitor monitor)
  {
    if (monitor == null) return new NullProgressMonitor();
    return monitor;
  }

  public static IProgressMonitor subMonitorFor(IProgressMonitor monitor, int ticks)
  {
    if (monitor == null) return new NullProgressMonitor();
    if (monitor instanceof NullProgressMonitor) return monitor;
    return new SubProgressMonitor(monitor, ticks);
  }

  public static IProgressMonitor subMonitorFor(IProgressMonitor monitor, int ticks, int style)
  {
    if (monitor == null) return new NullProgressMonitor();
    if (monitor instanceof NullProgressMonitor) return monitor;
    return new SubProgressMonitor(monitor, ticks, style);
  }

  public static String getBundleLocation(Bundle bundle) throws IOException
  {
    URL url = bundle.getEntry("/");
    return FileLocator.toFileURL(url).getFile();
  }

  public void debug(String message)
  {
    debug(message, null);
  }

  public void warn(String message)
  {
    warn(message, null);
  }

  public void error(String message)
  {
    error(message, null);
  }

  public void debug(Throwable t)
  {
    debug(t.getMessage(), t);
  }

  public void warn(Throwable t)
  {
    warn(t.getMessage(), t);
  }

  public void error(Throwable t)
  {
    error(t.getMessage(), t);
  }

  public void debug(String message, Throwable t)
  {
    logger.debug(message, t);
  }

  public void warn(String message, Throwable t)
  {
    logger.warn(message, t);
  }

  public void error(String message, Throwable t)
  {
    logger.error(message, t);
  }
}

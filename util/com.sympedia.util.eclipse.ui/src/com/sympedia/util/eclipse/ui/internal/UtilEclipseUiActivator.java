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
package com.sympedia.util.eclipse.ui.internal;


import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;


public class UtilEclipseUiActivator extends EMFPlugin
{
  public static final String PLUGIN_ID = "com.sympedia.util.eclipse.ui";

  public static final UtilEclipseUiActivator INSTANCE = new UtilEclipseUiActivator();

  private static Implementation plugin;

  public UtilEclipseUiActivator()
  {
    super(new ResourceLocator[] {});
  }

  public ResourceLocator getPluginResourceLocator()
  {
    return plugin;
  }

  public static Implementation getPlugin()
  {
    return plugin;
  }

  public static class Implementation extends EclipseUIPlugin
  {
    public Implementation()
    {
      plugin = this;
    }
  }
}

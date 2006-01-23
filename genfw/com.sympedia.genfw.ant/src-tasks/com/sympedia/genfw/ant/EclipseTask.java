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
package com.sympedia.genfw.ant;


import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.ant.core.AntCorePlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;


public abstract class EclipseTask extends Task
{
  public static void assertTrue(String message, boolean expression) throws BuildException
  {
    if (!expression)
    {
      throw new BuildException(message);
    }
  }

  protected IProgressMonitor getProgressMonitor()
  {
    try
    {
      IProgressMonitor progressMonitor = (IProgressMonitor)getProject().getReferences().get(
              AntCorePlugin.ECLIPSE_PROGRESS_MONITOR);
      if (progressMonitor != null)
      {
        return progressMonitor;
      }
    }
    catch (Exception e)
    {
    }
    return new NullProgressMonitor();
  }

  public final void execute() throws BuildException
  {
    checkAttributes();

    try
    {
      doExecute();
    }
    catch (Throwable t)
    {
      t.printStackTrace();

      if (t instanceof BuildException)
      {
        throw (BuildException)t;
      }
      else
      {
        throw new BuildException(t);
      }
    }
  }

  protected void checkAttributes() throws BuildException
  {
  }

  abstract protected void doExecute() throws Throwable;
}

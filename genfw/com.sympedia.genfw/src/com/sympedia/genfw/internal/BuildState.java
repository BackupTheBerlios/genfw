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
package com.sympedia.genfw.internal;


import com.sympedia.util.IOHelper;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.*;


public abstract class BuildState
{
  private IProject project;

  private IPath id;

  private IPath statePath;

  private File stateFile;

  private boolean dirty;

  public BuildState(IProject project, IPath id)
  {
    this.project = project;
    this.id = id;
    statePath = GenfwActivator.getPlugin().getStateLocation().append(project.getName()).append(id);
    stateFile = statePath.toFile();
    dirty = true;
  }

  public IProject getProject()
  {
    return project;
  }

  public IPath getId()
  {
    return id;
  }

  public IPath getStatePath()
  {
    return statePath;
  }

  protected File getStateFile()
  {
    return stateFile;
  }

  protected boolean isDirty()
  {
    return dirty;
  }

  protected boolean exists()
  {
    return stateFile.exists();
  }

  protected void setDirty()
  {
    dirty = true;
  }

  protected void purge()
  {
    IOHelper.deleteFile(stateFile);
    dirty = false;
  }

  protected final boolean load()
  {
    if (stateFile.exists())
    {
      FileInputStream stream = null;

      try
      {
        stream = new FileInputStream(stateFile);
        doLoad(stream);
        dirty = false;
        return true;
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
      finally
      {
        IOHelper.close(stream);
      }
    }

    return false;
  }

  protected final boolean save()
  {
    if (dirty)
    {
      FileOutputStream stream = null;

      try
      {
        stateFile.getParentFile().mkdirs();
        stream = new FileOutputStream(stateFile);
        doSave(stream);
        dirty = false;
        return true;
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
      finally
      {
        IOHelper.close(stream);
      }
    }

    return false;
  }

  protected abstract void doLoad(InputStream stream) throws IOException;

  protected abstract void doSave(OutputStream stream) throws IOException;
}

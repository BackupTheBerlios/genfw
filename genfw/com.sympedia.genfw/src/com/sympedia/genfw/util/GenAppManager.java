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
package com.sympedia.genfw.util;


import com.sympedia.util.eclipse.resources.internal.FileManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceDelta;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class GenAppManager extends FileManager
{
  public static final GenAppManager INSTANCE = new GenAppManager();

  public GenAppManager()
  {
  }

  public IFile[] getAppFiles()
  {
    return getFiles("genapp");
  }

  public IFile[] getLibFiles()
  {
    return getFiles("genlib");
  }

  protected IFile[] getFiles(String ext)
  {
    List<IFile> result = new ArrayList<IFile>();
    Set<IFile> set = getFileSet();
    for (IFile file : set)
    {
      if (ext.equals(file.getFileExtension()))
      {
        result.add(file);
      }
    }

    return result.toArray(new IFile[result.size()]);
  }

  @Override
  protected int handleFile(IFile file, int kind, int flags)
  {
    final String ext = file.getFileExtension();
    if ("genapp".equals(ext) || "genlib".equals(ext))
    {
      return super.handleFile(file, kind, flags);
    }

    return IResourceDelta.NO_CHANGE;
  }
}

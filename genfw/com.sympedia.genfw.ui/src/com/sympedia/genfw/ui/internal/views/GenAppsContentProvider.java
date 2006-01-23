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
package com.sympedia.genfw.ui.internal.views;


import com.sympedia.genfw.GenApp;
import com.sympedia.genfw.Input;
import com.sympedia.util.eclipse.resources.IFileManager;
import com.sympedia.util.eclipse.resources.IFileManagerListener;
import com.sympedia.util.eclipse.resources.ResourcesHelper;
import com.sympedia.util.eclipse.ui.UiHelper;
import com.sympedia.util.emf.EcoreHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class GenAppsContentProvider implements ITreeContentProvider, IFileManagerListener
{
  protected IFileManager fileManager;

  protected Viewer viewer;

  protected Map<IFile, List<IFile>> contents = new HashMap<IFile, List<IFile>>();

  protected boolean showInputs;

  public GenAppsContentProvider()
  {
  }

  public boolean isShowInputs()
  {
    return showInputs;
  }

  public void setShowInputs(boolean showInputs)
  {
    this.showInputs = showInputs;
  }

  public void inputChanged(Viewer v, Object oldInput, Object newInput)
  {
    dispose();
    viewer = v;

    if (newInput instanceof IFileManager)
    {
      fileManager = (IFileManager)newInput;
      fileManager.addListener(this);
    }
  }

  public void dispose()
  {
    if (fileManager != null)
    {
      fileManager.removeListener(this);
      fileManager = null;
    }

    contents.clear();
  }

  public Object[] getElements(Object inputElement)
  {
    return getChildren(inputElement);
  }

  public Object[] getChildren(Object parentElement)
  {
    if (parentElement == fileManager)
    {
      return fileManager.getFiles();
    }

    if (parentElement instanceof IFile && showInputs)
    {
      return getInputFiles((IFile)parentElement).toArray();
    }

    return new Object[0];
  }

  public Object getParent(Object element)
  {
    if (element instanceof IFile)
    {
      Set<Entry<IFile, List<IFile>>> entries = contents.entrySet();
      for (Entry<IFile, List<IFile>> entry : entries)
      {
        List<IFile> inputFiles = entry.getValue();
        for (IFile file : inputFiles)
        {
          if (file.equals(element))
          {
            return entry.getKey();
          }
        }
      }
    }

    return null;
  }

  public boolean hasChildren(Object element)
  {
    return getChildren(element).length > 0;
  }

  public void notifyFileChanges(IFileManager fileManager, List<IFile> removedFiles,
          List<IFile> addedFiles, List<IFile> changedFiles)
  {
    for (IFile file : removedFiles)
    {
      contents.remove(file);
    }

    for (IFile file : changedFiles)
    {
      contents.remove(file);
    }

    UiHelper.refreshViewer(viewer, true);
  }

  protected List<IFile> getInputFiles(IFile genFile)
  {
    List<IFile> result = contents.get(genFile);
    if (result == null)
    {
      result = new ArrayList<IFile>();
      contents.put(genFile, result);

      String path = genFile.getFullPath().toString();
      EObject object = EcoreHelper.getXMIObject(path);
      if (object instanceof GenApp)
      {
        GenApp genApp = (GenApp)object;
        for (Iterator it = genApp.getInputs().iterator(); it.hasNext();)
        {
          Input input = (Input)it.next();
          IPath inputPath = new Path(input.getFullPath());
          if (!inputPath.isAbsolute())
          {
            inputPath = genFile.getProject().getFullPath().append(inputPath);
          }

          IResource resource = ResourcesHelper.ROOT.findMember(inputPath);
          if (resource instanceof IFile && resource.exists())
          {
            result.add((IFile)resource);
          }
        }
      }
    }

    return result;
  }
}

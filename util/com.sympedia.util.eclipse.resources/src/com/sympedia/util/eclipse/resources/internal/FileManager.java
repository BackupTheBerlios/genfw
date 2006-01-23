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
package com.sympedia.util.eclipse.resources.internal;


import com.sympedia.util.IDisposable;
import com.sympedia.util.eclipse.resources.IFileManager;
import com.sympedia.util.eclipse.resources.IFileManagerListener;
import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FileManager implements IFileManager, IDisposable
{
  protected Set<IFile> fileSet;

  protected IFile[] fileArray;

  protected IResourceChangeListener resourceChangeListener;

  protected List<IFileManagerListener> listeners = new ArrayList<IFileManagerListener>();

  public FileManager()
  {
  }

  public void dispose() throws Exception
  {
    if (resourceChangeListener != null)
    {
      ResourcesHelper.removeListener(resourceChangeListener);
      resourceChangeListener = null;
    }

    fileSet = null;
    fileArray = null;
  }

  public Object getAdapter(Class adapter)
  {
    if (adapter.isAssignableFrom(getClass()))
    {
      return this;
    }

    return null;
  }

  public IFile[] getFiles()
  {
    if (fileArray == null)
    {
      Set<IFile> set = getFileSet();
      fileArray = set.toArray(new IFile[set.size()]);
    }

    return fileArray;
  }

  public void addListener(IFileManagerListener listener)
  {
    listeners.add(listener);
  }

  public void removeListener(IFileManagerListener listener)
  {
    listeners.remove(listener);
  }

  protected int addFile(IFile file)
  {
    if (getFileSet().add(file))
    {
      fileArray = null;
      return IResourceDelta.ADDED;
    }

    return IResourceDelta.NO_CHANGE;
  }

  protected int removeFile(IFile file)
  {
    if (getFileSet().remove(file))
    {
      fileArray = null;
      return IResourceDelta.REMOVED;
    }

    return IResourceDelta.NO_CHANGE;
  }

  protected Set<IFile> getFileSet()
  {
    if (fileSet == null)
    {
      fileSet = new HashSet<IFile>();
      resourceChangeListener = createResourceChangeListener();
      ResourcesHelper.addPostChangeListener(resourceChangeListener);

      try
      {
        IResourceVisitor visitor = createResourceVisitor();
        ResourcesHelper.ROOT.accept(visitor);
      }
      catch (Exception ignore)
      {
      }
    }

    return fileSet;
  }

  protected IResourceChangeListener createResourceChangeListener()
  {
    return new IResourceChangeListener()
    {
      public void resourceChanged(IResourceChangeEvent event)
      {
        IResourceDelta delta = event.getDelta();
        if (delta != null)
        {
          List<IFile> removedFiles = new ArrayList<IFile>();
          List<IFile> addedFiles = new ArrayList<IFile>();
          List<IFile> changedFiles = new ArrayList<IFile>();

          try
          {
            IResourceDeltaVisitor visitor = createResourceDeltaVisitor(removedFiles, addedFiles,
                    changedFiles);
            delta.accept(visitor);
          }
          catch (Exception ignore)
          {
          }

          for (IFileManagerListener listener : listeners)
          {
            listener.notifyFileChanges(FileManager.this, removedFiles, addedFiles, changedFiles);
          }
        }
      }
    };
  }

  protected boolean handleResource(IResource resource, int kind, int flags,
          List<IFile> removedFiles, List<IFile> addedFiles, List<IFile> changedFiles)
  {
    if (resource instanceof IFile)
    {
      IFile file = (IFile)resource;
      int changed = handleFile(file, kind, flags);
      switch (changed)
      {
        case IResourceDelta.ADDED:
          if (addedFiles != null) addedFiles.add(file);
          break;

        case IResourceDelta.REMOVED:
          if (removedFiles != null) removedFiles.add(file);
          break;

        case IResourceDelta.CHANGED:
          if (changedFiles != null) changedFiles.add(file);
          break;

        default:
      }

      return false;
    }

    if (resource instanceof IProject)
    {
      return handleProject((IProject)resource, kind, flags);
    }

    if (resource instanceof IFolder)
    {
      return handleFolder((IFolder)resource, kind, flags);
    }

    return true;
  }

  protected int handleFile(IFile file, int kind, int flags)
  {
    switch (kind)
    {
      case IResourceDelta.ADDED:
        return addFile(file);

      case IResourceDelta.REMOVED:
        return removeFile(file);

      case IResourceDelta.CHANGED:
        if ((flags & (IResourceDelta.CONTENT | IResourceDelta.REPLACED)) != 0)
        {
          return IResourceDelta.CHANGED;
        }
    }

    return IResourceDelta.NO_CHANGE;
  }

  protected boolean handleProject(IProject project, int kind, int flags)
  {
    return true;
  }

  protected boolean handleFolder(IFolder folder, int kind, int flags)
  {
    return true;
  }

  protected IResourceVisitor createResourceVisitor()
  {
    return new IResourceVisitor()
    {
      public boolean visit(IResource resource) throws CoreException
      {
        return handleResource(resource, IResourceDelta.ADDED, 0, null, null, null);
      }
    };
  }

  protected IResourceDeltaVisitor createResourceDeltaVisitor(final List<IFile> removedFiles,
          final List<IFile> addedFiles, final List<IFile> changedFiles)
  {
    return new IResourceDeltaVisitor()
    {
      public boolean visit(IResourceDelta delta) throws CoreException
      {
        return handleResource(delta.getResource(), delta.getKind(), delta.getFlags(), removedFiles,
                addedFiles, changedFiles);
      }
    };
  }
}

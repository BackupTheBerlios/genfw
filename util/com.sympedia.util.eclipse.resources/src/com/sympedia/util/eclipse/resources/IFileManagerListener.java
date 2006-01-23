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
package com.sympedia.util.eclipse.resources;


import org.eclipse.core.resources.IFile;

import java.util.List;


public interface IFileManagerListener
{
  public void notifyFileChanges(IFileManager fileManager, List<IFile> removedFiles,
          List<IFile> addedFiles, List<IFile> changedFiles);
}

package com.sympedia.genfw.internal;


import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;


public class GenAppBuildState extends BuildState
{
  protected ProjectBuildState projectBuildState;

  protected Set<IPath> inputPaths = new HashSet<IPath>();

  protected Set<IPath> targetPaths = new HashSet<IPath>();

  public GenAppBuildState(ProjectBuildState projectBuildState, IPath genappPath)
  {
    super(projectBuildState.getProject(), genappPath);
    this.projectBuildState = projectBuildState;
  }

  public ProjectBuildState getProjectBuildState()
  {
    return projectBuildState;
  }

  public IPath getGenAppPath()
  {
    return getId();
  }

  public void addInputPath(IPath fullPath)
  {
    if (inputPaths.add(fullPath))
    {
      setDirty();
      projectBuildState.addGenAppByInput(fullPath, getGenAppPath());
    }
  }

  public void addTargetPath(IPath fullPath)
  {
    if (targetPaths.add(fullPath))
    {
      setDirty();
      projectBuildState.addGenAppByTarget(fullPath, getGenAppPath());
    }
  }

  public Set<IPath> getInputPaths()
  {
    return inputPaths;
  }

  public Set<IPath> getTargetPaths()
  {
    return targetPaths;
  }

  @Override
  protected void purge()
  {
    projectBuildState.clearGenApp(getGenAppPath());
    inputPaths.clear();
    targetPaths.clear();
    super.purge();
  }

  @Override
  protected void doLoad(InputStream stream) throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
    String line;

    while ((line = reader.readLine()) != null)
    {
      if (line.length() == 0) break;
      addInputPath(new Path(line));
    }

    while ((line = reader.readLine()) != null)
    {
      if (line.length() == 0) break;
      addTargetPath(new Path(line));
    }
  }

  @Override
  protected void doSave(OutputStream stream) throws IOException
  {
    PrintWriter writer = new PrintWriter(stream);
    for (IPath path : inputPaths)
    {
      writer.println(path);
    }

    writer.println();
    for (IPath path : targetPaths)
    {
      writer.println(path);
    }

    writer.println();
    writer.flush();
  }
}

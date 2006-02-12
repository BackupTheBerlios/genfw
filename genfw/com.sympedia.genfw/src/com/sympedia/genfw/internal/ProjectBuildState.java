package com.sympedia.genfw.internal;


import com.sympedia.util.eclipse.resources.ResourcesHelper;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class ProjectBuildState extends BuildState
{
  protected Map<IPath, GenAppBuildState> genAppBuildStates = new HashMap<IPath, GenAppBuildState>();

  protected Map<IPath, Set<IPath>> inputToGenAppsMap = new HashMap<IPath, Set<IPath>>();

  protected Map<IPath, Set<IPath>> targetToGenAppsMap = new HashMap<IPath, Set<IPath>>();

  public ProjectBuildState(IProject project)
  {
    super(project, project.getFullPath().append("___state___"));
  }

  public Set<IProject> getAllProjects()
  {
    Set<IProject> result = new HashSet<IProject>();
    result.add(getProject());

    for (IPath fullPath : inputToGenAppsMap.keySet())
    {
      IResource resource = ResourcesHelper.ROOT.findMember(fullPath);
      if (resource != null) result.add(resource.getProject());
    }

    for (IPath fullPath : targetToGenAppsMap.keySet())
    {
      IResource resource = ResourcesHelper.ROOT.findMember(fullPath);
      if (resource != null) result.add(resource.getProject());
    }

    return result;
  }

  public GenAppBuildState getGenAppBuildState(IPath genappPath)
  {
    GenAppBuildState state = genAppBuildStates.get(genappPath);
    if (state == null)
    {
      state = new GenAppBuildState(this, genappPath);
      genAppBuildStates.put(genappPath, state);
      setDirty();
    }

    return state;
  }

  public Set<IPath> getGenAppsByInput(IPath fullPath)
  {
    Set<IPath> result = inputToGenAppsMap.get(fullPath);
    if (result == null) result = Collections.EMPTY_SET;
    return result;
  }

  public Set<IPath> getGenAppsByTarget(IPath fullPath)
  {
    Set<IPath> result = targetToGenAppsMap.get(fullPath);
    if (result == null) result = Collections.EMPTY_SET;
    return result;
  }

  protected void addGenAppByInput(IPath fullPath, IPath genAppPath)
  {
    Set<IPath> genapps = inputToGenAppsMap.get(fullPath);
    if (genapps == null)
    {
      genapps = new HashSet<IPath>();
      inputToGenAppsMap.put(fullPath, genapps);
    }

    genapps.add(genAppPath);
  }

  protected void addGenAppByTarget(IPath fullPath, IPath genAppPath)
  {
    Set<IPath> genapps = targetToGenAppsMap.get(fullPath);
    if (genapps == null)
    {
      genapps = new HashSet<IPath>();
      targetToGenAppsMap.put(fullPath, genapps);
    }

    genapps.add(genAppPath);
  }

  protected void clearGenApp(IPath genAppPath)
  {
    clearGenApp(genAppPath, inputToGenAppsMap);
    clearGenApp(genAppPath, targetToGenAppsMap);
  }

  @Override
  protected void purge()
  {
    inputToGenAppsMap.clear();
    targetToGenAppsMap.clear();
    for (GenAppBuildState state : genAppBuildStates.values())
    {
      state.purge();
    }

    genAppBuildStates.clear();
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
      Path genappPath = new Path(line);
      GenAppBuildState state = new GenAppBuildState(this, genappPath);
      state.load();
      genAppBuildStates.put(genappPath, state);
    }
  }

  @Override
  protected void doSave(OutputStream stream) throws IOException
  {
    PrintWriter writer = new PrintWriter(stream);
    for (IPath path : genAppBuildStates.keySet())
    {
      writer.println(path);
    }

    writer.println();
    writer.flush();
  }

  private void clearGenApp(IPath genAppPath, Map<IPath, Set<IPath>> map)
  {
    for (Iterator<Entry<IPath, Set<IPath>>> it = map.entrySet().iterator(); it.hasNext();)
    {
      Entry<IPath, Set<IPath>> entry = it.next();
      Set<IPath> set = entry.getValue();
      if (set.remove(genAppPath) && set.isEmpty())
      {
        it.remove();
      }
    }
  }
}

package com.sympedia.genfw.internal;


import org.eclipse.core.runtime.*;
import java.util.*;


public class GeneratorsRegistry implements IRegistryChangeListener
{
  public static final String EXT_POINT_ID = "com.sympedia.genfw.generators";

  public static final GeneratorsRegistry INSTANCE = new GeneratorsRegistry();

  private List<GeneratorsExtension> generators = new ArrayList<GeneratorsExtension>();

  private List<Listener> listeners = new ArrayList<Listener>();

  private boolean initialized = false;

  public GeneratorsRegistry()
  {
  }

  public List<GeneratorsExtension> getGenerators()
  {
    return Collections.unmodifiableList(generators);
  }

  public List getAllElements()
  {
    List result = new ArrayList();
    for (GeneratorsExtension extension : generators)
    {
      result.addAll(extension.getAllElements());
    }

    return result;
  }

  public List<Generator> getAllGeneratorElements()
  {
    List elements = getAllElements();
    return (List<Generator>)filter(elements, Generator.class);
  }

  public synchronized void initialize()
  {
    if (!initialized)
    {
      initialized = true;
      ChangeEvent event = new ChangeEvent();

      IExtensionRegistry registry = Platform.getExtensionRegistry();
      IExtensionPoint extPoint = registry.getExtensionPoint(EXT_POINT_ID);
      IExtension[] extensions = extPoint.getExtensions();
      for (IExtension extension : extensions)
      {
        addExtension(extension, event);
      }

      event.dispatch();
      registry.addRegistryChangeListener(this);
    }
  }

  public synchronized void dispose()
  {
    if (initialized)
    {
      Platform.getExtensionRegistry().removeRegistryChangeListener(this);
      generators.clear();
      initialized = false;
    }
  }

  public void registryChanged(IRegistryChangeEvent eclipseEvent)
  {
    ChangeEvent event = new ChangeEvent();
    IExtensionDelta[] extensionDeltas = eclipseEvent.getExtensionDeltas();
    for (int i = 0; i < extensionDeltas.length; i++)
    {
      IExtensionDelta delta = extensionDeltas[i];
      if (EXT_POINT_ID.equals(delta.getExtensionPoint().getUniqueIdentifier()))
      {
        IExtension extension = delta.getExtension();
        int kind = delta.getKind();
        switch (kind)
        {
        case IExtensionDelta.ADDED:
          addExtension(extension, event);
          break;
        case IExtensionDelta.REMOVED:
          removeExtension(extension, event);
          break;
        }
      }
    }

    event.dispatch();
  }

  private void addExtension(IExtension origin, ChangeEvent event)
  {
    try
    {
      GeneratorsExtension extension = new GeneratorsExtension(null, origin);
      generators.add(extension);
      event.addExtension(extension);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  private void removeExtension(IExtension origin, ChangeEvent event)
  {
    GeneratorsExtension[] extensions = generators
            .toArray(new GeneratorsExtension[generators.size()]);
    for (GeneratorsExtension extension : extensions)
    {
      if (extension.getOrigin().equals(origin))
      {
        generators.remove(extension);
        event.removeExtension(extension);
        break;
      }
    }
  }

  private List filter(List items, Class baseClass)
  {
    List result = new ArrayList();
    for (Object item : items)
    {
      Class c = item.getClass();
      if (baseClass == null || baseClass.isAssignableFrom(c))
      {
        result.add(item);
      }
    }

    return result;
  }

  public class ChangeEvent
  {
    private List<GeneratorsExtension> added = new ArrayList<GeneratorsExtension>();

    private List<GeneratorsExtension> removed = new ArrayList<GeneratorsExtension>();

    private ChangeEvent()
    {
    }

    public GeneratorsRegistry getSource()
    {
      return GeneratorsRegistry.this;
    }

    public GeneratorsExtension[] getAddedExtensions()
    {
      return added.toArray(new GeneratorsExtension[added.size()]);
    }

    public GeneratorsExtension[] getRemovedExtensions()
    {
      return removed.toArray(new GeneratorsExtension[removed.size()]);
    }

    private void addExtension(GeneratorsExtension extension)
    {
      added.add(extension);
    }

    private void removeExtension(GeneratorsExtension extension)
    {
      removed.add(extension);
    }

    private void dispatch()
    {
      if (added.isEmpty() && removed.isEmpty()) return;
      for (Listener listener : listeners)
      {
        try
        {
          listener.notifyGeneratorsRegistryChanged(this);
        }
        catch (Exception ex)
        {
          ex.printStackTrace();
        }
      }
    }
  }

  public interface Listener
  {
    public void notifyGeneratorsRegistryChanged(ChangeEvent event);
  }
}

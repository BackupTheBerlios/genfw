package com.sympedia.genfw.internal;


import org.eclipse.core.runtime.*;
import java.util.*;


public class RulesRegistry implements IRegistryChangeListener
{
  public static final String EXT_POINT_ID = "com.sympedia.genfw.rules";

  public static final RulesRegistry INSTANCE = new RulesRegistry();

  private List<RulesExtension> rules = new ArrayList<RulesExtension>();

  private List<Listener> listeners = new ArrayList<Listener>();

  private boolean initialized = false;

  public RulesRegistry()
  {
  }

  public List<RulesExtension> getRules()
  {
    return Collections.unmodifiableList(rules);
  }

  public List getAllElements()
  {
    List result = new ArrayList();
    for (RulesExtension extension : rules)
    {
      result.addAll(extension.getAllElements());
    }

    return result;
  }

  public List<Rule> getAllRuleElements()
  {
    List elements = getAllElements();
    return (List<Rule>)filter(elements, Rule.class);
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
      rules.clear();
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
      RulesExtension extension = new RulesExtension(null, origin);
      rules.add(extension);
      event.addExtension(extension);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  private void removeExtension(IExtension origin, ChangeEvent event)
  {
    RulesExtension[] extensions = rules.toArray(new RulesExtension[rules.size()]);
    for (RulesExtension extension : extensions)
    {
      if (extension.getOrigin().equals(origin))
      {
        rules.remove(extension);
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
    private List<RulesExtension> added = new ArrayList<RulesExtension>();

    private List<RulesExtension> removed = new ArrayList<RulesExtension>();

    private ChangeEvent()
    {
    }

    public RulesRegistry getSource()
    {
      return RulesRegistry.this;
    }

    public RulesExtension[] getAddedExtensions()
    {
      return added.toArray(new RulesExtension[added.size()]);
    }

    public RulesExtension[] getRemovedExtensions()
    {
      return removed.toArray(new RulesExtension[removed.size()]);
    }

    private void addExtension(RulesExtension extension)
    {
      added.add(extension);
    }

    private void removeExtension(RulesExtension extension)
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
          listener.notifyRulesRegistryChanged(this);
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
    public void notifyRulesRegistryChanged(ChangeEvent event);
  }
}

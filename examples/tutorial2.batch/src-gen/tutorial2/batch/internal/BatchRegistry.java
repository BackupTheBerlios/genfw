package tutorial2.batch.internal;

import org.eclipse.core.runtime.*;
import java.util.*;

public class BatchRegistry
{
  public static final String EXT_POINT_ID = "tutorial2.batch.batch";

  protected List<BatchExtension> batch;

  public BatchRegistry()
  {
    IExtensionRegistry registry = Platform.getExtensionRegistry();
    IExtensionPoint extPoint = registry.getExtensionPoint(EXT_POINT_ID);
    IExtension[] extensions = extPoint.getExtensions();
    for (IExtension extension : extensions)
    {
      try
      {
        batch.add(new BatchExtension(extension));
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }
  }

  public List<BatchExtension> getBatch()
  {
    return Collections.unmodifiableList(batch);
  }
}
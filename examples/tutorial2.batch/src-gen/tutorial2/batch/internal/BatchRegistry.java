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

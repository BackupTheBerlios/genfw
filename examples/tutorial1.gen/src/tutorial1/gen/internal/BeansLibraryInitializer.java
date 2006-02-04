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
package tutorial1.gen.internal;


import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.IExternalLibraryInitializer;


/**
 * This class has to be present only to be referenced from plugin.xml
 */
public class BeansLibraryInitializer implements IExternalLibraryInitializer
{
  public void initalizeLibrary(GenLib genlib) throws Exception
  {
    // Intentionally left empty
  }
}

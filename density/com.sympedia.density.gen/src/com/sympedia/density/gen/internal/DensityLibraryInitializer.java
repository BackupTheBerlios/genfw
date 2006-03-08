package com.sympedia.density.gen.internal;


import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.IExternalLibraryInitializer;

import org.eclipse.emf.common.EMFPlugin;


/**
 * This class has to be present only to be referenced from plugin.xml!
 * @author Stepper
 *
 */
public class DensityLibraryInitializer implements IExternalLibraryInitializer
{
  public DensityLibraryInitializer()
  {
  }

  public void initalizeLibrary(GenLib genlib) throws Exception
  {
  }

  public EMFPlugin getPlugin()
  {
    return null;
  }
}

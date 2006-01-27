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
package com.sympedia.genfw.ant;


import com.sympedia.genfw.util.GenfwHelper;


public class GenfwTask extends EclipseTask
{
  protected String genapp;

  public GenfwTask()
  {
  }

  public String getGenapp()
  {
    return genapp;
  }

  public void setGenapp(String genapp)
  {
    this.genapp = genapp;
  }

  @Override
  protected void doExecute() throws Exception
  {
    System.out.println("Generator Application: " + genapp);
    GenfwHelper.processFile(genapp, getProgressMonitor());
  }
}

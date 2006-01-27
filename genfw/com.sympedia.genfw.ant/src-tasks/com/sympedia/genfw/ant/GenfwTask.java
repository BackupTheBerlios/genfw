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
  public static final int TRACE_NOTHING = 0;

  public static final int TRACE_GENAPP = 1;

  public static final int TRACE_INPUT = 2;

  public static final int TRACE_GENERATE = 3;

  public static final int TRACE_WRITE = 4;

  public static final int TRACE_INPUTOBJECT = 5;

  public static final int TRACE_RULE = 6;

  public static final int TRACE_DEFAULT = TRACE_WRITE;

  protected String genapp;

  protected int traceLevel = TRACE_DEFAULT;

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

  public int getTraceLevel()
  {
    return traceLevel;
  }

  public void setTraceLevel(int traceLevel)
  {
    this.traceLevel = traceLevel;
  }

  @Override
  protected void doExecute() throws Exception
  {
    if (traceLevel >= TRACE_GENAPP) System.out.println("Generator Application: " + genapp);
    GenfwHelper.processFile(genapp, traceLevel, getProgressMonitor());
  }
}

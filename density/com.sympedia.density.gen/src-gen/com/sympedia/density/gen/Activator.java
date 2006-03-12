package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.ecore.*;
import com.sympedia.density.gen.arch.*;

public class Activator
{
  protected static String nl;
  public static synchronized Activator create(String lineSeparator)
  {
    nl = lineSeparator;
    Activator result = new Activator();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".internal;" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = "Activator" + NL + "{" + NL + "  /**" + NL + "   * @generated" + NL + "   */" + NL + "  public void test0()" + NL + "  {" + NL + "  }" + NL + "  " + NL + "  /**" + NL + "   * @generated" + NL + "   */" + NL + "  public void test()" + NL + "  {" + NL + "  }" + NL + "  " + NL + "  /**" + NL + "   * @generated" + NL + "   */" + NL + "  public void test2()" + NL + "  {" + NL + "  }" + NL + "}";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
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

ModelProject project = (ModelProject)argument;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(project.getProjectName().replace('/', '.'));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(GenUtil.capitalize(project.getModelName()));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}

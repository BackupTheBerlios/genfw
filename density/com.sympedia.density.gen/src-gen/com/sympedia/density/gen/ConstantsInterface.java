package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.ecore.*;
import com.sympedia.density.gen.arch.*;

public class ConstantsInterface
{
  protected static String nl;
  public static synchronized ConstantsInterface create(String lineSeparator)
  {
    nl = lineSeparator;
    ConstantsInterface result = new ConstantsInterface();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "" + NL + "public interface I";
  protected final String TEXT_3 = "Constants" + NL + "{" + NL + "  public static final String PLUGIN_ID = \"";
  protected final String TEXT_4 = "\";" + NL + "}";
  protected final String TEXT_5 = NL;

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
    stringBuffer.append(project.getProjectName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(GenUtil.capitalize(project.getModelName()));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(project.getProjectName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}

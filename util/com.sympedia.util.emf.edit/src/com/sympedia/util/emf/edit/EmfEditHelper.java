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
package com.sympedia.util.emf.edit;


import com.sympedia.util.emf.EcoreHelper;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.CommandParameter;

import java.util.Collection;
import java.util.Set;


public class EmfEditHelper
{
  public static void genericNewChildDescriptors(Collection newChildDescriptors, EReference feature)
  {
    if (feature.getEType() instanceof EClass)
    {
      EClass type = (EClass)feature.getEType();
      Set<EClass> eClasses = EcoreHelper.getAllSubClasses(type, false, false, false);

      for (EClass eClass : eClasses)
      {
        if (!doesExist(eClass, newChildDescriptors))
        {
          try
          {
            EFactory factory = eClass.getEPackage().getEFactoryInstance();
            newChildDescriptors.add(new CommandParameter(null, feature, factory.create(eClass)));
          }
          catch (Exception ex)
          {
            ex.printStackTrace();
          }
        }
      }
    }
  }

  private static boolean doesExist(EClass eClass, Collection commandParameters)
  {
    for (Object object : commandParameters)
    {
      if (object instanceof CommandParameter)
      {
        Object value = ((CommandParameter)object).getValue();
        if (value instanceof EObject && ((EObject)value).eClass() == eClass)
        {
          return true;
        }
      }
    }
    return false;
  }
}

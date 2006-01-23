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
package com.sympedia.density.gen;


import com.sympedia.util.StringHelper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;


public class Annotations
{
  public static final String CONTAINED_BY = "containedBy";

  public static final String ANNOTATION_SOURCE = "com.sympedia.density";

  public static final String BASE_PACKAGE = "basePackage";

  public static final String INCOMPLETE = "incomplete";

  public static final String USES = "uses";

  public static final String WRAPS = "__wraps";

  public static final String LEGACY_METHODS = "legacy.methods";

  public static final String SIGNAL = "signal";

  public static final String SUPPRESS_SIGNAL = "suppress.signal";

  public static final String CREATOR = "creator";

  public static final String CREATOR_ACCESS = "creator.access";

  public static final String LISTENER = "listener";

  public static final String LISTENER_ACCESS = "listener.access";

  public static final String EXTENDS = "extends";

  public static String getDensityAnnotation(EModelElement element, String key)
  {
    return EcoreUtil.getAnnotation(element, ANNOTATION_SOURCE, key);
  }

  public static boolean isDensityAnnotation(EModelElement element, String key)
  {
    String annotation = EcoreUtil.getAnnotation(element, ANNOTATION_SOURCE, key);
    return StringHelper.equals(annotation, Boolean.TRUE.toString());
  }

  public static String getBasePackageName(EPackage ePackage)
  {
    return getDensityAnnotation(ePackage, BASE_PACKAGE);
  }

  public static String getContainedBy(EClassifier classifier)
  {
    return getDensityAnnotation(classifier, CONTAINED_BY);
  }

  public static String getExtends(EClass eClass)
  {
    return getDensityAnnotation(eClass, EXTENDS);
  }

  public static String getLegacyMethods(EClass eClass)
  {
    String legacy = getDensityAnnotation(eClass, LEGACY_METHODS);
    return legacy == null ? "" : legacy;
  }

  public static String getUses(EReference reference)
  {
    return getDensityAnnotation(reference, USES);
  }

  public static Class getWraps(EClass eClass)
  {
    try
    {
      String wraps = getDensityAnnotation(eClass, WRAPS);
      return Class.forName(wraps);
    }
    catch (Exception ex)
    {
      return null;
    }
  }

  public static boolean isCreatorOperation(EOperation operation)
  {
    return operation.getEType() != null ? isDensityAnnotation(operation, CREATOR) : false;
  }

  public static boolean isCreatorAccess(EOperation operation)
  {
    return isDensityAnnotation(operation, CREATOR_ACCESS);
  }

  public static boolean isIncomplete(EModelElement element)
  {
    return isDensityAnnotation(element, INCOMPLETE);
  }

  public static boolean isListenerAccess(EReference reference)
  {
    return isDensityAnnotation(reference, LISTENER_ACCESS);
  }

  public static boolean isListenerReference(EReference reference)
  {
    return reference.getEType() instanceof EClass ? isDensityAnnotation(reference, LISTENER)
            : false;
  }

  public static boolean isSignalAttribute(EAttribute attribute)
  {
    return !isDensityAnnotation(attribute, SUPPRESS_SIGNAL);
  }

  public static boolean isSignalOperation(EOperation operation)
  {
    return operation.getEType() == null ? isDensityAnnotation(operation, SIGNAL) : false;
  }
}

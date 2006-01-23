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


import com.sympedia.density.IComponent;

import com.sympedia.util.StringHelper;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class GenUtil
{
  private static int lastBufferPosition = -1;

  public static String newLine(StringBuffer stringBuffer)
  {
    String result = "";
    int currentPosition = stringBuffer.length() - 1;
    if (lastBufferPosition != -1 && lastBufferPosition <= currentPosition)
    {
      String added = stringBuffer.substring(lastBufferPosition);
      result = newline(StringHelper.isOnlyWhitespace(added));
    }

    lastBufferPosition = currentPosition;
    return result;
  }

  public static List<Method> getWrapMethods(EClass eClass)
  {
    Class clazz = Annotations.getWraps(eClass);
    if (clazz == null)
    {
      return Collections.EMPTY_LIST;
    }

    List<Method> result = new ArrayList<Method>();
    Method[] candidates = clazz.getMethods();
    for (int i = 0; i < candidates.length; i++)
    {
      Method candidate = candidates[i];
      if (validCandidate(candidate, eClass))
      {
        result.add(candidate);
      }
    }
    return result;
  }

  private static boolean validCandidate(Method candidate, EClass eClass)
  {
    if (candidate.getName().equals("getClass")) return false;
    if (candidate.getName().equals("equals")) return false;
    if (candidate.getName().equals("hashCode")) return false;
    if (candidate.getName().equals("toString")) return false;
    if (candidate.getName().equals("wait")) return false;
    if (candidate.getName().equals("notify")) return false;
    if (candidate.getName().equals("notifyAll")) return false;
    for (Iterator it = eClass.getEAllOperations().iterator(); it.hasNext();)
    {
      EOperation op = (EOperation)it.next();
      if (candidate.getName().equals(op.getName())) return false;
    }

    for (Iterator it = eClass.getEAllStructuralFeatures().iterator(); it.hasNext();)
    {
      EStructuralFeature feature = (EStructuralFeature)it.next();
      String cap = capitalize(feature.getName());
      String prefix = feature.getEType() == EcorePackage.eINSTANCE.getEBoolean() ? "is" : "get";
      if (candidate.getName().equals(prefix + cap)) return false;
      if (candidate.getName().equals("set" + cap)) return false;
    }

    return true;
  }

  public static String getFullPackageName(EPackage ePackage)
  {
    EPackage parent = ePackage.getESuperPackage();
    String base = parent != null ? getFullPackageName(parent) : Annotations
            .getBasePackageName(ePackage);
    return (base != null ? base + "." : "") + ePackage.getName();
  }

  public static String getFullName(EClassifier classifier, String prefix)
  {
    String result = getFullPackageName(classifier.getEPackage()) + ".";
    if (prefix != null)
    {
      result += prefix;
    }

    return result + classifier.getName();
  }

  public static String getFullInterfaceName(EClass eClass)
  {
    return getFullPackageName(eClass.getEPackage()) + ".I" + eClass.getName();
  }

  public static String getFullAbstractBaseName(EClass eClass)
  {
    if (Annotations.isIncomplete(eClass))
    {
      return getFullPackageName(eClass.getEPackage()) + ".impl." + eClass.getName() + "_Base";
    }
    else
    {
      return getFullImplementationName(eClass);
    }
  }

  public static String getContainerName(com.sympedia.density.gen.deploy.Container container)
  {
    return container.getName() + (container.isIncomplete() ? "_Base" : "Impl");
  }

  public static String getFullImplementationName(EClass eClass)
  {
    return getFullPackageName(eClass.getEPackage()) + ".impl." + eClass.getName() + "Impl";
  }

  public static String getInterfaceExtendsClause(EClass eClass)
  {
    StringBuffer buffer = new StringBuffer();
    for (Iterator it = eClass.getESuperTypes().iterator(); it.hasNext();)
    {
      EClass superClass = (EClass)it.next();
      if (buffer.length() != 0) buffer.append(", ");
      buffer.append(getFullName(superClass, "I"));
    }

    if (buffer.length() == 0)
    {
      buffer.append("IComponent");
    }

    String extendS = Annotations.getExtends(eClass);
    if (extendS != null)
    {
      if (buffer.length() != 0) buffer.append(", ");
      buffer.append(extendS);
    }

    extendS = buffer.toString();
    return (extendS.length() != 0 ? " extends " + extendS : "");
  }

  public static List<EClass> getListenerInterfaces(EClass eClass)
  {
    List<EClass> result = new ArrayList<EClass>();
    for (Iterator it = eClass.getEReferences().iterator(); it.hasNext();)
    {
      EReference ref = (EReference)it.next();
      EClass refType = (EClass)ref.getEType();
      if (Annotations.isListenerReference(ref) && !result.contains(refType))
      {
        result.add(refType);
      }
    }

    return result;
  }

  public static String getListenerClause(EClass eClass)
  {
    StringBuffer buffer = new StringBuffer();
    for (EClass listenerClass : getListenerInterfaces(eClass))
    {
      buffer.append(", ");
      buffer.append(getFullInterfaceName(listenerClass));
      buffer.append(".Listener");
    }

    return buffer.toString();
  }

  public static String getContextExtendsClause(EClass eClass)
  {
    StringBuffer buffer = new StringBuffer();
    for (Iterator it = eClass.getESuperTypes().iterator(); it.hasNext();)
    {
      EClass superClass = (EClass)it.next();
      if (buffer.length() != 0) buffer.append(", ");
      buffer.append(getFullPackageName(superClass.getEPackage()));
      buffer.append(".impl.");
      buffer.append(superClass.getName());
      buffer.append("_Base.IContext");
    }

    if (buffer.length() == 0)
    {
      buffer.append("com.sympedia.density.IContext");
    }

    String extendS = buffer.toString();
    return (extendS.length() != 0 ? " extends " + extendS : "");
  }

  public static String getClassExtendsClause(EClass eClass)
  {
    StringBuffer buffer = new StringBuffer();
    for (Iterator it = eClass.getESuperTypes().iterator(); it.hasNext();)
    {
      EClass superClass = (EClass)it.next();
      if (buffer.length() != 0) buffer.append(", ");
      buffer.append(getFullPackageName(superClass.getEPackage()));
      buffer.append(".impl.");
      buffer.append(superClass.getName());
      buffer.append("Impl");
    }

    if (buffer.length() == 0)
    {
      buffer.append("Component_Base");
    }

    String extendS = buffer.toString();
    return (extendS.length() != 0 ? "extends " + extendS : "");
  }

  public static String getTypeName(EReference reference)
  {
    String uses = Annotations.getUses(reference);
    if (uses != null)
    {
      return uses;
    }

    return getTypeName(reference.getEType());
  }

  public static String getGetterName(EAttribute attribute)
  {
    if (attribute.getEType() == EcorePackage.eINSTANCE.getEBoolean())
    {
      return "is" + capitalize(attribute.getName());
    }
    else
    {
      return "get" + capitalize(attribute.getName());
    }
  }

  public static String getParameters(EOperation operation)
  {
    StringBuffer buffer = new StringBuffer();
    for (Iterator it = operation.getEParameters().iterator(); it.hasNext();)
    {
      EParameter parameter = (EParameter)it.next();
      buffer.append(getTypeName(parameter.getEType()));
      buffer.append(" ");
      buffer.append(parameter.getName());
      if (it.hasNext())
      {
        buffer.append(", ");
      }
    }

    return buffer.toString();
  }

  public static String getThrowsClause(EOperation operation)
  {
    if (operation.getEExceptions().isEmpty())
    {
      return "";
    }

    StringBuffer buffer = new StringBuffer();
    for (Iterator it = operation.getEExceptions().iterator(); it.hasNext();)
    {
      EClassifier classifier = (EClassifier)it.next();
      buffer.append(buffer.length() == 0 ? " throws " : ", ");
      buffer.append(getTypeName(classifier));
    }

    return buffer.toString();
  }

  public static String getParameters(Method method)
  {
    Class[] types = method.getParameterTypes();
    if (types.length == 1)
    {
      return types[0].getName() + " arg";
    }

    StringBuffer buffer = new StringBuffer();
    for (int i = 0; i < types.length; i++)
    {
      Class type = types[i];
      if (i > 0) buffer.append(", ");
      buffer.append(type.getName());
      buffer.append(" arg");
      buffer.append(i);
    }

    return buffer.toString();
  }

  public static String getParameterNames(EOperation operation)
  {
    StringBuffer buffer = new StringBuffer();
    for (Iterator it = operation.getEParameters().iterator(); it.hasNext();)
    {
      EParameter parameter = (EParameter)it.next();
      buffer.append(parameter.getName());
      if (it.hasNext())
      {
        buffer.append(", ");
      }
    }

    return buffer.toString();
  }

  public static String capitalize(String text)
  {
    return StringHelper.firstToUpper(text);
  }

  public static EList getEventFeatures(EClass eClass)
  {
    EList result = new BasicEList();
    for (Iterator it = eClass.getEAttributes().iterator(); it.hasNext();)
    {
      EAttribute attribute = (EAttribute)it.next();
      result.add(attribute);
    }

    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();)
    {
      EOperation operation = (EOperation)it.next();
      if (Annotations.isSignalOperation(operation))
      {
        result.add(operation);
      }
    }

    return result;
  }

  public static boolean hasSignals(EClass eClass)
  {
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();)
    {
      EOperation op = (EOperation)it.next();
      if (Annotations.isSignalOperation(op))
      {
        return true;
      }
    }

    for (Iterator it = eClass.getEAttributes().iterator(); it.hasNext();)
    {
      EAttribute attr = (EAttribute)it.next();
      if (Annotations.isSignalAttribute(attr))
      {
        return true;
      }
    }

    return false;
  }

  public static boolean hasCreatorOperations(EClass eClass)
  {
    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();)
    {
      EOperation op = (EOperation)it.next();
      if (Annotations.isCreatorOperation(op))
      {
        return true;
      }
    }

    return false;
  }

  public static boolean hasBusinessMethods(EClass eClass)
  {
    if (!getWrapMethods(eClass).isEmpty())
    {
      return true;
    }

    for (Iterator it = eClass.getEOperations().iterator(); it.hasNext();)
    {
      EOperation op = (EOperation)it.next();
      if (GenUtil.isBusinessMethod(op))
      {
        return true;
      }
    }

    return false;
  }

  public static boolean isNormalDependency(EStructuralFeature feature)
  {
    if (feature instanceof EReference)
    {
      EReference reference = (EReference)feature;
      return !Annotations.isListenerReference(reference) || Annotations.isListenerAccess(reference);
    }

    return true;
  }

  public static boolean isReferenceToFill(EReference reference, int flags)
  {
    if (reference.isContainment() && (flags | IComponent.REFTYPE_CONTAINMENT) != 0)
    {
      return true;
    }
    else if (!reference.isContainment() && (flags | IComponent.REFTYPE_NORMAL) != 0)
    {
      return true;
    }

    return false;
  }

  public static boolean hasListenerReferences(EClass eClass)
  {
    for (Iterator it = eClass.getEReferences().iterator(); it.hasNext();)
    {
      EReference ref = (EReference)it.next();
      if (Annotations.isListenerReference(ref))
      {
        return true;
      }
    }

    return false;
  }

  public static String newline(boolean on)
  {
    return on ? "\n" : "";
  }

  public static String formatValue(Object value)
  {
    if (value instanceof String)
    {
      return "\"" + value + "\"";
    }

    if (value instanceof Float)
    {
      return value.toString() + "F";
    }

    if (value instanceof Double)
    {
      return value.toString() + "D";
    }

    if (value instanceof Long)
    {
      return value.toString() + "L";
    }

    return value.toString();
  }

  public static EList getDensityAnnotations(EClass eClass)
  {
    EList result = new BasicEList();
    EList annotations = eClass.getEAnnotations();
    for (Iterator it = annotations.iterator(); it.hasNext();)
    {
      EAnnotation annotation = (EAnnotation)it.next();
      String source = annotation.getSource();
      if (source != null && source.equals(Annotations.ANNOTATION_SOURCE))
      {
        result.add(annotation);
      }
    }

    return result;
  }

  public static String getEnumDef(EEnum enumDef)
  {
    StringBuffer buffer = new StringBuffer();
    EList literals = enumDef.getELiterals();
    for (Iterator it = literals.iterator(); it.hasNext();)
    {
      EEnumLiteral literal = (EEnumLiteral)it.next();
      buffer.append(literal.getName());
      if (it.hasNext()) buffer.append(", ");
    }

    return buffer.toString();
  }

  public static String getTypeName(EClassifier classifier)
  {
    if (classifier == null)
    {
      return "void";
    }

    if (classifier instanceof EEnum)
    {
      EEnum enumDef = ((EEnum)classifier);
      String containedBy = Annotations.getContainedBy(enumDef);
      if (containedBy == null)
      {
        throw new RuntimeException();
      }

      String fullPackageName = getFullPackageName(enumDef.getEPackage());
      return fullPackageName + ".I" + containedBy + "." + enumDef.getName();
    }

    if (classifier instanceof EDataType)
    {
      EDataType dataType = ((EDataType)classifier);
      String instanceClassName = dataType.getInstanceClassName();
      return instanceClassName;
    }

    if (classifier instanceof EClass)
    {
      if (classifier.getEPackage() == EcorePackage.eINSTANCE)
      {
        return "org.eclipse.emf.ecore." + classifier.getName();
      }

      String fullName = getFullName(classifier, "I");
      return fullName;
    }

    String fullPackageName = getFullPackageName(classifier.getEPackage());
    return fullPackageName + "." + classifier.getName();
  }

  public static EList getEnumDefs(EClass eClass)
  {
    EList result = new BasicEList();
    EList classifiers = eClass.getEPackage().getEClassifiers();
    for (Iterator it = classifiers.iterator(); it.hasNext();)
    {
      EClassifier classifier = (EClassifier)it.next();
      if (classifier instanceof EEnum)
      {
        String containedBy = Annotations.getContainedBy(classifier);
        if (containedBy != null && containedBy.equals(eClass.getName()))
        {
          result.add(classifier);
        }
      }
    }

    return result;
  }

  public static boolean isBusinessMethod(EOperation operation)
  {
    return !Annotations.isSignalOperation(operation) && !Annotations.isCreatorOperation(operation);
  }
}

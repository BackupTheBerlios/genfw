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
package com.sympedia.util;


import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class BeanHelper
{
  protected static final Logger logger = Logger.getLogger(BeanHelper.class);

  public static void initialize(Object bean) throws Exception
  {
    if (bean != null)
    {
      if (bean instanceof IInitializable)
      {
        ((IInitializable)bean).initialize();
      }
    }
  }

  public static void initializeSilently(Object bean)
  {
    try
    {
      initialize(bean);
    }
    catch (Exception ignore)
    {
    }
  }

  public static void dispose(Object bean) throws Exception
  {
    if (bean != null)
    {
      if (bean instanceof IDisposable)
      {
        ((IDisposable)bean).dispose();
      }
    }
  }

  public static void disposeSilently(Object bean)
  {
    try
    {
      dispose(bean);
    }
    catch (Exception ignore)
    {
    }
  }

  //  public static void setContext(Object bean, IContext context)
  //  {
  //    if (bean != null)
  //    {
  //      if (bean instanceof IContextAware)
  //      {
  //        ((IContextAware)bean).setContext(context);
  //      }
  //    }
  //  }

  public static List<Field> getAllDeclaredFields(Class clazz)
  {
    return getAllDeclaredFields(clazz, Object.class);
  }

  public static List<Field> getAllDeclaredFields(Class clazz, Class baseClass)
  {
    List<Field> result = new ArrayList<Field>();
    collectAllDeclaredFields(clazz, baseClass, result);
    return result;
  }

  private static void collectAllDeclaredFields(Class clazz, Class baseClass, List<Field> result)
  {
    if (clazz != baseClass)
    {
      collectAllDeclaredFields(clazz.getSuperclass(), baseClass, result);

      Field[] fields = clazz.getDeclaredFields();
      for (int i = 0; i < fields.length; i++)
      {
        result.add(fields[i]);
      }
    }
  }

  public static List<Method> getAllDeclaredMethods(Class clazz)
  {
    return getAllDeclaredMethods(clazz, Object.class);
  }

  public static List<Method> getAllDeclaredMethods(Class clazz, Class baseClass)
  {
    List<Method> result = new ArrayList<Method>();
    collectAllDeclaredMethods(clazz, baseClass, result);
    return result;
  }

  private static void collectAllDeclaredMethods(Class clazz, Class baseClass, List<Method> result)
  {
    if (clazz != baseClass)
    {
      collectAllDeclaredMethods(clazz.getSuperclass(), baseClass, result);

      Method[] methods = clazz.getDeclaredMethods();
      for (int i = 0; i < methods.length; i++)
      {
        result.add(methods[i]);
      }
    }
  }

  public static Class mostSpecificClass(Class[] classes)
  {
    int size = classes.length;

    for (int i = 0; i < size; i++)
    {
      Class iClass = classes[i];

      for (int k = i + 1; k < size; k++)
      {
        Class kClass = classes[k];

        if (iClass.isAssignableFrom(kClass))
        {
          // iClass is super class of kClass
          // iClass is less specific
          classes[i] = classes[--size];
          break;
        }
        else if (kClass.isAssignableFrom(iClass))
        {
          // kClass is super class of iClass
          // kClass is less specific
          classes[k] = classes[--size];
          break;
        }
      }
    }

    if (size > 1)
    {
      throw new RuntimeException("Ambiguous ViewFacories");
    }

    if (size < 1)
    {
      throw new RuntimeException("No ViewFacories");
    }

    return classes[0];
  }

  public static void dispatchChild(Object object, String name, Object value)
  {
    Method adder = findAdder(object.getClass(), name);
    if (adder == null) throw new BeanException("Child " + name + " not reognized");

    try
    {
      adder.invoke(object, new Object[] {value});
    }
    catch (Throwable t)
    {
      throw new BeanException("Child " + name + " not accessible", t);
    }
  }

  public static Object[] children(Object object, String name)
  {
    Method getter = findChildGetter(object.getClass(), name);
    if (getter == null) throw new BeanException("Child " + name + " not reognized");

    try
    {
      return (Object[])getter.invoke(object, (Object[])null);
    }
    catch (Throwable t)
    {
      throw new BeanException("Child " + name + " not accessible", t);
    }
  }

  public static void dispatchAttributeValue(Object object, String name, String value)
  {
    Method setter = findSetter(object.getClass(), name);
    if (setter == null) throw new BeanException("Attribute " + name + " not reognized");

    try
    {
      Class type = setter.getParameterTypes()[0];

      if (type == Boolean.class)
      {
        Boolean bool = value == null ? null : Boolean.valueOf(value);
        setter.invoke(object, new Object[] {bool});
      }
      else
      {
        // if (type == String)
        setter.invoke(object, new Object[] {value});
      }
    }
    catch (Throwable t)
    {
      throw new BeanException("Attribute " + name + " not accessible", t);
    }
  }

  public static void dispatchAttributeValueBoolean(Object object, String name, Boolean value)
  {
    Method setter = findSetter(object.getClass(), name);
    if (setter == null) throw new BeanException("Attribute " + name + " not reognized");
    if (setter.getParameterTypes()[0] != Boolean.class)
      throw new BeanException("Attribute " + name + " is not Boolean");

    try
    {
      setter.invoke(object, new Object[] {value});
    }
    catch (Throwable t)
    {
      throw new BeanException("Attribute " + name + " not accessible", t);
    }
  }

  public static String attributeValue(Object object, String name)
  {
    Method getter = findGetter(object.getClass(), name);
    if (getter == null) throw new BeanException("Attribute " + name + " not reognized");

    try
    {
      Object returnValue = getter.invoke(object, (Object[])null);
      if (returnValue == null) return null;
      if (returnValue instanceof String) return (String)returnValue;

      // if (returnValue instanceof Boolean)
      return ((Boolean)returnValue).toString();

    }
    catch (Throwable t)
    {
      throw new BeanException("Attribute " + name + " not accessible", t);
    }
  }

  public static Boolean attributeValueBoolean(Object object, String name)
  {
    Method getter = findGetter(object.getClass(), name);
    if (getter == null) throw new BeanException("Attribute " + name + " not reognized");
    if (getter.getReturnType() != Boolean.class)
      throw new BeanException("Attribute " + name + " is not Boolean");

    try
    {
      return (Boolean)getter.invoke(object, (Object[])null);
    }
    catch (Throwable t)
    {
      throw new BeanException("Attribute " + name + " accessible", t);
    }
  }

  public static Method findGetter(Class clazz, String name)
  {
    String accessor = "is" + capitalize(name);
    Method method = findMethod(clazz, accessor);
    if (validGetter(method)) return method;

    accessor = "get" + capitalize(name);
    method = findMethod(clazz, accessor);
    if (validGetter(method)) return method;

    return null;
  }

  public static Method findChildGetter(Class clazz, String name)
  {
    String accessor = "get" + capitalize(name) + "s";
    Method method = findMethod(clazz, accessor);
    if (validChildGetter(method)) return method;

    return null;
  }

  public static Method findSetter(Class clazz, String name)
  {
    String accessor = "set" + capitalize(name);
    Method method = findMethod(clazz, accessor);
    return validSetter(method) ? method : null;
  }

  public static Method findAdder(Class clazz, String name)
  {
    String accessor = "add" + capitalize(name);
    Method method = findMethod(clazz, accessor);
    return validAdder(method) ? method : null;
  }

  public static Method findMethod(Class clazz, String name)
  {
    List<Method> methods = getAllDeclaredMethods(clazz);
    for (Method method : methods)
    {
      if (name.equals(method.getName())) return method;
    }

    return null;
  }

  public static Field findField(Class clazz, String name)
  {
    List<Field> fields = getAllDeclaredFields(clazz);
    for (Field field : fields)
    {
      if (name.equals(field.getName())) return field;
    }

    return null;
  }

  private static boolean validGetter(Method method)
  {
    if (method == null) return false;

    Class[] paramTypes = method.getParameterTypes();
    if (paramTypes != null || paramTypes.length != 0) return false;

    Class returnType = method.getReturnType();
    if (returnType == null || !validAttributeType(returnType)) return false;

    return true;
  }

  private static boolean validSetter(Method method)
  {
    if (method == null) return false;

    Class[] paramTypes = method.getParameterTypes();
    if (paramTypes == null || paramTypes.length != 1 || !validAttributeType(paramTypes[0]))
      return false;

    Class returnType = method.getReturnType();
    if (returnType != null && returnType != void.class) return false;

    return true;
  }

  private static boolean validAdder(Method method)
  {
    if (method == null) return false;

    Class[] paramTypes = method.getParameterTypes();
    if (paramTypes == null || paramTypes.length != 1) return false;

    Class returnType = method.getReturnType();
    if (returnType != null && returnType != void.class) return false;

    return true;
  }

  private static boolean validChildGetter(Method method)
  {
    if (method == null) return false;

    Class[] paramTypes = method.getParameterTypes();
    if (paramTypes != null || paramTypes.length != 0) return false;

    Class returnType = method.getReturnType();
    if (returnType == null || !validChildType(returnType)) return false;

    return true;
  }

  private static boolean validAttributeType(Class type)
  {
    return type == String.class || type == Boolean.class;
  }

  private static boolean validChildType(Class type)
  {
    return type.isArray();
  }

  private static String capitalize(String name)
  {
    return StringHelper.firstToUpper(name);
  }

  public static boolean isPrimitive(Class type)
  {
    return type == boolean.class || type == char.class || type == byte.class || type == short.class
            || type == int.class || type == long.class || type == float.class
            || type == double.class;
  }
}

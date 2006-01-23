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
package com.sympedia.util.thread;


import com.sympedia.util.ImplementationError;
import com.sympedia.util.ThreadInterruptedException;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public final class DeadlockDetector
{
  public static final boolean DETECTION_ON = true;

  public static final boolean COMPLETE_TRACE = true;

  protected static final HashMap locks = new HashMap();

  public static void preLock()
  {
    locks.put(Thread.currentThread(), identifySource());
  }

  public static void postLock()
  {
    locks.remove(Thread.currentThread());
  }

  public static void sleep(long millis) throws ThreadInterruptedException
  {
    preLock();

    try
    {
      Thread.sleep(millis);
    }
    catch (InterruptedException ex)
    {
      throw new ThreadInterruptedException(ex);
    }
    finally
    {
      postLock();
    }
  }

  public static void wait(Object object) throws ThreadInterruptedException
  {
    preLock();

    try
    {
      object.wait();
    }
    catch (InterruptedException ex)
    {
      throw new ThreadInterruptedException(ex);
    }
    finally
    {
      postLock();
    }
  }

  public static void dump()
  {
    System.out.println();
    System.out.println("Deadlock Detection Dump");
    System.out.println("=====================================================================");

    for (Iterator iter = locks.entrySet().iterator(); iter.hasNext();)
    {
      Map.Entry entry = (Map.Entry)iter.next();
      Thread key = (Thread)entry.getKey();
      String val = (String)entry.getValue();
      System.out.println("Lock in " + key + "\n" + val);
    }

    System.out.println("=====================================================================");
    System.out.println();
    locks.clear();
  }

  public static String identifySource()
  {
    class SourceIdentificationException extends Exception
    {
      private static final long serialVersionUID = 1L;
    }

    try
    {
      throw new SourceIdentificationException();
    }
    catch (SourceIdentificationException ex)
    {
      String ignore = DeadlockDetector.class.getName();
      StackTraceElement[] frames = ex.getStackTrace();

      for (int i = 0; i < frames.length; i++)
      {
        if (!frames[i].getClassName().equals(ignore))
        {
          if (!COMPLETE_TRACE) return frames[i].toString();

          StringBuffer result = new StringBuffer();
          for (int j = i; j < frames.length; j++)
          {
            result.append("\tat " + frames[j].toString() + "\n");
          }
          return result.toString();
        }
      }

      throw new ImplementationError("identifySource() must not be called from inside the class "
              + ignore);
    }
  }
}

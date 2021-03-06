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
package com.sympedia.util.fsm;


public interface IStateMachine<SUBJECT>
{
  public int getStateCount();

  public int getEventCount();

  public String getStateName(int state);

  public String getEventName(int event);

  public ITransition<SUBJECT> getIdentityTransition();

  public void process(SUBJECT subject, int event, Object data) throws Exception;

  public void handle(int state, int event, ITransition<SUBJECT> transition);

  public void handle(int state, int event, int newState);

  public void ignore(int state, int event);

  public void cancel(int state, int event);

  public interface ITransition<SUBJECT>
  {
    public void process(SUBJECT subject, int event, Object data) throws Exception;
  }
}

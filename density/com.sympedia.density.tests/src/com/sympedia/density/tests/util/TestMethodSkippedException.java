package com.sympedia.density.tests.util;


public class TestMethodSkippedException extends RuntimeException
{
  private static final long serialVersionUID = 6791309919117141070L;

  public TestMethodSkippedException()
  {
  }

  public TestMethodSkippedException(String message)
  {
    super(message);
  }

  public TestMethodSkippedException(String message, Throwable cause)
  {
    super(message, cause);
  }

  public TestMethodSkippedException(Throwable cause)
  {
    super(cause);
  }
}

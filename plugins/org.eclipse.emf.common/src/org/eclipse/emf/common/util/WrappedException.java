/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: WrappedException.java,v 1.4 2005/12/15 12:55:50 emerks Exp $
 */
package org.eclipse.emf.common.util;


/**
 * A runtime exception that wraps another exception.
 */
public class WrappedException extends RuntimeException
{
  /**
   * Creates an instance that wraps the exception.
   */
  public WrappedException(Exception exception)
  {
    super(exception);
  }

  /**
   * Creates an instance with it's own message that wraps the exception.
   * @param message the message.
   * @param exception the exception to wrap.
   */
  public WrappedException(String message, Exception exception)
  {
    super(message, exception);
  }

  /**
   * Returns the wrapped exception.
   * @return the wrapped exception.
   */
  public Exception exception()
  {
    return (Exception)getCause();
  }
}

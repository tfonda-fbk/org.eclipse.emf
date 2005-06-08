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
 * $Id: XSDDateTimeType.java,v 1.3 2005/06/08 06:23:01 nickb Exp $
 */
package org.eclipse.xsd.impl.type;

import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;

public class XSDDateTimeType extends XSDAnySimpleType
{

  public Object getValue(String normalizedLiteral)
  {
    try
    {
      return new XMLCalendar(normalizedLiteral, XMLCalendar.DATETIME);
    }
    catch (RuntimeException exception)
    {  
    }
    return null;
  }

  public int compareValues(Object value1, Object value2)
  {
    return XMLCalendar.compare((XMLCalendar)value1, (XMLCalendar)value2);
  }
}

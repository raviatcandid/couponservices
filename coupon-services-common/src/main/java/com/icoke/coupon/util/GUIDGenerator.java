/**
 * (C) Copyright 2011, The Coca-Cola Company, All rights reserved.
 */
package com.icoke.coupon.util;

/**
 * A simple default implementation, returning nano time a GUID.
 * The intent of this GUID generator is towards generating identifiers for logging error messages. 
 * Note, within the JVM or across a cluster there is a low likelihood of collision,
 * however collision is possible.
 * 
 * @author Krishna Satya
 *
 */
public class GUIDGenerator {

	/**
	 * Default  
	 */
	public GUIDGenerator() {
		super();
	}
	
	/**
	 * A simple default implementation, returning nano time.
	 * Within the JVM or across a cluster there is a low likelihood of collision, especially
	 * because the    
	 * 
	 * @return
	 */
	public static String getGUID() {
		return String.valueOf(System.nanoTime());
	}
}

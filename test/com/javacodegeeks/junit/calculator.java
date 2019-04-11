/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.javacodegeeks.junit;

public class calculator {

	public static void main(String[] args) {
		calculator o = new calculator();
		int r = o.add(10,  5);
		System.out.println(r);
		System.out.println(o.divide(1, 2));
	}
	
	public int add(int a, int b) {
		return a + b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

}
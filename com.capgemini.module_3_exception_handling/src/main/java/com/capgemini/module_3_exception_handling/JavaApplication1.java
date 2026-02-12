/**
 * 
 */
package com.capgemini.module_3_exception_handling;

import javax.crypto.AEADBadTagException;

/**
 * 
 */
public interface JavaApplication1 {
	public static void execution1() {
		int i = 10;
		System.out.println(i);
		int j = 0;
		System.out.println(j);
		try {
			int k = i % j;
			System.out.println(k);
		}catch(ArithmeticException arithmeticException) {
			System.out.println(arithmeticException.getMessage());
			System.out.println(arithmeticException.toString());
			arithmeticException.printStackTrace();
		}
	}
}

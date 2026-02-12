/**
 * 
 */
package com.capgemini.dynamic_input_scanner_class;

import java.util.Scanner;

/**
 * 
 */
public interface JavaApplication {
	Scanner SCANNER = new Scanner(System.in);
	public static void execution() {
		System.out.println("Enter the Byte Data");
		try {
			byte byteData = SCANNER.nextByte();
			System.out.println(byteData);
		}catch(Throwable throwable) {
			System.out.println("Invalid Input! Please Try Again!");
		}
	}
}

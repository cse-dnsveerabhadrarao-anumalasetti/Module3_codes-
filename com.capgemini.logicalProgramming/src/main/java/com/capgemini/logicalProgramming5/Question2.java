/**
 * 
 */
package com.capgemini.logicalProgramming5;

/**
 * 
 */
import java.util.*;

public interface Question2 {
	public static void execution1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		System.out.println("Enter the boolean: ");
		boolean var = sc.nextBoolean(); 
		char result = check(str,var);
		System.out.println(result);
	}
	
	public static char check(String str,boolean var) {
		if(var) {
			return str.charAt(0);
		}else {
			return str.charAt(str.length()-1);
		}
	}
}

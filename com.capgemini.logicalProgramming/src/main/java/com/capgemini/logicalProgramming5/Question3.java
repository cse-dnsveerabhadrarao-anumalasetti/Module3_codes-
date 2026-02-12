/**
 * 
 */
package com.capgemini.logicalProgramming5;

/**
 * 
 */
import java.util.Scanner;

public interface Question3 {
	public static void execution1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is monkey A smiling: ");
		boolean bool1 = sc.nextBoolean();
		System.out.println("Is monkey B smiling: ");
		boolean bool2 = sc.nextBoolean();
		boolean result = monkey(bool1,bool2);
		System.out.println((result == true)? "We are in trouble" : "We are safe");
	}
	
	public static boolean monkey(boolean bool1,boolean bool2) {
		if(bool1 && bool2) return true;
		else return false;
	}
}

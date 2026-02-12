/**
 * 
 */
package com.capgemini.logicalProgramming5;

/**
 * 
 */

import java.util.Scanner;

public interface Question4 {
	public static void execution1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of tea: ");
		int tea = sc.nextInt();
		System.out.println("Enter no of candy: ");
		int candy = sc.nextInt();
		String result = outcome(tea,candy);
		System.out.println(result);
	}
	
	public static String outcome(int tea,int candy) {
		if(tea < 5 || candy < 5) return "Party is bad";
		 if((tea >= candy*2)||(candy >= tea*2)) return "The party is great";
		else return "The party is good";
	}
}

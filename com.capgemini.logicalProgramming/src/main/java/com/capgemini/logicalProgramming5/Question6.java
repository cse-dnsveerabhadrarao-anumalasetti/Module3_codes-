/**
 * 
 */
package com.capgemini.logicalProgramming5;

/**
 * 
 */
import java.util.Scanner;

public interface Question6 {
	public static void execution1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Speed of the car");
		int n = sc.nextInt();
		System.out.println("Is it your birthday(y or n): ");
		char birthday = sc.next().charAt(0);
		if(birthday=='y') n += 5;
		if(n <= 60) System.out.println("no ticket");
		else if(n >= 81) System.out.println("Big ticket");
		else System.out.println("small ticket");
		
	}
}

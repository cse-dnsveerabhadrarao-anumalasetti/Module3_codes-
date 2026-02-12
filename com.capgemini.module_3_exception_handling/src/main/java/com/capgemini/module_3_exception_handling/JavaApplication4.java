/**
 * 
 */
package com.capgemini.module_3_exception_handling;

import java.util.Scanner;

/**
 * 
 */
public interface JavaApplication4 {
	public static void execution1() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the Id: ");
			int id = sc.nextInt();
			System.out.println("Id: " + id);
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Name: " + name);
		}catch(Throwable throwable) {
			System.out.println("Exception Handled!");
		}finally {
			sc.close();
			System.out.println("Resource closed!");
		}
	}
}

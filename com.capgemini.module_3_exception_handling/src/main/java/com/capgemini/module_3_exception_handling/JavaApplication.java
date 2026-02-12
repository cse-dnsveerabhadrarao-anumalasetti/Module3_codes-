/**
 * 
 */
package com.capgemini.module_3_exception_handling;

import java.util.ArrayList;

/**
 * 
 */
public interface JavaApplication {
	public static void execution1() {
		int i = 10;
		System.out.println("Value of i is: " + i);
		int j = 0;
		System.out.println("Value of j is: " + j);
		try {
			int k = i % j;
			System.out.println("Value of k is: " + k);
		}catch(ArithmeticException e) {
			System.out.println("Number cannot be divided by Zero");
		}
	}
	
	public static void execution2() {
		String s = null;
		try {
			System.out.println(s + " " + s.length());
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("Cannot point Null with anything");
		}
	}
	
	public static void execution3() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4); al.add(-1); al.add(0); al.add(9); al.add(6); al.add(2);
		try {
			for(int i = 0; i <= al.size(); i++) {
				System.out.print(al.get(i) + " ");
			}
		}catch(IndexOutOfBoundsException indexOutOfBoundsException) {
			System.out.println("Exceeding the limit of ArrayList");
		}
	}
	
	public static void execution4() {
		int[] array = new int[] {1,-2,3,-4,5,-6};
		try {
			for(int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}
		}catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("Exceeding the limitation of Array");
		}
	}
}

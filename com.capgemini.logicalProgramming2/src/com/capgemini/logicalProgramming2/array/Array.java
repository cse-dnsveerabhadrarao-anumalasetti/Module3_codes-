/**
 * 
 */
package com.capgemini.logicalProgramming2.array;

import java.util.ArrayList;

/**
 * 
 */
public interface Array {
	public static void display(Integer[] integers) {
		for(int i = 0; i < integers.length; i++) {
			System.out.print(integers[i] + " ");
		}
		System.out.println();
	}
	
	public static void display(ArrayList<Integer> integers) {
		for(int i = 0; i < integers.size(); i++) {
			System.out.print(integers.get(i) + " ");
		}
		System.out.println();
	}
}

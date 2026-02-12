/**
 * 
 */
package com.capgemini.logicalProgramming2.array;

import java.util.ArrayList;

/**
 * 
 */
public interface SearchingAlgorithm {
	public static void linearSearch(Integer[] integers,int element) {
		int index = -1;
		for(int i = 0; i < integers.length; i++) {
			if(integers[i] == element) {
				index = i;
				break;
			}
		}
		System.out.println(index != -1 ? ("Element found at "+ index) : "Element not found");
	}
	
	public static void linearSearch(ArrayList<Integer> integers,int element) {
		int index = -1;
		for(int i = 0; i < integers.size(); i++) {
			if(integers.get(i) == element) {
				index = i;
				break;
			}
		}
		System.out.println(index != -1 ? ("Element found at "+ index) : "Element not found");
	}
}

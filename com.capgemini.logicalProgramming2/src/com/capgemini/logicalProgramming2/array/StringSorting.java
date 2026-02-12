/**
 * 
 */
package com.capgemini.logicalProgramming2.array;

/**
 * 
 */
public interface StringSorting {
	public static String ascending(String str) {
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					char temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(char c : arr) {
			sb.append(c);
		}
		return sb.toString();
	}
}

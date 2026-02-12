/**
 * 
 */
package com.capgemini.logicalProgramming2.array;

import java.util.Arrays;

/**
 * 
 */
public interface NumberSorting {
	public static void ascending(int num) {
		int c = count(num);
		int temp = num;
		int[] arr = new int[c];
		for(int i = 0; i < c; i++) {
			arr[i] = temp % 10;
			temp /= 10;
		}
		Arrays.sort(arr);
		int result = arrayToNum(arr);
		System.out.println(result);
	}
	
	public static int count(int num) {
		int temp = num;
		int c = 0;
		while(temp != 0) {
			temp /= 10;
			c++;
		}
		return c;
	}
	
	public static int arrayToNum(int[] arr) {
		int asc = 0;
		for(int i = 0; i < arr.length; i++) {
			asc = (asc * 10) + arr[i];
		}
		return asc;
	}
}

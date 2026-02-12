/**
 * 
 */
package com.capgemini.logicalProgramming5;

import java.util.Scanner;

/**
 * 
 */
public interface Question5 {
	public static void execution1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		swap(arr);
	}
	
	public static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

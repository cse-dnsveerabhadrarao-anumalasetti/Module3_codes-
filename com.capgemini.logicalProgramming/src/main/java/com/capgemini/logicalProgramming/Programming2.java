/**
 * 
 */
package com.capgemini.logicalProgramming;

import java.lang.reflect.Array;
/**
 * 
 */
import java.util.Scanner;

public class Programming2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = (Integer[]) Array.newInstance(Integer.class, n);
		System.out.println("Enter the numbers: ");
		for(int i = 0; i < n; i++) {
			Array.set(arr, i, sc.nextInt());
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}


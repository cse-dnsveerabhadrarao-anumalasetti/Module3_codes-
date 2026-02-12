/**
 * 
 */
package com.capgemini.logicalProgramming2;

/**
 * 
 */

import java.util.Scanner;

public class IncAndDecArray {
	public static void array() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		sc.close();
		int c = count(n);
		int temp = n;
		if(c % 2 != 0) {
			int[] arr = new int[c];
			for(int i = 0; i < c; i++) {
				arr[i] = temp % 10;
				temp /= 10;
			}
			String result = check(arr,c);
			System.out.println(result);
		}else {
			System.out.println("Operation cannot be performed");
		}
	}
	
	public static int count(int n) {
		int temp = n;
		int c = 0;
		while(temp != 0) {
			temp /= 10;
			c++;
		}
		return c;
	}
	
	public static String check(int[] arr,int c) {
		int mid = Math.ceilDiv(c, 2)-1;
		if((arr[mid] > arr[mid+1]) && (arr[mid] > arr[mid-1])) return "Strictly decrementing and then incrementing";
		else if((arr[mid] < arr[mid+1]) && (arr[mid] < arr[mid-1])) return "Strictly incrementing and then decrementing";
		else {
			int c1 = c-1;
			int inc = 0;
			for(int i = 0; i < c1-1; i++) {
				if(arr[i] < arr[i+1]) inc++;
			}
			if(inc == c1-1) return "Strictly incrementing";
			else return "Strictly decrementing";
		}
		
	}
}

/**
 * 
 */
package com.capgemini.logicalProgramming2;

/**
 * 
 */
import java.util.Scanner;

public class IncAndDecString {
	public static void string() {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		sc.close();
		int c = str.length();
		char[] arr1 = str.toCharArray();
		int[] intArr = new int[c];
		for(int i = 0; i < c; i++) {
			intArr[i] = (int) arr1[i];
		}
		String result = check(intArr,c);
		System.out.println(result);
	}
	
	public static String check(int[] arr,int c) {
		int mid = Math.ceilDiv(c, 2);
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

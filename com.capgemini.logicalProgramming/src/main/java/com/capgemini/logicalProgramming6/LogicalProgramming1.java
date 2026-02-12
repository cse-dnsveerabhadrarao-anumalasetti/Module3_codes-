/**
 * 
 */
package com.capgemini.logicalProgramming6;

/**
 * 
 */
public class LogicalProgramming1 {
	public static int greenTicket(int a,int b,int c) {
		if((a != b) && (b != c) && (a != c)) return 0;
		else if((a == b) && (b == c) && (c == a)) return 20;
		else return 10;
	}
	
	public static int blueTicket(int a,int b,int c) {
		if((a+b > 10) || (b+c > 10) || (c+a > 10)) return 5;
		else if((a+b == 10) || (b+c == 10) || (c+a == 10)) return 10;
		else return 0;
	}
	
	public static int[] midArray(int[] arr) {
		int mid1 = Math.ceilDiv(arr.length, 2) - 1;
		int mid2 = Math.ceilDiv(arr.length, 2);
		int[] midArr = new int[2];
		midArr[0] = mid1;
		midArr[1] = mid2;
		return midArr;
	}
}

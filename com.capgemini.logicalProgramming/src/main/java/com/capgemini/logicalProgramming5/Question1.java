/**
 * 
 */
package com.capgemini.logicalProgramming5;

/**
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

public interface Question1 {
	public static void execution1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter element: ");
			arr[i] = sc.nextInt();
		}
		boolean result = check9(arr);
		System.out.println(result + ", the element 9 is present in the array");
	}
	
	public static boolean check9(int arr[]) {
		return (arr[0] == 9 || arr[arr.length-1] == 9);
	}
	
	public static void execution2() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements: ");
		System.out.println("Enter true to stop taking input");
		while(!sc.hasNextBoolean()) {
			al.add(sc.nextInt());
		}
		boolean result = check9Al(al);
		System.out.println(result);
	}
	
	public static boolean check9Al(ArrayList<Integer> al) {
		return (al.get(0) == 9 || al.get(al.size()-1) == 9);
	}
}

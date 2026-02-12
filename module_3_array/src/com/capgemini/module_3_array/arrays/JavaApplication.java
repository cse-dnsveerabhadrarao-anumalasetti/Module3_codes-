package com.capgemini.module_3_array.arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public interface JavaApplication {
	public static void execution1() {
		int[] arr; //declaration
		arr = new int[3]; //instantiation
		// initialization
		arr[0] = 9; 
		arr[1] = 6;
		arr[2] = 1;
		//utilization - for each loop
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void execution2() {
		//declaration and instantiation
		int[] arr = (int[]) Array.newInstance(int.class, 3);
		//initialization
		Array.setInt(arr, 0, 1);
		Array.setInt(arr, 1, 2);
		Array.setInt(arr, 2, 3);
		//utilization - for loop
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Array.getInt(arr, i));
		}
	}
	
	public static void execution3() {
		//declaration and instantiation
		Integer[] arr = (Integer[]) Array.newInstance(Integer.class, 3);
		//initialization
		Array.set(arr, 0, 1);
		Array.set(arr, 1, 2);
		Array.set(arr, 2, 3);
		//utilization - for loop
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Array.get(arr, i));
		}
	}
	
	public static void execution4() {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = (Integer[]) Array.newInstance(Integer.class,5);
		for(int i = 0; i < arr.length; i++) {
			Array.set(arr, i, sc.nextInt());
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Array.get(arr,i));
		}
	}
}

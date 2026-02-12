package com.capgemini.practise.first;

import java.lang.reflect.Array;
import java.util.Scanner;

public interface JavaApplication {
	public static void execution1() {
		Car c = new Car();
		c.setId(101);
		System.out.println(c.getId());	
	}
	public static void execution2() {
		Scanner sc = new Scanner(System.in);
		Integer[] arr = (Integer[]) Array.newInstance(Integer.class,5);
		for(int i = 0; i < arr.length; i++) {
			Array.set(arr, i, sc.nextInt());
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Array.get(arr,i));
		}
	}
	
	public static void execution3() {
		Palindrome p = new Palindrome();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean result = p.checkPalindrome(str);
		System.out.println(result);
	}
}

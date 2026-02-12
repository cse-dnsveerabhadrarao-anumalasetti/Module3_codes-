/**
 * 
 */
package com.capgemini.module_3_exception_handling;

import java.util.ArrayList;

/**
 * 
 */
public interface JavaApplication3 {
	public static void execution1() {
		try {
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i = 0; i < al.size(); i++) {
				al.add(i);
			}
			for(int i = 0; i <= al.size(); i++) {
				System.out.println(al.get(i));
			}
			
			Integer arr[] = new Integer[5];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = i+1;
			}
			for(int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			String s = "Hello!";
			for(int i = 0; i <= s.length(); i++) {
				System.out.println(s.charAt(i));
			}
		}catch(Throwable throwable) {
			System.out.println("Exception Handled!");
		}
	}
}

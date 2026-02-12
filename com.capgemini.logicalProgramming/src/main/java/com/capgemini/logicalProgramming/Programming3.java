package com.capgemini.logicalProgramming;

import java.lang.reflect.Array;

public class Programming3 {
	public static void main(String[] args) {
		Character[] arr = (Character[]) Array.newInstance(Character.class, 26);
		int j = 0;
		for(char i = 'A'; i <= 'Z'; i++) {
			Array.set(arr,j, i);
			j++;
		}
		
		for(int i = 0; i < 26; i++) {
			System.out.print(Array.get(arr, i) + " ");
		}
	}
}

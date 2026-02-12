package com.capgemini.logicalProgramming;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Solution solution = new Solution();
		int c = solution.count(n);
		sc.close();
		solution.func(n,c);
	}
}

class Solution{
	public void func(int n,int c) {
		int temp = n;
		Integer[] even = (Integer[]) Array.newInstance(Integer.class,c);
		Integer[] odd = (Integer[]) Array.newInstance(Integer.class,c);
		int i = 0;
		int j = 0;
		
		while(temp != 0) {
			int t = temp % 10;
			if(t % 2 == 0) {
				Array.set(even,i,t);
				i++;
			}else {
				Array.set(odd, j, t);
				j++;
			}
			temp /= 10;
		}
		
		System.out.println("Even numbers");
		for(int k = 0; k < i; k++) {
			System.out.print(Array.get(even, k) + " ");
		}
		System.out.println();
		
		System.out.println("Odd numbers");
		for(int k = 0; k < j; k++) {
			System.out.print(Array.get(odd, k) + " ");
		}
	}
	
	public int count(int n) {
		int temp = n;
		int c = 0;
		while(temp != 0) {
			temp /= 10;
			c++;
		}
		System.out.println(c);
		return c;
	}
}
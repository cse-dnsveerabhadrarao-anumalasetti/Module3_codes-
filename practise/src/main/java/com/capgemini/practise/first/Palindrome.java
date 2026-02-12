package com.capgemini.practise.first;
public class Palindrome {	
	public boolean checkPalindrome(String str) {
//		Character[] arr = (Character[]) Array.newInstance(Character.class, str.length());
		char[] arr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i = arr.length-1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		return (sb.toString().equals(str))? true:false;
	}
	
//	public boolean checkPalindrome(String str) {
//		Character[] arr = (Character[]) Array.newInstance(Character.class, str.length());
//		arr = str.toCharArray();
//		StringBuffer sb = new StringBuffer();
//		
//		for(int i = arr.length-1; i >= 0; i--) {
//			sb.append(Array.get(arr, i));
//		}
//		return (sb.toString().equals(str))? true:false;
//	}
}

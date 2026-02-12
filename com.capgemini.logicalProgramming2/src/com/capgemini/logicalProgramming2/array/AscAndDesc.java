/**
 * 
 */
package com.capgemini.logicalProgramming2.array;

/**
 * 
 */
public interface AscAndDesc {
	public static void aodo(Integer[] integers) {
		int mid = Math.ceilDiv(integers.length, 2)-1;
		System.out.println(mid);
		for(int i = 0; i < mid; i++) {
			for(int j = 0; j < mid; j++) {
				if(integers[j] > integers[j+1]) {
					int temp = 0;
					temp = integers[j];
					integers[j] = integers[j+1];
					integers[j+1] = temp; 
				}
			}
		}
		
		for(int i = mid; i < integers.length-1; i++) {
			for(int j = mid; j < integers.length-1; j++) {
				if(integers[j] < integers[j+1]) {
					int temp = 0;
					temp = integers[j];
					integers[j] = integers[j+1];
					integers[j+1] = temp; 
				}
			}
		}
	}
}

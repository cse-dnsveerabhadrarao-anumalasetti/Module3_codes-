/**
 * 
 */
package com.capgemini.logicalProgramming2.array;

/**
 * 
 */
public interface SortingAlgorithm {
	public static void bubbleSort(Integer integers[],boolean val) {
		if(val == true) {
			for(int i = 0; i < integers.length-1; i++) {
				for(int j = 0; j < integers.length-1; j++) {
					if(integers[j] > integers[j+1]) {
						int temp = 0;
						temp = integers[j];
						integers[j] = integers[j+1];
						integers[j+1] = temp;
					}
				}
			}
		}else {
			for(int i = 0; i < integers.length-1; i++) {
				for(int j = 0; j < integers.length-1; j++) {
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
}

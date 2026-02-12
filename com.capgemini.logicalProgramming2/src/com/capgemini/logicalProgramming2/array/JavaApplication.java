/**
 * 
 */
package com.capgemini.logicalProgramming2.array;

import java.util.ArrayList;

/**
 * 
 */
public interface JavaApplication {
	public static void execution1() {
		Integer[] integers = {1,-2,3,-4,5,-6};
		Array.display(integers);
		SearchingAlgorithm.linearSearch(integers, 3);
		SortingAlgorithm.bubbleSort(integers, true);
		Array.display(integers);
	}
	
	public static void execution2() {
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(1);
		integers.add(-2);
		integers.add(3);
		integers.add(-4);
		integers.add(5);
		integers.add(-6);
		Array.display(integers);
		SearchingAlgorithm.linearSearch(integers, 3);
	}
	
	public static void execution3() {
		Integer[] integers = {1,-2,3,-4,5};
		Array.display(integers);
		AscAndDesc.aodo(integers);
		Array.display(integers);
		NumberSorting.ascending(8376825);
		String res = StringSorting.ascending("JaVaRAnI");
		System.out.println(res);
	}
}

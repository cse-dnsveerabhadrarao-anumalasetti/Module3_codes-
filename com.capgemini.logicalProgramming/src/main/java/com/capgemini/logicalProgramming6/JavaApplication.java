/**
 * 
 */
package com.capgemini.logicalProgramming6;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		System.out.println(LogicalProgramming1.greenTicket(0,0,0));
		System.out.println(LogicalProgramming1.blueTicket(11,0,0));
		int[] arr = {1,4,2,3};
		for(int i : LogicalProgramming1.midArray(arr)) {
			System.out.print(i + " ");
		}
	}
}

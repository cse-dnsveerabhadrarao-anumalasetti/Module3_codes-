/**
 * 
 */
package com.capgemini.module_3_file_handling;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		try {
			FileHandler.create();
			FileHandler.update();
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}
}

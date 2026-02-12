/**
 * 
 */
package com.capgemini.multi_threading2;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
	}
}

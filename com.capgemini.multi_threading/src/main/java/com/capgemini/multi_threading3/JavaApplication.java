/**
 * 
 */
package com.capgemini.multi_threading3;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		Resource resource = new Resource();
		
		MyThread1 myThread1 = new MyThread1(resource);
		Thread thread1 = new Thread(myThread1);
		thread1.start();
		
		MyThread2 myThread2 = new MyThread2(resource);
		Thread thread2 = new Thread(myThread2);
		thread2.start();
	}
}

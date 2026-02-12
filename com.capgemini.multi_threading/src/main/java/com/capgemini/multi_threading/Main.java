/**
 * 
 */
package com.capgemini.multi_threading;

/**
 * 
 */
public interface Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Main Thread: " + i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

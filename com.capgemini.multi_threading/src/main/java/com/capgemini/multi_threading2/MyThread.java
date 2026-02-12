/**
 * 
 */
package com.capgemini.multi_threading2;

/**
 * 
 */
public class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("My Thread: " + i);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
	
}

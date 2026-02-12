/**
 * 
 */
package com.capgemini.module_3_lambda_expressions2;

/**
 * 
 */
public interface MultiThreadedSystem {
	Runnable myThread1 = () -> {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("myThread1 : " + i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	Thread thread1 = new Thread(myThread1);
	
	Runnable myThread2 = () -> {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("myThread1 : " + i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	Thread thread2 = new Thread(myThread2);
	
	Runnable myThread3 = () -> {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("myThread1 : " + i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	Thread thread3 = new Thread(myThread3);
	
	public static void process() {
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

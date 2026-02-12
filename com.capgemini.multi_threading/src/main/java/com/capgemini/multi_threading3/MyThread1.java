/**
 * 
 */
package com.capgemini.multi_threading3;

/**
 * 
 */
public class MyThread1 implements Runnable{
	Resource resource;
	public MyThread1(Resource resource) {
		super();
		this.resource = resource;
	}
	
	@Override
	public void run() {
		resource.data(2);
	}
}

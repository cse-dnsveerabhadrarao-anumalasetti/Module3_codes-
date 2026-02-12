/**
 * 
 */
package com.capgemini.multi_threading3;

/**
 * 
 */
public class MyThread2 implements Runnable{
	Resource resource;
	public MyThread2(Resource resource) {
		super();
		this.resource = resource;
	}
	
	@Override
	public void run() {
		resource.data(4);
	}
}

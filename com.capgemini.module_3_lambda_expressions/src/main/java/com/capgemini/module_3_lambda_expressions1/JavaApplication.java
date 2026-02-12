/**
 * 
 */
package com.capgemini.module_3_lambda_expressions1;

/**
 * 
 */
public interface JavaApplication {
	MyInterface myInterface = () -> {
		System.out.println("method()");
	};
	public static void execution() {
		MyClass myClass = new MyClass();
		myClass.method();
		
		myInterface.method();
		}
}

/**
 * 
 */
package com.capgemini.java_development2.module_3_class_object;

/**
 * 
 */
public class JavaApplication {
	public static void execution() {
		Product product1 = new Product(2,"Apsara","Pencil",29.99);
		System.out.println(product1);
		Product product2 = new Product(2,"Apsara","Pencil",29.99);
		System.out.println(product2);
		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
}

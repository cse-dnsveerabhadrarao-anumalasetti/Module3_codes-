/**
 * 
 */
package com.capgemini.java_development2.module_3_class_object;

/**
 * 
 */
public class Product {
	Integer id;
	String brand;
	String name;
	Double price;
	/**
	 * @param id
	 * @param brand
	 * @param name
	 * @param price
	 */
	public Product(int id, String brand, String name, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Id: "+id+" ,Brand: "+brand+" ,name: "+name+" ,price: "+price;
	}
	@Override
	public boolean equals(Object obj) {
		Product product = (Product) obj;
		if((this.id.equals(product.id)) && (this.brand.equals(product.brand)) && (this.name.equals(product.name)) && (this.price.equals(product.price))) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return java.util.Objects.hash(id,brand,name,price);
	}
}

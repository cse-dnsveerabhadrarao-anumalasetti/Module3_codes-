package dev_test;

public interface JavaApplication {
	public static void execution() {
		ProductBean productBean1 = new ProductBean();
		productBean1.setId(1);
		productBean1.setName("Pencil");
		productBean1.setBrand("Apsara");
		productBean1.setPrice(29.99);
		
		System.out.println("Product Bean Details");
		System.out.println("--------------------");
		System.out.println("Id: " + productBean1.getId());
		System.out.println("Brand: " + productBean1.getBrand());
		System.out.println("Name: " + productBean1.getName());
		System.out.println("Price: " + productBean1.getPrice());
		System.out.println();
		
		ProductBean productBean2 = new ProductBean(1,"Apsara","Pencil",29.99);
		System.out.println(productBean2);
		
		System.out.println(productBean1.equals(productBean2));
		System.out.println(productBean1.hashCode());
		System.out.println(productBean2.hashCode());
	}
}

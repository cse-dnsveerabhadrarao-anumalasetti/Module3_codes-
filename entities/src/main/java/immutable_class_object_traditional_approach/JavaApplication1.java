package immutable_class_object_traditional_approach;

public interface JavaApplication1 {
	public static void execution1() {
		Student student1 = new Student(1,"rani","rani@gmail.com",1234567890l);
		System.out.println(student1);
		
		Student student2 = new Student(2,"reena","reena@gmail.com", 1234567899l);
		System.out.println(student2);
		
		System.out.println(student1.equals(student2));
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println();
	}
	
	public static void execution2() {
		Product product1 = new Product(1,"Apsara","Eraser",19.11);
		Product product2 = new Product(1,"Apsara","Eraser",19.11);
		
		System.out.println(product1);
		System.out.println(product2);
		
		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
}

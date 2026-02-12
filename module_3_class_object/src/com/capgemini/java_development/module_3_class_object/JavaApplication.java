package com.capgemini.java_development.module_3_class_object;

public class JavaApplication {
	public static void execution() {
		Student student = new Student();
		student.setId(101);
		student.setName("sohail");
		student.setMailId("sohail.rcom6@gmail.com");
		student.setContactNumber(1234567890l);
		System.out.println(student);
	}
}

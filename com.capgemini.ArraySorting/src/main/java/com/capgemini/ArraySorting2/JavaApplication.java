/**
 * 
 */
package com.capgemini.ArraySorting2;

import java.util.Arrays;

import com.capgemini.ArraySorting1.Student;

/**
 * 
 */
public interface JavaApplication {
	public static void display(Student[] students) {
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}
	
	public static void execution() {
		Student[] students = new Student[4];
		students[0] = new Student(1,"sohail","sohail.rcom4@gmail.com",9876543210L);
		students[1] = new Student(3,"dns","dns@gmail.com",8876543210L);
		students[2] = new Student(2,"suresh","suresh@gmail.com",7876543210L);
		students[3] = new Student(4,"ashraf","ashraf@gmail.com",6876543210L);
		display(students);
		
		SortByStudentId sortByStudentId = new SortByStudentId();
		Arrays.sort(students);
		display(students);
	}
}

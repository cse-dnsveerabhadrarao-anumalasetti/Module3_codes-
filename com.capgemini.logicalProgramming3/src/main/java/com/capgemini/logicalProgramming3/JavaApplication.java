/**
 * 
 */
package com.capgemini.logicalProgramming3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 */
public interface JavaApplication {
	Scanner SCANNER = new Scanner(System.in);
	ArrayList<Student> al = new ArrayList<Student>();
	
	public static void display(ArrayList<Student> al) {
		for (Student student : al) {
			System.out.println(student);
		}
		System.out.println();
	}

	public static void sort(ArrayList<Student> al) {
		System.out.println("Display Student record by sorting");
		System.out.println("1.Student Id");
		System.out.println("2.Student Name");
		System.out.println("3.Student mailId");
		System.out.println("4.Student Contact Number");
		System.out.println("5.exit");
		int choice = SCANNER.nextInt();
		boolean flag = true;
			switch(choice) {
			case 1:{
				SortByStudentId sortByStudentId = new SortByStudentId();
				Collections.sort(al,sortByStudentId);
				display(al);
				flag = false;
				break;
			}
			case 2:{
				SortByStudentName sortByStudentName = new SortByStudentName();
				Collections.sort(al,sortByStudentName);
				display(al);
				break;
			}
			case 3:{
				SortByStudentMailId sortByStudentMailId = new SortByStudentMailId();
				Collections.sort(al,sortByStudentMailId);
				display(al);
				break;
			}
			case 4:{
				SortByStudentContactNumber sortByStudentContactNumber = new SortByStudentContactNumber();			Collections.sort(al,sortByStudentContactNumber);
				display(al);
				break;
			}
			case 5:{
				flag = false;
				break;
			}
			default:{
				display(al);
				break;
			}
			
		}
	}

	public static void execution() {
		while (true) {
			System.out.println("Choose Your Option");
			System.out.println("------------------");
			System.out.println("1.Create Student record: ");
			System.out.println("2.Update Student record: ");
			System.out.println("3.Delete Student record: ");
			System.out.println("4.Read Student record: ");
			boolean flag = true;
			int choice = SCANNER.nextInt();
			switch (choice) {
			case 1: {
				create();
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				sort(al);
				break;
			}
			case 5:
				flag = false;
				break;
			}
		}

	}

	public static void create() {
		System.out.println("Enter the student record size: ");
		int size = SCANNER.nextInt();
		for (int i = 1; i <= size; i++) {
			System.out.println("Enter the details of student " + i);
			System.out.println("Enter the Student Id: ");
			Integer id = SCANNER.nextInt();
			System.out.println("Enter the Student name: ");
			String name = SCANNER.next();
			System.out.println("Enter the Student mailId: ");
			String mailId = SCANNER.next();
			System.out.println("Enter the Student Contact Number: ");
			Long contactNumber = SCANNER.nextLong();
			al.add(new Student(id, name, mailId, contactNumber));
		}
	}

}

package com.capgemini.logicalProgramming;

import java.lang.reflect.Array;
import java.util.Scanner;
public class Programming4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of students: ");
		int n = sc.nextInt();
		Student[] studentArr = (Student[]) Array.newInstance(Student.class, n);
		for(int i = 0; i < n; i++) {
			System.out.print("Enter Student Id: ");
			int id = sc.nextInt();
			System.out.print("Enter Student name: ");
			String name = sc.next();
			System.out.println("Enter Student section: ");
			String section = sc.next();
			System.out.println("Enter Student contact Number: ");
			long contactNumber = sc.nextLong();
			Array.set(studentArr, i, new Student(id,name,section,contactNumber));
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(Array.get(studentArr, i));
		}
		sc.close();
	}
}
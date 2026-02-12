package com.capgemini.logicalProgramming;

import lombok.Data;

@Data
public class Student {
	private int id;
	private String name;
	private String section;
	private long contactNumber;
	public Student(int id,String name,String section,long contactNumber) {
		this.id = id;
		this.name = name;
		this.section = section;
		this.contactNumber = contactNumber;
	}
}

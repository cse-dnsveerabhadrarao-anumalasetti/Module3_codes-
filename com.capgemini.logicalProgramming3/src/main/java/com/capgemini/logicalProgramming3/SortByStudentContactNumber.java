/**
 * 
 */
package com.capgemini.logicalProgramming3;

import java.util.Comparator;

/**
 * 
 */
public record SortByStudentContactNumber() implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.contactNumber.compareTo(s2.contactNumber);
	}
}

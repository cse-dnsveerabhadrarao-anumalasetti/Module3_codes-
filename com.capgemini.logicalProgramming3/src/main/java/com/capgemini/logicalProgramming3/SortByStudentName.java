/**
 * 
 */
package com.capgemini.logicalProgramming3;

import java.util.Comparator;

/**
 * 
 */
public record SortByStudentName() implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

/**
 * 
 */
package com.capgemini.logicalProgramming3;

import java.util.Comparator;

/**
 * 
 */
public record SortByStudentMailId() implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.mailId.compareTo(s2.mailId);
	}
}

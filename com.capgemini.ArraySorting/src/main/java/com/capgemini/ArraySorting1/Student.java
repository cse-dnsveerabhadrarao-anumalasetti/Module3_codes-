/**
 * 
 */
package com.capgemini.ArraySorting1;

/**
 * 
 */
public record Student(int id,String name,String mailId,Long contactNumber) implements Comparable<Student> {

	@Override
	public int compareTo(Student student) {
		if(this.id() > student.id) {
			return 1;
		}else if(this.id() < student.id) {
			return -1;
		}else {
			return 0;
		}
	}

}

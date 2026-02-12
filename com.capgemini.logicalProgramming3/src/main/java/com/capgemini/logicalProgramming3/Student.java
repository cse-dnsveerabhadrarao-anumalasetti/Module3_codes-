/**
 * 
 */
package com.capgemini.logicalProgramming3;

import lombok.Data;

/**
 * 
 */
@Data
public class Student {
	Integer id;
	String name;
	String mailId;
	Long contactNumber;
	/**
	 * @param id
	 * @param name
	 * @param mailId
	 * @param contactNumber
	 */
	public Student(Integer id, String name, String mailId, Long contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}
	
}

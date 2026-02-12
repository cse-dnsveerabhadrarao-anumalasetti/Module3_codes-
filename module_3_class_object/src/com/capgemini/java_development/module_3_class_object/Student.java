/**
 * 
 */
package com.capgemini.java_development.module_3_class_object;

/**
 * 
 */
public class Student {
	private Integer id;
	private String name;
	private String mailId;
	private long contactNumber;
	public Student() {
		super();
	}
	/**
	 * @param id
	 * @param name
	 * @param mailId
	 * @param contactNumber
	 */
	public Student(Integer id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}
	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the mailId
	 */
	public final String getMailId() {
		return mailId;
	}
	/**
	 * @param mailId the mailId to set
	 */
	public final void setMailId(String mailId) {
		this.mailId = mailId;
	}
	/**
	 * @return the contactNumber
	 */
	public final long getContactNumber() {
		return contactNumber;
	}
	/**
	 * @param contactNumber the contactNumber to set
	 */
	public final void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	

}

/**
 * 
 */
package immutable_class_object_traditional_approach;

import java.util.Objects;

/**
 * 
 */
public final class Student {
	private final Integer id;
	private final String name;
	private final String mailId;
	private final Long contactNumber;
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
	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @return the mailId
	 */
	public final String getMailId() {
		return mailId;
	}
	/**
	 * @return the contactNumber
	 */
	public final Long getContactNumber() {
		return contactNumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mailId=" + mailId + ", contactNumber=" + contactNumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(contactNumber, id, mailId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(contactNumber, other.contactNumber) && Objects.equals(id, other.id)
				&& Objects.equals(mailId, other.mailId) && Objects.equals(name, other.name);
	}
	
	
}


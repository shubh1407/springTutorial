import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

public class StudentClass {

	int rollNo;
	String name;
	Address primAddress;

	List<Address> address;

	List<Integer> contactNum;

	Set<Integer> marks;

	Set<Subjects> subject;

	Map<Subjects, Integer> subMarks;

	public StudentClass() {
		System.out.println("student default constructor");
	}

	public StudentClass(int rollNo, String name,Address primAddress) {
		super();
		System.out.println("student param constructor");
		this.rollNo = rollNo;
		this.name = name;
		this.primAddress=primAddress;
	}

	
	public StudentClass(Address primAddress) {
		super();
		this.primAddress=primAddress;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Integer> getContactNum() {
		return contactNum;
	}

	public void setContactNum(List<Integer> contactNum) {
		this.contactNum = contactNum;
	}

	public Set<Integer> getMarks() {
		return marks;
	}

	public void setMarks(Set<Integer> marks) {
		this.marks = marks;
	}

	public Set<Subjects> getSubject() {
		return subject;
	}

	public void setSubject(Set<Subjects> subject) {
		this.subject = subject;
	}

	public Map<Subjects, Integer> getSubMarks() {
		return subMarks;
	}

	public void setSubMarks(Map<Subjects, Integer> subMarks) {
		this.subMarks = subMarks;
	}

	public Address getPrimAddress() {
		return primAddress;
	}

	public void setPrimAddress(Address primAddress) {
		this.primAddress = primAddress;
	}
}

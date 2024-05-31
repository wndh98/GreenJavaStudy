package class10_polymoriphdriver.school;

public class Person {
	private String name;
	private String number;
	private String email;
	private Address address;


	public Person() {
	}

	public Person(String name, String number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	void buyParkingPass() {

	}
}

class Student extends Person {
	private String studentNo;
	private int grade;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String number, String email, String studentNo, int grade) {
		super(name, number, email);
		this.studentNo = studentNo;
		this.grade = grade;
		// TODO Auto-generated constructor stub
	}

}

class Professor extends Person {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Professor(String name, String number, String email, int salary) {
		super(name, number, email);
		this.salary = salary;
	}
	
	
	
	
}
//

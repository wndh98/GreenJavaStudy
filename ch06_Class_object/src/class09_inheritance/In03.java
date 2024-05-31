package class09_inheritance;

class Person {
	String name;
	int age;
	int allowance = 5000;

//	public Person() {
//
//	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	void print() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}

class Student extends Person {

	int grade;
	int allowance = 3000;

//	public Student() {
//		super();
//	}

	public Student(String name, int age) {
		// 부모 생성자 사용
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void print() {

		super.print();
		System.out.println("학년 : " + grade);
	}

}

public class In03 {

	public static void main(String[] args) {
		Person p1 = new Person("aa", 11);
		p1.print();
		System.out.println("-----------------");
		Student s1 = new Student("ss", 17);
		s1.grade = 9;
		s1.print();
		System.out.println(((Student) s1).allowance);
		System.out.println("-----------------");
		Person[] persons = { p1, s1 };

		for (Person p : persons) {
			p.print();
			if (p instanceof Student) {
				System.out.println(((Student) p).allowance);
			} else {
				System.out.println(p.allowance);
			}

			System.out.println("-----------");
		}
	}

}



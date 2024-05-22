package class01_basic;

public class Animal {
	String name;
	int age;
	String kind;

	void eat() {
		System.out.println("먹기");
	}

	void run() {
		System.out.println(kind + "인 " + name + "이달리기");
	}
}

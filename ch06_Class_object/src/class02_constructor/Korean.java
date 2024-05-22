package class02_constructor;

public class Korean {

	// field
	String nation = "Korea";
	String name;
	int age;
	String gender;

	// 생성자
	// 기본 생성자 - 매개변수 없음 - 다른 생성자(매개변수 있는)가 없으면 자동으로 만들어짐
	public Korean() {
	}

	// 매개변수 3개짜리 생성자
	public Korean(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}
}

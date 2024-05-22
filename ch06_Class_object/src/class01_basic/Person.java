package class01_basic;
// 클래스란?
// 객체를 생성하기 위한 설계도
// data와 함수의 결합 - 
// 클래스 다이어그램 - 클래스 설계도
public class Person {
	//field : 속성 - attribute, property, state, instance variable(인스턴스 변수)
	String name;
	int age;
	String nationality;
	Car car;
	// 생성자 : construcotr
	public Person() {} // -- 기본 생성자 - 자동으로 만들어짐
	
	// method : 행동 - behavior, function
	void eat() {
		System.out.println("먹기");
	}
	void smile() {
		System.out.println("웃기");
	}
	void sayMyName() {
		System.out.println("내이름은" + name + "입니다.");
	}
}
// 오호..
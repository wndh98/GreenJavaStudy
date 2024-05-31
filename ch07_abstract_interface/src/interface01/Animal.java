package interface01;

//인터페이스란?

//자식 클래스들의 설계도 - 설계도들의 설계도
//자식 클래스들의 연결고리 역할을 한다 - 다형성 이용
//생성 안됨, 추상메소드, 상수만 있다.
//인터페이스를 구현(implement)한 자식 클래스들은 추상메소드를 오버라이딩 해야 한다

public interface Animal {
	// 상수
//	public static final String DNA = "DNA";
	String DNA = "DNA";
	
	// 추상메소드
//	public abstract void sound();
	void sound(); // 접근자 public 으로 설정
	
}

// 추상화 클래스는 인터페이스를 상속 받을수 있느가? 가능
// 추상화 클래스는 추상화 클래스를 상속 받을수 있는가? 가능
class Dog implements Animal{
	public void sound() {
		System.out.println("왈왈");
	}
}
class Cat implements Animal{
	public void sound() {
		System.out.println("야옹");
	}
}


abstract class Person implements Animal{

	abstract void smile();
}

class Man extends Person{

	@Override
	void smile() {
		// TODO Auto-generated method stub
		System.out.println("웃음");
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("남자 소리");
	}
}


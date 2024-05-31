package abstract01;


// 추상 클래스 :
// 객체를 생성할 필요가 없는 클래스
// 자식 캘르스들의 공통적 요소와 기능을 갖고 있음 - 부모 클래스 역할
// 자식 클래스들이 각자 다른 기능을 수행할(재정의해야 할) 메소드 보유



public abstract class Animal {
	// 모든 동물이 공통적으로 갖는 특징
	String kind;
	public Animal(String kind) {
		this.kind = kind;
	}

	// 모든 동물이 공통적으로 수행하는 기능
	void breathe() {
		System.out.println(kind + " is breathe");
	}
	//이 클래스를 상속 받는 자식 클래스들이 무조건 구현해야 하는 메소드 
	abstract void sound();

}

class Dog extends Animal {
	public Dog(String kind) {
		super(kind);
	}
	
	@Override
	void sound() {
		System.out.println(kind + "멍멍");
	}
}

class Cat extends Animal {
	public Cat(String kind) {
		super(kind);
	}
	@Override
	void sound() {
		System.out.println(kind + "야옹");
	}
}

class Frog extends Animal {
	public Frog(String kind) {
		super(kind);
	}
	@Override
	void sound() {
		System.out.println(kind + "개굴개굴");
	}
}

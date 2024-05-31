package class09_inheritance;

class A {
	int a = 1;

	void a() {
		int c = 0;
		c++;
		System.out.println("parent a()");
	}

	// 부모 클래스(object)의 toString 메소드를 고쳐씀(재정의)
	@Override
	public String toString() {

		return "A [a=" + a + "]";
	}

}
//상속(extends): 확장
//부모클래스(spuer class)의 변수와 메소드를 그대로 물려받아 쓴다.
//추가로 자기 변수와 메소드를 가질 수도 있다
//물려 받은 변수와 메소드를 고쳐서 쓸 수도 있다 -> 다형성(polymorphism)

class B extends A {
	int b = 2;

	int a = 7;

	void b() {
		System.out.println("child b()");
	}

	// 부모 클래스(object)의 toString 메소드를 고쳐씀(재정의)
	@Override
	void a() {
		// TODO Auto-generated method stub
		super.a();

		System.out.println("child a()");
	}

}

public class In01 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.a();
		// 부모는 자식꺼 못씀
//		a1.b();
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.a();
		b1.b();

		System.out.println("----------------------------");

		// 자식 객체 생성 하는데 부모 타입으로 생성 - 자식은 부모한테 들어간다 - 자동형변환
		A a2 = new B();
		// 부모 객체를 자식 타입으로 생성 불가능 - 강제형변환 - 실행할때 에러 runtime error
//		B b2 = (B)new A();
		// 부모타입일때 변수의 값은 부모 클래스의 값이 적용된다
		// 부모타입일때 자기자신의 변수나 메소드는 안보임
		System.out.println(a2.a);
		// 부모타입일때 함수는 자식의 함수가 적용된다(오버라이드한 메소드) -> 다형성
		a2.a();

		// 부모 타입인 자식이 자기 변수나 메소드를 사용하려면 - 자식 타입으로 돌아와야 함
		System.out.println(((B) a2).b);
		((B) a2).b();

	}

}

// 

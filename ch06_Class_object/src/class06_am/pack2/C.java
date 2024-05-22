package class06_am.pack2;

import class06_am.pack1.A;

public class C extends A{
	public static void main(String[] args) {
		
		A a1 = new A();
		// 다른 패키지에선 protected , default 사용불가
//		A a2 = new A(1);
//		A a3 = new A(true);
		//다른 클래스의 private 생성자 이용불가
//		A a4 = new A("123");
		
		System.out.println(a1.public_int);
		// 다른 패키지에선 protected , default 사용불가
//		System.out.println(a1.protected_int);
//		System.out.println(a1.default_int);
		//다른 클래스의 private 생성자 이용불가
//		System.out.println(a1.private_int);
		
		// 상속을 받았으므로 다른 패키지의 public 과 protected 가 보인다.
		C c1 = new C();
		System.out.println(c1.protected_int);
		
	}

}


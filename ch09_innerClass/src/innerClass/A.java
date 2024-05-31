package innerClass;

//Outer Class
public class A {
	int a = 10;
	static int static_a = 20;

	public A() {
		System.out.println("A 객체 생성");
//		B b= new B();
//		b.b=3;
//		C.class=1;
//		C.static_c=3;
	}

	// 인스턴스 멤버 클래스
	class B {
		int b;

//		static int static_b=30;
		public B() {
			System.out.println("B 객체 생성");
			a = 7;
			static_a = 2;
		}

		void b_method() {
			a = 6;
			System.out.println("b메소드 입니다.");
		}
	}

	// static 인스턴스 멤버 클래스
	static class C {
		int c;
		static int static_c = 30;

		public C() {
			System.out.println("C 객체 생성");
//			a=5;
			static_a = 5;
		}

		void c_method() {
//			a=4;
			System.out.println("c메소드 입니다.");
		}

	}

	void a_method() {
		System.out.println("a 메소드 입니다.");
		// 로컬 클래스
		class D {
			int d;

//			static int static_b=30;
			public D() {
				System.out.println("D 객체 생성");
				a = 3;
				static_a = 3;
			}

			void D_method() {
				a = 2;
				System.out.println("D메소드 입니다.");
			}
		}
		D d = new D();
		d.D_method();
		d.d = 4;
		B b = new B() {
			@Override
			void b_method() {
				super.b_method();
				System.out.println("over ride b메소드");
			}
		};
		b.b_method();
	}

	 

}

package class06_am.pack1;

// access modifier (접근 제한자)
/* 같은 클래스가 아니면 사용할 때 import 필수 */
// public		: 프로젝트 전체에서 접근 가능(import 하고) 
// protected 	: 패키지 내부와 상속 받은 클래스에서 접근 가능
// default		: 패키지 내부에서 접근 가능
// private		: 클래스 내부에서만 접근 가능
public class A {
	public int public_int = 0;
	protected int protected_int = 1;
	int default_int = 2;
	private int private_int = 3;
	
	public A() {}
	protected A(int a) {}
	A(boolean b){}
	private A(String s) {}
	
	public static void main(String[] args) {
		// 같은 클래스에서는 접근 제한자 상관 없이 모두 사용가능
		A a1 = new A();
		A a2 = new A(1);
		A a3 = new A(true);
		A a4 = new A("123");
		
		System.out.println(a1.public_int);
		System.out.println(a1.protected_int);
		System.out.println(a1.default_int);
		System.out.println(a1.private_int);
		
		
		
	}
	
}

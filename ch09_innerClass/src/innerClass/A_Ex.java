package innerClass;

public class A_Ex {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);

		A.B b = a.new B();
		System.out.println(b.b);
		b.b_method();
		//static member class
		A.C c = new A.C();
		
		a.a_method();
		
	}

}
/*
 * 이너 클래스
 * 클래스 안에 만드는 클래스
 * 겉에 있는 클래스를 outer class
 * 안에 있는 클래스를 inner class 
 * inner class 는 outer 클래스를 생성한후 생성해야함
 * 단 static inner class 는 outer 클래스를 생성하지 않고도 생성 가능함
 * 
 * 
 * */







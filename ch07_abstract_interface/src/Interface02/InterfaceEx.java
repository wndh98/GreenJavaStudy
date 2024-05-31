package Interface02;

public class InterfaceEx implements InterfaceC {
	@Override
	public void method_A() {
		// TODO Auto-generated method stub
		System.out.println("method a 실행");
	}

	@Override
	public void method_B() {
		// TODO Auto-generated method stub
		System.out.println("method b 실행");
	}

	@Override
	public void method_C() {
		// TODO Auto-generated method stub
		System.out.println("method c 실행");
	}

	public static void main(String[] args) {
		InterfaceEx ie = new InterfaceEx();
		ie.method_A();
		ie.method_B();
		ie.method_C();
		InterfaceA ia = ie;
		ia.method_A();
		InterfaceB ib = ie;
		ib.method_B();
		InterfaceC ic = ie;
		ic.method_C();
	}

}

package class06_am.pack2;

import class06_am.pack1.A;

public class C extends A{
	public static void main(String[] args) {
		
		A a1 = new A();
		// �ٸ� ��Ű������ protected , default ���Ұ�
//		A a2 = new A(1);
//		A a3 = new A(true);
		//�ٸ� Ŭ������ private ������ �̿�Ұ�
//		A a4 = new A("123");
		
		System.out.println(a1.public_int);
		// �ٸ� ��Ű������ protected , default ���Ұ�
//		System.out.println(a1.protected_int);
//		System.out.println(a1.default_int);
		//�ٸ� Ŭ������ private ������ �̿�Ұ�
//		System.out.println(a1.private_int);
		
		// ����� �޾����Ƿ� �ٸ� ��Ű���� public �� protected �� ���δ�.
		C c1 = new C();
		System.out.println(c1.protected_int);
		
	}

}


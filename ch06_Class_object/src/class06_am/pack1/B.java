package class06_am.pack1;

public class B {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(1);
		A a3 = new A(true);

		// private �ٸ�Ŭ�������� ���� �Ұ���
//		A a4 = new A("123");

		System.out.println(a1.public_int);
		System.out.println(a1.protected_int);
		System.out.println(a1.default_int);

		// private �ٸ�Ŭ�������� ���� �Ұ���
//		System.out.println(a1.private_int);

	}

}

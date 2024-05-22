package class06_am.pack1;

// access modifier (���� ������)
/* ���� Ŭ������ �ƴϸ� ����� �� import �ʼ� */
// public		: ������Ʈ ��ü���� ���� ����(import �ϰ�) 
// protected 	: ��Ű�� ���ο� ��� ���� Ŭ�������� ���� ����
// default		: ��Ű�� ���ο��� ���� ����
// private		: Ŭ���� ���ο����� ���� ����
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
		// ���� Ŭ���������� ���� ������ ��� ���� ��� ��밡��
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

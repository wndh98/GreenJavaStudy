package variable;

public class Var03 {
	// Ŭ���� ����, �������� - Ŭ���� ��ü���� ��� ����
	static int num=10;
	
	public static void main(String[] args) {
//		������ scope
		// ���ο��� ������ ���� ���� �̹Ƿ� ���� �޼ҵ� ��ü���� ��� ����
		int num1 = 50;
		System.out.println(num);
		System.out.println(num1);
		if(true) {
			// ���� ���� - if���� ���������Ƿ� if �ȿ����� ����
			int num2=10;
			num1=33;
			System.out.println("num1 : " + num1);
			System.out.println("num2 : " + num2);
		}
		System.out.println("num1 : " + num1);
//		System.out.println("num2 : " + num2);
		
		
	}

}
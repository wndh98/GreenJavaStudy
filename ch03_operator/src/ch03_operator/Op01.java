package ch03_operator;

public class Op01 {

	public static void main(String[] args) {
		// ���������
		// + - / * %

		int n1 = 33;
		int n2 = 10;

		int result;
		result = n1 + n2;
		System.out.printf("%d %c %d = %d\n", n1, '+', n2, result);
		result = n1 - n2;
		System.out.printf("%d %c %d = %d\n", n1, '-', n2, result);
		//java : ������ - �� ��ȯ (����: js - 3.3)
		result = n1 / n2;
		System.out.printf("%d %c %d = %d\n", n1, '/', n2, result);
		result = n1 * n2;
		System.out.printf("%d %c %d = %d\n", n1, '*', n2, result);
		result = n1 % n2;
		System.out.printf("%d %c %d = %d\n", n1, '%', n2, result);

	}

}

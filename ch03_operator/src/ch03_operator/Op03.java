package ch03_operator;

public class Op03 {
	// ���� ������: �񱳿����ں��� ������ ��
	// &&(and), ||(or), !(not), ^(xor)

	public static void main(String[] args) {
		int n1 = 10, n2 = 4, n3 = 15, n4 = 7;
		// &&: ����, ������ ��� ���� ��쿡�� ��
		// ||: ����, ���� ��� �����̶� ���̸� ��

		// ^: ����, ������ ���� ������ false, �ٸ��� true
		System.out.println(n1 > n2 ^ n3 > n4); // true ^ true -> false
		System.out.println(n1 > n2 ^ n3 < n4); // true ^ false -> true
		System.out.println(n1 < n2 ^ n3 > n4); // false ^ true -> true
		System.out.println(n1 < n2 ^ n3 < n4); // false ^ false -> false

		
		System.out.println(!true);
	}

}
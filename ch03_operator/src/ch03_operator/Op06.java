package ch03_operator;

public class Op06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��Ʈ ������: ��Ʈ ����(0�� 1)�� ����
		// &, |, ^, ~
		int n1 = 10;// 1010
		int n2 = 5;// 0101
		int result = n1 & n2; // 0000
		System.out.println(result);
		result = n1 | n2; // 1111
		System.out.println(result);
		result = n1 ^ n2; // 1111
		System.out.println(result);
		result = ~n1; // 1111 1111 1111 1111 1111 1111 1111 0101
		System.out.println(result);

		// shift ������
		// <<(left ������), >>(right ������)

		n1 = 5;
		System.out.println(n1 << 1);
		// left ������: ������ �������� 2�� n���� ���� ���
		// 5: 0000 0101
		// <<1:0000 1010 => 10 //5 * 2^1
		// <<2:0001 0100 => 20 //5 * 2^2
		System.out.println(n1 << 2);

		// right ������: ������ �������� 2�� n������ ���� ���
		System.out.println(n1 >> 1); // 5/2^1
		System.out.println(n1 >> 2); // 5/2^2

	}

}
package variable;

public class Var04 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
//		int x = 10, y = 20;
		System.out.println("X : " + x + "| Y : " + y);
		x = y; // x�� 20���� ġȯ��
		y = x; // y�� x �� ����
		System.out.println("X : " + x + "| Y : " + y);
		x = 10;
		System.out.println("X : " + x + "| Y : " + y);
		// ����ȯ �ӽ� ������ ���
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("X : " + x + "| Y : " + y);

	}

}

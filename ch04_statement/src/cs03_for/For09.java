package cs03_for;

public class For09 {

	public static void main(String[] args) {
		// �ֻ��� �� �� ������ ���� 6�� ������ ��츦 ���
		/*
		�ֻ���1    | �ֻ���2 |�հ� 
		----------------------
		1      | 5      | 6
		----------------------
		2      | 4      | 6
		----------------------
		3      | 3      | 6
		----------------------
		4      | 2      | 6
		----------------------
		5      | 1      | 6
		*/
		System.out.println("�ֻ���1\t�ֻ���2\t�հ�");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if (i + j == 6) {
					System.out.println(i + "\t" + j + "\t" + (i + j));
					break;
				}
			}
		}
	}

}
// 

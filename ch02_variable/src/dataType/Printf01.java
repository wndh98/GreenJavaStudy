package dataType;

public class Printf01 {

	public static void main(String[] args) {
		// printf: ����� Ÿ���� �����ϰ� ������ �ڿ� ������� �ٿ���
		// Ÿ�� ����: %c: char / %s:String / %d: ���� / %f: �Ǽ� / %b: boolean
		// \(�̽������� ����): \n: �ٹٲٱ�, \t: tab, \\:�齽���� ...

		System.out.println("����" + 'A' + "�� �ڵ� ���� " + (int) 'A' + "�̴�.");
		System.out.printf("����%c�� �ڵ� ���� %d�̴�.\n", 'A', (int) 'A');
		System.out.printf("����%c�� �ڵ� ���� %d�̴�.\n", 'a', (int) 'a');

		System.out.printf("3�ڸ� ���� : %d�� %s�� => %b\n", 379, "¦��", false);
		System.out.printf("�� �ڸ��� 3���� %10d ������ ����\n", 379);
		System.out.printf("�� �ڸ��� 3���� %-10d ������ ����\n", 379);

		System.out.printf("�� �ڸ��� 3�ڸ� ���� %010d�� ���ڸ� 0ä��\n", 379);
		
		System.out.printf("%f�� �Ҽ��� 2°�ڸ� �ݿø��ϸ� %.2f�� �˴ϴ�\n", 3.145678, 3.145678);
		System.out.printf("%f�� ���� �ټ��ڸ�, �Ҽ��� 2°�ڸ� �ݿø��ϸ� %7.2f�� �˴ϴ�\n", 3141592.4324, 3141592.4324);

	}

}

package exercise;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		boolean run = true; // while �� �������� ����
		int balance = 0; // �����ܰ�
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� Ȯ��| 4. ����");
			System.out.println("-------------------------------------");
			System.out.println("�޴� ����");
			menu = sc.nextInt();
			if (menu > 4 || menu < 1) {
				System.out.println("�߸��� �����Դϴ�. 1~4 ������ ���ڸ� �Է����ּ���.");
				continue;
			}
			switch (menu) {
			case 1:
				System.out.println("���ݾ� ");
				balance+=sc.nextInt();
				break;
			case 2:
				System.out.println("��ݾ�");
				balance-=sc.nextInt();
				break;
			case 3:
				System.out.println(balance);
				break;
			case 4:
				run=false;
				break;

			}
		}
		System.out.println("���α׷� ����");

	}

}


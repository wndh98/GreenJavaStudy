package cs02_switch;

import java.util.Scanner;

public class Sw04 {

	public static void main(String[] args) {
		// 1, 3 ;
		// System.out.println("����� ���ڿ�!");
		// 1: System.out.println("2000�� ���� ����̱���");
		// 3: System.out.println("2000�� ���� ����̱���");
		// 1~4 �̿��� ���: System.out.println("go to see a doctor!");
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է�");
		String str = sc.next();
		switch (str.charAt(str.indexOf('-') + 1)) {
		case '1':
			System.out.println("����� �����Դϴ�. 2000�� ���� ����Դϴ�.");
			break;
		case '2':
			System.out.println("����� �����Դϴ�. 2000�� ���� ����Դϴ�.");
			break;
		case '3':
			System.out.println("����� �����Դϴ�. 2000�� ���� ����Դϴ�.");
			break;
		case '4':
			System.out.println("����� �����Դϴ�. 2000�� ���� ����Դϴ�.");
			break;
		default:
			System.out.println("go to see a doctor!");
		}
		sc.close();
	}

}

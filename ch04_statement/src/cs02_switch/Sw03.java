package cs02_switch;

import java.util.Scanner;

public class Sw03 {

	public static void main(String[] args) {
		int month;
		String season = "";
		System.out.println("�¾ ���� �Է��ϼ���>>> ");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		switch (month) {
		case 12: case 1: case 2:
			season = "�ܿ�";
			break;
		case 11:case 10:case 9:
			season = "����";
			break;
		case 8:case 7:case 6:
			season = "����";
			switch(month) {
			case 6: case 7:
				season="�ʿ���";
				break;
			case 8:
				season="�ѿ���";
				break;
			}
			break;
		case 5:case 4:case 3:
			season = "��";
			break;
		}
		if (month <= 12 && month >= 1) {
			System.out.printf("%d���� �¾ ����� ������� %s�� ����", month, season);
		}else {
			System.out.printf("�Ǹ�");
		}
		sc.close();
		
	}
}

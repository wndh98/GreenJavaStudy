package cs02_switch;

import java.util.Scanner;

public class Sw05 {

	public static void main(String[] args) {
		// ����������
		Scanner sc = new Scanner(System.in);
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���>>>");
		int me=sc.nextInt();
		int com=(int)(Math.random()*3)+1;
		System.out.printf("�� : %d vs ��: %d \n",me,com);
		switch(me) {
		case 1:
			switch(com) {
			case 1:
				System.out.println("�����ϴ�.");
				break;
			case 2:
				System.out.println("�����ϴ�.");
				break;
			case 3:
				System.out.println("�̰���ϴ�..");
				break;
			}
			break;
		case 2:
			switch(com) {
			case 1:
				System.out.println("�̰���ϴ�.");
				break;
			case 2:
				System.out.println("�����ϴ�.");
				break;
			case 3:
				System.out.println("�����ϴ�..");
				break;
			}
			break;
		case 3:
			switch(com) {
			case 1:
				System.out.println("�����ϴ�.");
				break;
			case 2:
				System.out.println("�̰���ϴ�.");
				break;
			case 3:
				System.out.println("�����ϴ�..");
				break;
			}
			break;
			default:
				System.out.println("1,2,3 �߿� �ϳ��� �Է����ּ���");
		}
	}

}

//
package cs02_switch;

import java.util.Scanner;

public class Sw01 {
	/*
	switch(�Ǻ���/��) {
	case 1(����): ~~~~~~ break;
	case 2(����): ~~~~~~ break;
	case 3(����): ~~~~~~ break;
	default: ~~~~~~;
	}
	*/
	public static void main(String[] args) {
		// Scanner�� �Է¹޾� ���ڿ� �´� �ܾ� ���
		// msg 1: "Love", 2: "Belief", 3:"Hope", 4:"Money" ���ΰ����μ�: "Hate"

		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		String msg = "";
		switch (select) {
			case 1:
				msg = "Love";
				break;
			case 2:
				msg = "Belief";
				break;
			case 3:
				msg = "Hope";
				break;
			case 4:
				msg = "Money";
				break;
			default:
				msg = "Hate";
		}
		System.out.println("��ſ��� ���� �߿��� �� : " + msg);
		sc.close();
	}

}

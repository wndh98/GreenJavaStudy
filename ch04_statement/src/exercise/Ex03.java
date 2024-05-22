package exercise;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		boolean run = true; // while 문 실행조건 변수
		int balance = 0; // 계좌잔고
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 확인| 4. 종료");
			System.out.println("-------------------------------------");
			System.out.println("메뉴 선택");
			menu = sc.nextInt();
			if (menu > 4 || menu < 1) {
				System.out.println("잘못된 선택입니다. 1~4 사이의 숫자를 입력해주세요.");
				continue;
			}
			switch (menu) {
			case 1:
				System.out.println("예금액 ");
				balance+=sc.nextInt();
				break;
			case 2:
				System.out.println("출금액");
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
		System.out.println("프로그램 종료");

	}

}


package cs02_switch;

import java.util.Scanner;

public class Sw05 {

	public static void main(String[] args) {
		// 가위바위보
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>>>");
		int me=sc.nextInt();
		int com=(int)(Math.random()*3)+1;
		System.out.printf("나 : %d vs 컴: %d \n",me,com);
		switch(me) {
		case 1:
			switch(com) {
			case 1:
				System.out.println("비겼습니다.");
				break;
			case 2:
				System.out.println("졌습니다.");
				break;
			case 3:
				System.out.println("이겼습니다..");
				break;
			}
			break;
		case 2:
			switch(com) {
			case 1:
				System.out.println("이겼습니다.");
				break;
			case 2:
				System.out.println("비겼습니다.");
				break;
			case 3:
				System.out.println("졌습니다..");
				break;
			}
			break;
		case 3:
			switch(com) {
			case 1:
				System.out.println("졌습니다.");
				break;
			case 2:
				System.out.println("이겼습니다.");
				break;
			case 3:
				System.out.println("비겼습니다..");
				break;
			}
			break;
			default:
				System.out.println("1,2,3 중에 하나를 입력해주세요");
		}
	}

}

//

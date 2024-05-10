package cs02_switch;

import java.util.Scanner;

public class Sw04 {

	public static void main(String[] args) {
		// 1, 3 ;
		// System.out.println("당신은 남자요!");
		// 1: System.out.println("2000년 이전 출생이군요");
		// 3: System.out.println("2000년 이후 출생이군요");
		// 1~4 이외의 경우: System.out.println("go to see a doctor!");
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");
		String str = sc.next();
		switch (str.charAt(str.indexOf('-') + 1)) {
		case '1':
			System.out.println("당신은 남자입니다. 2000년 이전 출생입니다.");
			break;
		case '2':
			System.out.println("당신은 여자입니다. 2000년 이전 출생입니다.");
			break;
		case '3':
			System.out.println("당신은 남자입니다. 2000년 이후 출생입니다.");
			break;
		case '4':
			System.out.println("당신은 여자입니다. 2000년 이후 출생입니다.");
			break;
		default:
			System.out.println("go to see a doctor!");
		}
		sc.close();
	}

}


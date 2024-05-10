package cs02_switch;

import java.util.Scanner;

public class Sw01 {
	/*
	switch(판별식/값) {
	case 1(정수): ~~~~~~ break;
	case 2(정수): ~~~~~~ break;
	case 3(정수): ~~~~~~ break;
	default: ~~~~~~;
	}
	*/
	public static void main(String[] args) {
		// Scanner로 입력받아 숫자에 맞는 단어 출력
		// msg 1: "Love", 2: "Belief", 3:"Hope", 4:"Money" 비인간적인수: "Hate"

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
		System.out.println("당신에게 가장 중요한 것 : " + msg);
		sc.close();
	}

}

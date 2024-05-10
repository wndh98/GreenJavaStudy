package cs02_switch;

import java.util.Scanner;

public class Sw03 {

	public static void main(String[] args) {
		int month;
		String season = "";
		System.out.println("태어난 달을 입력하세요>>> ");
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		switch (month) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 11:case 10:case 9:
			season = "가을";
			break;
		case 8:case 7:case 6:
			season = "여름";
			switch(month) {
			case 6: case 7:
				season="초여름";
				break;
			case 8:
				season="한여름";
				break;
			}
			break;
		case 5:case 4:case 3:
			season = "봄";
			break;
		}
		if (month <= 12 && month >= 1) {
			System.out.printf("%d월에 태어난 당신은 사랑스런 %s의 선물", month, season);
		}else {
			System.out.printf("악마");
		}
		sc.close();
		
	}
}


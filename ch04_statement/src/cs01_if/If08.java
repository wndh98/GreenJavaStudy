package cs01_if;

import java.util.Scanner;

public class If08 {

	public static void main(String[] args) {
		// 12, 1, 2 => 겨울, ... , 9, 10, 11 => 가을
		// if문 사용
		Scanner sc = new Scanner(System.in);

		int month= sc.nextInt();
		String season;
		System.out.println("몇 월생 입니까? ");
		//month = sc.nextInt();
		if (month > 0 && month < 13) {
			if (month >= 12 || month <= 2) {
				season = "겨울";
			} else if (month >= 9) {
				season = "가을";
			} else if (month >= 6) {
				season = "여름";
			} else {
				season = "봄";
			}
			System.out.printf("%d월에 태어난 당신은 사랑스런 %s의 선물", month, season);
		} else {
			System.out.println("해당 계절이 없습니다.");
		}
		
		sc.close();
	}

}

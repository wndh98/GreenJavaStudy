package backjoon;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력(-로 구분)");
		String str = sc.next();
		
		char adress = str.charAt(str.indexOf('-')+1);

		if (adress == '1' || adress == '3') {
			if (adress == '1') {
				System.out.println("주민번호 : " + str +" 2000년생 이전 남자");
			} else {
				System.out.println("주민번호 : " + str +" 2000년생 이후 남자");
			}
		} else if (adress == '2' || adress == '4') {
			if (adress == '2') {
				System.out.println("주민번호 : " + str +" 2000년생 이전 여자");
			} else {
				System.out.println("주민번호 : " + str +" 2000년생 이후 여자");
			}
		} else {
			System.out.println("사람아님");
		}
		sc.close();
	}

}

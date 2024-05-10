package ch03_operator;

import java.util.Scanner;

public class Op12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		System.out.println("문자 를 입력해주세요.");
		String input = sc.next();
		
		ch = input.charAt(0);
		System.out.println(ch);
		if(ch>='0' && ch <= '9') {
			System.out.println("입력한 문자는 숫자입니다.");
		}else if(ch>='a' && ch<='z') {
			System.out.println("입력한 문자는 영어 소문자 입니다.");
		}else {
			System.out.println("숫자도 영어 소문자도 아닙니다.");
		}
		sc.close();
	}

}


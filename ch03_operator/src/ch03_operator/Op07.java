package ch03_operator;

import java.util.Scanner;

public class Op07 {

	public static void main(String[] args) {
		// 3항식 : 조건식 ? true 의 반환값 : false 의 반환값

		// Scanner로 숫자 입력 받아서 짝수 홀수 판단해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()%2==0?"짝수":"홀수");
		sc.close();
	}

}

package exception_basic;

import java.util.Scanner;

public class Except02 {
	int a; // 인스턴스 변수 - 객체마다 갖는 변수
	static int b; // 클래스 변수 - 모든 객체가 공유하는 변수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0; // main 메소드 에서 사용하는 로컬 변수
		try {
			int c; // try 블록 안에서 사용하는 로컬 변수
			System.out.println("정수 하나 입력");
			String tmp = sc.nextLine();
			num1 = Integer.parseInt(tmp);
			System.out.println("정수 하나 입력");
			tmp = sc.nextLine();
			num2 = Integer.parseInt(tmp);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("메소드 실행전");
		int result=0;
		try {
			result = divide(num1, num2);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println(result);
	}

	private static int divide(int num1, int num2) throws ArithmeticException{
		int result;
			result = num1 / num2;

		return result;
	}

}



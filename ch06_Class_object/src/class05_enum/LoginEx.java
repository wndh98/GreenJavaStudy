package class05_enum;

import java.util.Scanner;

public class LoginEx {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���̵�");
		String id = sc.next();
		System.out.println("��й�ȣ");
		String password = sc.next();

		if (id.equals("wow") && password.equals("1234")) {
			System.out.println(LoginResult.LOGIN_SUCESS);
		} else {
			System.out.println(LoginResult.LOGIN_FAILED);
		}
	}
}

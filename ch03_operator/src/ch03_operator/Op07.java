package ch03_operator;

import java.util.Scanner;

public class Op07 {

	public static void main(String[] args) {
		// 3�׽� : ���ǽ� ? true �� ��ȯ�� : false �� ��ȯ��

		// Scanner�� ���� �Է� �޾Ƽ� ¦�� Ȧ�� �Ǵ��ؼ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.nextInt()%2==0?"¦��":"Ȧ��");
		sc.close();
	}

}
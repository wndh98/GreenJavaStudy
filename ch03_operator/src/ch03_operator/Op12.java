package ch03_operator;

import java.util.Scanner;

public class Op12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		System.out.println("���� �� �Է����ּ���.");
		String input = sc.next();
		
		ch = input.charAt(0);
		System.out.println(ch);
		if(ch>='0' && ch <= '9') {
			System.out.println("�Է��� ���ڴ� �����Դϴ�.");
		}else if(ch>='a' && ch<='z') {
			System.out.println("�Է��� ���ڴ� ���� �ҹ��� �Դϴ�.");
		}else {
			System.out.println("���ڵ� ���� �ҹ��ڵ� �ƴմϴ�.");
		}
		sc.close();
	}

}


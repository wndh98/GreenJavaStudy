package cs01_if;

import java.util.Scanner;

public class If01 {
	/*
	//if��: ���α׷��� ���� ������ �ٲ��ִ� ȿ��
	
	if(���ǽ�/��) {
	   ������ ���� �� ������ ����
	}else {
	   ������ ������ �� ������ ����
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		if(x>=0) {
			System.out.println(x);
		}else {
			System.out.println(x*-1);
		}
		sc.close();
	}

}
package cs01_if;

import java.util.Scanner;

public class If01 {
	/*
	//if문: 프로그램의 진행 방향을 바꿔주는 효과
	
	if(조건식/값) {
	   조건이 참일 때 수행할 명령
	}else {
	   조건이 거짓일 때 수행할 명령
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

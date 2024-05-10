package cs04_while_doWhile;

import java.util.Scanner;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("2-9 사이 숫자 입력");
			int dan = sc.nextInt();
			if (dan == 0)
				break;
			if (dan >= 2 && dan <= 9) {
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
				}
			} else {
				System.out.println("2-9 사이 숫자 다시입력");
			}
		}
		sc.close();
	}

}
// 



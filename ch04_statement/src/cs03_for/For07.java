package cs03_for;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇단");
		int dan = sc.nextInt();
		System.out.println("구구단" + dan + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
		}
		sc.close();
	}

}


package cs04_while_doWhile;

public class DoWhile01 {
	/*
	do {
	   조건과 관계없이 1회 실행되는 명령
	}while(조건);
	*/
	public static void main(String[] args) {
		for (int i = 1; i <= 3333; i++) {

			System.out.printf("i : %d", i);
			do {
				if (i % 10 % 3 == 0 && i % 10 != 0) {
					System.out.println("clap!");
				}
			} while ((i / 10) != 0);
			System.out.println();
		}

	}

}

// 

package cs03_for;

public class For09 {

	public static void main(String[] args) {
		// 주사위 두 개 굴려서 합이 6이 나오는 경우를 출력
		/*
		주사위1    | 주사위2 |합계 
		----------------------
		1      | 5      | 6
		----------------------
		2      | 4      | 6
		----------------------
		3      | 3      | 6
		----------------------
		4      | 2      | 6
		----------------------
		5      | 1      | 6
		*/
		System.out.println("주사위1\t주사위2\t합계");
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				if (i + j == 6) {
					System.out.println(i + "\t" + j + "\t" + (i + j));
					break;
				}
			}
		}
	}

}
// 

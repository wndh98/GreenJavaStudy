package cs03_for;

public class For13 {

	public static void main(String[] args) {
		
		/*
		// 배열 만들기: 배열 출력하기 연습
		[1, 1][1, 2][1, 3][1, 4][1, 5]
		[2, 1][2, 2][2, 3][2, 4][2, 5]
		[3, 1][3, 2][3, 3][3, 4][3, 5]
		[4, 1][4, 2][4, 3][4, 4][4, 5]
		[5, 1][5, 2][5, 3][5, 4][5, 5]
		*/
		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.printf("[%d, %d]",i+1,j+1);
//			}
//			System.out.println();
//		}
		/*
	      // 배열 만들기: 배열 출력하기 연습
	           [1, 2][1, 3][1, 4][1, 5]
	      [2, 1]      [2, 3][2, 4][2, 5]
	      [3, 1][3, 2]      [3, 4][3, 5]
	      [4, 1][4, 2][4, 3]      [4, 5]
	      [5, 1][5, 2][5, 3][5, 4]
	      */
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) {
					System.out.printf("      ");
				}else {
					System.out.printf("[%d, %d]",i+1,j+1);
				}
			}
			System.out.println();
		}
	}

}
// 
package array;

import java.util.Arrays;

public class Arr04 {
	// 다차원 배열 : 2차원 이상의 배열
	// 2차월 배열 : 표(table) - database
	public static void main(String[] args) {
		// 3행 3열짜리 2차원배열 선언, 생성
		int[][] numArr = new int[3][3];
		System.out.println(numArr[1][1]);

		// 가변형 배열 : 1행 2열, 2행 3열 배열
		int[][] numArr1 = new int[2][];

		numArr1[0] = new int[2];
		numArr1[1] = new int[3];
		numArr1[0][0] = 11;
		numArr1[0][1] = 22;
		numArr1[1][0] = 33;
		numArr1[1][1] = 44;
		numArr1[1][2] = 55;
		System.out.println(numArr1);
		System.out.println(Arrays.toString(numArr1));
		System.out.println(Arrays.toString(numArr1[0]));
		System.out.println(Arrays.toString(numArr1[1]));
//		System.out.println(numArr1[0].length);
//		System.out.println(numArr1[1].length);

		for (int i = 0; i < numArr1.length; i++) {
			for (int j = 0; j < numArr1[i].length; j++) {
				System.out.println(numArr1[i][j]);
			}
		}
		
		for(int[] row : numArr1) {
			for(int col : row) {
				System.out.println(col);
			}
		}
		
		
	}

}

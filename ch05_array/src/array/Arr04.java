package array;

import java.util.Arrays;

public class Arr04 {
	// ������ �迭 : 2���� �̻��� �迭
	// 2���� �迭 : ǥ(table) - database
	public static void main(String[] args) {
		// 3�� 3��¥�� 2�����迭 ����, ����
		int[][] numArr = new int[3][3];
		System.out.println(numArr[1][1]);

		// ������ �迭 : 1�� 2��, 2�� 3�� �迭
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

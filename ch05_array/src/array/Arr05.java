package array;

public class Arr05 {

	public static void main(String[] args) {
		// ���� 2���� �迭 3*3 ¥�� �����ؼ� �� �ְ� �Ϲ� for, Ȯ�� for�� ���
		int[][] scores = new int[3][3];
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 100) + 1;
				System.out.println(scores[i][j]);
			}
		}
		System.out.println("------------------------------------");
		for (int[] row : scores) {
			for (int col : row) {
//				col = (int) (Math.random() * 100) + 1;  // �̰�� scores���� ���� ����
				System.out.println(col);
			}
		}
		System.out.println("------------------------------------");
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println(scores[i][j]);
			}
		}
		
		

	}

}

// 

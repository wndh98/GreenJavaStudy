package array;

public class Arr05 {

	public static void main(String[] args) {
		// 정수 2차언 배열 3*3 짜리 생성해서 값 넣고 일반 for, 확장 for로 출력
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
//				col = (int) (Math.random() * 100) + 1;  // 이경우 scores에는 영향 없음
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

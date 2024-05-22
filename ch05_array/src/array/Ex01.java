package array;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrScore = new int[20];
		int sum = 0, max = 0, min = 100;
		float avg = 0.0f;

		for (int i = 0; i < arrScore.length; i++) {
			arrScore[i] = (int) (Math.random() * 100) + 1;
			sum += arrScore[i];
			if (arrScore[i] > max) {
				max = arrScore[i];
			}
			if (arrScore[i] < min) {
				min = arrScore[i];
			}
		}
		avg = sum / (float) arrScore.length;
		System.out.println("점수 : " + Arrays.toString(arrScore));
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}

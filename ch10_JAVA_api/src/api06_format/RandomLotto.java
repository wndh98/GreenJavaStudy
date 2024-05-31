package api06_format;

import java.util.Arrays;
import java.util.Random;

public class RandomLotto {

	public static void main(String[] args) {
		// 선택번호
		int[] selNum = new int[6];

		Random rd = new Random(3);
		System.out.print("선택번호: ");
		for (int i = 0; i < selNum.length; i++) {
			selNum[i] = rd.nextInt(45) + 1;
			System.out.print(selNum[i] + " ");
		}
		System.out.println();

		// 당첨번호
		Random rd1 = new Random(5);
		int[] winNum = new int[6];
		System.out.print("당첨번호: ");
		for (int i = 0; i < winNum.length; i++) {
			winNum[i] = rd1.nextInt(45) + 1;
			System.out.print(winNum[i] + " ");
		}
		System.out.println();

		// 당첨 확인
		Arrays.sort(selNum);
		System.out.print("선택번호: " + Arrays.toString(selNum));
		System.out.println();
		Arrays.sort(winNum);
		System.out.print("당첨번호: " + Arrays.toString(winNum));
		System.out.println();
		boolean result = Arrays.equals(selNum, winNum);
		if (result) {
			System.out.println("wow, 밥 사셈");
		} else {
			System.out.println("sorry, but get next chance");
		}

	}

}

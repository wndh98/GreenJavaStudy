package array;

import java.util.Arrays;

public class Arr10 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int cnt = 0;
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			cnt++;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;

					break;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(Arrays.toString(lotto));
		//버블정렬
		int tmp;
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length - 1 - i; j++) {
				if (lotto[j] > lotto[j + 1]) {
					tmp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = tmp;
				}
			}
		}

	}
}


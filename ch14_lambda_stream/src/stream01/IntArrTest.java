package stream01;

import java.util.Arrays;

public class IntArrTest {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
//		int sum = 0;
//		for (int i : arr) {
//			sum += i;
//		}
//		System.out.println(sum);
		System.out.println(Arrays.stream(arr).sum());
		System.out.println(Arrays.stream(arr).count());
		System.out.println(Arrays.stream(arr).reduce(1,(x,y)->x*y));
	}
}

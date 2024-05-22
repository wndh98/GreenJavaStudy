package array;

import java.util.Arrays;

public class Arr03 {

	public static void main(String[] args) {
		int[] scores = { 79, 88, 69, 53, 92, 99, 47, 84, 100, 39, 77 };
		int sum=0;
		int max=0;
		int min=100;
		for(int i=0; i<scores.length;i++) {
			sum+=scores[i];
			if(scores[i]>max) {
				max=scores[i];
			}
			if(scores[i]<min) {
				min=scores[i];
			}
			
		}
//		System.out.println(scores);
//		System.out.println(scores.toString());
//		System.out.println(Arrays.toString(scores));
//		System.out.println(sum/scores.length);
//		System.out.println(max);
//		System.out.println(min);
		//enhanced for
		for(int i : scores) {
			System.out.println(i);
		}

	}

}

package cs03_for;

public class For11 {

	public static void main(String[] args) {
		// 1~100까지의 합계 출력
		// 출력의 예
		// 1 ~ 10까지의 합: 55
		// 11 ~ 20까지의 합: 155(1~20까지의 합 - 1~10까지의 합 )~~

		int sum = 0;
		int preSum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if (i % 10 == 0) {
				System.out.println(i - 9 + "부터 " + i + "까지의 합: " + (sum - preSum));
				preSum = sum; 
			}
		}
	}

}

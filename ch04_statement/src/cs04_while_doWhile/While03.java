package cs04_while_doWhile;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// while문 대표적 사용 형태: 특정한 조건이 될 때까지 무한루프
		Scanner sc = new Scanner(System.in);
		int num = 0,sum=0;
		boolean run = true;
		while (run) {
			System.out.println("1부터 합계를 구하고 싶은 숫자 입력 (프로그램 중단 0)");
			num=sc.nextInt();
			
			if (num == 0) {
				run = false;
				continue;
			}
			if(num<0) {
				for(int i=1;i>=num;i--) {
					sum+=i;
				}	
			}else {
				for(int i=1;i<=num;i++) {
					sum+=i;
				}
			}
			System.out.println("1부터" + num + "까지의 합 : " + sum);
			sum=0;
			
		}
		sc.close();
	}

}
// 어림도없지 롤의 구렁텅이로 떨어뜨려주마

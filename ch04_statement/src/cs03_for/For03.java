package cs03_for;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		int start;
		int end;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("���۰�");
		start=sc.nextInt();
		System.out.println("����");
		end=sc.nextInt();
		if(start<=end) {
			for(int i=start;i<=end;i++) {
				sum+=i;
			}
			System.out.printf("%d���� %d������ ��: %d", start, end, sum);
		      
		}else {
			System.out.println("�߸��Ȱ� �Է�");
		}
		sc.close();
		

	}

}

// me - com 
// 1  -   3


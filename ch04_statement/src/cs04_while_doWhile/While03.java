package cs04_while_doWhile;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// while�� ��ǥ�� ��� ����: Ư���� ������ �� ������ ���ѷ���
		Scanner sc = new Scanner(System.in);
		int num = 0,sum=0;
		boolean run = true;
		while (run) {
			System.out.println("1���� �հ踦 ���ϰ� ���� ���� �Է� (���α׷� �ߴ� 0)");
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
			System.out.println("1����" + num + "������ �� : " + sum);
			sum=0;
			
		}
		sc.close();
	}

}
// ������� ���� �������̷� ����߷��ָ�
package backjoon;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է�(-�� ����)");
		String str = sc.next();
		
		char adress = str.charAt(str.indexOf('-')+1);

		if (adress == '1' || adress == '3') {
			if (adress == '1') {
				System.out.println("�ֹι�ȣ : " + str +" 2000��� ���� ����");
			} else {
				System.out.println("�ֹι�ȣ : " + str +" 2000��� ���� ����");
			}
		} else if (adress == '2' || adress == '4') {
			if (adress == '2') {
				System.out.println("�ֹι�ȣ : " + str +" 2000��� ���� ����");
			} else {
				System.out.println("�ֹι�ȣ : " + str +" 2000��� ���� ����");
			}
		} else {
			System.out.println("����ƴ�");
		}
		sc.close();
	}

}

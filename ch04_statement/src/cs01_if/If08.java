package cs01_if;

import java.util.Scanner;

public class If08 {

	public static void main(String[] args) {
		// 12, 1, 2 => �ܿ�, ... , 9, 10, 11 => ����
		// if�� ���
		Scanner sc = new Scanner(System.in);

		int month= sc.nextInt();
		String season;
		System.out.println("�� ���� �Դϱ�? ");
		//month = sc.nextInt();
		if (month > 0 && month < 13) {
			if (month >= 12 || month <= 2) {
				season = "�ܿ�";
			} else if (month >= 9) {
				season = "����";
			} else if (month >= 6) {
				season = "����";
			} else {
				season = "��";
			}
			System.out.printf("%d���� �¾ ����� ������� %s�� ����", month, season);
		} else {
			System.out.println("�ش� ������ �����ϴ�.");
		}
		
		sc.close();
	}

}
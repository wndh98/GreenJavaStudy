package dataType;

import java.util.Scanner;

public class TempConvertor {
	// �µ� ��ȯ��: ȭ��, ���� �µ��� �Է� �޾� ��ȯ ���
	public static void main(String[] args) {
		// system.���κ��� ���� ���� Scanner ��ü�� ����
		Scanner sc = new Scanner(System.in);
		// �� �޶�� �޽��� ���
		System.out.println("ȭ�� -> ���� : 1 , ���� -> ȭ�� : 2 ����");
		// ��ĳ�ʷ� ���� ���� ���ڿ� ���� kind �� ����
		// next() �޼ҵ�� ���� ���� String Ÿ������ ��ȯ
		String kind = sc.next();
		// kind ������ ����� ���ڿ� Ÿ���� ���� int�� �о select�� ����
		int select = Integer.parseInt(kind);
		
		if (select == 1) {
			System.out.println("ȭ�� �µ� >> ");
			// �µ��� �Ǽ� float Ÿ������ �Է¹���
			float ft = sc.nextFloat();
			// ���� �µ�(ct)�� ��ȯ
			float ct = (ft - 32) * 5 / 9;
			System.out.printf("ȭ�� %.2f���� ���� %.2f���Դϴ�.", ft, ct);
		} else if (select == 2) {
			System.out.println("���� �µ� >> ");
			// �µ��� �Ǽ� float Ÿ������ �Է¹���
			float ct = sc.nextFloat();
			// ���� �µ�(ct)�� ��ȯ
			float ft = ct * 9 / 5 + 32;
			System.out.printf("���� %.2f���� ȭ�� %.2f���Դϴ�.", ct, ft);
		} else {
			System.out.println("�ٽ� �Է�");
		}
		sc.close();
	}

}




package array;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		// myLotto
		// ��ĳ�ʷ� �� �Է� �޾� �ζ� ��ȣ �ϼ�
		// ������ ��� �� �ٽ� �ޱ�
		// �ߺ��� �� �ٽ� �ޱ�
		// ����

		// lottoNum
		// ���� ����Ͽ� �ߺ� ���� �ϼ��� ����

		// �� �ζǿ� ��¥ �ζ� �� �ؼ� 6���� 1�� 5���� 2�� 4���� 3�� �������� Ż��

		int[] myLotto = new int[6];
		int[] lottoNum = new int[6];
		Scanner sc = new Scanner(System.in);
		int tmp;
		int cnt = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "��° �ζǹ�ȣ�� �Է����ּ���");
			myLotto[i] = sc.nextInt();
			if (myLotto[i] < 1 || myLotto[i] > 45) {
				System.out.println("1~45������ ���ڸ� �Է����ּ���.");
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (myLotto[i] == myLotto[j]) {
					System.out.println("�ߺ��� �����Դϴ�.");
					i--;
					break;
				}
			}
		}

		for (int i = 0; i < myLotto.length - 1; i++) {
			for (int j = 0; j < myLotto.length - 1 - i; j++) {
				if (myLotto[j] > myLotto[j + 1]) {
					tmp = myLotto[j];
					myLotto[j] = myLotto[j + 1];
					myLotto[j + 1] = tmp;
				}
			}
		}
		System.out.println("�� �ζ� ��ȣ : " + Arrays.toString(myLotto));

		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lottoNum.length - 1; i++) {
			for (int j = 0; j < lottoNum.length - 1 - i; j++) {
				if (lottoNum[j] > lottoNum[j + 1]) {
					tmp = lottoNum[j];
					lottoNum[j] = lottoNum[j + 1];
					lottoNum[j + 1] = tmp;
				}
			}
		}
		System.out.println("�ζ� ��ȣ : " + Arrays.toString(lottoNum));
		for (int i = 0; i < myLotto.length; i++) {
			if (myLotto[i] == lottoNum[i]) {
				cnt++;
			}
		}
		switch (cnt) {
		case 6:
			System.out.println("1��");
			break;
		case 5:
			System.out.println("2��");
			break;
		case 4:
			System.out.println("3��");
			break;
		default:
			System.out.println("��");
			break;

		}
		
		
	}

}
// 
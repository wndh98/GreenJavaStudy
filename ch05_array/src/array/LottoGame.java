package array;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGame {

	public static void main(String[] args) {
		// myLotto
		// 스캐너로 값 입력 받아 로또 번호 완성
		// 범위에 벗어난 값 다시 받기
		// 중복된 값 다시 받기
		// 정렬

		// lottoNum
		// 랜덤 출력하여 중복 제거 완성시 정렬

		// 내 로또와 진짜 로또 비교 해서 6개면 1등 5개면 2등 4개명 3등 나머지는 탈락

		int[] myLotto = new int[6];
		int[] lottoNum = new int[6];
		Scanner sc = new Scanner(System.in);
		int tmp;
		int cnt = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println((i + 1) + "번째 로또번호를 입력해주세요");
			myLotto[i] = sc.nextInt();
			if (myLotto[i] < 1 || myLotto[i] > 45) {
				System.out.println("1~45사이의 숫자를 입력해주세요.");
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (myLotto[i] == myLotto[j]) {
					System.out.println("중복된 숫자입니다.");
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
		System.out.println("내 로또 번호 : " + Arrays.toString(myLotto));

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
		System.out.println("로또 번호 : " + Arrays.toString(lottoNum));
		for (int i = 0; i < myLotto.length; i++) {
			if (myLotto[i] == lottoNum[i]) {
				cnt++;
			}
		}
		switch (cnt) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 4:
			System.out.println("3등");
			break;
		default:
			System.out.println("꽝");
			break;

		}
		
		
	}

}
// 
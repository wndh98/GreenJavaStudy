package dataType;

import java.util.Scanner;

public class TempConvertor {
	// 온도 변환기: 화씨, 섭씨 온도를 입력 받아 변환 출력
	public static void main(String[] args) {
		// system.으로부터 값을 받을 Scanner 객체를 생성
		Scanner sc = new Scanner(System.in);
		// 값 달라는 메시지 출력
		System.out.println("화씨 -> 섭씨 : 1 , 섭씨 -> 화씨 : 2 선택");
		// 스캐너로 받은 값을 문자열 변수 kind 에 넣음
		// next() 메소드는 읽은 값을 String 타입으로 반환
		String kind = sc.next();
		// kind 변수에 저장된 문자열 타입의 값을 int로 읽어서 select에 저장
		int select = Integer.parseInt(kind);
		
		if (select == 1) {
			System.out.println("화씨 온도 >> ");
			// 온도를 실수 float 타입으로 입력받음
			float ft = sc.nextFloat();
			// 섭씨 온도(ct)로 변환
			float ct = (ft - 32) * 5 / 9;
			System.out.printf("화씨 %.2f도는 섭씨 %.2f도입니다.", ft, ct);
		} else if (select == 2) {
			System.out.println("섭씨 온도 >> ");
			// 온도를 실수 float 타입으로 입력받음
			float ct = sc.nextFloat();
			// 섭씨 온도(ct)로 변환
			float ft = ct * 9 / 5 + 32;
			System.out.printf("섭씨 %.2f도는 화씨 %.2f도입니다.", ct, ft);
		} else {
			System.out.println("다시 입력");
		}
		sc.close();
	}

}




package dataType;

public class Dt02 {
	// char 타입 변수의 값은 ''로 표시 - 문자열(String)은 ""로 표시
	// char 타입 변수 c1을 선언하고 문자 'A'로 초기화 - 알고 보면 정수
	public static void main(String[] args) {
		char c1 = 'A'; // 문자 A
		char c2 = 65; // 십진법 65가 아스키코드 A에 해당
		char c3 = '\u0041'; // unicode 값

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		int ic = c1; // char 타입의 변수 값 'A' 를 int 타입 변수에 넣음 - 자동 형변환
		System.out.println(ic);
		char c4 = '가';
		System.out.println(c4);
		ic = c4;
		System.out.println(ic);
		char c5 = 44033;
		System.out.println(c5);
		char c6 = '\uac00';
		System.out.println(c6);
		
		
	}

}

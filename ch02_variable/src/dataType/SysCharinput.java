package dataType;

import java.io.IOException;

public class SysCharinput {

	public static void main(String[] args) throws IOException {
		char a = '0'; // 'A' -> 65
		System.out.println(a);
		System.out.println((int) a); // '0'의 아스키 코드값은 48

		System.out.println("2~9 사이의 숫자를 입력");
//		int input = System.in.read() - 48;
		int input = System.in.read() - '0';
//		System.out.println(input);
		System.out.printf("입력하신 값은 %d 입니다.\n",input);
		
		
//		enter 값(lf(10),cr(13)) 입력
//		System.in.read(); // lf 처리
//		System.in.read(); // cr 처리
		
		System.in.skip(2);

		System.out.println("a-z t사이의 문자 하나를 입력해주세요.");
//		int in = System.in.read();
		char in = (char)System.in.read();
//		System.out.printf("입력하신 값은 %d입니다.\n",in);
		System.out.printf("입력하신 값은 %c입니다.\n",in);
	}

}



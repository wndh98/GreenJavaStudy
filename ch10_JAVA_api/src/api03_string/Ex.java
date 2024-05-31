package api03_string;

import java.util.Arrays;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		대소문자 변환
//		문자열 "Hello World"를 모두 대문자로 변환하고, 다시 소문자로 변환하세요.
		String str = "Hello World";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
//		문자 추출
//		문자열 "Hello World"에서 인덱스 6의 문자를 추출하세요.
		System.out.println(str.charAt(6));
//		부분 문자열 추출
//		문자열 "Hello World"에서 "World" 부분을 추출하세요.
		System.out.println(str.substring(6));
//		for(int i=6;i<str.length();i++) {
//			System.out.print(str.charAt(i));
//		}
//		System.out.println("");
//		문자열 길이
//		문자열 "Hello World"의 길이를 구하세요.
		System.out.println(str.length());
//		문자열 비교
//		문자열 "abc"와 "ABC"를 대소문자 구분 없이 비교하세요.
		String abc = "abc";
		String ABC = "ABC";
		System.out.println(abc.equals(ABC.toLowerCase()));
//		문자열 병합
//		문자열 "Hello"와 "World"를 합쳐 "Hello World"를 만드세요.
		String hello = "Hello";
		String world = "World";
		System.out.println(hello.concat(" ").concat(world));
//		문자 포함 여부
//		문자열 "Hello World"에 문자 'W'가 포함되어 있는지 확인하세요.
		System.out.println(str.contains("W"));
//		문자열 시작 여부
//		문자열 "Hello World"가 "Hello"로 시작하는지 확인하세요.

		System.out.println(str.startsWith("Hello"));
//		문자열 끝 여부
//		문자열 "Hello World"가 "World"로 끝나는지 확인하세요.
		System.out.println(str.lastIndexOf("World"));
//		문자열 치환
//		문자열 "Hello World"에서 "World"를 "Java"로 치환하세요.
		System.out.println(str.replace("World", "Java"));
//		문자열 공백 제거
//		문자열 " Hello World "의 앞뒤 공백을 제거하세요.
		str = " Hello World ";
		System.out.println(str.trim());
//		문자열 분리
//		문자열 "apple,banana,cherry"를 콤마(,)를 기준으로 분리하세요.
		str = "apple,banana,cherry";
		System.out.println(Arrays.toString(str.split(",")));
//		문자열 포함 여부
//		문자열 "Hello World"에 문자열 "lo Wo"가 포함되어 있는지 확인하세요.
		str = "Hello World";
		System.out.println(str.contains("lo Wo"));
//		문자열 인덱스 찾기
//		문자열 "Hello World"에서 첫 번째로 'o'가 나타나는 인덱스를 찾으세요.
		System.out.println(str.indexOf("o"));
//		마지막 인덱스 찾기
//		문자열 "Hello World"에서 마지막으로 'o'가 나타나는 인덱스를 찾으세요.
		System.out.println(str.lastIndexOf("o"));
//		빈 문자열 확인
//		문자열 ""이 빈 문자열인지 확인하세요.
		str = "";
		System.out.println(str.isEmpty());
//		부분 문자열 대치
//		문자열 "Hello World"의 인덱스 6부터 11까지를 "Java"로 대치하세요.
		str = "Hello World";
		System.out.println(str.replace(str.substring(6, 11), "Java"));
//		문자열 비교
//		문자열 "abc"와 "abc"를 비교하여 동일한지 확인하세요.
		str = "abc";
		System.out.println(str == "abc");
//		정규 표현식 매칭
//		문자열 "abc123"이 정규 표현식 ^[a-zA-Z]+$와 일치하는지 확인하세요.
		str = "abc123";
		System.out.println(str.matches("^[a-zA-Z]+$"));
//		부분 문자열 찾기
//		문자열 "Hello World"에서 "lo Wo"의 시작 인덱스를 찾으세요.
		str = "Hello World";
		System.out.println(str.indexOf("lo Wo"));
//		문자열 배열로 변환
//		문자열 "Hello World"를 문자 배열로 변환하세요.
		System.out.println(Arrays.toString(str.toCharArray()));
//		문자 배열로부터 문자열 생성
//		문자 배열 {'H', 'e', 'l', 'l', 'o'}로부터 문자열을 생성하세요.
		char[] charArr = { 'H', 'e', 'l', 'l', 'o' };
		System.out.println(new String(charArr));
//		문자열 추가
//		StringBuilder를 사용하여 문자열 "Hello"에 " World"를 추가하세요.
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb);
//		부분 문자열 비교
//		문자열 "Hello World"의 첫 5글자가 "Hello"와 동일한지 확인하세요.
		str = "Hello World";
		System.out.println(str.substring(0, 5).equals("Hello"));
//		문자열 연결
//		문자열 배열 {"Hello", " ", "World"}를 하나의 문자열로 연결하세요.
		String[] strArr = { "Hello", " ", "World" };
		System.out.println(String.join("", strArr));
//		특정 문자 제거
//		문자열 "Hello World"에서 모든 'o'를 제거하세요.
		str = "Hello World";

		System.out.println(str.replaceAll("o", ""));

//		문자열 반전
//		문자열 "Hello"를 반전하여 "olleH"로 만드세요.
		sb = new StringBuilder("Hello");
		System.out.println(sb.reverse());
//		문자열 개수 세기
//		문자열 "Hello World"에서 'l'이 몇 번 나타나는지 세세요.
		str = "Hello World";
		System.out.println(str.chars().filter(c -> c == 'l').count());
//		문자열 변환
//		정수 123을 문자열로 변환하세요.
		int a = 123;
		str = Integer.toString(a);
		System.out.println(str);
//		문자열의 특정 위치의 문자 변경
//		문자열 "Hello"의 인덱스 1의 문자를 'a'로 변경하여 "Hallo"를 만드세요.
		sb = new StringBuilder("Hello");
		sb.setCharAt(1, 'a');
		System.out.println(sb);
	}

}
// 



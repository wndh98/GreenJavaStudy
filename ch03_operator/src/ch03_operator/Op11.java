package ch03_operator;

public class Op11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I ";
		String b = "love ";
		String c = "you.";
		String d = a + b + c;
		System.out.println(d);
		
		String e = "Java";
		System.out.println(e + " " + 1.8);
//		System.out.println(e *3);
		String str1= "today";
		String str2= "today";
		System.out.println(str1==str2?"ok":"no");
		
		String str3 = new String("today");
		System.out.println(str1 + " : " + str3);
		System.out.println(str1 == str3 ? "ok" : "no");
		// == : 객체 주소 비교
		if(str1==str3) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		// 내용비교 - 문자열 메소드 
		if(str1.equals(str3)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		
	}

}

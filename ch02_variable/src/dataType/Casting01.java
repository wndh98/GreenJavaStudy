package dataType;

public class Casting01 {
	//
	public static void main(String[] args) {
		int num1 = 200;
		System.out.println(num1);
		// int type 변수의 값을 double 타입에 넣음 - 자동 형변환
		double num2 = num1;
		// 크기가 작은 타입을 큰 타입에 넣을시 자동 형변환이 이루어 진다.
		System.out.println(num2);
		// Type mismatch: cannot convert from double to int
//		int num3 = num2;
		// 강제 형변환 : double -> int (데이터 손실 감수)
		int num3 = (int)num2;
		System.out.println(num3);
		
		double num4=3456.7879;
		int num5 = (int)num4;
		System.out.println(num4);
		System.out.println(num5);
		
		int intValue = 1231562;
		char charValue = (char)intValue;
		System.out.println(intValue + " : " + charValue);
		
	}

}

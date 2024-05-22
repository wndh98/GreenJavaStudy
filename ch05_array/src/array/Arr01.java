package array;

public class Arr01 {
	// 배열: 같은 타입의 여러 값을 하나의 묶음으로 다루는 효율적인 방법
	// 천 개의 정수 변수: int n1, n2, n3, n4, n5 .... n1000;
	// n1=0, n2=0, ...
	public static void main(String[] args) {
		// 정수 배열 선언
		int[] numArr;
		// 1000칸 짜리 정수 배열 생성 및 초기화
		numArr = new int[1000]; // 0으로 자동 초기화
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		// float 배열 0칸선언 및 생성
		float[] numArr2 = new float[50];
		for (int i = 0; i < numArr2.length; i++) {
			System.out.println(numArr2[i]);
		}

		//boolean 배열 10칸 선언 및 생성
		boolean[] boolArr=new boolean[10];
		System.out.println(boolArr[0]);
		
		//char 배열 10칸 선언 및 생성
		char[] charArr=new char[10];
		System.out.println(charArr[0]);
	
		String[] strArr=new String[10];
		System.out.println(strArr[0]);
	}

}

// 
// 
// 
// 
// 
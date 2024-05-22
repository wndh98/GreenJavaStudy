package array;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];
		// index 이용해서 배열 값 입력 및 출력
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println("----------------------------------------------");
		int[] arr2 = { 10, 20, 30 };
		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("----------------------------------------------");
		int[] arr3 = new int[10];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (i + 1) * 100;
			System.out.println(arr3[i]);
		}

		System.out.println("----------------------------------------------");
		// char 배열 26칸을 만들고 alphabet(A: 65)을 넣으시오.
		// 배열을 출력하시오
		char[] arr4 = new char[26];
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = (char) (65 + i);
			System.out.println(arr4[i]);
		}
		

	}

}

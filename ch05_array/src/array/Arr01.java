package array;

public class Arr01 {
	// �迭: ���� Ÿ���� ���� ���� �ϳ��� �������� �ٷ�� ȿ������ ���
	// õ ���� ���� ����: int n1, n2, n3, n4, n5 .... n1000;
	// n1=0, n2=0, ...
	public static void main(String[] args) {
		// ���� �迭 ����
		int[] numArr;
		// 1000ĭ ¥�� ���� �迭 ���� �� �ʱ�ȭ
		numArr = new int[1000]; // 0���� �ڵ� �ʱ�ȭ
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		// float �迭 0ĭ���� �� ����
		float[] numArr2 = new float[50];
		for (int i = 0; i < numArr2.length; i++) {
			System.out.println(numArr2[i]);
		}

		//boolean �迭 10ĭ ���� �� ����
		boolean[] boolArr=new boolean[10];
		System.out.println(boolArr[0]);
		
		//char �迭 10ĭ ���� �� ����
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
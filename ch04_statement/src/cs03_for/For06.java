package cs03_for;



public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}

}
// ó�� ���۰��� 0�ΰ��� �� �ݺ����� "j�� 5-i���� ����������"(j<5-i) �ݺ��ϴ°���
// ������ĵ�?
// 
/*
*****
****
***
**
*
*/
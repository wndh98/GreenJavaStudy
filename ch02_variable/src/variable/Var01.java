package variable;

//������? ���� ������ �� �ִ� �޸� ������ �̸�
//������ ���� ����: ���� ��Ȱ��, �ϰ� ����...
//���� ������Ģ: ��ҹ��� ����, ���ڷ� ���� ����, 
//������,$,_�� ��� ����, ����� ���Ұ� 
//Ŭ���� ù ���ڴ� �׻� �빮��, ������ �޼ҵ� ù ���ڴ� �ҹ���, ����� ��� �빮��, CamelCase
public class Var01 {

	public static void main(String[] args) {
		// ���� ����� Ÿ�� �ο�
//		let a = 7;a="wow";
		int num1; // ������ ���� num1 ���� - �޸𸮿� 4����Ʈ ���� Ȯ��
//		System.out.println(num1);//not have been initialized
		num1 = 7;
		System.out.println(num1);

//		num1="wow"; // ������ ������ ������ ���� ����

//		num2 ������ ���� ���� �� 10���� �ʱ�ȭ
		int num2 = 10;
//		num1 , num2 ���ؼ� num3 ���� �����
		int num3 = num1 + num2;
		System.out.println(num1 + " : " + num2 + " : " + num3 );
		
		

	}

}
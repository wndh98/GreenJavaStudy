package class04_static;
//�ν��Ͻ� ������ ���� �۾��� ��ü���� ��������� 
//Ŭ���� ������ ���� �۾��� ���������� ����ȴ�
public class AccumulatorEx {
	public static void main(String[] args) {
		Accumulator.grandTotal=30;
		Accumulator a=new Accumulator();
		Accumulator b=new Accumulator();
		System.out.println(a);
		System.out.println(b);
		a.accumulate(5);
		System.out.println(a);
		System.out.println(b);
	}

}
// 
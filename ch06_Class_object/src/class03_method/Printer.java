package class03_method;

public class Printer {
	// �޼ҵ� �����ε�
	 //���� �̸����� �Ű������� �޸��ؼ� �پ��� ���� ó���ϴ� ��
	
	static void println(int i) {
		System.out.println(i);
	}
	void println(String s) {
		System.out.println(s);
	}
	void println(double d) {
		System.out.println(d);
	}
	static void println(boolean b) {
		System.out.println(b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer pt = new Printer();
		Printer pt2 = new Printer();
		pt.println(19);
		pt.println("wow");
		pt.println(3.14);
		pt.println(true);
		Printer.println(33);
		
	}

}
// 





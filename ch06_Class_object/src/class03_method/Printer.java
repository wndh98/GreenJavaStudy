package class03_method;

public class Printer {
	// 메소드 오버로딩
	 //같은 이름으로 매개변수를 달리해서 다양한 일을 처리하는 것
	
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





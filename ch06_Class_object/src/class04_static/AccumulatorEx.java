package class04_static;
//인스턴스 변수에 대한 작업은 객체별로 적용되지만 
//클래스 변수에 대한 작업은 공통적으로 적용된다
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
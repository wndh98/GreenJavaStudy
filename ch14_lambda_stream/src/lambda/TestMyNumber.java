package lambda;

public class TestMyNumber {
	public static void main(String[] args) {
//		MyNumber mn = new MyNumber() {
//			@Override
//			public int getMax(int x, int y) {
//				return (x >= y) ? x : y;
//
//			}
//		};
//		System.out.println(mn.getMax(342, 34));

		MyNumber mn = (x, y) -> (x >= y) ? x : y;
		System.out.println(mn.getMax(342, 34));
	}
}

// 

package ch03_operator;

public class Op08 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;

		int num = 7;
		double result = apple - pieceUnit * num;
		System.out.println(result);

		int total = apple * 10;
		int temp = total - num;
		result = temp/10.0;
		System.out.println(result);
		
	}

}

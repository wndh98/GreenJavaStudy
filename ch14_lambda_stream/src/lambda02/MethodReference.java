package lambda02;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int static_plus(int x, int y) {
		return x + y;
	}

	int instance_plus(int x, int y) {
		return x + y;
	}
}

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.static_plus(7, 9));
		
		Calculator cal = new Calculator();
		System.out.println(cal.instance_plus(5, 9));
		
		
		IntBinaryOperator operator;
		
		operator = Calculator::static_plus;
		
		System.out.println(operator.applyAsInt(7, 9));
		
		operator = cal::instance_plus;
		System.out.println(operator.applyAsInt(7, 9));
		
		

		
	}

}

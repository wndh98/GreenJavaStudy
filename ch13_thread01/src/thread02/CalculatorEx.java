package thread02;

public class CalculatorEx {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		User user=new User();
		User2 user2=new User2();
		user.setCalculator(cal);
		user2.setCalculator(cal);
		user.start();
		user2.start();
	}
}

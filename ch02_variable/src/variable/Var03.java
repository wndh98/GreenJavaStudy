package variable;

public class Var03 {
	// 클래스 변수, 전역변수 - 클래스 전체에서 사용 가능
	static int num=10;
	
	public static void main(String[] args) {
//		변수의 scope
		// 메인에서 선언한 로컬 변수 이므로 메인 메소드 전체에서 사용 가능
		int num1 = 50;
		System.out.println(num);
		System.out.println(num1);
		if(true) {
			// 로컬 변수 - if에서 선언했으므로 if 안에서만 보임
			int num2=10;
			num1=33;
			System.out.println("num1 : " + num1);
			System.out.println("num2 : " + num2);
		}
		System.out.println("num1 : " + num1);
//		System.out.println("num2 : " + num2);
		
		
	}

}

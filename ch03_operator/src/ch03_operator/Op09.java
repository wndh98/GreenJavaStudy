package ch03_operator;

public class Op09 {

	public static void main(String[] args) {
		//Nan : Not a Number
		// infinite : 무한대
		int a = 5;
		int b = 0;
		
		System.out.println(b/a);
		try {
						
			System.out.println(a/b);			
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		
		double c = 0.0;
		System.out.println(a/c);
		System.out.println(a%c);
		
		double d = 5 * (a/c);
		System.out.println(d);
		if(Double.isFinite(d)) {
			System.out.println("무한대아님");
		}else {
			System.out.println("무한대");
		}

	}

}

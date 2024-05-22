package class03_method;

class Greeting{
	//recursion: 재귀함수 - 나 자신을 호출
	void greet(int x) {
		System.out.println("hi " + x);
		if(x<1) {
			return;
		}
		greet(--x);
	}
}


public class Recur01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeting g1=new Greeting();
		
		//g1.greet(10000);
		
		
	}

}

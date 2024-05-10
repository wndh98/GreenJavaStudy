// 한 파일에 여러 클래스를 만들 수 있으나 컴파일(compile)시 각각의 class 파일로 분리된다
// public 클래스는 하나만 있어야 하고 , 그 클래스 이름이 파일이름과 같아야 한다.
class Hi{

	public void hi() {
		System.out.println("hi2!");
	}
}



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi1");
		Hi hi = new Hi();
		hi.hi();
		
	}

}

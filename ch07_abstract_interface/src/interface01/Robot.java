package interface01;

public interface Robot {
	
	void recharge();

}

class DanceRobot implements Robot{
	public void recharge(){
		System.out.println("dance robot recharge");
	}
	
	void dance() {
		System.out.println("dance");
	}
	
}
class SingRobot implements Robot{
	public void recharge(){
		System.out.println("sing robot recharge");
	}
	
	void sing() {
		System.out.println("sing");
	}
	
}


abstract class CodingRobot implements Robot{
	abstract void program();
	// 여기서 Robot의 추상화 메소드 재정의시 밑에서 안해줘도 됨
//	public void recharge(){
//		System.out.println(" robot recharge");
//	}
}

class JavaRobot extends CodingRobot{
	
	public void program() {
		System.out.println("java coding");
	}
	public void recharge(){
		System.out.println(" java  recharge");
	}
}





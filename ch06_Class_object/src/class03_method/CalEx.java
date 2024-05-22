package class03_method;

class Cal {
	String owner; // 계산기 주인
	int memory; // 마지막 계산값 저장 메모리

	public Cal(String owner) {
		this.owner = owner;
	}

	// method : 소속된 클래스 오브젝트의 기능, 행동
	// public : 액세스 가능 범위
	// void : 반환값 없는 메소드
	// add:메소드 이름(소문자,_,$로 시작)
	// ():매개변수(메소드가 받아서 사용하는 값) 받는 자리
	// {}: 메소드가 실행하는 명령
	void add(int x, int y) {
		System.out.println(x + y);
	}

	int minus(int x, int y) {
		int result = x - y;
		this.memory = result;
		return result;
	}

	void multi(int x, int y) {
		int result = x * y;
		this.memory = result;
		System.out.println(x * y);

	}

	double devide(double x, double y) {

		//this.memory = x / y;
		return x / y;
	}

	@Override
	public String toString() {
		return "Cal [owner=" + owner + ", memory=" + memory + "]";
	}

}

public class CalEx {

	public static void main(String[] args) {
		Cal c1 = new Cal("test1");

	}

}

// 


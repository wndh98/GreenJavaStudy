package class10_polymoriphdriver.driver;

public class Vehicle {

	void run() {
		System.out.println("기본 차량 달립니다.");
	}
}

class Bus extends Vehicle{
	void run() {
		System.out.println("버스 ");
	}
}
class Taxi extends Vehicle{
	void run() {
		System.out.println("택시 ");
	}
}

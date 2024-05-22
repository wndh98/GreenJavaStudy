package class04_static;

class Car {
	int speed;
	String driver;
	static int todayMaxSpeed;

	
	public Car(String driver) {
		this.driver = driver;
	}
	void drive(int speed) {
		System.out.println(this.driver +" : "+speed + "로 달리는 중");
		if (todayMaxSpeed < speed) {
			todayMaxSpeed = speed;
		}
	}
	
}

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Car.speed);
		System.out.println(Car.todayMaxSpeed);
		Car c1 = new Car("1");
		Car c2 = new Car("2");
		Car c3 = new Car("3");
		for (int i = 1; i < 3; i++) {
			int speed = (int) (Math.random() * 300) + 1;
			c1.drive(speed);
			speed = (int) (Math.random() * 300) + 1;
			c2.drive(speed);
			speed = (int) (Math.random() * 300) + 1;
			c3.drive(speed);
		}
		System.out.println(Car.todayMaxSpeed);
	}

}

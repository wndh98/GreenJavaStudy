package class01_basic;

public class Car {
	String brand;
	int maxSpeed;
	String color;
	int speed;

	void drive() {
		System.out.println(" 현재 " + brand + " 가 시속" + speed + "의 속도로 달리고 있습니다.");
	}

	void speedUp(int upSpeed) {
		speed += upSpeed;
		if (speed > maxSpeed) {
			speed = maxSpeed;
		}
	}

	void speedDown(int downSpeed) {
		speed -= downSpeed;
		if (speed < 0)
			speed = 0;
	}

	void stop() {
		speed = 0;
	}
}

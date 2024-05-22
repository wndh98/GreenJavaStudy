package class01_basic;

public class Car {
	String brand;
	int maxSpeed;
	String color;
	int speed;

	void drive() {
		System.out.println(" ���� " + brand + " �� �ü�" + speed + "�� �ӵ��� �޸��� �ֽ��ϴ�.");
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

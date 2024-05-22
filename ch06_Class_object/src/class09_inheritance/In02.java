package class09_inheritance;

import java.util.Date;
//관련 있는 클래스와 클래스의 관계 - 2가지
//상속, 포함

class Tire {
	Date produceDate;
	String brand;

}

class Car {
	String color;
	int door;
	Tire[] tires; // 소유관계: 자동차는 타이어를 가지고 있다 - Tire가 Car 클래스의 필드

	void drive() {
		System.out.println("차가 달려간다~~");
	}

	void stop() {
		System.out.println("차가 멈춘다.");
	}

	void display() {
		System.out.println(this.getClass() + ": color=" + color + ",door=" + door);
	}
}

// 상속관계: 앰뷸런스는 자동차야 - 자동차를 앰뷸런스가 상속받는다.
class Amblunace extends Car {
	String cross;

	@Override
	void drive() {
		super.drive();
		System.out.println("삐용삐용");
	}

	void siren() {
		System.out.println("위용");
	}
}

class FireEmgine extends Car {
	// int door = 0;
	@Override
	void drive() {
		System.out.println("활활");
	}

	void extinguich() {
		System.out.println("extinguich");
	}

}

class Taxi extends Car {

}

class Bus extends Car {

}

public class In02 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "black";
		c1.door = 4;
		c1.display();
		System.out.println("------------------------");
		Amblunace am1 = new Amblunace();
		FireEmgine fe1 = new FireEmgine();
		c1.drive();
		am1.drive();
		fe1.drive();
		// Car c2 = am1;
		// Car c3 = fe1;
		// Car[] garage = {c1, c2, c3};
		Car[] garage = { c1, am1, fe1 };
		for (Car c : garage) {
			c.display();
			c.drive();
			// instanceOf: 객체 확인 연산자
			if (c instanceof Amblunace) {
				((Amblunace) c).siren();
			} else if (c instanceof FireEmgine) {
				((FireEmgine) c).extinguich();
			}
			c.stop();
			// c.siren();
			System.out.println("-------------------------------------");
		}
	}
}

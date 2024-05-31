package innerClass;

public class Vehicle {
	int wheel;
	void drive() {
		System.out.println("부웅~~~");
	}
	void transform(String name, int wheel) {
		class RobotCar extends Vehicle{
			public RobotCar() {
				System.out.println(name+ "로변신");
			}
			void drive() {
				System.out.println("바퀴" + wheel + "로 주행");
			}
		}
		RobotCar rb=new RobotCar();
		rb.wheel=wheel;
		rb.drive();
	}
	
}







package class01_basic;

public class CarEx {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.brand="�׽���";
		c1.color="����";
		c1.maxSpeed=100;
		c1.drive();
		c1.speedUp(10);
		c1.drive();
		c1.speedUp(200);
		c1.drive();
		c1.speedDown(5);
		c1.drive();
		c1.speedDown(300);
		c1.drive();
		c1.speedUp(200);
		c1.drive();
		c1.stop();
		c1.drive();

	}

}

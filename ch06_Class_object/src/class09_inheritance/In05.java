package class09_inheritance;

final class Ant{
	
}
// 파이널 클래스 상속 불가능
//class SuperAnt extends Ant{
//	
//}
class Vehicle {
	final int price =5000;
	final void stop() {
		System.out.println("stop");
	}

}
class Bus extends Vehicle{
	//
	int price =10000;
// 오버라이드 불가능(재정의 불가능)
//	void stop(){
//		System.out.println("123");
//	}
}


public class In05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vh = new Vehicle();
//		vh.price = 2000;
		Bus bus = new Bus();
		System.out.println(bus.price);
		bus.price=20000;
		System.out.println(bus.price);
	}

}

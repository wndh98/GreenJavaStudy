package ex;

public class CarTrade {

	public static void main(String[] args) {
		CarSeller cs1 = new CarSeller("tom",30000,5);
		CarSeller cs2 = new CarSeller("jain",00000,8);
		CarSeller cs3 = new CarSeller("smith",70000,2);
		System.out.println("-----------------거래전-------------");
		cs1.print();
		System.out.println("-----------------거래후-------------");
		CarBuyer cb1 = new CarBuyer("aa", 50000);
		CarBuyer cb2 = new CarBuyer("bb", 20000);
		
		cb1.buy(cs1, 30000);
		cs1.print();
		cb1.print();
		System.out.println("---------------------------------------------");
	}

}




package ex;

public class CarSeller {
	String name;
	int wallet;
	int stockOfCar;
	static final int CAR_PRICE = 10000;

	public CarSeller(String name, int wallet, int stockOfCar) {
		this.name = name;
		this.wallet = wallet;
		this.stockOfCar = stockOfCar;
	}

	int sell(int money) {
		int orderNum = money / CAR_PRICE;
		if (orderNum > stockOfCar) {
			System.out.println(name + " : 차가 모자랍니다.");
			orderNum = 0;
		} else {
			stockOfCar -= orderNum;
			wallet += money;
		}
		return orderNum;

	}

	void print() {
		System.out.println("CarSeller [name=" + name + ", wallet=" + wallet + ", stockOfCar=" + stockOfCar + "]");
	}

}

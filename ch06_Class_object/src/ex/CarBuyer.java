package ex;

public class CarBuyer {
	String name;
	int wallet;
	int stockOfCar;

	public CarBuyer(String name, int wallet) {
		this.name = name;
		this.wallet = wallet;
	}

	void buy(CarSeller cs, int money) {
		if (money <= wallet && money > 0) {
			int orderNum = cs.sell(money);
			if (orderNum > 0) {
				stockOfCar += orderNum;
				wallet -= money;
			}else {
				System.out.println(cs.name + "의 차량 재고수가 부족합니다.");
			}
			
		}else {
			System.out.println("돈이 부족합니다. 잔고 : " + wallet);
		}

	}

	void print() {
		System.out.println("CarSeller [name=" + name + ", wallet=" + wallet + ", stockOfCar=" + stockOfCar + "]");
	}

}

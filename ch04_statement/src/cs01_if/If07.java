package cs01_if;

public class If07 {

	public static void main(String[] args) {
		// age 18세 이상, money >=100000 => "you're welcome!"
		// money < 100000 => "you need more money." 용돈 10000원 주기
		// age < 18 => "See you nex~~~t time!!!"
		int age = 17;
		int money = 20000;
		if(age>= 18) {
			if (money >= 100000) {
				System.out.println("you're welcome!");
			}else {
				System.out.println("you need more money.");
				money += 10000;
			}
		}else {
			System.out.println("See you nex~~~t time!!!");
		}

		System.out.printf("제 나이는 %d세이고 현재 가지고 있는 돈은 %d원입니다.\n", age, money);
		System.out.println("--------------------------------------");

	}

}

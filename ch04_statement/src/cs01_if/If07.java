package cs01_if;

public class If07 {

	public static void main(String[] args) {
		// age 18�� �̻�, money >=100000 => "you're welcome!"
		// money < 100000 => "you need more money." �뵷 10000�� �ֱ�
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

		System.out.printf("�� ���̴� %d���̰� ���� ������ �ִ� ���� %d���Դϴ�.\n", age, money);
		System.out.println("--------------------------------------");

	}

}